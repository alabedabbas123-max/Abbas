package com.tencent.mm.util;

import java.io.DataInput;
import java.io.IOException;

public abstract class DataInputDelegate implements DataInput {
    protected final DataInput mDelegate;

    public DataInputDelegate(DataInput dataInput) {
        this.mDelegate = dataInput;
    }

    @Override
    public boolean readBoolean() throws IOException {
        return this.mDelegate.readBoolean();
    }

    @Override
    public byte readByte() throws IOException {
        return this.mDelegate.readByte();
    }

    @Override
    public char readChar() throws IOException {
        return this.mDelegate.readChar();
    }

    @Override
    public double readDouble() throws IOException {
        return this.mDelegate.readDouble();
    }

    @Override
    public float readFloat() throws IOException {
        return this.mDelegate.readFloat();
    }

    @Override
    public void readFully(byte[] bArr) throws IOException {
        this.mDelegate.readFully(bArr);
    }

    @Override
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.mDelegate.readFully(bArr, i, i2);
    }

    @Override
    public int readInt() throws IOException {
        return this.mDelegate.readInt();
    }

    @Override
    public String readLine() throws IOException {
        return this.mDelegate.readLine();
    }

    @Override
    public long readLong() throws IOException {
        return this.mDelegate.readLong();
    }

    @Override
    public short readShort() throws IOException {
        return this.mDelegate.readShort();
    }

    @Override
    public String readUTF() throws IOException {
        return this.mDelegate.readUTF();
    }

    @Override
    public int readUnsignedByte() throws IOException {
        return this.mDelegate.readUnsignedByte();
    }

    @Override
    public int readUnsignedShort() throws IOException {
        return this.mDelegate.readUnsignedShort();
    }

    @Override
    public int skipBytes(int i) throws IOException {
        return this.mDelegate.skipBytes(i);
    }
}
