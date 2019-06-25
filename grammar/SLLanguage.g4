grammar SLLanguage;

s  : (PROGRAMA ID SMCOLON?)? settings* INICIO body FIN;
settings: 'const' assignationConst SMCOLON? | 'tipos' assignationTypes SMCOLON? | 'var' assignationVar SMCOLON?;
assignationConst: (ID (COMA ID)* '=' expression)+;
assignationTypes: objeto+;
assignationVar: (ID (COMA ID)* ':' tipo)+;
objeto: ID ':' tipo;
tipo: 'numerico' | 'cadena' | 'logico' | ID | 'vector' BIZQ tipoVector BDER tipo | 'matriz' BIZQ tipoVector BDER tipo | 'registro' LIZQ assignationVar LDER;
tipoVector: (expression | MULTOP) (COMA tipoVector)*;
body: sentence+;
sentence: ifSentence
          | repeatSentence
          | whileSentence
          | printSentence
          | readSentence
          | switchSentence
          | doWhileSentence
          | expression;
ifSentence: 'si' PIZQ expressionBoolean PDER (LIZQ bodyIfSentence LDER | sentence);
bodyIfSentence: body (SINO ifSentence | SINO sentence)?;
whileSentence: 'mientras' PIZQ expression PDER LIZQ body LDER;
doWhileSentence: 'repetir' body 'hasta' PIZQ expression PDER ;
repeatSentence: 'desde' expression 'hasta' expression  ('paso' expression)? LIZQ body LDER;
printSentence: 'imprimir' PIZQ expression (COMA expression)* PDER SMCOLON?;
readSentence: 'leer' PIZQ expression (COMA expression)* PDER SMCOLON?;
switchSentence: 'eval' LIZQ caseSentence+ (SINO expression)? LDER;
caseSentence: 'caso' PIZQ expressionBoolean PDER expression*;
expressionBoolean: expression ('and' | 'or' expression)? ;
expression:  expression OPERADOR expression SMCOLON?
            | PIZQ expression+ PDER
            | ID '=' expression SMCOLON?
            | OPERADOR expression
            | BIZQ expression BDER
            | constant
            ;
constant: VECTOR | NUM | CADENA | BOOL | DOUBLE | ID | CALLFUNCTION;

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
CADENA          : ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');
SMCOLON         : ';' ;
COMA            : ',' ;
OPERADOR        : ( '*' | '/' | '+' | '-' | '^' | '%' | '=' | '>' | '<' | '<=' | '>=' | 'and' | 'or' );
ROP		        : 'and' | 'or';
MULTOP          : '*';
VECTOR          : '-'?[a-zA-Z][a-zA-Z0-9_]*' '?'[''-'?[a-zA-Z][a-zA-Z0-9_]*']';
SINO            : 'sino';