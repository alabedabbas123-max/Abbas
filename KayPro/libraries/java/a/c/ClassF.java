package a.c;

import a.b.b.b;
import a.b.d.a.d;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.a.ClassE;
import a.g.c.ClassA;
import a.g.c.ClassK;

public class ClassF extends ClassE implements d {
    public ClassF(b[] bVarArr, Abstractc[][][] abstractC0048cArr, ClassA c0409a, ClassV c0036v, d dVar) {
        super(m1291a(bVarArr, abstractC0048cArr, c0409a, c0036v, dVar));
    }

    private static d[] m1291a(b[] bVarArr, Abstractc[][][] abstractC0048cArr, ClassA c0409a, ClassV c0036v, d dVar) {
        ClassK[] c0428kArr = new ClassK[abstractC0048cArr.length];
        for (int i = 0; i < c0428kArr.length; i++) {
            Abstractc[][] abstractC0048cArr2 = abstractC0048cArr[i];
            c0428kArr[i] = new ClassE(bVarArr, abstractC0048cArr2[0], bVarArr, abstractC0048cArr2[1], c0409a, c0036v, dVar);
        }
        return c0428kArr;
    }
}
