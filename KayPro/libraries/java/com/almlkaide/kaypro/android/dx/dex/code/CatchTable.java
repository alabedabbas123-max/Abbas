package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class CatchTable extends FixedSizeList implements Comparable<CatchTable> {
    public static final CatchTable EMPTY = new CatchTable(0);

    @Override
    public int compareTo(CatchTable catchTable) {
        return compareTo2(catchTable);
    }

    public CatchTable(int i) {
        super(i);
    }

    public Entry m7150get(int i) {
        return (Entry) get0(i);
    }

    public void m7151set(int i, Entry entry) {
        set0(i, entry);
    }

    public int compareTo2(CatchTable catchTable) {
        if (this == catchTable) {
            return 0;
        }
        int size = size();
        int size2 = catchTable.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = m7150get(i).compareTo2(catchTable.m7150get(i));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public static class Entry implements Comparable<Entry> {

        private final int f5023end;
        private final CatchHandlerList handlers;
        private final int start;

        @Override
        public int compareTo(Entry entry) {
            return compareTo2(entry);
        }

        public Entry(int i, int i2, CatchHandlerList catchHandlerList) {
            if (i < 0) {
                throw new IllegalArgumentException("start < 0");
            }
            if (i2 <= i) {
                throw new IllegalArgumentException("end <= start");
            }
            if (catchHandlerList.isMutable()) {
                throw new IllegalArgumentException("handlers.isMutable()");
            }
            this.start = i;
            this.f5023end = i2;
            this.handlers = catchHandlerList;
        }

        public int hashCode() {
            return (((this.start * 31) + this.f5023end) * 31) + this.handlers.hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof Entry) && compareTo2((Entry) obj) == 0;
        }

        public int compareTo2(Entry entry) {
            if (this.start < entry.start) {
                return -1;
            }
            if (this.start > entry.start) {
                return 1;
            }
            if (this.f5023end < entry.f5023end) {
                return -1;
            }
            if (this.f5023end > entry.f5023end) {
                return 1;
            }
            return this.handlers.compareTo2(entry.handlers);
        }

        public int getStart() {
            return this.start;
        }

        public int getEnd() {
            return this.f5023end;
        }

        public CatchHandlerList getHandlers() {
            return this.handlers;
        }
    }
}
