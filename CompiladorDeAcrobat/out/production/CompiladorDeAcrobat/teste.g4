grammar teste;

DEC: 'DECLARATIONS';
ALG: 'ALGORITHM';
TYPE: 'INT' | 'FLOAT' | 'STRING' | 'BOOL';
IN: 'JACKIN';
OUT: 'JACKOUT';
ATR: '<-';
OP: '(';
CP: ')';
OB: '{';
CB: '}';

VAR: [a-z](DIGIT|LETTER)*;
NUM: DIGIT+('.'DIGIT+)?;
STR: '"'LETTER+'"';
DELIM: ';';
COMMA: ',';

OP_ARIT: '+' | '-' | '*' | '/';
OP_COMP: '=' | '<' | '<=' | '>' | '>=' | '!=';
OP_LOGI: '&&' | '||' | '!';
COND: 'IF' | 'ELSE' | 'ELSE IF';

RTN: 'RETURN';
FUNC: 'FUNCAO';
NFUNC: '_'(DIGIT|LETTER)+; // Nome da Função
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;

/*
grammar teste;

DEC: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'int'|'real'|'char';

ATR: 'atribuir';
A: 'a';
AP: '(';
FP: ')';
ESC: 'ESCREVA';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;
*/