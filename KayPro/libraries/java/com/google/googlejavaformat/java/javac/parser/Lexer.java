package com.google.googlejavaformat.java.javac.parser;

import com.sun.tools.javac.util.Position;

public interface Lexer {
    int errPos();

    void errPos(int i);

    Position.LineMap getLineMap();

    void nextToken();

    Tokens.Token prevToken();

    Tokens.Token split();

    Tokens.Token token();

    Tokens.Token token(int i);
}
