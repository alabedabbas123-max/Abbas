package a.b;

import a.b.a.d.i;
import a.b.b.a.f;
import a.b.c;
import a.b.g.aq;
import a.b.g.s;

public class ClassE implements c {

    public int f158a;

    public String f159b;

    public String f160c;

    public String[] f161d;

    public ClassF[] f162e;

    public ClassH[] f163f;

    public c f164g;

    public c[] f165h;

    public c[] f166i;

    public Object f167j;

    public int m399a() {
        return this.f158a;
    }

    public Interfaced m400a(String str, String str2) {
        for (int i = 0; i < this.f162e.length; i++) {
            ClassF c0069f = this.f162e[i];
            if (c0069f != null && ((str == null || c0069f.mo946a((c) this).equals(str)) && (str2 == null || c0069f.mo949b(this).equals(str2)))) {
                return c0069f;
            }
        }
        return null;
    }

    public String m401a(int i) {
        return this.f161d[i];
    }

    public void m402a(int i, f fVar) {
    }

    public void m403a(i iVar) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store attributes");
    }

    public void m404a(f fVar) {
    }

    public void m405a(c cVar) {
        if (this.f166i == null) {
            this.f166i = new c[1];
        } else {
            c[] cVarArr = new c[this.f166i.length + 1];
            System.arraycopy(this.f166i, 0, cVarArr, 0, this.f166i.length);
            this.f166i = cVarArr;
        }
        this.f166i[this.f166i.length - 1] = cVar;
    }

    public void m406a(aq aqVar) {
        for (int i = 0; i < this.f162e.length; i++) {
            ClassF c0069f = this.f162e[i];
            if (c0069f != null) {
                c0069f.mo947a((c) this, aqVar);
            }
        }
    }

    public void m407a(s sVar) {
        sVar.a(this);
    }

    public void m408a(Object obj) {
        this.f167j = obj;
    }

    public void m409a(String str, String str2, aq aqVar) {
        Interfacej interfaceC0162jM414b = m414b(str, str2);
        if (interfaceC0162jM414b != null) {
            interfaceC0162jM414b.mo947a(this, aqVar);
        }
    }

    public void m410a(boolean z, boolean z2, boolean z3, boolean z4, s sVar) {
        if (z) {
            m407a(sVar);
        }
        if (z2 && this.f164g != null) {
            this.f164g.a(true, true, z3, false, sVar);
        }
        if (z3) {
            if (!z2 && this.f164g != null) {
                this.f164g.a(false, false, true, false, sVar);
            }
            if (this.f165h != null) {
                for (int i = 0; i < this.f165h.length; i++) {
                    c cVar = this.f165h[i];
                    if (cVar != null) {
                        cVar.a(true, false, true, false, sVar);
                    }
                }
            }
        }
        if (!z4 || this.f166i == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f166i.length; i2++) {
            this.f166i[i2].a(true, false, false, true, sVar);
        }
    }

    public boolean m411a(Interfacej interfaceC0162j) {
        return (this.f158a & 16) == 0 && (interfaceC0162j == null || ((interfaceC0162j.mo945a() & 26) == 0 && !interfaceC0162j.mo946a(this).equals("<init>")));
    }

    public boolean m412a(String str) {
        if (m415b().equals(str)) {
            return true;
        }
        return this.f164g != null && this.f164g.a(str);
    }

    public int m413b(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public Interfacej m414b(String str, String str2) {
        for (int i = 0; i < this.f163f.length; i++) {
            ClassH c0160h = this.f163f[i];
            if (c0160h != null && ((str == null || c0160h.mo946a((c) this).equals(str)) && (str2 == null || c0160h.mo949b(this).equals(str2)))) {
                return c0160h;
            }
        }
        return null;
    }

    public String m415b() {
        return this.f159b;
    }

    public void m416b(f fVar) {
    }

    public void m417b(aq aqVar) {
        for (int i = 0; i < this.f163f.length; i++) {
            ClassH c0160h = this.f163f[i];
            if (c0160h != null) {
                c0160h.mo947a((c) this, aqVar);
            }
        }
    }

    public void m418b(s sVar) {
        if (this.f164g != null) {
            this.f164g.a(sVar);
        }
    }

    public void m419b(String str, String str2, aq aqVar) {
        Interfaced interfaceC0041dM400a = m400a(str, str2);
        if (interfaceC0041dM400a != null) {
            interfaceC0041dM400a.mo947a(this, aqVar);
        }
    }

    public boolean m420b(c cVar) {
        if (equals(cVar)) {
            return true;
        }
        return this.f164g != null && this.f164g.b(cVar);
    }

    public String m421c() {
        return this.f160c;
    }

    public String m422c(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public void m423c(f fVar) {
    }

    public void m424c(s sVar) {
        if (this.f165h != null) {
            for (int i = 0; i < this.f165h.length; i++) {
                c cVar = this.f165h[i];
                if (cVar != null) {
                    cVar.a(sVar);
                }
            }
        }
    }

    public boolean m425c(c cVar) {
        if (equals(cVar)) {
            return true;
        }
        if (this.f164g != null && this.f164g.c(cVar)) {
            return true;
        }
        if (this.f165h == null) {
            return false;
        }
        for (int i = 0; i < this.f165h.length; i++) {
            c cVar2 = this.f165h[i];
            if (cVar2 != null && cVar2.c(cVar)) {
                return true;
            }
        }
        return false;
    }

    public int m426d() {
        return this.f165h.length;
    }

    public String m427d(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public void m428d(s sVar) {
        if (this.f166i != null) {
            for (int i = 0; i < this.f166i.length; i++) {
                this.f166i[i].a(sVar);
            }
        }
    }

    public c m429e() {
        return this.f164g;
    }

    public String m430e(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public Object m431f() {
        return this.f167j;
    }

    public String m432f(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public String m433g(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public String m434h(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public String m435i(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public String m436j(int i) {
        throw new UnsupportedOperationException("Library class [" + this.f159b + "] doesn't store constant pool");
    }

    public c m437k(int i) {
        return this.f165h[i];
    }

    public String toString() {
        return "LibraryClass(" + m415b() + ")";
    }
}
