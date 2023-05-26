grammar compiladorAcrobat;


DEC: 'DECLARATIONS';
ALG: 'ALGORITHM';
MAIN: 'MAIN';
TYPE: 'INT' | 'FLOAT' | 'STRING' | 'BOOL';
IN: 'JACKIN';
OUT: 'JACKOUT';
TRUE: 'TRUE';
FALSE: 'FALSE';
ARROW: '<-';
OP: '(';
CP: ')';
OB: '{';
CB: '}';
ASGN: 'ASSIGN';


VAR: [a-z](DIGIT|LETTER)*;
NUM: DIGIT+('.'DIGIT+)?;
STR: '"'~[/0]*'"';
DELIM: ';';
COMMA: ',';


COMMENT: '//' ~[\r\n]* -> skip ;
OP_ARIT: '+' | '-' | '*' | '/';
OP_COMP: '=' | '<' | '<=' | '>' | '>=' | '!=';
OP_LOGI: '&&' | '||' | '!';
COND: 'IF' | 'ELSE' | 'ELSE IF';
LOOP: 'WHILE';

RTN: 'RETURN';
FUNC: 'FUNCTION';
NFUNC: '_'(DIGIT|LETTER)+; // Nome da Função
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;
