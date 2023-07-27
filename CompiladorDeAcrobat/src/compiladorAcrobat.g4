grammar compiladorAcrobat;

//DECLARACOES
inicio: declaracoes algoritmo EOF #NInicio;
declaracoes: DEC (TYPE VAR ';')* #BlocoDeclaracao;

//FUNCOES (DECLARACAO E PARAMETROS)
algoritmo: ALG (funcao)* principal #BlocoAlgoritmo;
funcao: FUNC TYPE NFUNC '(' parametros ')' '{' corpoFunc '}' #BlocoFuncao;
funcaoChamada: NFUNC '(' parametrosChamada ')' #NFuncaoChamada;
parametros: (TYPE VAR','parametros | TYPE VAR?)?  #NParametros;
parametrosChamada: ((valor)','parametrosChamada | (valor))? #NParametrosChamada;

valorRestrito: (VAR | NUM | STR | TRUE | FALSE) #NValorRestrito;
valor: (valorRestrito | operacao | funcaoChamada) #NValor;

//CORPO DA FUNCAO
corpoFunc: (instrucao)* retorno #NCorpoFuncao;
instrucao: (atribuicao|leitura|escrita|compIF|repeticao) #NInstrucao;
escrita: 'JACKOUT' '('(valor)')'';' #NEscrita;
leitura: 'JACKIN' '('VAR')'';' #NLeitura;
atribuicao: ASGN VAR ARROW ('(')?(valor)(')')?';' #NAtribuicao;
compIF: 'IF' '(' condicao ')' '{' (instrucao)* (retorno)?'}'  compELIF #NCompIF;
compELIF: 'ELSE IF' '(' condicao ')' '{' (instrucao)* (retorno)?'}' compELIF #NCompELIF| compELSE #NCompELIF;
compELSE: ('ELSE' '{' (instrucao)* (retorno)?'}')? #NCompELSE;
repeticao: LOOP '(' condicao ')' '{' (instrucao)+ (retorno)?'}' #NRepeticao;
retorno: RTN ('(')?(valor)(')')?';' #NRetorno;

//CONDICAO
condicao: ('(')? (valor OP_COMP valor (')')? (OP_LOGI condicao )?) #NCondicao;

//OPERACAO
operacao: operando operacao_cauda #NOperacao;
operando: ('(')?(NUM|VAR|funcaoChamada|TRUE|FALSE)(')')? #NOperando;
operacao_cauda: (OP_ARIT|OP_LOGI) operando (operacao_cauda)* #NOperacao_cauda;

//MAIN
principal: MAIN '('  ')'  '{' corpoFunc '}' #BlocoPrincipal;



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