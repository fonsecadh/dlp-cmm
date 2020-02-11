grammar Cmm;	

program: 
       ;
       
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
