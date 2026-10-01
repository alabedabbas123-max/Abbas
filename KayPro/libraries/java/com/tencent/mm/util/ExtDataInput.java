package com.tencent.mm.util;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExtDataInput extends DataInputDelegate {
    public ExtDataInput(DataInput dataInput) {
        super(dataInput);
    }

    public ExtDataInput(InputStream inputStream) {
        this((DataInput) new DataInputStream(inputStream));
    }

    public int[] readIntArray(int i) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public String readNullEndedString(int i, boolean z) throws IOException {
        int i2;
        short s;
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            i2 = i - 1;
            if (i == 0 || (s = readShort()) == 0) {
                break;
            }
            sb.append((char) s);
            i = i2;
        }
        if (z) {
            skipBytes(i2 * 2);
        }
        return sb.toString();
    }

    public void skipCheckByte(byte b) throws IOException {
        byte b2 = readByte();
        if (b2 != b) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Byte(b), new Byte(b2)));
        }
    }

    public void skipCheckChunkTypeInt(int i, int i2) throws IOException {
        int i3 = readInt();
        if (i3 == i2) {
            skipCheckChunkTypeInt(i, -1);
        } else if (i3 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Integer(i), new Integer(i3)));
        }
    }

    public void skipCheckInt(int i) throws IOException {
        int i2 = readInt();
        if (i2 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Integer(i), new Integer(i2)));
        }
    }

    public void skipCheckShort(short s) throws IOException {
        short s2 = readShort();
        if (s2 != s) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", new Short(s), new Short(s2)));
        }
    }

    public void skipInt() throws IOException {
        skipBytes(4);
    }
}
