package a.d.a;

import a.b.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import a.b.f.ClassI;
import a.b.g.ClassH;

public class aw extends Abstractap {

    private static final boolean f509a;

    protected final String f510b;

    protected final c f511c;

    protected final boolean f512d;

    protected final boolean f513e;

    static {
        f509a = System.getProperty("allow.incomplete.class.hierarchy") != null;
    }

    public aw(String str, c cVar, boolean z, boolean z2) {
        this.f510b = str;
        this.f511c = cVar;
        this.f512d = z;
        this.f513e = z2;
    }

    private int m1583a(c cVar, Set set) {
        int i = 0;
        Iterator it = set.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = cVar.c((c) it.next()) ? i2 + 1 : i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private c m1584a(c cVar, c cVar2, boolean z) {
        HashSet hashSet;
        boolean z2;
        boolean z3;
        int size;
        int i;
        c cVar3;
        int iM1583a;
        c cVar4;
        int i2;
        c cVarE = null;
        Set<c> hashSet2 = new HashSet();
        cVar.a(!z, !z, z, false, new ClassH(hashSet2));
        int size2 = hashSet2.size();
        if (size2 != 0) {
            hashSet = new HashSet();
            if (z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                z3 = false;
            } else {
                z3 = true;
            }
            cVar2.a(z2, z3, z, false, new ClassH(hashSet));
            size = hashSet.size();
            if (size != 0) {
                hashSet2.retainAll(hashSet);
                if (z || !hashSet2.isEmpty()) {
                    i = -1;
                    cVar3 = null;
                    for (c cVar5 : hashSet2) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a || (i == iM1583a && cVar3 != null && cVar3.b().compareTo(cVar5.b()) > 0)) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            i2 = i;
                            cVar4 = cVar3;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        for (c cVar6 : Arrays.asList(cVar, cVar2)) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0 && "java/lang/Object".equals(cVar6.c())) {
                                cVarE = cVar6.e();
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                }
            } else if (!z) {
                if (cVar2.c() != null) {
                    throw new IllegalArgumentException("Can't find any super classes of [" + cVar2.b() + "] (not even immediate super class [" + cVar2.c() + "])");
                }
                hashSet2.retainAll(hashSet);
                if (z) {
                    i = -1;
                    cVar3 = null;
                    while (r10.hasNext()) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        while (r1.hasNext()) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0) {
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                } else {
                    i = -1;
                    cVar3 = null;
                    while (r10.hasNext()) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        while (r1.hasNext()) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0) {
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                }
            }
        } else if (!z) {
            if (cVar.c() != null) {
                throw new IllegalArgumentException("Can't find any super classes of [" + cVar.b() + "] (not even immediate super class [" + cVar.c() + "])");
            }
            hashSet = new HashSet();
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                z3 = true;
            } else {
                z3 = false;
            }
            cVar2.a(z2, z3, z, false, new ClassH(hashSet));
            size = hashSet.size();
            if (size != 0) {
                hashSet2.retainAll(hashSet);
                if (z) {
                    i = -1;
                    cVar3 = null;
                    while (r10.hasNext()) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        while (r1.hasNext()) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0) {
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                } else {
                    i = -1;
                    cVar3 = null;
                    while (r10.hasNext()) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        while (r1.hasNext()) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0) {
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                }
            } else if (!z) {
                if (cVar2.c() != null) {
                    throw new IllegalArgumentException("Can't find any super classes of [" + cVar2.b() + "] (not even immediate super class [" + cVar2.c() + "])");
                }
                hashSet2.retainAll(hashSet);
                if (z) {
                    i = -1;
                    cVar3 = null;
                    while (r10.hasNext()) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        while (r1.hasNext()) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0) {
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                } else {
                    i = -1;
                    cVar3 = null;
                    while (r10.hasNext()) {
                        iM1583a = m1583a(cVar5, hashSet2);
                        if (i >= iM1583a) {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        } else {
                            cVar4 = cVar5;
                            i2 = iM1583a;
                        }
                        cVar3 = cVar4;
                        i = i2;
                    }
                    if (cVar3 == null) {
                        while (r1.hasNext()) {
                            if ("java/lang/Object".equals(cVar6.b())) {
                                cVarE = cVar6;
                            } else if ((cVar6.a() & 16) == 0) {
                            }
                        }
                        cVarE = cVar3;
                    } else {
                        cVarE = cVar3;
                    }
                    if (cVarE == null) {
                        throw new IllegalArgumentException("Can't find common super class of [" + cVar.b() + "] (with " + size2 + " known super classes) and [" + cVar2.b() + "] (with " + size + " known super classes)");
                    }
                }
            }
        }
        return cVarE;
    }

    private static Abstractap m1585a(aw c0198aw, boolean z, boolean z2) {
        return (c0198aw.getClass() == aw.class && c0198aw.f512d == z) ? c0198aw.m1586a(z2) : new aw(c0198aw.f510b, c0198aw.f511c, z, z2);
    }

    @Override
    public int mo1536a(String str, c cVar) {
        int i = 0;
        String str2 = this.f510b;
        if (str2 == null) {
            return -1;
        }
        int iM774g = ClassI.m774g(str2);
        int iM774g2 = ClassI.m774g(str);
        int iMin = Math.min(iM774g, iM774g2);
        String strSubstring = str2.substring(iMin);
        String strSubstring2 = str.substring(iMin);
        if (iMin > 0 && (ClassI.m755a(strSubstring.charAt(0)) || ClassI.m755a(strSubstring2.charAt(0)))) {
            if (strSubstring.equals(strSubstring2)) {
                return this.f513e ? 0 : 1;
            }
            return -1;
        }
        if (iM774g == iMin) {
            strSubstring = ClassI.m792o(strSubstring);
        }
        if (iM774g2 == iMin) {
            strSubstring2 = ClassI.m792o(strSubstring2);
        }
        if (iM774g > iM774g2 && !ClassI.m779h(strSubstring2)) {
            return -1;
        }
        if (iM774g < iM774g2 && !ClassI.m779h(strSubstring)) {
            return -1;
        }
        if (strSubstring.equals(strSubstring2) || "java/lang/Object".equals(strSubstring2) || iM774g > iM774g2) {
            return this.f513e ? 0 : 1;
        }
        if (iM774g < iM774g2) {
            return 0;
        }
        if (this.f511c != null && cVar != null) {
            if (this.f511c.c(cVar)) {
                if (!this.f513e) {
                    i = 1;
                }
            } else if ((this.f511c.a() & 16) != 0) {
                i = -1;
            } else if ((this.f511c.a() & 512) == 0 && (cVar.a() & 512) == 0 && !cVar.c(this.f511c)) {
                i = -1;
            }
        }
        return i;
    }

    @Override
    public Abstractap mo1305a(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1539a(this);
    }

    @Override
    public Abstractap mo1539a(aw c0198aw) {
        Abstractap c0198aw2;
        c cVarM1584a;
        if (equals(c0198aw)) {
            return this;
        }
        String str = this.f510b;
        String str2 = c0198aw.f510b;
        if (str == null && str2 == null) {
            return ax.f514f;
        }
        if (str == null) {
            return c0198aw.m1586a(true);
        }
        if (str2 == null) {
            return m1586a(true);
        }
        boolean z = this.f512d || c0198aw.f512d;
        boolean z2 = this.f513e || c0198aw.f513e;
        if (str.equals(str2)) {
            return m1585a(this, z, z2);
        }
        int iM774g = ClassI.m774g(str);
        int iM774g2 = ClassI.m774g(str2);
        int iMin = Math.min(iM774g, iM774g2);
        if (iM774g == iM774g2) {
            c cVar = this.f511c;
            c cVar2 = c0198aw.f511c;
            if (cVar != null && cVar2 != null) {
                if (cVar.c(cVar2)) {
                    return m1585a(c0198aw, true, z2);
                }
                if (cVar2.c(cVar)) {
                    return m1585a(this, true, z2);
                }
                try {
                    c cVarM1584a2 = m1584a(cVar, cVar2, false);
                    if (cVarM1584a2.b().equals("java/lang/Object") && (cVarM1584a = m1584a(cVar, cVar2, true)) != null) {
                        cVarM1584a2 = cVarM1584a;
                    }
                    return new aw(iMin == 0 ? cVarM1584a2.b() : ClassI.m750a(cVarM1584a2.b(), iMin), cVarM1584a2, z, z2);
                } catch (IllegalArgumentException e) {
                    if (f509a) {
                        return ClassC.f521e;
                    }
                    throw e;
                }
            }
        } else if (iM774g > iM774g2) {
            if (ClassI.m779h(ClassI.m792o(str2))) {
                return m1585a(c0198aw, true, z2);
            }
        } else if (iM774g < iM774g2 && ClassI.m779h(ClassI.m792o(str))) {
            return m1585a(this, true, z2);
        }
        if (iMin > 0 && (ClassI.m755a(str2.charAt(iMin)) || ClassI.m755a(str.charAt(iMin)))) {
            iMin--;
        }
        if (iMin != 0) {
            c0198aw2 = new aw(ClassI.m750a("java/lang/Object", iMin), null, true, z2);
        } else {
            c0198aw2 = z2 ? ax.f515g : ax.f516h;
        }
        return c0198aw2;
    }

    @Override
    public Abstractap mo1542a(String str, c cVar, Interfacebe interfaceC0207be, boolean z) {
        if (this.f510b == null || !this.f510b.equals(str)) {
            return (z || !(this.f510b == null || mo1536a(this.f510b, cVar) == 1)) ? interfaceC0207be.mo1313b(str, cVar, true, this.f513e) : this;
        }
        return this;
    }

    public Abstractap m1586a(boolean z) {
        return this.f513e == z ? this : new aw(this.f510b, this.f511c, this.f512d, true);
    }

    @Override
    public int mo1307b(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1545b(this);
    }

    @Override
    public int mo1545b(aw c0198aw) {
        if (this.f510b == null) {
            if (c0198aw.f510b == null) {
                return 1;
            }
            return !c0198aw.f513e ? -1 : 0;
        }
        if (c0198aw.f510b == null) {
            return !this.f513e ? -1 : 0;
        }
        return (this.f512d || c0198aw.f512d || this.f510b.equals(c0198aw.f510b)) ? 0 : -1;
    }

    @Override
    public boolean mo1321c() {
        return this.f510b == null;
    }

    @Override
    public Abstractap mo1554e(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        if (this.f510b == null) {
            return ax.f514f;
        }
        return !ClassI.m773f(this.f510b) ? ax.f515g : interfaceC0207be.mo1591a(this.f510b.substring(1), this.f511c, true, true).mo1558l_();
    }

    @Override
    public String mo1555e() {
        return this.f510b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        aw c0198aw = (aw) obj;
        if (this.f510b == null) {
            return c0198aw.f510b == null;
        }
        return this.f512d == c0198aw.f512d && this.f513e == c0198aw.f513e && this.f510b.equals(c0198aw.f510b);
    }

    @Override
    public c mo1556f() {
        return this.f511c;
    }

    @Override
    public boolean mo1557h() {
        return this.f512d;
    }

    @Override
    public int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = getClass().hashCode();
        if (this.f510b != null) {
            iHashCode = (this.f513e ? 0 : 2) ^ ((this.f512d ? 0 : 1) ^ this.f510b.hashCode());
        }
        return iHashCode2 ^ iHashCode;
    }

    @Override
    public final String mo1334k() {
        if (this.f510b == null) {
            return "Ljava/lang/Object;";
        }
        return ClassI.m773f(this.f510b) ? this.f510b : 'L' + this.f510b + ';';
    }

    @Override
    public int mo1559m() {
        if (this.f510b == null) {
            return 1;
        }
        return this.f513e ? 0 : -1;
    }

    @Override
    public String toString() {
        if (this.f510b == null) {
            return "n";
        }
        return this.f510b + (this.f511c == null ? "?" : "") + (this.f512d ? "" : "=") + (this.f513e ? "" : "!");
    }
}
