package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;
import com.almlkaide.kaypro.android.dx.util.IntList;

public final class ByteCatchList extends FixedSizeList {
    public static final ByteCatchList EMPTY = new ByteCatchList(0);

    public ByteCatchList(int i) {
        super(i);
    }

    public int byteLength() {
        return (size() * 8) + 2;
    }

    public Item m7122get(int i) {
        return (Item) get0(i);
    }

    public void m7124set(int i, Item item) {
        if (item == null) {
            throw new NullPointerException("item == null");
        }
        set0(i, item);
    }

    public void m7123set(int i, int i2, int i3, int i4, CstType cstType) {
        set0(i, new Item(i2, i3, i4, cstType));
    }

    public ByteCatchList listFor(int i) {
        int size = size();
        Item[] itemArr = new Item[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Item itemM7122get = m7122get(i3);
            if (itemM7122get.covers(i) && typeNotFound(itemM7122get, itemArr, i2)) {
                itemArr[i2] = itemM7122get;
                i2++;
            }
        }
        if (i2 == 0) {
            return EMPTY;
        }
        ByteCatchList byteCatchList = new ByteCatchList(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            byteCatchList.m7124set(i4, itemArr[i4]);
        }
        byteCatchList.setImmutable();
        return byteCatchList;
    }

    private static boolean typeNotFound(Item item, Item[] itemArr, int i) {
        CstType exceptionClass = item.getExceptionClass();
        for (int i2 = 0; i2 < i; i2++) {
            CstType exceptionClass2 = itemArr[i2].getExceptionClass();
            if (exceptionClass2 == exceptionClass || exceptionClass2 == CstType.OBJECT) {
                return false;
            }
        }
        return true;
    }

    public IntList toTargetList(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        boolean z = i >= 0;
        int size = size();
        if (size == 0) {
            if (z) {
                return IntList.makeImmutable(i);
            }
            return IntList.EMPTY;
        }
        IntList intList = new IntList((z ? 1 : 0) + size);
        for (int i2 = 0; i2 < size; i2++) {
            intList.m7230add(m7122get(i2).getHandlerPc());
        }
        if (z) {
            intList.m7230add(i);
        }
        intList.setImmutable();
        return intList;
    }

    public TypeList toRopCatchList() {
        int size = size();
        if (size == 0) {
            return StdTypeList.EMPTY;
        }
        StdTypeList stdTypeList = new StdTypeList(size);
        for (int i = 0; i < size; i++) {
            stdTypeList.m7198set(i, m7122get(i).getExceptionClass().getClassType());
        }
        stdTypeList.setImmutable();
        return stdTypeList;
    }

    public static class Item {
        private final int endPc;
        private final CstType exceptionClass;
        private final int handlerPc;
        private final int startPc;

        public Item(int i, int i2, int i3, CstType cstType) {
            if (i < 0) {
                throw new IllegalArgumentException("startPc < 0");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("endPc < startPc");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("handlerPc < 0");
            }
            this.startPc = i;
            this.endPc = i2;
            this.handlerPc = i3;
            this.exceptionClass = cstType;
        }

        public int getStartPc() {
            return this.startPc;
        }

        public int getEndPc() {
            return this.endPc;
        }

        public int getHandlerPc() {
            return this.handlerPc;
        }

        public CstType getExceptionClass() {
            return this.exceptionClass != null ? this.exceptionClass : CstType.OBJECT;
        }

        public boolean covers(int i) {
            return i >= this.startPc && i < this.endPc;
        }
    }
}
