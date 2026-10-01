package com.almlkaide.kaypro.android.dex.util;

public final class ByteArrayByteInput implements ByteInput {
    private final byte[] bytes;
    private int position;

    public ByteArrayByteInput(byte... bArr) {
        this.bytes = bArr;
    }

    @Override
    public byte readByte() {
        byte[] bArr = this.bytes;
        int i = this.position;
        this.position = i + 1;
        return bArr[i];
    }
}
