package com.sun.tools.javac.util;

import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.tree.JCTree;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.CharBuffer;
import java.util.Map;
import javax.tools.JavaFileObject;

public class DiagnosticSource {
    public static final DiagnosticSource NO_SOURCE = new DiagnosticSource() {
        @Override
        protected boolean findLine(int pos) {
            return false;
        }
    };

    protected char[] f559buf;
    protected int bufLen;
    protected Map<JCTree, Integer> endPosTable;
    protected JavaFileObject fileObject;
    protected int line;
    protected int lineStart;

    protected AbstractLog f560log;
    protected SoftReference<char[]> refBuf;

    public DiagnosticSource(JavaFileObject fo, AbstractLog log) {
        this.fileObject = fo;
        this.f560log = log;
    }

    private DiagnosticSource() {
    }

    public JavaFileObject getFile() {
        return this.fileObject;
    }

    public int getLineNumber(int pos) {
        try {
            if (findLine(pos)) {
                return this.line;
            }
            return 0;
        } finally {
            this.f559buf = null;
        }
    }

    public int getColumnNumber(int pos, boolean expandTabs) {
        try {
            if (!findLine(pos)) {
                this.f559buf = null;
                return 0;
            }
            int column = 0;
            for (int bp = this.lineStart; bp < pos; bp++) {
                if (bp >= this.bufLen) {
                    this.f559buf = null;
                    return 0;
                }
                column = (this.f559buf[bp] == '\t' && expandTabs) ? ((column / 8) * 8) + 8 : column + 1;
            }
            int i = column + 1;
            this.f559buf = null;
            return i;
        } catch (Throwable th) {
            this.f559buf = null;
            throw th;
        }
    }

    public String getLine(int pos) {
        try {
            if (!findLine(pos)) {
                return null;
            }
            int lineEnd = this.lineStart;
            while (lineEnd < this.bufLen && this.f559buf[lineEnd] != '\r' && this.f559buf[lineEnd] != '\n') {
                lineEnd++;
            }
            if (lineEnd - this.lineStart == 0) {
                return null;
            }
            return new String(this.f559buf, this.lineStart, lineEnd - this.lineStart);
        } finally {
            this.f559buf = null;
        }
    }

    public Map<JCTree, Integer> getEndPosTable() {
        return this.endPosTable;
    }

    public void setEndPosTable(Map<JCTree, Integer> t) {
        Map<JCTree, Integer> map = this.endPosTable;
        if (map != null && map != t) {
            throw new IllegalStateException("endPosTable already set");
        }
        this.endPosTable = t;
    }

    protected boolean findLine(int pos) {
        if (pos == -1) {
            return false;
        }
        try {
            if (this.f559buf == null && this.refBuf != null) {
                this.f559buf = this.refBuf.get();
            }
            if (this.f559buf == null) {
                this.f559buf = initBuf(this.fileObject);
                this.lineStart = 0;
                this.line = 1;
            } else if (this.lineStart > pos) {
                this.lineStart = 0;
                this.line = 1;
            }
            int bp = this.lineStart;
            while (bp < this.bufLen && bp < pos) {
                int bp2 = bp + 1;
                char c = this.f559buf[bp];
                if (c == '\n') {
                    this.line++;
                    this.lineStart = bp2;
                } else if (c == '\r') {
                    if (bp2 < this.bufLen && this.f559buf[bp2] == '\n') {
                        bp2++;
                    }
                    this.line++;
                    this.lineStart = bp2;
                    bp = bp2;
                }
                bp = bp2;
            }
            return bp <= this.bufLen;
        } catch (IOException e) {
            this.f560log.directError("source.unavailable", new Object[0]);
            this.f559buf = new char[0];
            return false;
        }
    }

    protected char[] initBuf(JavaFileObject fileObject) throws IOException {
        char[] buf;
        CharSequence cs = fileObject.getCharContent(true);
        if (cs instanceof CharBuffer) {
            CharBuffer cb = (CharBuffer) cs;
            buf = JavacFileManager.toArray(cb);
            this.bufLen = cb.limit();
        } else {
            buf = cs.toString().toCharArray();
            this.bufLen = buf.length;
        }
        this.refBuf = new SoftReference<>(buf);
        return buf;
    }
}
