package a.b;

import a.b.c;
import a.b.g.aq;
import a.b.g.s;

public class ClassH extends Abstractg implements Interfacej {

    public c[] f427a;

    @Override
    public void mo676a(ClassE c0057e, aq aqVar) {
        aqVar.a(c0057e, this);
    }

    @Override
    public void mo677a(s sVar) {
        if (this.f427a != null) {
            for (int i = 0; i < this.f427a.length; i++) {
                if (this.f427a[i] != null) {
                    this.f427a[i].a(sVar);
                }
            }
        }
    }
}
