package org.a.a.a.a;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.a.a.a.c.ClassJ;
import org.a.a.a.c.ClassM;

public class ClassH {

    public static final UUID f5203b;

    private static int[] f5209i;

    private final ClassG f5210h;

    public static final int f5202a = 3;

    private static final UUID f5204c = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");

    private static final UUID f5205d = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");

    private static final UUID f5206e = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");

    private static final UUID f5207f = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");

    private static final List f5208g = new ArrayList();

    static {
        f5208g.add(f5204c);
        f5208g.add(f5205d);
        f5208g.add(f5206e);
        f5208g.add(f5207f);
        f5203b = f5207f;
    }

    public ClassH() {
        this(ClassG.m7324a());
    }

    public ClassH(ClassG c1731g) {
        this.f5210h = c1731g == null ? ClassG.m7324a() : c1731g;
    }

    protected static int m7328a(char c) {
        return c;
    }

    protected static int m7329a(char[] cArr, int i) {
        return cArr[i] | (cArr[i + 1] << 16);
    }

    private int m7330a(char[] cArr, int i, List list, Interfacek interfaceC1735k) {
        int iMo7344a = i + 1;
        int iM7328a = m7328a(cArr[i]);
        for (int i2 = 0; i2 < iM7328a; i2++) {
            int iM7328a2 = m7328a(cArr[iMo7344a]);
            int i3 = iMo7344a + 1;
            ClassJ c1773j = new ClassJ(new int[0]);
            list.add(c1773j);
            int i4 = i3 + 1;
            if (m7328a(cArr[i3]) != 0) {
                c1773j.m7400b(-1);
            }
            iMo7344a = i4;
            for (int i5 = 0; i5 < iM7328a2; i5++) {
                int iMo7345a = interfaceC1735k.mo7345a(cArr, iMo7344a);
                int iMo7344a2 = iMo7344a + interfaceC1735k.mo7344a();
                int iMo7345a2 = interfaceC1735k.mo7345a(cArr, iMo7344a2);
                iMo7344a = iMo7344a2 + interfaceC1735k.mo7344a();
                c1773j.m7401b(iMo7345a, iMo7345a2);
            }
        }
        return iMo7344a;
    }

    static Interfacek m7331a(Enuml enumC1736l) {
        return enumC1736l == Enuml.UNICODE_BMP ? new ClassI() : new ClassJ();
    }

    protected static boolean m7332a(UUID uuid, UUID uuid2) {
        int iIndexOf = f5208g.indexOf(uuid);
        return iIndexOf >= 0 && f5208g.indexOf(uuid2) >= iIndexOf;
    }

