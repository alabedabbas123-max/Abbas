package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Position;

public interface Lexer {
    boolean deprecatedFlag();

    String docComment();

    int endPos();

    int errPos();

    void errPos(int i);

    Position.LineMap getLineMap();

    char[] getRawCharacters();

    char[] getRawCharacters(int i, int i2);

    Name name();

    void nextToken();

    int mo487pos();

    int prevEndPos();

    int radix();

    void resetDeprecatedFlag();

    String stringVal();

    Token token();

    void token(Token token);
}
