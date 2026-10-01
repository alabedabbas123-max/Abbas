package com.google.googlejavaformat.java.javac.parser;

import com.sun.tools.javac.api.Formattable;
import com.sun.tools.javac.api.Messages;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.util.Locale;

public class Tokens {

    private final TokenKind[] f285key;
    private final Names names;
    public static final Context.C0723Key<Tokens> tokensKey = new Context.C0723Key<>();
    public static final Token DUMMY = new Token(TokenKind.ERROR, 0, 0, null);
    private int maxKey = 0;
    private Name[] tokenName = new Name[TokenKind.values().length];

    public interface Comment {

        public enum CommentStyle {
            LINE,
            BLOCK,
            JAVADOC
        }

        int getSourcePos(int i);

        CommentStyle getStyle();

        String getText();

        boolean isDeprecated();
    }

    public static Tokens instance(Context context) {
        Tokens instance = (Tokens) context.m501get(tokensKey);
        if (instance == null) {
            return new Tokens(context);
        }
        return instance;
    }

    protected Tokens(Context context) {
        context.m504put(tokensKey, this);
        this.names = Names.instance(context);
        for (TokenKind t : TokenKind.values()) {
            if (t.name != null) {
                enterKeyword(t.name, t);
            } else {
                this.tokenName[t.ordinal()] = null;
            }
        }
        this.f285key = new TokenKind[this.maxKey + 1];
        for (int i = 0; i <= this.maxKey; i++) {
            this.f285key[i] = TokenKind.IDENTIFIER;
        }
        for (TokenKind t2 : TokenKind.values()) {
            if (t2.name != null) {
                this.f285key[this.tokenName[t2.ordinal()].getIndex()] = t2;
            }
        }
    }

    private void enterKeyword(String s, TokenKind token) {
        Name n = this.names.fromString(s);
        this.tokenName[token.ordinal()] = n;
        if (n.getIndex() > this.maxKey) {
            this.maxKey = n.getIndex();
        }
    }

    TokenKind lookupKind(Name name) {
        return name.getIndex() > this.maxKey ? TokenKind.IDENTIFIER : this.f285key[name.getIndex()];
    }

    TokenKind lookupKind(String name) {
        return lookupKind(this.names.fromString(name));
    }

    public enum TokenKind implements Formattable, Filter<TokenKind> {
        EOF,
        ERROR,
        IDENTIFIER(Token.EnumC0557Tag.NAMED),
        ABSTRACT("abstract"),
        ASSERT("assert", Token.EnumC0557Tag.NAMED),
        BOOLEAN("boolean", Token.EnumC0557Tag.NAMED),
        BREAK("break"),
        BYTE("byte", Token.EnumC0557Tag.NAMED),
        CASE("case"),
        CATCH("catch"),
        CHAR("char", Token.EnumC0557Tag.NAMED),
        CLASS("class"),
        CONST("const"),
        CONTINUE("continue"),
        DEFAULT("default"),
        DO("do"),
        DOUBLE("double", Token.EnumC0557Tag.NAMED),
        ELSE("else"),
        ENUM("enum", Token.EnumC0557Tag.NAMED),
        EXTENDS("extends"),
        FINAL("final"),
        FINALLY("finally"),
        FLOAT("float", Token.EnumC0557Tag.NAMED),
        FOR("for"),
        GOTO("goto"),
        IF("if"),
        IMPLEMENTS("implements"),
        IMPORT("import"),
        INSTANCEOF("instanceof"),
        INT("int", Token.EnumC0557Tag.NAMED),
        INTERFACE("interface"),
        LONG("long", Token.EnumC0557Tag.NAMED),
        NATIVE("native"),
        NEW("new"),
        PACKAGE("package"),
        PRIVATE("private"),
        PROTECTED("protected"),
        PUBLIC("public"),
        RETURN("return"),
        SHORT("short", Token.EnumC0557Tag.NAMED),
        STATIC("static"),
        STRICTFP("strictfp"),
        SUPER("super", Token.EnumC0557Tag.NAMED),
        SWITCH("switch"),
        SYNCHRONIZED("synchronized"),
        THIS("this", Token.EnumC0557Tag.NAMED),
        THROW("throw"),
        THROWS("throws"),
        TRANSIENT("transient"),
        TRY("try"),
        VOID("void", Token.EnumC0557Tag.NAMED),
        VOLATILE("volatile"),
        WHILE("while"),
        INTLITERAL(Token.EnumC0557Tag.NUMERIC),
        LONGLITERAL(Token.EnumC0557Tag.NUMERIC),
        FLOATLITERAL(Token.EnumC0557Tag.NUMERIC),
        DOUBLELITERAL(Token.EnumC0557Tag.NUMERIC),
        CHARLITERAL(Token.EnumC0557Tag.NUMERIC),
        STRINGLITERAL(Token.EnumC0557Tag.STRING),
        TRUE("true", Token.EnumC0557Tag.NAMED),
        FALSE("false", Token.EnumC0557Tag.NAMED),
        NULL("null", Token.EnumC0557Tag.NAMED),
        UNDERSCORE("_", Token.EnumC0557Tag.NAMED),
        ARROW("->"),
        COLCOL("::"),
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

        public final Token.EnumC0557Tag f302tag;

        TokenKind() {
            this(null, Token.EnumC0557Tag.DEFAULT);
        }

        TokenKind(String name) {
            this(name, Token.EnumC0557Tag.DEFAULT);
        }

        TokenKind(Token.EnumC0557Tag tag) {
            this(null, tag);
        }

