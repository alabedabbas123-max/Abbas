package com.sun.tools.javac.util;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class List<A> extends AbstractCollection<A> implements java.util.List<A> {
    private static Iterator<?> EMPTYITERATOR = new Iterator<Object>() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };
    private static List<?> EMPTY_LIST;
    public A head;
    public List<A> tail;

    List(A head, List<A> tail) {
        this.tail = tail;
        this.head = head;
    }

    public static <A> List<A> m507nil() {
        return (List<A>) EMPTY_LIST;
    }

    static {
        List list = null;
        EMPTY_LIST = new List<Object>(list, list) {
            @Override
            public List<Object> setTail(List<Object> tail) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean isEmpty() {
                return true;
            }
        };
    }

    public static <A> List<A> m508of(A x1) {
        return new List<>(x1, m507nil());
    }

    public static <A> List<A> m509of(A x1, A x2) {
        return new List<>(x1, m508of((Object) x2));
    }

    public static <A> List<A> m510of(A x1, A x2, A x3) {
        return new List<>(x1, m509of((Object) x2, (Object) x3));
    }

    public static <A> List<A> m511of(A x1, A x2, A x3, A... rest) {
        return new List<>(x1, new List(x2, new List(x3, from(rest))));
    }

    public static <A> List<A> from(A[] array) {
        List<A> xs = m507nil();
        if (array != null) {
            for (int i = array.length - 1; i >= 0; i--) {
                xs = new List<>(array[i], xs);
            }
        }
        return xs;
    }

    @Deprecated
    public static <A> List<A> fill(int len, A init) {
        List<A> l = m507nil();
        for (int i = 0; i < len; i++) {
            l = new List<>(init, l);
        }
        return l;
    }

    @Override
    public boolean isEmpty() {
        return this.tail == null;
    }

    public boolean nonEmpty() {
        return this.tail != null;
    }

    public int length() {
        List<A> l = this;
        int len = 0;
        while (l.tail != null) {
            l = l.tail;
            len++;
        }
        return len;
    }

    @Override
    public int size() {
        return length();
    }

    public List<A> setTail(List<A> tail) {
        this.tail = tail;
        return tail;
    }

    public List<A> prepend(A x) {
        return new List<>(x, this);
    }

    public List<A> prependList(List<A> xs) {
        if (isEmpty()) {
            return xs;
        }
        if (xs.isEmpty()) {
            return this;
        }
        if (xs.tail.isEmpty()) {
            return prepend(xs.head);
        }
        List<A> result = this;
        List<A> rev = xs.reverse();
        Assert.check(rev != xs);
        while (rev.nonEmpty()) {
            List<A> h = rev;
            rev = rev.tail;
            h.setTail(result);
            result = h;
        }
        return result;
    }

    public List<A> reverse() {
        if (isEmpty() || this.tail.isEmpty()) {
            return this;
        }
        List<A> rev = m507nil();
        for (List<A> l = this; l.nonEmpty(); l = l.tail) {
            rev = new List<>(l.head, rev);
        }
        return rev;
    }

    public List<A> append(A x) {
        return m508of((Object) x).prependList(this);
    }

    public List<A> appendList(List<A> x) {
        return x.prependList(this);
    }

    public List<A> appendList(ListBuffer<A> x) {
        return appendList(x.toList());
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        int i = 0;
        List<A> list = this;
        while (list.nonEmpty() && i < tArr.length) {
            tArr[i] = list.head;
            list = list.tail;
            i++;
        }
        if (list.isEmpty()) {
            if (i < tArr.length) {
                tArr[i] = 0;
            }
            return tArr;
        }
        return (T[]) toArray((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size()));
    }

    @Override
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public String toString(String sep) {
        if (isEmpty()) {
            return "";
        }
        StringBuffer buf = new StringBuffer();
        buf.append(this.head);
        for (List<A> l = this.tail; l.nonEmpty(); l = l.tail) {
            buf.append(sep);
            buf.append(l.head);
        }
        return buf.toString();
    }

    @Override
    public String toString() {
        return toString(",");
    }

    @Override
    public int hashCode() {
        int h = 1;
        for (List<A> l = this; l.tail != null; l = l.tail) {
            int i = h * 31;
            A a = l.head;
            h = i + (a == null ? 0 : a.hashCode());
        }
        return h;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof List) {
            return equals(this, (List) other);
        }
        if (!(other instanceof java.util.List)) {
            return false;
        }
        List<A> t = this;
        Iterator<?> oIter = ((java.util.List) other).iterator();
        while (t.tail != null && oIter.hasNext()) {
            Object o = oIter.next();
            A a = t.head;
            if (a == null) {
                if (o != null) {
                    return false;
                }
                t = t.tail;
            } else {
                if (!a.equals(o)) {
                    return false;
                }
                t = t.tail;
            }
        }
        return t.isEmpty() && !oIter.hasNext();
    }

    public static boolean equals(List<?> list, List<?> list2) {
        while (list.tail != null && list2.tail != null) {
            A a = list.head;
            if (a == null) {
                if (list2.head != null) {
                    return false;
                }
            } else if (!a.equals(list2.head)) {
                return false;
            }
            list = (List<A>) list.tail;
            list2 = (List<A>) list2.tail;
        }
        return list.tail == null && list2.tail == null;
    }

    @Override
    public boolean contains(Object x) {
        for (List<A> l = this; l.tail != null; l = l.tail) {
            if (x == null) {
                if (l.head == null) {
                    return true;
                }
            } else if (l.head.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public A last() {
        A last = null;
        for (List<A> t = this; t.tail != null; t = t.tail) {
            last = t.head;
        }
        return last;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> convert(Class<T> klass, List<?> list) {
        if (list == 0) {
            return null;
        }
        for (Object o : list) {
            klass.cast(o);
        }
        return list;
    }

    private static <A> Iterator<A> emptyIterator() {
        return (Iterator<A>) EMPTYITERATOR;
    }

    @Override
    public Iterator<A> iterator() {
        if (this.tail == null) {
            return emptyIterator();
        }
        return new Iterator<A>() {
            List<A> elems;

            {
                this.elems = List.this;
            }

            @Override
            public boolean hasNext() {
                return this.elems.tail != null;
            }

            @Override
            public A next() {
                if (this.elems.tail == null) {
                    throw new NoSuchElementException();
                }
                A result = this.elems.head;
                this.elems = this.elems.tail;
                return result;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public A get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        List<A> l = this;
        int i = index;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || l.isEmpty()) {
                break;
            }
            l = l.tail;
            i = i2;
        }
        if (l.isEmpty()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        return l.head;
    }

    @Override
    public boolean addAll(int index, Collection<? extends A> c) {
        if (c.isEmpty()) {
            return false;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public A set(int index, A element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, A element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public A remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        List<A> l = this;
        while (l.tail != null) {
            A a = l.head;
            if (a == null) {
                if (o != null) {
                    l = l.tail;
                    i++;
                } else {
                    return i;
                }
            } else if (!a.equals(o)) {
                l = l.tail;
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override
    public int lastIndexOf(Object o) {
        int last = -1;
        int i = 0;
        List<A> l = this;
        while (l.tail != null) {
            A a = l.head;
            if (a == null) {
                if (o == null) {
                    last = i;
                }
            } else if (a.equals(o)) {
                last = i;
            }
            l = l.tail;
            i++;
        }
        return last;
    }

    @Override
    public ListIterator<A> listIterator() {
        return Collections.unmodifiableList(new ArrayList(this)).listIterator();
    }

    @Override
    public ListIterator<A> listIterator(int index) {
        return Collections.unmodifiableList(new ArrayList(this)).listIterator(index);
    }

    @Override
    public java.util.List<A> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        ArrayList<A> a = new ArrayList<>(toIndex - fromIndex);
        List<A> l = this;
        for (int i = 0; l.tail != null && i != toIndex; i++) {
            if (i >= fromIndex) {
                a.add(l.head);
            }
            l = l.tail;
        }
        return Collections.unmodifiableList(a);
    }
}
