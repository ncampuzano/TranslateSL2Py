grammar SLLanguage;

s  : (PROGRAMA ID SMCOLON?)? settings* INICIO body FIN;
settings: 'const' assignationConst SMCOLON? | 'tipos' assignationTypes SMCOLON? | 'var' assignationVar SMCOLON?;
assignationConst: (ID (',' ID)* '=' expr)+;
assignationTypes: objeto+;
assignationVar: (ID (',' ID)* ':' tipo)+;
objeto: ID ':' tipo;
tipo: 'numerico' | 'cadena' | 'logico' | ID | 'vector' BIZQ PDER tipo | 'matriz' BIZQ BDER tipo | 'registro' LIZQ LDER;
expr: NUM | CADENA | BOOL | DOUBLE ;
body: sentence+;
sentence: ifSentence
          | repeatSentence
          | whileSentence
          | printSentence;
ifSentence: 'si';
repeatSentence: 'repetir' ;
whileSentence: 'mientras';
printSentence: 'imprimir';

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
CADENA          : ('\'' [a-zA-Z][a-zA-Z0-9!"#$%&/()=?¿\\]* '\'' | '"' [a-zA-Z][a-zA-Z0-9!"#$%&/()=?¿\\]* '"');
SMCOLON : ';' ;