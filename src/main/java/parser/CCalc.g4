grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : INTLIT     # IntLit
           | BOOLIT     # BooLit
           ;

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;
BOOLIT   : 'true' | 'false'
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
