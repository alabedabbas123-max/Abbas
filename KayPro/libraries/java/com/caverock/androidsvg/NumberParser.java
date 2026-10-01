package com.caverock.androidsvg;

class NumberParser {

    private int f4686pos;
    private static final float[] positivePowersOf10 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    private static final float[] negativePowersOf10 = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    int getEndPos() {
        return this.f4686pos;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4  */
    float parseNumber(String str, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        char cCharAt;
        boolean z3;
        char cCharAt2;
        boolean z4;
        long j = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        this.f4686pos = i;
        if (this.f4686pos >= i2) {
            return Float.NaN;
        }
        switch (str.charAt(this.f4686pos)) {
            case '+':
                z = false;
                this.f4686pos++;
                z2 = z;
                break;
            case ',':
                z2 = false;
                break;
            case '-':
                z = true;
                this.f4686pos++;
                z2 = z;
                break;
            default:
                z2 = false;
                break;
        }
        int i7 = this.f4686pos;
        int i8 = 0;
        while (this.f4686pos < i2) {
            char cCharAt3 = str.charAt(this.f4686pos);
            if (cCharAt3 == '0') {
                if (i4 == 0) {
                    i5++;
                    z4 = z5;
                } else {
                    i6++;
                    z4 = z5;
                }
            } else if (cCharAt3 >= '1' && cCharAt3 <= '9') {
                int i9 = i6;
                while (i9 > 0) {
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j *= (long) 10;
                    i9--;
                }
                if (j > 922337203685477580L) {
                    return Float.NaN;
                }
                j = (j * ((long) 10)) + ((long) (cCharAt3 - '0'));
                i4 = i4 + i6 + 1;
                if (j < 0) {
                    return Float.NaN;
                }
                z4 = z5;
                i6 = i9;
            } else {
                if (cCharAt3 != '.' || z5) {
                    if (!z5 && this.f4686pos == i8 + 1) {
                        return Float.NaN;
                    }
                    if (i4 == 0) {
                        if (i5 == 0) {
                            return Float.NaN;
                        }
                        i4 = 1;
                    }
                    if (z5) {
                        i6 = (i8 - i5) - i4;
                    }
                    if (this.f4686pos < i2 || !((cCharAt = str.charAt(this.f4686pos)) == 'E' || cCharAt == 'e')) {
                        i3 = i6;
                    } else {
                        boolean z6 = false;
                        boolean z7 = false;
                        this.f4686pos++;
                        if (this.f4686pos == i2) {
                            return Float.NaN;
                        }
                        switch (str.charAt(this.f4686pos)) {
                            case '+':
                                this.f4686pos++;
                                z3 = z6;
                                break;
                            case ',':
                            case '.':
                            case '/':
                            default:
                                this.f4686pos--;
                                z3 = false;
                                z7 = true;
                                break;
                            case '-':
                                z6 = true;
                                this.f4686pos++;
                                z3 = z6;
                                break;
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                break;
                        }
                        if (z7) {
                            i3 = i6;
                        } else {
                            int i10 = this.f4686pos;
                            int i11 = 0;
                            while (this.f4686pos < i2 && (cCharAt2 = str.charAt(this.f4686pos)) >= '0' && cCharAt2 <= '9') {
                                if (i11 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i11 = (i11 * 10) + (cCharAt2 - '0');
                                this.f4686pos++;
                            }
                            if (this.f4686pos == i10) {
                                return Float.NaN;
                            }
                            i3 = z3 ? i6 - i11 : i6 + i11;
                        }
                    }
                    if (i3 + i4 <= 39 || i3 + i4 < -44) {
                        return Float.NaN;
                    }
                    float f = j;
                    if (j != 0) {
                        if (i3 > 0) {
                            f *= positivePowersOf10[i3];
                        } else if (i3 < 0) {
                            if (i3 < -38) {
                                f = (float) (((double) f) * 1.0E-20d);
                                i3 += 20;
                            }
                            f *= negativePowersOf10[-i3];
                        }
                    }
                    return z2 ? -f : f;
                }
                i8 = this.f4686pos - i7;
                z4 = true;
            }
            this.f4686pos++;
            z5 = z4;
        }
        if (!z5) {
        }
        if (i4 == 0) {
            if (i5 == 0) {
                return Float.NaN;
            }
            i4 = 1;
        }
        if (z5) {
            i6 = (i8 - i5) - i4;
        }
        if (this.f4686pos < i2) {
            i3 = i6;
        } else {
            i3 = i6;
        }
        if (i3 + i4 <= 39) {
        }
        return Float.NaN;
    }
}
