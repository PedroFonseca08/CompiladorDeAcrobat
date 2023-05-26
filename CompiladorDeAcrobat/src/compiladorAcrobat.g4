grammar compiladorAcrobat;


DEC: 'DECLARATIONS';  // Indica a declaração de variáveis
ALG: 'ALGORITHM';   // Indica a parte de algoritmos
MAIN: 'MAIN'; // Indica a função principal do algoritmo
TYPE: 'INT' | 'FLOAT' | 'STRING' | 'BOOL'; // Indica o tipo de variável ou função em sequência
IN: 'JACKIN'; // Comando para receber um input do usuário
OUT: 'JACKOUT'; // Comando para imprimir valores no terminal
TRUE: 'TRUE'; // Valor booleano para true
FALSE: 'FALSE'; // Valor booleano para false
ARROW: '<-'; // Símbolo de atribuição de valores a uma variável
OP: '('; // Abre parêntese
CP: ')'; // Fecha parêntese
OB: '{'; // Abre aspas
CB: '}'; // Fecha aspas
ASGN: 'ASSIGN'; // Indica que haverá a atribuição de valor a uma variável
VAR: [a-z](DIGIT|LETTER)*; // Variáveis devem começar com letra minúscula e seguidos de letras ou dígitos
NUM: DIGIT+('.'DIGIT+)?; // Números são formados por dígitos e pode possuir um ponto no meio
STR : '"' (~["\r\n] | '\\' .)* '"'; // Sequência de caracteres entre aspas
DELIM: ';'; // Delimitador de instruções
COMMA: ','; // Separador de parâmetros
COMMENT: '//' ~[\r\n]* -> skip ; // Indica que o resto linha é um comentário, então será ignorada.
OP_ARIT: '+' | '-' | '*' | '/'; // Operadores aritméticos
OP_COMP: '=' | '<' | '<=' | '>' | '>=' | '!='; // Operadores comparadores
OP_LOGI: '&&' | '||' | '!'; // Operadores lógicos
COND: 'IF' | 'ELSE' | 'ELSE IF'; // Comandos condicionais
LOOP: 'WHILE'; // Comando de iteração


RTN: 'RETURN'; // Indica o que será retornado pela função
FUNC: 'FUNCTION'; // Indica a declaração de uma função
NFUNC: '_'(DIGIT|LETTER)+; // Nomes de funções devem começar com underscore
fragment LETTER: [a-zA-Z]; // É tipo um #define do c++
fragment DIGIT: [0-9];
WS: [ \r\t\n]* ->skip; // Ignora espaços, tabulações, quebra de linha e
ErrorChar: . ;
