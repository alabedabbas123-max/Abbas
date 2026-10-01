package org.a.a.a.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ClassC implements Iterator {

    final Object[] f5271a;

    int f5272b = 0;

    boolean f5273c = true;

    final ClassB f5274d;

    public ClassC(ClassB c1765b, Object[] objArr) {
        this.f5274d = c1765b;
        this.f5271a = objArr;
    }

    @Override
    public boolean hasNext() {
        return this.f5272b < this.f5271a.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5273c = false;
        Object[] objArr = this.f5271a;
        int i = this.f5272b;
        this.f5272b = i + 1;
        return objArr[i];
    }

    @Override
    public void remove() {
        if (this.f5273c) {
            throw new IllegalStateException();
        }
        this.f5274d.remove(this.f5271a[this.f5272b - 1]);
        this.f5273c = true;
    }
}
