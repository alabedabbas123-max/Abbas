package a.b.g;

import a.b.a.a.a.a.a;
import a.b.a.a.a.a.b;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.b.h;
import a.b.a.a.b.i;
import a.b.a.a.e;
import a.b.a.a.n;
import a.b.a.a.p;
import a.b.a.b.a.c;
import a.b.a.b.a.d;
import a.b.a.d.j;
import a.b.a.d.l;
import a.b.a.d.m;
import a.b.a.d.o;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.d.u;
import a.b.a.t;
import a.b.a.v;
import a.b.a.x;
import a.b.a.y;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.io.OutputStream;
import java.io.PrintWriter;
import a.b.Abstractm;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassG;
import a.b.d.ClassJ;
import a.b.f.ClassI;

public class ClassP extends w implements a, b, f, g, h, i, a.b.a.b.a.a, a.b.a.b.a.b, c, d, a.b.a.c.a.a, a.b.a.c.a.b, a.b.a.d.i, j, l, m, o, q, r, u, a.b.b.a.f, a.b.d.a.d, aq, s {

    private final PrintWriter f411a;

    private int f412b;

    public ClassP() {
        this(new PrintWriter((OutputStream) System.out, true));
    }

    public ClassP(PrintWriter printWriter) {
        this.f411a = printWriter;
    }

    private String m1141a(a.b.o oVar) {
        return oVar.f() == null ? "-" : "+";
    }

    private void m1142a() {
        this.f412b++;
    }

    private void m1143a(String str) {
        m1146b(str);
        m1147c();
    }

    private void m1144b() {
        this.f412b--;
    }

    private void m1145b(k kVar, Abstractm abstractC0164m) {
        if (abstractC0164m.f433e > 0) {
            m1143a("Class member attributes (count = " + abstractC0164m.f433e + "):");
            abstractC0164m.mo1267a(kVar, (a.b.a.d.i) this);
        }
    }

    private void m1146b(String str) {
        for (int i = 0; i < this.f412b; i++) {
            this.f411a.print("  ");
        }
        this.f411a.print(str);
    }

    private void m1147c() {
        this.f411a.println();
    }

    public void m1148a(a.b.c cVar, a.b.a.a.a aVar) {
        m1143a(m1141a((a.b.o) aVar) + " Annotation [" + aVar.a(cVar) + "]:");
        m1142a();
        aVar.a(cVar, this);
        m1144b();
    }

