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
	| ddl_commands
	| dml_commands
	;
	
/* Comandos DML */ 
dml_commands
	: ( select
	| update
	| delete
	| insert ) ( clp_commands
	| ddl_commands
	| dml_commands )
	|
	;
	
select
	: SELECT ( ALL | col_list ) NEWLINE? from NEWLINE*
	;
	
col_list
	: ( ID | agg_funct ) col_list
	| /* ε */
	;
	
from
	: FROM ( ID | join_st ) NEWLINE? where? NEWLINE? group? NEWLINE? for?
	;
	
join_st
	: ID JOIN ID join_st_aux
	;
	
join_st_aux
	: JOIN ID join_st_aux
	| /* ε */
	;
	
where
	: WHERE where_st
	;
	
where_st
	: ID comp_op value
	| ID null_op
	;
	
comp_op
	: GREATER_THAN
	| GREATER_EQUALS
	| LESS_THAN
	| LESS_EQUALS
	| EQUALS
	| LIKE
	| NOT
	;
	
null_op
	: IS ( NULL | NOT NULL )
	;
	
group
	: GROUP BY cols
	;
	
cols
	: ID cols
	|
	;
	
for
	: FOR ( JSON | XML )
	;
	
agg_funct
	: ( COUNT | AVERAGE | MIN | MAX ) LEFT_PAR ID RIGHT_PAR
	;
	
update
	: UPDATE ID NEWLINE? SET ID EQUALS value NEWLINE? where NEWLINE*
	;
	
delete
	: DELETE NEWLINE? FROM ID NEWLINE? where NEWLINE*
	;
	
insert
	: INSERT INTO ID LEFT_PAR cols RIGHT_PAR NEWLINE? VALUES LEFT_PAR values RIGHT_PAR NEWLINE*
	;
	
values
	: value values
	|
	;
	
value
	: INT
	| FLOAT
	| ID
	;
	
/* Comandos DDL */ 
ddl_commands
	: ( set_db
	| create_index
	| drop_table
	| alter_table
	| create_table ) ( ddl_commands
	| dml_commands
	| clp_commands )
	| /* ε */
	;
	
/* Fija el esquema actual */	
set_db
	: SET DATABASE ID NEWLINE*
	;

/* Crea un índice sobre una columna distinta a la llave primaria */	
create_index
	: CREATE INDEX ID ON NEWLINE? ID LEFT_PAR ID RIGHT_PAR NEWLINE*
	;

/* Elimina una tabla */	
drop_table
	: DROP TABLE ID NEWLINE*
	;
	
/* Establece integridad referencial sobre una columna */	
alter_table
	: ALTER TABLE ID NEWLINE? ADD CONSTRAINT const_def NEWLINE*
	;
	
const_def
	: FOREIGN KEY LEFT_PAR ID RIGHT_PAR NEWLINE? REFERENCES ID LEFT_PAR ID RIGHT_PAR
	;
	
/* Crea una tabla */	
create_table
	: CREATE TABLE ID AS LEFT_PAR NEWLINE? col_def p_key RIGHT_PAR NEWLINE*
	;
	
/* Definición de columnas */	
col_def
	: ID type null_cons NEWLINE? col_def
	| /* ε */
	;
	
/* Tipos de datos */	
type
	: INTEGER
	| DECIMAL LEFT_PAR INT COLON INT RIGHT_PAR
	| CHARACTER LEFT_PAR INT RIGHT_PAR
	| VARCHAR
	| DATETIME
	;
	
/* Restricción de NULL */	
null_cons
	: NULL
	| NOT NULL
	;
	
/* Llave primaria */	
p_key
	: PRIMARY KEY LEFT_PAR ID RIGHT_PAR NEWLINE?
	;

/* Comandos CLP */ 
clp_commands
	: ( create_db
	| drop_db
	| list_db
	| start
	| get_status
	| stop
	| display_db ) ( clp_commands
	| dml_commands
	| ddl_commands )
	| /* ε */
	;

/* Crear un nuevo esquema */	
create_db
	: CREATE DATABASE ID NEWLINE* {System.out.println("Creating database " + $ID.text + "...\n");}
	;

