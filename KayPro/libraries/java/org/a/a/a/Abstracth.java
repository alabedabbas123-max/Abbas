package org.a.a.a;

import org.a.a.a.c.ClassH;

public abstract class Abstracth implements Interfacec {

    static final boolean f5314d;

    private static int[] f5315e;

    protected final int f5316a;

    protected final String f5317b;

    protected int f5318c;

    static {
        f5314d = !Abstracth.class.desiredAssertionStatus();
    }

    private Abstracth(int i, int i2, String str) {
        if (!f5314d && i != 0) {
            throw new AssertionError();
        }
        this.f5316a = i2;
        this.f5317b = str;
        this.f5318c = 0;
    }

    Abstracth(int i, int i2, String str, Abstracth abstractC1782h) {
        this(i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Abstracth m7434a(ClassE c1779e, String str) {
        ClassK c1785k = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (m7435e()[c1779e.m7416c().ordinal()]) {
            case 1:
                return new ClassK(c1779e.m7414a(), c1779e.m7415b(), str, c1779e.m7418e(), c1779e.m7417d(), c1785k);
            case 2:
                return new ClassI(c1779e.m7414a(), c1779e.m7415b(), str, c1779e.m7419f(), c1779e.m7417d(), objArr2 == true ? 1 : 0);
            case 3:
                return new ClassJ(c1779e.m7414a(), c1779e.m7415b(), str, c1779e.m7420g(), c1779e.m7417d(), objArr == true ? 1 : 0);
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }

    static int[] m7435e() {
        int[] iArr = f5315e;
        if (iArr == null) {
            iArr = new int[Enumg.m7433a().length];
            try {
                iArr[Enumg.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enumg.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enumg.INT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            f5315e = iArr;
        }
        return iArr;
    }

    @Override
    public final void mo7436a() {
        if (this.f5316a - this.f5318c != 0) {
            this.f5318c++;
        } else {
            if (!f5314d && mo7442c(1) != -1) {
                throw new AssertionError();
            }
            throw new IllegalStateException("cannot consume EOF");
        }
    }

    @Override
    public final void mo7437a(int i) {
    }

    @Override
    public final int mo7438b() {
        return this.f5318c;
    }

    @Override
    public final void mo7439b(int i) {
        this.f5318c = i;
    }

    @Override
    public final int mo7440c() {
        return this.f5316a;
    }

    @Override
    public final int mo7441d() {
        return -1;
    }

    public final String toString() {
        return mo7367a(ClassH.m7387a(0, this.f5316a - 1));
    }
}
