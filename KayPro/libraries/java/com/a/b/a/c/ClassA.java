package com.a.b.a.c;

import com.a.b.a.e.ClassI;
import com.a.b.a.e.Interfacej;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.aa;
import com.a.b.e.c.ab;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.af;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassQ;
import com.a.b.e.c.ClassR;
import com.a.b.e.c.ClassW;
import com.a.b.e.c.ClassY;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import java.util.BitSet;

public final class ClassA {

    private final ClassE f1903a;

    private final af f1904b;

    private final int[] f1905c;

    private int f1906d;

    private Interfacej f1907e;

    public ClassA(ClassE c1307e) {
        int iM5446f = c1307e.m5446f(8);
        this.f1903a = c1307e;
        this.f1904b = new af(iM5446f);
        this.f1905c = new int[iM5446f];
        this.f1906d = -1;
    }

    private Abstracta m4087a(int i, BitSet bitSet) {
        Abstracta abstractC1200aM4087a;
        Abstracta abstractC1200aMo4974c = this.f1904b.mo4974c(i);
        if (abstractC1200aMo4974c == null) {
            int i2 = this.f1905c[i];
            try {
                int iM5445e = this.f1903a.m5445e(i2);
                switch (iM5445e) {
                    case 1:
                        abstractC1200aMo4974c = m4088a(i2);
                        bitSet.set(i);
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new ClassI("unknown tag byte: " + ClassK.m5487e(iM5445e));
                    case 3:
                        abstractC1200aMo4974c = ClassP.m5001a(this.f1903a.m5442c(i2 + 1));
                        break;
                    case 4:
                        abstractC1200aMo4974c = ClassO.m5000a(this.f1903a.m5442c(i2 + 1));
                        break;
                    case 5:
                        abstractC1200aMo4974c = ClassW.m5020a(this.f1903a.m5444d(i2 + 1));
                        break;
                    case 6:
                        abstractC1200aMo4974c = ClassL.m4997a(this.f1903a.m5444d(i2 + 1));
                        break;
                    case 7:
                        abstractC1200aMo4974c = new ae(ClassC.m5059c(((ad) m4087a(this.f1903a.m5446f(i2 + 1), bitSet)).m4958j()));
                        break;
                    case 8:
                        abstractC1200aMo4974c = m4087a(this.f1903a.m5446f(i2 + 1), bitSet);
                        break;
                    case 9:
                        abstractC1200aMo4974c = new ClassN((ae) m4087a(this.f1903a.m5446f(i2 + 1), bitSet), (aa) m4087a(this.f1903a.m5446f(i2 + 3), bitSet));
                        break;
                    case 10:
                        abstractC1200aMo4974c = new ClassZ((ae) m4087a(this.f1903a.m5446f(i2 + 1), bitSet), (aa) m4087a(this.f1903a.m5446f(i2 + 3), bitSet));
                        break;
                    case 11:
                        abstractC1200aMo4974c = new ClassQ((ae) m4087a(this.f1903a.m5446f(i2 + 1), bitSet), (aa) m4087a(this.f1903a.m5446f(i2 + 3), bitSet));
                        break;
                    case 12:
                        abstractC1200aMo4974c = new aa((ad) m4087a(this.f1903a.m5446f(i2 + 1), bitSet), (ad) m4087a(this.f1903a.m5446f(i2 + 3), bitSet));
                        break;
                    case 15:
                        int iM5445e2 = this.f1903a.m5445e(i2 + 1);
                        int iM5446f = this.f1903a.m5446f(i2 + 2);
                        switch (iM5445e2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                abstractC1200aM4087a = (ClassN) m4087a(iM5446f, bitSet);
                                break;
                            case 5:
                            case 8:
                                abstractC1200aM4087a = (ClassZ) m4087a(iM5446f, bitSet);
                                break;
                            case 6:
                            case 7:
                                abstractC1200aM4087a = m4087a(iM5446f, bitSet);
                                if (!(abstractC1200aM4087a instanceof ClassZ) && !(abstractC1200aM4087a instanceof ClassQ)) {
                                    throw new ClassI("Unsupported ref constant type for MethodHandle " + abstractC1200aM4087a.getClass());
                                }
                                break;
                            case 9:
                                abstractC1200aM4087a = (ClassQ) m4087a(iM5446f, bitSet);
                                break;
                            default:
                                throw new ClassI("Unsupported MethodHandle kind: " + iM5445e2);
                        }
                        abstractC1200aMo4974c = ClassY.m5024a(m4089b(iM5445e2), abstractC1200aM4087a);
                        break;
                    case 16:
                        abstractC1200aMo4974c = ab.m4949a((ad) m4087a(this.f1903a.m5446f(i2 + 1), bitSet));
                        break;
                    case 18:
                        abstractC1200aMo4974c = ClassR.m5004a(this.f1903a.m5446f(i2 + 1), (aa) m4087a(this.f1903a.m5446f(i2 + 3), bitSet));
                        break;
                }
                this.f1904b.m4972a(i, abstractC1200aMo4974c);
            } catch (ClassI e) {
                e.m3757a("...while parsing cst " + ClassK.m5485c(i) + " at offset " + ClassK.m5480a(i2));
                throw e;
            } catch (RuntimeException e2) {
                ClassI c0974i = new ClassI(e2);
                c0974i.m3757a("...while parsing cst " + ClassK.m5485c(i) + " at offset " + ClassK.m5480a(i2));
                throw c0974i;
            }
        }
        return abstractC1200aMo4974c;
    }

