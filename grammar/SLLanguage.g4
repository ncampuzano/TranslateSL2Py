grammar SLLanguage;

s  : (PROGRAMA ID SMCOLON?)? settings* INICIO body FIN subrutine*;
settings: 'const' assignationConst SMCOLON? | 'tipos' assignationTypes SMCOLON? | 'var' assignationVar SMCOLON?;
assignationConst: (id (COMA id)* '=' expression)+;
assignationTypes: objeto+;
assignationVar: (id (COMA id)* ':' tipo)+;
objeto: id ':' tipo;
tipo: 'vector' BIZQ tipoVector BDER tipo | 'matriz' BIZQ tipoVector BDER tipo | 'registro' LIZQ assignationVar LDER | 'numerico' | 'cadena' | 'logico' | ID ;
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
repeatSentence: 'desde' assignationSentence 'hasta' expression  ('paso' expression)? LIZQ body LDER;
printSentence: 'imprimir' PIZQ expression (COMA expression)* PDER SMCOLON?;
readSentence: 'leer' PIZQ id (COMA id)* PDER SMCOLON?;
switchSentence: 'eval' LIZQ caseSentence+ (SINO sentence)? LDER;
caseSentence: 'caso' PIZQ expressionBoolean PDER sentence*;
expressionBoolean: expression (('and' | 'or' )expression)? ;
expression:  expression OPERADOR expression SMCOLON?
            | PIZQ expression? (COMA expression)* PDER
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

SINO            : 'sino';
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
ROP		        : 'and' | 'or';


