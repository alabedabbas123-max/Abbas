package org.c.a.a.c.a.a.a.c;

import com.almlkaide.kaypro.android.dex.DexFormat;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.c.ClassW;

public class ClassJ extends Abstracta {

    static final boolean f6066o;

    protected ClassW f6067k;

    protected ClassI f6068l;

    protected ClassI f6069m;

    protected Interfacel f6070n;

    static {
        f6066o = !ClassJ.class.desiredAssertionStatus();
    }

    public ClassJ(ClassW c2168w, int i, int i2, ClassI c2049i, String str) {
        super(i, i2, str, c2049i.mo8145d());
        this.f6067k = c2168w;
        if (this.f6047h != 0) {
            this.f6070n = c2049i;
        } else {
            this.f6069m = c2049i;
            this.f6068l = c2049i;
        }
    }

    public ClassJ(ClassW c2168w, int i, int i2, ClassI c2049i, String str, boolean z) {
        super(i, i2, str, c2049i.mo8145d(), z);
        this.f6067k = c2168w;
        if (this.f6047h != 0) {
            this.f6070n = c2049i;
        } else {
            this.f6069m = c2049i;
            this.f6068l = c2049i;
        }
    }

    public ClassJ(ClassW c2168w, int i, int i2, Interfacel interfaceC2052l) {
        super(i, i2, interfaceC2052l.mo8145d());
        this.f6067k = c2168w;
        if (this.f6047h != 0) {
            this.f6070n = interfaceC2052l;
            return;
        }
        ClassI c2049i = (ClassI) interfaceC2052l;
        this.f6069m = c2049i;
        this.f6068l = c2049i;
    }

    public ClassJ(ClassW c2168w, int i, int i2, Interfacel interfaceC2052l, String str) {
        super(i, i2, str, interfaceC2052l.mo8145d());
        this.f6067k = c2168w;
        if (this.f6047h != 0) {
            this.f6070n = interfaceC2052l;
            return;
        }
        ClassI c2049i = (ClassI) interfaceC2052l;
        this.f6069m = c2049i;
        this.f6068l = c2049i;
    }

    public ClassJ(ClassW c2168w, int i, int i2, ClassJ c2124j) {
        super(i, i2, c2124j.m8338h());
        this.f6067k = c2168w;
        this.f6069m = c2124j.f6069m;
        this.f6070n = c2124j.f6070n;
    }

    public void m8381a(ClassI c2049i) {
        this.f6047h = c2049i.mo8145d();
        if (this.f6047h != 0) {
            this.f6070n = c2049i;
        } else {
            this.f6069m = c2049i;
            this.f6068l = c2049i;
        }
    }

    @Override
    public void mo8368a(Interfacei interfaceC2123i) {
        interfaceC2123i.mo8379a(this);
    }

    @Override
    public boolean mo8325a(Interfacel interfaceC2052l) {
        if (interfaceC2052l == ClassI.f5843p || this.f6069m == ClassI.f5843p) {
            return true;
        }
        if (this.f6047h == interfaceC2052l.mo8145d()) {
            if (this.f6047h != 0) {
                return this.f6070n.equals(interfaceC2052l);
            }
            if (interfaceC2052l.mo8154l()) {
                return this.f6067k.m8637a(this.f6069m, (ClassI) interfaceC2052l);
            }
        }
        return false;
    }

    @Override
    public void mo8328b(Interfacel interfaceC2052l) {
        if (interfaceC2052l != ClassI.f5843p) {
            if (this.f6069m == ClassI.f5843p) {
                if (interfaceC2052l.mo8145d() != 0) {
                    this.f6047h = interfaceC2052l.mo8145d();
                    this.f6070n = interfaceC2052l;
                    return;
                } else {
                    if (interfaceC2052l.mo8154l()) {
                        ClassI c2049i = (ClassI) interfaceC2052l;
                        this.f6069m = c2049i;
                        this.f6068l = c2049i;
                        return;
                    }
                    return;
                }
            }
            if (this.f6047h == 0 && interfaceC2052l.mo8145d() == 0 && interfaceC2052l.mo8154l()) {
                ClassI c2049i2 = (ClassI) interfaceC2052l;
                if (this.f6069m.m8150g().equals(c2049i2.m8150g()) || this.f6067k.m8637a(c2049i2, this.f6069m)) {
                    if (this.f6069m.m8153k() == null) {
                        this.f6069m = c2049i2;
                    } else if (c2049i2.m8153k() == null) {
                        this.f6069m = c2049i2.mo8148a(this.f6069m.m8153k());
                    } else if (this.f6069m.m8153k().equals(c2049i2.m8153k())) {
                        this.f6069m = c2049i2;
                    }
                }
            }
        }
    }

    @Override
    public boolean mo8329b(Abstracta abstractC2115a) {
        if (abstractC2115a.getClass() == ClassJ.class) {
            if (this.f6069m == ClassI.f5843p) {
                return true;
            }
            if (this.f6047h == abstractC2115a.m8338h()) {
                ClassJ c2124j = (ClassJ) abstractC2115a;
                if (this.f6047h == 0) {
                    return c2124j.f6068l == null ? mo8325a((Interfacel) c2124j.f6069m) : mo8325a((Interfacel) c2124j.f6068l);
                }
                return this.f6070n.equals(c2124j.f6070n);
            }
        }
        return false;
    }

