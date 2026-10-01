package com.sun.tools.javac.util;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByteBuffer {
    public byte[] elems;
    public int length;

    public ByteBuffer() {
        this(64);
    }

    public ByteBuffer(int initialSize) {
        this.elems = new byte[initialSize];
        this.length = 0;
    }

    private void copy(int size) {
        byte[] newelems = new byte[size];
        byte[] bArr = this.elems;
        System.arraycopy(bArr, 0, newelems, 0, bArr.length);
        this.elems = newelems;
    }

    public void appendByte(int b) {
        int i = this.length;
        byte[] bArr = this.elems;
        if (i >= bArr.length) {
            copy(bArr.length * 2);
        }
        byte[] bArr2 = this.elems;
        int i2 = this.length;
        this.length = i2 + 1;
        bArr2[i2] = (byte) b;
    }

    public void appendBytes(byte[] bs, int start, int len) {
        while (true) {
            int i = this.length;
            int i2 = i + len;
            byte[] bArr = this.elems;
            if (i2 <= bArr.length) {
                System.arraycopy(bs, start, bArr, i, len);
                this.length += len;
                return;
            }
            copy(bArr.length * 2);
        }
    }

    public void appendBytes(byte[] bs) {
        appendBytes(bs, 0, bs.length);
    }

    public void appendChar(int x) {
        while (true) {
            int i = this.length;
            int i2 = i + 1;
            byte[] bArr = this.elems;
            if (i2 < bArr.length) {
                bArr[i] = (byte) ((x >> 8) & 255);
                bArr[i + 1] = (byte) (x & 255);
                this.length = i + 2;
                return;
            }
            copy(bArr.length * 2);
        }
    }

    public void appendInt(int x) {
        while (true) {
            int i = this.length;
            int i2 = i + 3;
            byte[] bArr = this.elems;
            if (i2 < bArr.length) {
                bArr[i] = (byte) ((x >> 24) & 255);
                bArr[i + 1] = (byte) ((x >> 16) & 255);
                bArr[i + 2] = (byte) ((x >> 8) & 255);
                bArr[i + 3] = (byte) (x & 255);
                this.length = i + 4;
                return;
            }
            copy(bArr.length * 2);
        }
    }

    public void appendLong(long x) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(8);
        DataOutputStream bufout = new DataOutputStream(buffer);
        try {
            bufout.writeLong(x);
            appendBytes(buffer.toByteArray(), 0, 8);
        } catch (IOException e) {
            throw new AssertionError("write");
        }
    }

    public void appendFloat(float x) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(4);
        DataOutputStream bufout = new DataOutputStream(buffer);
        try {
            bufout.writeFloat(x);
            appendBytes(buffer.toByteArray(), 0, 4);
        } catch (IOException e) {
            throw new AssertionError("write");
        }
    }

    public void appendDouble(double x) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(8);
        DataOutputStream bufout = new DataOutputStream(buffer);
        try {
            bufout.writeDouble(x);
            appendBytes(buffer.toByteArray(), 0, 8);
        } catch (IOException e) {
            throw new AssertionError("write");
        }
    }

    public void appendName(Name name) {
        appendBytes(name.getByteArray(), name.getByteOffset(), name.getByteLength());
    }

    public void reset() {
        this.length = 0;
    }

    public Name toName(Names names) {
        return names.fromUtf(this.elems, 0, this.length);
    }
}