    public void m1149a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.c cVar2) {
        m1143a(m1141a((a.b.o) cVar2) + " Annotation element value [" + (cVar2.c == 0 ? "(default)" : cVar2.b(cVar)) + "]:");
        m1142a();
        cVar2.a(cVar, this);
        m1144b();
    }

    public void m1150a(a.b.c cVar, a.b.a.a.a aVar, e eVar) {
        m1143a(m1141a((a.b.o) eVar) + " Array element value [" + (eVar.c == 0 ? "(default)" : eVar.b(cVar)) + "]:");
        m1142a();
        eVar.b(cVar, aVar, this);
        m1144b();
    }

    public void m1151a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.f fVar) {
        m1143a(m1141a((a.b.o) fVar) + " Class element value [" + (fVar.c == 0 ? "(default)" : fVar.b(cVar)) + ", " + fVar.a(cVar) + "]");
    }

    public void m1152a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.g gVar) {
        m1143a(m1141a((a.b.o) gVar) + " Constant element value [" + (gVar.c == 0 ? "(default)" : gVar.b(cVar)) + " '" + gVar.a + "']");
        m1142a();
        cVar.a(gVar.b, this);
        m1144b();
    }

    public void m1153a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.i iVar) {
        m1143a(m1141a((a.b.o) iVar) + " Enum constant element value [" + (iVar.c == 0 ? "(default)" : iVar.b(cVar)) + ", " + iVar.a(cVar) + ", " + iVar.c(cVar) + "]");
    }

    public void m1154a(a.b.c cVar, a.b.a.a.k kVar) {
        m1143a(m1141a((a.b.o) kVar) + " Runtime invisible annotations attribute:");
        m1142a();
        kVar.a(cVar, this);
        m1144b();
    }

    public void m1155a(a.b.c cVar, a.b.a.a.m mVar) {
        m1143a(m1141a((a.b.o) mVar) + " Runtime invisible type annotations attribute");
        m1142a();
        mVar.a(cVar, this);
        m1144b();
    }

    public void m1156a(a.b.c cVar, n nVar) {
        m1143a(m1141a((a.b.o) nVar) + " Runtime visible annotations attribute:");
        m1142a();
        nVar.a(cVar, this);
        m1144b();
    }

    public void m1157a(a.b.c cVar, p pVar) {
        m1143a(m1141a((a.b.o) pVar) + " Runtime visible type annotations attribute");
        m1142a();
        pVar.a(cVar, this);
        m1144b();
    }

    public void m1158a(a.b.c cVar, a.b.a.a.q qVar) {
        m1143a(m1141a((a.b.o) qVar) + " Type annotation [" + qVar.a(cVar) + "]:");
        m1142a();
        qVar.a(cVar, this);
        m1143a("Type path (count = " + qVar.g.length + "):");
        m1142a();
        qVar.a(cVar, this);
        m1144b();
        qVar.a(cVar, this);
        m1144b();
    }

    public void m1159a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.a.g gVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(gVar.c) + "): " + (gVar.b == 65535 ? "super class" : "interface #" + gVar.b));
    }

    public void m1160a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.a.k kVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(kVar.c) + "): parameter #" + kVar.a + ", bound #" + kVar.b);
    }

    public void m1161a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.a.l lVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(lVar.c) + "): Parameter #" + lVar.a);
    }

    public void m1162a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.s sVar) {
        m1143a("kind = " + sVar.a + ", argument index = " + sVar.b);
    }

    public void m1163a(a.b.c cVar, a.b.a.b.a aVar) {
        m1143a(m1141a((a.b.o) aVar) + " ExportsInfo (targets count = " + aVar.c + "):");
        m1142a();
        cVar.a(aVar.a, this);
        m1143a("Access flags:  0x" + Integer.toHexString(aVar.b) + " = " + ClassI.m787l(aVar.b));
        for (int i = 0; i < aVar.c; i++) {
            cVar.a(aVar.d[i], this);
        }
        m1144b();
    }

    public void m1164a(a.b.c cVar, a.b.a.b.b bVar) {
        m1143a(m1141a((a.b.o) bVar) + " Module attribute:");
        m1142a();
        cVar.a(bVar.c, this);
        m1143a("Access flags:  0x" + Integer.toHexString(bVar.d) + " = " + ClassI.m783j(bVar.d));
        if (bVar.e != 0) {
            cVar.a(bVar.e, this);
        }
        m1143a("Requires:");
        bVar.a(cVar, this);
        m1143a("Exports:");
        bVar.a(cVar, this);
        m1143a("Opens:");
        bVar.a(cVar, this);
        m1143a("Uses services:");
        for (int i = 0; i < bVar.l; i++) {
            cVar.a(bVar.m[i], this);
        }
        m1143a("Provides services:");
        bVar.a(cVar, this);
        m1144b();
    }

    public void m1165a(a.b.c cVar, a.b.a.b.c cVar2) {
        m1143a(m1141a((a.b.o) cVar2) + " Module main class attribute:");
        m1142a();
        cVar.a(cVar2.c, this);
        m1144b();
    }

    public void m1166a(a.b.c cVar, a.b.a.b.d dVar) {
        m1143a(m1141a((a.b.o) dVar) + " Module packages attribute (count = " + dVar.c + "):");
        m1142a();
        dVar.a(cVar, this);
        m1144b();
    }

    public void m1167a(a.b.c cVar, a.b.a.b.e eVar) {
        m1143a(m1141a((a.b.o) eVar) + " OpensInfo (targets count = " + eVar.c + "):");
        m1142a();
        cVar.a(eVar.a, this);
        m1143a("Access flags:  0x" + Integer.toHexString(eVar.b) + " = " + ClassI.m789m(eVar.b));
        for (int i = 0; i < eVar.c; i++) {
            cVar.a(eVar.d[i], this);
        }
        m1144b();
    }

    public void m1168a(a.b.c cVar, a.b.a.b.f fVar) {
        m1143a(m1141a((a.b.o) fVar) + " ProvidesInfo (with count = " + fVar.b + "):");
        m1142a();
        cVar.a(fVar.a, this);
        for (int i = 0; i < fVar.b; i++) {
            cVar.a(fVar.c[i], this);
        }
        m1144b();
    }

    public void m1169a(a.b.c cVar, a.b.a.b.g gVar) {
        m1143a(m1141a((a.b.o) gVar) + " RequiresInfo:");
        m1142a();
        cVar.a(gVar.a, this);
        m1143a("Access flags:  0x" + Integer.toHexString(gVar.b) + " = " + ClassI.m785k(gVar.b));
        cVar.a(gVar.c, this);
        m1144b();
    }

    public void m1170a(a.b.c cVar, a.b.a.b bVar) {
        m1143a(m1141a((a.b.o) bVar) + " BootstrapMethodInfo (argument count = " + bVar.b + "):");
        m1142a();
        cVar.a(bVar.a, this);
        bVar.a(cVar, this);
        m1144b();
    }

    public void m1171a(a.b.c cVar, a.b.a.c cVar2) {
        m1143a(m1141a((a.b.o) cVar2) + " Bootstrap methods attribute (count = " + cVar2.c + "):");
        m1142a();
        cVar2.a(cVar, this);
        m1144b();
    }

    public void m1172a(a.b.c cVar, a.b.a.f fVar) {
        m1143a(m1141a((a.b.o) fVar) + " Deprecated attribute");
    }

    public void m1173a(a.b.c cVar, a.b.a.g gVar) {
        m1143a(m1141a((a.b.o) gVar) + " Enclosing method attribute:");
        m1142a();
        cVar.a(gVar.c, this);
        if (gVar.d != 0) {
            cVar.a(gVar.d, this);
        }
        m1144b();
    }

    public void m1174a(a.b.c cVar, a.b.a.k kVar) {
        m1143a(m1141a((a.b.o) kVar) + " Inner classes attribute (count = " + kVar.c + "):");
        m1142a();
        kVar.a(cVar, this);
        m1144b();
    }

    public void m1175a(a.b.c cVar, a.b.a.l lVar) {
        m1143a(m1141a((a.b.o) lVar) + " InnerClassesInfo:");
        m1142a();
        m1143a("Access flags:  0x" + Integer.toHexString(lVar.d) + " = " + ClassI.m771f(lVar.d));
        lVar.a(cVar, this);
        lVar.b(cVar, this);
        lVar.c(cVar, this);
        m1144b();
    }

    public void m1176a(a.b.c cVar, a.b.a.u uVar) {
        m1143a(m1141a((a.b.o) uVar) + " Signature attribute:");
        m1142a();
        cVar.a(uVar.c, this);
        m1144b();
    }

    public void m1177a(a.b.c cVar, v vVar) {
        m1143a(m1141a((a.b.o) vVar) + " Source dir attribute:");
        m1142a();
        cVar.a(vVar.c, this);
        m1144b();
    }

    public void m1178a(a.b.c cVar, a.b.a.w wVar) {
        m1143a(m1141a((a.b.o) wVar) + " Source file attribute:");
        m1142a();
        cVar.a(wVar.c, this);
        m1144b();
    }

    public void m1179a(a.b.c cVar, x xVar) {
        m1143a(m1141a((a.b.o) xVar) + " Synthetic attribute");
    }

    public void m1180a(a.b.c cVar, y yVar) {
        m1143a(m1141a((a.b.o) yVar) + " Unknown attribute (" + yVar.a(cVar) + ")");
    }

    public void m1181a(a.b.c cVar, a.b.b.a aVar) {
        m1143a(m1141a((a.b.o) aVar) + " Class [" + aVar.a(cVar) + "]");
    }

    public void m1182a(a.b.c cVar, a.b.b.c cVar2) {
        m1143a(m1141a((a.b.o) cVar2) + " Double [" + cVar2.b() + "]");
    }

    public void m1183a(a.b.c cVar, a.b.b.d dVar) {
        m1143a(m1141a((a.b.o) dVar) + " Fieldref [" + cVar.e(dVar.a) + "." + cVar.f(dVar.b) + " " + cVar.g(dVar.b) + "]");
    }

    public void m1184a(a.b.c cVar, a.b.b.e eVar) {
        m1143a(m1141a((a.b.o) eVar) + " Float [" + eVar.b() + "]");
    }

    public void m1185a(a.b.c cVar, a.b.b.f fVar) {
        m1143a(m1141a((a.b.o) fVar) + " Integer [" + fVar.b() + "]");
    }

    public void m1186a(a.b.c cVar, a.b.b.g gVar) {
        m1143a(m1141a((a.b.o) gVar) + " InterfaceMethodref [" + cVar.e(gVar.a) + "." + cVar.f(gVar.b) + " " + cVar.g(gVar.b) + "]");
    }

    public void m1187a(a.b.c cVar, a.b.b.h hVar) {
        m1143a(m1141a((a.b.o) hVar) + " InvokeDynamic [bootstrap method index = " + hVar.a + "]:");
        m1142a();
        cVar.a(hVar.b, this);
        m1144b();
    }

    public void m1188a(a.b.c cVar, a.b.b.i iVar) {
        m1143a(m1141a((a.b.o) iVar) + " Long [" + iVar.b() + "]");
    }

    public void m1189a(a.b.c cVar, a.b.b.j jVar) {
        m1143a(m1141a((a.b.o) jVar) + " MethodHandle [kind = " + jVar.a + "]:");
        m1142a();
        cVar.a(jVar.b, this);
        m1144b();
    }

    public void m1190a(a.b.c cVar, a.b.b.k kVar) {
        m1143a(m1141a((a.b.o) kVar) + " MethodType [" + kVar.a(cVar) + "]");
    }

    public void m1191a(a.b.c cVar, a.b.b.l lVar) {
        m1143a(m1141a((a.b.o) lVar) + " Methodref [" + cVar.e(lVar.a) + "." + cVar.f(lVar.b) + " " + cVar.g(lVar.b) + "]");
    }

    public void m1192a(a.b.c cVar, a.b.b.m mVar) {
        m1143a(m1141a((a.b.o) mVar) + " Module [" + mVar.a(cVar) + "]");
    }

    public void m1193a(a.b.c cVar, a.b.b.n nVar) {
        m1143a(m1141a((a.b.o) nVar) + " NameAndType [" + nVar.a(cVar) + " " + nVar.b(cVar) + "]");
    }

    public void m1194a(a.b.c cVar, a.b.b.o oVar) {
        m1143a(m1141a((a.b.o) oVar) + " Package [" + oVar.a(cVar) + "]");
    }

    public void m1195a(a.b.c cVar, a.b.b.p pVar) {
        m1143a(m1141a((a.b.o) pVar) + " PrimitiveArray " + pVar.b() + "[" + pVar.c() + "]");
    }

    public void m1196a(a.b.c cVar, a.b.b.r rVar) {
        m1143a(m1141a((a.b.o) rVar) + " String [" + rVar.a(cVar) + "]");
    }

    public void m1197a(a.b.c cVar, a.b.b.s sVar) {
        m1143a(m1141a((a.b.o) sVar) + " Utf8 [" + sVar.c() + "]");
    }

    public void m1198a(a.b.c cVar, Interfaced interfaceC0041d, a.b.a.e eVar) {
        m1143a(m1141a((a.b.o) eVar) + " Constant value attribute:");
        cVar.a(eVar.c, this);
    }

    public void m1199a(a.b.c cVar, Interfacei interfaceC0161i, a.b.a.a.q qVar, a.b.a.a.a.b bVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(bVar.c) + ")");
    }

    public void m1200a(a.b.c cVar, Interfacej interfaceC0162j, int i, a.b.a.a.a aVar) {
        m1143a(m1141a((a.b.o) aVar) + " Parameter #" + i + ", annotation [" + aVar.a(cVar) + "]:");
        m1142a();
        aVar.a(cVar, this);
        m1144b();
    }

    public void m1201a(a.b.c cVar, Interfacej interfaceC0162j, int i, t tVar) {
        m1143a("p" + i + ":  Access flags: 0x" + Integer.toHexString(tVar.b) + " = " + ClassI.m780i(tVar.b) + " [" + (tVar.a == 0 ? "" : tVar.a(cVar)) + "]");
    }

    public void m1202a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        m1143a(m1141a((a.b.o) bVar) + " Annotation default attribute:");
        m1142a();
        bVar.a(cVar, this);
        m1144b();
    }

    public void m1203a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.l lVar) {
        m1143a(m1141a((a.b.o) lVar) + " Runtime invisible parameter annotations attribute (parameter count = " + lVar.c + "):");
        m1142a();
        lVar.a(cVar, interfaceC0162j, this);
        m1144b();
    }

    public void m1204a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.o oVar) {
        m1143a(m1141a((a.b.o) oVar) + " Runtime visible parameter annotations attribute (parameter count = " + oVar.c + "):");
        m1142a();
        oVar.a(cVar, interfaceC0162j, this);
        m1144b();
    }

    public void m1205a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.q qVar, a.b.a.a.a.c cVar2) {
        m1143a("Target (type = 0x" + Integer.toHexString(cVar2.c) + "): formal parameter #" + cVar2.a);
    }

    public void m1206a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.q qVar, a.b.a.a.a.i iVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(iVar.c) + "): throws #" + iVar.a);
    }

    public void m1207a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        m1143a(m1141a((a.b.o) dVar) + " Code attribute instructions (code length = " + dVar.e + ", locals = " + dVar.d + ", stack = " + dVar.c + "):");
        m1142a();
        dVar.a(cVar, interfaceC0162j, this);
        m1143a("Code attribute exceptions (count = " + dVar.g + "):");
        dVar.a(cVar, interfaceC0162j, this);
        m1143a("Code attribute attributes (attribute count = " + dVar.i + "):");
        dVar.b(cVar, interfaceC0162j, this);
        m1144b();
    }

    public void m1208a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.a aVar) {
        this.f411a.print("[d]");
    }

    public void m1209a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.b bVar) {
        this.f411a.print("[f]");
    }

    public void m1210a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.c cVar2) {
        m1146b(m1141a((a.b.o) cVar2) + " [" + i + "] Var: ");
        cVar2.a(cVar, interfaceC0162j, dVar, i, this);
        this.f411a.print(", Stack: ");
        cVar2.b(cVar, interfaceC0162j, dVar, i, this);
        m1147c();
    }

    public void m1211a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.d dVar2) {
        this.f411a.print("[i]");
    }

    public void m1212a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.e eVar) {
        m1143a(m1141a((a.b.o) eVar) + " [" + i + "] Var: -" + eVar.a + ", Stack: (empty)");
    }

    public void m1213a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.f fVar) {
        this.f411a.print("[l]");
    }

    public void m1214a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.g gVar) {
        m1146b(m1141a((a.b.o) gVar) + " [" + i + "] Var: ...");
        gVar.a(cVar, interfaceC0162j, dVar, i, this);
        this.f411a.println(", Stack: (empty)");
    }

    public void m1215a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.h hVar) {
        this.f411a.print("[n]");
    }

    public void m1216a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.i iVar) {
        this.f411a.print("[a:" + cVar.e(iVar.a) + "]");
    }

    public void m1217a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.j jVar) {
        m1146b(m1141a((a.b.o) jVar) + " [" + i + "] Var: ..., Stack: ");
        jVar.a(cVar, interfaceC0162j, dVar, i, this);
        m1147c();
    }

    public void m1218a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.k kVar) {
        m1143a(m1141a((a.b.o) kVar) + " [" + i + "] Var: ..., Stack: (empty)");
    }

    public void m1219a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.o oVar) {
        this.f411a.print("[T]");
    }

    public void m1220a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.p pVar) {
        this.f411a.print("[u:this]");
    }

    public void m1221a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.q qVar) {
        this.f411a.print("[u:" + qVar.a + "]");
    }

    public void m1222a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        m1143a(c0047b.mo333b(i));
        m1142a();
        cVar.a(c0047b.f139a, this);
        m1144b();
    }

    public void m1223a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        m1143a(abstractC0048c.mo333b(i));
    }

    public void m1224a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassG c0052g) {
        m1143a(c0052g.mo333b(i));
        m1142a();
        int[] iArr = c0052g.f149a;
        int[] iArr2 = c0052g.f152d;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            int i3 = iArr2[i2];
            m1143a(Integer.toString(iArr[i2]) + ": offset = " + i3 + ", target = " + (i3 + i));
        }
        int i4 = c0052g.f151b;
        m1143a("default: offset = " + i4 + ", target = " + (i4 + i));
        m1144b();
    }

    public void m1225a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassJ c0055j) {
        m1143a(c0055j.mo333b(i));
        m1142a();
        int[] iArr = c0055j.f152d;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            m1143a(Integer.toString(c0055j.f153a + i2) + ": offset = " + i3 + ", target = " + (i3 + i));
        }
        int i4 = c0055j.f151b;
        m1143a("default: offset = " + i4 + ", target = " + (i4 + i));
        m1144b();
    }

    public void m1226a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.a aVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(aVar.c) + "): catch #" + aVar.a);
    }

    public void m1227a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.e eVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(eVar.c) + "): local variables (count = " + eVar.a + ")");
        m1142a();
        eVar.a(cVar, interfaceC0162j, dVar, qVar, this);
        m1144b();
    }

    public void m1228a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.e eVar, a.b.a.a.a.d dVar2) {
        m1143a("v" + dVar2.c + ": " + dVar2.a + " -> " + (dVar2.a + dVar2.b));
    }

    public void m1229a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.f fVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(fVar.c) + "): offset " + fVar.a);
    }

    public void m1230a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.j jVar) {
        m1143a("Target (type = 0x" + Integer.toHexString(jVar.c) + "): offset " + jVar.a + ", type argument " + jVar.b);
    }

    public void m1231a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.l lVar) {
        m1143a(m1141a((a.b.o) dVar) + " Stack map attribute (count = " + lVar.c + "):");
        m1142a();
        lVar.a(cVar, interfaceC0162j, dVar, this);
        m1144b();
    }

    public void m1232a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.n nVar) {
        m1143a(m1141a((a.b.o) dVar) + " Stack map table attribute (count = " + nVar.c + "):");
        m1142a();
        nVar.a(cVar, interfaceC0162j, dVar, this);
        m1144b();
    }

    public void m1233a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.h hVar) {
        m1143a(m1141a((a.b.o) hVar) + " ExceptionInfo (" + hVar.a + " -> " + hVar.b + ": " + hVar.c + "):");
        if (hVar.d != 0) {
            cVar.a(hVar.d, this);
        }
    }

    public void m1234a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.m mVar) {
        m1143a("[" + mVar.b + "] -> line " + mVar.c + (mVar.a() == null ? "" : " [" + mVar.a() + "]"));
    }

    public void m1235a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.n nVar) {
        m1143a(m1141a((a.b.o) nVar) + " Line number table attribute (count = " + nVar.c + "):");
        m1142a();
        nVar.a(cVar, interfaceC0162j, dVar, this);
        m1144b();
    }

    public void m1236a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.o oVar) {
        m1143a("v" + oVar.e + ": " + oVar.a + " -> " + (oVar.a + oVar.b) + " [" + oVar.b(cVar) + " " + oVar.a(cVar) + "]");
    }

    public void m1237a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.p pVar) {
        m1143a(m1141a((a.b.o) pVar) + " Local variable table attribute (count = " + pVar.c + "):");
        m1142a();
        pVar.a(cVar, interfaceC0162j, dVar, this);
        m1144b();
    }

    public void m1238a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        m1143a("v" + qVar.e + ": " + qVar.a + " -> " + (qVar.a + qVar.b) + " [" + qVar.b(cVar) + " " + qVar.a(cVar) + "]");
    }

    public void m1239a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        m1143a(m1141a((a.b.o) rVar) + " Local variable type table attribute (count = " + rVar.c + "):");
        m1142a();
        rVar.a(cVar, interfaceC0162j, dVar, this);
        m1144b();
    }

    public void m1240a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.i iVar) {
        m1143a(m1141a((a.b.o) iVar) + " Exceptions attribute (count = " + iVar.c + "):");
        m1142a();
        iVar.a(cVar, this);
        m1144b();
    }

    public void m1241a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.s sVar) {
        m1143a(m1141a((a.b.o) sVar) + " Method parameters attribute (count = " + sVar.c + "):");
        m1142a();
        sVar.a(cVar, interfaceC0162j, this);
        m1144b();
    }

    public void m1242a(ClassE c0057e) {
        m1143a("_____________________________________________________________________");
        m1143a(m1141a((a.b.o) c0057e) + " Library class: " + c0057e.m415b());
        m1142a();
        m1143a("Superclass:    " + c0057e.m421c());
        m1143a("Access flags:  0x" + Integer.toHexString(c0057e.f158a));
        m1143a("  = " + ClassI.m771f(c0057e.f158a) + ((c0057e.f158a & 49664) == 0 ? "class " : "") + ClassI.m764c(c0057e.m415b()) + (c0057e.m421c() == null ? "" : " extends " + ClassI.m764c(c0057e.m421c())));
        m1144b();
        m1147c();
        m1143a("Interfaces (count = " + c0057e.f165h.length + "):");
        for (int i = 0; i < c0057e.f165h.length; i++) {
            a.b.c cVar = c0057e.f165h[i];
            if (cVar != null) {
                m1143a("  + " + cVar.b());
            }
        }
        m1143a("Fields (count = " + c0057e.f162e.length + "):");
        c0057e.m406a((aq) this);
        m1143a("Methods (count = " + c0057e.f163f.length + "):");
        c0057e.m417b((aq) this);
    }

    public void m1243a(ClassE c0057e, ClassF c0069f) {
        m1143a(m1141a(c0069f) + " Field:        " + c0069f.mo946a((a.b.c) c0057e) + " " + c0069f.mo949b(c0057e));
        m1142a();
        m1143a("Access flags: 0x" + Integer.toHexString(c0069f.f313b));
        m1143a("  = " + ClassI.m749a(c0069f.f313b, c0069f.mo946a((a.b.c) c0057e), c0069f.mo949b(c0057e)));
        m1144b();
    }

    public void m1244a(ClassE c0057e, ClassH c0160h) {
        m1143a(m1141a(c0160h) + " Method:       " + c0160h.mo946a((a.b.c) c0057e) + " " + c0160h.mo949b(c0057e));
        m1142a();
        m1143a("Access flags: 0x" + Integer.toHexString(c0160h.f313b));
        m1143a("  = " + ClassI.m751a(c0057e.m415b(), c0160h.f313b, c0160h.mo946a((a.b.c) c0057e), c0160h.mo949b(c0057e)));
        m1144b();
    }

    public void m1245a(k kVar) {
        m1143a("_____________________________________________________________________");
        m1143a(m1141a((a.b.o) kVar) + " Program class: " + kVar.b());
        m1142a();
        m1143a("Superclass:    " + kVar.c());
        m1143a("Major version: 0x" + Integer.toHexString(ClassI.m756b(kVar.a)));
        m1143a("Minor version: 0x" + Integer.toHexString(ClassI.m761c(kVar.a)));
        m1143a("  = target " + ClassI.m765d(kVar.a));
        m1143a("Access flags:  0x" + Integer.toHexString(kVar.d));
        m1143a("  = " + ClassI.m771f(kVar.d) + ((kVar.d & 49664) == 0 ? "class " : "") + ClassI.m764c(kVar.b()) + (kVar.f == 0 ? "" : " extends " + ClassI.m764c(kVar.c())));
        m1144b();
        m1147c();
        m1143a("Interfaces (count = " + kVar.g + "):");
        m1142a();
        kVar.c(this);
        m1144b();
        m1147c();
        m1143a("Constant Pool (count = " + kVar.b + "):");
        m1142a();
        kVar.a(this);
        m1144b();
        m1147c();
        m1143a("Fields (count = " + kVar.i + "):");
        m1142a();
        kVar.a(this);
        m1144b();
        m1147c();
        m1143a("Methods (count = " + kVar.k + "):");
        m1142a();
        kVar.b(this);
        m1144b();
        m1147c();
        m1143a("Class file attributes (count = " + kVar.m + "):");
        m1142a();
        kVar.a(this);
        m1144b();
        m1147c();
    }

    public void m1246a(k kVar, ClassL c0163l) {
        m1143a(m1141a(c0163l) + " Field:        " + c0163l.mo946a((a.b.c) kVar) + " " + c0163l.mo949b(kVar));
        m1142a();
        m1143a("Access flags: 0x" + Integer.toHexString(c0163l.f430b));
        m1143a("  = " + ClassI.m749a(c0163l.f430b, c0163l.mo946a((a.b.c) kVar), c0163l.mo949b(kVar)));
        m1145b(kVar, c0163l);
        m1144b();
    }

    public void m1247a(k kVar, ClassN c0165n) {
        m1143a(m1141a(c0165n) + " Method:       " + c0165n.mo946a((a.b.c) kVar) + c0165n.mo949b(kVar));
        m1142a();
        m1143a("Access flags: 0x" + Integer.toHexString(c0165n.f430b));
        m1143a("  = " + ClassI.m751a(kVar.b(), c0165n.f430b, c0165n.mo946a((a.b.c) kVar), c0165n.mo949b(kVar)));
        m1145b(kVar, c0165n);
        m1144b();
    }
}