    private ad m4088a(int i) {
        int i2 = i + 3;
        try {
            return new ad(this.f1903a.m5438a(i2, this.f1903a.m5446f(i + 1) + i2));
        } catch (IllegalArgumentException e) {
            throw new ClassI(e);
        }
    }

    private static int m4089b(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 0;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 7;
            case 8:
                return 6;
            case 9:
                return 8;
            default:
                throw new IllegalArgumentException("invalid kind: " + i);
        }
    }

    private void m4090c() {
        if (this.f1906d < 0) {
            m4091d();
        }
    }

    private void m4091d() {
        int i;
        m4092e();
        if (this.f1907e != null) {
            this.f1907e.m4195a(this.f1903a, 8, 2, "constant_pool_count: " + ClassK.m5485c(this.f1905c.length));
            this.f1907e.m4195a(this.f1903a, 10, 0, "\nconstant_pool:");
            this.f1907e.m4194a(1);
        }
        BitSet bitSet = new BitSet(this.f1905c.length);
        for (int i2 = 1; i2 < this.f1905c.length; i2++) {
            if (this.f1905c[i2] != 0 && this.f1904b.mo4974c(i2) == null) {
                m4087a(i2, bitSet);
            }
        }
        if (this.f1907e != null) {
            for (int i3 = 1; i3 < this.f1905c.length; i3++) {
                Abstracta abstractC1200aMo4974c = this.f1904b.mo4974c(i3);
                if (abstractC1200aMo4974c != null) {
                    int i4 = this.f1905c[i3];
                    int i5 = this.f1906d;
                    int i6 = i3 + 1;
                    while (true) {
                        if (i6 >= this.f1905c.length) {
                            i = i5;
                            break;
                        }
                        int i7 = this.f1905c[i6];
                        if (i7 != 0) {
                            i = i7;
                            break;
                        }
                        i6++;
                    }
                    this.f1907e.m4195a(this.f1903a, i4, i - i4, bitSet.get(i3) ? String.valueOf(ClassK.m5485c(i3)) + ": utf8{\"" + abstractC1200aMo4974c.mo3828d() + "\"}" : String.valueOf(ClassK.m5485c(i3)) + ": " + abstractC1200aMo4974c.toString());
                }
            }
            this.f1907e.m4194a(-1);
            this.f1907e.m4195a(this.f1903a, this.f1906d, 0, "end constant_pool");
        }
    }

    private void m4092e() {
        int i;
        int iM5446f = 10;
        int i2 = 1;
        while (i2 < this.f1905c.length) {
            this.f1905c[i2] = iM5446f;
            int iM5445e = this.f1903a.m5445e(iM5446f);
            switch (iM5445e) {
                case 1:
                    try {
                        iM5446f += this.f1903a.m5446f(iM5446f + 1) + 3;
                        i = 1;
                        continue;
                        i2 += i;
                    } catch (ClassI e) {
                        e.m3757a("...while preparsing cst " + ClassK.m5485c(i2) + " at offset " + ClassK.m5480a(iM5446f));
                        throw e;
                    }
                    break;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new ClassI("unknown tag byte: " + ClassK.m5487e(iM5445e));
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    iM5446f += 5;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 5:
                case 6:
                    i = 2;
                    iM5446f += 9;
                    continue;
                    i2 += i;
                    break;
                case 7:
                case 8:
                    iM5446f += 3;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 15:
                    iM5446f += 4;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 16:
                    iM5446f += 3;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 18:
                    iM5446f += 5;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
            }
            e.m3757a("...while preparsing cst " + ClassK.m5485c(i2) + " at offset " + ClassK.m5480a(iM5446f));
            throw e;
        }
        this.f1906d = iM5446f;
    }

    public int m4093a() {
        m4090c();
        return this.f1906d;
    }

    public void m4094a(Interfacej interfaceC0975j) {
        this.f1907e = interfaceC0975j;
    }

    public af m4095b() {
        m4090c();
        return this.f1904b;
    }
}
