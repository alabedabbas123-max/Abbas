package com.almlkaide.kaypro.android.dx.rop.code;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class SourcePosition {
    public static final SourcePosition NO_INFO = new SourcePosition((CstString) null, -1, -1);
    private final int address;
    private final int line;
    private final CstString sourceFile;

    public SourcePosition(CstString cstString, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.sourceFile = cstString;
        this.address = i;
        this.line = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        if (this.sourceFile != null) {
            sb.append(this.sourceFile.toHuman());
            sb.append(Config.TRACE_TODAY_VISIT_SPLIT);
        }
        if (this.line >= 0) {
            sb.append(this.line);
        }
        sb.append('@');
        if (this.address < 0) {
            sb.append("????");
        } else {
            sb.append(Hex.m7225u2(this.address));
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourcePosition)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourcePosition sourcePosition = (SourcePosition) obj;
        return this.address == sourcePosition.address && sameLineAndFile(sourcePosition);
    }

    public int hashCode() {
        return this.sourceFile.hashCode() + this.address + this.line;
    }

    public boolean sameLine(SourcePosition sourcePosition) {
        return this.line == sourcePosition.line;
    }

    public boolean sameLineAndFile(SourcePosition sourcePosition) {
        return this.line == sourcePosition.line && (this.sourceFile == sourcePosition.sourceFile || (this.sourceFile != null && this.sourceFile.equals(sourcePosition.sourceFile)));
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }

    public int getAddress() {
        return this.address;
    }

    public int getLine() {
        return this.line;
    }
}
