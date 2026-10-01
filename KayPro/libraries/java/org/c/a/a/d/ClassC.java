package org.c.a.a.d;

import java.util.ArrayList;
import java.util.Collection;

public class ClassC extends ArrayList {

    protected static ClassC f6421d = new ClassD();

    public ClassC() {
    }

    public ClassC(int i) {
        super(i);
    }

    public ClassC(Collection collection) {
        super(collection);
    }

    public ClassC(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        ensureCapacity(objArr.length);
        for (Object obj : objArr) {
            add(obj);
        }
    }

    public static final ClassC m8843f() {
        return f6421d;
    }

    public Object m8844d() {
        return get(size() - 1);
    }

    public Object m8845e() {
        return remove(size() - 1);
    }

    public Object m8846h() {
        return get(0);
    }

    public boolean m8847j_() {
        return true;
    }
}
