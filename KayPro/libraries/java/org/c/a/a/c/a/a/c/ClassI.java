package org.c.a.a.c.a.a.c;

import com.blankj.utilcode.constant.MemoryConstants;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.c.a.a.c.a.a.a.a.ClassA;
import org.c.a.a.c.a.a.a.a.ClassB;
import org.c.a.a.c.a.a.a.a.ClassE;
import org.c.a.a.c.a.a.a.a.ClassF;
import org.c.a.a.c.a.a.a.a.ClassH;
import org.c.a.a.d.ClassC;

public class ClassI {

    protected static final ClassJ f6139a = new ClassJ();

    private static int m8531a(ClassA c2085a) {
        int iM8544b;
        int iM8219d = c2085a.m8219d();
        if (c2085a.m8216c() == 512) {
            for (ClassB c2086b : c2085a.m8229j()) {
                int iM8547c = c2086b.m8238a() == null ? m8547c(c2086b.m8244c()) : m8544b(c2086b.m8244c());
                if (iM8219d < iM8547c) {
                    iM8219d = iM8547c;
                }
            }
            return iM8219d;
        }
        if (c2085a.m8216c() != 64) {
            return iM8219d;
        }
        Iterator it = c2085a.m8230k().iterator();
        ClassA c2085a2 = null;
        ClassA c2085a3 = null;
        while (it.hasNext()) {
            ClassA c2085aM8251c = ((ClassE) it.next()).m8251c();
            if (c2085a3 == null || c2085a3.m8219d() < c2085aM8251c.m8219d()) {
                c2085a2 = c2085a3;
                c2085a3 = c2085aM8251c;
            }
        }
        return (c2085a2 == null || iM8219d >= (iM8544b = m8544b(c2085a2))) ? iM8219d : iM8544b;
    }

