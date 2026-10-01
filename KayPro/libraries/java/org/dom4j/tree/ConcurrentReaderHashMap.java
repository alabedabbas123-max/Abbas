package org.dom4j.tree;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

class ConcurrentReaderHashMap extends AbstractMap implements Map, Cloneable, Serializable {
    public static int DEFAULT_INITIAL_CAPACITY = 32;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final int MINIMUM_CAPACITY = 4;
    protected final BarrierLock barrierLock;
    protected transient int count;
    protected transient Set entrySet;
    protected transient Set keySet;
    protected transient Object lastWrite;
    protected float loadFactor;
    protected transient Entry[] table;
    protected int threshold;
    protected transient Collection values;

    static class C22551 {
    }

    protected static class BarrierLock implements Serializable {
        protected BarrierLock() {
        }
    }

    protected static class Entry implements Map.Entry {
        protected final int hash;

        protected final Object f6425key;
        protected final Entry next;
        protected volatile Object value;

        Entry(int i, Object obj, Object obj2, Entry entry) {
            this.hash = i;
            this.f6425key = obj;
            this.next = entry;
            this.value = obj2;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f6425key.equals(entry.getKey()) && this.value.equals(entry.getValue());
        }

        @Override
        public Object getKey() {
            return this.f6425key;
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.f6425key.hashCode() ^ this.value.hashCode();
        }

        @Override
        public Object setValue(Object obj) {
            if (obj == null) {
                throw new NullPointerException();
            }
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public String toString() {
            return new StringBuffer().append(this.f6425key).append("=").append(this.value).toString();
        }
    }

    private class EntrySet extends AbstractSet {
        private final ConcurrentReaderHashMap this$0;

        private EntrySet(ConcurrentReaderHashMap concurrentReaderHashMap) {
            this.this$0 = concurrentReaderHashMap;
        }

        EntrySet(ConcurrentReaderHashMap concurrentReaderHashMap, C22551 c22551) {
            this(concurrentReaderHashMap);
        }

        @Override
        public void clear() {
            this.this$0.clear();
        }

        @Override
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.this$0.get(entry.getKey());
            return obj2 != null && obj2.equals(entry.getValue());
        }

        @Override
        public Iterator iterator() {
            return new HashIterator(this.this$0);
        }

