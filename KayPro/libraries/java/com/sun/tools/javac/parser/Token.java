package com.sun.tools.javac.parser;

import com.sun.tools.javac.api.Formattable;
import com.sun.tools.javac.api.Messages;
import java.util.Locale;

public enum Token implements Formattable {
    EOF,
    ERROR,
    IDENTIFIER,
    ABSTRACT("abstract"),
    ASSERT("assert"),
    BOOLEAN("boolean"),
    BREAK("break"),
    BYTE("byte"),
    CASE("case"),
    CATCH("catch"),
    CHAR("char"),
    CLASS("class"),
    CONST("const"),
    CONTINUE("continue"),
    DEFAULT("default"),
    DO("do"),
    DOUBLE("double"),
    ELSE("else"),
    ENUM("enum"),
    EXTENDS("extends"),
    FINAL("final"),
    FINALLY("finally"),
    FLOAT("float"),
    FOR("for"),
    GOTO("goto"),
    IF("if"),
    IMPLEMENTS("implements"),
    IMPORT("import"),
    INSTANCEOF("instanceof"),
    INT("int"),
    INTERFACE("interface"),
    LONG("long"),
    NATIVE("native"),
    NEW("new"),
    PACKAGE("package"),
    PRIVATE("private"),
    PROTECTED("protected"),
    PUBLIC("public"),
    RETURN("return"),
    SHORT("short"),
    STATIC("static"),
    STRICTFP("strictfp"),
    SUPER("super"),
    SWITCH("switch"),
    SYNCHRONIZED("synchronized"),
    THIS("this"),
    THROW("throw"),
    THROWS("throws"),
    TRANSIENT("transient"),
    TRY("try"),
    VOID("void"),
    VOLATILE("volatile"),
    WHILE("while"),
    INTLITERAL,
    LONGLITERAL,
    FLOATLITERAL,
    DOUBLELITERAL,
    CHARLITERAL,
    STRINGLITERAL,
    TRUE("true"),
    FALSE("false"),
    NULL("null"),
    LPAREN("("),
    RPAREN(")"),
    LBRACE("{"),
    RBRACE("}"),
    LBRACKET("["),
    RBRACKET("]"),
    SEMI(";"),
    COMMA(","),
    DOT("."),
    ELLIPSIS("..."),
    EQ("="),
    GT(">"),
    LT("<"),
    BANG("!"),
    TILDE("~"),
    QUES("?"),
    COLON(":"),
    EQEQ("=="),
    LTEQ("<="),
    GTEQ(">="),
    BANGEQ("!="),
    AMPAMP("&&"),
    BARBAR("||"),
    PLUSPLUS("++"),
    SUBSUB("--"),
    PLUS("+"),
    SUB("-"),
    STAR("*"),
    SLASH("/"),
    AMP("&"),
    BAR("|"),
    CARET("^"),
    PERCENT("%"),
    LTLT("<<"),
    GTGT(">>"),
    GTGTGT(">>>"),
    PLUSEQ("+="),
    SUBEQ("-="),
    STAREQ("*="),
    SLASHEQ("/="),
    AMPEQ("&="),
    BAREQ("|="),
    CARETEQ("^="),
    PERCENTEQ("%="),
    LTLTEQ("<<="),
    GTGTEQ(">>="),
    GTGTGTEQ(">>>="),
    MONKEYS_AT("@"),
    CUSTOM;

    public final String name;

    Token() {
        this(null);
    }

    Token(String name) {
        this.name = name;
    }

    static class C07101 {
        static final int[] $SwitchMap$com$sun$tools$javac$parser$Token;

        static {
            int[] iArr = new int[Token.values().length];
            $SwitchMap$com$sun$tools$javac$parser$Token = iArr;
            try {
                iArr[Token.IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.CHARLITERAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.STRINGLITERAL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.INTLITERAL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.LONGLITERAL.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.FLOATLITERAL.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.DOUBLELITERAL.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.EOF.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.DOT.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.COMMA.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.SEMI.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.LPAREN.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.RPAREN.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.LBRACKET.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.RBRACKET.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.LBRACE.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$parser$Token[Token.RBRACE.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
        }
    }

    @Override
    public String toString() {
        switch (C07101.$SwitchMap$com$sun$tools$javac$parser$Token[ordinal()]) {
            case 1:
                return "token.identifier";
            case 2:
                return "token.character";
            case 3:
                return "token.string";
            case 4:
                return "token.integer";
            case 5:
                return "token.long-integer";
            case 6:
                return "token.float";
            case 7:
                return "token.double";
            case 8:
                return "token.bad-symbol";
            case 9:
                return "token.end-of-input";
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return "'" + this.name + "'";
            default:
                return this.name;
        }
    }

    @Override
    public String getKind() {
        return "Token";
    }

    @Override
    public String toString(Locale locale, Messages messages) {
        if (this.name != null) {
            return toString();
        }
        return messages.getLocalizedString(locale, "compiler.misc." + toString(), new Object[0]);
    }
}
