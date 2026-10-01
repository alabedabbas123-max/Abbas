package com.github.megatronking.stringfog;

public final class Base64 {
    private static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    private static final int URL_SAFE = 8;

    static abstract class Coder {

        int f4779op;
        byte[] output;

        protected abstract int maxOutputSize(int i);

        protected abstract boolean process(byte[] bArr, int i, int i2, boolean z);
    }

    private static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        Decoder(int i, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override
        public int maxOutputSize(int i) {
            return ((i * 3) / 4) + 10;
        }

        @Override
        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            if (this.state == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.state;
            int i6 = this.value;
            int i7 = 0;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i8 = i;
            while (true) {
                if (i8 < i4) {
                    if (i5 == 0) {
                        while (i8 + 4 <= i4 && (i6 = (iArr[bArr[i8] & 255] << 18) | (iArr[bArr[i8 + 1] & 255] << 12) | (iArr[bArr[i8 + 2] & 255] << 6) | iArr[bArr[i8 + 3] & 255]) >= 0) {
                            bArr2[i7 + 2] = (byte) i6;
                            bArr2[i7 + 1] = (byte) (i6 >> 8);
                            bArr2[i7] = (byte) (i6 >> 16);
                            i7 += 3;
                            i8 += 4;
                        }
                        if (i8 >= i4) {
                            i3 = i6;
                        }
                    }
                    i8++;
                    int i9 = iArr[bArr[i8] & 255];
                    switch (i5) {
                        case 0:
                            if (i9 >= 0) {
                                i5++;
                                i6 = i9;
                            } else if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        case 1:
                            if (i9 >= 0) {
                                i6 = (i6 << 6) | i9;
                                i5++;
                            } else if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        case 2:
                            if (i9 >= 0) {
                                i6 = (i6 << 6) | i9;
                                i5++;
                            } else if (i9 == -2) {
                                bArr2[i7] = (byte) (i6 >> 4);
                                i5 = 4;
                                i7++;
                            } else if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        case 3:
                            if (i9 >= 0) {
                                i6 = (i6 << 6) | i9;
                                bArr2[i7 + 2] = (byte) i6;
                                bArr2[i7 + 1] = (byte) (i6 >> 8);
                                bArr2[i7] = (byte) (i6 >> 16);
                                i7 += 3;
                                i5 = 0;
                            } else if (i9 == -2) {
                                bArr2[i7 + 1] = (byte) (i6 >> 2);
                                bArr2[i7] = (byte) (i6 >> 10);
                                i7 += 2;
                                i5 = 5;
                            } else if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        case 4:
                            if (i9 == -2) {
                                i5++;
                            } else if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        case 5:
                            if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                    }
                } else {
                    i3 = i6;
                }
            }
            if (!z) {
                this.state = i5;
                this.value = i3;
                this.f4779op = i7;
                return true;
            }
            switch (i5) {
                case 1:
                    this.state = 6;
                    return false;
                case 2:
                    bArr2[i7] = (byte) (i3 >> 4);
                    i7++;
                    break;
                case 3:
                    int i10 = i7 + 1;
                    bArr2[i7] = (byte) (i3 >> 10);
                    i7 = i10 + 1;
                    bArr2[i10] = (byte) (i3 >> 2);
                    break;
                case 4:
                    this.state = 6;
                    return false;
            }
            this.state = i5;
            this.f4779op = i7;
            return true;
        }
    }

