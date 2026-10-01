package sun.misc;

import java.util.Enumeration;
import java.util.NoSuchElementException;

class Cache3 implements Enumeration {
    Cache2 entry;
    int index;
    boolean keys;
    Cache2[] table;

    Cache3(Cache2[] table, boolean keys) {
        this.table = table;
        this.keys = keys;
        this.index = table.length;
    }

    @Override
    public boolean hasMoreElements() {
        Cache2 cache2;
        while (this.index >= 0) {
            while (true) {
                Cache2 cache3 = this.entry;
                if (cache3 != null) {
                    if (cache3.check() != null) {
                        return true;
                    }
                    this.entry = this.entry.next;
                }
            }
            do {
                int i = this.index - 1;
                this.index = i;
                if (i < 0) {
                    break;
                }
                cache2 = this.table[i];
                this.entry = cache2;
            } while (cache2 == null);
        }
        return false;
    }

    @Override
    public Object nextElement() {
        Cache2 cache2;
        while (this.index >= 0) {
            if (this.entry == null) {
                do {
                    int i = this.index - 1;
                    this.index = i;
                    if (i < 0) {
                        break;
                    }
                    cache2 = this.table[i];
                    this.entry = cache2;
                } while (cache2 == null);
            }
            if (this.entry != null) {
                Cache2 e = this.entry;
                this.entry = e.next;
                if (e.check() != null) {
                    return this.keys ? e.f585key : e.check();
                }
            }
        }
        throw new NoSuchElementException("CacheEnumerator");
    }
}
