grammar CCalc;

// syntactic rules

program  : body EOF
         ;
body     : expression
         ;
expression : ('-' | '!') expression                                 # UnaryExpression
           | expression ('*' | '/') expression                      # BinaryExpression
           | expression ('+' | '-') expression                      # BinaryExpression
           | expression ('<' | '>' | '<=' | '>=') expression        # BinaryExpression
           | expression ('==' | '!=') expression                    # BinaryExpression
           | expression ('&&') expression                           # BinaryExpression
           | expression ('||') expression                           # BinaryExpression
           | expression '?'<assoc=right> expression ':' expression  # ConditionalExpression
           | '(' expression ')'                                     # ParenthesizedExpression
           | INTLIT                                                 # IntegerExpression
           | BOOLIT                                                 # BooleanExpression
           ;
           

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*
         ;
BOOLIT   : 'true' | 'false'
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