        @Override
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                return this.this$0.findAndRemoveEntry((Map.Entry) obj);
            }
            return false;
        }

        @Override
        public int size() {
            return this.this$0.size();
        }
    }

    protected class HashIterator implements Iterator, Enumeration {
        protected Object currentKey;
        protected Object currentValue;
        protected int index;

        protected final Entry[] f6426tab;
        private final ConcurrentReaderHashMap this$0;
        protected Entry entry = null;
        protected Entry lastReturned = null;

        protected HashIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
            this.this$0 = concurrentReaderHashMap;
            this.f6426tab = concurrentReaderHashMap.getTableForReading();
            this.index = this.f6426tab.length - 1;
        }

        @Override
        public boolean hasMoreElements() {
            return hasNext();
        }

        @Override
        public boolean hasNext() {
            do {
                if (this.entry != null) {
                    Object obj = this.entry.value;
                    if (obj != null) {
                        this.currentKey = this.entry.f6425key;
                        this.currentValue = obj;
                        return true;
                    }
                    this.entry = this.entry.next;
                }
                while (this.entry == null && this.index >= 0) {
                    Entry[] entryArr = this.f6426tab;
                    int i = this.index;
                    this.index = i - 1;
                    this.entry = entryArr[i];
                }
            } while (this.entry != null);
            this.currentValue = null;
            this.currentKey = null;
            return false;
        }

        @Override
        public Object next() {
            if (this.currentKey == null && !hasNext()) {
                throw new NoSuchElementException();
            }
            Object objReturnValueOfNext = returnValueOfNext();
            this.lastReturned = this.entry;
            this.currentValue = null;
            this.currentKey = null;
            this.entry = this.entry.next;
            return objReturnValueOfNext;
        }

        @Override
        public Object nextElement() {
            return next();
        }

        @Override
        public void remove() {
            if (this.lastReturned == null) {
                throw new IllegalStateException();
            }
            this.this$0.remove(this.lastReturned.f6425key);
            this.lastReturned = null;
        }

        protected Object returnValueOfNext() {
            return this.entry;
        }
    }

    protected class KeyIterator extends HashIterator {
        private final ConcurrentReaderHashMap this$0;

        protected KeyIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
            super(concurrentReaderHashMap);
            this.this$0 = concurrentReaderHashMap;
        }

        @Override
        protected Object returnValueOfNext() {
            return this.currentKey;
        }
    }

    private class KeySet extends AbstractSet {
        private final ConcurrentReaderHashMap this$0;

        private KeySet(ConcurrentReaderHashMap concurrentReaderHashMap) {
            this.this$0 = concurrentReaderHashMap;
        }

        KeySet(ConcurrentReaderHashMap concurrentReaderHashMap, C22551 c22551) {
            this(concurrentReaderHashMap);
        }

        @Override
        public void clear() {
            this.this$0.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return this.this$0.containsKey(obj);
        }

        @Override
        public Iterator iterator() {
            return new KeyIterator(this.this$0);
        }

        @Override
        public boolean remove(Object obj) {
            return this.this$0.remove(obj) != null;
        }

        @Override
        public int size() {
            return this.this$0.size();
        }
    }

    protected class ValueIterator extends HashIterator {
        private final ConcurrentReaderHashMap this$0;

        protected ValueIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
            super(concurrentReaderHashMap);
            this.this$0 = concurrentReaderHashMap;
        }

        @Override
        protected Object returnValueOfNext() {
            return this.currentValue;
        }
    }

    private class Values extends AbstractCollection {
        private final ConcurrentReaderHashMap this$0;

        private Values(ConcurrentReaderHashMap concurrentReaderHashMap) {
            this.this$0 = concurrentReaderHashMap;
        }

        Values(ConcurrentReaderHashMap concurrentReaderHashMap, C22551 c22551) {
            this(concurrentReaderHashMap);
        }

        @Override
        public void clear() {
            this.this$0.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return this.this$0.containsValue(obj);
        }

        @Override
        public Iterator iterator() {
            return new ValueIterator(this.this$0);
        }

        @Override
        public int size() {
            return this.this$0.size();
        }
    }

    public ConcurrentReaderHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, 0.75f);
    }

    public ConcurrentReaderHashMap(int i) {
        this(i, 0.75f);
    }

    public ConcurrentReaderHashMap(int i, float f) {
        this.barrierLock = new BarrierLock();
        this.keySet = null;
        this.entrySet = null;
        this.values = null;
        if (f <= 0.0f) {
            throw new IllegalArgumentException(new StringBuffer().append("Illegal Load factor: ").append(f).toString());
        }
        this.loadFactor = f;
        int iP2capacity = capacity(i);
        this.table = new Entry[iP2capacity];
        this.threshold = (int) (iP2capacity * f);
    }

    public ConcurrentReaderHashMap(Map map) {
        this(Math.max(((int) (map.size() / 0.75f)) + 1, 16), 0.75f);
        putAll(map);
    }

    private static int hash(Object obj) {
        int iHashCode = obj.hashCode();
        return (iHashCode >>> 17) + ((iHashCode << 7) - iHashCode) + (iHashCode >>> 9);
    }

    private int capacity(int i) {
        int i2 = 1073741824;
        if (i <= 1073741824 && i >= 0) {
            i2 = 4;
            while (i2 < i) {
                i2 <<= 1;
            }
        }
        return i2;
    }

    private synchronized void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.table = new Entry[objectInputStream.readInt()];
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.table.length);
        objectOutputStream.writeInt(this.count);
        for (int length = this.table.length - 1; length >= 0; length--) {
            for (Entry entry = this.table[length]; entry != null; entry = entry.next) {
                objectOutputStream.writeObject(entry.f6425key);
                objectOutputStream.writeObject(entry.value);
            }
        }
    }

    public synchronized int capacity() {
        return this.table.length;
    }

    @Override
    public synchronized void clear() {
        Entry[] entryArr = this.table;
        for (int i = 0; i < entryArr.length; i++) {
            for (Entry entry = entryArr[i]; entry != null; entry = entry.next) {
                entry.value = null;
            }
            entryArr[i] = null;
        }
        this.count = 0;
        recordModification(entryArr);
    }

    @Override
    public synchronized Object clone() {
        ConcurrentReaderHashMap concurrentReaderHashMap;
        try {
            concurrentReaderHashMap = (ConcurrentReaderHashMap) super.clone();
            concurrentReaderHashMap.keySet = null;
            concurrentReaderHashMap.entrySet = null;
            concurrentReaderHashMap.values = null;
            Entry[] entryArr = this.table;
            concurrentReaderHashMap.table = new Entry[entryArr.length];
            Entry[] entryArr2 = concurrentReaderHashMap.table;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < entryArr.length) {
                    Entry entry = entryArr[i2];
                    Entry entry2 = null;
                    while (entry != null) {
                        Entry entry3 = new Entry(entry.hash, entry.f6425key, entry.value, entry2);
                        entry = entry.next;
                        entry2 = entry3;
                    }
                    entryArr2[i2] = entry2;
                    i = i2 + 1;
                }
            }
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
        return concurrentReaderHashMap;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public boolean containsValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        for (Entry entry : getTableForReading()) {
            for (; entry != null; entry = entry.next) {
                if (obj.equals(entry.value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Enumeration elements() {
        return new ValueIterator(this);
    }

    @Override
    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet(this, null);
        this.entrySet = entrySet;
        return entrySet;
    }

    protected boolean m8880eq(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected synchronized boolean findAndRemoveEntry(Map.Entry entry) {
        boolean z;
        Object key = entry.getKey();
        Object obj = get(key);
        if (obj == null || !obj.equals(entry.getValue())) {
            z = false;
        } else {
            remove(key);
            z = true;
        }
        return z;
    }

    @Override
    public Object get(Object obj) {
        int iHash = hash(obj);
        Entry[] entryArr = this.table;
        int length = iHash & (entryArr.length - 1);
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        Entry entry3 = entry;
        while (true) {
            if (entry2 == null) {
                Entry[] tableForReading = getTableForReading();
                if (entryArr == tableForReading && entry3 == entryArr[length]) {
                    return null;
                }
                length = iHash & (tableForReading.length - 1);
                Entry entry4 = tableForReading[length];
                entry2 = entry4;
                entry3 = entry4;
                entryArr = tableForReading;
            } else if (entry2.hash == iHash && m8880eq(obj, entry2.f6425key)) {
                Object obj2 = entry2.value;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (this) {
                    entryArr = this.table;
                }
                length = iHash & (entryArr.length - 1);
                Entry entry5 = entryArr[length];
                entry2 = entry5;
                entry3 = entry5;
            } else {
                entry2 = entry2.next;
            }
        }
    }

    protected final Entry[] getTableForReading() {
        Entry[] entryArr;
        synchronized (this.barrierLock) {
            entryArr = this.table;
        }
        return entryArr;
    }

    @Override
    public synchronized boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public Set keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet(this, null);
        this.keySet = keySet;
        return keySet;
    }

    public Enumeration keys() {
        return new KeyIterator(this);
    }

    public float loadFactor() {
        return this.loadFactor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:12:0x0025, B:15:0x002b, B:17:0x002f, B:19:0x0040, B:21:0x0044, B:24:0x004a, B:28:0x0051, B:31:0x0059, B:32:0x005b, B:34:0x005d, B:35:0x0061), top: B:37:0x0025 }] */
    @Override
    public Object put(Object obj, Object obj2) {
        Object objSput;
        if (obj2 == null) {
            throw new NullPointerException();
        }
        int iHash = hash(obj);
        Entry[] entryArr = this.table;
        int length = iHash & (entryArr.length - 1);
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null && (entry2.hash != iHash || !m8880eq(obj, entry2.f6425key))) {
            entry2 = entry2.next;
        }
        synchronized (this) {
            if (entryArr != this.table) {
                objSput = sput(obj, obj2, iHash);
            } else if (entry2 != null) {
                objSput = entry2.value;
                if (entry != entryArr[length] || objSput == null) {
                    objSput = sput(obj, obj2, iHash);
                } else {
                    entry2.value = obj2;
                }
            } else if (entry == entryArr[length]) {
                Entry entry3 = new Entry(iHash, obj, obj2, entry);
                entryArr[length] = entry3;
                int i = this.count + 1;
                this.count = i;
                if (i >= this.threshold) {
                    rehash();
                } else {
                    recordModification(entry3);
                }
                objSput = null;
            } else {
                objSput = sput(obj, obj2, iHash);
            }
        }
        return objSput;
    }

    @Override
    public synchronized void putAll(Map map) {
        int size = map.size();
        if (size != 0) {
            while (size >= this.threshold) {
                rehash();
            }
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    protected final void recordModification(Object obj) {
        synchronized (this.barrierLock) {
            this.lastWrite = obj;
        }
    }

    protected void rehash() {
        Entry[] entryArr = this.table;
        int length = entryArr.length;
        if (length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i = length << 1;
        int i2 = i - 1;
        this.threshold = (int) (i * this.loadFactor);
        Entry[] entryArr2 = new Entry[i];
        for (Entry entry : entryArr) {
            if (entry != null) {
                int i3 = entry.hash & i2;
                Entry entry2 = entry.next;
                if (entry2 == null) {
                    entryArr2[i3] = entry;
                } else {
                    Entry entry3 = entry;
                    while (entry2 != null) {
                        int i4 = entry2.hash & i2;
                        if (i4 != i3) {
                            entry3 = entry2;
                        } else {
                            i4 = i3;
                        }
                        entry2 = entry2.next;
                        i3 = i4;
                    }
                    entryArr2[i3] = entry3;
                    for (Entry entry4 = entry; entry4 != entry3; entry4 = entry4.next) {
                        int i5 = entry4.hash & i2;
                        entryArr2[i5] = new Entry(entry4.hash, entry4.f6425key, entry4.value, entryArr2[i5]);
                    }
                }
            }
        }
        this.table = entryArr2;
        recordModification(entryArr2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #0 {, blocks: (B:9:0x001e, B:12:0x0024, B:14:0x0028, B:17:0x002e, B:20:0x0036, B:22:0x0043, B:23:0x0052, B:24:0x0057, B:29:0x005c, B:30:0x0060), top: B:32:0x001e }] */
    @Override
    public Object remove(Object obj) {
        Object objSremove = null;
        int iHash = hash(obj);
        Entry[] entryArr = this.table;
        int length = iHash & (entryArr.length - 1);
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null && (entry2.hash != iHash || !m8880eq(obj, entry2.f6425key))) {
            entry2 = entry2.next;
        }
        synchronized (this) {
            if (entryArr != this.table) {
                objSremove = sremove(obj, iHash);
            } else if (entry2 != null) {
                objSremove = entry2.value;
                if (entry != entryArr[length] || objSremove == null) {
                    objSremove = sremove(obj, iHash);
                } else {
                    entry2.value = null;
                    this.count--;
                    Entry entry3 = entry2.next;
                    while (entry != entry2) {
                        Entry entry4 = new Entry(entry.hash, entry.f6425key, entry.value, entry3);
                        entry = entry.next;
                        entry3 = entry4;
                    }
                    entryArr[length] = entry3;
                    recordModification(entry3);
                }
            } else if (entry != entryArr[length]) {
                objSremove = sremove(obj, iHash);
            }
        }
        return objSremove;
    }

    @Override
    public synchronized int size() {
        return this.count;
    }

    protected Object sput(Object obj, Object obj2, int i) {
        Entry[] entryArr = this.table;
        int length = i & (entryArr.length - 1);
        Entry entry = entryArr[length];
        for (Entry entry2 = entry; entry2 != null; entry2 = entry2.next) {
            if (entry2.hash == i && m8880eq(obj, entry2.f6425key)) {
                Object obj3 = entry2.value;
                entry2.value = obj2;
                return obj3;
            }
        }
        Entry entry3 = new Entry(i, obj, obj2, entry);
        entryArr[length] = entry3;
        int i2 = this.count + 1;
        this.count = i2;
        if (i2 >= this.threshold) {
            rehash();
        } else {
            recordModification(entry3);
        }
        return null;
    }

    protected Object sremove(Object obj, int i) {
        Entry[] entryArr = this.table;
        int length = i & (entryArr.length - 1);
        Entry entry = entryArr[length];
        for (Entry entry2 = entry; entry2 != null; entry2 = entry2.next) {
            if (entry2.hash == i && m8880eq(obj, entry2.f6425key)) {
                Object obj2 = entry2.value;
                entry2.value = null;
                this.count--;
                Entry entry3 = entry2.next;
                Entry entry4 = entry;
                while (entry4 != entry2) {
                    Entry entry5 = new Entry(entry4.hash, entry4.f6425key, entry4.value, entry3);
                    entry4 = entry4.next;
                    entry3 = entry5;
                }
                entryArr[length] = entry3;
                recordModification(entry3);
                return obj2;
            }
        }
        return null;
    }

    @Override
    public Collection values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values(this, null);
        this.values = values;
        return values;
    }
}
