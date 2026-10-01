package com.a.b.e.b;

class ClassE implements Interfacel {

    private int f3061a = 0;

    private void m4830a(Abstractj abstractC1183j) {
        ClassU c1194uM4842h = abstractC1183j.m4842h();
        if (c1194uM4842h != null) {
            m4831a(c1194uM4842h);
        }
        ClassX c1197xM4844j = abstractC1183j.m4844j();
        int iD_ = c1197xM4844j.m5476d_();
        for (int i = 0; i < iD_; i++) {
            m4831a(c1197xM4844j.m4916b(i));
        }
    }

    private void m4831a(ClassU c1194u) {
        int iM4897j = c1194u.m4897j();
        if (iM4897j > this.f3061a) {
            this.f3061a = iM4897j;
        }
    }

    public int m4832a() {
        return this.f3061a;
    }

    @Override
    public void mo4301a(ae c1171ae) {
        m4830a((Abstractj) c1171ae);
    }

    @Override
    public void mo4302a(af c1172af) {
        m4830a((Abstractj) c1172af);
    }

    @Override
    public void mo4303a(ag c1173ag) {
        m4830a((Abstractj) c1173ag);
    }

    @Override
    public void mo4309a(ClassI c1182i) {
        m4830a((Abstractj) c1182i);
    }

    @Override
    public void mo4310a(ClassN c1187n) {
        m4830a((Abstractj) c1187n);
    }

    @Override
    public void mo4300a(ClassR c1191r) {
        m4830a((Abstractj) c1191r);
    }

    @Override
    public void mo4305a(ClassS c1192s) {
        m4830a((Abstractj) c1192s);
    }
}
