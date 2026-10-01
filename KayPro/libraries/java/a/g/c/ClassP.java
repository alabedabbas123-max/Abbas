package a.g.c;

import a.b.b.b;
import a.b.d.a.d;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.a.ClassE;

public class ClassP extends ClassE implements d {

    private static final Abstractc[] f1066a = new Abstractc[0];

    public ClassP(b[] bVarArr, Abstractc[][][] abstractC0048cArr, ClassA c0409a, ClassV c0036v) {
        this(bVarArr, abstractC0048cArr, c0409a, c0036v, null);
    }

    public ClassP(b[] bVarArr, Abstractc[][][] abstractC0048cArr, ClassA c0409a, ClassV c0036v, d dVar) {
        super(m2764a(bVarArr, abstractC0048cArr, c0409a, c0036v, dVar));
    }

    private static d[] m2764a(b[] bVarArr, Abstractc[][][] abstractC0048cArr, ClassA c0409a, ClassV c0036v, d dVar) {
        d[] dVarArr = new d[abstractC0048cArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dVarArr.length) {
                return dVarArr;
            }
            Abstractc[][] abstractC0048cArr2 = abstractC0048cArr[i2];
            dVarArr[i2] = new ClassK(bVarArr, abstractC0048cArr2[0], bVarArr, abstractC0048cArr2.length > 1 ? abstractC0048cArr2[1] : f1066a, c0409a, c0036v, dVar);
            i = i2 + 1;
        }
    }
}
