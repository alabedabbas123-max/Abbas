package com.a.b.a.e;

import com.a.b.g.ClassJ;

public final class ClassK extends ClassJ implements Interfaceb {
    public ClassK(int i) {
        super(i);
    }

    public Interfacea m4198a(int i) {
        return (Interfacea) m5477e(i);
    }

    @Override
    public Interfacea mo4185a(Interfacea interfaceC0966a) {
        int iD_ = m5476d_();
        for (int i = 0; i < iD_; i++) {
            if (m4198a(i) == interfaceC0966a) {
                String strMo3783g = interfaceC0966a.mo3783g();
                for (int i2 = i + 1; i2 < iD_; i2++) {
                    Interfacea interfaceC0966aM4198a = m4198a(i2);
                    if (interfaceC0966aM4198a.mo3783g().equals(strMo3783g)) {
                        return interfaceC0966aM4198a;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override
    public Interfacea mo4186a(String str) {
        int iD_ = m5476d_();
        for (int i = 0; i < iD_; i++) {
            Interfacea interfaceC0966aM4198a = m4198a(i);
            if (interfaceC0966aM4198a.mo3783g().equals(str)) {
                return interfaceC0966aM4198a;
            }
        }
        return null;
    }

    public void m4199a(int i, Interfacea interfaceC0966a) {
        m5474a(i, (Object) interfaceC0966a);
    }

    @Override
    public int mo4187b() {
        int iD_ = m5476d_();
        int iMo3765a = 2;
        for (int i = 0; i < iD_; i++) {
            iMo3765a += m4198a(i).mo3765a();
        }
        return iMo3765a;
    }
}
