package com.tencent.mm.util;

import java.io.DataOutput;
import java.io.IOException;

public class DataOutputDelegate implements DataOutput {
    protected final DataOutput mDelegate;

    public DataOutputDelegate(DataOutput dataOutput) {
        this.mDelegate = dataOutput;
    }

    @Override
    public void write(int i) throws IOException {
        this.mDelegate.write(i);
    }

    @Override
    public void write(byte[] bArr) throws IOException {
        this.mDelegate.write(bArr);
    }

    @Override
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.mDelegate.write(bArr, i, i2);
    }

    @Override
    public void writeBoolean(boolean z) throws IOException {
        this.mDelegate.writeBoolean(z);
    }

    @Override
    public void writeByte(int i) throws IOException {
        this.mDelegate.writeByte(i);
    }

    @Override
    public void writeBytes(String str) throws IOException {
        this.mDelegate.writeBytes(str);
    }

    @Override
    public void writeChar(int i) throws IOException {
        this.mDelegate.writeChar(i);
    }

    @Override
    public void writeChars(String str) throws IOException {
        this.mDelegate.writeChars(str);
    }

    @Override
    public void writeDouble(double d) throws IOException {
        this.mDelegate.writeDouble(d);
    }

    @Override
    public void writeFloat(float f) throws IOException {
        this.mDelegate.writeFloat(f);
    }

    @Override
    public void writeInt(int i) throws IOException {
        this.mDelegate.writeInt(i);
    }

    @Override
    public void writeLong(long j) throws IOException {
        this.mDelegate.writeLong(j);
    }

    @Override
    public void writeShort(int i) throws IOException {
        this.mDelegate.writeShort(i);
    }

    @Override
    public void writeUTF(String str) throws IOException {
        this.mDelegate.writeUTF(str);
    }
}
