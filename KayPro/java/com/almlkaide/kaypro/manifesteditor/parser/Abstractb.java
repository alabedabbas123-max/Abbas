package com.almlkaide.kaypro.manifesteditor.parser;

import java.io.File;
import java.io.IOException;

public abstract class Abstractb {

    private int f3563c;

    private int f3564d;

    private int f3565e;

    private File f3567g;

    private int f3568h;

    private int f3569i;

    private boolean f3570j;

    protected StringBuffer f3561a = new StringBuffer();

    private String f3562b = null;

    private int f3566f = 0;

    private void m5713k() {
        int iM5726d = m5726d();
        int iM5728e = m5728e();
        String strM5732i = m5732i();
        int length = strM5732i.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            int iCodePointAt = strM5732i.codePointAt(i);
            int iCharCount = Character.charCount(iCodePointAt);
            switch (iCodePointAt) {
                case 10:
                    if (z) {
                        z = false;
                    } else {
                        iM5726d++;
                        iM5728e = 0;
                    }
                    break;
                case 11:
                case 12:
                case 133:
                case 8232:
                case 8233:
                    iM5728e = 0;
                    iM5726d++;
                    z = false;
                    break;
                case 13:
                    z = true;
                    iM5726d++;
                    iM5728e = 0;
                    break;
                default:
                    iM5728e += iCharCount;
                    z = false;
                    break;
            }
        }
        this.f3568h = iM5726d;
        this.f3569i = iM5728e + 1;
    }

    public ClassC m5714a() {
        ClassC c1345cM5715a;
        try {
            ClassC c1345cM5731h = m5731h();
            if (c1345cM5731h == null) {
                c1345cM5715a = m5715a(-1);
            } else {
                if (c1345cM5731h instanceof ClassA) {
                    ClassA c1343a = (ClassA) c1345cM5731h;
                    if (!this.f3570j) {
                        System.err.println(String.valueOf(m5719a(c1343a)) + " Error for input '" + c1343a.m5741e() + "': " + c1343a.m5712a());
                    }
                    this.f3566f++;
                }
                c1345cM5715a = c1345cM5731h;
            }
            m5713k();
            return c1345cM5715a;
        } catch (IOException e) {
            System.err.println("shouldn't happen: " + e.getMessage());
            return m5715a(-1);
        }
    }

    protected ClassC m5715a(int i) {
        return m5716a(i, m5732i());
    }

    protected ClassC m5716a(int i, String str) {
        ClassC c1345c = new ClassC(i, str);
        c1345c.m5740d(m5730g());
        c1345c.m5738c((m5730g() + m5733j()) - 1);
        c1345c.m5734a(m5726d());
        c1345c.m5736b(m5728e());
        return c1345c;
    }

    protected ClassC m5717a(String str) {
        return m5718a(str, m5732i());
    }

    protected ClassC m5718a(String str, String str2) {
        ClassA c1343a = new ClassA(str, str2);
        c1343a.m5740d(m5730g());
        c1343a.m5738c((m5730g() + m5733j()) - 1);
        c1343a.m5734a(m5726d());
        c1343a.m5736b(m5728e());
        return c1343a;
    }

    public String m5719a(ClassA c1343a) {
        return String.valueOf(m5729f()) + "[" + c1343a.m5735b() + "," + c1343a.m5737c() + "]";
    }

    public int m5720b() {
        return this.f3569i;
    }

    protected void m5721b(int i) {
        m5727d(i);
        this.f3561a.setLength(0);
        this.f3563c = m5726d();
        this.f3564d = m5728e();
        this.f3565e = m5730g();
        this.f3562b = null;
    }

    protected void m5722b(String str) {
        if (this.f3562b == null) {
            this.f3562b = str;
        }
    }

    public int m5723c() {
        return this.f3568h;
    }

    protected ClassC m5724c(int i) {
        m5727d(0);
        if (this.f3562b != null) {
            return m5725c(this.f3562b);
        }
        ClassC c1345c = new ClassC(i, this.f3561a.toString());
        c1345c.m5740d(this.f3565e);
        c1345c.m5738c((m5730g() + m5733j()) - 1);
        c1345c.m5734a(this.f3563c);
        c1345c.m5736b(this.f3564d);
        return c1345c;
    }

    protected ClassC m5725c(String str) {
        m5727d(0);
        ClassA c1343a = new ClassA(str, this.f3561a.toString());
        c1343a.m5740d(this.f3565e);
        c1343a.m5738c((m5730g() + m5733j()) - 1);
        c1343a.m5734a(this.f3563c);
        c1343a.m5736b(this.f3564d);
        return c1343a;
    }

    public abstract int m5726d();

    public abstract void m5727d(int i);

    public abstract int m5728e();

    public String m5729f() {
        return this.f3567g == null ? "" : this.f3567g.getPath();
    }

    public abstract int m5730g();

    public abstract ClassC m5731h();

    public abstract String m5732i();

    public abstract int m5733j();
}