    @Override
    public void mo8330c(Interfacel interfaceC2052l) {
        if (this.f6047h == 0) {
            if (!interfaceC2052l.mo8154l()) {
                if (interfaceC2052l.mo8160m_() && this.f6069m == ClassI.f5843p) {
                    this.f6047h = interfaceC2052l.mo8145d();
                    if (this.f6047h > 0) {
                        this.f6070n = interfaceC2052l;
                        this.f6047h = interfaceC2052l.mo8145d();
                        return;
                    }
                    return;
                }
                return;
            }
            if (interfaceC2052l == ClassI.f5839l || interfaceC2052l == ClassI.f5843p) {
                return;
            }
            if (this.f6069m == ClassI.f5843p) {
                this.f6047h = interfaceC2052l.mo8145d();
                if (this.f6047h != 0) {
                    this.f6070n = interfaceC2052l;
                    return;
                } else {
                    this.f6068l = null;
                    this.f6069m = (ClassI) interfaceC2052l;
                    return;
                }
            }
            if (interfaceC2052l.equals(ClassI.f5839l)) {
                return;
            }
            if (!f6066o && (interfaceC2052l.mo8145d() != 0 || !interfaceC2052l.mo8154l())) {
                throw new AssertionError();
            }
            ClassI c2049i = (ClassI) interfaceC2052l;
            if (this.f6068l == null) {
                if (this.f6069m.m8153k() == null) {
                    this.f6068l = c2049i;
                    return;
                } else if (c2049i.m8153k() == null) {
                    this.f6068l = c2049i.mo8148a(this.f6069m.m8153k());
                    return;
                } else {
                    if (this.f6069m.m8153k().equals(c2049i.m8153k())) {
                        this.f6068l = c2049i;
                        return;
                    }
                    return;
                }
            }
            if (this.f6068l.m8150g().equals(c2049i.m8150g()) || !this.f6067k.m8637a(this.f6068l, c2049i)) {
                return;
            }
            if (this.f6068l.m8153k() == null) {
                this.f6068l = c2049i;
            } else if (c2049i.m8153k() == null) {
                this.f6068l = c2049i.mo8148a(this.f6068l.m8153k());
            } else if (this.f6068l.m8153k().equals(c2049i.m8153k())) {
                this.f6068l = c2049i;
            }
        }
    }

    @Override
    public void mo8331c(Abstracta abstractC2115a) {
        ClassI c2049i;
        if (abstractC2115a.getClass() != ClassJ.class || (c2049i = ((ClassJ) abstractC2115a).f6069m) == null || c2049i == ClassI.f5843p) {
            return;
        }
        ClassI c2049i2 = ((ClassJ) abstractC2115a).f6068l;
        if (c2049i2 == null) {
            c2049i2 = c2049i;
        }
        if (this.f6069m == ClassI.f5843p) {
            mo8328b(c2049i2);
        } else if (this.f6047h == 0 && this.f6047h == abstractC2115a.m8338h()) {
            mo8328b(c2049i2);
        }
    }

    @Override
    public void mo8334d(Abstracta abstractC2115a) {
        if (this.f6047h == 0 && abstractC2115a.getClass() == ClassJ.class) {
            ClassJ c2124j = (ClassJ) abstractC2115a;
            if (this.f6069m == ClassI.f5843p) {
                this.f6047h = c2124j.f6047h;
                this.f6068l = c2124j.f6068l;
                this.f6069m = c2124j.f6069m;
            } else {
                if (!f6066o && c2124j.m8338h() != 0) {
                    throw new AssertionError();
                }
                mo8330c(c2124j.f6069m);
            }
        }
    }

    @Override
    public Interfacel mo8370k() {
        return this.f6047h == 0 ? this.f6069m : this.f6070n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectLocalVariable{");
        if (this.f6047h == 0) {
            if (this.f6068l == null) {
                sb.append('?');
            } else if (this.f6068l.m8151i() == null) {
                sb.append(this.f6068l.m8152j());
            } else {
                sb.append(this.f6068l.m8151i());
            }
            if (!this.f6069m.equals(this.f6068l)) {
                sb.append(" ... ");
                sb.append(this.f6069m.m8151i() == null ? this.f6069m.m8152j() : this.f6069m.m8151i());
            }
        } else if (this.f6070n.mo8154l()) {
            sb.append(((ClassI) this.f6070n).m8150g());
            sb.append(new String(new char[this.f6047h]).replaceAll(DexFormat.MAGIC_SUFFIX, "[]"));
        } else {
            sb.append(((ClassK) this.f6070n).m8155b());
            sb.append(new String(new char[this.f6047h]).replaceAll(DexFormat.MAGIC_SUFFIX, "[]"));
        }
        sb.append(' ').append(this.f6046g).append(", index=").append(this.f6043d);
        if (this.f6041b != null) {
            sb.append(", next=").append(this.f6041b);
        }
        return sb.append("}").toString();
    }
}
