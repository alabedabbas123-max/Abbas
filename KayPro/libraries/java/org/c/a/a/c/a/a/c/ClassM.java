package org.c.a.a.c.a.a.c;

import com.blankj.utilcode.constant.MemoryConstants;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import org.c.a.a.b.a.a.ClassF;
import org.c.a.a.c.a.a.a.a.ClassA;
import org.c.a.a.c.a.a.a.a.ClassB;
import org.c.a.a.c.a.a.a.a.ClassE;
import org.c.a.a.c.a.a.a.a.ClassF;
import org.c.a.a.d.ClassC;

public class ClassM {

    static final boolean f6142a;

    static {
        f6142a = !ClassM.class.desiredAssertionStatus();
    }

    protected static ClassA m8552a(BitSet bitSet, ClassA c2085a) {
        if (!c2085a.m8221d(1266696506) && !bitSet.get(c2085a.m8213b())) {
            bitSet.set(c2085a.m8213b());
            switch (c2085a.m8216c()) {
                case 1:
                case 4:
                case 64:
                case 128:
                case 512:
                case 1024:
                case 2048:
                case 4096:
                case 8192:
                case 131072:
                case 4194304:
                    return m8552a(bitSet, c2085a.m8227h());
                case 32768:
                case 65536:
                case 262144:
                case 524288:
                case 1048576:
                    ClassA c2085aM8552a = m8552a(bitSet, c2085a.m8228i());
                    if (c2085aM8552a != null) {
                        return c2085aM8552a;
                    }
                    ClassA c2085aM8552a2 = m8552a(bitSet, c2085a.m8227h());
                    return c2085aM8552a2 != null ? c2085aM8552a2 : c2085a;
            }
        }
        return null;
    }

    protected static ClassA m8553a(BitSet bitSet, ClassA c2085a, ClassA c2085a2) {
        if (c2085a2 == null) {
            return null;
        }
        if (c2085a.m8219d() < c2085a2.m8219d()) {
            if (c2085a.mo8224f() == 0) {
                if (c2085a2.m8221d(876822149) && c2085a2.m8227h().m8216c() == 8388608) {
                    int iM8515c = ClassC.m8515c(c2085a2);
                    while (iM8515c != 0) {
                        HashSet hashSetM8234o = c2085a.m8234o();
                        if (hashSetM8234o.size() != 1) {
                            break;
                        }
                        ClassA c2085a3 = (ClassA) hashSetM8234o.iterator().next();
                        iM8515c += ClassC.m8515c(c2085a3);
                        c2085a2 = c2085a3;
                    }
                    m8587h(c2085a2);
                    return c2085a2;
                }
            } else if (c2085a.mo8224f() > c2085a2.mo8224f()) {
                m8587h(c2085a2);
                return c2085a2;
            }
        }
        return m8573c(bitSet, c2085a2);
    }

