package com.a.b.c.c;

import com.a.a.a.ClassB;
import com.a.b.c.ClassA;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ab;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassJ;
import com.a.b.e.c.ClassM;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassY;
import com.a.b.g.ClassH;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

public final class ClassT {

    private final ClassA f2504a;

    private final ClassH f2516m;

    private final an f2517n;

    private final Abstractax[] f2520q;

    private int f2521r;

    private int f2522s;

    private final ad f2519p = new ad(this);

    private final aq f2506c = new aq(null, this, 4, Enumas.NONE);

    private final aq f2505b = new aq("word_data", this, 4, Enumas.TYPE);

    private final aq f2508e = new aq("string_data", this, 1, Enumas.INSTANCE);

    private final aq f2515l = new aq(null, this, 1, Enumas.NONE);

    private final aq f2518o = new aq("byte_data", this, 1, Enumas.TYPE);

    private final bc f2509f = new bc(this);

    private final be f2510g = new be(this);

    private final aw f2511h = new aw(this);

    private final ab f2512i = new ab(this);

    private final ap f2513j = new ap(this);

    private final ClassM f2514k = new ClassM(this);

    private final aq f2507d = new aq("map", this, 4, Enumas.NONE);

    public ClassT(ClassA c0984a) {
        this.f2504a = c0984a;
        if (c0984a.m4203a(26)) {
            this.f2516m = new ClassH(this);
            this.f2517n = new an(this);
            this.f2520q = new Abstractax[]{this.f2519p, this.f2509f, this.f2510g, this.f2511h, this.f2512i, this.f2513j, this.f2514k, this.f2516m, this.f2517n, this.f2505b, this.f2506c, this.f2508e, this.f2518o, this.f2515l, this.f2507d};
        } else {
            this.f2516m = null;
            this.f2517n = null;
            this.f2520q = new Abstractax[]{this.f2519p, this.f2509f, this.f2510g, this.f2511h, this.f2512i, this.f2513j, this.f2514k, this.f2505b, this.f2506c, this.f2508e, this.f2518o, this.f2515l, this.f2507d};
        }
        this.f2521r = -1;
        this.f2522s = 79;
    }

