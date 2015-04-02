grammar BStar;

//parse
abmachine:
	MACHINE id (includes)? (ATTRIBUTE (defines)? cv_define)? (code_text)? END; 
code_text:
	operations | declare_operations | cdeclare_operations ; 		

includes:		
	(include 
		(
			string	| 
			L_ANGLE_BRACKET id SUF R_ANGLE_BRACKET
		) 
		SEMICOLON
	)+	;

attributes:		
	ATTRIBUTE (defines)? cv_define	;

cv_define:		
	(
		single_cv_define
	)+	;

single_cv_define:
	var_define	SEMICOLON	|
	cst_define	SEMICOLON	;

single_var_define:
	(MUL point_id | id) (ASSIGNMENT element)?		;

var_define:		
	type	single_var_define 
	 (COMMA single_var_define )*		|
	TYPEDEF	enum_type	id				|
	TYPEDEF	type		point_id		|
	TYPEDEF	struct_type	point_id		;

cst_define:		
	CONST	type	point_id ASSIGNMENT element
			(COMMA	point_id ASSIGNMENT element)*	;

//machine
operations:		
	OPERATIONS	(function_define)+	;

function_define:
	type point_id L_BRACKET para_define_list R_BRACKET 
	L_BRACE com_statement R_BRACE	;

//machine_h
declare_operations:	
	OPERATIONS	declares	;

declares:		
	(function_declare)+		;

function_declare:
	type	point_id L_BRACKET para_define_list R_BRACKET	;

//machine_l
cdeclare_operations:
	OPERATIONS	(cfunction_declare)+	;

cfunction_declare:
	function_declare robust function	;

defines:		
	(define id element)+ ;
			
type:			normal_type									| 
				set_type									| 
				id (L_ANGLE_BRACKET type R_ANGLE_BRACKET)? 	;
normal_type:	SHORT_TYPE                      |
                UNSIGNED SHORT_TYPE             |
                INT_TYPE                        |
                UNSIGNED INT_TYPE               |
                LONG_TYPE                       |
                UNSIGNED LONG_TYPE				|
                LONG_TYPE LONG_TYPE				|
                UNSIGNED LONG_TYPE LONG_TYPE    |
                CHAR_TYPE                       |
                UNSIGNED CHAR_TYPE				|
                FLOAT_TYPE                      |
                UNSIGNED FLOAT_TYPE				|
                DOUBLE_TYPE                     |
                UNSIGNED DOUBLE_TYPE            |
                STRING_TYPE                     |
                PROPOSITION_TYPE				|
                VOID							;

set_type:		SET_TYPE L_ANGLE_BRACKET type R_ANGLE_BRACKET (at_str)?	;
struct_type:	STRUCT L_BRACE (type point_id SEMICOLON)* R_BRACE		;
enum_type:		ENUM_TYPE L_BRACE	(
									single_enum_type
							 (COMMA single_enum_type)*
									)*
						  R_BRACE										;

single_enum_type:
		id (ASSIGNMENT unary_e)?										;

point_id:		MUL point_id | id | L_BRACKET point_id R_BRACKET		;
addr_id:		ADDR addr_id | id | L_BRACKET addr_id R_BRACKET			;

robust:			ROBUST		(PRECONDITION pro_e POSTCONDITION pro_e)+	;
function:		FUNCTION	(PRECONDITION pro_e POSTCONDITION pro_e)+	;

para_define_list:
				(type point_id (COMMA type point_id)*)?					;
function_call:	id	L_BRACKET para_value_list R_BRACKET (append_paras)?	;
para_value_list:
				(element (COMMA element)*)?			;
append_paras:	AT id (COMMA id)* AT				;

attributes_2:	cv_define							;
com_statement:	(attributes_2)? (invariant)? (statement)*				;
invariant:		INVARIANT	pro_e	SEMICOLON	;

