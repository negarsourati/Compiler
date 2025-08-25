grammar FunctionCraft;

// Grammers

program: (func_def | COMMENT | NL | pattern) program | main NL? EOF;
func_def: DEF name=NAME { System.out.println("FuncDec: " + $name.text); }
          params NL (instructs | RETURN { System.out.println("RETURN"); } return_obj SEMICOLON NL | ) END NL;

params: LPAR (par_inside | ) RPAR;
par_inside: (obt_pars | identifier) | NAME COMMA par_inside;
obt_pars: LBRACK obts RBRACK;
obts: NAME EQ const (COMMA obts | );

return_obj: ret_exp | lambda | ;

ret_exp: obj | LPAR ret_exp RPAR | ret_exp name=UNI_OP { System.out.println("Operator: " + $name.text); }
             | name=(NOT | NEG) ret_exp { System.out.println("Operator: " + $name.text); }
             | ret_exp name=(DIV | MULT | REM) ret_exp { System.out.println("Operator: " + $name.text); }
             | ret_exp name=(PLUS | NEG) ret_exp { System.out.println("Operator: " + $name.text); }
             | ret_exp name=BOOL_OP1 ret_exp { System.out.println("Operator: " + $name.text); }
             | ret_exp name=BOOL_OP2 ret_exp { System.out.println("Operator: " + $name.text); }
             | ret_exp AND ret_exp { System.out.println("Operator: &&"); }
             | ret_exp OR ret_exp { System.out.println("Operator: ||"); }
             | ret_exp CONCAT ret_exp { System.out.println("Operator: <<"); };

obj: (func_call | const | list | identifier);

lambda: ARROW { System.out.println("Structure: LAMBDA"); } LPAR lam_pars RPAR LCBRACK RETURN { System.out.println("RETURN"); }
        return_obj SEMICOLON RCBRACK;
lam_pars: NAME (COMMA lam_pars | );

func_call: (
            built_in LPAR ret_exp RPAR | user_def | user_def LPAR call_pars RPAR |
            NAME DOT MATCH { System.out.println("Built-In: MATCH"); } LPAR call_pars RPAR | METHOD LPAR COLON NAME RPAR
           );

user_def: NAME { System.out.println("Function Call"); } LPAR (call_pars | ) RPAR | lambda LPAR call_pars RPAR;
call_pars: (ret_exp | lambda) (NL? COMMA NL? call_pars | );

built_in: PUTS { System.out.println("Built-In: PUTS"); }
          | PUSH { System.out.println("Built-In: PUSH"); }
          | LEN { System.out.println("Built-In: LEN"); }
          | CHOP { System.out.println("Built-In: CHOP"); }
          | CHOMP { System.out.println("Built-In: CHOMP"); };

main: DEF MAIN { System.out.println("MAIN"); } LPAR RPAR NL (instructs)+ END NL?;

instructs: (COMMENT | clause | NL)+;
clause: (if | loop) NL | (assign | func_call | pattern | ret_exp CONCAT ret_exp { System.out.println("Operator: <<"); }) SEMICOLON NL;

assign: name=identifier (ASSIGN_OP | EQ) value { System.out.println("Assignment: " + $name.text); };
value: lambda | ret_exp;

pattern: PATTERN name=NAME { System.out.println("PatternDec: " + $name.text); }
         LPAR lam_pars RPAR NL (case | NL)+  NL SEMICOLON;
case: CASE conditions EQ ret_exp;

loop: loop_do | for;
loop_do: LOOP_DO { System.out.println("Loop: DO"); } NL (control | instructs)+ END;
control: (BREAK { System.out.println("Control: BREAK"); } | NEXT { System.out.println("Control: NEXT"); }
         | (BREAKIF { System.out.println("Control: BREAK"); } | NEXTIF { System.out.println("Control: NEXT"); }) conditions) SEMICOLON NL;

conditions: LPAR bool_exp RPAR
            | LPAR
            (
            conditions name=(AND | OR) { System.out.println("Operator: " + $name.text); }
            | LPAR NOT { System.out.println("Operator: !"); } conditions RPAR name=(AND | OR) { System.out.println("Operator: " + $name.text); }
            )+ (conditions | LPAR NOT { System.out.println("Operator: !"); } conditions RPAR ) RPAR;

