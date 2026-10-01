package com.mindprod.ledatastream;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
        super(new DataOutputStream(outputStream));
    }

    public static byte[] toByteArray(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    @Override
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }

    @Override
    public void writeBoolean(boolean z) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z);
    }

    @Override
    public void writeByte(int i) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i);
    }

    @Override
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override
    public void writeChar(int i) throws IOException {
        writeShort(i);
    }

    @Override
    public void writeChars(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            writeChar(str.charAt(i));
        }
    }

    @Override
    public void writeDouble(double d) throws IOException {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override
    public void writeFloat(float f) throws IOException {
        writeInt(Float.floatToIntBits(f));
    }

    @Override
    public void writeInt(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i & 255);
        ((FilterOutputStream) this).out.write((i >> 8) & 255);
        ((FilterOutputStream) this).out.write((i >> 16) & 255);
        ((FilterOutputStream) this).out.write((i >> 24) & 255);
    }

    @Override
    public void writeLong(long j) throws IOException {
        byte[] byteArray = toByteArray(Long.reverseBytes(j));
        write(byteArray, 0, byteArray.length);
    }

    @Override
    public void writeShort(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i & 255);
        ((FilterOutputStream) this).out.write((i >> 8) & 255);
    }

    @Override
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
