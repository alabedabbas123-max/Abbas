package org.dom4j.tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class FilterIterator implements Iterator {
    private boolean first = true;
    private Object next;
    protected Iterator proxy;

    public FilterIterator(Iterator it) {
        this.proxy = it;
    }

    protected Object findNext() {
        if (this.proxy == null) {
            return null;
        }
        while (this.proxy.hasNext()) {
            Object next = this.proxy.next();
            if (next != null && matches(next)) {
                return next;
            }
        }
        this.proxy = null;
        return null;
    }

    @Override
    public boolean hasNext() {
        if (this.first) {
            this.next = findNext();
            this.first = false;
        }
        return this.next != null;
    }

    protected abstract boolean matches(Object obj);

    @Override
    public Object next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.next;
        this.next = findNext();
        return obj;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
