package com.a.b.a.b;

import com.a.b.e.b.ClassO;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ab;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassQ;
import com.a.b.e.c.ClassR;
import com.a.b.e.c.ClassY;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;
import java.util.ArrayList;

class an implements Interfacen {

    final am f1841a;

    private final Interfacex f1842b;

    private ClassQ f1843c = null;

    private int f1844d;

    public an(am c0926am) {
        this.f1841a = c0926am;
        this.f1842b = c0926am.f1835b;
    }

    private void m3927a(ClassC c1236c) {
        ClassC c1236cM5041b = this.f1842b.mo3793a().m5041b();
        if (ClassY.m4080b(c1236cM5041b, c1236c)) {
            return;
        }
        this.f1841a.m3919a("return type mismatch: prototype indicates " + c1236cM5041b.mo3828d() + ", but encountered type " + c1236c.mo3828d());
    }

    @Override
    public int mo3928a() {
        return this.f1844d;
    }

    @Override
    public void mo3929a(int i) {
        this.f1844d = i;
    }

    @Override
    public void mo3930a(int i, int i2, int i3) {
        throw new al("invalid opcode " + ClassK.m5487e(i));
    }

    @Override
    public void mo3931a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3255f);
                break;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
                this.f1842b.mo3801a(this.f1843c, ClassC.f3255f, ClassC.f3255f);
                break;
            case 165:
            case 166:
                this.f1842b.mo3801a(this.f1843c, ClassC.f3267r, ClassC.f3267r);
                break;
            case 167:
            case 168:
            case 200:
            case 201:
                this.f1842b.mo3809b();
                break;
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            default:
                mo3930a(i, i2, i3);
                return;
            case 198:
            case 199:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3267r);
                break;
        }
        this.f1842b.mo3810b(i4);
        this.f1842b.mo3895a(this.f1843c, i2, i);
    }

    @Override
    public void mo3932a(int i, int i2, int i3, int i4, ClassC c1236c, int i5) {
        ClassU c0949u;
        ClassC c1236c2;
        ClassU c0949uM4051a = this.f1841a.f1838e.m4051a(i == 54 ? i2 + i3 : i2, i4);
        if (c0949uM4051a != null) {
            ClassC c1236cM4061b = c0949uM4051a.m4061b();
            if (c1236cM4061b.mo3829e() != c1236c.mo3829e()) {
                c1236c2 = c1236c;
                c0949u = null;
            } else {
                c0949u = c0949uM4051a;
                c1236c2 = c1236cM4061b;
            }
        } else {
            c0949u = c0949uM4051a;
            c1236c2 = c1236c;
        }
        switch (i) {
            case 21:
            case 169:
                this.f1842b.mo3811b(this.f1843c, i4);
                this.f1842b.mo3807a(c0949u != null);
                this.f1842b.mo3804a(c1236c);
                break;
            case 54:
                ClassO c1188oM4058a = c0949u == null ? null : c0949u.m4058a();
                this.f1842b.mo3800a(this.f1843c, c1236c);
                this.f1842b.mo3804a(c1236c);
                this.f1842b.mo3795a(i4, c1236c2, c1188oM4058a);
                break;
            case 132:
                ClassO c1188oM4058a2 = c0949u != null ? c0949u.m4058a() : null;
                this.f1842b.mo3811b(this.f1843c, i4);
                this.f1842b.mo3795a(i4, c1236c2, c1188oM4058a2);
                this.f1842b.mo3804a(c1236c);
                this.f1842b.mo3794a(i5);
                this.f1842b.mo3803a(ClassP.m5001a(i5));
                break;
            default:
                mo3930a(i, i2, i3);
                return;
        }
        this.f1842b.mo3895a(this.f1843c, i2, i);
    }

    @Override
    public void mo3933a(int i, int i2, int i3, ao c0928ao, int i4) {
        this.f1842b.mo3800a(this.f1843c, ClassC.f3255f);
        this.f1842b.mo3794a(i4);
        this.f1842b.mo3796a(c0928ao);
        this.f1842b.mo3895a(this.f1843c, i2, i);
    }

    @Override
    public void mo3934a(int i, int i2, int i3, Abstracta abstractC1200a, int i4) {
        Abstracta abstractC1200aM5003m;
        switch (i) {
            case 18:
            case 19:
                if ((abstractC1200a instanceof ClassY) || (abstractC1200a instanceof ab)) {
                    this.f1841a.m3918a(abstractC1200a);
                }
                this.f1842b.mo3809b();
                break;
            case 179:
                this.f1842b.mo3800a(this.f1843c, ((ClassN) abstractC1200a).mo3825a());
                break;
            case 180:
            case 192:
            case 193:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3267r);
                break;
            case 181:
                this.f1842b.mo3801a(this.f1843c, ClassC.f3267r, ((ClassN) abstractC1200a).mo3825a());
                break;
            case 182:
            case 183:
            case 184:
            case 185:
                if (abstractC1200a instanceof ClassQ) {
                    abstractC1200aM5003m = ((ClassQ) abstractC1200a).m5003m();
                    this.f1841a.m3912a(i, (ClassZ) abstractC1200aM5003m);
                } else {
                    abstractC1200aM5003m = abstractC1200a;
                }
                if ((abstractC1200aM5003m instanceof ClassZ) && ((ClassZ) abstractC1200aM5003m).m4986l()) {
                    this.f1841a.m3923b(i);
                }
                this.f1842b.mo3799a(this.f1843c, ((ClassZ) abstractC1200aM5003m).m4981a(i == 184));
                abstractC1200a = abstractC1200aM5003m;
                break;
            case 186:
                this.f1841a.m3911a(i);
                ClassR c1225r = (ClassR) abstractC1200a;
                this.f1842b.mo3799a(this.f1843c, c1225r.m5011f());
                abstractC1200a = c1225r.m5005a();
                break;
            case 189:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3255f);
                break;
            case 197:
                this.f1842b.mo3799a(this.f1843c, ClassA.m5032a(ClassC.f3258i, i4));
                break;
            default:
                this.f1842b.mo3809b();
                break;
        }
        this.f1842b.mo3794a(i4);
        this.f1842b.mo3803a(abstractC1200a);
        this.f1842b.mo3895a(this.f1843c, i2, i);
    }

    @Override
    public void mo3935a(int i, int i2, int i3, ClassC c1236c) {
        int i4;
        switch (i) {
            case 0:
                this.f1842b.mo3809b();
                break;
            case 46:
                ClassC c1236cM3922b = am.m3922b(c1236c, this.f1843c.m4039d().m4022c(1));
                ClassC c1236cM5077u = c1236cM3922b == ClassC.f3259j ? ClassC.f3259j : c1236cM3922b.m5077u();
                this.f1842b.mo3801a(this.f1843c, c1236cM3922b, ClassC.f3255f);
                c1236c = c1236cM5077u;
                break;
            case 79:
                ClassP c0944pM4039d = this.f1843c.m4039d();
                int i5 = c1236c.m5067k() ? 2 : 3;
                ClassC c1236cM4022c = c0944pM4039d.m4022c(i5);
                boolean zM4021b = c0944pM4039d.m4021b(i5);
                ClassC c1236cM3922b2 = am.m3922b(c1236c, c1236cM4022c);
                ClassC c1236cM5077u2 = zM4021b ? c1236cM3922b2 == ClassC.f3259j ? ClassC.f3259j : c1236cM3922b2.m5077u() : c1236c;
                this.f1842b.mo3802a(this.f1843c, c1236cM3922b2, ClassC.f3255f, c1236cM5077u2);
                c1236c = c1236cM5077u2;
                break;
            case 87:
                if (this.f1843c.m4039d().m4022c(0).m5068l()) {
                    throw am.m3920b();
                }
                this.f1842b.mo3798a(this.f1843c, 1);
                break;
            case 88:
            case 92:
                ClassP c0944pM4039d2 = this.f1843c.m4039d();
                if (c0944pM4039d2.m4022c(0).m5068l()) {
                    this.f1842b.mo3798a(this.f1843c, 1);
                    i4 = 17;
                } else {
                    if (!c0944pM4039d2.m4022c(1).m5067k()) {
                        throw am.m3920b();
                    }
                    this.f1842b.mo3798a(this.f1843c, 2);
                    i4 = 8481;
                }
                if (i == 92) {
                    this.f1842b.mo3794a(i4);
                }
                break;
            case 89:
                if (this.f1843c.m4039d().m4022c(0).m5068l()) {
                    throw am.m3920b();
                }
                this.f1842b.mo3798a(this.f1843c, 1);
                this.f1842b.mo3794a(17);
                break;
            case 90:
                ClassP c0944pM4039d3 = this.f1843c.m4039d();
                if (!c0944pM4039d3.m4022c(0).m5067k() || !c0944pM4039d3.m4022c(1).m5067k()) {
                    throw am.m3920b();
                }
                this.f1842b.mo3798a(this.f1843c, 2);
                this.f1842b.mo3794a(530);
                break;
                break;
            case 91:
                ClassP c0944pM4039d4 = this.f1843c.m4039d();
                if (c0944pM4039d4.m4022c(0).m5068l()) {
                    throw am.m3920b();
                }
                if (c0944pM4039d4.m4022c(1).m5068l()) {
                    this.f1842b.mo3798a(this.f1843c, 2);
                    this.f1842b.mo3794a(530);
                } else {
                    if (!c0944pM4039d4.m4022c(2).m5067k()) {
                        throw am.m3920b();
                    }
                    this.f1842b.mo3798a(this.f1843c, 3);
                    this.f1842b.mo3794a(12819);
                }
                break;
                break;
            case 93:
                ClassP c0944pM4039d5 = this.f1843c.m4039d();
                if (!c0944pM4039d5.m4022c(0).m5068l()) {
                    if (c0944pM4039d5.m4022c(1).m5068l() || c0944pM4039d5.m4022c(2).m5068l()) {
                        throw am.m3920b();
                    }
                    this.f1842b.mo3798a(this.f1843c, 3);
                    this.f1842b.mo3794a(205106);
                } else {
                    if (c0944pM4039d5.m4022c(2).m5068l()) {
                        throw am.m3920b();
                    }
                    this.f1842b.mo3798a(this.f1843c, 2);
                    this.f1842b.mo3794a(530);
                }
                break;
            case 94:
                ClassP c0944pM4039d6 = this.f1843c.m4039d();
                if (!c0944pM4039d6.m4022c(0).m5068l()) {
                    if (!c0944pM4039d6.m4022c(1).m5067k()) {
                        throw am.m3920b();
                    }
                    if (c0944pM4039d6.m4022c(2).m5068l()) {
                        this.f1842b.mo3798a(this.f1843c, 3);
                        this.f1842b.mo3794a(205106);
                    } else {
                        if (!c0944pM4039d6.m4022c(3).m5067k()) {
                            throw am.m3920b();
                        }
                        this.f1842b.mo3798a(this.f1843c, 4);
                        this.f1842b.mo3794a(4399427);
                    }
                } else if (c0944pM4039d6.m4022c(2).m5068l()) {
                    this.f1842b.mo3798a(this.f1843c, 2);
                    this.f1842b.mo3794a(530);
                } else {
                    if (!c0944pM4039d6.m4022c(3).m5067k()) {
                        throw am.m3920b();
                    }
                    this.f1842b.mo3798a(this.f1843c, 3);
                    this.f1842b.mo3794a(12819);
                }
                break;
            case 95:
                ClassP c0944pM4039d7 = this.f1843c.m4039d();
                if (!c0944pM4039d7.m4022c(0).m5067k() || !c0944pM4039d7.m4022c(1).m5067k()) {
                    throw am.m3920b();
                }
                this.f1842b.mo3798a(this.f1843c, 2);
                this.f1842b.mo3794a(18);
                break;
                break;
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 126:
            case 128:
            case 130:
                this.f1842b.mo3801a(this.f1843c, c1236c, c1236c);
                break;
            case 116:
                this.f1842b.mo3800a(this.f1843c, c1236c);
                break;
            case 120:
            case 122:
            case 124:
                this.f1842b.mo3801a(this.f1843c, c1236c, ClassC.f3255f);
                break;
            case 133:
            case 134:
            case 135:
            case 145:
            case 146:
            case 147:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3255f);
                break;
            case 136:
            case 137:
            case 138:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3256g);
                break;
            case 139:
            case 140:
            case 141:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3254e);
                break;
            case 142:
            case 143:
            case 144:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3253d);
                break;
            case 148:
                this.f1842b.mo3801a(this.f1843c, ClassC.f3256g, ClassC.f3256g);
                break;
            case 149:
            case 150:
                this.f1842b.mo3801a(this.f1843c, ClassC.f3254e, ClassC.f3254e);
                break;
            case 151:
            case 152:
                this.f1842b.mo3801a(this.f1843c, ClassC.f3253d, ClassC.f3253d);
                break;
            case 172:
                ClassC c1236cM4022c2 = c1236c == ClassC.f3267r ? this.f1843c.m4039d().m4022c(0) : c1236c;
                this.f1842b.mo3800a(this.f1843c, c1236c);
                m3927a(c1236cM4022c2);
                break;
            case 177:
                this.f1842b.mo3809b();
                m3927a(ClassC.f3258i);
                break;
            case 190:
                ClassC c1236cM4022c3 = this.f1843c.m4039d().m4022c(0);
                if (!c1236cM4022c3.m5073q()) {
                    this.f1841a.m3919a("type mismatch: expected array type but encountered " + c1236cM4022c3.mo3828d());
                }
                this.f1842b.mo3800a(this.f1843c, ClassC.f3267r);
                break;
            case 191:
            case 194:
            case 195:
                this.f1842b.mo3800a(this.f1843c, ClassC.f3267r);
                break;
            default:
                mo3930a(i, i2, i3);
                return;
        }
        this.f1842b.mo3804a(c1236c);
        this.f1842b.mo3895a(this.f1843c, i2, i);
    }

    @Override
    public void mo3936a(int i, int i2, ae c1205ae, ArrayList arrayList) {
        this.f1842b.mo3800a(this.f1843c, ClassC.f3255f);
        this.f1842b.mo3806a(arrayList);
        this.f1842b.mo3803a(c1205ae);
        this.f1842b.mo3895a(this.f1843c, i, 188);
    }

    public void m3937a(ClassQ c0945q) {
        if (c0945q == null) {
            throw new NullPointerException("frame == null");
        }
        this.f1843c = c0945q;
    }
}
