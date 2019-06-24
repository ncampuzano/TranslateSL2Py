grammar SLLanguage;

s  : (PROGRAMA ID)? settings INICIO body FIN;
settings: 'const' assignation;
assignation: ;
body: sentence+;
sentence: ifSentence
          | repeatSentence
          | whileSentence
          | printSentence
          | ;
ifSentence: 'si' ;
repeatSentence: ;
whileSentence: ;
printSentence: ;

COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
INICIO: 'inicio';
FIN: 'fin';
PROGRAMA: 'programa';
ID : [a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;