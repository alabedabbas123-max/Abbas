package org.a.a.a.a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.a.a.a.c.ClassD;

public class ClassC implements Set {

    protected boolean f5188a;

    public Abstractd f5189b;

    public final ArrayList f5190c;

    public int f5191d;

    protected BitSet f5192e;

    public boolean f5193f;

    public boolean f5194g;

    public final boolean f5195h;

    private int f5196i;

    public ClassC() {
        this(true);
    }

    public ClassC(boolean z) {
        this.f5188a = false;
        this.f5190c = new ArrayList(7);
        this.f5196i = -1;
        this.f5189b = new ClassF();
        this.f5195h = z;
    }

    public List m7308a() {
        return this.f5190c;
    }

    public void m7309a(boolean z) {
        this.f5188a = z;
        this.f5189b = null;
    }

    @Override
    public boolean add(ClassB c1712b) {
        return m7311a(c1712b, null);
    }

    public boolean m7311a(ClassB c1712b, ClassD c1767d) {
        if (this.f5188a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c1712b.f5169e != Abstractbd.f5175a) {
            this.f5193f = true;
        }
        if (c1712b.m7303a() > 0) {
            this.f5194g = true;
        }
        ClassB c1712b2 = (ClassB) this.f5189b.m7369c(c1712b);
        if (c1712b2 == c1712b) {
            this.f5196i = -1;
            this.f5190c.add(c1712b);
        } else {
            Abstractax abstractC1709axM7291a = Abstractax.m7291a(c1712b2.f5167c, c1712b.f5167c, !this.f5195h, c1767d);
            c1712b2.f5168d = Math.max(c1712b2.f5168d, c1712b.f5168d);
            if (c1712b.m7306b()) {
                c1712b2.m7305a(true);
            }
            c1712b2.f5167c = abstractC1709axM7291a;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add((ClassB) it.next());
        }
        return false;
    }

    public boolean m7312b() {
        return this.f5188a;
    }

    @Override
    public ClassB[] toArray() {
        return (ClassB[]) this.f5189b.toArray();
    }

    @Override
    public void clear() {
        if (this.f5188a) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f5190c.clear();
        this.f5196i = -1;
        this.f5189b.clear();
    }

    @Override
    public boolean contains(Object obj) {
        if (this.f5189b == null) {
            throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
        }
        return this.f5189b.contains(obj);
    }

    @Override
    public boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassC)) {
            return false;
        }
        ClassC c1727c = (ClassC) obj;
        return this.f5190c != null && this.f5190c.equals(c1727c.f5190c) && this.f5195h == c1727c.f5195h && this.f5191d == c1727c.f5191d && this.f5192e == c1727c.f5192e && this.f5193f == c1727c.f5193f && this.f5194g == c1727c.f5194g;
    }

    @Override
    public int hashCode() {
        if (!m7312b()) {
            return this.f5190c.hashCode();
        }
        if (this.f5196i == -1) {
            this.f5196i = this.f5190c.hashCode();
        }
        return this.f5196i;
    }

    @Override
    public boolean isEmpty() {
        return this.f5190c.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.f5190c.iterator();
    }

    @Override
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.f5190c.size();
    }

    @Override
    public Object[] toArray(Object[] objArr) {
        return this.f5189b.toArray(objArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m7308a().toString());
        if (this.f5193f) {
            sb.append(",hasSemanticContext=").append(this.f5193f);
        }
        if (this.f5191d != 0) {
            sb.append(",uniqueAlt=").append(this.f5191d);
        }
        if (this.f5192e != null) {
            sb.append(",conflictingAlts=").append(this.f5192e);
        }
        if (this.f5194g) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }
}
