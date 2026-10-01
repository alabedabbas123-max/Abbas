package a;

import java.util.ArrayList;
import java.util.List;

public class ClassD {

    private final List f467a = new ArrayList();

    public ClassE m1292a(int i) {
        return (ClassE) this.f467a.get(i);
    }

    public boolean m1293a() {
        for (int i = 0; i < this.f467a.size(); i++) {
            if (((ClassE) this.f467a.get(i)).m1693c()) {
                return true;
            }
        }
        return false;
    }

    public boolean m1294a(ClassE c0243e) {
        return this.f467a.add(c0243e);
    }

    public int m1295b() {
        return this.f467a.size();
    }
}
