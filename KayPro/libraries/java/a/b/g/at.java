package a.b.g;

import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.j.ClassB;

public class at implements s {

    private s[] f351a;

    private int f352b;

    public at() {
        this.f351a = new s[16];
    }

    public at(s... sVarArr) {
        this.f351a = sVarArr;
        this.f352b = sVarArr.length;
    }

    public void m1011a(ClassE c0057e) {
        for (int i = 0; i < this.f352b; i++) {
            this.f351a[i].a(c0057e);
        }
    }

    public void m1012a(s sVar) {
        s[] sVarArr = this.f351a;
        int i = this.f352b;
        this.f352b = i + 1;
        this.f351a = (s[]) ClassB.m3138a(sVarArr, i, sVar);
    }

    public void m1013a(k kVar) {
        for (int i = 0; i < this.f352b; i++) {
            this.f351a[i].a(kVar);
        }
    }
}
