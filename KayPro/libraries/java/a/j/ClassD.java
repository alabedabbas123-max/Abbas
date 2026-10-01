package a.j;

import java.util.Set;

public class ClassD extends Abstractt {

    private final Set f1328a;

    public ClassD(Set set) {
        this.f1328a = set;
    }

    @Override
    public boolean mo3151a(String str) {
        return this.f1328a.contains(str);
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        return this.f1328a.contains(str.substring(i, i2));
    }
}
