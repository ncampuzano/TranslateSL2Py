grammar SLLanguage;

s  : (PROGRAMA ID SMCOLON?)? settings* INICIO body FIN;
settings: 'const' assignationConst SMCOLON? | 'tipos' assignationTypes SMCOLON? | 'var' assignationVar SMCOLON?;
assignationConst: (ID (',' ID)* '=' expression)+;
assignationTypes: objeto+;
assignationVar: (ID (',' ID)* ':' tipo)+;
objeto: ID ':' tipo;
tipo: 'numerico' | 'cadena' | 'logico' | ID | 'vector' BIZQ tipoVector PDER tipo | 'matriz' BIZQ tipoVector BDER tipo | 'registro' LIZQ assignationVar LDER;
tipoVector: expression (',' tipoVector)*;
constant: NUM | CADENA | BOOL | DOUBLE | ID;
body: sentence+;
sentence: ifSentence
          | repeatSentence
          | whileSentence
          | printSentence
          | readSentence
          | switchSentence
          | expression;
ifSentence: 'si';
repeatSentence: 'repetir' ;
whileSentence: 'desde' expression 'hasta' expression  ('paso' expression)? LIZQ body LDER;
printSentence: 'imprimir' PIZQ expression (COMA expression)* PDER SMCOLON?;
readSentence: 'leer' PIZQ ID (',' ID)* PDER SMCOLON?;
switchSentence: 'eval' LIZQ caseSentence+ ('sino' expression)? LDER;
caseSentence: 'caso' PIZQ expressionBoolean PDER expression*;
expressionBoolean: expression ('and' | 'or') expression;
expression:  expression OPERADOR expression SMCOLON?
            | PIZQ expression+ PDER
            | ID '=' expression SMCOLON?
            | OPERADOR expression
            | BIZQ expression BDER
            | constant
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
ID              : '-'?[a-zA-Z][a-zA-Z0-9_]* ;
ESP             : [ \t\r\n]+ -> skip ;
NUM             : '-'?[0-9]+ ;
DOUBLE          : '-'?[0-9]+( | [.][0-9]+) ;
BOOL            : 'TRUE' | 'FALSE' | 'SI' | 'NO';
CADENA          : ('"'[a-zA-Z0-9!"#$%&/()=?-_.\\ ]*'"' | '“'[a-zA-Z0-9!"#$%&/()=?-_.\\ ]*'”');
SMCOLON         : ';' ;
COMA            : ',';
OPERADOR        : ( '*' | '/' | '+' | '-' | '^' | '%' | '=' | '>' | '<' | '<=' | '>=' | 'and' | 'or' );
ROP		        : 'and' | 'or';