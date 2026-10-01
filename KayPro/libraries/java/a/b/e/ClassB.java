package a.b.e;

import a.b.a.a.a.a.a;
import a.b.a.a.a.a.b;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.b.h;
import a.b.a.a.b.i;
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
import a.b.b.e;
import a.b.b.k;
import a.b.b.n;
import a.b.b.p;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttDeprecated;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSynthetic;
import java.io.DataInput;
import a.b.Abstractg;
import a.b.ClassE;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.f.ClassI;

public class ClassB extends w implements a, b, f, g, h, i, a.b.a.b.a.a, a.b.a.b.a.b, c, d, a.b.a.c.a.a, a.b.a.c.a.b, a.b.a.d.i, j, l, m, o, q, r, u, a.b.b.a.f, aq, s {

    private final ClassJ f174a;

    public ClassB(DataInput dataInput) {
        this.f174a = new ClassJ(dataInput);
    }

    private a.b.b.b m463a() {
        int iM663i = this.f174a.m663i();
        switch (iM663i) {
            case 1:
                return new a.b.b.s();
            case 2:
            case 13:
            case 14:
            case 17:
            default:
                throw new RuntimeException("Unknown constant type [" + iM663i + "] in constant pool");
            case 3:
                return new a.b.b.f();
            case 4:
                return new e();
            case 5:
                return new a.b.b.i();
            case 6:
                return new a.b.b.c();
            case 7:
                return new a.b.b.a();
            case 8:
                return new a.b.b.r();
            case 9:
                return new a.b.b.d();
            case 10:
                return new a.b.b.l();
            case 11:
                return new a.b.b.g();
            case 12:
                return new n();
            case 15:
                return new a.b.b.j();
            case 16:
                return new k();
            case 18:
                return new a.b.b.h();
            case 19:
                return new a.b.b.m();
            case 20:
                return new a.b.b.o();
            case 21:
                return new p();
        }
    }

