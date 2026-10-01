package org.a.a.a.c;

public final class ClassL extends Abstracta {

    public static final ClassL f5292a = new ClassL();

    @Override
    public int mo7320a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override
    public boolean mo7322a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
