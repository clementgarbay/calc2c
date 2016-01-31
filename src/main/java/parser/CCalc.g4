grammar CCalc;

// syntactic rules

program     : body EOF
            ;
body        : definition* expression
            ;
definition  : variable '=' expression
            ;
expression  : ('-' | '!') expression                                 # UnaryExpression
            | expression ('*' | '/') expression                      # BinaryExpression
            | expression ('+' | '-') expression                      # BinaryExpression
            | expression ('<' | '>' | '<=' | '>=') expression        # BinaryExpression
            | expression ('==' | '!=') expression                    # BinaryExpression
            | expression ('&&') expression                           # BinaryExpression
            | expression ('||') expression                           # BinaryExpression
            | expression '?'<assoc=right> expression ':' expression  # ConditionalExpression
            | '(' expression ')'                                     # ParenthesizedExpression
            | variable                                               # VariableCall
            | ('true' | 'false')                                     # BooleanType
            | INT                                                    # IntegerType
            ;  
variable    : IDENTIFIER
            ;

// lexical rules

IDENTIFIER  : ('a'..'z')('a'..'z' | '0'..'9')*
            ;
INT         : '0' | ('1'..'9')('0'..'9')*
            ;
WS          : ('\t' | '\n' | '\r' | ' ') -> skip
            ;
