package com.sun.tools.javac.util;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListBuffer<A> extends AbstractQueue<A> {
    public int count;
    public List<A> elems;
    public List<A> last;
    public boolean shared;

    public static <T> ListBuffer<T> m512lb() {
        return new ListBuffer<>();
    }

    public static <T> ListBuffer<T> m513of(T x) {
        ListBuffer<T> lb = new ListBuffer<>();
        lb.add(x);
        return lb;
    }

    public ListBuffer() {
        clear();
    }

    @Override
    public final void clear() {
        List<A> list = new List<>(null, null);
        this.elems = list;
        this.last = list;
        this.count = 0;
        this.shared = false;
    }

    public int length() {
        return this.count;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean nonEmpty() {
        return this.count != 0;
    }

    private void copy() {
        List<A> p = new List<>(this.elems.head, this.elems.tail);
        this.elems = p;
        while (true) {
            List<A> tail = p.tail;
            if (tail != null) {
                List<A> tail2 = new List<>(tail.head, tail.tail);
                p.setTail(tail2);
                p = tail2;
            } else {
                this.last = p;
                this.shared = false;
                return;
            }
        }
    }

    public ListBuffer<A> prepend(A x) {
        this.elems = this.elems.prepend(x);
        this.count++;
        return this;
    }

    public ListBuffer<A> append(A x) {
        x.getClass();
        if (this.shared) {
            copy();
        }
        this.last.head = x;
        this.last.setTail(new List<>(null, null));
        this.last = this.last.tail;
        this.count++;
        return this;
    }

    public ListBuffer<A> appendList(List<A> xs) {
        while (xs.nonEmpty()) {
            append(xs.head);
            xs = xs.tail;
        }
        return this;
    }

    public ListBuffer<A> appendList(ListBuffer<A> xs) {
        return appendList(xs.toList());
    }

    public ListBuffer<A> appendArray(A[] xs) {
        for (A a : xs) {
            append(a);
        }
        return this;
    }

    public List<A> toList() {
        this.shared = true;
        return this.elems;
    }

    @Override
    public boolean contains(Object x) {
        return this.elems.contains(x);
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.elems.toArray(tArr);
    }

    @Override
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public A first() {
        return this.elems.head;
    }

    public A next() {
        A x = this.elems.head;
        List<A> list = this.elems;
        if (list != this.last) {
            this.elems = list.tail;
            this.count--;
        }
        return x;
    }

    @Override
    public Iterator<A> iterator() {
        return new Iterator<A>() {
            List<A> elems;

            {
                this.elems = ListBuffer.this.elems;
            }

            @Override
            public boolean hasNext() {
                return this.elems != ListBuffer.this.last;
            }

            @Override
            public A next() {
                if (this.elems == ListBuffer.this.last) {
                    throw new NoSuchElementException();
                }
                A elem = this.elems.head;
                this.elems = this.elems.tail;
                return elem;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public boolean add(A a) {
        append(a);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object x : c) {
            if (!contains(x)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends A> c) {
        for (A a : c) {
            append(a);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offer(A a) {
        append(a);
        return true;
    }

    @Override
    public A poll() {
        return next();
    }

    @Override
    public A peek() {
        return first();
    }
}
