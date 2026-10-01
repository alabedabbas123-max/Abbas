package com.sun.tools.javac.model;

import com.sun.tools.javac.util.Position;
import javax.tools.JavaFileObject;

class JavacSourcePosition {
    final Position.LineMap lineMap;

    final int f471pos;
    final JavaFileObject sourcefile;

    JavacSourcePosition(JavaFileObject sourcefile, int pos, Position.LineMap lineMap) {
        this.sourcefile = sourcefile;
        this.f471pos = pos;
        this.lineMap = pos != -1 ? lineMap : null;
    }

    public JavaFileObject getFile() {
        return this.sourcefile;
    }

    public int getOffset() {
        return this.f471pos;
    }

    public int getLine() {
        Position.LineMap lineMap = this.lineMap;
        if (lineMap != null) {
            return lineMap.getLineNumber(this.f471pos);
        }
        return -1;
    }

    public int getColumn() {
        Position.LineMap lineMap = this.lineMap;
        if (lineMap != null) {
            return lineMap.getColumnNumber(this.f471pos);
        }
        return -1;
    }

    public String toString() {
        int line = getLine();
        if (line > 0) {
            return this.sourcefile + ":" + line;
        }
        return this.sourcefile.toString();
    }
}