    protected static BitSet m8532a(int i, BitSet bitSet, ClassA c2085a, ClassA c2085a2) {
        BitSet bitSet2 = new BitSet(i);
        m8540a(bitSet2, c2085a, c2085a2);
        if (bitSet == null) {
            return bitSet2;
        }
        bitSet.or(bitSet2);
        return bitSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List m8533a(ClassF c2090f, BitSet[] bitSetArr) {
        int iM8219d;
        ClassC c2247cM8261b = c2090f.m8261b();
        int size = c2247cM8261b.size();
        BitSet[] bitSetArr2 = new BitSet[size];
        for (int i = 0; i < size; i++) {
            ClassA c2085a = (ClassA) c2247cM8261b.get(i);
            BitSet bitSet = bitSetArr[i];
            switch (c2085a.m8216c()) {
                case 4:
                case 67108864:
                    break;
                case 64:
                    for (ClassE c2089e : c2085a.m8230k()) {
                        int iM8213b = c2089e.m8251c().m8213b();
                        if (iM8213b >= 0 && bitSet.get(iM8213b)) {
                            bitSetArr2[iM8213b] = m8532a(size, bitSetArr2[iM8213b], c2085a, c2089e.m8251c());
                        }
                    }
                    continue;
                    break;
                case 32768:
                    int iM8213b2 = c2085a.m8228i().m8213b();
                    if (iM8213b2 >= 0 && bitSet.get(iM8213b2)) {
                        bitSetArr2[iM8213b2] = m8532a(size, bitSetArr2[iM8213b2], c2085a, c2085a.m8228i());
                    }
                    break;
                default:
                    continue;
                    break;
            }
            int iM8213b3 = c2085a.m8227h().m8213b();
            if (iM8213b3 >= 0 && bitSet.get(iM8213b3)) {
                bitSetArr2[iM8213b3] = m8532a(size, bitSetArr2[iM8213b3], c2085a, c2085a.m8227h());
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (bitSetArr2[i2] != null) {
                BitSet bitSet2 = bitSetArr2[i2];
                int i3 = -1;
                int i4 = 0;
                while (i4 < size) {
                    if (!bitSet2.get(i4) || i3 >= (iM8219d = ((ClassA) c2247cM8261b.get(i4)).m8219d())) {
                        iM8219d = i3;
                    }
                    i4++;
                    i3 = iM8219d;
                }
                ClassA c2085a2 = (ClassA) c2247cM8261b.get(i2);
                BitSet bitSet3 = bitSetArr[i2];
                if (c2085a2.m8216c() == 512 && i3 != c2085a2.m8219d() && i3 < ((ClassB) c2085a2.m8229j().m8846h()).m8244c().m8219d()) {
                    ClassA c2085aM8227h = c2085a2.m8227h();
                    HashSet hashSetM8234o = c2085aM8227h.m8234o();
                    Iterator it = c2085a2.m8234o().iterator();
                    while (it.hasNext()) {
                        ClassA c2085a3 = (ClassA) it.next();
                        if (!bitSet3.get(c2085a3.m8213b())) {
                            it.remove();
                            c2085a3.m8210a(c2085a2, c2085aM8227h);
                            hashSetM8234o.add(c2085a3);
                        }
                    }
                    bitSet2.clear(c2085a2.m8213b());
                    bitSetArr2[c2085aM8227h.m8213b()] = bitSet2;
                    bitSetArr2[i2] = null;
                }
            }
        }
        ClassC c2247c = new ClassC();
        for (int i5 = 0; i5 < size; i5++) {
            if (bitSetArr2[i5] != null) {
                BitSet bitSet4 = bitSetArr2[i5];
                ClassA c2085a4 = (ClassA) c2247cM8261b.get(i5);
                BitSet bitSet5 = bitSetArr[i5];
                BitSet bitSet6 = new BitSet(size);
                bitSet6.or(bitSet5);
                bitSet6.flip(0, size);
                bitSet6.set(c2085a4.m8213b());
                if (c2085a4.m8216c() != 32768) {
                    c2247c.add(m8537a(c2247cM8261b, c2085a4, bitSet6, bitSet4));
                } else if (c2085a4.m8227h() == c2085a4 || c2085a4.m8228i() == c2085a4 || !bitSet4.get(c2085a4.m8227h().m8213b()) || !bitSet4.get(c2085a4.m8228i().m8213b())) {
                    c2247c.add(m8537a(c2247cM8261b, c2085a4, bitSet6, bitSet4));
                } else {
                    BitSet bitSet7 = new BitSet(size);
                    BitSet bitSet8 = new BitSet(size);
                    m8539a(bitSet7, bitSet4, c2085a4.m8227h(), c2085a4);
                    m8539a(bitSet8, bitSet4, c2085a4.m8228i(), c2085a4);
                    BitSet bitSet9 = (BitSet) bitSet7.clone();
                    bitSet9.and(bitSet8);
                    BitSet bitSet10 = new BitSet(size);
                    bitSet10.set(i5);
                    if (bitSet9.equals(bitSet10)) {
                        c2247c.add(m8537a(c2247cM8261b, c2085a4, bitSet6, bitSet4));
                        bitSet8.flip(0, size);
                        bitSet6.and(bitSet8);
                        bitSet6.set(c2085a4.m8213b());
                        c2247c.add(m8537a(c2247cM8261b, c2085a4, bitSet6, bitSet7));
                    } else {
                        c2247c.add(m8537a(c2247cM8261b, c2085a4, bitSet6, bitSet4));
                    }
                }
            }
        }
        Collections.sort(c2247c, f6139a);
        return c2247c;
    }

    protected static ClassA m8534a(Set set, ClassA c2085a) {
        boolean z;
        ClassA c2085aM8227h;
        Iterator it = c2085a.m8234o().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (!set.contains((ClassA) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            return c2085a;
        }
        Iterator it2 = set.iterator();
        while (true) {
            if (!it2.hasNext()) {
                c2085aM8227h = null;
                break;
            }
            ClassA c2085a2 = (ClassA) it2.next();
            if (!c2085a2.m8221d(876822149)) {
                if (c2085a2.m8216c() == 32768) {
                    ClassA c2085aM8227h2 = c2085a2.m8227h();
                    if (c2085aM8227h2 != c2085a && !set.contains(c2085aM8227h2)) {
                        c2085aM8227h = c2085aM8227h2;
                        break;
                    }
                    c2085aM8227h = c2085a2.m8228i();
                    if (c2085aM8227h != c2085a && !set.contains(c2085aM8227h)) {
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                c2085aM8227h = c2085a2.m8227h();
                if (c2085aM8227h != c2085a && !set.contains(c2085aM8227h)) {
                    break;
                }
            }
        }
        if (c2085aM8227h == null || c2085a.m8219d() >= c2085aM8227h.m8219d()) {
            return c2085a;
        }
        if (c2085a.m8221d(56)) {
            set.add(c2085a);
            return c2085aM8227h;
        }
        if (!c2085a.m8221d(876822149) || c2085a.m8227h() != c2085aM8227h) {
            return c2085a;
        }
        set.add(c2085a);
        return c2085aM8227h;
    }

    protected static ClassA m8535a(ClassA c2085a, ClassA c2085a2) {
        HashSet hashSet = new HashSet();
        hashSet.add(c2085a);
        c2085a2.m8234o().remove(c2085a);
        return c2085a.m8205a().m8257a(MemoryConstants.f4579GB, c2085a.m8219d(), c2085a2.m8219d(), hashSet);
    }

    protected static ClassA m8536a(ClassH c2092h) {
        ClassA c2085aM8264a = c2092h.m8264a();
        HashSet<ClassA> hashSetM8266b = c2092h.m8266b();
        ClassA c2085aM8268c = c2092h.m8268c();
        int iM8222e = c2085aM8264a.m8222e();
        ClassA c2085aM8534a = m8534a(hashSetM8266b, c2085aM8268c);
        ClassA c2085aM8256a = c2085aM8264a.m8205a().m8256a(4194304, c2085aM8264a.m8219d(), c2085aM8264a.m8222e());
        Iterator it = c2085aM8264a.m8234o().iterator();
        while (it.hasNext()) {
            ClassA c2085a = (ClassA) it.next();
            if (!hashSetM8266b.contains(c2085a)) {
                c2085a.m8210a(c2085aM8264a, c2085aM8256a);
                c2085aM8256a.m8234o().add(c2085a);
                it.remove();
            }
        }
        c2085aM8256a.m8220d(c2085aM8264a);
        int iM8222e2 = iM8222e;
        for (ClassA c2085a2 : hashSetM8266b) {
            if (c2085a2.m8221d(876822149)) {
                ClassA c2085aM8227h = c2085a2.m8227h();
                if (c2085aM8227h == c2085aM8264a) {
                    c2085a2.m8209a(ClassA.f5963e);
                } else if (c2085aM8227h == c2085aM8534a) {
                    c2085a2.m8209a(ClassA.f5965g);
                } else if (!hashSetM8266b.contains(c2085aM8227h) && c2085aM8227h.m8234o().size() > 1) {
                    c2085a2.m8209a(m8535a(c2085a2, c2085aM8227h));
                }
            } else if (c2085a2.m8216c() == 32768) {
                ClassA c2085aM8227h2 = c2085a2.m8227h();
                if (c2085aM8227h2 == c2085aM8264a) {
                    c2085a2.m8209a(ClassA.f5963e);
                } else if (c2085aM8227h2 == c2085aM8534a) {
                    c2085a2.m8209a(ClassA.f5965g);
                } else if (!hashSetM8266b.contains(c2085aM8227h2) && c2085aM8227h2.m8234o().size() > 1) {
                    c2085a2.m8209a(m8535a(c2085a2, c2085aM8227h2));
                }
                ClassA c2085aM8228i = c2085a2.m8228i();
                if (c2085aM8228i == c2085aM8264a) {
                    c2085a2.m8215b(ClassA.f5963e);
                } else if (c2085aM8228i == c2085aM8534a) {
                    c2085a2.m8215b(ClassA.f5965g);
                } else if (!hashSetM8266b.contains(c2085aM8228i) && c2085aM8228i.m8234o().size() > 1) {
                    c2085a2.m8215b(m8535a(c2085a2, c2085aM8228i));
                }
            } else if (c2085a2.m8216c() == 64) {
                for (ClassE c2089e : c2085a2.m8230k()) {
                    ClassA c2085aM8251c = c2089e.m8251c();
                    if (c2085aM8251c == c2085aM8264a) {
                        c2089e.m8248a(ClassA.f5963e);
                    } else if (c2085aM8251c == c2085aM8534a) {
                        c2089e.m8248a(ClassA.f5965g);
                    } else if (!hashSetM8266b.contains(c2085aM8251c) && c2085aM8251c.m8234o().size() > 1) {
                        c2089e.m8248a(m8535a(c2085a2, c2085aM8251c));
                    }
                }
            }
            if (iM8222e2 < c2085a2.m8222e()) {
                iM8222e2 = c2085a2.m8222e();
            }
        }
        if (c2085aM8534a != null) {
            c2085aM8256a.m8209a(c2085aM8534a);
            c2085aM8534a.m8208a(hashSetM8266b, c2085aM8256a);
        }
        c2085aM8264a.m8234o().clear();
        c2085aM8256a.m8217c(iM8222e2);
        return c2085aM8256a;
    }

    protected static ClassH m8537a(List list, ClassA c2085a, BitSet bitSet, BitSet bitSet2) {
        ClassA c2085a2;
        int iM8531a;
        int size = list.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            if (!bitSet2.get(i2) || i >= (iM8531a = m8531a((ClassA) list.get(i2)))) {
                iM8531a = i;
            }
            i2++;
            i = iM8531a;
        }
        bitSet2.clear();
        m8538a(bitSet2, bitSet, c2085a, i);
        HashSet<ClassA> hashSet = new HashSet(bitSet2.cardinality());
        for (int i3 = 0; i3 < size; i3++) {
            if (bitSet2.get(i3)) {
                hashSet.add((ClassA) list.get(i3));
            }
        }
        ClassA c2085aM8227h = ClassA.f5966h;
        if (c2085a.m8216c() == 32768) {
            if (!bitSet2.get(c2085a.m8228i().m8213b())) {
                c2085aM8227h = c2085a.m8228i();
            } else if (!bitSet2.get(c2085a.m8227h().m8213b())) {
                c2085aM8227h = c2085a.m8227h();
            }
        }
        if (c2085aM8227h == ClassA.f5966h) {
            int iM8219d = i;
            c2085a2 = c2085aM8227h;
            for (ClassA c2085a3 : hashSet) {
                switch (c2085a3.m8216c()) {
                    case 4:
                    case 67108864:
                        break;
                    case 64:
                        Iterator it = c2085a3.m8230k().iterator();
                        int iM8219d2 = iM8219d;
                        while (it.hasNext()) {
                            ClassA c2085aM8251c = ((ClassE) it.next()).m8251c();
                            if (!bitSet2.get(c2085aM8251c.m8213b()) && iM8219d2 < c2085aM8251c.m8219d()) {
                                iM8219d2 = c2085aM8251c.m8219d();
                                c2085a2 = c2085aM8251c;
                            }
                        }
                        iM8219d = iM8219d2;
                        continue;
                    case 512:
                        ClassA c2085aM8227h2 = c2085a3.m8227h();
                        if (!bitSet2.get(c2085aM8227h2.m8213b()) && iM8219d < c2085aM8227h2.m8219d()) {
                            iM8219d = c2085aM8227h2.m8219d();
                            c2085a2 = c2085aM8227h2;
                        }
                        Iterator it2 = c2085a3.m8229j().iterator();
                        int iM8219d3 = iM8219d;
                        while (it2.hasNext()) {
                            ClassA c2085aM8244c = ((ClassB) it2.next()).m8244c();
                            if (!bitSet2.get(c2085aM8244c.m8213b()) && iM8219d3 < c2085aM8244c.m8219d()) {
                                iM8219d3 = c2085aM8244c.m8219d();
                                c2085a2 = c2085aM8244c;
                            }
                        }
                        iM8219d = iM8219d3;
                        continue;
                    case 32768:
                        ClassA c2085aM8228i = c2085a3.m8228i();
                        if (!bitSet2.get(c2085aM8228i.m8213b()) && iM8219d < c2085aM8228i.m8219d()) {
                            iM8219d = c2085aM8228i.m8219d();
                            c2085a2 = c2085aM8228i;
                        }
                        break;
                    default:
                        continue;
                }
                ClassA c2085aM8227h3 = c2085a3.m8227h();
                if (!bitSet2.get(c2085aM8227h3.m8213b()) && iM8219d < c2085aM8227h3.m8219d()) {
                    iM8219d = c2085aM8227h3.m8219d();
                    c2085a2 = c2085aM8227h3;
                }
            }
        } else {
            c2085a2 = c2085aM8227h;
        }
        if (c2085a2 != ClassA.f5966h) {
            HashSet<ClassA> hashSet2 = new HashSet(hashSet);
            HashSet hashSet3 = new HashSet();
            for (ClassA c2085a4 : hashSet2) {
                if (c2085a4.m8216c() == 32768 && c2085a4 != c2085a) {
                    hashSet3.clear();
                    if (m8541a(hashSet, bitSet, hashSet3, c2085a4.m8227h(), c2085a2)) {
                        hashSet.addAll(hashSet3);
                    }
                    hashSet3.clear();
                    if (m8541a(hashSet, bitSet, hashSet3, c2085a4.m8228i(), c2085a2)) {
                        hashSet.addAll(hashSet3);
                    }
                }
            }
        }
        return new ClassH(c2085a, hashSet, c2085a2);
    }

    protected static void m8538a(BitSet bitSet, BitSet bitSet2, ClassA c2085a, int i) {
        if (c2085a.m8221d(58720514) || bitSet.get(c2085a.m8213b()) || !bitSet2.get(c2085a.m8213b()) || c2085a.m8219d() > i) {
            return;
        }
        bitSet.set(c2085a.m8213b());
        m8538a(bitSet, bitSet2, c2085a.m8227h(), i);
        m8538a(bitSet, bitSet2, c2085a.m8228i(), i);
        Iterator it = c2085a.m8230k().iterator();
        while (it.hasNext()) {
            m8538a(bitSet, bitSet2, ((ClassE) it.next()).m8251c(), i);
        }
        Iterator it2 = c2085a.m8229j().iterator();
        while (it2.hasNext()) {
            m8538a(bitSet, bitSet2, ((ClassB) it2.next()).m8244c(), i);
        }
        if (c2085a.m8216c() == 268435456) {
            bitSet.set(c2085a.m8227h().m8213b());
        }
    }

    protected static void m8539a(BitSet bitSet, BitSet bitSet2, ClassA c2085a, ClassA c2085a2) {
        if (c2085a.m8221d(1266696506) || bitSet.get(c2085a.m8213b()) || !bitSet2.get(c2085a.m8213b())) {
            return;
        }
        bitSet.set(c2085a.m8213b());
        if (c2085a != c2085a2) {
            m8539a(bitSet, bitSet2, c2085a.m8227h(), c2085a2);
            m8539a(bitSet, bitSet2, c2085a.m8228i(), c2085a2);
            Iterator it = c2085a.m8230k().iterator();
            while (it.hasNext()) {
                m8539a(bitSet, bitSet2, ((ClassE) it.next()).m8251c(), c2085a2);
            }
            Iterator it2 = c2085a.m8229j().iterator();
            while (it2.hasNext()) {
                m8539a(bitSet, bitSet2, ((ClassB) it2.next()).m8244c(), c2085a2);
            }
            if (c2085a.m8216c() == 268435456) {
                bitSet.set(c2085a.m8227h().m8213b());
            }
        }
    }

    protected static void m8540a(BitSet bitSet, ClassA c2085a, ClassA c2085a2) {
        if (bitSet.get(c2085a.m8213b())) {
            return;
        }
        bitSet.set(c2085a.m8213b());
        if (c2085a != c2085a2) {
            Iterator it = c2085a.m8234o().iterator();
            while (it.hasNext()) {
                m8540a(bitSet, (ClassA) it.next(), c2085a2);
            }
        }
    }

    protected static boolean m8541a(HashSet hashSet, BitSet bitSet, HashSet hashSet2, ClassA c2085a, ClassA c2085a2) {
        if (c2085a == c2085a2 || hashSet.contains(c2085a) || hashSet2.contains(c2085a)) {
            return true;
        }
        if (c2085a.m8221d(876822149)) {
            if (m8546b(c2085a.m8227h(), bitSet) && m8542a(c2085a, bitSet)) {
                hashSet2.add(c2085a);
                return m8541a(hashSet, bitSet, hashSet2, c2085a.m8227h(), c2085a2);
            }
            bitSet.clear(c2085a.m8213b());
            return true;
        }
        if (c2085a.m8216c() == 32768) {
            if (m8546b(c2085a.m8227h(), bitSet) && m8546b(c2085a.m8228i(), bitSet) && m8542a(c2085a, bitSet)) {
                hashSet2.add(c2085a);
                return m8541a(hashSet, bitSet, hashSet2, c2085a.m8227h(), c2085a2) | m8541a(hashSet, bitSet, hashSet2, c2085a.m8228i(), c2085a2);
            }
            bitSet.clear(c2085a.m8213b());
            return true;
        }
        if (!c2085a.m8221d(1266696506)) {
            return false;
        }
        if (m8542a(c2085a, bitSet)) {
            hashSet2.add(c2085a);
            return true;
        }
        if (c2085a.m8213b() < 0) {
            return true;
        }
        bitSet.clear(c2085a.m8213b());
        return true;
    }

    protected static boolean m8542a(ClassA c2085a, BitSet bitSet) {
        Iterator it = c2085a.m8234o().iterator();
        while (it.hasNext()) {
            if (!m8546b((ClassA) it.next(), bitSet)) {
                return false;
            }
        }
        return true;
    }

    public static BitSet[] m8543a(ClassF c2090f) {
        boolean z;
        ClassC<ClassA> c2247cM8261b = c2090f.m8261b();
        int size = c2247cM8261b.size();
        BitSet[] bitSetArr = new BitSet[size];
        BitSet bitSet = new BitSet(size);
        bitSet.set(0);
        bitSetArr[0] = bitSet;
        for (int i = 0; i < size; i++) {
            BitSet bitSet2 = new BitSet(size);
            bitSet2.flip(0, size);
            bitSetArr[i] = bitSet2;
        }
        BitSet bitSet3 = bitSetArr[0];
        bitSet3.clear();
        bitSet3.set(0);
        do {
            z = false;
            for (ClassA c2085a : c2247cM8261b) {
                int iM8213b = c2085a.m8213b();
                BitSet bitSet4 = bitSetArr[iM8213b];
                BitSet bitSet5 = (BitSet) bitSet4.clone();
                Iterator it = c2085a.m8234o().iterator();
                while (it.hasNext()) {
                    bitSet4.and(bitSetArr[((ClassA) it.next()).m8213b()]);
                }
                bitSet4.set(iM8213b);
                z = (!bitSet5.equals(bitSet4)) | z;
            }
        } while (z);
        return bitSetArr;
    }

    private static int m8544b(ClassA c2085a) {
        return (c2085a.m8227h().m8216c() == 512 && ClassC.m8507b(c2085a) == 194) ? m8547c(((ClassB) c2085a.m8227h().m8229j().m8846h()).m8244c()) : c2085a.m8219d();
    }

    public static void m8545b(ClassF c2090f) {
        List listM8533a = m8533a(c2090f, m8543a(c2090f));
        int size = listM8533a.size();
        for (int i = 0; i < size; i++) {
            ClassH c2092h = (ClassH) listM8533a.get(i);
            ClassA c2085aM8264a = c2092h.m8264a();
            ClassA c2085aM8536a = m8536a(c2092h);
            for (int i2 = size - 1; i2 > i; i2--) {
                ClassH c2092h2 = (ClassH) listM8533a.get(i2);
                if (c2092h2.m8264a() == c2085aM8264a) {
                    c2092h2.m8265a(c2085aM8536a);
                }
                if (c2092h2.m8266b().contains(c2085aM8264a)) {
                    c2092h2.m8266b().removeAll(c2092h.m8266b());
                    c2092h2.m8266b().add(c2085aM8536a);
                }
                if (c2092h2.m8268c() == c2085aM8264a) {
                    c2092h2.m8267b(c2085aM8536a);
                }
            }
        }
    }

    protected static boolean m8546b(ClassA c2085a, BitSet bitSet) {
        return c2085a.m8221d(1249918994) || bitSet.get(c2085a.m8213b());
    }

    private static int m8547c(ClassA c2085a) {
        int iM8219d = c2085a.m8219d();
        BitSet bitSet = new BitSet();
        while (!c2085a.m8221d(1266696506) && !bitSet.get(c2085a.m8213b())) {
            bitSet.set(c2085a.m8213b());
            c2085a = c2085a.m8227h();
        }
        return c2085a.m8216c() == 8 ? c2085a.m8219d() : iM8219d;
    }
}
