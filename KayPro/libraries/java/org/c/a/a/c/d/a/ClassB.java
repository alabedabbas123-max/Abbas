package org.c.a.a.c.d.a;

import java.util.Iterator;
import org.c.a.a.d.ClassC;

public class ClassB implements Iterable, Iterator {

    protected ClassC[] f6370a = new ClassC[21];

    protected int f6371b;

    final ClassA f6372c;

    protected ClassB(ClassA c2226a) {
        this.f6372c = c2226a;
    }

    @Override
    public ClassC next() {
        ClassC[] c2247cArr = this.f6370a;
        int i = this.f6371b;
        this.f6371b = i + 1;
        ClassC c2247c = c2247cArr[i];
        int length = this.f6370a.length;
        while (this.f6371b < length && this.f6370a[this.f6371b] == null) {
            this.f6371b++;
        }
        return c2247c;
    }

    public ClassC m8814a(int i) {
        m8815b(i);
        ClassC c2247c = this.f6370a[i];
        if (c2247c != null) {
            return c2247c;
        }
        ClassC[] c2247cArr = this.f6370a;
        ClassC c2247c2 = new ClassC(this.f6372c.f6362a.size());
        c2247cArr[i] = c2247c2;
        return c2247c2;
    }

    protected void m8815b(int i) {
        if (this.f6370a.length <= i) {
            ClassC[] c2247cArr = new ClassC[i + 10];
            System.arraycopy(this.f6370a, 0, c2247cArr, 0, this.f6370a.length);
            this.f6370a = c2247cArr;
        }
    }

    @Override
    public boolean hasNext() {
        return this.f6371b < this.f6370a.length;
    }

    @Override
    public Iterator iterator() {
        int length = this.f6370a.length;
        this.f6371b = 0;
        while (this.f6371b < length && this.f6370a[this.f6371b] == null) {
            this.f6371b++;
        }
        return this;
    }

    @Override
    public void remove() {
    }
}
