package com.almlkaide.kaypro.android.dx.io.instructions;

public final class ShortArrayCodeOutput extends BaseCodeCursor implements CodeOutput {
    private final short[] array;

    public ShortArrayCodeOutput(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maxSize < 0");
        }
        this.array = new short[i];
    }

    public short[] getArray() {
        int iCursor = cursor();
        if (iCursor == this.array.length) {
            return this.array;
        }
        short[] sArr = new short[iCursor];
        System.arraycopy(this.array, 0, sArr, 0, iCursor);
        return sArr;
    }

    @Override
    public void write(short s) {
        this.array[cursor()] = s;
        advance(1);
    }

    @Override
    public void write(short s, short s2) {
        write(s);
        write(s2);
    }

    @Override
    public void write(short s, short s2, short s3) {
        write(s);
        write(s2);
        write(s3);
    }

    @Override
    public void write(short s, short s2, short s3, short s4) {
        write(s);
        write(s2);
        write(s3);
        write(s4);
    }

    @Override
    public void write(short s, short s2, short s3, short s4, short s5) {
        write(s);
        write(s2);
        write(s3);
        write(s4);
        write(s5);
    }

    @Override
    public void writeInt(int i) {
        write((short) i);
        write((short) (i >> 16));
    }

    @Override
    public void writeLong(long j) {
        write((short) j);
        write((short) (j >> 16));
        write((short) (j >> 32));
        write((short) (j >> 48));
    }

    @Override
    public void write(byte[] bArr) {
        boolean z = true;
        int i = 0;
        for (byte b : bArr) {
            if (z) {
                i = b & 255;
                z = false;
            } else {
                i |= b << 8;
                write((short) i);
                z = true;
            }
        }
        if (z) {
            return;
        }
        write((short) i);
    }

    @Override
    public void write(short[] sArr) {
        for (short s : sArr) {
            write(s);
        }
    }

    @Override
    public void write(int[] iArr) {
        for (int i : iArr) {
            writeInt(i);
        }
    }

    @Override
    public void write(long[] jArr) {
        for (long j : jArr) {
            writeLong(j);
        }
    }
}
