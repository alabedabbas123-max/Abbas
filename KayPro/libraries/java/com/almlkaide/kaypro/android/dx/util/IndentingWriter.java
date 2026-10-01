package com.almlkaide.kaypro.android.dx.util;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public final class IndentingWriter extends FilterWriter {
    private boolean collectingIndent;
    private int column;
    private int indent;
    private final int maxIndent;
    private final String prefix;
    private final int width;

    public IndentingWriter(Writer writer, int i, String str) {
        super(writer);
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        if (str == null) {
            throw new NullPointerException("prefix == null");
        }
        this.width = i != 0 ? i : Integer.MAX_VALUE;
        this.maxIndent = i >> 1;
        this.prefix = str.length() == 0 ? (String) null : str;
        m7229bol();
    }

    public IndentingWriter(Writer writer, int i) {
        this(writer, i, "");
    }

    @Override
    public void write(int i) throws IOException {
        synchronized (((Writer) this).lock) {
            if (this.collectingIndent) {
                if (i == 32) {
                    this.indent++;
                    if (this.indent >= this.maxIndent) {
                        this.indent = this.maxIndent;
                        this.collectingIndent = false;
                    }
                } else {
                    this.collectingIndent = false;
                }
            }
            if (this.column == this.width && i != 10) {
                ((FilterWriter) this).out.write(10);
                this.column = 0;
            }
            if (this.column == 0) {
                if (this.prefix != null) {
                    ((FilterWriter) this).out.write(this.prefix);
                }
                if (!this.collectingIndent) {
                    for (int i2 = 0; i2 < this.indent; i2++) {
                        ((FilterWriter) this).out.write(32);
                    }
                    this.column = this.indent;
                }
            }
            ((FilterWriter) this).out.write(i);
            if (i == 10) {
                m7229bol();
            } else {
                this.column++;
            }
        }
    }

    @Override
    public void write(char[] cArr, int i, int i2) throws IOException {
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                write(cArr[i]);
                i++;
                i2--;
            }
        }
    }

    @Override
    public void write(String str, int i, int i2) throws IOException {
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                write(str.charAt(i));
                i++;
                i2--;
            }
        }
    }

    private void m7229bol() {
        this.column = 0;
        this.collectingIndent = this.maxIndent != 0;
        this.indent = 0;
    }
}
