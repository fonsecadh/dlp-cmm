grammar Cmm;	

@header {
	import ast.*;
	import ast.definitions.*;
	import ast.expressions.*;
	import ast.expressions.Comparator;
	import ast.statements.*;
	import ast.types.*;
	
	import java.util.*;
}

/* SYNTAX RULES */

program returns [Program ast]:
	   { List<Definition> defs = new ArrayList<Definition>(); }  
	   (definition { defs.addAll($definition.ast); } )+ EOF
	   { $ast = new Program(defs); }
       ;
       
/* DEFINITIONS */

definition returns [List<Definition> ast = new ArrayList<Definition>()]: 
		  { Type theType = null; }
		  ('void'  { theType = VoidType.getInstance(); } 
		  	| type { theType = $type.ast; }) 
		  id=ID { List<VarDefinition> args = new ArrayList<VarDefinition>(); } 
		  	'(' (t1=type i1=ID 
		  		{ args.add(new VarDefinition(
			  			$t1.start.getLine(),
		   				$t1.start.getCharPositionInLine() + 1,
		   				$i1.text, $t1.ast
			  	)); }
		  	(',' t2=type i2=ID
		  		{ args.add(new VarDefinition(
			  			$t2.start.getLine(),
		   				$t2.start.getCharPositionInLine() + 1,
		   				$i2.text, $t2.ast
			  	)); }
		  	)*)? ')'
		  	{ List<Statement> theBody = new ArrayList<Statement>(); }
		  	'{' (var_definition { theBody.addAll($var_definition.ast); })* (statement { theBody.add($statement.ast); })* '}'
		  	{ $ast.add(new FuncDefinition(
		  			$id.getLine(),
		   			$id.getCharPositionInLine() + 1,
		   			$id.text,
		   			new FunctionType(
		   				$id.getLine(),
		   				$id.getCharPositionInLine() + 1,
		   				theType, args),
		   			theBody
		  	)); }
		  | var_definition { $ast.addAll($var_definition.ast);}
		  ;
		  
var_definition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]: 
			  type i1=ID 
			  	{ $ast.add(new VarDefinition(
			  			$type.start.getLine(),
		   				$type.start.getCharPositionInLine() + 1,
		   				$i1.text, $type.ast
			  	)); }
			  	(',' i2=ID
			  		{ $ast.add(new VarDefinition(
			  			$type.start.getLine(),
		   				$type.start.getCharPositionInLine() + 1,
		   				$i2.text, $type.ast
			  		)); }
			  	)* ';'			  	
			  ;
       
/* STATEMENTS */

statement returns [Statement ast]: 
		 e1=expression '=' e2=expression ';'
		 	{ $ast = new Assignment(
				 	$e1.start.getLine(),	
			 		$e1.start.getCharPositionInLine() + 1,
		 			$e1.ast, $e2.ast	 		
	 		); }	
		 | iftkn='if' '(' expression ')' b1=block 
		 	{ $ast = new IfStatement(
		 			$iftkn.getLine(),
		   			$iftkn.getCharPositionInLine() + 1,
		   			$expression.ast, $b1.ast
		 	); }		 
		 	('else' b2=block { ((IfStatement) $ast).setElsePart($b2.ast); } )?
		 | wh='while' '(' expression ')' block
		 	{ $ast = new WhileStatement(
		 			$wh.getLine(),
		   			$wh.getCharPositionInLine() + 1,
		   			$expression.ast, $block.ast
		 	); }
		 | ret='return' expression ';'
		 	{ $ast = new ReturnStatement(
				 	$ret.getLine(),
		   			$ret.getCharPositionInLine() + 1,
				 	$expression.ast 
   			); }	
		 | rd='read' e1=expression 
		 	{ $ast = new ReadStatement(
				 	$rd.getLine(),
		   			$rd.getCharPositionInLine() + 1,
				 	$e1.ast 
   			); }	
   			(',' e2=expression
   				{ $ast = new ReadStatement(
				 	$rd.getLine(),
		   			$rd.getCharPositionInLine() + 1,
				 	$e2.ast 
   				); }	
   			)* ';' 
		 | wrt='write' e1=expression  
		 	{ $ast = new WriteStatement(
				 	$wrt.getLine(),
		   			$wrt.getCharPositionInLine() + 1,
				 	$e1.ast 
   			); }
   			(',' e2=expression
   				{ $ast = new WriteStatement(
				 	$wrt.getLine(),
		   			$wrt.getCharPositionInLine() + 1,
				 	$e2.ast 
   				); }
   			)* ';'
		 | ID '(' arguments ')' ';'
		 	{ $ast = new Invocation(
					$ID.getLine(),
					$ID.getCharPositionInLine() + 1,
					new Variable(
						$ID.getLine(), 
						$ID.getCharPositionInLine() + 1,
						$ID.text), 
					$arguments.ast); 
			}
		 ;
	
