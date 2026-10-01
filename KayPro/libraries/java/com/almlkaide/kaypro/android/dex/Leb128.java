package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.ByteInput;
import com.almlkaide.kaypro.android.dex.util.ByteOutput;

public final class Leb128 {
    Leb128() {
    }

    public static int unsignedLeb128Size(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    public static int readSignedLeb128(ByteInput byteInput) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        do {
            i = byteInput.readByte() & 255;
            i2 = ((i & 127) << (i4 * 7)) | i2;
            i3 <<= 7;
            i4++;
            if ((i & 128) != 128) {
                break;
            }
        } while (i4 < 5);
        if ((i & 128) == 128) {
            throw new DexException("invalid LEB128 sequence");
        }
        if (((i3 >> 1) & i2) != 0) {
            return i2 | i3;
        }
        return i2;
    }

    public static int readUnsignedLeb128(ByteInput byteInput) {
        int i;
        int i2 = 0;
        int i3 = 0;
        do {
            i = byteInput.readByte() & 255;
            i2 = ((i & 127) << (i3 * 7)) | i2;
            i3++;
            if ((i & 128) != 128) {
                break;
            }
        } while (i3 < 5);
        if ((i & 128) == 128) {
            throw new DexException("invalid LEB128 sequence");
        }
        return i2;
    }

    public static void writeUnsignedLeb128(ByteOutput byteOutput, int i) {
        for (int i2 = i >>> 7; i2 != 0; i2 >>>= 7) {
            byteOutput.writeByte((byte) ((i & 127) | 128));
            i = i2;
        }
        byteOutput.writeByte((byte) (i & 127));
    }

    public static void writeSignedLeb128(ByteOutput byteOutput, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = i2;
        while (z) {
            z = (i4 == i3 && (i4 & 1) == ((i >> 6) & 1)) ? false : true;
            byteOutput.writeByte((byte) ((z ? 128 : 0) | (i & 127)));
            i = i4;
            i4 >>= 7;
        }
    }
}
