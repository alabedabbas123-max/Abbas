package a.b.g;

import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;

public class av implements aq {

    private aq[] f355a;

    private int f356b;

    public av() {
        this.f355a = new aq[16];
    }

    public av(aq... aqVarArr) {
        this.f355a = aqVarArr;
        this.f356b = aqVarArr.length;
    }

    public void m1015a(ClassE c0057e, ClassF c0069f) {
        for (int i = 0; i < this.f356b; i++) {
            this.f355a[i].a(c0057e, c0069f);
        }
    }

    public void m1016a(ClassE c0057e, ClassH c0160h) {
        for (int i = 0; i < this.f356b; i++) {
            this.f355a[i].a(c0057e, c0160h);
        }
    }

    public void m1017a(k kVar, ClassL c0163l) {
        for (int i = 0; i < this.f356b; i++) {
            this.f355a[i].a(kVar, c0163l);
        }
    }

    public void m1018a(k kVar, ClassN c0165n) {
        for (int i = 0; i < this.f356b; i++) {
            this.f355a[i].a(kVar, c0165n);
        }
    }
}
