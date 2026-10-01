package com.a.b.c.c;

import com.baidu.mobstat.Config;
import com.a.b.g.Interfacea;
import java.util.Collection;
import org.apache.commons.io.IOUtils;

public abstract class Abstractax {

    private final String f2407a;

    private final ClassT f2408b;

    private final int f2409c;

    private int f2410d;

    private boolean f2411e;

    public Abstractax(String str, ClassT c1113t, int i) {
        if (c1113t == null) {
            throw new NullPointerException("file == null");
        }
        m4535a(i);
        this.f2407a = str;
        this.f2408b = c1113t;
        this.f2409c = i;
        this.f2410d = -1;
        this.f2411e = false;
    }

    public static void m4535a(int i) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
    }

    public abstract int mo4510a(Abstractag abstractC1066ag);

    protected abstract void mo4513a_(Interfacea interfaceC1303a);

    public final int m4536b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f2410d >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.f2409c - 1;
        int i3 = (i2 ^ (-1)) & (i + i2);
        this.f2410d = i3;
        return i3;
    }

    public abstract Collection mo4482b();

    public final int m4537c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        if (this.f2410d < 0) {
            throw new RuntimeException("fileOffset not yet set");
        }
        return this.f2410d + i;
    }

    protected abstract void mo4515c();

    public final void m4538c(Interfacea interfaceC1303a) {
        m4544j();
        m4539d(interfaceC1303a);
        int iG = interfaceC1303a.mo5462g();
        if (this.f2410d < 0) {
            this.f2410d = iG;
        } else if (this.f2410d != iG) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iG + ", but expected " + this.f2410d);
        }
        if (interfaceC1303a.mo5405a()) {
            if (this.f2407a != null) {
                interfaceC1303a.mo5403a(0, IOUtils.LINE_SEPARATOR_UNIX + this.f2407a + Config.TRACE_TODAY_VISIT_SPLIT);
            } else if (iG != 0) {
                interfaceC1303a.mo5403a(0, IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        mo4513a_(interfaceC1303a);
    }

    protected final void m4539d(Interfacea interfaceC1303a) {
        interfaceC1303a.mo5465h(this.f2409c);
    }

    public final ClassT m4540f() {
        return this.f2408b;
    }

    public abstract int mo4517f_();

    public final int m4541g() {
        return this.f2409c;
    }

    public final int m4542h() {
        if (this.f2410d < 0) {
            throw new RuntimeException("fileOffset not set");
        }
        return this.f2410d;
    }

    public final void m4543i() {
        m4545k();
        mo4515c();
        this.f2411e = true;
    }

    protected final void m4544j() {
        if (!this.f2411e) {
            throw new RuntimeException("not prepared");
        }
    }

    protected final void m4545k() {
        if (this.f2411e) {
            throw new RuntimeException("already prepared");
        }
    }
}
