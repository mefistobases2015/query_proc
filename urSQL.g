grammar urSQL;

options { language = Java; }

@lexer::header {
	package query_processor;
	import java.io.*;
}

@header {
	package query_processor;
	import java.io.*;
}

/* Inicio del programa */
programa
	: clp_commands
	;

/* Comandos CLP */ 
clp_commands
	: (create_db
	| drop_db
	| list_db
	| start
	| get_status
	| stop
	| display_db) clp_commands
	| /* ε */
	;

/* Crear un nuevo esquema */	
create_db
	: CREATE DATABASE ID NEWLINE? {System.out.println("Creating database " + $ID.text + "...\n");}
	;

/* Eliminar un esquema */	
drop_db
	: DROP DATABASE ID NEWLINE? {System.out.println("Deleting database " + $ID.text + "...\n");}
	;

/* Muestra los esquemas existentes */	
list_db
	: LIST DATABASES NEWLINE? {System.out.println("Listing databases...\n");}
	;

/* Inicia los procesos */	
start
	: START NEWLINE? {System.out.println("Starting processes...\n");}
	;

/* Obtiene el estado del motor */	
get_status
	: GET STATUS NEWLINE? {System.out.println("Obtaining status...\n");}
	;

/* Detiene los procesos */	
stop
	: STOP NEWLINE? {System.out.println("Stoping processes...\n");}
	;

/* Muestra el esquema seleccionado */	
display_db
	: DISPLAY DATABASE ID NEWLINE? {System.out.println("Displaying database " + $ID.text + "...\n");}
	;

CREATE
	: 'CREATE'
	| 'create'
	;
	
DATABASE
	: 'DATABASE'
	| 'database'
	;
	
DROP
	: 'DROP'
	| 'drop'
	;
	
LIST
	: 'LIST'
	| 'list'
	;
	
DATABASES
	: 'DATABASES'
	| 'databases'
	;
	
START
	: 'START'
	| 'start'
	;
	
GET
	: 'GET'
	| 'get'
	;
	
STATUS
	: 'STATUS'
	| 'status'
	;
	
STOP
	: 'STOP'
	| 'stop'
	;
	
DISPLAY
	: 'DISPLAY'
	| 'display'
	;
	
NEWLINE
	: '\n'
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
