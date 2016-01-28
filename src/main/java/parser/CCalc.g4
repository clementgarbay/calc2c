grammar CCalc;

// syntactic rules

program  : body EOF
         ;
body     : expression
         ;
expression : ('-' | '!') expression                                 # UnaExp
           | expression ('*' | '/') expression                      # BinExp
           | expression ('+' | '-') expression                      # BinExp
           | expression ('<' | '>' | '<=' | '>=') expression        # BinExp
           | expression ('==' | '!=') expression                    # BinExp
           | expression ('&&') expression                           # BinExp
           | expression ('||') expression                           # BinExp
           | expression '?'<assoc=right> expression ':' expression  # CondExp
           | '(' expression ')'                                     # ParExp
           | INTLIT                                                 # IntLit
           | BOOLIT                                                 # BooLit
           ;
           

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*
         ;
BOOLIT   : 'true' | 'false'
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
