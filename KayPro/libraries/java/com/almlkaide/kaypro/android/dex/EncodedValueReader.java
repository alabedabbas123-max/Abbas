package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.ByteInput;
import com.almlkaide.kaypro.android.dx.io.Opcodes;

public final class EncodedValueReader {
    public static final int ENCODED_ANNOTATION = 29;
    public static final int ENCODED_ARRAY = 28;
    public static final int ENCODED_BOOLEAN = 31;
    public static final int ENCODED_BYTE = 0;
    public static final int ENCODED_CHAR = 3;
    public static final int ENCODED_DOUBLE = 17;
    public static final int ENCODED_ENUM = 27;
    public static final int ENCODED_FIELD = 25;
    public static final int ENCODED_FLOAT = 16;
    public static final int ENCODED_INT = 4;
    public static final int ENCODED_LONG = 6;
    public static final int ENCODED_METHOD = 26;
    public static final int ENCODED_METHOD_HANDLE = 22;
    public static final int ENCODED_METHOD_TYPE = 21;
    public static final int ENCODED_NULL = 30;
    public static final int ENCODED_SHORT = 2;
    public static final int ENCODED_STRING = 23;
    public static final int ENCODED_TYPE = 24;
    private static final int MUST_READ = -1;
    private int annotationType;

    private int f4974arg;

    protected final ByteInput f4975in;
    private int type;

    public EncodedValueReader(ByteInput byteInput) {
        this.type = -1;
        this.f4975in = byteInput;
    }

    public EncodedValueReader(EncodedValue encodedValue) {
        this(encodedValue.asByteInput());
    }

    public EncodedValueReader(ByteInput byteInput, int i) {
        this.type = -1;
        this.f4975in = byteInput;
        this.type = i;
    }

    public EncodedValueReader(EncodedValue encodedValue, int i) {
        this(encodedValue.asByteInput(), i);
    }

    public int peek() {
        if (this.type == -1) {
            int i = this.f4975in.readByte() & 255;
            this.type = i & 31;
            this.f4974arg = (i & Opcodes.SHL_INT_LIT8) >> 5;
        }
        return this.type;
    }

    public int readArray() {
        checkType(28);
        this.type = -1;
        return Leb128.readUnsignedLeb128(this.f4975in);
    }

    public int readAnnotation() {
        checkType(29);
        this.type = -1;
        this.annotationType = Leb128.readUnsignedLeb128(this.f4975in);
        return Leb128.readUnsignedLeb128(this.f4975in);
    }

    public int getAnnotationType() {
        return this.annotationType;
    }

    public int readAnnotationName() {
        return Leb128.readUnsignedLeb128(this.f4975in);
    }

    public byte readByte() {
        checkType(0);
        this.type = -1;
        return (byte) EncodedValueCodec.readSignedInt(this.f4975in, this.f4974arg);
    }

    public short readShort() {
        checkType(2);
        this.type = -1;
        return (short) EncodedValueCodec.readSignedInt(this.f4975in, this.f4974arg);
    }

    public char readChar() {
        checkType(3);
        this.type = -1;
        return (char) EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readInt() {
        checkType(4);
        this.type = -1;
        return EncodedValueCodec.readSignedInt(this.f4975in, this.f4974arg);
    }

    public long readLong() {
        checkType(6);
        this.type = -1;
        return EncodedValueCodec.readSignedLong(this.f4975in, this.f4974arg);
    }

    public float readFloat() {
        checkType(16);
        this.type = -1;
        return Float.intBitsToFloat(EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, true));
    }

    public double readDouble() {
        checkType(17);
        this.type = -1;
        return Double.longBitsToDouble(EncodedValueCodec.readUnsignedLong(this.f4975in, this.f4974arg, true));
    }

    public int readMethodType() {
        checkType(21);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readMethodHandle() {
        checkType(22);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readString() {
        checkType(23);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readType() {
        checkType(24);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readField() {
        checkType(25);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readEnum() {
        checkType(27);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public int readMethod() {
        checkType(26);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.f4975in, this.f4974arg, false);
    }

    public void readNull() {
        checkType(30);
        this.type = -1;
    }

    public boolean readBoolean() {
        checkType(31);
        this.type = -1;
        return this.f4974arg != 0;
    }

    public void skipValue() {
        int i = 0;
        switch (peek()) {
            case 0:
                readByte();
                return;
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            default:
                throw new DexException(new StringBuffer().append("Unexpected type: ").append(Integer.toHexString(this.type)).toString());
            case 2:
                readShort();
                return;
            case 3:
                readChar();
                return;
            case 4:
                readInt();
                return;
            case 6:
                readLong();
                return;
            case 16:
                readFloat();
                return;
            case 17:
                readDouble();
                return;
            case 21:
                readMethodType();
                return;
            case 22:
                readMethodHandle();
                return;
            case 23:
                readString();
                return;
            case 24:
                readType();
                return;
            case 25:
                readField();
                return;
            case 26:
                readMethod();
                return;
            case 27:
                readEnum();
                return;
            case 28:
                int array = readArray();
                while (i < array) {
                    skipValue();
                    i++;
                }
                return;
            case 29:
                int annotation = readAnnotation();
                while (i < annotation) {
                    readAnnotationName();
                    skipValue();
                    i++;
                }
                return;
            case 30:
                readNull();
                return;
            case 31:
                readBoolean();
                return;
        }
    }

    private void checkType(int i) {
        if (peek() != i) {
            throw new IllegalStateException(String.format("Expected %x but was %x", new Integer(i), new Integer(peek())));
        }
    }
}