/* BLOCK */
	 
block returns [List<Statement> ast = new ArrayList<Statement>()]: 
	 statement { $ast.add($statement.ast); }
	 | '{' (statement { $ast.add($statement.ast); } )* '}'
	 ;       
       
/* EXPRESSIONS */

expression returns [Expression ast]: 
		  '(' expression ')' { $ast = $expression.ast; } 			
		  | { Type type; } 
		  	'(' (
		  		'int' { type = IntType.getInstance(); } 
		  		| 'double' { type = RealType.getInstance(); } 
		  		| 'char' { type = CharType.getInstance(); } ) 
		  	')' expression 
		  	{ $ast = new Cast(
	  				$expression.start.getLine(),
					$expression.start.getCharPositionInLine() + 1, 
	  				type, $expression.ast
   			); }
		  | e1=expression '[' e2=expression ']'
		  	{ $ast = new ArrayAccess(
		  			$e1.start.getLine(),
   					$e1.start.getCharPositionInLine() + 1, 
   					$e1.ast, $e2.ast 
   			); }
		  | op='-' expression
		  	{ $ast = new UnaryMinus(
			 		$op.getLine(), 
	  				$op.getCharPositionInLine() + 1, 
			  		$expression.ast
	  	  	); }
		  | e=expression '.' ID
		  	{ $ast = new FieldAccess(
		  			$e.start.getLine(), 
   					$e.start.getCharPositionInLine() + 1, 
   					$e.ast, $ID.text  
   			); }
		  | ID '(' arguments ')'
		  	{ $ast = new Invocation(
					$ID.getLine(),
					$ID.getCharPositionInLine() + 1,
					new Variable(
						$ID.getLine(), 
						$ID.getCharPositionInLine() + 1,
						$ID.text), 
					$arguments.ast); 
			}	
		  | e1=expression op=('*'|'/'|'%') e2=expression
		  	{ $ast = new Arithmetic(
					$e1.start.getLine(),
					$e1.start.getCharPositionInLine() + 1,
					$op.text, 
					$e1.ast, $e2.ast);
			}
		  | e1=expression op=('+'|'-') e2=expression
		  	{ $ast = new Arithmetic(
					$e1.start.getLine(),
					$e1.start.getCharPositionInLine() + 1,
					$op.text, 
					$e1.ast, $e2.ast);
			}
		  | e1=expression op=('>'|'<'|'>='|'<='|'=='|'!=') e2=expression
		  	{ $ast = new Comparator(
					$e1.start.getLine(),
					$e1.start.getCharPositionInLine() + 1,
					$op.text, 
					$e1.ast, $e2.ast);
			}
		  | e1=expression op=('&&'|'||') e2=expression
		  	{ $ast = new Conditional(
					$e1.start.getLine(),
					$e1.start.getCharPositionInLine() + 1,
					$op.text, 
					$e1.ast, $e2.ast); 
			}
		  | op='!' expression
		  	{ $ast = new UnaryNot(
			 		$op.getLine(), 
	  				$op.getCharPositionInLine() + 1, 
			  		$expression.ast
	  	  	); }
		  | ID
		  	{ $ast = new Variable(
   					$ID.getLine(),
   					$ID.getCharPositionInLine() + 1,
		  			$ID.text
		  	); }
		  | INT_CONSTANT
		  	{ $ast = new IntLiteral(		  			
   					$INT_CONSTANT.getLine(), 
   					$INT_CONSTANT.getCharPositionInLine() + 1, 
   					Integer.valueOf($INT_CONSTANT.text)
   			); }
		  | REAL_CONSTANT
		  	{ $ast = new RealLiteral(
		  			$REAL_CONSTANT.getLine(),
		   			$REAL_CONSTANT.getCharPositionInLine() + 1,
		  			Double.parseDouble($REAL_CONSTANT.text)
		   	); }
		  | CHAR_CONSTANT 		  	
		  	{ $ast = new CharLiteral(
		  			$CHAR_CONSTANT.getLine(),
   					$CHAR_CONSTANT.getCharPositionInLine() + 1, 
   					($CHAR_CONSTANT.text).charAt(0)
   			); }
		  ;
		  
