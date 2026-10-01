package sun.reflect;

import com.sun.tools.javac.jvm.ByteCodes;

class UTF8 {
    UTF8() {
    }

    static byte[] encode(String str) {
        int len = str.length();
        byte[] res = new byte[utf8Length(str)];
        int utf8Idx = 0;
        for (int i = 0; i < len; i++) {
            try {
                int c = str.charAt(i) & 65535;
                if (c >= 1 && c <= 127) {
                    int utf8Idx2 = utf8Idx + 1;
                    try {
                        res[utf8Idx] = (byte) c;
                        utf8Idx = utf8Idx2;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new InternalError("Bug in sun.reflect bootstrap UTF-8 encoder");
                    }
                } else {
                    if (c == 0 || (c >= 128 && c <= 2047)) {
                        int utf8Idx3 = utf8Idx + 1;
                        res[utf8Idx] = (byte) ((c >> 6) + ByteCodes.checkcast);
                        utf8Idx = utf8Idx3 + 1;
                        res[utf8Idx3] = (byte) ((c & 63) + 128);
                    } else {
                        int utf8Idx4 = utf8Idx + 1;
                        try {
                            res[utf8Idx] = (byte) ((c >> 12) + 224);
                            int utf8Idx5 = utf8Idx4 + 1;
                            res[utf8Idx4] = (byte) (((c >> 6) & 63) + 128);
                            int utf8Idx6 = utf8Idx5 + 1;
                            res[utf8Idx5] = (byte) ((c & 63) + 128);
                            utf8Idx = utf8Idx6;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new InternalError("Bug in sun.reflect bootstrap UTF-8 encoder");
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
            }
        }
        return res;
    }

    private static int utf8Length(String str) {
        int len = str.length();
        int utf8Len = 0;
        for (int i = 0; i < len; i++) {
            int c = str.charAt(i) & 65535;
            if (c >= 1 && c <= 127) {
                utf8Len++;
            } else if (c == 0 || (c >= 128 && c <= 2047)) {
                utf8Len += 2;
            } else {
                utf8Len += 3;
            }
        }
        return utf8Len;
    }
}
