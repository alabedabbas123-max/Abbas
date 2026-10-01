package org.objectweb.asm;

import org.apache.commons.io.FilenameUtils;

public class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;

    byte[] f6645a;

    int f6646b;

    TypePath(byte[] bArr, int i) {
        this.f6645a = bArr;
        this.f6646b = i;
    }

    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt == '[') {
                byteVector.m8897a(0, 0);
            } else if (cCharAt == '.') {
                byteVector.m8897a(1, 0);
            } else if (cCharAt == '*') {
                byteVector.m8897a(2, 0);
            } else if (cCharAt >= '0' && cCharAt <= '9') {
                int i3 = cCharAt - '0';
                while (i2 < length) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i3 = ((i3 * 10) + cCharAt2) - 48;
                    i2++;
                }
                if (i2 < length && str.charAt(i2) == ';') {
                    i2++;
                }
                byteVector.m8897a(3, i3);
            }
            i = i2;
        }
        byteVector.f6439a[0] = (byte) (byteVector.f6440b / 2);
        return new TypePath(byteVector.f6439a, 0);
    }

    public int getLength() {
        return this.f6645a[this.f6646b];
    }

    public int getStep(int i) {
        return this.f6645a[this.f6646b + (i * 2) + 1];
    }

    public int getStepArgument(int i) {
        return this.f6645a[this.f6646b + (i * 2) + 2];
    }

    public String toString() {
        int length = getLength();
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        for (int i = 0; i < length; i++) {
            switch (getStep(i)) {
                case 0:
                    stringBuffer.append('[');
                    break;
                case 1:
                    stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    break;
                case 2:
                    stringBuffer.append('*');
                    break;
                case 3:
                    stringBuffer.append(getStepArgument(i)).append(';');
                    break;
                default:
                    stringBuffer.append('_');
                    break;
            }
        }
        return stringBuffer.toString();
    }
}
