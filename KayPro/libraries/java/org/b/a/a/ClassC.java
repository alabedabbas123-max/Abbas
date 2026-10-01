package org.b.a.a;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.b.a.b.Interfacee;

public class ClassC {

    private String f5409a;

    private int f5410b;

    private long f5411c;

    private long f5412d;

    private long f5413e;

    private long f5414f;

    private byte f5415g;

    private String f5416h;

    private String f5417i;

    private String f5418j;

    private String f5419k;

    private String f5420l;

    private int f5421m;

    private int f5422n;

    private boolean f5423o;

    private long f5424p;

    private File f5425q;

    private ClassC() {
        this.f5417i = "ustar\u0000";
        this.f5418j = "00";
        this.f5409a = "";
        this.f5416h = "";
        String property = System.getProperty("user.name", "");
        property = property.length() > 31 ? property.substring(0, 31) : property;
        this.f5411c = 0L;
        this.f5412d = 0L;
        this.f5419k = property;
        this.f5420l = "";
        this.f5425q = null;
    }

    public ClassC(byte[] bArr, Interfacee interfaceC1813e) {
        this();
        m7518a(bArr, interfaceC1813e);
    }

    private int m7509a(byte[] bArr) {
        if (m7512a("ustar  ", bArr, 257, 6)) {
            return 2;
        }
        return m7512a("ustar\u0000", bArr, 257, 6) ? 3 : 0;
    }

    private static String m7510a(String str, boolean z) {
        int iIndexOf;
        String lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (lowerCase != null) {
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char cCharAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.indexOf("netware") > -1 && (iIndexOf = str.indexOf(58)) != -1) {
                str = str.substring(iIndexOf + 1);
            }
        }
        String strReplace = str.replace(File.separatorChar, '/');
        while (!z && strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        return strReplace;
    }

    private void m7511a(byte[] bArr, Interfacee interfaceC1813e, boolean z) {
        this.f5409a = z ? ClassE.m7553c(bArr, 0, 100) : ClassE.m7549a(bArr, 0, 100, interfaceC1813e);
        this.f5410b = (int) ClassE.m7551b(bArr, 100, 8);
        this.f5411c = (int) ClassE.m7551b(bArr, 108, 8);
        this.f5412d = (int) ClassE.m7551b(bArr, 116, 8);
        this.f5413e = ClassE.m7551b(bArr, 124, 12);
        this.f5414f = ClassE.m7551b(bArr, 136, 12);
        this.f5415g = bArr[156];
        this.f5416h = z ? ClassE.m7553c(bArr, 157, 100) : ClassE.m7549a(bArr, 157, 100, interfaceC1813e);
        this.f5417i = ClassE.m7553c(bArr, 257, 6);
        this.f5418j = ClassE.m7553c(bArr, 263, 2);
        this.f5419k = z ? ClassE.m7553c(bArr, 265, 32) : ClassE.m7549a(bArr, 265, 32, interfaceC1813e);
        this.f5420l = z ? ClassE.m7553c(bArr, 297, 32) : ClassE.m7549a(bArr, 297, 32, interfaceC1813e);
        this.f5421m = (int) ClassE.m7551b(bArr, 329, 8);
        this.f5422n = (int) ClassE.m7551b(bArr, 337, 8);
        switch (m7509a(bArr)) {
            case 2:
                this.f5423o = ClassE.m7550a(bArr, 482);
                this.f5424p = ClassE.m7546a(bArr, 483, 12);
                break;
            default:
                String strM7553c = z ? ClassE.m7553c(bArr, 345, 155) : ClassE.m7549a(bArr, 345, 155, interfaceC1813e);
                if (m7535j() && !this.f5409a.endsWith("/")) {
                    this.f5409a = String.valueOf(this.f5409a) + "/";
                }
                if (strM7553c.length() > 0) {
                    this.f5409a = String.valueOf(strM7553c) + "/" + this.f5409a;
                }
                break;
        }
    }

    private static boolean m7512a(String str, byte[] bArr, int i, int i2) {
        try {
            byte[] bytes = str.getBytes("ASCII");
            return m7513a(bytes, 0, bytes.length, bArr, i, i2, false);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m7513a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, boolean z) {
        int i5 = i2 < i4 ? i2 : i4;
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i + i6] != bArr2[i3 + i6]) {
                return false;
            }
        }
        if (i2 == i4) {
            return true;
        }
        if (!z) {
            return false;
        }
        if (i2 > i4) {
            while (i4 < i2) {
                if (bArr[i + i4] != 0) {
                    return false;
                }
                i4++;
            }
        } else {
            while (i2 < i4) {
                if (bArr2[i3 + i2] != 0) {
                    return false;
                }
                i2++;
            }
        }
        return true;
    }

    public String m7514a() {
        return this.f5409a.toString();
    }

    public void m7515a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + i);
        }
        this.f5421m = i;
    }

    public void m7516a(long j) {
        this.f5411c = j;
    }

    public void m7517a(String str) {
        this.f5409a = m7510a(str, false);
    }

    public void m7518a(byte[] bArr, Interfacee interfaceC1813e) {
        m7511a(bArr, interfaceC1813e, false);
    }

    public boolean m7519a(ClassC c1805c) {
        return c1805c != null && m7514a().equals(c1805c.m7514a());
    }

    public String m7520b() {
        return this.f5416h.toString();
    }

    public void m7521b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + i);
        }
        this.f5422n = i;
    }

    public void m7522b(long j) {
        this.f5412d = j;
    }

    public void m7523b(String str) {
        this.f5416h = str;
    }

    public int m7524c() {
        return this.f5410b;
    }

    public void m7525c(long j) {
        this.f5414f = j / 1000;
    }

    public void m7526c(String str) {
        this.f5419k = str;
    }

    public long m7527d() {
        return this.f5413e;
    }

    public void m7528d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Size is out of range: " + j);
        }
        this.f5413e = j;
    }

    public void m7529d(String str) {
        this.f5420l = str;
    }

    public boolean m7530e() {
        return this.f5423o;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m7519a((ClassC) obj);
    }

    public boolean m7531f() {
        return this.f5415g == 83;
    }

    public boolean m7532g() {
        return this.f5415g == 75;
    }

    public boolean m7533h() {
        return this.f5415g == 76;
    }

    public int hashCode() {
        return m7514a().hashCode();
    }

    public boolean m7534i() {
        return this.f5415g == 120 || this.f5415g == 88;
    }

    public boolean m7535j() {
        if (this.f5425q != null) {
            return this.f5425q.isDirectory();
        }
        return this.f5415g == 53 || m7514a().endsWith("/");
    }

    public boolean m7536k() {
        return this.f5415g == 50;
    }

    public boolean m7537l() {
        return this.f5415g == 49;
    }
}
