grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : INTLIT     # IntLit
           | BOOLEAN    # Boolean
           ;

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;
BOOLEAN  : 'true' | 'false'
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
