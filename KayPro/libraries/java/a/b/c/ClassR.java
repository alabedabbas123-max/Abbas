package a.b.c;

import a.b.k;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacej;

public class ClassR {

    private k f84a;

    public ClassR(k kVar) {
        this.f84a = kVar;
    }

    private int m184c(Interfaced interfaceC0041d) {
        int i = this.f84a.i;
        ClassL[] c0163lArr = this.f84a.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (c0163lArr[i2].equals(interfaceC0041d)) {
                return i2;
            }
        }
        return i;
    }

    private int m185c(Interfacej interfaceC0162j) {
        int i = this.f84a.k;
        ClassN[] c0165nArr = this.f84a.l;
        for (int i2 = 0; i2 < i; i2++) {
            if (c0165nArr[i2].equals(interfaceC0162j)) {
                return i2;
            }
        }
        return i;
    }

    public void m186a(int i) {
        int i2 = this.f84a.g;
        int[] iArr = this.f84a.h;
        if (iArr.length <= i2) {
            this.f84a.h = new int[i2 + 1];
            System.arraycopy(iArr, 0, this.f84a.h, 0, i2);
            iArr = this.f84a.h;
        }
        k kVar = this.f84a;
        int i3 = kVar.g;
        kVar.g = i3 + 1;
        iArr[i3] = i;
    }

    public void m187a(Interfaced interfaceC0041d) {
        int i = this.f84a.i;
        Object[] objArr = this.f84a.j;
        int length = objArr.length;
        Object[] objArr2 = objArr;
        if (length <= i) {
            this.f84a.j = new ClassL[i + 1];
            System.arraycopy(objArr, 0, this.f84a.j, 0, i);
            objArr2 = this.f84a.j;
        }
        k kVar = this.f84a;
        int i2 = kVar.i;
        kVar.i = i2 + 1;
        objArr2[i2] = interfaceC0041d;
    }

    public void m188a(Interfacej interfaceC0162j) {
        int i = this.f84a.k;
        Object[] objArr = this.f84a.l;
        int length = objArr.length;
        Object[] objArr2 = objArr;
        if (length <= i) {
            this.f84a.l = new ClassN[i + 1];
            System.arraycopy(objArr, 0, this.f84a.l, 0, i);
            objArr2 = this.f84a.l;
        }
        k kVar = this.f84a;
        int i2 = kVar.k;
        kVar.k = i2 + 1;
        objArr2[i2] = interfaceC0162j;
    }

    public void m189b(Interfaced interfaceC0041d) {
        int i = this.f84a.i;
        ClassL[] c0163lArr = this.f84a.j;
        int iM184c = m184c(interfaceC0041d);
        System.arraycopy(c0163lArr, iM184c + 1, c0163lArr, iM184c, (i - iM184c) - 1);
        k kVar = this.f84a;
        int i2 = kVar.i - 1;
        kVar.i = i2;
        c0163lArr[i2] = null;
    }

    public void m190b(Interfacej interfaceC0162j) {
        int i = this.f84a.k;
        ClassN[] c0165nArr = this.f84a.l;
        int iM185c = m185c(interfaceC0162j);
        System.arraycopy(c0165nArr, iM185c + 1, c0165nArr, iM185c, (i - iM185c) - 1);
        k kVar = this.f84a;
        int i2 = kVar.k - 1;
        kVar.k = i2;
        c0165nArr[i2] = null;
    }
}