statement:		SEMICOLON							|
				assign_stat		SEMICOLON			|
				element_take	SEMICOLON			|
				function_call	SEMICOLON			|
				return_stat		SEMICOLON			|
				while_stat							|
				if_stat								|
				L_BRACE (statement)* R_BRACE		|
				element								|
				break_stat							|
				continue_stat						|
				statement_at						;


element_take:	
	term;

break_stat:
	BREAK SEMICOLON;
continue_stat:
	CONTINUE SEMICOLON;

assign_stat:	point_id ASSIGNMENT element			|
				point_id (POINT id | ADDRGET id)+
					ASSIGNMENT element				;
return_stat:	RETURN (.)?					;
while_stat:		WHILE L_BRACKET pro_e R_BRACKET statement	;
if_stat:		IF	  L_BRACKET pro_e R_BRACKET statement 
					(else_stat)?						;
else_stat:
	ELSE statement;

define:			DEFINE	;
include:		INCLUDE	;
point:			POINT 	;
belong: 		BELONG 	;
not_belong:		NOTBELONG	;
addr_get:		ADDRGET ;
nil:			NIL 	;
id:             ID      ;
string: 		STRING 	;
at_str:			AT_STR	;
true_str:		TRUE 	;
false_str: 		FALSE 	;
integer: 		INTEGER ;
real: 			REAL 	;
char_str: 		CHAR 	;
statement_at:	AT_STR	;

belong_pair:
	(id | integer) belong element ;		   

term_latter:
	POINT	L_ANGLE_BRACKET 
			belong_pair
			(COMMA belong_pair)* 
			R_ANGLE_BRACKET	
			(belong	| not_belong )	mse	|
	POINT id							|
	ADDRGET id							;

term_element_comma:
	COMMA element	;

term_set:
	L_BRACE element (COMMA element)* R_BRACE	;	

term_tuple:
	L_ANGLE_BRACKET element (COMMA element)* R_ANGLE_BRACKET	;


term:
(			
	nil								|
	string							| 
	true_str						| 
	false_str						| 
	integer							| 
	real							|	 
	char_str						| 
	term_set						| 
	term_tuple						| 
	function_call					| 
	id								| 
	L_BRACKET element R_BRACKET		 
)
(
	term_latter
)*                                  ;

one_e:		NOT		one_e		|
			MUL		one_e		|
			ADDR	one_e		|
			term				;

unary_e:	(ADD | SUB) term	|
			one_e				;

mse_0:		unary_e				;

mse_1_latter:
	MUL		mse_0	|
	DIV		mse_0	|
	MOD		mse_0	|
	INTER	mse_0	|
	UNION	mse_0	;	
mse_1:		
	mse_0 ( mse_1_latter )*	;

mse_latter:
	ADD		mse_1	|
	SUB		mse_1	|
	DIFFER	mse_1	;
mse:		
	mse_1 ( mse_latter )*	;

condition_term:		
	mse	( condition_term_latter	)?	;

condition_term_latter:
	L_ANGLE_BRACKET	mse	|
	ELES			mse	|
	R_ANGLE_BRACKET	mse	|
	EGRE			mse	|
	NOTBELONG		mse	|
	BELONG			mse	|
	EQU				mse	|
	UEQU			mse	;

id_list:	id (COMMA id)*						|
			L_BRACKET id (COMMA id)* R_BRACKET	;	

quan_e:     EXIST   id_list     L_BRACKET pro_e     R_BRACKET   |
            FORALL  id_list     L_BRACKET imp_pro_e R_BRACKET   ;
pro_term_e: quan_e          |
            condition_term  ;
and_pro_e:  pro_term_e  (CONJUNCTION	pro_term_e	)*	;
or_pro_e:   and_pro_e   (DISJUNCTION	and_pro_e	)*	;
imp_pro_e:	or_pro_e	 IMPLICATION	or_pro_e		;
pro_e:		or_pro_e	(IMPLICATION	or_pro_e	)*	;
element:	pro_e										;