bool_exp: (NOT { System.out.println("Operator: !"); } | ) arith_exp name=BOOL_OP1 { System.out.println("Operator: " + $name.text); }
          (NOT { System.out.println("Operator: !"); } | ) arith_exp
          | (NOT { System.out.println("Operator: !"); } | ) arith_exp name=BOOL_OP2 { System.out.println("Operator: " + $name.text); }
          (NOT { System.out.println("Operator: !"); } | ) arith_exp
          | (NOT { System.out.println("Operator: !"); } | ) arith_exp AND { System.out.println("Operator: &&"); }
          (NOT { System.out.println("Operator: !"); } | ) arith_exp
          | (NOT { System.out.println("Operator: !"); } | ) arith_exp OR { System.out.println("Operator: ||"); }
          (NOT { System.out.println("Operator: !"); } | ) arith_exp
          | (NOT { System.out.println("Operator: !"); } | ) arith_exp;

arith_exp: obj | LPAR arith_exp RPAR | arith_exp name=UNI_OP { System.out.println("Operator: " + $name.text); }
             | NEG arith_exp { System.out.println("Operator: -"); }
             | arith_exp name=(DIV | MULT | REM) arith_exp { System.out.println("Operator: " + $name.text); }
             | arith_exp name=(PLUS | NEG) arith_exp { System.out.println("Operator: " + $name.text); };

for: FOR { System.out.println("Loop: FOR"); } NAME IN (STR | list | range) NL ( control| instructs)* END;
range: LPAR (identifier | const | func_call) DOTDOT (identifier | const | func_call) RPAR;

if: IF { System.out.println("Decision: IF"); } conditions NL (instructs | elseif | NL)* else? END;

elseif: ELIF { System.out.println("Decision: ELSE IF"); } conditions NL instructs;
else: ELSE { System.out.println("Decision: ELSE"); } NL instructs;

list: LBRACK (list_inside | ) RBRACK;
list_inside: (list_obj | list) | (list_obj | list) COMMA list_inside;
list_obj: (identifier | const | func_call);

const: INT | STR | FLOAT | TRUE | FALSE;
identifier: NAME (LBRACK ret_exp RBRACK)*;

// LEXER

INT: [1-9][0-9]* | '0' ;
STR: '"'~('"')*'"' ;
FLOAT: INT* '.' [0-9]+ ;
TRUE: 'true';
FALSE: 'false';

COMMENT: ('#' ~('\n' | '\r')*  // short comment
         | '=begin' ('\n' | '\r' | '\r\n') (.)*? ('\n' | '\r' | '\r\n') '=end' ('\n' | '\r' | '\r\n')) -> skip;

CASE: '    |';
NL: ('\r' | '\n')+;
SPACE: ' ' -> skip;

MAIN: 'main';
DEF: 'def';
RETURN: 'return';
END: 'end';
IF: 'if';
ELIF: 'elseif';
ELSE: 'else';

LOOP_DO: 'loop do';
FOR: 'for';
IN: 'in';
NEXT: 'next';
NEXTIF: 'next if';
BREAK: 'break';
BREAKIF: 'break if';

CHOP: 'chop';
CHOMP: 'chomp';
PUSH: 'push';
PUTS: 'puts';
METHOD: 'method';
LEN: 'len';
PATTERN: 'pattern';
MATCH: 'match';

NAME : [a-zA-Z_][a-zA-Z0-9_]* ;

LPAR: '(' ;
RPAR: ')' ;
LBRACK: '[' ;
RBRACK: ']' ;
LCBRACK: '{' ;
RCBRACK: '}' ;

COMMA: ',' ;
SEMICOLON: ';' ;
COLON: ':';
ARROW: '->';
CONCAT: '<<';
DOT: '.';
EQ: '=';
DOTDOT: '..';

PLUS: '+';
DIV: '/';
MULT: '*';
NEG: '-' ;
REM: '%';
UNI_OP: ('++' | '--');
ASSIGN_OP: ('+=' | '-=' | '*=' | '/=' | '%=');
NOT: '!';
BOOL_OP1: ( '<' | '<=' | '>' | '>=' ) ;
BOOL_OP2: ('==' | '!=');
OR: '||';
AND: '&&';