/* ARGUMENTS */
		  
arguments returns [List<Expression> ast = new ArrayList<Expression>()]: 
		 (e1=expression { $ast.add($e1.ast); } (',' e2=expression { $ast.add($e2.ast); })?)*
		 ;
		 
/* TYPES */

type returns [Type ast]: 
	strct='struct' { List<RecordField> fields = new ArrayList<RecordField>(); } 
		'{' (type id1=ID { fields.add(new RecordField($id1.text, $type.ast)); }
			 (',' id2=ID
			 	{ fields.add(new RecordField($id2.text, $type.ast)); }
			 )* ';')+ 
		'}'  { $ast = new RecordType($strct.getLine(), $strct.getCharPositionInLine() + 1, fields); }
	| ty=type 
		'[' i1=INT_CONSTANT
			{ ArrayType arrayType = new ArrayType(
					$ty.start.getLine(), 
	 				$ty.start.getCharPositionInLine() + 1,
	 				$ty.ast, Integer.valueOf($i1.text)
	 		); }
		']' ('[' i2=INT_CONSTANT 
			{ arrayType.setTypeOfElements(new ArrayType(
						$ty.start.getLine(), 
	 					$ty.start.getCharPositionInLine() + 1,
	 					$ty.ast, Integer.valueOf($i2.text)
	 		)); }
			']')* { $ast = arrayType; }
	| 'char' { $ast = CharType.getInstance(); }
	| 'int' { $ast = IntType.getInstance(); }
	| 'double' { $ast = RealType.getInstance(); }
	;
      
       
       
/* LEX RULES */
       
fragment
DIGIT: [0-9]
	 ;
	 
fragment
LETTER: [a-zA-Z]
	  ;
	  
fragment
FLOATING_POINT_NUMBER: INT_CONSTANT? '.' DIGIT+
			 		 | INT_CONSTANT '.' DIGIT*
					 ;
fragment
ASCII: '\\' INT_CONSTANT
     ;
	  
ID: (LETTER|'_') (LETTER|'_'|DIGIT)*
  ;	 
  		 
INT_CONSTANT: [1-9] DIGIT*
			| '0' 
            ;
            
REAL_CONSTANT: FLOATING_POINT_NUMBER
			 | FLOATING_POINT_NUMBER ('e' | 'E-') DIGIT+
			 | INT_CONSTANT ('e' | 'E-')  DIGIT+
			 ;
			 
CHAR_CONSTANT: ('\'' '\\' 'n' '\'' | '\'' '\\' 't' '\'')+
			 | '\'' ASCII '\''
			 | '\'' . '\''									// Any character between apostrophes		 
			 ;
            
COMMENT: '//' .*? '\r'? ('\n' | EOF) -> skip
	   ;
	   
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip
				  ;
				  
WHITE_SPACES: (' ' | '\n' | '\t' | '\r')+ -> skip
			;
