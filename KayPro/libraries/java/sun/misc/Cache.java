package sun.misc;

import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.util.Position;
import java.util.Dictionary;
import java.util.Enumeration;

public class Cache extends Dictionary {
    private int count;
    private float loadFactor;
    private Cache2[] table;
    private int threshold;

    private void init(int initialCapacity, float loadFactor) {
        if (initialCapacity <= 0 || loadFactor <= 0.0d) {
            throw new IllegalArgumentException();
        }
        this.loadFactor = loadFactor;
        this.table = new Cache2[initialCapacity];
        this.threshold = (int) (initialCapacity * loadFactor);
    }

    public Cache(int initialCapacity, float loadFactor) {
        init(initialCapacity, loadFactor);
    }

    public Cache(int initialCapacity) {
        init(initialCapacity, 0.75f);
    }

    public Cache() {
        try {
            init(ByteCodes.lsub, 0.75f);
        } catch (IllegalArgumentException e) {
            throw new Error("panic");
        }
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public synchronized Enumeration keys() {
        return new Cache3(this.table, true);
    }

    @Override
    public synchronized Enumeration elements() {
        return new Cache3(this.table, false);
    }

    @Override
    public synchronized Object get(Object key) {
        Cache2[] tab = this.table;
        int hash = key.hashCode();
        int index = (Integer.MAX_VALUE & hash) % tab.length;
        for (Cache2 e = tab[index]; e != null; e = e.next) {
            if (e.hash == hash && e.f585key.equals(key)) {
                return e.check();
            }
        }
        return null;
    }

    protected void rehash() {
        int oldCapacity = this.table.length;
        Cache2[] oldTable = this.table;
        int newCapacity = (oldCapacity * 2) + 1;
        Cache2[] newTable = new Cache2[newCapacity];
        this.threshold = (int) (newCapacity * this.loadFactor);
        this.table = newTable;
        int i = oldCapacity;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                Cache2 old = oldTable[i2];
                while (old != null) {
                    Cache2 e = old;
                    old = old.next;
                    if (e.check() != null) {
                        int index = (e.hash & Position.MAXPOS) % newCapacity;
                        e.next = newTable[index];
                        newTable[index] = e;
                    } else {
                        this.count--;
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override
    public synchronized Object put(Object key, Object value) {
        try {
            if (value == null) {
                throw new NullPointerException();
            }
            Cache2[] tab = this.table;
            int hash = key.hashCode();
            int index = (Integer.MAX_VALUE & hash) % tab.length;
            Cache2 ne = null;
            for (Cache2 e = tab[index]; e != null; e = e.next) {
                if (e.hash == hash && e.f585key.equals(key)) {
                    Object old = e.check();
                    e.setThing(value);
                    return old;
                }
                Object old2 = e.check();
                if (old2 == null) {
                    ne = e;
                }
            }
            if (this.count >= this.threshold) {
                rehash();
                return put(key, value);
            }
            if (ne == null) {
                ne = new Cache2();
                ne.next = tab[index];
                tab[index] = ne;
                this.count++;
            }
            ne.hash = hash;
            ne.f585key = key;
            ne.setThing(value);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public synchronized Object remove(Object key) {
        Cache2[] tab = this.table;
        int hash = key.hashCode();
        int index = (Integer.MAX_VALUE & hash) % tab.length;
        Cache2 prev = null;
        for (Cache2 e = tab[index]; e != null; e = e.next) {
            if (e.hash != hash || !e.f585key.equals(key)) {
                prev = e;
            } else {
                if (prev != null) {
                    prev.next = e.next;
                } else {
                    tab[index] = e.next;
                }
                this.count--;
                return e.check();
            }
        }
        return null;
    }
}
