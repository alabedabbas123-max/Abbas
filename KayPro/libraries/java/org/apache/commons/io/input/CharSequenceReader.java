package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Serializable;

public class CharSequenceReader extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence charSequence;

    private int f5386idx;
    private int mark;

    public CharSequenceReader(String str) {
        this.charSequence = str == null ? "" : str;
    }

    @Override
    public void close() {
        this.f5386idx = 0;
        this.mark = 0;
    }

    @Override
    public void mark(int i) {
        this.mark = this.f5386idx;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() {
        if (this.f5386idx >= this.charSequence.length()) {
            return -1;
        }
        CharSequence charSequence = this.charSequence;
        int i = this.f5386idx;
        this.f5386idx = i + 1;
        return charSequence.charAt(i);
    }

    @Override
    public int read(char[] cArr, int i, int i2) {
        if (this.f5386idx >= this.charSequence.length()) {
            return -1;
        }
        if (cArr == null) {
            throw new NullPointerException("Character array is missing");
        }
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = read();
            if (i5 == -1) {
                return i3;
            }
            cArr[i + i4] = (char) i5;
            i3++;
        }
        return i3;
    }

    @Override
    public void reset() {
        this.f5386idx = this.mark;
    }

    @Override
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j);
        }
        if (this.f5386idx >= this.charSequence.length()) {
            return -1L;
        }
        int iMin = (int) Math.min(this.charSequence.length(), ((long) this.f5386idx) + j);
        int i = this.f5386idx;
        this.f5386idx = iMin;
        return iMin - i;
    }

    public String toString() {
        return this.charSequence.toString();
    }
}
