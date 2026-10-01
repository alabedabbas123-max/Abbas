package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;

public class Keywords {
    public static final Context.C0723Key<Keywords> keywordsKey = new Context.C0723Key<>();

    private final Token[] f481key;
    private final Names names;
    private int maxKey = 0;
    private Name[] tokenName = new Name[Token.values().length];

    public static Keywords instance(Context context) {
        Keywords instance = (Keywords) context.m501get(keywordsKey);
        if (instance == null) {
            return new Keywords(context);
        }
        return instance;
    }

    protected Keywords(Context context) {
        context.m504put(keywordsKey, this);
        this.names = Names.instance(context);
        for (Token t : Token.values()) {
            if (t.name != null) {
                enterKeyword(t.name, t);
            } else {
                this.tokenName[t.ordinal()] = null;
            }
        }
        this.f481key = new Token[this.maxKey + 1];
        for (int i = 0; i <= this.maxKey; i++) {
            this.f481key[i] = Token.IDENTIFIER;
        }
        for (Token t2 : Token.values()) {
            if (t2.name != null) {
                this.f481key[this.tokenName[t2.ordinal()].getIndex()] = t2;
            }
        }
    }

    public Token m486key(Name name) {
        return name.getIndex() > this.maxKey ? Token.IDENTIFIER : this.f481key[name.getIndex()];
    }

    private void enterKeyword(String s, Token token) {
        Name n = this.names.fromString(s);
        this.tokenName[token.ordinal()] = n;
        if (n.getIndex() > this.maxKey) {
            this.maxKey = n.getIndex();
        }
    }
}
