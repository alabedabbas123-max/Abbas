package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import org.apache.commons.io.IOUtils;

public final class ad extends Abstractag {

    public static final ad f3127a = new ad("");

    private final String f3128b;

    private final ClassE f3129c;

    public ad(ClassE c1307e) {
        if (c1307e == null) {
            throw new NullPointerException("bytes == null");
        }
        this.f3129c = c1307e;
        this.f3128b = m4954a(c1307e).intern();
    }

    public ad(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f3128b = str.intern();
        this.f3129c = new ClassE(m4955a(str));
    }

    private static String m4953a(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + ClassK.m5487e(i) + " at offset " + ClassK.m5480a(i2));
    }

    public static String m4954a(ClassE c1307e) {
        int i;
        char c;
        int iM5436a = c1307e.m5436a();
        char[] cArr = new char[iM5436a];
        int i2 = 0;
        int i3 = 0;
        while (iM5436a > 0) {
            int iM5445e = c1307e.m5445e(i2);
            switch (iM5445e >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    iM5436a--;
                    if (iM5445e == 0) {
                        return m4953a(iM5445e, i2);
                    }
                    c = (char) iM5445e;
                    i2++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return m4953a(iM5445e, i2);
                case 12:
                case 13:
                    iM5436a -= 2;
                    if (iM5436a < 0) {
                        return m4953a(iM5445e, i2);
                    }
                    int iM5445e2 = c1307e.m5445e(i2 + 1);
                    if ((iM5445e2 & 192) != 128) {
                        return m4953a(iM5445e2, i2 + 1);
                    }
                    int i4 = ((iM5445e & 31) << 6) | (iM5445e2 & 63);
                    if (i4 != 0 && i4 < 128) {
                        return m4953a(iM5445e2, i2 + 1);
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                    break;
                case 14:
                    iM5436a -= 3;
                    if (iM5436a < 0) {
                        return m4953a(iM5445e, i2);
                    }
                    int iM5445e3 = c1307e.m5445e(i2 + 1);
                    if ((iM5445e3 & 192) != 128) {
                        return m4953a(iM5445e3, i2 + 1);
                    }
                    int iM5445e4 = c1307e.m5445e(i2 + 2);
                    if ((iM5445e3 & 192) == 128 && (i = ((iM5445e & 15) << 12) | ((iM5445e3 & 63) << 6) | (iM5445e4 & 63)) >= 2048) {
                        c = (char) i;
                        i2 += 3;
                        break;
                    }
                    return m4953a(iM5445e4, i2 + 2);
            }
            cArr[i3] = c;
            i3++;
        }
        return new String(cArr, 0, i3);
    }

    public static byte[] m4955a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3269t;
    }

    public String m4956a(int i) {
        String str;
        String strMo3828d = mo3828d();
        if (strMo3828d.length() <= i - 2) {
            str = "";
        } else {
            strMo3828d = strMo3828d.substring(0, i - 5);
            str = "...";
        }
        return String.valueOf('\"') + strMo3828d + str + '\"';
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        return this.f3128b.compareTo(((ad) abstractC1200a).f3128b);
    }

    @Override
    public String mo3828d() {
        int length = this.f3128b.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = this.f3128b.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
                sb.append(cCharAt);
            } else if (cCharAt <= 127) {
                switch (cCharAt) {
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case 11:
                    case '\f':
                    default:
                        char cCharAt2 = i < length + (-1) ? this.f3128b.charAt(i + 1) : (char) 0;
                        boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                        for (int i2 = 6; i2 >= 0; i2 -= 3) {
                            char c = (char) (((cCharAt >> i2) & 7) + 48);
                            if (c != '0' || z) {
                                sb.append(c);
                                z = true;
                            }
                        }
                        if (!z) {
                            sb.append('0');
                        }
                        break;
                    case '\r':
                        sb.append("\\r");
                        break;
                }
            } else {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            }
            i++;
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ad) {
            return this.f3128b.equals(((ad) obj).f3128b);
        }
        return false;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "utf8";
    }

    public int hashCode() {
        return this.f3128b.hashCode();
    }

    public String m4957i() {
        return String.valueOf('\"') + mo3828d() + '\"';
    }

    public String m4958j() {
        return this.f3128b;
    }

    public ClassE m4959k() {
        return this.f3129c;
    }

    public int m4960l() {
        return this.f3129c.m5436a();
    }

    public int m4961m() {
        return this.f3128b.length();
    }

    public String toString() {
        return "string{\"" + mo3828d() + "\"}";
    }
}
