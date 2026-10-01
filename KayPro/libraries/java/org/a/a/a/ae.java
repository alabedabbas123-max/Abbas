package org.a.a.a;

import java.util.Arrays;

public class ae implements Interfacead {

    private final String[] f5242c;

    private final String[] f5243d;

    private final String[] f5244e;

    private final int f5245f;

    private static final String[] f5241b = new String[0];

    public static final ae f5240a = new ae(f5241b, f5241b, f5241b);

    public ae(String[] strArr, String[] strArr2) {
        this(strArr, strArr2, null);
    }

    public ae(String[] strArr, String[] strArr2, String[] strArr3) {
        this.f5242c = strArr == null ? f5241b : strArr;
        this.f5243d = strArr2 == null ? f5241b : strArr2;
        this.f5244e = strArr3 == null ? f5241b : strArr3;
        this.f5245f = Math.max(this.f5244e.length, Math.max(this.f5242c.length, this.f5243d.length)) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public static Interfacead m7361a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return f5240a;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        String[] strArr3 = (String[]) Arrays.copyOf(strArr, strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                if (str.isEmpty()) {
                    strArr2[i] = null;
                    strArr3[i] = null;
                } else {
                    char cCharAt = str.charAt(0);
                    if (cCharAt == '\'') {
                        strArr3[i] = null;
                    } else if (Character.isUpperCase(cCharAt)) {
                        strArr2[i] = null;
                    } else {
                        strArr2[i] = null;
                        strArr3[i] = null;
                    }
                }
            }
        }
        return new ae(strArr2, strArr3, strArr);
    }

    @Override
    public String mo7358a(int i) {
        if (i < 0 || i >= this.f5242c.length) {
            return null;
        }
        return this.f5242c[i];
    }

    @Override
    public String mo7359b(int i) {
        if (i >= 0 && i < this.f5243d.length) {
            return this.f5243d[i];
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }

    @Override
    public String mo7360c(int i) {
        String str;
        if (i >= 0 && i < this.f5244e.length && (str = this.f5244e[i]) != null) {
            return str;
        }
        String strMo7358a = mo7358a(i);
        if (strMo7358a != null) {
            return strMo7358a;
        }
        String strMo7359b = mo7359b(i);
        return strMo7359b == null ? Integer.toString(i) : strMo7359b;
    }
}
