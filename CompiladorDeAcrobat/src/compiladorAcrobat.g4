grammar compiladorAcrobat;

//DECLARACOES
inicio: declaracoes algoritmo EOF;
declaracoes: DEC (TYPE VAR ';')*;

//FUNCOES (DECLARACAO E PARAMETROS)
algoritmo: ALG (funcao)* principal;
funcao: FUNC TYPE NFUNC '(' parametros ')' '{' corpoFunc '}';
funcaoChamada: NFUNC '(' parametrosChamada ')';
parametros: (TYPE VAR','parametros | TYPE VAR?)? ;
parametrosChamada: ((valor)','parametrosChamada | (valor))?;

valorRestrito: (VAR | NUM | STR | TRUE | FALSE);
valor: (valorRestrito | operacao | funcaoChamada);

//CORPO DA FUNCAO
corpoFunc: (instrucao)* retorno;
instrucao: (atribuicao|leitura|escrita|compIF|repeticao);
escrita: 'JACKOUT' '('(valor)')'';';
leitura: 'JACKIN' '('valor')'';';
atribuicao: ASGN VAR ARROW ('(')?(valor)(')')?';';
compIF: 'IF' '(' condicao ')' '{' (instrucao)* (retorno)?'}'  compELIF;
compELIF: 'ELSE IF' '(' condicao ')' '{' (instrucao)* (retorno)?'}' compELIF | compELSE;
compELSE: ('ELSE' '{' (instrucao)* (retorno)?'}')?;
repeticao: LOOP '(' condicao ')' '{' (instrucao)+ (retorno)?'}';
retorno: RTN ('(')?(valor)(')')?';';

//CONDICAO
condicao: ('(')? (valor OP_COMP valor (')')? (OP_LOGI condicao )?);

//OPERACAO
operacao: operando operacao_cauda;
operando: ('(')?(NUM|VAR|funcaoChamada|TRUE|FALSE)(')')?;
operacao_cauda: (OP_ARIT|OP_LOGI) operando (operacao_cauda)*;

//MAIN
principal: MAIN '('  ')'  '{' corpoFunc '}';



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
OB: '{'; // Abre chaves
CB: '}'; // Fecha chaves
ASGN: 'ASSIGN'; // Indica ter uma atribuição de valor a uma variável
VAR: [a-z](DIGIT|LETTER)*; // Variáveis devem começar com letra minúscula e seguidos de letras ou dígitos
NUM: DIGIT+('.'DIGIT+)?; // Números são formados por dígitos e pode possuir um ponto no meio
STR : '"' (~["\r\n] | '\\' .)* '"'; // Sequência de caracteres entre aspas
DELIM: ';'; // Delimitador de instruções
COMMA: ','; // Separador de parâmetros
COMMENT: '//' ~[\r\n]* -> skip ; // Indica que o resto linha é um comentário, então será ignorada.
OP_ARIT: '+' | '-' | '*' | '/'; // Operadores aritméticos
OP_COMP: '=' | '<' | '<=' | '>' | '>=' | '!='; // Operadores comparadores
OP_LOGI: '&&' | '||'; // Operadores lógicos
COND: 'IF' | 'ELSE' | 'ELSE IF'; // Comandos condicionais
LOOP: 'WHILE'; // Comando de iteração
RTN: 'RETURN'; // Indica o que será retornado pela função
FUNC: 'FUNCTION'; // Indica a declaração de uma função
NFUNC: '_'(DIGIT|LETTER)+; // Nomes de funções devem começar com underscore
fragment LETTER: [a-zA-Z]; // É tipo um #define do c++
fragment DIGIT: [0-9];
WS: [ \r\t\n]* ->skip; // Ignora espaços, tabulações, quebra de linha
ErrorChar: . ;