    static int[] m7333a() {
        int[] iArr = f5209i;
        if (iArr == null) {
            iArr = new int[Enumaf.m7275a().length];
            try {
                iArr[Enumaf.CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enumaf.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enumaf.MODE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Enumaf.MORE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[Enumaf.POP_MODE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[Enumaf.PUSH_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[Enumaf.SKIP.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Enumaf.TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            f5209i = iArr;
        }
        return iArr;
    }

    protected static long m7334b(char[] cArr, int i) {
        return (((long) m7329a(cArr, i)) & 4294967295L) | (((long) m7329a(cArr, i + 2)) << 32);
    }

    protected static UUID m7335c(char[] cArr, int i) {
        return new UUID(m7334b(cArr, i + 4), m7334b(cArr, i));
    }

    public ClassA m7336a(char[] cArr) {
        Abstractn abstractC1738n;
        Abstractbl abstractC1724blA;
        int i;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i2 = 1; i2 < cArr2.length; i2++) {
            cArr2[i2] = (char) (cArr2[i2] - 2);
        }
        int iM7328a = m7328a(cArr2[0]);
        if (iM7328a != f5202a) {
            throw new UnsupportedOperationException(new InvalidClassException(ClassA.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(iM7328a), Integer.valueOf(f5202a))));
        }
        UUID uuidM7335c = m7335c(cArr2, 1);
        if (!f5208g.contains(uuidM7335c)) {
            throw new UnsupportedOperationException(new InvalidClassException(ClassA.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with UUID %s (expected %s or a legacy UUID).", uuidM7335c, f5203b)));
        }
        boolean zM7332a = m7332a(f5205d, uuidM7335c);
        boolean zM7332a2 = m7332a(f5206e, uuidM7335c);
        ClassA c1685a = new ClassA(Enumo.m7353a()[m7328a(cArr2[9])], m7328a(cArr2[10]));
        ArrayList<ClassM> arrayList = new ArrayList();
        ArrayList<ClassM> arrayList2 = new ArrayList();
        int iM7328a2 = m7328a(cArr2[11]);
        int i3 = 0;
        int i4 = 12;
        while (i3 < iM7328a2) {
            int i5 = i4 + 1;
            int iM7328a3 = m7328a(cArr2[i4]);
            if (iM7328a3 == 0) {
                c1685a.m7243a((Abstractn) null);
            } else {
                int i6 = i5 + 1;
                int iM7328a4 = m7328a(cArr2[i5]);
                if (iM7328a4 == 65535) {
                    iM7328a4 = -1;
                }
                Abstractn abstractC1738nM7339a = m7339a(iM7328a3, iM7328a4);
                if (iM7328a3 == 12) {
                    arrayList.add(new ClassM((ap) abstractC1738nM7339a, Integer.valueOf(m7328a(cArr2[i6]))));
                    i5 = i6 + 1;
                } else if (abstractC1738nM7339a instanceof Abstractw) {
                    arrayList2.add(new ClassM((Abstractw) abstractC1738nM7339a, Integer.valueOf(m7328a(cArr2[i6]))));
                    i5 = i6 + 1;
                } else {
                    i5 = i6;
                }
                c1685a.m7243a(abstractC1738nM7339a);
            }
            i3++;
            i4 = i5;
        }
        for (ClassM c1776m : arrayList) {
            ((ap) c1776m.f5293a).f5151g = (Abstractn) c1685a.f5104a.get(((Integer) c1776m.f5294b).intValue());
        }
        for (ClassM c1776m2 : arrayList2) {
            ((Abstractw) c1776m2.f5293a).f5236g = (ClassV) c1685a.f5104a.get(((Integer) c1776m2.f5294b).intValue());
        }
        int iM7328a5 = m7328a(cArr2[i4]);
        int i7 = i4 + 1;
        int i8 = 0;
        while (i8 < iM7328a5) {
            ((Abstractx) c1685a.f5104a.get(m7328a(cArr2[i7]))).f5238i = true;
            i8++;
            i7++;
        }
        if (zM7332a) {
            int iM7328a6 = m7328a(cArr2[i7]);
            i7++;
            int i9 = 0;
            while (i9 < iM7328a6) {
                ((ba) c1685a.f5104a.get(m7328a(cArr2[i7]))).f5171h = true;
                i9++;
                i7++;
            }
        }
        int i10 = i7 + 1;
        int iM7328a7 = m7328a(cArr2[i7]);
        if (c1685a.f5109f == Enumo.LEXER) {
            c1685a.f5111h = new int[iM7328a7];
        }
        c1685a.f5106c = new ba[iM7328a7];
        int i11 = 0;
        int i12 = i10;
        while (i11 < iM7328a7) {
            int i13 = i12 + 1;
            c1685a.f5106c[i11] = (ba) c1685a.f5104a.get(m7328a(cArr2[i12]));
            if (c1685a.f5109f == Enumo.LEXER) {
                int i14 = i13 + 1;
                int iM7328a8 = m7328a(cArr2[i13]);
                if (iM7328a8 == 65535) {
                    iM7328a8 = -1;
                }
                c1685a.f5111h[i11] = iM7328a8;
                if (m7332a(f5206e, uuidM7335c)) {
                    i = i14;
                } else {
                    i = i14 + 1;
                    m7328a(cArr2[i14]);
                }
            } else {
                i = i13;
            }
            i11++;
            i12 = i;
        }
        c1685a.f5107d = new bb[iM7328a7];
        for (Abstractn abstractC1738n2 : c1685a.f5104a) {
            if (abstractC1738n2 instanceof bb) {
                bb c1714bb = (bb) abstractC1738n2;
                c1685a.f5107d[abstractC1738n2.f5222d] = c1714bb;
                c1685a.f5106c[abstractC1738n2.f5222d].f5170g = c1714bb;
            }
        }
        int iM7328a9 = m7328a(cArr2[i12]);
        int i15 = i12 + 1;
        int i16 = 0;
        while (i16 < iM7328a9) {
            c1685a.f5113j.add((bk) c1685a.f5104a.get(m7328a(cArr2[i15])));
            i16++;
            i15++;
        }
        List arrayList3 = new ArrayList();
        int iM7330a = m7330a(cArr2, i15, arrayList3, m7331a(Enuml.UNICODE_BMP));
        if (m7332a(f5207f, uuidM7335c)) {
            iM7330a = m7330a(cArr2, iM7330a, arrayList3, m7331a(Enuml.UNICODE_SMP));
        }
        int iM7328a10 = m7328a(cArr2[iM7330a]);
        int i17 = 0;
        int i18 = iM7330a + 1;
        while (i17 < iM7328a10) {
            int iM7328a11 = m7328a(cArr2[i18]);
            ((Abstractn) c1685a.f5104a.get(iM7328a11)).m7349a(m7338a(c1685a, m7328a(cArr2[i18 + 2]), iM7328a11, m7328a(cArr2[i18 + 1]), m7328a(cArr2[i18 + 3]), m7328a(cArr2[i18 + 4]), m7328a(cArr2[i18 + 5]), arrayList3));
            i17++;
            i18 += 6;
        }
        for (Abstractn abstractC1738n3 : c1685a.f5104a) {
            int i19 = 0;
            while (true) {
                int i20 = i19;
                if (i20 < abstractC1738n3.m7346a()) {
                    Abstractbl abstractC1724blM7347a = abstractC1738n3.m7347a(i20);
                    if (abstractC1724blM7347a instanceof bc) {
                        bc c1715bc = (bc) abstractC1724blM7347a;
                        int i21 = -1;
                        if (c1685a.f5106c[c1715bc.f5187f.f5222d].f5171h && c1715bc.f5173b == 0) {
                            i21 = c1715bc.f5187f.f5222d;
                        }
                        c1685a.f5107d[c1715bc.f5187f.f5222d].m7349a(new ClassZ(c1715bc.f5174c, i21));
                    }
                    i19 = i20 + 1;
                }
            }
        }
        for (Abstractn abstractC1738n4 : c1685a.f5104a) {
            if (abstractC1738n4 instanceof Abstractw) {
                if (((Abstractw) abstractC1738n4).f5236g == null) {
                    throw new IllegalStateException();
                }
                if (((Abstractw) abstractC1738n4).f5236g.f5235g != null) {
                    throw new IllegalStateException();
                }
                ((Abstractw) abstractC1738n4).f5236g.f5235g = (Abstractw) abstractC1738n4;
            }
            if (abstractC1738n4 instanceof au) {
                au c1706au = (au) abstractC1738n4;
                int i22 = 0;
                while (true) {
                    int i23 = i22;
                    if (i23 < c1706au.m7346a()) {
                        Abstractn abstractC1738n5 = c1706au.m7347a(i23).f5187f;
                        if (abstractC1738n5 instanceof at) {
                            ((at) abstractC1738n5).f5152j = c1706au;
                        }
                        i22 = i23 + 1;
                    }
                }
            } else if (abstractC1738n4 instanceof bj) {
                bj c1722bj = (bj) abstractC1738n4;
                int i24 = 0;
                while (true) {
                    int i25 = i24;
                    if (i25 < c1722bj.m7346a()) {
                        Abstractn abstractC1738n6 = c1722bj.m7347a(i25).f5187f;
                        if (abstractC1738n6 instanceof bi) {
                            ((bi) abstractC1738n6).f5183g = c1722bj;
                        }
                        i24 = i25 + 1;
                    }
                }
            }
        }
        int iM7328a12 = m7328a(cArr2[i18]);
        int i26 = i18 + 1;
        int i27 = 1;
        while (i27 <= iM7328a12) {
            int i28 = i26 + 1;
            Abstractx abstractC1748x = (Abstractx) c1685a.f5104a.get(m7328a(cArr2[i26]));
            c1685a.f5105b.add(abstractC1748x);
            abstractC1748x.f5237h = i27 - 1;
            i27++;
            i26 = i28;
        }
        if (c1685a.f5109f == Enumo.LEXER) {
            if (zM7332a2) {
                int i29 = i26 + 1;
                c1685a.f5112i = new Interfacead[m7328a(cArr2[i26])];
                for (int i30 = 0; i30 < c1685a.f5112i.length; i30++) {
                    int i31 = i29 + 1;
                    Enumaf enumC1691af = Enumaf.m7275a()[m7328a(cArr2[i29])];
                    int i32 = i31 + 1;
                    int iM7328a13 = m7328a(cArr2[i31]);
                    int i33 = iM7328a13 == 65535 ? -1 : iM7328a13;
                    i29 = i32 + 1;
                    int iM7328a14 = m7328a(cArr2[i32]);
                    if (iM7328a14 == 65535) {
                        iM7328a14 = -1;
                    }
                    c1685a.f5112i[i30] = m7337a(enumC1691af, i33, iM7328a14);
                }
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Abstractn abstractC1738n7 : c1685a.f5104a) {
                    int i34 = 0;
                    while (true) {
                        int i35 = i34;
                        if (i35 < abstractC1738n7.m7346a()) {
                            Abstractbl abstractC1724blM7347a2 = abstractC1738n7.m7347a(i35);
                            if (abstractC1724blM7347a2 instanceof ClassQ) {
                                int i36 = ((ClassQ) abstractC1724blM7347a2).f5228a;
                                ah c1693ah = new ah(i36, ((ClassQ) abstractC1724blM7347a2).f5229b);
                                abstractC1738n7.m7351b(i35, new ClassQ(abstractC1724blM7347a2.f5187f, i36, arrayList4.size(), false));
                                arrayList4.add(c1693ah);
                            }
                            i34 = i35 + 1;
                        }
                    }
                }
                c1685a.f5112i = (Interfacead[]) arrayList4.toArray(new Interfacead[arrayList4.size()]);
            }
        }
        m7340a(c1685a);
        if (this.f5210h.m7326c()) {
            m7343b(c1685a);
        }
        if (this.f5210h.m7327d() && c1685a.f5109f == Enumo.PARSER) {
            c1685a.f5111h = new int[c1685a.f5106c.length];
            for (int i37 = 0; i37 < c1685a.f5106c.length; i37++) {
                c1685a.f5111h[i37] = c1685a.f5110g + i37 + 1;
            }
            int i38 = 0;
            while (true) {
                int i39 = i38;
                if (i39 < c1685a.f5106c.length) {
                    ClassT c1744t = new ClassT();
                    c1744t.f5222d = i39;
                    c1685a.m7243a((Abstractn) c1744t);
                    ClassV c1746v = new ClassV();
                    c1746v.f5222d = i39;
                    c1685a.m7243a(c1746v);
                    c1744t.f5236g = c1746v;
                    c1685a.m7241a((Abstractx) c1744t);
                    c1746v.f5235g = c1744t;
                    if (c1685a.f5106c[i39].f5171h) {
                        Abstractn abstractC1738n8 = null;
                        for (Abstractn abstractC1738n9 : c1685a.f5104a) {
                            if (abstractC1738n9.f5222d == i39 && (abstractC1738n9 instanceof bi)) {
                                Abstractn abstractC1738n10 = abstractC1738n9.m7347a(abstractC1738n9.m7346a() - 1).f5187f;
                                if ((abstractC1738n10 instanceof ap) && abstractC1738n10.f5223e && (abstractC1738n10.m7347a(0).f5187f instanceof bb)) {
                                    abstractC1738n8 = abstractC1738n9;
                                    break;
                                }
                            }
                        }
                        if (abstractC1738n8 == null) {
                            throw new UnsupportedOperationException("Couldn't identify final state of the precedence rule prefix section.");
                        }
                        abstractC1738n = abstractC1738n8;
                        abstractC1724blA = ((bi) abstractC1738n8).f5183g.m7347a(0);
                    } else {
                        abstractC1738n = c1685a.f5107d[i39];
                        abstractC1724blA = null;
                    }
                    Iterator it = c1685a.f5104a.iterator();
                    while (it.hasNext()) {
                        for (Abstractbl abstractC1724bl : ((Abstractn) it.next()).f5224f) {
                            if (abstractC1724bl != abstractC1724blA && abstractC1724bl.f5187f == abstractC1738n) {
                                abstractC1724bl.f5187f = c1746v;
                            }
                        }
                    }
                    while (c1685a.f5106c[i39].m7346a() > 0) {
                        c1744t.m7349a(c1685a.f5106c[i39].m7350b(c1685a.f5106c[i39].m7346a() - 1));
                    }
                    c1685a.f5106c[i39].m7349a(new ClassZ(c1744t));
                    c1746v.m7349a(new ClassZ(abstractC1738n));
                    Abstractn c1745u = new ClassU();
                    c1685a.m7243a(c1745u);
                    c1745u.m7349a(new ClassS(c1746v, c1685a.f5111h[i39]));
                    c1744t.m7349a(new ClassZ(c1745u));
                    i38 = i39 + 1;
                } else if (this.f5210h.m7326c()) {
                    m7343b(c1685a);
                }
            }
        }
        return c1685a;
    }

    protected Interfacead m7337a(Enumaf enumC1691af, int i, int i2) {
        switch (m7333a()[enumC1691af.ordinal()]) {
            case 1:
                return new ag(i);
            case 2:
                return new ah(i, i2);
            case 3:
                return new aj(i);
            case 4:
                return ak.f5146a;
            case 5:
                return al.f5147a;
            case 6:
                return new am(i);
            case 7:
                return an.f5149a;
            case 8:
                return new ao(i);
            default:
                throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", enumC1691af));
        }
    }

    protected Abstractbl m7338a(ClassA c1685a, int i, int i2, int i3, int i4, int i5, int i6, List list) {
        Abstractn abstractC1738n = (Abstractn) c1685a.f5104a.get(i3);
        switch (i) {
            case 1:
                return new ClassZ(abstractC1738n);
            case 2:
                return i6 != 0 ? new az(abstractC1738n, -1, i5) : new az(abstractC1738n, i4, i5);
            case 3:
                return new bc((ba) c1685a.f5104a.get(i4), i5, i6, abstractC1738n);
            case 4:
                return new aw(abstractC1738n, i4, i5, i6 != 0);
            case 5:
                return i6 != 0 ? new ClassS(abstractC1738n, -1) : new ClassS(abstractC1738n, i4);
            case 6:
                return new ClassQ(abstractC1738n, i4, i5, i6 != 0);
            case 7:
                return new bf(abstractC1738n, (ClassJ) list.get(i4));
            case 8:
                return new aq(abstractC1738n, (ClassJ) list.get(i4));
            case 9:
                return new bn(abstractC1738n);
            case 10:
                return new av(abstractC1738n, i4);
            default:
                throw new IllegalArgumentException("The specified transition type is not valid.");
        }
    }

    protected Abstractn m7339a(int i, int i2) {
        Abstractn c1701ap;
        switch (i) {
            case 0:
                return null;
            case 1:
                c1701ap = new ClassU();
                break;
            case 2:
                c1701ap = new ba();
                break;
            case 3:
                c1701ap = new ClassT();
                break;
            case 4:
                c1701ap = new at();
                break;
            case 5:
                c1701ap = new bh();
                break;
            case 6:
                c1701ap = new bk();
                break;
            case 7:
                c1701ap = new bb();
                break;
            case 8:
                c1701ap = new ClassV();
                break;
            case 9:
                c1701ap = new bj();
                break;
            case 10:
                c1701ap = new bi();
                break;
            case 11:
                c1701ap = new au();
                break;
            case 12:
                c1701ap = new ap();
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(i)));
        }
        c1701ap.f5222d = i2;
        return c1701ap;
    }

    protected void m7340a(ClassA c1685a) {
        for (Abstractn abstractC1738n : c1685a.f5104a) {
            if ((abstractC1738n instanceof bi) && c1685a.f5106c[abstractC1738n.f5222d].f5171h) {
                Abstractn abstractC1738n2 = abstractC1738n.m7347a(abstractC1738n.m7346a() - 1).f5187f;
                if ((abstractC1738n2 instanceof ap) && abstractC1738n2.f5223e && (abstractC1738n2.m7347a(0).f5187f instanceof bb)) {
                    ((bi) abstractC1738n).f5184j = true;
                }
            }
        }
    }

    protected void m7341a(boolean z) {
        m7342a(z, (String) null);
    }

    protected void m7342a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    protected void m7343b(ClassA c1685a) {
        for (Abstractn abstractC1738n : c1685a.f5104a) {
            if (abstractC1738n != null) {
                m7341a(abstractC1738n.m7352b() || abstractC1738n.m7346a() <= 1);
                if (abstractC1738n instanceof at) {
                    m7341a(((at) abstractC1738n).f5152j != null);
                }
                if (abstractC1738n instanceof bi) {
                    bi c1721bi = (bi) abstractC1738n;
                    m7341a(c1721bi.f5183g != null);
                    m7341a(c1721bi.m7346a() == 2);
                    if (c1721bi.m7347a(0).f5187f instanceof bh) {
                        m7341a(c1721bi.m7347a(1).f5187f instanceof ap);
                        m7341a(!c1721bi.f5238i);
                    } else {
                        if (!(c1721bi.m7347a(0).f5187f instanceof ap)) {
                            throw new IllegalStateException();
                        }
                        m7341a(c1721bi.m7347a(1).f5187f instanceof bh);
                        m7341a(c1721bi.f5238i);
                    }
                }
                if (abstractC1738n instanceof bj) {
                    m7341a(abstractC1738n.m7346a() == 1);
                    m7341a(abstractC1738n.m7347a(0).f5187f instanceof bi);
                }
                if (abstractC1738n instanceof ap) {
                    m7341a(((ap) abstractC1738n).f5151g != null);
                }
                if (abstractC1738n instanceof ba) {
                    m7341a(((ba) abstractC1738n).f5170g != null);
                }
                if (abstractC1738n instanceof Abstractw) {
                    m7341a(((Abstractw) abstractC1738n).f5236g != null);
                }
                if (abstractC1738n instanceof ClassV) {
                    m7341a(((ClassV) abstractC1738n).f5235g != null);
                }
                if (abstractC1738n instanceof Abstractx) {
                    Abstractx abstractC1748x = (Abstractx) abstractC1738n;
                    m7341a(abstractC1748x.m7346a() <= 1 || abstractC1748x.f5237h >= 0);
                } else {
                    m7341a(abstractC1738n.m7346a() <= 1 || (abstractC1738n instanceof bb));
                }
            }
        }
    }
}
