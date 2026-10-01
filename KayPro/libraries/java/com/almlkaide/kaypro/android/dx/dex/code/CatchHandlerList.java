package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class CatchHandlerList extends FixedSizeList implements Comparable<CatchHandlerList> {
    public static final CatchHandlerList EMPTY = new CatchHandlerList(0);

    @Override
    public int compareTo(CatchHandlerList catchHandlerList) {
        return compareTo2(catchHandlerList);
    }

    public CatchHandlerList(int i) {
        super(i);
    }

    public Entry m7147get(int i) {
        return (Entry) get0(i);
    }

    @Override
    public String toHuman() {
        return toHuman("", "");
    }

    public String toHuman(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            Entry entryM7147get = m7147get(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i == size - 1 && catchesAll()) {
                sb.append("<any>");
            } else {
                sb.append(entryM7147get.getExceptionType().toHuman());
            }
            sb.append(" -> ");
            sb.append(Hex.u2or4(entryM7147get.getHandler()));
        }
        return sb.toString();
    }

    public boolean catchesAll() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return m7147get(size - 1).getExceptionType().equals(CstType.OBJECT);
    }

    public void m7149set(int i, CstType cstType, int i2) {
        set0(i, new Entry(cstType, i2));
    }

    public void m7148set(int i, Entry entry) {
        set0(i, entry);
    }

    public int compareTo2(CatchHandlerList catchHandlerList) {
        if (this == catchHandlerList) {
            return 0;
        }
        int size = size();
        int size2 = catchHandlerList.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = m7147get(i).compareTo2(catchHandlerList.m7147get(i));
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
        private final CstType exceptionType;
        private final int handler;

        @Override
        public int compareTo(Entry entry) {
            return compareTo2(entry);
        }

        public Entry(CstType cstType, int i) {
            if (i < 0) {
                throw new IllegalArgumentException("handler < 0");
            }
            if (cstType == null) {
                throw new NullPointerException("exceptionType == null");
            }
            this.handler = i;
            this.exceptionType = cstType;
        }

        public int hashCode() {
            return (this.handler * 31) + this.exceptionType.hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof Entry) && compareTo2((Entry) obj) == 0;
        }

        public int compareTo2(Entry entry) {
            if (this.handler < entry.handler) {
                return -1;
            }
            if (this.handler > entry.handler) {
                return 1;
            }
            return this.exceptionType.compareTo2((Constant) entry.exceptionType);
        }

        public CstType getExceptionType() {
            return this.exceptionType;
        }

        public int getHandler() {
            return this.handler;
        }
    }
}
