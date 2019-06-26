grammar SLLanguage;

s  : (PROGRAMA ID SMCOLON?)? settings* INICIO body FIN subrutine*;
settings: 'const' assignationConst SMCOLON? | 'tipos' assignationTypes SMCOLON? | 'var' declaration SMCOLON?;
assignationConst: (id (COMA id)* '=' expression)+;
assignationTypes: objeto+;
assignationVar: (id (COMA id)* ':' tipo);
objeto: id ':' tipo;
tipo: VECTOR BIZQ tipoVector BDER tipo | MATRIZ BIZQ tipoVector BDER tipo | REGISTRO LIZQ assignationVar LDER | NUMERICO | CADENATIPO | LOGICO | ID ;
tipoVector: ( OPERADOR | expression ) (COMA tipoVector)*;
body: sentence+;
sentence: ifSentence
          | repeatSentence
          | whileSentence
          | printSentence
          | readSentence
          | switchSentence
          | doWhileSentence
          | assignationSentence
          | callToFunctionSentence
          ;
callToFunctionSentence: id functionParameters;
assignationSentence: id '=' expression SMCOLON?;
bodyIfSentence: body (SINO sinoSentence)* ;
sinoSentence : ifSentence | sentence ;
ifSentence: 'si' PIZQ expressionBoolean PDER (LIZQ bodyIfSentence LDER | sentence);
whileSentence: 'mientras' PIZQ expression PDER LIZQ body LDER;
doWhileSentence: 'repetir' body 'hasta' PIZQ expression PDER ;
repeatSentence: 'desde' id '=' expression 'hasta' expression  (PASO expression)? LIZQ body LDER;
printSentence: 'imprimir' PIZQ expression (COMA expression)* PDER SMCOLON?;
readSentence: 'leer' PIZQ id (COMA id)* PDER SMCOLON?;
switchSentence: 'eval' LIZQ caseSentence+ (defaultSentence)? LDER;
defaultSentence: SINO sentence;
caseSentence: 'caso' PIZQ expressionBoolean PDER sentence*;
expressionBoolean: expression (ROP expressionBoolean)? ;
expression:  e1=expression OPERADOR e2=expression SMCOLON?
            | PIZQ e1=expression? (COMA expression)* PDER
            | OPERADOR expression
            | BIZQ expression? (COMA expression)* BDER
            | LIZQ expression? (COMA expression)* LDER
            | constant
            | callToFunctionSentence;
constant: NUM | CADENA | BOOL | DOUBLE | id;
id: ID (vector | functionParameters | '.' constant)?;
vector: BIZQ expression (COMA expression)* BDER ('.' constant)? ;
functionParameters: PIZQ expression? (COMA expression)* PDER;
subrutine: subrutineStart s;
subrutineStart: 'subrutina' functionDeclartion  optionalReturn?;
optionalReturn: 'retorna' tipo;
functionDeclartion: ID PIZQ functionDeclarationParams PDER;
declaration: assignationVar+;
functionDeclarationParams: 'ref'? declaration (';' 'ref'* declaration)* | ;

ROP		        : 'and' | 'or';
PASO            : 'paso';
SINO            : 'sino';
VECTOR          : 'vector';
MATRIZ          : 'matriz';
REGISTRO        : 'registro';
NUMERICO        : 'numerico';
CADENATIPO      : 'cadena';
LOGICO          : 'logico';
COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
INICIO          : 'inicio';
FIN             : 'fin';
PROGRAMA        : 'programa';
PIZQ	        : '(' ;
PDER	        : ')' ;
BIZQ            : '[';
BDER            : ']';
LIZQ            : '{';
LDER            : '}';
NUM             : '-'?[0-9]+ ;
DOUBLE          : '-'?[0-9]+( | [.][0-9]+) ;
BOOL            : 'TRUE' | 'FALSE' | 'SI' | 'NO';
CADENA          : ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');
ID              : [a-zA-Z][a-zA-Z0-9_]* ;
ESP             : [ \t\r\n]+ -> skip ;
SMCOLON         : ';' ;
COMA            : ',' ;
OPERADOR        : ( '*' | '/' | '+' | '-' | '^' | '%' | '=' | '>' | '<' | '<=' | '>=' | 'and' | 'or' );


