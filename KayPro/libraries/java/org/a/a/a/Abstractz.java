package org.a.a.a;

import java.io.IOException;

public abstract class Abstractz implements Interfacey {

    protected int f5367a;

    protected int f5368b;

    protected int f5369c;

    private int f5372f;

    private int f5373g;

    private String f5374h;

    private int f5375i;

    protected StringBuilder f5370d = new StringBuilder();

    private String f5376j = null;

    protected Interfaceab f5371e = ClassM.f5335a;

    private void m7484i() {
        int i = this.f5367a + 1;
        int i2 = this.f5369c;
        String strMo5790a = mo5790a();
        int length = strMo5790a.length();
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            int iCodePointAt = strMo5790a.codePointAt(i3);
            int iCharCount = Character.charCount(iCodePointAt);
            switch (iCodePointAt) {
                case 10:
                    if (z) {
                        z = false;
                    } else {
                        i++;
                        i2 = 0;
                    }
                    break;
                case 11:
                case 12:
                case 133:
                case 8232:
                case 8233:
                    i2 = 0;
                    i++;
                    z = false;
                    break;
                case 13:
                    z = true;
                    i++;
                    i2 = 0;
                    break;
                default:
                    i2 += iCharCount;
                    z = false;
                    break;
            }
        }
        this.f5372f = i;
        this.f5373g = i2 + 1;
    }

    public abstract String mo5790a();

    public abstract void mo5791a(int i);

    public void m7485a(String str) {
        this.f5374h = str;
    }

    public abstract int mo5793b();

    protected int m7486b(String str) {
        mo5791a(0);
        m7487c(1);
        return 0;
    }

    public abstract int mo5795c();

    public void m7487c(int i) {
        this.f5375i = i;
    }

    protected void m7488c(String str) {
        if (this.f5376j == null) {
            this.f5376j = str;
        }
    }

    public int m7489d() {
        return this.f5375i;
    }

    protected int m7490d(String str) {
        m7487c(1);
        return 0;
    }

    protected void m7491d(int i) {
        mo5791a(i);
        this.f5370d.setLength(0);
    }

    protected int m7492e(int i) {
        mo5791a(0);
        m7485a(this.f5370d.toString());
        return this.f5376j != null ? m7486b(this.f5376j) : i;
    }

    public String m7493e() {
        return this.f5374h == null ? mo5790a() : this.f5374h;
    }

    public Interfaceaa m7494f() {
        int iMo5795c;
        int iM7496h;
        this.f5374h = null;
        this.f5375i = 0;
        int iMo7468j = mo7468j();
        int iMo7469k = mo7469k();
        int iM7496h2 = m7496h();
        try {
            iMo5795c = mo5795c();
            m7484i();
            iM7496h = m7496h() - 1;
        } catch (IOException e) {
            iMo5795c = -1;
            iM7496h = iM7496h2 + 1;
        }
        return this.f5371e.mo7357b(ClassL.f5325a, iMo5795c, m7493e(), m7489d(), iM7496h2, iM7496h, iMo7468j, iMo7469k);
    }

    protected void m7495g() {
        m7487c(1);
    }

    public int m7496h() {
        return this.f5368b + mo5793b();
    }

    @Override
    public int mo7468j() {
        return this.f5372f;
    }

    @Override
    public int mo7469k() {
        return this.f5373g;
    }
}
