grammar Cmm;	

/* SYNTAX RULES */

program: definition+
       ;
       
/* DEFINITIONS */

definition: ('void' | type) ID '(' (type ID (',' type ID)*)? ')' '{' var_definition* statement* '}'
		  | var_definition
		  ;
		  
var_definition: type ID (',' ID)* ';'
			  ;
       
/* STATEMENTS */

statement: expression '=' expression ';'
		 | 'if' '(' expression ')' block ('else' block)?
		 | 'while' '(' expression ')' block
		 | 'return' expression ';'
		 | 'read' expression (',' expression)* ';'		 
		 | 'write' expression (',' expression)* ';'		 
		 | ID '(' arguments ')' ';'
		 ;
	
/* BLOCK */
	 
block: statement
	 | '{' statement* '}'
	 ;       
       
/* EXPRESSIONS */

expression: '(' expression ')'
		  | '(' ('int'|'double'|'char') ')' expression 
		  | expression '[' expression ']'
		  | '-' expression
		  | expression '.' ID
		  | ID '(' arguments ')'
		  | expression ('*'|'/'|'%') expression
		  | expression ('+'|'-') expression
		  | expression ('>'|'<'|'>='|'<='|'=='|'!=') expression
		  | expression ('&&'|'||') expression
		  | '!' expression
		  | ID
		  | INT_CONSTANT
		  | REAL_CONSTANT
		  | CHAR_CONSTANT
		  ;
		  
/* ARGUMENTS */
		  
arguments: (expression (',' expression)?)*
		 ;
		 
/* TYPES */

type: 'struct' '{' (type ID (',' ID)* ';')+ '}'
	| type '[' expression ']' ('[' expression ']')*
	| 'char'
	| 'int'
	| 'double'
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
