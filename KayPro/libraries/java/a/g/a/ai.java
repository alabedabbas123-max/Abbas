package a.g.a;

import a.b.a.d;
import a.b.c;
import a.d.ClassA;

class ai extends ClassA {

    private boolean f775c;

    ai() {
    }

    @Override
    public void mo1296a() {
        super.mo1296a();
        this.f775c = false;
    }

    @Override
    public void mo1297a(c cVar, d dVar, int i, int i2) {
        super.mo1297a(cVar, dVar, i, i2);
        this.f775c = true;
    }

    @Override
    public void mo1298a(c cVar, d dVar, int i, int i2, int i3) {
        if (i3 == 1) {
            super.mo1297a(cVar, dVar, i, i2);
            this.f775c = true;
        } else if (i3 != 0) {
            this.f469b = true;
        } else {
            if (this.f775c) {
                return;
            }
            super.mo1298a(cVar, dVar, i, i2, i3);
        }
    }
}
