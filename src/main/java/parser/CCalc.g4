grammar CCalc;

// syntactic rules

program     : function* body EOF
            ;
function    : head body
            ;
head        : functionName '(' ((variableName ',')* variableName)? ')'
            ;
body        : definition* expression
            ;
definition  : variableName '=' expression
            ;
expression  : ('-' | '!') expression                                    # UnaryExpression
            | expression ('*' | '/') expression                         # BinaryExpression
            | expression ('+' | '-') expression                         # BinaryExpression
            | expression ('<' | '>' | '<=' | '>=') expression           # BinaryExpression
            | expression ('==' | '!=') expression                       # BinaryExpression
            | expression ('&&') expression                              # BinaryExpression
            | expression ('||') expression                              # BinaryExpression
            | expression '?'<assoc=right> expression ':' expression     # ConditionalExpression
            | '(' expression ')'                                        # ParenthesizedExpression
            | variableName                                              # VariableCall
            | functionName '(' ((expression ',')* expression)? ')'      # FunctionCall
            | ('true' | 'false')                                        # BooleanType
            | INT                                                       # IntegerType
            ;  
variableName: IDENTIFIER
            ;
functionName: IDENTIFIER
            ;

// lexical rules

IDENTIFIER  : ('a'..'z')('a'..'z' | '0'..'9')*
            ;
INT         : '0' | ('1'..'9')('0'..'9')*
            ;
WS          : ('\t' | '\n' | '\r' | ' ') -> skip
            ;
