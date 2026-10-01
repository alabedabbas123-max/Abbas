package com.google.googlejavaformat.java.javac.parser;

import com.sun.tools.javac.util.Position;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class Scanner implements Lexer {
    private Tokens.Token prevToken;
    private List<Tokens.Token> savedTokens;
    private Tokens.Token token;
    private JavaTokenizer tokenizer;
    private Tokens tokens;

    protected Scanner(ScannerFactory fac, CharBuffer buf) {
        this(fac, new JavaTokenizer(fac, buf));
    }

    protected Scanner(ScannerFactory fac, char[] buf, int inputLength) {
        this(fac, new JavaTokenizer(fac, buf, inputLength));
    }

    protected Scanner(ScannerFactory fac, JavaTokenizer tokenizer) {
        this.savedTokens = new ArrayList();
        this.tokenizer = tokenizer;
        this.tokens = fac.tokens;
        Tokens.Token token = Tokens.DUMMY;
        this.prevToken = token;
        this.token = token;
    }

    @Override
    public Tokens.Token token() {
        return token(0);
    }

    @Override
    public Tokens.Token token(int lookahead) {
        if (lookahead == 0) {
            return this.token;
        }
        ensureLookahead(lookahead);
        return this.savedTokens.get(lookahead - 1);
    }

    private void ensureLookahead(int lookahead) {
        for (int i = this.savedTokens.size(); i < lookahead; i++) {
            this.savedTokens.add(this.tokenizer.readToken());
        }
    }

    @Override
    public Tokens.Token prevToken() {
        return this.prevToken;
    }

    @Override
    public void nextToken() {
        this.prevToken = this.token;
        if (!this.savedTokens.isEmpty()) {
            this.token = this.savedTokens.remove(0);
        } else {
            this.token = this.tokenizer.readToken();
        }
    }

    @Override
    public Tokens.Token split() {
        Tokens.Token[] splitTokens = this.token.split(this.tokens);
        this.prevToken = splitTokens[0];
        Tokens.Token token = splitTokens[1];
        this.token = token;
        return token;
    }

    @Override
    public Position.LineMap getLineMap() {
        return this.tokenizer.getLineMap();
    }

    @Override
    public int errPos() {
        return this.tokenizer.errPos();
    }

    @Override
    public void errPos(int pos) {
        this.tokenizer.errPos(pos);
    }
}