    protected static ClassA m8554a(ClassA c2085a, BitSet bitSet) {
        for (ClassB c2086b : c2085a.m8229j()) {
            if (c2086b.m8238a() == null) {
                ClassA c2085aM8244c = c2086b.m8244c();
                if (c2085aM8244c.m8216c() == 4) {
                    ClassA c2085aM8227h = c2085aM8244c.m8227h();
                    if (c2085aM8227h.m8216c() == 8192 && c2085aM8227h.m8227h().m8216c() == 8) {
                        ClassA c2085aM8228i = c2085aM8227h.m8228i();
                        bitSet.set(c2085aM8228i.m8213b());
                        return c2085aM8228i;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    protected static void m8555a(int i, ClassA c2085a, ClassA c2085a2, ClassA c2085a3, ClassA c2085a4, ClassA c2085a5, ClassA c2085a6) {
        ClassA c2085aM8259a = c2085a.m8205a().m8259a(c2085a);
        int iM8222e = c2085a5.m8222e();
        if (iM8222e == 0 && (iM8222e = c2085a3.m8222e()) == 0) {
            iM8222e = c2085a.m8222e();
        }
        c2085a3.m8209a(ClassA.f5966h);
        c2085a6.m8234o().remove(c2085a3);
        c2085a5.m8209a(ClassA.f5966h);
        c2085a6.m8234o().remove(c2085a5);
        c2085a6.m8234o().add(c2085a);
        c2085a.m8206a(i);
        c2085a.m8217c(iM8222e);
        c2085a.m8218c(c2085aM8259a);
        c2085a.m8220d(c2085a2);
        c2085a.m8223e(c2085a4);
        c2085a.m8209a(c2085a6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[LOOP:0: B:17:0x004b->B:20:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:1: B:26:0x009b->B:28:0x00a1, LOOP_END] */
    protected static void m8556a(BitSet bitSet, ClassA c2085a, int i, HashSet hashSet) {
        Iterator it;
        Iterator it2;
        if (c2085a.m8221d(1266696506)) {
            return;
        }
        if (c2085a.m8219d() >= i) {
            hashSet.add(c2085a);
        }
        if (bitSet.get(c2085a.m8213b())) {
            return;
        }
        bitSet.set(c2085a.m8213b());
        switch (c2085a.m8216c()) {
            case 1:
            case 4:
            case 4194304:
            case 67108864:
            case 268435456:
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                break;
            case 64:
                it = c2085a.m8230k().iterator();
                while (it.hasNext()) {
                    m8556a(bitSet, ((ClassE) it.next()).m8251c(), i, hashSet);
                }
                break;
            case 128:
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                it = c2085a.m8230k().iterator();
                while (it.hasNext()) {
                    m8556a(bitSet, ((ClassE) it.next()).m8251c(), i, hashSet);
                }
                break;
            case 512:
                it2 = c2085a.m8229j().iterator();
                while (it2.hasNext()) {
                    m8556a(bitSet, ((ClassB) it2.next()).m8244c(), i, hashSet);
                }
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                break;
            case 1024:
            case 2048:
            case 4096:
                m8556a(bitSet, c2085a.m8232m(), i, hashSet);
                it2 = c2085a.m8229j().iterator();
                while (it2.hasNext()) {
                    m8556a(bitSet, ((ClassB) it2.next()).m8244c(), i, hashSet);
                }
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                break;
            case 8192:
            case 32768:
            case 262144:
                m8556a(bitSet, c2085a.m8228i(), i, hashSet);
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                break;
            case 65536:
                m8556a(bitSet, c2085a.m8232m(), i, hashSet);
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                break;
            case 131072:
            case 536870912:
                m8556a(bitSet, c2085a.m8233n(), i, hashSet);
                m8556a(bitSet, c2085a.m8232m(), i, hashSet);
                m8556a(bitSet, c2085a.m8227h(), i, hashSet);
                break;
            case 524288:
            case 1048576:
                m8556a(bitSet, c2085a.m8232m(), i, hashSet);
                m8556a(bitSet, c2085a.m8233n(), i, hashSet);
                break;
        }
    }

    protected static void m8557a(ClassA c2085a, ClassA c2085a2) {
        int iM8219d = c2085a2.m8219d();
        int iM8222e = c2085a2.m8222e();
        ClassA c2085aM8227h = c2085a2.m8227h();
        ClassA c2085aM8228i = c2085a2.m8228i();
        if (c2085a.m8216c() == 32768) {
            c2085a.m8206a(262144);
        }
        if (c2085a2.m8216c() == 262144 && !c2085a2.m8235p()) {
            c2085a.m8236q();
        }
        c2085a2.m8206a(c2085a.m8216c());
        c2085a2.m8214b(c2085a.m8219d());
        c2085a2.m8217c(c2085a.m8222e());
        c2085a2.m8209a(ClassA.f5966h);
        c2085a2.m8215b(ClassA.f5966h);
        c2085a2.m8218c(c2085a.m8231l());
        c2085a2.m8220d(c2085a.m8232m());
        c2085a2.m8223e(c2085a.m8233n());
        c2085a2.m8234o().clear();
        c2085a.m8206a(2097152);
        c2085a.m8214b(iM8219d);
        c2085a.m8217c(iM8222e);
        c2085a.m8218c(c2085a2);
        c2085a.m8220d(c2085a.m8227h());
        c2085a.m8223e(c2085a.m8228i());
        c2085a.m8209a(c2085aM8227h);
        c2085a.m8215b(c2085aM8228i);
        c2085a.m8232m().m8209a(ClassA.f5966h);
        c2085a.m8233n().m8209a(ClassA.f5966h);
        c2085aM8227h.m8210a(c2085a2, c2085a);
        c2085aM8228i.m8210a(c2085a2, c2085a);
        c2085a.m8232m().m8234o().clear();
        c2085a.m8233n().m8234o().clear();
    }

    protected static void m8558a(ClassA c2085a, ClassA c2085a2, int i, ClassA c2085a3) {
        c2085a.m8206a(i);
        c2085a.m8217c(c2085a3.m8222e());
        c2085a.m8209a(c2085a3.m8227h());
        c2085a.m8215b(c2085a3.m8228i());
        c2085a.m8218c(ClassA.f5966h);
        c2085a.m8220d(c2085a2);
        c2085a.m8223e(c2085a3);
        c2085a3.m8227h().m8210a(c2085a3, c2085a);
        c2085a3.m8228i().m8210a(c2085a3, c2085a);
    }

    protected static void m8559a(ClassA c2085a, ClassA c2085a2, ClassA c2085a3) {
        c2085a.m8206a(268435456);
        c2085a.m8209a(c2085a3);
        c2085a.m8228i().m8234o().remove(c2085a);
        c2085a.m8215b(ClassA.f5966h);
        c2085a.m8212a(false);
        c2085a3.m8210a(c2085a2, c2085a);
        c2085a2.m8206a(0);
    }

    protected static void m8560a(ClassA c2085a, ClassA c2085a2, ClassA c2085a3, ClassA c2085a4) {
        ClassA c2085aM8259a = c2085a.m8205a().m8259a(c2085a);
        int iM8222e = c2085a3.m8222e();
        if (iM8222e == 0) {
            iM8222e = c2085a.m8222e();
        }
        c2085a3.m8209a(ClassA.f5966h);
        c2085a4.m8234o().remove(c2085a3);
        c2085a.m8206a(65536);
        c2085a.m8217c(iM8222e);
        c2085a.m8218c(c2085aM8259a);
        c2085a.m8220d(c2085a2);
        c2085a.m8223e(null);
        c2085a.m8209a(c2085a4);
    }

    public static boolean m8561a(BitSet bitSet, ClassA c2085a, BitSet bitSet2) {
        if (!c2085a.m8221d(1266696506) && !bitSet.get(c2085a.m8213b())) {
            bitSet.set(c2085a.m8213b());
            switch (c2085a.m8216c()) {
                case 1:
                case 4:
                case 128:
                case 1024:
                case 2048:
                case 4096:
                case 65536:
                case 131072:
                case 268435456:
                    return m8561a(bitSet, c2085a.m8227h(), bitSet2);
                case 64:
                    return m8578c(bitSet, c2085a, bitSet2);
                case 512:
                    return m8581d(bitSet, c2085a, bitSet2);
                case 8192:
                    return m8583e(bitSet, c2085a, bitSet2);
                case 32768:
                case 262144:
                case 524288:
                case 1048576:
                case 2097152:
                    return m8570b(bitSet, c2085a, bitSet2);
                case 4194304:
                    return m8584f(bitSet, c2085a, bitSet2);
            }
        }
        return true;
    }

    protected static boolean m8562a(ClassA c2085a) {
        ClassA c2085aM8227h = c2085a.m8227h();
        ClassA c2085aM8228i = c2085a.m8228i();
        ao c2145ao = new ao();
        if (c2085aM8227h == c2085aM8228i) {
            m8560a(c2085a, ClassA.f5966h, ClassA.f5966h, c2085aM8228i);
            return true;
        }
        if (c2085aM8227h.m8221d(1266696506) && c2085aM8227h.m8234o().size() <= 1) {
            m8560a(c2085a, c2085aM8227h, c2085aM8227h, c2085aM8228i);
            return true;
        }
        if (c2085aM8227h.m8221d(876822205) && c2085aM8227h.m8234o().size() == 1) {
            ClassA c2085aM8227h2 = c2085aM8227h.m8227h();
            ClassF c2090fM8205a = c2085aM8227h.m8205a();
            int iM8253a = c2090fM8205a.m8253a(c2085a.m8219d());
            int iM8219d = c2085aM8228i.m8219d();
            int i = (iM8219d == 0 || c2085aM8227h.m8219d() > c2085aM8228i.m8219d()) ? Integer.MAX_VALUE : iM8219d;
            while (c2085aM8227h != c2085aM8227h2 && c2085aM8227h2.m8221d(876822149) && c2085aM8227h2.m8234o().size() == 1 && c2090fM8205a.m8253a(c2085aM8227h2.m8219d()) >= iM8253a && c2085aM8227h2.m8219d() < i) {
                c2145ao.m8468a(c2085aM8227h2, c2085aM8227h2.m8227h());
                c2085aM8227h = c2085aM8227h2;
                c2085aM8227h2 = c2085aM8227h2.m8227h();
            }
            if (c2085aM8227h2 == c2085aM8228i) {
                m8560a(c2085a, c2085aM8227h, c2085aM8227h, c2085aM8228i);
                return true;
            }
            if (c2085aM8227h2.m8221d(1266696506) && c2085aM8227h2.m8219d() < i) {
                m8560a(c2085a, c2085aM8227h, c2085aM8227h2, c2085aM8228i);
                return true;
            }
            if (c2085aM8228i.m8221d(1266696506)) {
                if (c2085aM8227h2.m8219d() >= i || c2085aM8227h2.m8234o().size() != 1) {
                    m8555a(131072, c2085a, c2085aM8227h, c2085aM8227h, c2085aM8228i, c2085aM8228i, c2085aM8227h2);
                } else {
                    m8560a(c2085a, c2085aM8227h, c2085aM8227h2, c2085aM8228i);
                }
                return true;
            }
            if (c2085aM8228i.m8221d(876822149) && c2085aM8228i.m8234o().size() == 1) {
                ClassA c2085aM8227h3 = c2085aM8228i.m8227h();
                c2145ao.m8467a();
                ClassA c2085a2 = c2085aM8228i;
                while (c2085a2 != c2085aM8227h3 && c2085aM8227h3.m8221d(876822149) && c2085aM8227h3.m8234o().size() == 1 && c2090fM8205a.m8253a(c2085aM8227h3.m8219d()) >= iM8253a) {
                    c2145ao.m8468a(c2085aM8227h3, c2085aM8227h3.m8227h());
                    c2085a2 = c2085aM8227h3;
                    c2085aM8227h3 = c2085aM8227h3.m8227h();
                }
                if (c2085aM8227h2 == c2085aM8227h3) {
                    if (c2085aM8227h.m8221d(805306368)) {
                        m8555a(536870912, c2085a, c2085aM8227h, c2085aM8227h, c2085aM8228i, c2085a2, c2085aM8227h2);
                    } else {
                        m8555a(131072, c2085a, c2085aM8227h, c2085aM8227h, c2085aM8228i, c2085a2, c2085aM8227h2);
                    }
                } else if (c2085aM8227h2.m8219d() >= i || c2085aM8227h2.m8234o().size() != 1) {
                    m8555a(131072, c2085a, c2085aM8227h, c2085aM8227h, c2085aM8228i, c2085a2.m8227h(), c2085aM8227h2);
                } else {
                    m8560a(c2085a, c2085aM8227h, c2085aM8227h2, c2085aM8228i);
                }
                return true;
            }
        }
        if (c2085aM8228i.m8221d(876822205) && c2085aM8228i.m8234o().size() == 1) {
            ClassA c2085aM8227h4 = c2085aM8228i.m8227h();
            c2145ao.m8467a();
            ClassA c2085a3 = c2085aM8228i;
            while (c2085a3 != c2085aM8227h4 && c2085aM8227h4.m8221d(876822149) && c2085aM8227h4.m8234o().size() == 1) {
                c2145ao.m8468a(c2085aM8227h4, c2085aM8227h4.m8227h());
                c2085a3 = c2085aM8227h4;
                c2085aM8227h4 = c2085aM8227h4.m8227h();
            }
            if (c2085aM8227h4 == c2085aM8227h) {
                c2085a.m8236q();
                m8560a(c2085a, c2085aM8228i, c2085a3, c2085aM8227h);
                return true;
            }
            if (c2085aM8227h4.m8221d(1266696506) && c2085aM8227h4.m8234o().size() <= 1) {
                c2085a.m8236q();
                m8560a(c2085a, c2085aM8228i, c2085aM8227h4, c2085aM8227h);
                return true;
            }
        }
        if (c2085aM8227h.m8221d(56)) {
            ClassA c2085aM8580d = m8580d(c2085a, c2085aM8227h);
            m8560a(c2085a, c2085aM8580d, c2085aM8580d, c2085aM8228i);
            return true;
        }
        if (c2085aM8227h.m8221d(876822149)) {
            ClassA c2085aM8227h5 = c2085aM8227h.m8227h();
            c2145ao.m8467a();
            ClassA c2085a4 = c2085aM8227h;
            while (c2085a4 != c2085aM8227h5 && c2085aM8227h5.m8221d(876822149) && c2085aM8227h5.m8234o().size() == 1) {
                c2145ao.m8468a(c2085aM8227h5, c2085aM8227h5.m8227h());
                c2085a4 = c2085aM8227h5;
                c2085aM8227h5 = c2085aM8227h5.m8227h();
            }
            if (c2085aM8227h5.m8221d(56)) {
                m8560a(c2085a, c2085aM8227h, c2085aM8227h5, c2085aM8228i);
                return true;
            }
        }
        return false;
    }

    protected static boolean m8563a(ClassA c2085a, int i) {
        ao c2145ao = new ao();
        Iterator it = c2085a.m8230k().iterator();
        while (it.hasNext()) {
            ClassA c2085aM8251c = ((ClassE) it.next()).m8251c();
            c2145ao.m8467a();
            while (true) {
                ClassA c2085a2 = c2085aM8251c;
                if (c2085a2.m8219d() >= i) {
                    break;
                }
                if (c2085a2 == ClassA.f5963e) {
                    return true;
                }
                if (c2085a2.m8221d(1270628666)) {
                    break;
                }
                if (c2085a2.m8221d(876822149)) {
                    c2085aM8251c = c2085a2.m8227h();
                } else if (c2085a2.m8216c() == 32768) {
                    c2085aM8251c = c2085a2.m8228i();
                } else if (c2085a2.m8216c() == 64) {
                    int iM8219d = c2085a2.m8219d();
                    ClassA c2085a3 = null;
                    int iM8219d2 = iM8219d;
                    for (ClassE c2089e : c2085a2.m8230k()) {
                        if (iM8219d2 < c2089e.m8251c().m8219d()) {
                            ClassA c2085aM8251c2 = c2089e.m8251c();
                            c2085a3 = c2085aM8251c2;
                            iM8219d2 = c2085aM8251c2.m8219d();
                        }
                    }
                    c2085aM8251c = c2085a3;
                } else {
                    c2085aM8251c = null;
                }
                if (c2085a2 == c2085aM8251c) {
                    break;
                }
                c2145ao.m8468a(c2085a2, c2085aM8251c);
            }
        }
        return false;
    }

    protected static boolean m8564a(ClassA c2085a, ClassA c2085a2, int i) {
        if (c2085a2.m8222e() - c2085a2.m8219d() != 3) {
            return false;
        }
        byte[] bArrM7635a = ((ClassF) c2085a.m8205a().m8254a().m7684a(AttCode.ATTRIBUTE_NAME)).m7635a();
        int iM8219d = c2085a.m8219d();
        int iM8219d2 = c2085a2.m8219d();
        return bArrM7635a[iM8219d] == 3 && ((bArrM7635a[iM8219d + 1] & 255) == 167 || (bArrM7635a[iM8219d + 1] & 255) == 200) && (bArrM7635a[iM8219d2] & 255) == i && iM8219d2 + 3 == c2085a2.m8222e();
    }

    public static boolean m8565a(ClassF c2090f) {
        return m8561a(new BitSet(c2090f.m8261b().size()), c2090f.m8262c(), new BitSet());
    }

    protected static ClassA m8566b(ClassA c2085a, int i) {
        ClassA c2085aM8227h = m8575c(c2085a.m8227h(), i).m8227h();
        if (!c2085aM8227h.m8221d(1132462082) && (c2085aM8227h.m8219d() >= i || c2085aM8227h.m8222e() < c2085a.m8219d())) {
            return c2085aM8227h;
        }
        Iterator it = c2085a.m8229j().iterator();
        while (it.hasNext()) {
            ClassA c2085aM8244c = ((ClassB) it.next()).m8244c();
            if (c2085aM8244c.m8219d() < i) {
                ClassA c2085aM8227h2 = m8575c(c2085aM8244c, i).m8227h();
                if (!c2085aM8227h2.m8221d(1132462082) && (c2085aM8227h2.m8219d() >= i || c2085aM8227h2.m8222e() < c2085a.m8219d())) {
                    return c2085aM8227h2;
                }
            } else {
                ClassF c2090fM8205a = c2085aM8244c.m8205a();
                int iM8253a = c2090fM8205a.m8253a(c2085aM8244c.m8219d());
                ao c2145ao = new ao();
                ClassA c2085aM8227h3 = c2085aM8244c.m8227h();
                while (c2085aM8244c != c2085aM8227h3 && c2085aM8244c.m8221d(876822149) && c2085aM8227h3.m8234o().size() == 1 && iM8253a <= c2090fM8205a.m8253a(c2085aM8227h3.m8219d())) {
                    c2145ao.m8468a(c2085aM8227h3, c2085aM8227h3.m8227h());
                    c2085aM8244c = c2085aM8227h3;
                    c2085aM8227h3 = c2085aM8227h3.m8227h();
                }
                if (c2085aM8244c != c2085aM8227h3 && (c2085aM8227h3.m8234o().size() > 1 || !c2085aM8227h3.m8221d(1266696506))) {
                    return c2085aM8227h3;
                }
            }
        }
        return ClassA.f5966h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x004d A[LOOP:0: B:13:0x0047->B:15:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[LOOP:1: B:21:0x008f->B:23:0x0095, LOOP_END] */
    protected static void m8567b(BitSet bitSet, ClassA c2085a) {
        Iterator it;
        Iterator it2;
        if (c2085a.m8221d(1266696506) || bitSet.get(c2085a.m8213b())) {
            return;
        }
        bitSet.set(c2085a.m8213b());
        c2085a.m8210a(ClassA.f5963e, ClassA.f5962d);
        switch (c2085a.m8216c()) {
            case 1:
            case 4:
            case 4194304:
            case 67108864:
            case 268435456:
                m8567b(bitSet, c2085a.m8227h());
                break;
            case 64:
                it = c2085a.m8230k().iterator();
                while (it.hasNext()) {
                    m8567b(bitSet, ((ClassE) it.next()).m8251c());
                }
                break;
            case 128:
                m8567b(bitSet, c2085a.m8227h());
                it = c2085a.m8230k().iterator();
                while (it.hasNext()) {
                    m8567b(bitSet, ((ClassE) it.next()).m8251c());
                }
                break;
            case 512:
                it2 = c2085a.m8229j().iterator();
                while (it2.hasNext()) {
                    m8567b(bitSet, ((ClassB) it2.next()).m8244c());
                }
                break;
            case 1024:
            case 2048:
            case 4096:
                m8567b(bitSet, c2085a.m8232m());
                it2 = c2085a.m8229j().iterator();
                while (it2.hasNext()) {
                    m8567b(bitSet, ((ClassB) it2.next()).m8244c());
                }
                break;
            case 8192:
            case 32768:
            case 262144:
                m8567b(bitSet, c2085a.m8228i());
                m8567b(bitSet, c2085a.m8227h());
                break;
            case 65536:
                m8567b(bitSet, c2085a.m8232m());
                m8567b(bitSet, c2085a.m8227h());
                break;
            case 131072:
            case 536870912:
                m8567b(bitSet, c2085a.m8233n());
                m8567b(bitSet, c2085a.m8232m());
                m8567b(bitSet, c2085a.m8227h());
                break;
            case 524288:
            case 1048576:
                m8567b(bitSet, c2085a.m8232m());
                m8567b(bitSet, c2085a.m8233n());
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0138 A[SYNTHETIC] */
    protected static void m8568b(BitSet bitSet, ClassA c2085a, ClassA c2085a2) {
        if (c2085a2.m8221d(1266696506) || bitSet.get(c2085a2.m8213b())) {
            return;
        }
        bitSet.set(c2085a2.m8213b());
        switch (c2085a2.m8216c()) {
            case 1:
            case 4:
            case 4194304:
            case 67108864:
            case 268435456:
                if (c2085a2.m8227h() == ClassA.f5965g) {
                    c2085a2.m8209a(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8227h());
                }
                break;
            case 64:
                for (ClassE c2089e : c2085a2.m8230k()) {
                    if (c2089e.m8251c() == ClassA.f5965g) {
                        c2089e.m8248a(m8576c(c2085a2, c2085a));
                    } else {
                        m8568b(bitSet, c2085a, c2089e.m8251c());
                    }
                }
                break;
            case 128:
                if (c2085a2.m8227h() == ClassA.f5965g) {
                    c2085a2.m8209a(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8227h());
                }
                while (r1.hasNext()) {
                    if (c2089e.m8251c() == ClassA.f5965g) {
                        c2089e.m8248a(m8576c(c2085a2, c2085a));
                    } else {
                        m8568b(bitSet, c2085a, c2089e.m8251c());
                    }
                }
                break;
            case 512:
                for (ClassB c2086b : c2085a2.m8229j()) {
                    if (c2086b.m8244c() == ClassA.f5965g) {
                        c2086b.m8241a(m8576c(c2085a2, c2085a));
                    } else {
                        m8568b(bitSet, c2085a, c2086b.m8244c());
                    }
                }
                break;
            case 1024:
            case 2048:
            case 4096:
                if (c2085a2.m8232m() == ClassA.f5965g) {
                    c2085a2.m8220d(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8232m());
                }
                while (r1.hasNext()) {
                    if (c2086b.m8244c() == ClassA.f5965g) {
                        c2086b.m8241a(m8576c(c2085a2, c2085a));
                    } else {
                        m8568b(bitSet, c2085a, c2086b.m8244c());
                    }
                }
                break;
            case 8192:
            case 32768:
            case 262144:
                if (c2085a2.m8228i() == ClassA.f5965g) {
                    c2085a2.m8215b(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8228i());
                }
                if (c2085a2.m8227h() == ClassA.f5965g) {
                    c2085a2.m8209a(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8227h());
                }
                break;
            case 65536:
                if (c2085a2.m8232m() == ClassA.f5965g) {
                    c2085a2.m8220d(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8232m());
                }
                if (c2085a2.m8227h() == ClassA.f5965g) {
                    c2085a2.m8209a(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8227h());
                }
                break;
            case 131072:
            case 536870912:
                if (c2085a2.m8233n() == ClassA.f5965g) {
                    c2085a2.m8223e(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8233n());
                }
                if (c2085a2.m8232m() == ClassA.f5965g) {
                    c2085a2.m8220d(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8232m());
                }
                if (c2085a2.m8227h() == ClassA.f5965g) {
                    c2085a2.m8209a(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8227h());
                }
                break;
            case 524288:
            case 1048576:
                if (c2085a2.m8232m() == ClassA.f5965g) {
                    c2085a2.m8220d(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8232m());
                }
                if (c2085a2.m8233n() == ClassA.f5965g) {
                    c2085a2.m8223e(m8576c(c2085a2, c2085a));
                } else {
                    m8568b(bitSet, c2085a, c2085a2.m8233n());
                }
                break;
        }
    }

    protected static void m8569b(ClassA c2085a, ClassA c2085a2) {
        c2085a.m8206a(262144);
        c2085a.m8209a(c2085a2.m8227h());
        c2085a.m8215b(c2085a2.m8228i());
        c2085a2.m8227h().m8210a(c2085a2, c2085a);
        c2085a2.m8228i().m8210a(c2085a2, c2085a);
        c2085a2.m8206a(0);
    }

    protected static boolean m8570b(BitSet bitSet, ClassA c2085a, BitSet bitSet2) {
        while (m8571b(c2085a)) {
        }
        if (!f6142a && !c2085a.m8221d(3932160)) {
            throw new AssertionError();
        }
        if (m8561a(bitSet, c2085a.m8227h(), bitSet2) && m8561a(bitSet, c2085a.m8228i(), bitSet2)) {
            return m8562a(c2085a);
        }
        return false;
    }

    protected static boolean m8571b(ClassA c2085a) {
        boolean zM8571b = false;
        ClassA c2085aM8227h = c2085a.m8227h();
        ClassA c2085aM8228i = c2085a.m8228i();
        if (c2085aM8227h.m8216c() == 268435456 && c2085aM8227h.m8234o().size() == 1) {
            ClassA c2085aM8227h2 = c2085aM8227h.m8227h();
            if (c2085aM8227h2.m8221d(294912)) {
                if (c2085aM8228i.m8221d(268435460) && c2085aM8227h2 == c2085aM8228i.m8227h() && c2085aM8228i.m8234o().size() == 1 && c2085aM8227h2.m8234o().size() == 2) {
                    if (ClassC.m8515c(c2085a) + 1 == (-ClassC.m8515c(c2085aM8227h2))) {
                        m8557a(c2085a, c2085aM8227h2);
                        return true;
                    }
                }
                if (c2085aM8227h2.m8227h() == c2085aM8228i && m8564a(c2085aM8227h, c2085aM8227h2, 153)) {
                    m8559a(c2085a, c2085aM8227h, c2085aM8227h2);
                    return true;
                }
                if (c2085aM8227h2.m8228i() == c2085aM8228i && m8564a(c2085aM8227h, c2085aM8227h2, 154)) {
                    m8559a(c2085a, c2085aM8227h, c2085aM8227h2);
                    return true;
                }
                if (c2085aM8227h2.m8234o().size() == 1) {
                    m8569b(c2085aM8227h, c2085aM8227h2);
                    return true;
                }
            }
        }
        if (c2085aM8227h.m8221d(3964928)) {
            if (c2085aM8227h.mo8224f() - c2085a.mo8226g() <= 1) {
                zM8571b = m8571b(c2085aM8227h);
                if (c2085aM8227h.m8221d(3964928) && c2085aM8227h.m8234o().size() == 1) {
                    if (c2085aM8227h.m8227h() == c2085aM8228i) {
                        m8558a(c2085a, m8574c(c2085a), 524288, c2085aM8227h);
                        return true;
                    }
                    if (c2085aM8227h.m8228i() == c2085aM8228i) {
                        m8558a(c2085a, m8579d(c2085a), 1048576, c2085aM8227h);
                        return true;
                    }
                    if (c2085aM8228i.m8221d(3964928)) {
                        zM8571b = m8571b(c2085aM8228i);
                        if (c2085aM8228i.m8221d(3964928)) {
                            if (c2085aM8227h.m8227h() == c2085aM8228i.m8227h() && c2085aM8227h.m8228i() == c2085aM8228i.m8228i()) {
                                m8582e(c2085a);
                                return true;
                            }
                            if (c2085aM8227h.m8228i() == c2085aM8228i.m8227h() && c2085aM8227h.m8227h() == c2085aM8228i.m8228i()) {
                                m8582e(c2085a);
                                c2085aM8228i.m8236q();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (c2085aM8228i.m8221d(3964928)) {
            if (c2085aM8228i.mo8224f() - c2085a.mo8226g() <= 1) {
                zM8571b = m8571b(c2085aM8228i);
                if (c2085aM8228i.m8221d(3964928) && c2085aM8228i.m8234o().size() == 1) {
                    if (c2085aM8228i.m8228i() == c2085aM8227h) {
                        m8558a(c2085a, m8574c(c2085a), 1048576, c2085aM8228i);
                        return true;
                    }
                    if (c2085aM8228i.m8227h() == c2085aM8227h) {
                        m8558a(c2085a, m8579d(c2085a), 524288, c2085aM8228i);
                        return true;
                    }
                }
            }
        }
        if (c2085a.m8216c() != 32768) {
            return zM8571b;
        }
        c2085a.m8206a(262144);
        return true;
    }

    protected static boolean m8572b(ClassA c2085a, ClassA c2085a2, int i) {
        int iM8475a = ClassC.m8475a(c2085a, i);
        if (iM8475a == 0 || iM8475a == 167 || iM8475a == 200) {
            return true;
        }
        ClassA c2085aM8227h = c2085a.m8227h();
        if (!c2085aM8227h.m8221d(1266696506) && c2085a2.m8219d() < c2085aM8227h.m8219d()) {
            ClassF c2090fM8205a = c2085a2.m8205a();
            if (c2090fM8205a.m8253a(c2085aM8227h.m8219d()) < c2090fM8205a.m8253a(c2085a2.m8222e() - 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    protected static ClassA m8573c(BitSet bitSet, ClassA c2085a) {
        ClassA c2085aM8553a;
        ClassA c2085aM8553a2 = null;
        if (c2085a.m8221d(1266696506) || bitSet.get(c2085a.m8213b())) {
            return null;
        }
        bitSet.set(c2085a.m8213b());
        switch (c2085a.m8216c()) {
            case 1:
            case 4:
            case 4194304:
            case 67108864:
            case 268435456:
                if (c2085aM8553a2 == null) {
                    return m8553a(bitSet, c2085a, c2085a.m8227h());
                }
                return c2085aM8553a2;
            case 64:
                c2085aM8553a = c2085aM8553a2;
                for (ClassE c2089e : c2085a.m8230k()) {
                    if (c2085aM8553a == null) {
                        c2085aM8553a = m8553a(bitSet, c2085a, c2089e.m8251c());
                    }
                }
                return c2085aM8553a;
            case 128:
                c2085aM8553a2 = m8553a(bitSet, c2085a, c2085a.m8227h());
                c2085aM8553a = c2085aM8553a2;
                while (r2.hasNext()) {
                    if (c2085aM8553a == null) {
                        c2085aM8553a = m8553a(bitSet, c2085a, c2089e.m8251c());
                    }
                }
                return c2085aM8553a;
            case 512:
                c2085aM8553a = c2085aM8553a2;
                for (ClassB c2086b : c2085a.m8229j()) {
                    if (c2085aM8553a == null) {
                        c2085aM8553a = m8553a(bitSet, c2085a, c2086b.m8244c());
                    }
                }
                if (c2085aM8553a == null) {
                    return m8553a(bitSet, c2085a, c2085a.m8227h());
                }
                return c2085aM8553a;
            case 1024:
            case 2048:
            case 4096:
                c2085aM8553a2 = m8553a(bitSet, c2085a, c2085a.m8232m());
                c2085aM8553a = c2085aM8553a2;
                while (r2.hasNext()) {
                    if (c2085aM8553a == null) {
                        c2085aM8553a = m8553a(bitSet, c2085a, c2086b.m8244c());
                    }
                }
                if (c2085aM8553a == null) {
                    return m8553a(bitSet, c2085a, c2085a.m8227h());
                }
                return c2085aM8553a;
            case 8192:
            case 32768:
            case 262144:
            case 2097152:
                c2085aM8553a2 = m8553a(bitSet, c2085a, c2085a.m8228i());
                if (c2085aM8553a2 == null) {
                    return m8553a(bitSet, c2085a, c2085a.m8227h());
                }
                return c2085aM8553a2;
            case 65536:
                if (c2085aM8553a2 == null) {
                    c2085aM8553a2 = m8553a(bitSet, c2085a, c2085a.m8232m());
                }
                if (c2085aM8553a2 == null) {
                    return m8553a(bitSet, c2085a, c2085a.m8227h());
                }
                return c2085aM8553a2;
            case 131072:
            case 536870912:
                c2085aM8553a2 = m8553a(bitSet, c2085a, c2085a.m8233n());
                if (c2085aM8553a2 == null) {
                    c2085aM8553a2 = m8553a(bitSet, c2085a, c2085a.m8232m());
                }
                if (c2085aM8553a2 == null) {
                    return m8553a(bitSet, c2085a, c2085a.m8227h());
                }
                return c2085aM8553a2;
            case 524288:
            case 1048576:
                ClassA c2085aM8553a3 = m8553a(bitSet, c2085a, c2085a.m8232m());
                return c2085aM8553a3 == null ? m8553a(bitSet, c2085a, c2085a.m8233n()) : c2085aM8553a3;
            default:
                return null;
        }
    }

    protected static ClassA m8574c(ClassA c2085a) {
        if (c2085a.m8216c() == 32768) {
            return c2085a.m8205a().m8258a(262144, c2085a.m8219d(), c2085a.m8222e(), false);
        }
        ClassA c2085aM8259a = c2085a.m8205a().m8259a(c2085a);
        c2085aM8259a.m8236q();
        return c2085aM8259a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static ClassA m8575c(ClassA c2085a, int i) {
        ao c2145ao = new ao();
        for (ClassA c2085aM8227h = c2085a.m8227h(); c2085aM8227h.m8219d() < i && c2085aM8227h.m8221d(876822149); c2085aM8227h = c2085aM8227h.m8227h()) {
            c2145ao.m8468a(c2085aM8227h, c2085aM8227h.m8227h());
            c2085a = c2085aM8227h;
        }
        if (c2085a.m8222e() > i && c2085a.m8216c() == 1024) {
            ClassC c2247cM8229j = c2085a.m8229j();
            ClassA c2085aM8575c = m8575c(((ClassB) c2247cM8229j.get(c2247cM8229j.size() - 1)).m8244c(), i);
            ClassA c2085aM8227h2 = c2085aM8575c.m8227h();
            c2085aM8575c.m8209a(ClassA.f5966h);
            c2085a.m8217c(c2085aM8575c.m8222e());
            c2085a.m8209a(c2085aM8227h2);
            c2085aM8227h2.m8234o().remove(c2085aM8575c);
            c2085aM8227h2.m8234o().add(c2085a);
        }
        return c2085a;
    }

    protected static ClassA m8576c(ClassA c2085a, ClassA c2085a2) {
        HashSet hashSet = new HashSet();
        hashSet.add(c2085a);
        c2085a2.m8234o().remove(c2085a);
        return c2085a.m8205a().m8257a(MemoryConstants.f4579GB, c2085a.m8219d(), c2085a2.m8219d(), hashSet);
    }

    protected static ClassA m8577c(ClassA c2085a, ClassA c2085a2, int i) {
        ao c2145ao = new ao();
        if (c2085a2 == ClassA.f5966h) {
            while (c2085a.m8221d(876822149)) {
                c2145ao.m8468a(c2085a, c2085a.m8227h());
                c2085a = c2085a.m8227h();
            }
        } else {
            while (c2085a.m8221d(876822149)) {
                c2145ao.m8468a(c2085a, c2085a.m8227h());
                ClassA c2085aM8227h = c2085a.m8227h();
                if (c2085aM8227h == c2085a2 || c2085aM8227h.m8219d() > i) {
                    c2085aM8227h.m8234o().remove(c2085a);
                    c2085a.m8209a(ClassA.f5966h);
                    break;
                }
                c2085a = c2085aM8227h;
            }
        }
        return c2085a;
    }

    protected static boolean m8578c(BitSet bitSet, ClassA c2085a, BitSet bitSet2) {
        ClassA c2085a2 = null;
        int iM8250b = -1;
        ClassE c2089e = null;
        ClassE c2089e2 = null;
        for (ClassE c2089e3 : c2085a.m8230k()) {
            if (iM8250b < c2089e3.m8250b()) {
                iM8250b = c2089e3.m8250b();
            }
            if (c2089e3.m8252d()) {
                c2089e2 = c2089e3;
            } else {
                c2089e = c2089e3;
            }
        }
        if (c2089e == null) {
            c2089e = c2089e2;
        }
        BitSet bitSet3 = new BitSet();
        HashSet<ClassA> hashSet = new HashSet();
        for (ClassE c2089e4 : c2085a.m8230k()) {
            ClassA c2085aM8251c = c2089e4.m8251c();
            if (c2089e4.m8250b() == iM8250b) {
                c2085a2 = c2085aM8251c;
            } else {
                m8556a(bitSet3, c2085aM8251c, iM8250b, hashSet);
            }
        }
        ClassA c2085a3 = ClassA.f5966h;
        ClassA c2085a4 = c2085a3;
        for (ClassA c2085a5 : hashSet) {
            if (!c2085a5.m8221d(1266696506) && (c2085a4 == ClassA.f5966h || c2085a4.m8219d() < c2085a5.m8219d())) {
                c2085a4 = c2085a5;
            }
        }
        if (c2085a4 != ClassA.f5966h) {
            m8556a(bitSet3, c2085a2, c2085a4.m8219d(), hashSet);
            c2085a2 = c2085a4;
        } else if (c2089e.m8251c() == c2085a2 && m8563a(c2085a, iM8250b)) {
            m8567b(new BitSet(), c2085a);
            c2085a2 = ClassA.f5963e;
            c2089e2.m8248a(c2085a2);
        }
        HashSet hashSetM8234o = c2085a2.m8234o();
        Iterator it = hashSetM8234o.iterator();
        while (it.hasNext()) {
            ClassA c2085a6 = (ClassA) it.next();
            if (bitSet3.get(c2085a6.m8213b())) {
                c2085a6.m8210a(c2085a2, ClassA.f5962d);
                it.remove();
            }
        }
        if (c2089e2.m8251c() == c2085a2) {
            Iterator it2 = c2085a.m8230k().iterator();
            while (it2.hasNext()) {
                if (((ClassE) it2.next()).m8251c() == c2085a2) {
                    it2.remove();
                }
            }
        } else {
            for (ClassE c2089e5 : c2085a.m8230k()) {
                if (c2089e5.m8251c() == c2085a2) {
                    c2089e5.m8248a(ClassA.f5962d);
                }
            }
        }
        Iterator it3 = c2085a.m8230k().iterator();
        boolean zM8561a = true;
        while (it3.hasNext()) {
            zM8561a = m8561a(bitSet, ((ClassE) it3.next()).m8251c(), bitSet2) & zM8561a;
        }
        Iterator it4 = c2085a.m8230k().iterator();
        while (it4.hasNext()) {
            ClassA c2085aM8251c2 = ((ClassE) it4.next()).m8251c();
            if (!f6142a && c2085aM8251c2 == c2085a2) {
                throw new AssertionError();
            }
            HashSet hashSetM8234o2 = c2085aM8251c2.m8234o();
            if (hashSetM8234o2.size() > 1) {
                Iterator it5 = hashSetM8234o2.iterator();
                while (it5.hasNext()) {
                    ClassA c2085a7 = (ClassA) it5.next();
                    if (c2085a7 != c2085a) {
                        c2085a7.m8210a(c2085aM8251c2, ClassA.f5966h);
                        it5.remove();
                    }
                }
            }
        }
        c2085a.m8206a(128);
        c2085a.m8209a(c2085a2);
        hashSetM8234o.add(c2085a);
        return m8561a(bitSet, c2085a.m8227h(), bitSet2) & zM8561a;
    }

    protected static ClassA m8579d(ClassA c2085a) {
        return c2085a.m8216c() == 32768 ? c2085a.m8205a().m8256a(262144, c2085a.m8219d(), c2085a.m8222e()) : c2085a.m8205a().m8259a(c2085a);
    }

    protected static ClassA m8580d(ClassA c2085a, ClassA c2085a2) {
        ClassA c2085aM8256a = c2085a2.m8205a().m8256a(c2085a2.m8216c(), c2085a2.m8219d(), c2085a2.m8222e());
        c2085aM8256a.m8209a(ClassA.f5966h);
        c2085aM8256a.m8234o().add(c2085a);
        c2085a2.m8234o().remove(c2085a);
        c2085a.m8209a(c2085aM8256a);
        return c2085aM8256a;
    }

    protected static boolean m8581d(BitSet bitSet, ClassA c2085a, BitSet bitSet2) {
        boolean z;
        ClassA c2085a2;
        ClassA c2085a3 = null;
        Iterator it = c2085a.m8229j().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            ClassB c2086b = (ClassB) it.next();
            if (c2086b.m8238a() == null) {
                boolean zM8561a = m8561a(bitSet, c2086b.m8244c(), bitSet2);
                ClassA c2085aM8244c = c2086b.m8244c();
                z = zM8561a;
                c2085a3 = c2085aM8244c;
                break;
            }
        }
        ClassA c2085aM8554a = m8554a(c2085a, bitSet2);
        boolean zM8561a2 = z & m8561a(bitSet, c2085a.m8227h(), bitSet2);
        ClassA c2085aM8227h = c2085a.m8227h();
        if (c2085aM8227h.m8221d(1140900419)) {
            return false;
        }
        int iM8219d = c2085a.m8219d();
        boolean zM8561a3 = zM8561a2;
        int iM8219d2 = iM8219d;
        boolean z2 = true;
        ClassA c2085a4 = null;
        for (ClassB c2086b2 : c2085a.m8229j()) {
            if (c2086b2.m8238a() != null) {
                zM8561a3 &= m8561a(bitSet, c2086b2.m8244c(), bitSet2);
            }
            ClassA c2085aM8244c2 = c2086b2.m8244c();
            if (c2085aM8244c2.m8221d(1140900419)) {
                return false;
            }
            if (iM8219d2 < c2085aM8244c2.m8219d()) {
                iM8219d2 = c2085aM8244c2.m8219d();
            }
            if (z2) {
                HashSet<ClassA> hashSetM8234o = c2085aM8244c2.m8234o();
                if (hashSetM8234o.size() == 1) {
                    z2 = false;
                } else {
                    if (!f6142a && hashSetM8234o.size() != 2) {
                        throw new AssertionError();
                    }
                    if (c2085a4 == null) {
                        for (ClassA c2085a5 : hashSetM8234o) {
                            if (c2085a5 != c2085a) {
                                if (!f6142a && c2085a5.m8216c() != 512) {
                                    throw new AssertionError();
                                }
                                c2085a4 = c2085a5;
                                break;
                            }
                        }
                    } else if (!hashSetM8234o.contains(c2085a4)) {
                        z2 = false;
                    }
                }
            }
        }
        if (z2) {
            Iterator it2 = c2085a.m8229j().iterator();
            while (it2.hasNext()) {
                ((ClassB) it2.next()).m8244c().m8234o().remove(c2085a);
            }
            for (ClassA c2085a6 : c2085a.m8234o()) {
                c2085a6.m8210a(c2085a, c2085aM8227h);
                c2085aM8227h.m8210a(c2085a, c2085a6);
            }
            c2085a.m8206a(0);
            return zM8561a3;
        }
        if (!zM8561a3) {
            return zM8561a3;
        }
        ClassA c2085aM8566b = m8566b(c2085a, iM8219d2);
        m8577c(c2085aM8227h, c2085aM8566b, iM8219d2);
        if (c2085a3 != null && c2085a.m8229j().size() == 1 && c2085aM8227h.m8216c() == 1024 && c2085aM8227h.m8227h() == ClassA.f5966h && c2085a.m8219d() == c2085aM8227h.m8219d() && !m8585f(c2085aM8227h)) {
            c2085a.m8229j().addAll(0, c2085aM8227h.m8229j());
            Iterator it3 = c2085aM8227h.m8229j().iterator();
            while (it3.hasNext()) {
                HashSet hashSetM8234o2 = ((ClassB) it3.next()).m8244c().m8234o();
                hashSetM8234o2.clear();
                hashSetM8234o2.add(c2085a);
            }
            c2085aM8227h.m8206a(0);
            ClassA c2085aM8232m = c2085aM8227h.m8232m();
            HashSet hashSetM8234o3 = c2085aM8232m.m8234o();
            hashSetM8234o3.clear();
            hashSetM8234o3.add(c2085a);
            c2085a2 = c2085aM8232m;
        } else {
            c2085a2 = c2085aM8227h;
        }
        int iM8222e = iM8219d2;
        for (ClassB c2086b3 : c2085a.m8229j()) {
            ClassA c2085aM8244c3 = c2086b3.m8244c();
            if (c2085aM8244c3 == c2085aM8566b) {
                c2086b3.m8241a(ClassA.f5966h);
            } else {
                ClassA c2085aM8577c = m8577c(c2085aM8244c3, c2085aM8566b, c2085aM8244c3.m8219d() == iM8219d2 ? c2085aM8566b.m8219d() : iM8219d2);
                if (iM8222e < c2085aM8577c.m8222e()) {
                    iM8222e = c2085aM8577c.m8222e();
                }
            }
        }
        c2085a.m8220d(c2085a2);
        c2085a.m8209a(c2085aM8566b);
        c2085aM8566b.m8234o().add(c2085a);
        if (c2085aM8554a != null) {
            c2085a.m8206a(2048);
            m8586g(c2085a);
        } else if (c2085a3 == null || !m8572b(c2085a, c2085a3, iM8219d2)) {
            c2085a.m8206a(1024);
        } else {
            c2085a.m8206a(4096);
        }
        c2085a.m8217c(iM8222e);
        return zM8561a3;
    }

    protected static void m8582e(ClassA c2085a) {
        ClassA c2085aM8227h = c2085a.m8227h();
        ClassA c2085aM8228i = c2085a.m8228i();
        ClassA c2085aM8256a = c2085a.m8205a().m8256a(262144, c2085a.m8219d(), c2085a.m8222e());
        c2085a.m8206a(2097152);
        c2085a.m8217c(c2085a.m8219d());
        c2085a.m8218c(c2085aM8256a);
        c2085a.m8220d(c2085aM8227h);
        c2085a.m8223e(c2085aM8228i);
        c2085a.m8209a(c2085aM8227h.m8227h());
        c2085a.m8215b(c2085aM8227h.m8228i());
        c2085aM8227h.m8227h().m8210a(c2085aM8227h, c2085a);
        c2085aM8227h.m8228i().m8210a(c2085aM8227h, c2085a);
        c2085aM8228i.m8227h().m8210a(c2085aM8228i, c2085a);
        c2085aM8228i.m8228i().m8210a(c2085aM8228i, c2085a);
        c2085aM8227h.m8234o().clear();
        c2085aM8228i.m8234o().clear();
    }

    protected static boolean m8583e(BitSet bitSet, ClassA c2085a, BitSet bitSet2) {
        boolean z;
        ClassA c2085aM8228i = c2085a.m8228i();
        boolean zM8561a = m8561a(bitSet, c2085a.m8227h(), bitSet2) & m8561a(bitSet, c2085aM8228i, bitSet2);
        if (!bitSet2.get(c2085aM8228i.m8213b())) {
            if (c2085a.m8228i().m8234o().size() > 1) {
                ClassA c2085aM8227h = c2085a.m8227h();
                Iterator it = c2085a.m8228i().m8234o().iterator();
                z = zM8561a;
                while (it.hasNext()) {
                    ClassA c2085a2 = (ClassA) it.next();
                    if (c2085a2 != c2085a && c2085a2.m8216c() == 8192 && c2085a2.m8227h() == c2085aM8227h) {
                        for (ClassA c2085a3 : c2085a2.m8234o()) {
                            c2085a3.m8210a(c2085a2, c2085a);
                            c2085a.m8234o().add(c2085a3);
                        }
                        c2085aM8227h.m8234o().remove(c2085a2);
                        it.remove();
                        z = true;
                    }
                }
            } else {
                z = zM8561a;
            }
            return z;
        }
        int iM8222e = c2085a.m8222e() - c2085a.m8219d();
        if (iM8222e > 3) {
            if (ClassC.m8507b(c2085a) == 168) {
                c2085a.m8206a(4);
                c2085a.m8217c(c2085a.m8222e() - 3);
                c2085aM8228i.m8234o().remove(c2085a);
                return true;
            }
            if (iM8222e > 5) {
                c2085a.m8206a(4);
                c2085a.m8217c(c2085a.m8222e() - 5);
                c2085aM8228i.m8234o().remove(c2085a);
                return true;
            }
        }
        c2085a.m8206a(0);
        c2085aM8228i.m8234o().remove(c2085a);
        HashSet hashSetM8234o = c2085a.m8227h().m8234o();
        hashSetM8234o.remove(c2085a);
        for (ClassA c2085a4 : c2085a.m8234o()) {
            c2085a4.m8210a(c2085a, c2085a.m8227h());
            hashSetM8234o.add(c2085a4);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c9  */
    protected static boolean m8584f(BitSet bitSet, ClassA c2085a, BitSet bitSet2) {
        boolean zM8561a;
        Object objClone = bitSet.clone();
        boolean zM8561a2 = m8561a(bitSet, c2085a.m8232m(), bitSet2);
        if (zM8561a2) {
            zM8561a = zM8561a2;
        } else {
            BitSet bitSet3 = new BitSet();
            ClassA c2085aM8573c = m8573c(bitSet3, c2085a.m8232m());
            BitSet bitSet4 = (BitSet) ((BitSet) objClone).clone();
            boolean zM8561a3 = m8561a(bitSet4, c2085a.m8232m(), bitSet2);
            if (c2085aM8573c != null) {
                ClassA c2085aM8256a = c2085a.m8205a().m8256a(65536, c2085a.m8232m().m8219d(), c2085a.m8222e());
                c2085aM8256a.m8218c(ClassA.f5966h);
                c2085aM8256a.m8220d(c2085a.m8232m());
                c2085aM8256a.m8209a(c2085aM8573c);
                c2085aM8573c.m8234o().add(c2085aM8256a);
                c2085a.m8220d(c2085aM8256a);
            }
            if (zM8561a3) {
                bitSet = bitSet4;
                zM8561a = zM8561a3;
            } else {
                bitSet3.clear();
                ClassA c2085aM8552a = m8552a(bitSet3, c2085a.m8232m());
                if (c2085aM8552a == null || c2085aM8552a.m8227h() != ClassA.f5963e) {
                    bitSet = bitSet4;
                    zM8561a = zM8561a3;
                } else {
                    bitSet3.clear();
                    bitSet3.set(c2085aM8552a.m8213b());
                    m8568b(bitSet3, c2085a.m8227h(), c2085a.m8232m());
                    ClassA c2085aM8259a = c2085a.m8205a().m8259a(c2085a);
                    HashSet hashSetM8234o = c2085aM8552a.m8234o();
                    Iterator it = hashSetM8234o.iterator();
                    while (it.hasNext()) {
                        ((ClassA) it.next()).m8210a(c2085aM8552a, ClassA.f5965g);
                    }
                    c2085aM8259a.m8209a(c2085aM8552a);
                    hashSetM8234o.clear();
                    hashSetM8234o.add(c2085aM8259a);
                    c2085a.m8220d(c2085aM8259a);
                    bitSet3.clear();
                    bitSet = bitSet4;
                    zM8561a = m8561a(bitSet3, c2085aM8259a, bitSet2);
                }
            }
        }
        return zM8561a & m8561a(bitSet, c2085a.m8227h(), bitSet2);
    }

    protected static boolean m8585f(ClassA c2085a) {
        Iterator it = c2085a.m8229j().iterator();
        while (it.hasNext()) {
            if (((ClassB) it.next()).m8238a() == null) {
                return true;
            }
        }
        return false;
    }

    protected static void m8586g(ClassA c2085a) {
        if (c2085a.m8229j().size() == 1) {
            ClassA c2085aM8232m = c2085a.m8232m();
            if (c2085aM8232m.m8221d(7168)) {
                Iterator it = c2085aM8232m.m8229j().iterator();
                while (it.hasNext()) {
                    if (((ClassB) it.next()).m8238a() == null) {
                        return;
                    }
                }
                for (ClassB c2086b : c2085aM8232m.m8229j()) {
                    ClassA c2085aM8244c = c2086b.m8244c();
                    c2085a.m8207a(c2086b.m8238a(), c2085aM8244c);
                    c2085aM8244c.m8210a(c2085aM8232m, c2085a);
                }
                c2085a.m8220d(c2085aM8232m.m8232m());
                c2085aM8232m.m8232m().m8210a(c2085aM8232m, c2085a);
            }
        }
    }

    protected static void m8587h(ClassA c2085a) {
        HashSet hashSetM8234o = c2085a.m8234o();
        Iterator it = hashSetM8234o.iterator();
        while (it.hasNext()) {
            ((ClassA) it.next()).m8210a(c2085a, ClassA.f5964f);
        }
        hashSetM8234o.clear();
    }
}
