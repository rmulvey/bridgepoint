/*
 * generated by Xtext 2.9.1
 */
lexer grammar InternalMASLLexer;

@header {
package org.xtuml.bp.xtext.masl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Reverse_ordered_by : 'reverse_ordered_by';

Unconditionally : 'unconditionally';

Cannot_Happen : 'Cannot_Happen';

Current_State : 'Current_State';

Cannot_happen : 'cannot_happen';

Conditionally : 'conditionally';

Non_Existant : 'Non_Existant';

Non_Existent : 'Non_Existent';

Intersection : 'intersection';

Non_existant : 'non_existant';

Non_existent : 'non_existent';

Relationship : 'relationship';

Referential : 'referential';

Dictionary : 'dictionary';

Identifier : 'identifier';

Ordered_by : 'ordered_by';

Terminator : 'terminator';

Transition : 'transition';

Anonymous : 'anonymous';

Exception : 'exception';

Find_only : 'find_only';

Preferred : 'preferred';

Structure : 'structure';

Assigner : 'assigner';

Creation : 'creation';

Deferred : 'deferred';

Disunion : 'disunion';

Find_all : 'find_all';

Find_one : 'find_one';

Function : 'function';

Generate : 'generate';

Instance : 'instance';

Readonly : 'readonly';

Schedule : 'schedule';

Sequence : 'sequence';

Terminal : 'terminal';

Builtin : 'builtin';

Console : 'console';

Declare : 'declare';

Private : 'private';

Project : 'project';

Reverse : 'reverse';

Service : 'service';

Subtype : 'subtype';

FILE : '#FILE#';

LINE : '#LINE#';

Ignore : 'Ignore';

Cancel : 'cancel';

Create : 'create';

Delete : 'delete';

Digits : 'digits';

Domain : 'domain';

Not_in : 'not_in';

Object : 'object';

Others : 'others';

Pragma : 'pragma';

Public : 'public';

Return : 'return';

Unique : 'unique';

Unlink : 'unlink';

Array : 'array';

Begin : 'begin';

Delay : 'delay';

Delta : 'delta';

Elsif : 'elsif';

Erase : 'erase';

Event : 'event';

False : 'false';

Flush : 'flush';

Raise : 'raise';

Range : 'range';

Start : 'start';

State : 'state';

Union : 'union';

Using : 'using';

While : 'while';

Case : 'case';

Else : 'else';

Endl : 'endl';

Enum : 'enum';

Exit : 'exit';

Find : 'find';

Is_a : 'is_a';

Link : 'link';

Loop : 'loop';

Many : 'many';

Null : 'null';

Then : 'then';

This : 'this';

True : 'true';

Type : 'type';

When : 'when';

With : 'with';

LessThanSignLessThanSignLessThanSign : '<<<';

GreaterThanSignGreaterThanSignGreaterThanSign : '>>>';

Abs : 'abs';

And : 'and';

Bag : 'bag';

End : 'end';

For : 'for';

Mod : 'mod';

Not : 'not';

One : 'one';

Out : 'out';

Rem : 'rem';

Set : 'set';

Xor : 'xor';

AsteriskAsterisk : '**';

HyphenMinusGreaterThanSign : '->';

FullStopFullStop : '..';

SolidusEqualsSign : '/=';

ColonColon : '::';

ColonEqualsSign : ':=';

LessThanSignLessThanSign : '<<';

LessThanSignEqualsSign : '<=';

LessThanSignGreaterThanSign : '<>';

EqualsSignGreaterThanSign : '=>';

GreaterThanSignEqualsSign : '>=';

GreaterThanSignGreaterThanSign : '>>';

At : 'at';

If : 'if';

In : 'in';

Is : 'is';

Of : 'of';

Or : 'or';

To : 'to';

TildeGreaterThanSign : '~>';

Ampersand : '&';

Apostrophe : '\'';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

VerticalLine : '|';

// Rules duplicated to allow inter-rule references

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_REAL : RULE_INT '.' RULE_INT;

RULE_INT : ('0'..'9')+;

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_CHAR : '\'' . '\'';

RULE_DURATION : '@P' ( options {greedy=false;} : . )*'@';

RULE_TIMESTAMP : '@' ( options {greedy=false;} : . )*'@';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
