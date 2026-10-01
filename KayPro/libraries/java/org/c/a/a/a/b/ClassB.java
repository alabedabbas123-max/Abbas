package org.c.a.a.a.b;

import org.apache.commons.io.IOUtils;

public class ClassB implements Interfacea {

    protected StringBuilder f5456a = new StringBuilder(10240);

    protected boolean f5457b = true;

    protected boolean f5458c = false;

    protected int f5459d = 0;

    protected int f5460e = 0;

    protected int f5461f;

    @Override
    public void mo7562a() {
    }

    @Override
    public void mo7563a(int i) {
        for (int i2 = 0; i2 < this.f5461f; i2++) {
            this.f5456a.append("  ");
        }
    }

    @Override
    public void mo7564a(int i, int i2, int i3) {
        this.f5456a.setLength(0);
        this.f5459d = i2;
        this.f5460e = i3;
        this.f5461f = 0;
    }

    @Override
    public void mo7565a(int i, String str, String str2, String str3) {
        m7577d(str2);
    }

    @Override
    public void mo7566a(int i, String str, String str2, String str3, String str4) {
        m7577d(str2);
    }

    @Override
    public void mo7567a(String str) {
        m7577d(str);
    }

    @Override
    public void mo7568a(String str, String str2) {
        m7577d(str);
    }

    @Override
    public void mo7569b() {
        this.f5461f++;
    }

    @Override
    public void mo7570b(int i) {
        if (!this.f5458c) {
            return;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            this.f5456a.append(IOUtils.LINE_SEPARATOR_UNIX);
            i = i2;
        }
    }

    @Override
    public void mo7571b(String str) {
        m7577d(str);
    }

    @Override
    public void mo7572c() {
        if (this.f5461f > 0) {
            this.f5461f--;
        }
    }

    @Override
    public void mo7573c(int i) {
    }

    @Override
    public void mo7574c(String str) {
        this.f5456a.append(str);
    }

    @Override
    public void mo7575d() {
        this.f5456a.append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    @Override
    public void mo7576d(int i) {
    }

    protected void m7577d(String str) {
        if (!this.f5457b || str == null) {
            this.f5456a.append(str);
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                this.f5456a.append(cCharAt);
            } else if (cCharAt < ' ') {
                this.f5456a.append("\\0");
                this.f5456a.append((char) ((cCharAt >> 3) + 48));
                this.f5456a.append((char) ((cCharAt & 7) + 48));
            } else if (cCharAt > 127) {
                this.f5456a.append("\\u");
                int i2 = cCharAt >> '\f';
                this.f5456a.append((char) (i2 <= 9 ? i2 + 48 : i2 + 55));
                int i3 = (cCharAt >> '\b') & 15;
                this.f5456a.append((char) (i3 <= 9 ? i3 + 48 : i3 + 55));
                int i4 = (cCharAt >> 4) & 15;
                this.f5456a.append((char) (i4 <= 9 ? i4 + 48 : i4 + 55));
                int i5 = cCharAt & 15;
                this.f5456a.append((char) (i5 <= 9 ? i5 + 48 : i5 + 55));
            } else {
                this.f5456a.append(cCharAt);
            }
        }
    }

    public StringBuilder m7578e() {
        return this.f5456a;
    }
}
