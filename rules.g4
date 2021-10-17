grammar rules;

root: head main;
head: headerFile+ macros*;
main: function* mainFunction;

//head
headerFile: 'include' fileName;
macros: variableName 'define' expression;

//main
function:'def' functionName '('(dataType variableName (',' dataType variableName)*)? ')' block;
mainFunction: 'main' 'function' '(' ')' block;

//block
block: '{' statement* '}';

//statement
statement: ( printStatement|loopStatement|conditionalStatement|returnStatement|expression';'|
             constantStatement|continueBreakStatement|functionCallStatement';' );

printStatement: 'print' '(' (('"' sentence '"')| expression) ')' ';';
loopStatement: whileLoop | forLoop;
continueBreakStatement: ('continue'| 'break')';';
constantStatement: 'constant' dataType? variableName '=' expression ';';
returnStatement: 'return' expression? ';';
functionCallStatement: functionName '(' (expression ( ',' expression )*)? ')';
conditionalStatement:(
    'if' '(' expression ')' block
    ('else' 'if' '(' expression ')' block)*
    ('else' block)?
);

//Expression
expression:
number | string | dataType? variableName | 'input''('('"' sentence '"')?')'
| functionCallStatement | expression binaryOperator expression
| expression logicalOperator expression | expression relationalOperator expression
| (incrementOperator | decrementOperator) expression | expression (incrementOperator | decrementOperator);

//loop
whileLoop: 'while' '(' expression? ')' block;
forLoop: ('for' '(' dataType? variableName '=' number ';' expression? ';' expression? ')' block);

fileName: word;
sentence: (word | ' ')+;
string: '"' (word | ' ')+ '"' ;
number: DIGIT+(.(DIGIT)+)?;
word: (LETTER | DIGIT | SIGN)+;
variableName: LETTER (LETTER | DIGIT)*;
functionName: LETTER (LETTER | DIGIT)*;

//operator & data_type
incrementOperator: '++';
decrementOperator: '--';
logicalOperator: '&&' | '||' | '!' | 'AND' | 'OR' | 'NOT';
relationalOperator: '==' | '!=' | '<' | '>' | '<=' |'>=';
binaryOperator: '=' | '+' | '-' | '*' | '/' | '%' | '+=' | '-=' | '*=' | '/=' | '%=';
dataType: 'int' | 'float' | 'double' | 'bool' | 'string';

//terminal
DIGIT: [0-9_];
LETTER: [a-zA-Z_];
CAPITAL_LETTER: [A-Z];
SIGN: [.\-?,:!@$%];

//skip
WHITE_SPACE:[\n\t] -> skip;
SPACE: ' ' -> skip;