    private a.b.a.a m464b(a.b.c cVar) {
        a.b.a.c dVar;
        int iM664j = this.f174a.m664j();
        int iM660f = this.f174a.m660f();
        String strC = cVar.c(iM664j);
        if (strC.equals(AttBootstrapMethods.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.c();
        } else if (strC.equals(AttSourceFile.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.w();
        } else if (strC.equals("SourceDir")) {
            dVar = new v();
        } else if (strC.equals(AttInnerClasses.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.k();
        } else if (strC.equals(AttEnclosingMethod.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.g();
        } else if (strC.equals(AttDeprecated.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.f();
        } else if (strC.equals(AttSynthetic.ATTRIBUTE_NAME)) {
            dVar = new x();
        } else if (strC.equals(AttSignature.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.u();
        } else if (strC.equals(AttConstantValue.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.e();
        } else if (strC.equals("MethodParameters")) {
            dVar = new a.b.a.s();
        } else if (strC.equals(AttExceptions.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.i();
        } else if (strC.equals(AttCode.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.d();
        } else if (strC.equals("StackMap")) {
            dVar = new a.b.a.c.l();
        } else if (strC.equals("StackMapTable")) {
            dVar = new a.b.a.c.n();
        } else if (strC.equals(AttLineNumberTable.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.n();
        } else if (strC.equals(AttLocalVariableTable.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.p();
        } else if (strC.equals(AttLocalVariableTypeTable.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.r();
        } else if (strC.equals(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.a.n();
        } else if (strC.equals(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.a.k();
        } else if (strC.equals(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.a.o();
        } else if (strC.equals(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.a.l();
        } else if (strC.equals("RuntimeVisibleTypeAnnotations")) {
            dVar = new a.b.a.a.p();
        } else if (strC.equals("RuntimeInvisibleTypeAnnotations")) {
            dVar = new a.b.a.a.m();
        } else if (strC.equals(AttAnnotationDefault.ATTRIBUTE_NAME)) {
            dVar = new a.b.a.a.b();
        } else if (strC.equals("Module")) {
            dVar = new a.b.a.b.b();
        } else if (strC.equals("ModuleMainClass")) {
            dVar = new a.b.a.b.c();
        } else {
            dVar = strC.equals("ModulePackages") ? new a.b.a.b.d() : new y(iM664j, iM660f);
        }
        ((a.b.a.a) dVar).a = iM664j;
        return dVar;
    }

    private a.b.a.c.m m465b() {
        int iM663i = this.f174a.m663i();
        if (iM663i < 64) {
            return new a.b.a.c.k(iM663i);
        }
        if (iM663i >= 247 && iM663i >= 248) {
            if (iM663i < 251) {
                return new a.b.a.c.e(iM663i);
            }
            if (iM663i < 252) {
                return new a.b.a.c.k(iM663i);
            }
            return iM663i < 255 ? new a.b.a.c.g(iM663i) : new a.b.a.c.c();
        }
        return new a.b.a.c.j(iM663i);
    }

    private a.b.a.c.r m466c() {
        int iM663i = this.f174a.m663i();
        switch (iM663i) {
            case 0:
                return new a.b.a.c.o();
            case 1:
                return new a.b.a.c.d();
            case 2:
                return new a.b.a.c.b();
            case 3:
                return new a.b.a.c.a();
            case 4:
                return new a.b.a.c.f();
            case 5:
                return new a.b.a.c.h();
            case 6:
                return new a.b.a.c.p();
            case 7:
                return new a.b.a.c.i();
            case 8:
                return new a.b.a.c.q();
            default:
                throw new RuntimeException("Unknown verification type [" + iM663i + "] in stack map frame");
        }
    }

    private a.b.a.a.a.h m467d() {
        byte bM656b = this.f174a.m656b();
        switch (bM656b) {
            case 0:
            case 1:
                return new a.b.a.a.a.l(bM656b);
            case 16:
                return new a.b.a.a.a.g(bM656b);
            case 17:
            case 18:
                return new a.b.a.a.a.k(bM656b);
            case 19:
            case 20:
            case 21:
                return new a.b.a.a.a.b(bM656b);
            case 22:
                return new a.b.a.a.a.c(bM656b);
            case 23:
                return new a.b.a.a.a.i(bM656b);
            case 64:
            case 65:
                return new a.b.a.a.a.e(bM656b);
            case 66:
                return new a.b.a.a.a.a(bM656b);
            case 67:
            case 68:
            case 69:
            case 70:
                return new a.b.a.a.a.f(bM656b);
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                return new a.b.a.a.a.j(bM656b);
            default:
                throw new RuntimeException("Unknown annotation target type [" + ((int) bM656b) + "]");
        }
    }

    private a.b.a.a.h m468e() {
        int iM663i = this.f174a.m663i();
        switch (iM663i) {
            case 64:
                return new a.b.a.a.c();
            case 66:
            case 67:
            case 68:
            case 70:
            case 73:
            case 74:
            case 83:
            case 90:
            case 115:
                return new a.b.a.a.g((char) iM663i);
            case 91:
                return new a.b.a.a.e();
            case 99:
                return new a.b.a.a.f();
            case 101:
                return new a.b.a.a.i();
            default:
                throw new IllegalArgumentException("Unknown element value tag [" + iM663i + "]");
        }
    }

    public void m469a(a.b.c cVar, a.b.a.a.a aVar) {
        aVar.a = this.f174a.m664j();
        aVar.b = this.f174a.m664j();
        aVar.c = new a.b.a.a.h[aVar.b];
        for (int i = 0; i < aVar.b; i++) {
            int iM664j = this.f174a.m664j();
            a.b.a.a.h hVarM468e = m468e();
            hVarM468e.c = iM664j;
            hVarM468e.a(cVar, aVar, this);
            aVar.c[i] = hVarM468e;
        }
    }

    public void m470a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.c cVar2) {
        a.b.a.a.a aVar2 = new a.b.a.a.a();
        m469a(cVar, aVar2);
        cVar2.a = aVar2;
    }

    public void m471a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.e eVar) {
        eVar.a = this.f174a.m664j();
        eVar.b = new a.b.a.a.h[eVar.a];
        for (int i = 0; i < eVar.a; i++) {
            a.b.a.a.h hVarM468e = m468e();
            hVarM468e.a(cVar, aVar, this);
            eVar.b[i] = hVarM468e;
        }
    }

    public void m472a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.f fVar) {
        fVar.a = this.f174a.m664j();
    }

    public void m473a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.g gVar) {
        gVar.b = this.f174a.m664j();
    }

    public void m474a(a.b.c cVar, a.b.a.a.a aVar, a.b.a.a.i iVar) {
        iVar.a = this.f174a.m664j();
        iVar.b = this.f174a.m664j();
    }

    public void m475a(a.b.c cVar, a.b.a.a.d dVar) {
        dVar.c = this.f174a.m664j();
        dVar.d = new a.b.a.a.a[dVar.c];
        for (int i = 0; i < dVar.c; i++) {
            a.b.a.a.a aVar = new a.b.a.a.a();
            m469a(cVar, aVar);
            dVar.d[i] = aVar;
        }
    }

    public void m476a(a.b.c cVar, a.b.a.a.q qVar) {
        a.b.a.a.a.h hVarM467d = m467d();
        hVarM467d.a(cVar, qVar, this);
        qVar.f = hVarM467d;
        int iM663i = this.f174a.m663i();
        qVar.g = new a.b.a.a.s[iM663i];
        for (int i = 0; i < iM663i; i++) {
            a.b.a.a.s sVar = new a.b.a.a.s();
            m480a(cVar, qVar, sVar);
            qVar.g[i] = sVar;
        }
        m469a(cVar, (a.b.a.a.a) qVar);
    }

    public void m477a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.a.g gVar) {
        gVar.b = this.f174a.m664j();
    }

    public void m478a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.a.k kVar) {
        kVar.a = this.f174a.m663i();
        kVar.b = this.f174a.m663i();
    }

    public void m479a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.a.l lVar) {
        lVar.a = this.f174a.m663i();
    }

    public void m480a(a.b.c cVar, a.b.a.a.q qVar, a.b.a.a.s sVar) {
        sVar.a = this.f174a.m663i();
        sVar.b = this.f174a.m663i();
    }

    public void m481a(a.b.c cVar, a.b.a.a.r rVar) {
        rVar.c = this.f174a.m664j();
        rVar.d = new a.b.a.a.q[rVar.c];
        for (int i = 0; i < rVar.c; i++) {
            a.b.a.a.a qVar = new a.b.a.a.q();
            m476a(cVar, (a.b.a.a.q) qVar);
            rVar.d[i] = qVar;
        }
    }

    public void m482a(a.b.c cVar, a.b.a.b.a aVar) {
        aVar.a = this.f174a.m664j();
        aVar.b = this.f174a.m664j();
        aVar.c = this.f174a.m664j();
        aVar.d = new int[aVar.c];
        for (int i = 0; i < aVar.c; i++) {
            aVar.d[i] = this.f174a.m664j();
        }
    }

    public void m483a(a.b.c cVar, a.b.a.b.b bVar) {
        bVar.c = this.f174a.m664j();
        bVar.d = this.f174a.m664j();
        bVar.e = this.f174a.m664j();
        bVar.f = this.f174a.m664j();
        bVar.g = new a.b.a.b.g[bVar.f];
        for (int i = 0; i < bVar.f; i++) {
            a.b.a.b.g gVar = new a.b.a.b.g();
            m488a(cVar, gVar);
            bVar.g[i] = gVar;
        }
        bVar.h = this.f174a.m664j();
        bVar.i = new a.b.a.b.a[bVar.h];
        for (int i2 = 0; i2 < bVar.h; i2++) {
            a.b.a.b.a aVar = new a.b.a.b.a();
            m482a(cVar, aVar);
            bVar.i[i2] = aVar;
        }
        bVar.j = this.f174a.m664j();
        bVar.k = new a.b.a.b.e[bVar.j];
        for (int i3 = 0; i3 < bVar.j; i3++) {
            a.b.a.b.e eVar = new a.b.a.b.e();
            m486a(cVar, eVar);
            bVar.k[i3] = eVar;
        }
        bVar.l = this.f174a.m664j();
        bVar.m = new int[bVar.l];
        for (int i4 = 0; i4 < bVar.l; i4++) {
            bVar.m[i4] = this.f174a.m664j();
        }
        bVar.n = this.f174a.m664j();
        bVar.o = new a.b.a.b.f[bVar.n];
        for (int i5 = 0; i5 < bVar.n; i5++) {
            a.b.a.b.f fVar = new a.b.a.b.f();
            m487a(cVar, fVar);
            bVar.o[i5] = fVar;
        }
    }

    public void m484a(a.b.c cVar, a.b.a.b.c cVar2) {
        cVar2.c = this.f174a.m664j();
    }

    public void m485a(a.b.c cVar, a.b.a.b.d dVar) {
        dVar.c = this.f174a.m664j();
        dVar.d = new int[dVar.c];
        for (int i = 0; i < dVar.c; i++) {
            dVar.d[i] = this.f174a.m664j();
        }
    }

    public void m486a(a.b.c cVar, a.b.a.b.e eVar) {
        eVar.a = this.f174a.m664j();
        eVar.b = this.f174a.m664j();
        eVar.c = this.f174a.m664j();
        eVar.d = new int[eVar.c];
        for (int i = 0; i < eVar.c; i++) {
            eVar.d[i] = this.f174a.m664j();
        }
    }

    public void m487a(a.b.c cVar, a.b.a.b.f fVar) {
        fVar.a = this.f174a.m664j();
        fVar.b = this.f174a.m664j();
        fVar.c = new int[fVar.b];
        for (int i = 0; i < fVar.b; i++) {
            fVar.c[i] = this.f174a.m664j();
        }
    }

    public void m488a(a.b.c cVar, a.b.a.b.g gVar) {
        gVar.a = this.f174a.m664j();
        gVar.b = this.f174a.m664j();
        gVar.c = this.f174a.m664j();
    }

    public void m489a(a.b.c cVar, a.b.a.b bVar) {
        bVar.a = this.f174a.m664j();
        bVar.b = this.f174a.m664j();
        bVar.c = new int[bVar.b];
        for (int i = 0; i < bVar.b; i++) {
            bVar.c[i] = this.f174a.m664j();
        }
    }

    public void m490a(a.b.c cVar, a.b.a.c cVar2) {
        cVar2.c = this.f174a.m664j();
        cVar2.d = new a.b.a.b[cVar2.c];
        for (int i = 0; i < cVar2.c; i++) {
            a.b.a.b bVar = new a.b.a.b();
            m489a(cVar, bVar);
            cVar2.d[i] = bVar;
        }
    }

    public void m491a(a.b.c cVar, a.b.a.f fVar) {
    }

    public void m492a(a.b.c cVar, a.b.a.g gVar) {
        gVar.c = this.f174a.m664j();
        gVar.d = this.f174a.m664j();
    }

    public void m493a(a.b.c cVar, a.b.a.k kVar) {
        kVar.c = this.f174a.m664j();
        kVar.d = new a.b.a.l[kVar.c];
        for (int i = 0; i < kVar.c; i++) {
            a.b.a.l lVar = new a.b.a.l();
            m494a(cVar, lVar);
            kVar.d[i] = lVar;
        }
    }

    public void m494a(a.b.c cVar, a.b.a.l lVar) {
        lVar.a = this.f174a.m664j();
        lVar.b = this.f174a.m664j();
        lVar.c = this.f174a.m664j();
        lVar.d = this.f174a.m664j();
    }

    public void m495a(a.b.c cVar, a.b.a.u uVar) {
        uVar.c = this.f174a.m664j();
    }

    public void m496a(a.b.c cVar, v vVar) {
        vVar.c = this.f174a.m664j();
    }

    public void m497a(a.b.c cVar, a.b.a.w wVar) {
        wVar.c = this.f174a.m664j();
    }

    public void m498a(a.b.c cVar, x xVar) {
    }

    public void m499a(a.b.c cVar, y yVar) {
        byte[] bArr = new byte[yVar.c];
        this.f174a.m654a(bArr);
        yVar.d = bArr;
    }

    public void m500a(a.b.c cVar, a.b.b.a aVar) {
        aVar.a = this.f174a.m664j();
    }

    public void m501a(a.b.c cVar, a.b.b.c cVar2) {
        cVar2.a = this.f174a.m658d();
    }

    public void m502a(a.b.c cVar, e eVar) {
        eVar.a = this.f174a.m659e();
    }

    public void m503a(a.b.c cVar, a.b.b.f fVar) {
        fVar.a = this.f174a.m660f();
    }

    public void m504a(a.b.c cVar, a.b.b.h hVar) {
        hVar.a = this.f174a.m664j();
        hVar.b = this.f174a.m664j();
    }

    public void m505a(a.b.c cVar, a.b.b.i iVar) {
        iVar.a = this.f174a.m661g();
    }

    public void m506a(a.b.c cVar, a.b.b.j jVar) {
        jVar.a = this.f174a.m663i();
        jVar.b = this.f174a.m664j();
    }

    public void m507a(a.b.c cVar, k kVar) {
        kVar.a = this.f174a.m664j();
    }

    public void m508a(a.b.c cVar, a.b.b.m mVar) {
        mVar.a = this.f174a.m664j();
    }

    public void m509a(a.b.c cVar, n nVar) {
        nVar.a = this.f174a.m664j();
        nVar.b = this.f174a.m664j();
    }

    public void m510a(a.b.c cVar, a.b.b.o oVar) {
        oVar.a = this.f174a.m664j();
    }

    public void m511a(a.b.c cVar, p pVar) {
        int i = 0;
        char cM657c = this.f174a.m657c();
        int iM660f = this.f174a.m660f();
        switch (cM657c) {
            case 'B':
                byte[] bArr = new byte[iM660f];
                this.f174a.m654a(bArr);
                pVar.a = bArr;
                break;
            case 'C':
                char[] cArr = new char[iM660f];
                while (i < iM660f) {
                    cArr[i] = this.f174a.m657c();
                    i++;
                }
                pVar.a = cArr;
                break;
            case 'D':
                double[] dArr = new double[iM660f];
                while (i < iM660f) {
                    dArr[i] = this.f174a.m658d();
                    i++;
                }
                pVar.a = dArr;
                break;
            case 'F':
                float[] fArr = new float[iM660f];
                while (i < iM660f) {
                    fArr[i] = this.f174a.m659e();
                    i++;
                }
                pVar.a = fArr;
                break;
            case 'I':
                int[] iArr = new int[iM660f];
                while (i < iM660f) {
                    iArr[i] = this.f174a.m660f();
                    i++;
                }
                pVar.a = iArr;
                break;
            case 'J':
                long[] jArr = new long[iM660f];
                while (i < iM660f) {
                    jArr[i] = this.f174a.m661g();
                    i++;
                }
                pVar.a = jArr;
                break;
            case 'S':
                short[] sArr = new short[iM660f];
                while (i < iM660f) {
                    sArr[i] = this.f174a.m662h();
                    i++;
                }
                pVar.a = sArr;
                break;
            case 'Z':
                boolean[] zArr = new boolean[iM660f];
                while (i < iM660f) {
                    zArr[i] = this.f174a.m655a();
                    i++;
                }
                pVar.a = zArr;
                break;
        }
    }

    public void m512a(a.b.c cVar, a.b.b.r rVar) {
        rVar.a = this.f174a.m664j();
    }

    public void m513a(a.b.c cVar, a.b.b.s sVar) {
        byte[] bArr = new byte[this.f174a.m664j()];
        this.f174a.m654a(bArr);
        sVar.a(bArr);
    }

    public void m514a(a.b.c cVar, Interfaced interfaceC0041d, a.b.a.e eVar) {
        eVar.c = this.f174a.m664j();
    }

    public void m515a(a.b.c cVar, Interfacei interfaceC0161i, a.b.a.a.q qVar, a.b.a.a.a.b bVar) {
    }

    public void m516a(a.b.c cVar, Interfacej interfaceC0162j, int i, t tVar) {
        tVar.a = this.f174a.m664j();
        tVar.b = this.f174a.m664j();
    }

    public void m517a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.b bVar) {
        a.b.a.a.h hVarM468e = m468e();
        hVarM468e.a(cVar, (a.b.a.a.a) null, this);
        bVar.c = hVarM468e;
    }

    public void m518a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.j jVar) {
        int i;
        jVar.c = this.f174a.m663i();
        if (interfaceC0162j.mo946a(cVar).equals("<init>")) {
            int iM797t = ClassI.m797t(interfaceC0162j.mo949b(cVar));
            i = iM797t - jVar.c;
            jVar.c = iM797t;
        } else {
            i = 0;
        }
        jVar.d = new int[jVar.c];
        jVar.e = new a.b.a.a.a[jVar.c][];
        while (i < jVar.c) {
            int iM664j = this.f174a.m664j();
            a.b.a.a.a[] aVarArr = new a.b.a.a.a[iM664j];
            for (int i2 = 0; i2 < iM664j; i2++) {
                a.b.a.a.a aVar = new a.b.a.a.a();
                m469a(cVar, aVar);
                aVarArr[i2] = aVar;
            }
            jVar.d[i] = iM664j;
            jVar.e[i] = aVarArr;
            i++;
        }
    }

    public void m519a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.q qVar, a.b.a.a.a.c cVar2) {
        cVar2.a = this.f174a.m663i();
    }

    public void m520a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.a.q qVar, a.b.a.a.a.i iVar) {
        iVar.a = this.f174a.m664j();
    }

    public void m521a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.c = this.f174a.m664j();
        dVar.d = this.f174a.m664j();
        dVar.e = this.f174a.m660f();
        byte[] bArr = new byte[dVar.e];
        this.f174a.m654a(bArr);
        dVar.f = bArr;
        dVar.g = this.f174a.m664j();
        dVar.h = new a.b.a.h[dVar.g];
        for (int i = 0; i < dVar.g; i++) {
            a.b.a.h hVar = new a.b.a.h();
            m537a(cVar, interfaceC0162j, dVar, hVar);
            dVar.h[i] = hVar;
        }
        dVar.i = this.f174a.m664j();
        dVar.j = new a.b.a.a[dVar.i];
        for (int i2 = 0; i2 < dVar.i; i2++) {
            a.b.a.a aVarM464b = m464b(cVar);
            aVarM464b.a(cVar, interfaceC0162j, dVar, this);
            dVar.j[i2] = aVarM464b;
        }
    }

    public void m522a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.c cVar2) {
        cVar2.e = this.f174a.m664j();
        cVar2.a = this.f174a.m664j();
        cVar2.b = new a.b.a.c.r[cVar2.a];
        for (int i2 = 0; i2 < cVar2.a; i2++) {
            a.b.a.c.r rVarM466c = m466c();
            rVarM466c.b(cVar, interfaceC0162j, dVar, i, i2, this);
            cVar2.b[i2] = rVarM466c;
        }
        cVar2.c = this.f174a.m664j();
        cVar2.d = new a.b.a.c.r[cVar2.c];
        for (int i3 = 0; i3 < cVar2.c; i3++) {
            a.b.a.c.r rVarM466c2 = m466c();
            rVarM466c2.a(cVar, interfaceC0162j, dVar, i, i3, this);
            cVar2.d[i3] = rVarM466c2;
        }
    }

    public void m523a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.e eVar) {
        eVar.e = this.f174a.m664j();
    }

    public void m524a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.g gVar) {
        gVar.e = this.f174a.m664j();
        gVar.b = new a.b.a.c.r[gVar.a];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= gVar.a) {
                return;
            }
            a.b.a.c.r rVarM466c = m466c();
            rVarM466c.a(cVar, interfaceC0162j, dVar, i, this);
            gVar.b[i3] = rVarM466c;
            i2 = i3 + 1;
        }
    }

    public void m525a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.i iVar) {
        iVar.a = this.f174a.m664j();
    }

    public void m526a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.j jVar) {
        if (jVar.a() == 247) {
            jVar.e = this.f174a.m664j();
        }
        a.b.a.c.r rVarM466c = m466c();
        rVarM466c.a(cVar, interfaceC0162j, dVar, i, this);
        jVar.a = rVarM466c;
    }

    public void m527a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.k kVar) {
        if (kVar.a() == 251) {
            kVar.e = this.f174a.m664j();
        }
    }

    public void m528a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.q qVar) {
        qVar.a = this.f174a.m664j();
    }

    public void m529a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.r rVar) {
    }

    public void m530a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.a aVar) {
        aVar.a = this.f174a.m664j();
    }

    public void m531a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.e eVar) {
        eVar.a = this.f174a.m664j();
        eVar.b = new a.b.a.a.a.d[eVar.a];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= eVar.a) {
                return;
            }
            a.b.a.a.a.d dVar2 = new a.b.a.a.a.d();
            m532a(cVar, interfaceC0162j, dVar, qVar, eVar, dVar2);
            eVar.b[i2] = dVar2;
            i = i2 + 1;
        }
    }

    public void m532a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.e eVar, a.b.a.a.a.d dVar2) {
        dVar2.a = this.f174a.m662h();
        dVar2.b = this.f174a.m662h();
        dVar2.c = this.f174a.m662h();
    }

    public void m533a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.f fVar) {
        fVar.a = this.f174a.m664j();
    }

    public void m534a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, a.b.a.a.a.j jVar) {
        jVar.a = this.f174a.m664j();
        jVar.b = this.f174a.m663i();
    }

    public void m535a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.l lVar) {
        lVar.c = this.f174a.m664j();
        lVar.d = new a.b.a.c.c[lVar.c];
        for (int i = 0; i < lVar.c; i++) {
            a.b.a.c.c cVar2 = new a.b.a.c.c();
            m522a(cVar, interfaceC0162j, dVar, i, cVar2);
            lVar.d[i] = cVar2;
        }
    }

    public void m536a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.n nVar) {
        nVar.c = this.f174a.m664j();
        nVar.d = new a.b.a.c.m[nVar.c];
        for (int i = 0; i < nVar.c; i++) {
            a.b.a.c.m mVarM465b = m465b();
            mVarM465b.a(cVar, interfaceC0162j, dVar, 0, this);
            nVar.d[i] = mVarM465b;
        }
    }

    public void m537a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.h hVar) {
        hVar.a = this.f174a.m664j();
        hVar.b = this.f174a.m664j();
        hVar.c = this.f174a.m664j();
        hVar.d = this.f174a.m664j();
    }

    public void m538a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.m mVar) {
        mVar.b = this.f174a.m664j();
        mVar.c = this.f174a.m664j();
    }

    public void m539a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.n nVar) {
        nVar.c = this.f174a.m664j();
        nVar.d = new a.b.a.m[nVar.c];
        for (int i = 0; i < nVar.c; i++) {
            a.b.a.m mVar = new a.b.a.m();
            m538a(cVar, interfaceC0162j, dVar, mVar);
            nVar.d[i] = mVar;
        }
    }

    public void m540a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.o oVar) {
        oVar.a = this.f174a.m664j();
        oVar.b = this.f174a.m664j();
        oVar.c = this.f174a.m664j();
        oVar.d = this.f174a.m664j();
        oVar.e = this.f174a.m664j();
    }

    public void m541a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.p pVar) {
        pVar.c = this.f174a.m664j();
        pVar.d = new a.b.a.o[pVar.c];
        for (int i = 0; i < pVar.c; i++) {
            a.b.a.o oVar = new a.b.a.o();
            m540a(cVar, interfaceC0162j, dVar, oVar);
            pVar.d[i] = oVar;
        }
    }

    public void m542a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        qVar.a = this.f174a.m664j();
        qVar.b = this.f174a.m664j();
        qVar.c = this.f174a.m664j();
        qVar.d = this.f174a.m664j();
        qVar.e = this.f174a.m664j();
    }

    public void m543a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.c = this.f174a.m664j();
        rVar.d = new a.b.a.q[rVar.c];
        for (int i = 0; i < rVar.c; i++) {
            a.b.a.q qVar = new a.b.a.q();
            m542a(cVar, interfaceC0162j, dVar, qVar);
            rVar.d[i] = qVar;
        }
    }

    public void m544a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.i iVar) {
        iVar.c = this.f174a.m664j();
        iVar.d = new int[iVar.c];
        for (int i = 0; i < iVar.c; i++) {
            iVar.d[i] = this.f174a.m664j();
        }
    }

    public void m545a(a.b.c cVar, Interfacej interfaceC0162j, a.b.a.s sVar) {
        sVar.c = this.f174a.m663i();
        sVar.d = new t[sVar.c];
        for (int i = 0; i < sVar.c; i++) {
            t tVar = new t();
            m516a(cVar, interfaceC0162j, i, tVar);
            sVar.d[i] = tVar;
        }
    }

    public void m546a(ClassE c0057e) {
    }

    public void m547a(ClassE c0057e, Abstractg abstractC0095g) {
    }

    public void m548a(a.b.k kVar) {
        ClassI.m754a(this.f174a.m660f());
        kVar.a = ClassI.m745a(this.f174a.m664j(), this.f174a.m664j());
        ClassI.m770e(kVar.a);
        kVar.b = this.f174a.m664j();
        kVar.c = new a.b.b.b[kVar.b];
        int i = 1;
        while (i < kVar.b) {
            a.b.b.b bVarM463a = m463a();
            bVarM463a.a(kVar, this);
            kVar.c[i] = bVarM463a;
            int iA = bVarM463a.a();
            if (iA == 5 || iA == 6) {
                i++;
                kVar.c[i] = null;
            }
            i++;
        }
        kVar.d = this.f174a.m664j();
        kVar.e = this.f174a.m664j();
        kVar.f = this.f174a.m664j();
        kVar.g = this.f174a.m664j();
        kVar.h = new int[kVar.g];
        for (int i2 = 0; i2 < kVar.g; i2++) {
            kVar.h[i2] = this.f174a.m664j();
        }
        kVar.i = this.f174a.m664j();
        kVar.j = new ClassL[kVar.i];
        for (int i3 = 0; i3 < kVar.i; i3++) {
            ClassL c0163l = new ClassL();
            m549a(kVar, c0163l);
            kVar.j[i3] = c0163l;
        }
        kVar.k = this.f174a.m664j();
        kVar.l = new ClassN[kVar.k];
        for (int i4 = 0; i4 < kVar.k; i4++) {
            ClassN c0165n = new ClassN();
            m550a(kVar, c0165n);
            kVar.l[i4] = c0165n;
        }
        kVar.m = this.f174a.m664j();
        kVar.n = new a.b.a.a[kVar.m];
        for (int i5 = 0; i5 < kVar.m; i5++) {
            a.b.a.a aVarM464b = m464b(kVar);
            aVarM464b.a(kVar, this);
            kVar.n[i5] = aVarM464b;
        }
    }

    public void m549a(a.b.k kVar, ClassL c0163l) {
        c0163l.f430b = this.f174a.m664j();
        c0163l.f431c = this.f174a.m664j();
        c0163l.f432d = this.f174a.m664j();
        c0163l.f433e = this.f174a.m664j();
        c0163l.f434f = new a.b.a.a[c0163l.f433e];
        for (int i = 0; i < c0163l.f433e; i++) {
            a.b.a.a aVarM464b = m464b(kVar);
            aVarM464b.a(kVar, c0163l, this);
            c0163l.f434f[i] = aVarM464b;
        }
    }

    public void m550a(a.b.k kVar, ClassN c0165n) {
        c0165n.f430b = this.f174a.m664j();
        c0165n.f431c = this.f174a.m664j();
        c0165n.f432d = this.f174a.m664j();
        c0165n.f433e = this.f174a.m664j();
        c0165n.f434f = new a.b.a.a[c0165n.f433e];
        for (int i = 0; i < c0165n.f433e; i++) {
            a.b.a.a aVarM464b = m464b(kVar);
            aVarM464b.a(kVar, c0165n, this);
            c0165n.f434f[i] = aVarM464b;
        }
    }

    public void m551b(a.b.c cVar, a.b.b.q qVar) {
        qVar.a = this.f174a.m664j();
        qVar.b = this.f174a.m664j();
    }
}
