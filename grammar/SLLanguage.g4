grammar SLLanguage;

s  : (PROGRAMA ID SMCOLON?)? settings* INICIO body FIN;
settings: 'const' assignationConst SMCOLON? | 'tipos' assignationTypes SMCOLON? | 'var' assignationVar SMCOLON?;
assignationConst: (ID (',' ID)* '=' expr)+;
assignationTypes: objeto+;
assignationVar: (ID (',' ID)* ':' tipo)+;
objeto: ID ':' tipo;
tipo: 'numerico' | 'cadena' | 'logico' | ID | 'vector' BIZQ PDER tipo | 'matriz' BIZQ BDER tipo | 'registro' LIZQ LDER;
expr: NUM | CADENA | BOOL | DOUBLE | ID;
body: sentence+;
sentence: ifSentence
          | repeatSentence
          | whileSentence
          | printSentence
          | readSentence
          | expression;
ifSentence: 'si';
repeatSentence: 'repetir' ;
whileSentence: 'desde' expression 'hasta' expr  ('paso' expr)? LIZQ body LDER;
printSentence: 'imprimir' PIZQ expression (COMA expression)* PDER SMCOLON?;
readSentence: 'leer' PIZQ ID PDER SMCOLON?;
expression: expr
            | expression OPERADOR expression
            | PIZQ expression PDER
            | ID '=' expression
            ;

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
ID              : [a-zA-Z][a-zA-Z0-9_]* ;
ESP             : [ \t\r\n]+ -> skip ;
NUM             : [0-9]+ ;
DOUBLE          : [0-9]+( | [.][0-9]+) ;
BOOL            : 'TRUE' | 'FALSE' | 'SI' | 'NO';
CADENA          : '"'[a-zA-Z0-9!"#$%&/()=?-_.\\ \n]* '"';
SMCOLON         : ';' ;
COMA            : ',';
OPERADOR        : ( '*' | '/' | '+' | '-' );