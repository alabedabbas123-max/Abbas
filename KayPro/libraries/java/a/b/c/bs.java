package a.b.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.o;
import a.b.a.p;
import a.b.a.q;
import a.b.a.r;
import a.b.c;
import a.b.f.w;
import a.b.k;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import java.util.Arrays;
import a.b.Abstractm;
import a.b.Interfacej;

public class bs extends w implements i {

    private boolean f32a;

    private boolean f33b;

    private int m67a(o[] oVarArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            o oVar = oVarArr[i4];
            if (oVar.e >= 0 && oVar.e < i2 && (oVar.a == 0 || oVar.b > 0)) {
                oVarArr[i3] = oVarArr[i4];
                i3++;
            }
        }
        Arrays.fill(oVarArr, i3, i, (Object) null);
        return i3;
    }

    private int m68a(q[] qVarArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            q qVar = qVarArr[i4];
            if (qVar.e >= 0 && qVar.e < i2 && (qVar.a == 0 || qVar.b > 0)) {
                qVarArr[i3] = qVarArr[i4];
                i3++;
            }
        }
        Arrays.fill(qVarArr, i3, i, (Object) null);
        return i3;
    }

    private int[] m69a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = Integer.MAX_VALUE;
        }
        return iArr;
    }

    private void m70b(o[] oVarArr, int i, int i2) {
        Arrays.sort(oVarArr, 0, i);
        int[] iArrM69a = m69a(i2);
        for (int i3 = i - 1; i3 >= 0; i3--) {
            o oVar = oVarArr[i3];
            int i4 = iArrM69a[oVar.e] - oVar.a;
            if (oVar.b > i4) {
                oVar.b = i4;
            }
            iArrM69a[oVar.e] = oVar.a;
        }
    }

    private void m71b(q[] qVarArr, int i, int i2) {
        Arrays.sort(qVarArr, 0, i);
        int[] iArrM69a = m69a(i2);
        for (int i3 = i - 1; i3 >= 0; i3--) {
            q qVar = qVarArr[i3];
            int i4 = iArrM69a[qVar.e] - qVar.a;
            if (qVar.b > i4) {
                qVar.b = i4;
            }
            iArrM69a[qVar.e] = qVar.a;
        }
    }

    public void m72a(c cVar, a aVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m73a(c cVar, Interfacej interfaceC0162j, d dVar) {
        this.f32a = false;
        this.f33b = false;
        dVar.b(cVar, interfaceC0162j, this);
        if (this.f32a) {
            new ClassJ((k) cVar, (Abstractm) interfaceC0162j, dVar, true).m150b(AttLocalVariableTable.ATTRIBUTE_NAME);
        }
        if (this.f33b) {
            new ClassJ((k) cVar, (Abstractm) interfaceC0162j, dVar, true).m150b(AttLocalVariableTypeTable.ATTRIBUTE_NAME);
        }
    }

    public void m74a(c cVar, Interfacej interfaceC0162j, d dVar, p pVar) {
        pVar.c = m67a(pVar.d, pVar.c, dVar.d);
        m70b(pVar.d, pVar.c, dVar.d);
        if (pVar.c == 0) {
            this.f32a = true;
        }
    }

    public void m75a(c cVar, Interfacej interfaceC0162j, d dVar, r rVar) {
        rVar.c = m68a(rVar.d, rVar.c, dVar.d);
        m71b(rVar.d, rVar.c, dVar.d);
        if (rVar.c == 0) {
            this.f33b = true;
        }
    }
}
