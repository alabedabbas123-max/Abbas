package sun.misc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class SoftCache extends AbstractMap implements Map {
    private Set entrySet;
    private Map hash;
    private ReferenceQueue queue;

    private static class ValueCell extends SoftReference {
        private static Object INVALID_KEY = new Object();
        private static int dropped = 0;

        private Object f605key;

        static int access$210() {
            int i = dropped;
            dropped = i - 1;
            return i;
        }

        private ValueCell(Object key, Object value, ReferenceQueue queue) {
            super(value, queue);
            this.f605key = key;
        }

        public static ValueCell create(Object key, Object value, ReferenceQueue queue) {
            if (value == null) {
                return null;
            }
            return new ValueCell(key, value, queue);
        }

        public static Object strip(Object val, boolean drop) {
            if (val == null) {
                return null;
            }
            ValueCell vc = (ValueCell) val;
            Object o = vc.get();
            if (drop) {
                vc.drop();
            }
            return o;
        }

        public boolean isValid() {
            return this.f605key != INVALID_KEY;
        }

        private void drop() {
            super.clear();
            this.f605key = INVALID_KEY;
            dropped++;
        }
    }

    public void processQueue() {
        while (true) {
            ValueCell vc = (ValueCell) this.queue.poll();
            if (vc != null) {
                if (vc.isValid()) {
                    this.hash.remove(vc.f605key);
                } else {
                    ValueCell.access$210();
                }
            } else {
                return;
            }
        }
    }

    public SoftCache(int initialCapacity, float loadFactor) {
        this.queue = new ReferenceQueue();
        this.entrySet = null;
        this.hash = new HashMap(initialCapacity, loadFactor);
    }

    public SoftCache(int initialCapacity) {
        this.queue = new ReferenceQueue();
        this.entrySet = null;
        this.hash = new HashMap(initialCapacity);
    }

    public SoftCache() {
        this.queue = new ReferenceQueue();
        this.entrySet = null;
        this.hash = new HashMap();
    }

    @Override
    public int size() {
        return entrySet().size();
    }

    @Override
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return ValueCell.strip(this.hash.get(key), false) != null;
    }

    protected Object fill(Object key) {
        return null;
    }

    @Override
    public Object get(Object key) {
        processQueue();
        Object v = this.hash.get(key);
        if (v != null || (v = fill(key)) == null) {
            return ValueCell.strip(v, false);
        }
        this.hash.put(key, ValueCell.create(key, v, this.queue));
        return v;
    }

    @Override
    public Object put(Object key, Object value) {
        processQueue();
        ValueCell vc = ValueCell.create(key, value, this.queue);
        return ValueCell.strip(this.hash.put(key, vc), true);
    }

    @Override
    public Object remove(Object key) {
        processQueue();
        return ValueCell.strip(this.hash.remove(key), true);
    }

    @Override
    public void clear() {
        processQueue();
        this.hash.clear();
    }

    public static boolean valEquals(Object o1, Object o2) {
        if (o1 == null) {
            return o2 == null;
        }
        return o1.equals(o2);
    }

    private class Entry implements Map.Entry {

        private Map.Entry f604ent;
        private Object value;

        Entry(Map.Entry ent, Object value) {
            this.f604ent = ent;
            this.value = value;
        }

        @Override
        public Object getKey() {
            return this.f604ent.getKey();
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        @Override
        public Object setValue(Object value) {
            Map.Entry entry = this.f604ent;
            return entry.setValue(ValueCell.create(entry.getKey(), value, SoftCache.this.queue));
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry e = (Map.Entry) o;
            return SoftCache.valEquals(this.f604ent.getKey(), e.getKey()) && SoftCache.valEquals(this.value, e.getValue());
        }

        @Override
        public int hashCode() {
            Object k = getKey();
            int iHashCode = k == null ? 0 : k.hashCode();
            Object obj = this.value;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }
    }

    private class EntrySet extends AbstractSet {
        Set hashEntries;

        private EntrySet() {
            this.hashEntries = SoftCache.this.hash.entrySet();
        }

        @Override
        public Iterator iterator() {
            return new Iterator() {
                Iterator hashIterator;
                Entry next = null;

                {
                    this.hashIterator = EntrySet.this.hashEntries.iterator();
                }

                @Override
                public boolean hasNext() {
                    while (this.hashIterator.hasNext()) {
                        Map.Entry ent = (Map.Entry) this.hashIterator.next();
                        ValueCell vc = (ValueCell) ent.getValue();
                        Object v = null;
                        if (vc != null) {
                            Object obj = vc.get();
                            v = obj;
                            if (obj == null) {
                            }
                        }
                        this.next = SoftCache.this.new Entry(ent, v);
                        return true;
                    }
                    return false;
                }

                @Override
                public Object next() {
                    if (this.next == null && !hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Entry e = this.next;
                    this.next = null;
                    return e;
                }

                @Override
                public void remove() {
                    this.hashIterator.remove();
                }
            };
        }

        @Override
        public boolean isEmpty() {
            return !iterator().hasNext();
        }

        @Override
        public int size() {
            int j = 0;
            Iterator i = iterator();
            while (i.hasNext()) {
                j++;
                i.next();
            }
            return j;
        }

        @Override
        public boolean remove(Object o) {
            SoftCache.this.processQueue();
            if (o instanceof Entry) {
                return this.hashEntries.remove(((Entry) o).f604ent);
            }
            return false;
        }
    }

    @Override
    public Set entrySet() {
        if (this.entrySet == null) {
            this.entrySet = new EntrySet();
        }
        return this.entrySet;
    }
}