/* Eliminar un esquema */	
drop_db
	: DROP DATABASE ID NEWLINE* {System.out.println("Deleting database " + $ID.text + "...\n");}
	;

/* Muestra los esquemas existentes */	
list_db
	: LIST DATABASES NEWLINE* {System.out.println("Listing databases...\n");}
	;

/* Inicia los procesos */	
start
	: START NEWLINE* {System.out.println("Starting processes...\n");}
	;

/* Obtiene el estado del motor */	
get_status
	: GET STATUS NEWLINE* {System.out.println("Obtaining status...\n");}
	;

/* Detiene los procesos */	
stop
	: STOP NEWLINE* {System.out.println("Stoping processes...\n");}
	;

/* Muestra el esquema seleccionado */	
display_db
	: DISPLAY DATABASE ID NEWLINE* {System.out.println("Displaying database " + $ID.text + "...\n");}
	;
	
SELECT
	: 'SELECT'
	| 'select'
	;
	
ALL
	: '*'
	;
	
FROM
	: 'FROM'
	| 'from'
	;
	
JOIN
	: 'JOIN'
	| 'join'
	;
	
WHERE
	: 'WHERE'
	| 'where'
	;
	
GREATER_THAN
	: '>'
	;
	
GREATER_EQUALS
	: '>='
	;
	
LESS_THAN
	: '<'
	;
	
LESS_EQUALS
	: '<='
	;
	
EQUALS
	: '='
	;
	
LIKE
	: 'LIKE'
	| 'like'
	;
	
IS
	: 'IS'
	| 'is'
	;
	
GROUP
	: 'GROUP'
	| 'group'
	;
	
BY
	: 'BY'
	| 'by'
	;
	
FOR
	: 'FOR'
	| 'for'
	;
	
JSON
	: 'JSON'
	| 'json'
	;
	
XML
	: 'XML'
	| 'xml'
	;
	
COUNT
	: 'COUNT'
	| 'count'
	;
	
AVERAGE
	: 'AVERAGE'
	| 'average'
	;
	
MIN
	: 'MIN'
	| 'min'
	;
	
MAX
	: 'MAX'
	| 'max'
	;
	
UPDATE
	: 'UPDATE'
	| 'update'
	;
	
DELETE
	: 'DELETE'
	| 'delete'
	;
	
INSERT
	: 'INSERT'
	| 'insert'
	;
	
INTO
	: 'INTO'
	| 'into'
	;
	
VALUES
	: 'VALUES'
	| 'values'
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
	
SET
	: 'SET'
	| 'set'
	;
	
INDEX
	: 'INDEX'
	| 'index'
	;
	
ON
	: 'ON'
	| 'on'
	;
	
TABLE
	: 'TABLE'
	| 'table'
	;
	
ALTER
	: 'ALTER'
	| 'alter'
	;
	
ADD
	: 'ADD'
	| 'add'
	;
	
CONSTRAINT
	: 'CONSTRAINT'
	| 'constraint'
	;
	
FOREIGN
	: 'FOREIGN'
	| 'foreign'
	;
	
KEY
	: 'KEY'
	| 'key'
	;
	
REFERENCES
	: 'REFERENCES'
	| 'references'
	;
	
AS
	: 'AS'
	| 'as'
	;
	
INTEGER
	: 'INTEGER'
	| 'integer'
	;
	
DECIMAL
	: 'DECIMAL'
	| 'decimal'
	;
	
LEFT_PAR
	: '('
	;
	
COLON
	: ','
	;
	
RIGHT_PAR
	: ')'
	;
	
CHARACTER
	: 'CHAR'
	| 'char'
	;
	
VARCHAR
	: 'VARCHAR'
	| 'varchar'
	;
	
DATETIME
	: 'DATETIME'
	| 'datetime'
	;
	
NULL
	: 'NULL'
	| 'null'
	;
	
NOT
	: 'NOT'
	| 'not'
	;
	
PRIMARY
	: 'PRIMARY'
	| 'primary'
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