    private static class Encoder extends Coder {
        private static final byte[] ENCODE = {(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        private static final byte[] ENCODE_WEBSAFE = {(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        final boolean do_cr;
        final boolean do_newline;
        final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        Encoder(int i, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i & 1) == 0;
            this.do_newline = (i & 2) == 0;
            this.do_cr = (i & 4) != 0;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = this.do_newline ? 19 : -1;
        }

        @Override
        public int maxOutputSize(int i) {
            return ((i * 8) / 5) + 10;
        }

        @Override
        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            int i4;
            int i5;
            int i6;
            byte b;
            int i7;
            byte b2;
            int i8;
            byte b3;
            int i9;
            int i10;
            int i11;
            byte[] bArr2 = this.alphabet;
            byte[] bArr3 = this.output;
            int i12 = this.count;
            int i13 = i2 + i;
            int i14 = -1;
            switch (this.tailLen) {
                case 0:
                    i3 = i;
                    break;
                case 1:
                    if (i + 2 <= i13) {
                        int i15 = i + 1;
                        int i16 = ((this.tail[0] & 255) << 16) | ((bArr[i] & 255) << 8);
                        i = i15 + 1;
                        i14 = i16 | (bArr[i15] & 255);
                        this.tailLen = 0;
                    }
                    i3 = i;
                    break;
                case 2:
                    if (i + 1 <= i13) {
                        i14 = ((this.tail[0] & 255) << 16) | ((this.tail[1] & 255) << 8) | (bArr[i] & 255);
                        this.tailLen = 0;
                        i++;
                    }
                    i3 = i;
                    break;
                default:
                    i3 = i;
                    break;
            }
            if (i14 != -1) {
                bArr3[0] = bArr2[(i14 >> 18) & 63];
                bArr3[1] = bArr2[(i14 >> 12) & 63];
                bArr3[2] = bArr2[(i14 >> 6) & 63];
                i5 = 4;
                bArr3[3] = bArr2[i14 & 63];
                i4 = i12 - 1;
                if (i4 == 0) {
                    if (this.do_cr) {
                        i11 = 5;
                        bArr3[4] = (byte) 13;
                    } else {
                        i11 = 4;
                    }
                    i5 = i11 + 1;
                    bArr3[i11] = (byte) 10;
                    i4 = 19;
                }
            } else {
                i4 = i12;
                i5 = 0;
            }
            int i17 = i3;
            while (true) {
                int i18 = i4;
                int i19 = i5;
                if (i17 + 3 > i13) {
                    if (z) {
                        if (i17 - this.tailLen == i13 - 1) {
                            if (this.tailLen > 0) {
                                i9 = 1;
                                b3 = this.tail[0];
                            } else {
                                int i20 = i17 + 1;
                                b3 = bArr[i17];
                                i9 = 0;
                            }
                            int i21 = (b3 & 255) << 4;
                            this.tailLen -= i9;
                            int i22 = i19 + 1;
                            bArr3[i19] = bArr2[(i21 >> 6) & 63];
                            int i23 = i22 + 1;
                            bArr3[i22] = bArr2[i21 & 63];
                            if (this.do_padding) {
                                int i24 = i23 + 1;
                                bArr3[i23] = (byte) 61;
                                i23 = i24 + 1;
                                bArr3[i24] = (byte) 61;
                            }
                            if (this.do_newline) {
                                if (this.do_cr) {
                                    bArr3[i23] = (byte) 13;
                                    i23++;
                                }
                                bArr3[i23] = (byte) 10;
                                i23++;
                            }
                            i19 = i23;
                        } else if (i17 - this.tailLen == i13 - 2) {
                            if (this.tailLen > 1) {
                                i7 = 1;
                                b = this.tail[0];
                            } else {
                                b = bArr[i17];
                                i7 = 0;
                                i17++;
                            }
                            int i25 = (b & 255) << 10;
                            if (this.tailLen > 0) {
                                b2 = this.tail[i7];
                                i7++;
                            } else {
                                int i26 = i17 + 1;
                                b2 = bArr[i17];
                            }
                            int i27 = ((b2 & 255) << 2) | i25;
                            this.tailLen -= i7;
                            int i28 = i19 + 1;
                            bArr3[i19] = bArr2[(i27 >> 12) & 63];
                            int i29 = i28 + 1;
                            bArr3[i28] = bArr2[(i27 >> 6) & 63];
                            int i30 = i29 + 1;
                            bArr3[i29] = bArr2[i27 & 63];
                            if (this.do_padding) {
                                i8 = i30 + 1;
                                bArr3[i30] = (byte) 61;
                            } else {
                                i8 = i30;
                            }
                            if (this.do_newline) {
                                if (this.do_cr) {
                                    bArr3[i8] = (byte) 13;
                                    i8++;
                                }
                                bArr3[i8] = (byte) 10;
                                i8++;
                            }
                            i19 = i8;
                        } else if (this.do_newline && i19 > 0 && i18 != 19) {
                            if (this.do_cr) {
                                i6 = i19 + 1;
                                bArr3[i19] = (byte) 13;
                            } else {
                                i6 = i19;
                            }
                            i19 = i6 + 1;
                            bArr3[i6] = (byte) 10;
                        }
                    } else if (i17 == i13 - 1) {
                        byte[] bArr4 = this.tail;
                        int i31 = this.tailLen;
                        this.tailLen = i31 + 1;
                        bArr4[i31] = bArr[i17];
                    } else if (i17 == i13 - 2) {
                        byte[] bArr5 = this.tail;
                        int i32 = this.tailLen;
                        this.tailLen = i32 + 1;
                        bArr5[i32] = bArr[i17];
                        byte[] bArr6 = this.tail;
                        int i33 = this.tailLen;
                        this.tailLen = i33 + 1;
                        bArr6[i33] = bArr[i17 + 1];
                    }
                    this.f4779op = i19;
                    this.count = i18;
                    return true;
                }
                int i34 = ((bArr[i17] & 255) << 16) | ((bArr[i17 + 1] & 255) << 8) | (bArr[i17 + 2] & 255);
                bArr3[i19] = bArr2[(i34 >> 18) & 63];
                bArr3[i19 + 1] = bArr2[(i34 >> 12) & 63];
                bArr3[i19 + 2] = bArr2[(i34 >> 6) & 63];
                bArr3[i19 + 3] = bArr2[i34 & 63];
                i17 += 3;
                i5 = i19 + 4;
                i4 = i18 - 1;
                if (i4 == 0) {
                    if (this.do_cr) {
                        i10 = i5 + 1;
                        bArr3[i5] = (byte) 13;
                    } else {
                        i10 = i5;
                    }
                    i5 = i10 + 1;
                    bArr3[i10] = (byte) 10;
                    i4 = 19;
                }
            }
        }
    }

    Base64() {
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    private static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        Decoder decoder = new Decoder(i3, new byte[(i2 * 3) / 4]);
        if (!decoder.process(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (decoder.f4779op == decoder.output.length) {
            return decoder.output;
        }
        byte[] bArr2 = new byte[decoder.f4779op];
        System.arraycopy(decoder.output, 0, bArr2, 0, decoder.f4779op);
        return bArr2;
    }

    public static byte[] encode(String str, int i) {
        return encode(str.getBytes(), i);
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    private static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        Encoder encoder = new Encoder(i3, (byte[]) null);
        int i4 = (i2 / 3) * 4;
        if (!encoder.do_padding) {
            switch (i2 % 3) {
                case 1:
                    i4 += 2;
                    break;
                case 2:
                    i4 += 3;
                    break;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (encoder.do_newline && i2 > 0) {
            i4 += (encoder.do_cr ? 2 : 1) * (((i2 - 1) / 57) + 1);
        }
        encoder.output = new byte[i4];
        encoder.process(bArr, i, i2, true);
        return encoder.output;
    }
}