    private ClassH m4664a(boolean z, boolean z2, ClassU c1114u) {
        this.f2514k.m4543i();
        this.f2515l.m4543i();
        this.f2505b.m4543i();
        if (this.f2504a.m4203a(26)) {
            this.f2516m.m4543i();
        }
        this.f2518o.m4543i();
        if (this.f2504a.m4203a(26)) {
            this.f2517n.m4543i();
        }
        this.f2513j.m4543i();
        this.f2512i.m4543i();
        this.f2511h.m4543i();
        this.f2506c.m4543i();
        this.f2510g.m4543i();
        this.f2509f.m4543i();
        this.f2508e.m4543i();
        this.f2519p.m4543i();
        int length = this.f2520q.length;
        int iMo4517f_ = 0;
        for (int i = 0; i < length; i++) {
            Abstractax abstractC1083ax = this.f2520q[i];
            if ((abstractC1083ax != this.f2516m && abstractC1083ax != this.f2517n) || !abstractC1083ax.mo4482b().isEmpty()) {
                int iM4536b = abstractC1083ax.m4536b(iMo4517f_);
                if (iM4536b < iMo4517f_) {
                    throw new RuntimeException("bogus placement for section " + i);
                }
                try {
                    if (abstractC1083ax == this.f2507d) {
                        ai.m4494a(this.f2520q, this.f2507d);
                        this.f2507d.m4543i();
                    }
                    if (abstractC1083ax instanceof aq) {
                        ((aq) abstractC1083ax).m4516d();
                    }
                    iMo4517f_ = abstractC1083ax.mo4517f_() + iM4536b;
                } catch (RuntimeException e) {
                    throw ClassB.m3756a(e, "...while writing section " + i);
                }
            }
        }
        this.f2521r = iMo4517f_;
        byte[] bArrM4690a = c1114u == null ? new byte[this.f2521r] : c1114u.m4690a(this.f2521r);
        ClassH c1310h = new ClassH(bArrM4690a);
        if (z) {
            c1310h.m5449a(this.f2522s, z2);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                Abstractax abstractC1083ax2 = this.f2520q[i2];
                if ((abstractC1083ax2 != this.f2516m && abstractC1083ax2 != this.f2517n) || !abstractC1083ax2.mo4482b().isEmpty()) {
                    int iM4542h = abstractC1083ax2.m4542h() - c1310h.mo5462g();
                    if (iM4542h < 0) {
                        throw new ClassB("excess write of " + (-iM4542h));
                    }
                    c1310h.mo5463g(iM4542h);
                    abstractC1083ax2.m4538c(c1310h);
                }
            } catch (RuntimeException e2) {
                ClassB c0882b = e2 instanceof ClassB ? (ClassB) e2 : new ClassB(e2);
                c0882b.m3757a("...while writing section " + i2);
                throw c0882b;
            }
        }
        if (c1310h.mo5462g() != this.f2521r) {
            throw new RuntimeException("foreshortened write");
        }
        m4665a(bArrM4690a, c1310h.mo5462g());
        m4666b(bArrM4690a, c1310h.mo5462g());
        if (z) {
            this.f2505b.m4512a(c1310h, Enumah.TYPE_CODE_ITEM, "\nmethod code index:\n\n");
            m4689s().m4548a(c1310h);
            c1310h.m5464h();
        }
        return c1310h;
    }

    private static void m4665a(byte[] bArr, int i) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, i - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void m4666b(byte[] bArr, int i) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, i - 12);
        int value = (int) adler32.getValue();
        bArr[8] = (byte) value;
        bArr[9] = (byte) (value >> 8);
        bArr[10] = (byte) (value >> 16);
        bArr[11] = (byte) (value >> 24);
    }

    public ClassA m4667a() {
        return this.f2504a;
    }

    public void m4668a(ClassL c1105l) {
        this.f2514k.m4630a(c1105l);
    }

    void m4669a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC1200a instanceof ad) {
            this.f2509f.m4558a((ad) abstractC1200a);
            return;
        }
        if (abstractC1200a instanceof ae) {
            this.f2510g.m4562a((ae) abstractC1200a);
            return;
        }
        if (abstractC1200a instanceof Abstractf) {
            this.f2513j.m4506a((Abstractf) abstractC1200a);
            return;
        }
        if (abstractC1200a instanceof ClassN) {
            this.f2512i.m4478a((ClassN) abstractC1200a);
            return;
        }
        if (abstractC1200a instanceof ClassM) {
            this.f2512i.m4478a(((ClassM) abstractC1200a).m4998i());
        } else if (abstractC1200a instanceof ab) {
            this.f2511h.m4532a(((ab) abstractC1200a).m4950i());
        } else if (abstractC1200a instanceof ClassY) {
            this.f2517n.m4502a((ClassY) abstractC1200a);
        }
    }

    public byte[] m4670a(Writer writer, boolean z) {
        boolean z2 = writer != null;
        ClassH c1310hM4664a = m4664a(z2, z, null);
        if (z2) {
            c1310hM4664a.m5452a(writer);
        }
        return c1310hM4664a.m5459e();
    }

    public int m4671b() {
        if (this.f2521r < 0) {
            throw new RuntimeException("file size not yet known");
        }
        return this.f2521r;
    }

    Abstractaf m4672b(Abstracta abstractC1200a) {
        if (abstractC1200a instanceof ad) {
            return this.f2509f.m4556a(abstractC1200a);
        }
        if (abstractC1200a instanceof ae) {
            return this.f2510g.m4561a(abstractC1200a);
        }
        if (abstractC1200a instanceof Abstractf) {
            return this.f2513j.m4505a(abstractC1200a);
        }
        if (abstractC1200a instanceof ClassN) {
            return this.f2512i.m4479a(abstractC1200a);
        }
        if (abstractC1200a instanceof ClassM) {
            return this.f2512i.m4478a(((ClassM) abstractC1200a).m4998i());
        }
        if (abstractC1200a instanceof ab) {
            return this.f2511h.m4531a(abstractC1200a);
        }
        if (abstractC1200a instanceof ClassY) {
            return this.f2517n.m4501a(abstractC1200a);
        }
        if (abstractC1200a instanceof ClassJ) {
            return this.f2516m.m4596a(abstractC1200a);
        }
        return null;
    }

    aq m4673c() {
        return this.f2508e;
    }

    aq m4674d() {
        return this.f2505b;
    }

    aq m4675e() {
        return this.f2506c;
    }

    aq m4676f() {
        return this.f2507d;
    }

    bc m4677g() {
        return this.f2509f;
    }

    public ClassM m4678h() {
        return this.f2514k;
    }

    aq m4679i() {
        return this.f2515l;
    }

    public be m4680j() {
        return this.f2510g;
    }

    aw m4681k() {
        return this.f2511h;
    }

    public ab m4682l() {
        return this.f2512i;
    }

    public ap m4683m() {
        return this.f2513j;
    }

    public an m4684n() {
        return this.f2517n;
    }

    public ClassH m4685o() {
        return this.f2516m;
    }

    aq m4686p() {
        return this.f2518o;
    }

    Abstractax m4687q() {
        return this.f2505b;
    }

    Abstractax m4688r() {
        return this.f2507d;
    }

    public ay m4689s() {
        ay c1084ay = new ay();
        for (Abstractax abstractC1083ax : this.f2520q) {
            c1084ay.m4547a(abstractC1083ax);
        }
        return c1084ay;
    }
}
