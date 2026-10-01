package org.a.a.a;

import com.baidu.mobstat.Config;
import java.io.Serializable;
import org.apache.commons.io.IOUtils;
import org.a.a.a.c.ClassH;
import org.a.a.a.c.ClassM;

public class ClassL implements Serializable, Interfaceaf {

    protected static final ClassM f5325a = new ClassM(null, null);

    protected int f5326b;

    protected int f5327c;

    protected int f5328d;

    protected int f5329e;

    protected ClassM f5330f;

    protected String f5331g;

    protected int f5332h = -1;

    protected int f5333i;

    protected int f5334j;

    public ClassL(ClassM c1776m, int i, int i2, int i3, int i4) {
        this.f5328d = -1;
        this.f5329e = 0;
        this.f5330f = c1776m;
        this.f5326b = i;
        this.f5329e = i2;
        this.f5333i = i3;
        this.f5334j = i4;
        if (c1776m.f5293a != null) {
            this.f5327c = ((Interfaceac) c1776m.f5293a).mo7468j();
            this.f5328d = ((Interfaceac) c1776m.f5293a).mo7469k();
        }
    }

    @Override
    public int mo7354a() {
        return this.f5326b;
    }

    public String m7443a(Abstractu abstractC1795u) {
        String str = this.f5329e > 0 ? ",channel=" + this.f5329e : "";
        String strM7446b = m7446b();
        String strReplace = strM7446b != null ? strM7446b.replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f5326b);
        if (abstractC1795u != null) {
            strValueOf = abstractC1795u.mo5544b().mo7360c(this.f5326b);
        }
        return "[@" + m7448e() + "," + this.f5333i + Config.TRACE_TODAY_VISIT_SPLIT + this.f5334j + "='" + strReplace + "',<" + strValueOf + ">" + str + "," + this.f5327c + Config.TRACE_TODAY_VISIT_SPLIT + mo7356d() + "]";
    }

    public void m7444a(int i) {
        this.f5327c = i;
    }

    public void m7445a(String str) {
        this.f5331g = str;
    }

    public String m7446b() {
        if (this.f5331g != null) {
            return this.f5331g;
        }
        Interfacec interfaceC1763cM7449f = m7449f();
        if (interfaceC1763cM7449f == null) {
            return null;
        }
        int iC = interfaceC1763cM7449f.mo7440c();
        return (this.f5333i >= iC || this.f5334j >= iC) ? "<EOF>" : interfaceC1763cM7449f.mo7367a(ClassH.m7387a(this.f5333i, this.f5334j));
    }

    public void m7447b(int i) {
        this.f5328d = i;
    }

    @Override
    public int mo7355c() {
        return this.f5327c;
    }

    @Override
    public int mo7356d() {
        return this.f5328d;
    }

    public int m7448e() {
        return this.f5332h;
    }

    public Interfacec m7449f() {
        return (Interfacec) this.f5330f.f5294b;
    }

    public String toString() {
        return m7443a((Abstractu) null);
    }
}
