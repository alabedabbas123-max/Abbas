package com.almlkaide.kaypro.android.dx.io.instructions;

import java.io.EOFException;

public final class ShortArrayCodeInput extends BaseCodeCursor implements CodeInput {
    private final short[] array;

    public ShortArrayCodeInput(short[] sArr) {
        if (sArr == null) {
            throw new NullPointerException("array == null");
        }
        this.array = sArr;
    }

    @Override
    public boolean hasMore() {
        return cursor() < this.array.length;
    }

    @Override
    public int read() throws EOFException {
        try {
            short s = this.array[cursor()];
            advance(1);
            return s & 65535;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EOFException();
        }
    }

    @Override
    public int readInt() throws EOFException {
        return read() | (read() << 16);
    }

    @Override
    public long readLong() throws EOFException {
        return ((long) read()) | (((long) read()) << 16) | (((long) read()) << 32) | (((long) read()) << 48);
    }
}
