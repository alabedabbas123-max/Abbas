package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public class CstArray extends Constant {
    private final List list;

    public CstArray(List list) {
        if (list == null) {
            throw new NullPointerException("list == null");
        }
        list.throwIfMutable();
        this.list = list;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CstArray) {
            return this.list.equals(((CstArray) obj).list);
        }
        return false;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @Override
    protected int compareTo0(Constant constant) {
        return this.list.compareTo2(((CstArray) constant).list);
    }

    public String toString() {
        return this.list.toString("array{", ", ", "}");
    }

    @Override
    public String typeName() {
        return "array";
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    public String toHuman() {
        return this.list.toHuman("{", ", ", "}");
    }

    public List getList() {
        return this.list;
    }

    public static final class List extends FixedSizeList implements Comparable<List> {
        @Override
        public int compareTo(List list) {
            return compareTo2(list);
        }

        public List(int i) {
            super(i);
        }

        public int compareTo2(List list) {
            int size = size();
            int size2 = list.size();
            int i = size < size2 ? size : size2;
            for (int i2 = 0; i2 < i; i2++) {
                int iCompareTo2 = ((Constant) get0(i2)).compareTo2((Constant) list.get0(i2));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            if (size < size2) {
                return -1;
            }
            return size > size2 ? 1 : 0;
        }

        public Constant m7194get(int i) {
            return (Constant) get0(i);
        }

        public void m7195set(int i, Constant constant) {
            set0(i, constant);
        }
    }
}