//lex
MACHINE: 			'MACHINE'		;
INVARIANT:			'INVARIANT'		;
ATTRIBUTE:			'ATTRIBUTES'		;
OPERATIONS:			'OPERATIONS'	;
END:				'END'			;
INCLUDE:			'INCLUDE'		;
FUNCTION:			'FUNCTION'		;
ROBUST:				'ROBUST'		;

PRECONDITION:		'Precondition'	;
POSTCONDITION:		'Postcondition'	;

//type
SHORT_TYPE:			'short'			;
INT_TYPE: 			'int'			;
LONG_TYPE:			'long'			;
FLOAT_TYPE:			'float'			;
DOUBLE_TYPE: 		'double'		;
CHAR_TYPE:			'char'			;
STRING_TYPE:		'string'		;
PROPOSITION_TYPE:	'proposition'	;
SET_TYPE:			'set'			;
TUPLE_TYPE:			'tuple'			;
BOOL_TYPE:			'bool'			;
ENUM_TYPE:			'enum'			;

CONST: 				'const'			;
UNSIGNED:			'unsigned'		;

TRUE:				'true'			;
FALSE:				'false'			;
NIL:				'nil'			;

STRUCT:				'struct'		;
VOID:				'void'			;
RETURN:				'return'		;
IF:					'if'			;
ELSE:				'else'			;
WHILE:				'while'			;
BREAK:				'break'			;
CONTINUE:			'continue'		;
TYPEDEF:			'typedef'		;
SUF:				'.bs'			;				
DEFINE:				'#define'		;
FORALL:				'#'				;


//symbol
COMMA:				','		;
POINT:				'.'		;
AT:					'@'		;
SEMICOLON:			';'		;
L_BRACKET:			'('		;
R_BRACKET:			')'		;
L_BRACE:			'{'		;
R_BRACE:			'}'		;
L_ANGLE_BRACKET:	'<'		;
R_ANGLE_BRACKET:	'>'		;

ADD: 				'+'		;
SUB: 				'-'		;
MUL: 				'*'		;
DIV: 				'/'		;
MOD:				'%'		;
NOT:				'~'		;
CONJUNCTION:		'&&'	;
DISJUNCTION:		'||'	;
IMPLICATION:		'=>'	;
EXIST:				'!'		;

EGRE:				'>='	;
ELES:				'<='	;
EQU:				'=='	;
UEQU:				'!='	;

SEPERATOR:			'|'		;
BELONG:				':'		;
NOTBELONG:			'!:'	;
INTER:				'/-\\'	;
UNION:				'\\-/'	;
DIFFER:				'--'	;

ASSIGNMENT:			'='		;
ADDRGET:			'->'	;
ADDR:				'&'		;

CHAR:		'\''	(~['\"','\\'] | 
			'\\' ['n','t','b','r','f','\\','\'','\"'])	'\''	;
STRING:		'\"'	(~['\"','\\'] | 
			'\\' ['n','t','b','r','f','\\','\'','\"'])* '\"'	;
AT_STR:		'@'		(~['\"','\\'] | 
			'\\' ['n','t','b','r','f','\\','\'','\"'])* '@'		;	
INTEGER:	(NO_ZERO_NUM(NUM)*) | '0'	;
REAL: 		INTEGER ('.'NUM(NUM)*)?		;
ID:			LETTER(CHARACTER)*			;

WS :		[ \t\r\n]+ -> skip	;
COMMENT:	'/*' (~["*"])* '*' (~['/'] (~['*'])* '*')* '/'		-> skip	;
COMMENT_2:	'//' (~['\n','\r'])* ('\n' | '\r' | '\r\n')			-> skip	;


// fragments 
fragment LETTER: ['_'a-zA-Z];
fragment NO_ZERO_NUM:	[1-9];
fragment NUM: '0'|NO_ZERO_NUM;
fragment CHARACTER:	LETTER|NUM;

