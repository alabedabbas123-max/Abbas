package com.tencent.mm.util;

import java.io.DataOutput;
import java.io.IOException;

public class ExtDataOutput extends DataOutputDelegate {
    public ExtDataOutput(DataOutput dataOutput) {
        super(dataOutput);
    }

    public void writeBytes(ExtDataInput extDataInput, int i) throws IOException {
        byte[] bArr = new byte[i];
        extDataInput.readFully(bArr);
        write(bArr);
    }

    public void writeCheckByte(byte b, byte b2) throws IOException {
        writeByte(b);
        if (b != b2) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Byte(b2), new Byte(b)));
        }
    }

    public void writeCheckChunkTypeInt(ExtDataInput extDataInput, int i, int i2) throws IOException {
        int i3 = extDataInput.readInt();
        writeInt(i3);
        if (i3 == i2) {
            writeCheckChunkTypeInt(extDataInput, i, -1);
        } else if (i3 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Integer(i), new Integer(i3)));
        }
    }

    public void writeCheckInt(int i, int i2) throws IOException {
        writeInt(i);
        if (i != i2) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Integer(i2), new Integer(i)));
        }
    }

    public void writeCheckShort(short s, short s2) throws IOException {
        writeShort(s);
        if (s != s2) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Short(s2), new Short(s)));
        }
    }

    public void writeIntArray(int[] iArr) throws IOException {
        for (int i : iArr) {
            writeInt(i);
        }
    }
}
