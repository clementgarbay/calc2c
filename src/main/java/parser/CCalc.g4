grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : INTLIT                     # IntLit
           | BOOLIT                     # BooLit
           | '(' expression ')'         # ParExp
           | expression OP expression   # BinExp
           ;

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;
BOOLIT   : 'true' | 'false'
         ;
OP       : '+' |'-' |'*' |'/' |'<' |'>'
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
