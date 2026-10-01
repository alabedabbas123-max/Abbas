package com.mindprod.ledatastream;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class LEDataInputStream implements DataInput {
    private static final String EMBEDDED_COPYRIGHT = "copyright (c) 1999-2010 Roedy Green, Canadian Mind Products, http://mindprod.com";

    protected final DataInputStream f4825dis;

    protected final InputStream f4826is;
    protected final byte[] work = new byte[8];

    public LEDataInputStream(InputStream inputStream) {
        this.f4826is = inputStream;
        this.f4825dis = new DataInputStream(inputStream);
    }

    public static String readUTF(DataInput dataInput) throws IOException {
        return DataInputStream.readUTF(dataInput);
    }

    public final void close() throws IOException {
        this.f4825dis.close();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f4826is.read(bArr, i, i2);
    }

    @Override
    public final boolean readBoolean() throws IOException {
        return this.f4825dis.readBoolean();
    }

    @Override
    public final byte readByte() throws IOException {
        return this.f4825dis.readByte();
    }

    @Override
    public final char readChar() throws IOException {
        this.f4825dis.readFully(this.work, 0, 2);
        return (char) (((this.work[1] & 255) << 8) | (this.work[0] & 255));
    }

    @Override
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override
    public final void readFully(byte[] bArr) throws IOException {
        this.f4825dis.readFully(bArr, 0, bArr.length);
    }

    @Override
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f4825dis.readFully(bArr, i, i2);
    }

    @Override
    public final int readInt() throws IOException {
        this.f4825dis.readFully(this.work, 0, 4);
        return (this.work[3] << 24) | ((this.work[2] & 255) << 16) | ((this.work[1] & 255) << 8) | (this.work[0] & 255);
    }

    @Override
    @Deprecated
    public final String readLine() throws IOException {
        return this.f4825dis.readLine();
    }

    @Override
    public final long readLong() throws IOException {
        this.f4825dis.readFully(this.work, 0, 8);
        return (((long) this.work[7]) << 56) | (((long) (this.work[6] & 255)) << 48) | (((long) (this.work[5] & 255)) << 40) | (((long) (this.work[4] & 255)) << 32) | (((long) (this.work[3] & 255)) << 24) | (((long) (this.work[2] & 255)) << 16) | (((long) (this.work[1] & 255)) << 8) | ((long) (this.work[0] & 255));
    }

    @Override
    public final short readShort() throws IOException {
        this.f4825dis.readFully(this.work, 0, 2);
        return (short) (((this.work[1] & 255) << 8) | (this.work[0] & 255));
    }

    @Override
    public final String readUTF() throws IOException {
        return this.f4825dis.readUTF();
    }

    @Override
    public final int readUnsignedByte() throws IOException {
        return this.f4825dis.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() throws IOException {
        this.f4825dis.readFully(this.work, 0, 2);
        return ((this.work[1] & 255) << 8) | (this.work[0] & 255);
    }

    @Override
    public final int skipBytes(int i) throws IOException {
        return this.f4825dis.skipBytes(i);
    }
}