        TokenKind(String name, Token.EnumC0557Tag tag) {
            this.name = name;
            this.f302tag = tag;
        }

        @Override
        public String toString() {
            switch (C05561.f286x87071fad[ordinal()]) {
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

        @Override
        public boolean accepts(TokenKind that) {
            return this == that;
        }
    }

    static class C05561 {

        static final int[] f286x87071fad;

        static {
            int[] iArr = new int[TokenKind.values().length];
            f286x87071fad = iArr;
            try {
                iArr[TokenKind.IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f286x87071fad[TokenKind.CHARLITERAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f286x87071fad[TokenKind.STRINGLITERAL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f286x87071fad[TokenKind.INTLITERAL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f286x87071fad[TokenKind.LONGLITERAL.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f286x87071fad[TokenKind.FLOATLITERAL.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f286x87071fad[TokenKind.DOUBLELITERAL.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f286x87071fad[TokenKind.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f286x87071fad[TokenKind.EOF.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f286x87071fad[TokenKind.DOT.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f286x87071fad[TokenKind.COMMA.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f286x87071fad[TokenKind.SEMI.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f286x87071fad[TokenKind.LPAREN.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f286x87071fad[TokenKind.RPAREN.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                f286x87071fad[TokenKind.LBRACKET.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                f286x87071fad[TokenKind.RBRACKET.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                f286x87071fad[TokenKind.LBRACE.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                f286x87071fad[TokenKind.RBRACE.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
        }
    }

    public static class Token {
        public final List<Comment> comments;
        public final int endPos;
        public final TokenKind kind;

        public final int f287pos;

        enum EnumC0557Tag {
            DEFAULT,
            NAMED,
            STRING,
            NUMERIC
        }

        Token(TokenKind kind, int pos, int endPos, List<Comment> comments) {
            this.kind = kind;
            this.f287pos = pos;
            this.endPos = endPos;
            this.comments = comments;
            checkKind();
        }

        Token[] split(Tokens tokens) {
            if (this.kind.name.length() < 2 || this.kind.f302tag != EnumC0557Tag.DEFAULT) {
                throw new AssertionError("Cant split" + this.kind);
            }
            TokenKind t1 = tokens.lookupKind(this.kind.name.substring(0, 1));
            TokenKind t2 = tokens.lookupKind(this.kind.name.substring(1));
            if (t1 == null || t2 == null) {
                throw new AssertionError("Cant split - bad subtokens");
            }
            int i = this.f287pos;
            return new Token[]{new Token(t1, i, t1.name.length() + i, this.comments), new Token(t2, this.f287pos + t1.name.length(), this.endPos, null)};
        }

        protected void checkKind() {
            if (this.kind.f302tag != EnumC0557Tag.DEFAULT) {
                throw new AssertionError("Bad token kind - expected " + EnumC0557Tag.STRING);
            }
        }

        public Name name() {
            throw new UnsupportedOperationException();
        }

        public String stringVal() {
            throw new UnsupportedOperationException();
        }

        public int radix() {
            throw new UnsupportedOperationException();
        }

        public Comment comment(Comment.CommentStyle style) {
            List<Comment> comments = getComments(Comment.CommentStyle.JAVADOC);
            if (comments.isEmpty()) {
                return null;
            }
            return comments.head;
        }

        public boolean deprecatedFlag() {
            for (Comment c : getComments(Comment.CommentStyle.JAVADOC)) {
                if (c.isDeprecated()) {
                    return true;
                }
            }
            return false;
        }

        private List<Comment> getComments(Comment.CommentStyle style) {
            if (this.comments == null) {
                return List.m507nil();
            }
            ListBuffer<Comment> buf = new ListBuffer<>();
            for (Comment c : this.comments) {
                if (c.getStyle() == style) {
                    buf.add(c);
                }
            }
            return buf.toList();
        }
    }

    static final class NamedToken extends Token {
        public final Name name;

        public NamedToken(TokenKind kind, int pos, int endPos, Name name, List<Comment> comments) {
            super(kind, pos, endPos, comments);
            this.name = name;
        }

        @Override
        protected void checkKind() {
            if (this.kind.f302tag != Token.EnumC0557Tag.NAMED) {
                throw new AssertionError("Bad token kind - expected " + Token.EnumC0557Tag.NAMED);
            }
        }

        @Override
        public Name name() {
            return this.name;
        }
    }

    static class StringToken extends Token {
        public final String stringVal;

        public StringToken(TokenKind kind, int pos, int endPos, String stringVal, List<Comment> comments) {
            super(kind, pos, endPos, comments);
            this.stringVal = stringVal;
        }

        @Override
        protected void checkKind() {
            if (this.kind.f302tag != Token.EnumC0557Tag.STRING) {
                throw new AssertionError("Bad token kind - expected " + Token.EnumC0557Tag.STRING);
            }
        }

        @Override
        public String stringVal() {
            return this.stringVal;
        }
    }

    static final class NumericToken extends StringToken {
        public final int radix;

        public NumericToken(TokenKind kind, int pos, int endPos, String stringVal, int radix, List<Comment> comments) {
            super(kind, pos, endPos, stringVal, comments);
            this.radix = radix;
        }

        @Override
        protected void checkKind() {
            if (this.kind.f302tag != Token.EnumC0557Tag.NUMERIC) {
                throw new AssertionError("Bad token kind - expected " + Token.EnumC0557Tag.NUMERIC);
            }
        }

        @Override
        public int radix() {
            return this.radix;
        }
    }
}
