package org.objectweb.asm.tree.analysis;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class SmallSet extends AbstractSet implements Iterator {

    Object f6691e1;

    Object f6692e2;

    SmallSet(Object obj, Object obj2) {
        this.f6691e1 = obj;
        this.f6692e2 = obj2;
    }

    static final Set emptySet() {
        return new SmallSet(null, null);
    }

    @Override
    public boolean hasNext() {
        return this.f6691e1 != null;
    }

    @Override
    public Iterator iterator() {
        return new SmallSet(this.f6691e1, this.f6692e2);
    }

    @Override
    public Object next() {
        if (this.f6691e1 == null) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6691e1;
        this.f6691e1 = this.f6692e2;
        this.f6692e2 = null;
        return obj;
    }

    @Override
    public void remove() {
    }

    @Override
    public int size() {
        if (this.f6691e1 == null) {
            return 0;
        }
        return this.f6692e2 == null ? 1 : 2;
    }

    Set union(SmallSet smallSet) {
        if (smallSet.f6691e1 == this.f6691e1 && smallSet.f6692e2 == this.f6692e2) {
            return this;
        }
        if ((smallSet.f6691e1 == this.f6692e2 && smallSet.f6692e2 == this.f6691e1) || smallSet.f6691e1 == null) {
            return this;
        }
        if (this.f6691e1 == null) {
            return smallSet;
        }
        if (smallSet.f6692e2 == null) {
            if (this.f6692e2 == null) {
                return new SmallSet(this.f6691e1, smallSet.f6691e1);
            }
            if (smallSet.f6691e1 == this.f6691e1 || smallSet.f6691e1 == this.f6692e2) {
                return this;
            }
        }
        if (this.f6692e2 == null && (this.f6691e1 == smallSet.f6691e1 || this.f6691e1 == smallSet.f6692e2)) {
            return smallSet;
        }
        HashSet hashSet = new HashSet(4);
        hashSet.add(this.f6691e1);
        if (this.f6692e2 != null) {
            hashSet.add(this.f6692e2);
        }
        hashSet.add(smallSet.f6691e1);
        if (smallSet.f6692e2 != null) {
            hashSet.add(smallSet.f6692e2);
        }
        return hashSet;
    }
}
