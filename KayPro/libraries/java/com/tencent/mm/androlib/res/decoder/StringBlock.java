package com.tencent.mm.androlib.res.decoder;

import com.tencent.mm.androlib.AndrolibException;
import com.tencent.mm.util.ExtDataInput;
import com.tencent.mm.util.ExtDataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringBlock {
    private static final int CHUNK_NULL_TYPE = 0;
    private static final int CHUNK_STRINGPOOL_TYPE = 1835009;
    private static final Logger LOGGER;
    private static final byte NULL = 0;
    private static final CharsetDecoder UTF16LE_DECODER = Charset.forName("UTF-16LE").newDecoder();
    private static final CharsetDecoder UTF8_DECODER = Charset.forName("UTF-8").newDecoder();
    private static final int UTF8_FLAG = 256;
    private boolean m_isUTF8;
    private int[] m_stringOffsets;
    private int[] m_stringOwns;
    private byte[] m_strings;
    private int[] m_styleOffsets;
    private int[] m_styles;

    static {
        try {
            LOGGER = Logger.getLogger(Class.forName("com.tencent.mm.androlib.res.decoder.StringBlock").getName());
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    StringBlock() {
    }

    private String decodeString(int i, int i2) {
        String string = null;
        try {
            string = (this.m_isUTF8 ? UTF8_DECODER : UTF16LE_DECODER).decode(ByteBuffer.wrap(this.m_strings, i, i2)).toString();
            return string;
        } catch (CharacterCodingException e) {
            LOGGER.log(Level.WARNING, string, (Throwable) e);
            return string;
        }
    }

    private static final int getShort(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static final int getShort(int[] iArr, int i) {
        int i2 = iArr[i / 4];
        return (i % 4) / 2 == 0 ? i2 & 65535 : i2 >>> 16;
    }

    private static final int[] getUtf16(byte[] bArr, int i) {
        int i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        return (32768 & i2) != 0 ? new int[]{4, (((i2 & 32767) << 16) + ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255)) * 2} : new int[]{2, i2 * 2};
    }

    private static final int[] getUtf8(byte[] bArr, int i) {
        int i2;
        int i3 = (bArr[i] & 128) != 0 ? i + 2 : i + 1;
        byte b = bArr[i3];
        int i4 = i3 + 1;
        if ((b & 128) != 0) {
            i2 = (bArr[i4] & 255) + ((b & 127) << 8);
            i4++;
        } else {
            i2 = b;
        }
        return new int[]{i4, i2};
    }

    public static StringBlock read(ExtDataInput extDataInput) throws IOException {
        extDataInput.skipCheckChunkTypeInt(CHUNK_STRINGPOOL_TYPE, 0);
        int i = extDataInput.readInt();
        int i2 = extDataInput.readInt();
        int i3 = extDataInput.readInt();
        int i4 = extDataInput.readInt();
        int i5 = extDataInput.readInt();
        int i6 = extDataInput.readInt();
        StringBlock stringBlock = new StringBlock();
        stringBlock.m_isUTF8 = (i4 & 256) != 0;
        stringBlock.m_stringOffsets = extDataInput.readIntArray(i2);
        stringBlock.m_stringOwns = new int[i2];
        Arrays.fill(stringBlock.m_stringOwns, -1);
        if (i3 != 0) {
            stringBlock.m_styleOffsets = extDataInput.readIntArray(i3);
        }
        int i7 = (i6 == 0 ? i : i6) - i5;
        if (i7 % 4 != 0) {
            throw new IOException(new StringBuffer().append(new StringBuffer().append("String data size is not multiple of 4 (").append(i7).toString()).append(").").toString());
        }
        stringBlock.m_strings = new byte[i7];
        extDataInput.readFully(stringBlock.m_strings);
        if (i6 != 0) {
            int i8 = i - i6;
            if (i8 % 4 != 0) {
                throw new IOException(new StringBuffer().append(new StringBuffer().append("Style data size is not multiple of 4 (").append(i8).toString()).append(").").toString());
            }
            stringBlock.m_styles = extDataInput.readIntArray(i8 / 4);
        }
        return stringBlock;
    }

    public static void writeAll(ExtDataInput extDataInput, ExtDataOutput extDataOutput) throws IOException {
        extDataOutput.writeCheckChunkTypeInt(extDataInput, CHUNK_STRINGPOOL_TYPE, 0);
        int i = extDataInput.readInt();
        extDataOutput.writeInt(i);
        extDataOutput.writeBytes(extDataInput, i - 8);
    }

    private static final void writeShort(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static int writeSpecNameStringBlock(ExtDataInput extDataInput, ExtDataOutput extDataOutput, Map<String, Set<String>> map, Map<String, Integer> map2) throws AndrolibException, IOException {
        int i;
        int i2 = extDataInput.readInt();
        int i3 = extDataInput.readInt();
        int i4 = extDataInput.readInt();
        int i5 = extDataInput.readInt();
        if (i5 != 0) {
            throw new AndrolibException(String.format("writeSpecNameStringBlock styleOffsetCount != 0  styleOffsetCount %d", new Integer(i5)));
        }
        int i6 = extDataInput.readInt();
        boolean z = (i6 & 256) != 0;
        int i7 = extDataInput.readInt();
        int i8 = extDataInput.readInt();
        extDataInput.readIntArray(i4);
        int i9 = (i8 == 0 ? i3 : i8) - i7;
        if (i9 % 4 != 0) {
            throw new IOException(new StringBuffer().append(new StringBuffer().append("String data size is not multiple of 4 (").append(i9).toString()).append(").").toString());
        }
        extDataInput.readFully(new byte[i9]);
        extDataOutput.writeCheckInt(i2, CHUNK_STRINGPOOL_TYPE);
        int size = map.keySet().size();
        System.out.println(new StringBuffer().append("String pool size: ").append(size).toString());
        int i10 = (size * 4) + 24 + 4;
        int[] iArr = new int[size];
        byte[] bArr = new byte[i9 * 2];
        map2.clear();
        int i11 = 0;
        int i12 = 0;
        int length = i10;
        for (String str : map.keySet()) {
            iArr[i11] = i12;
            Iterator<String> it = map.get(str).iterator();
            while (it.hasNext()) {
                map2.put(it.next(), new Integer(i11));
            }
            if (z) {
                int i13 = i12 + 1;
                bArr[i12] = (byte) str.length();
                int i14 = i13 + 1;
                bArr[i13] = (byte) str.length();
                int i15 = length + 2;
                byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
                if (str.length() != bytes.length) {
                    throw new AndrolibException(String.format("writeSpecNameStringBlock %s UTF-8 length is different name %d, tempByte %d\n", str, new Integer(str.length()), new Integer(bytes.length)));
                }
                System.arraycopy(bytes, 0, bArr, i14, bytes.length);
                int length2 = i14 + str.length();
                i = length2 + 1;
                bArr[length2] = NULL;
                length = i15 + str.length() + 1;
            } else {
                writeShort(bArr, i12, (short) str.length());
                int i16 = i12 + 2;
                int i17 = length + 2;
                byte[] bytes2 = str.getBytes(Charset.forName("UTF-16LE"));
                if (str.length() * 2 != bytes2.length) {
                    throw new AndrolibException(String.format("writeSpecNameStringBlock %s UTF-16LE length is different name %d, tempByte %d\n", str, new Integer(str.length()), new Integer(bytes2.length)));
                }
                System.arraycopy(bytes2, 0, bArr, i16, bytes2.length);
                int length3 = bytes2.length + i16;
                int i18 = length3 + 1;
                bArr[length3] = NULL;
                i = i18 + 1;
                bArr[i18] = NULL;
                length = i17 + bytes2.length + 2;
            }
            i11++;
            i12 = i;
        }
        int i19 = length - i10;
        if (i19 % 4 != 0) {
            int i20 = 4 - (i19 % 4);
            int i21 = 0;
            while (i21 < i20) {
                bArr[i12] = NULL;
                length++;
                i21++;
                i12++;
            }
        }
        extDataOutput.writeInt(length);
        extDataOutput.writeInt(size);
        extDataOutput.writeInt(i5);
        extDataOutput.writeInt(i6);
        extDataOutput.writeInt(i10);
        extDataOutput.writeInt(i8);
        extDataOutput.writeIntArray(iArr);
        extDataOutput.write(bArr, 0, i12);
        return i3 - length;
    }

    public static int writeTableNameStringBlock(ExtDataInput extDataInput, ExtDataOutput extDataOutput, Map<Integer, String> map) throws AndrolibException, IOException {
        int i;
        int i2;
        int length;
        int i3;
        int length2;
        int i4 = extDataInput.readInt();
        int i5 = extDataInput.readInt();
        int i6 = extDataInput.readInt();
        int i7 = extDataInput.readInt();
        int i8 = extDataInput.readInt();
        int i9 = extDataInput.readInt();
        int i10 = extDataInput.readInt();
        StringBlock stringBlock = new StringBlock();
        stringBlock.m_isUTF8 = (i8 & 256) != 0;
        if (stringBlock.m_isUTF8) {
            System.out.printf("resources.arsc Character Encoding: utf-8\n", new Object[0]);
        } else {
            System.out.printf("resources.arsc Character Encoding: utf-16\n", new Object[0]);
        }
        stringBlock.m_stringOffsets = extDataInput.readIntArray(i6);
        stringBlock.m_stringOwns = new int[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            stringBlock.m_stringOwns[i11] = -1;
        }
        if (i7 != 0) {
            stringBlock.m_styleOffsets = extDataInput.readIntArray(i7);
        }
        int i12 = (i10 == 0 ? i5 : i10) - i9;
        if (i12 % 4 != 0) {
            throw new IOException(new StringBuffer().append(new StringBuffer().append("String data size is not multiple of 4 (").append(i12).toString()).append(").").toString());
        }
        stringBlock.m_strings = new byte[i12];
        extDataInput.readFully(stringBlock.m_strings);
        if (i10 != 0) {
            int i13 = i5 - i10;
            if (i13 % 4 != 0) {
                throw new IOException(new StringBuffer().append(new StringBuffer().append("Style data size is not multiple of 4 (").append(i13).toString()).append(").").toString());
            }
            stringBlock.m_styles = extDataInput.readIntArray(i13 / 4);
        }
        extDataOutput.writeCheckInt(i4, CHUNK_STRINGPOOL_TYPE);
        int i14 = (i6 * 4) + 24 + (i7 * 4) + 4;
        byte[] bArr = new byte[stringBlock.m_strings.length];
        int[] iArr = new int[i6];
        System.arraycopy(stringBlock.m_stringOffsets, 0, iArr, 0, iArr.length);
        int i15 = 0;
        int i16 = 0;
        int i17 = i14;
        while (i16 < i6) {
            iArr[i16] = i15;
            if (map.get(new Integer(i16)) == null) {
                int length3 = i16 == i6 + (-1) ? stringBlock.m_strings.length - stringBlock.m_stringOffsets[i16] : stringBlock.m_stringOffsets[i16 + 1] - stringBlock.m_stringOffsets[i16];
                System.arraycopy(stringBlock.m_strings, stringBlock.m_stringOffsets[i16], bArr, i15, length3);
                length2 = i17 + length3;
                i3 = i15 + length3;
            } else {
                String str = map.get(new Integer(i16));
                if (stringBlock.m_isUTF8) {
                    int i18 = i15 + 1;
                    bArr[i15] = (byte) str.length();
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) str.length();
                    int i20 = i17 + 2;
                    byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
                    if (str.length() != bytes.length) {
                        throw new AndrolibException(String.format("writeTableNameStringBlock UTF-8 length is different  name %d, tempByte %d\n", new Integer(str.length()), new Integer(bytes.length)));
                    }
                    System.arraycopy(bytes, 0, bArr, i19, bytes.length);
                    int length4 = i19 + str.length();
                    int i21 = length4 + 1;
                    bArr[length4] = NULL;
                    length2 = i20 + str.length() + 1;
                    i3 = i21;
                } else {
                    writeShort(bArr, i15, (short) str.length());
                    int i22 = i15 + 2;
                    int i23 = i17 + 2;
                    byte[] bytes2 = str.getBytes(Charset.forName("UTF-16LE"));
                    if (str.length() * 2 != bytes2.length) {
                        throw new AndrolibException(String.format("writeTableNameStringBlock UTF-16LE length is different  name %d, tempByte %d\n", new Integer(str.length()), new Integer(bytes2.length)));
                    }
                    System.arraycopy(bytes2, 0, bArr, i22, bytes2.length);
                    int length5 = bytes2.length + i22;
                    int i24 = length5 + 1;
                    bArr[length5] = NULL;
                    i3 = i24 + 1;
                    bArr[i24] = NULL;
                    length2 = bytes2.length + 2 + i23;
                }
            }
            i16++;
            i15 = i3;
            i17 = length2;
        }
        int i25 = i17 - i14;
        if (i25 % 4 != 0) {
            int i26 = 4 - (i25 % 4);
            int i27 = 0;
            int i28 = i15;
            i2 = i17;
            while (i27 < i26) {
                bArr[i28] = NULL;
                i2++;
                i27++;
                i28++;
            }
            i = i28;
        } else {
            i = i15;
            i2 = i17;
        }
        if (i10 != 0) {
            length = (stringBlock.m_styles.length * 4) + i2;
            i10 = i2;
        } else {
            length = i2;
        }
        extDataOutput.writeInt(length);
        extDataOutput.writeInt(i6);
        extDataOutput.writeInt(i7);
        extDataOutput.writeInt(i8);
        extDataOutput.writeInt(i14);
        extDataOutput.writeInt(i10);
        extDataOutput.writeIntArray(iArr);
        if (i10 != 0) {
            extDataOutput.writeIntArray(stringBlock.m_styleOffsets);
        }
        extDataOutput.write(bArr, 0, i);
        if (i10 != 0) {
            extDataOutput.writeIntArray(stringBlock.m_styles);
        }
        return i5 - length;
    }

    public int find(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i != this.m_stringOffsets.length; i++) {
            int i2 = this.m_stringOffsets[i];
            int i3 = getShort(this.m_strings, i2);
            if (i3 == str.length()) {
                int i4 = 0;
                while (i4 != i3) {
                    i2 += 2;
                    if (str.charAt(i4) != getShort(this.m_strings, i2)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == i3) {
                    return i;
                }
            }
        }
        return -1;
    }

    public CharSequence m7237get(int i) {
        return getString(i);
    }

    public int getCount() {
        if (this.m_stringOffsets != null) {
            return this.m_stringOffsets.length;
        }
        return 0;
    }

    public String getString(int i) {
        int i2;
        int i3;
        if (i < 0 || this.m_stringOffsets == null || i >= this.m_stringOffsets.length) {
            return (String) null;
        }
        int i4 = this.m_stringOffsets[i];
        if (this.m_isUTF8) {
            int[] utf8 = getUtf8(this.m_strings, i4);
            i2 = utf8[0];
            i3 = utf8[1];
        } else {
            int[] utf16 = getUtf16(this.m_strings, i4);
            i2 = utf16[0] + i4;
            i3 = utf16[1];
        }
        return decodeString(i2, i3);
    }
}
