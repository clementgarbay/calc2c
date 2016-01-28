grammar CCalc;

// syntactic rules

program  : body EOF
         ;
body     : expression
         ;
expression : (MINUS | NOT) expression                               # UnaExp
           | expression (MINUS | OP) expression                     # BinExp
           | expression '?'<assoc=right> expression ':' expression  # CondExp
           | '(' expression ')'                                     # ParExp
           | BOOLIT                                                 # BooLit
           | INTLIT                                                 # IntLit
           ;

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*
         ;
BOOLIT   : 'true' | 'false'
         ;
MINUS    : '-'
         ;
NOT      : '!'
         ;
OP       : '+' | '*' | '/' | '<' | '>' | '=='
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
