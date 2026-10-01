package com.caverock.androidsvg;

class IntegerParser {

    private int f4685pos;
    private long value;

    IntegerParser(long j, int i) {
        this.value = j;
        this.f4685pos = i;
    }

    static IntegerParser parseHex(String str, int i, int i2) {
        long j = 0;
        if (i >= i2) {
            return (IntegerParser) null;
        }
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= '0' && cCharAt <= '9') {
                j = (j * ((long) 16)) + ((long) (cCharAt - '0'));
            } else if (cCharAt >= 'A' && cCharAt <= 'F') {
                j = (j * ((long) 16)) + ((long) (cCharAt - 'A')) + ((long) 10);
            } else {
                if (cCharAt < 'a' || cCharAt > 'f') {
                    break;
                }
                j = (j * ((long) 16)) + ((long) (cCharAt - 'a')) + ((long) 10);
            }
            if (j > 4294967295L) {
                return (IntegerParser) null;
            }
            i3++;
        }
        return i3 == i ? (IntegerParser) null : new IntegerParser(j, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    static IntegerParser parseInt(String str, int i, int i2, boolean z) {
        boolean z2 = false;
        long j = 0;
        if (i >= i2) {
            return (IntegerParser) null;
        }
        if (z) {
            switch (str.charAt(i)) {
                case '+':
                    i++;
                    break;
                case '-':
                    z2 = true;
                    i++;
                    break;
            }
        }
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                return i3 == i ? (IntegerParser) null : new IntegerParser(j, i3);
            }
            if (z2) {
                j = (j * ((long) 10)) - ((long) (cCharAt - '0'));
                if (j < Integer.MIN_VALUE) {
                    return (IntegerParser) null;
                }
            } else {
                j = (j * ((long) 10)) + ((long) (cCharAt - '0'));
                if (j > Integer.MAX_VALUE) {
                    return (IntegerParser) null;
                }
            }
            i3++;
        }
        if (i3 == i) {
        }
    }

    int getEndPos() {
        return this.f4685pos;
    }

    public int value() {
        return (int) this.value;
    }
}
