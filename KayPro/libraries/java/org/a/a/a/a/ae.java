package org.a.a.a.a;

import java.util.Arrays;
import org.a.a.a.Abstractp;
import org.a.a.a.Interfacec;
import org.a.a.a.c.ClassK;

public class ae {

    private final Interfacead[] f5129a;

    private final int f5130b;

    public ae(Interfacead[] interfaceC1689adArr) {
        this.f5129a = interfaceC1689adArr;
        int iM7404a = ClassK.m7404a();
        for (Interfacead interfaceC1689ad : interfaceC1689adArr) {
            iM7404a = ClassK.m7407a(iM7404a, interfaceC1689ad);
        }
        this.f5130b = ClassK.m7408b(iM7404a, interfaceC1689adArr.length);
    }

    public static ae m7272a(ae c1690ae, Interfacead interfaceC1689ad) {
        if (c1690ae == null) {
            return new ae(new Interfacead[]{interfaceC1689ad});
        }
        Interfacead[] interfaceC1689adArr = (Interfacead[]) Arrays.copyOf(c1690ae.f5129a, c1690ae.f5129a.length + 1);
        interfaceC1689adArr[interfaceC1689adArr.length - 1] = interfaceC1689ad;
        return new ae(interfaceC1689adArr);
    }

    public ae m7273a(int i) {
        Interfacead[] interfaceC1689adArr = null;
        for (int i2 = 0; i2 < this.f5129a.length; i2++) {
            if (this.f5129a[i2].mo7271a() && !(this.f5129a[i2] instanceof ai)) {
                if (interfaceC1689adArr == null) {
                    interfaceC1689adArr = (Interfacead[]) this.f5129a.clone();
                }
                interfaceC1689adArr[i2] = new ai(i, this.f5129a[i2]);
            }
        }
        return interfaceC1689adArr == null ? this : new ae(interfaceC1689adArr);
    }

    public void m7274a(Abstractp abstractC1790p, Interfacec interfaceC1763c, int i) throws Throwable {
        Interfacead interfaceC1689ad;
        boolean z;
        boolean z2 = false;
        int iB = interfaceC1763c.mo7438b();
        try {
            Interfacead[] interfaceC1689adArr = this.f5129a;
            int length = interfaceC1689adArr.length;
            int i2 = 0;
            boolean z3 = false;
            while (i2 < length) {
                try {
                    Interfacead interfaceC1689ad2 = interfaceC1689adArr[i2];
                    if (interfaceC1689ad2 instanceof ai) {
                        int iM7278b = ((ai) interfaceC1689ad2).m7278b();
                        interfaceC1763c.mo7439b(i + iM7278b);
                        Interfacead interfaceC1689adM7279c = ((ai) interfaceC1689ad2).m7279c();
                        z = iM7278b + i != iB;
                        interfaceC1689ad = interfaceC1689adM7279c;
                    } else if (interfaceC1689ad2.mo7271a()) {
                        interfaceC1763c.mo7439b(iB);
                        interfaceC1689ad = interfaceC1689ad2;
                        z = false;
                    } else {
                        interfaceC1689ad = interfaceC1689ad2;
                        z = z3;
                    }
                    try {
                        interfaceC1689ad.mo7270a(abstractC1790p);
                        i2++;
                        z3 = z;
                    } catch (Throwable th) {
                        th = th;
                        z2 = z;
                        if (z2) {
                            interfaceC1763c.mo7439b(iB);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                }
            }
            if (z3) {
                interfaceC1763c.mo7439b(iB);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae c1690ae = (ae) obj;
        return this.f5130b == c1690ae.f5130b && Arrays.equals(this.f5129a, c1690ae.f5129a);
    }

    public int hashCode() {
        return this.f5130b;
    }
}
