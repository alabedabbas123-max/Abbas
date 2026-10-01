package a.b.f;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacej;
import a.b.g.Interfacebg;

public class ClassB implements aq {

    private final boolean f189a;

    private final Interfacebg f190b;

    public ClassB(boolean z, Interfacebg interfaceC0129bg) {
        this.f189a = z;
        this.f190b = interfaceC0129bg;
    }

    private void m681a(c cVar, Interfaced interfaceC0041d, c cVar2) {
        String strB = interfaceC0041d.mo949b(cVar);
        this.f190b.mo1032a(cVar, interfaceC0041d, 0, 1, 0, ClassI.m799v(strB), strB, cVar2);
    }

    private void m682a(c cVar, Interfacej interfaceC0162j, c[] cVarArr) {
        int i;
        int i2;
        int i3;
        int iIndexOf;
        int i4;
        int i5;
        c cVar2;
        int i6;
        c cVar3;
        char cCharAt;
        String strB = interfaceC0162j.mo949b(cVar);
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (true) {
            int iIndexOf2 = i9 + 1;
            switch (strB.charAt(i9)) {
                case ')':
                    int i10 = 0;
                    int i11 = 0;
                    if (this.f189a && (interfaceC0162j.mo945a() & 8) == 0) {
                        i2 = i7 + 1;
                        i = i8 + 1;
                        this.f190b.mo1032a(cVar, interfaceC0162j, 0, i2, 0, i, ClassI.m786k(cVar.b()), cVar);
                        i11 = 1;
                        i10 = 1;
                    } else {
                        i = i8;
                        i2 = i7;
                    }
                    int i12 = 1;
                    int i13 = 0;
                    while (true) {
                        int i14 = i12 + 1;
                        c cVar4 = null;
                        switch (strB.charAt(i12)) {
                            case ')':
                                return;
                            case 'D':
                            case 'J':
                                i3 = 2;
                                iIndexOf = i14;
                                i4 = i13;
                                continue;
                                this.f190b.mo1032a(cVar, interfaceC0162j, i10, i2, i11, i, strB.substring(i12, iIndexOf), cVar4);
                                i11 += i3;
                                i13 = i4;
                                i10++;
                                i12 = iIndexOf;
                                break;
                            case 'L':
                                iIndexOf = strB.indexOf(59, i14) + 1;
                                if (cVarArr == null) {
                                    i6 = i13;
                                    cVar3 = null;
                                } else {
                                    i6 = i13 + 1;
                                    cVar3 = cVarArr[i13];
                                }
                                cVar4 = cVar3;
                                i3 = 1;
                                i4 = i6;
                                continue;
                                this.f190b.mo1032a(cVar, interfaceC0162j, i10, i2, i11, i, strB.substring(i12, iIndexOf), cVar4);
                                i11 += i3;
                                i13 = i4;
                                i10++;
                                i12 = iIndexOf;
                                break;
                            case '[':
                                break;
                            default:
                                i3 = 1;
                                iIndexOf = i14;
                                i4 = i13;
                                continue;
                                this.f190b.mo1032a(cVar, interfaceC0162j, i10, i2, i11, i, strB.substring(i12, iIndexOf), cVar4);
                                i11 += i3;
                                i13 = i4;
                                i10++;
                                i12 = iIndexOf;
                                break;
                        }
                        while (true) {
                            int i15 = i14 + 1;
                            char cCharAt2 = strB.charAt(i14);
                            if (cCharAt2 == '[') {
                                i14 = i15;
                            } else {
                                if (cCharAt2 == 'L') {
                                    iIndexOf = strB.indexOf(59, i15) + 1;
                                    if (cVarArr == null) {
                                        i5 = i13;
                                        cVar2 = null;
                                    } else {
                                        i5 = i13 + 1;
                                        cVar2 = cVarArr[i13];
                                    }
                                    cVar4 = cVar2;
                                    i3 = 1;
                                    i4 = i5;
                                } else {
                                    i3 = 1;
                                    iIndexOf = i15;
                                    i4 = i13;
                                }
                                this.f190b.mo1032a(cVar, interfaceC0162j, i10, i2, i11, i, strB.substring(i12, iIndexOf), cVar4);
                                i11 += i3;
                                i13 = i4;
                                i10++;
                                i12 = iIndexOf;
                            }
                        }
                    }
                    break;
                case 'D':
                case 'J':
                    i8++;
                    continue;
                    i9 = iIndexOf2;
                    i7++;
                    i8++;
                    break;
                case 'L':
                    iIndexOf2 = strB.indexOf(59, iIndexOf2) + 1;
                    continue;
                    i9 = iIndexOf2;
                    i7++;
                    i8++;
                    break;
                case '[':
                    break;
                default:
                    continue;
                    i9 = iIndexOf2;
                    i7++;
                    i8++;
                    break;
            }
            do {
                int i16 = iIndexOf2;
                iIndexOf2 = i16 + 1;
                cCharAt = strB.charAt(i16);
            } while (cCharAt == '[');
            if (cCharAt == 'L') {
                iIndexOf2 = strB.indexOf(59, iIndexOf2) + 1;
            }
            i9 = iIndexOf2;
            i7++;
            i8++;
        }
    }

    public void m683a(ClassE c0057e, ClassF c0069f) {
        m681a(c0057e, c0069f, c0069f.f188a);
    }

    public void m684a(ClassE c0057e, ClassH c0160h) {
        m682a(c0057e, c0160h, c0160h.f427a);
    }

    public void m685a(k kVar, ClassL c0163l) {
        m681a((c) kVar, (Interfaced) c0163l, c0163l.f429a);
    }

    public void m686a(k kVar, ClassN c0165n) {
        m682a((c) kVar, (Interfacej) c0165n, c0165n.f437a);
    }
}
