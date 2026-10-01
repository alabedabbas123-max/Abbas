package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public class BootstrapMethodsList extends FixedSizeList {
    public static final BootstrapMethodsList EMPTY = new BootstrapMethodsList(0);

    public BootstrapMethodsList(int i) {
        super(i);
    }

    public Item m7117get(int i) {
        return (Item) get0(i);
    }

    public void m7118set(int i, Item item) {
        if (item == null) {
            throw new NullPointerException("item == null");
        }
        set0(i, item);
    }

    public void m7119set(int i, CstType cstType, CstMethodHandle cstMethodHandle, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
        m7118set(i, new Item(cstType, cstMethodHandle, bootstrapMethodArgumentsList));
    }

    public static BootstrapMethodsList concat(BootstrapMethodsList bootstrapMethodsList, BootstrapMethodsList bootstrapMethodsList2) {
        if (bootstrapMethodsList != EMPTY) {
            if (bootstrapMethodsList2 == EMPTY) {
                return bootstrapMethodsList;
            }
            int size = bootstrapMethodsList.size();
            int size2 = bootstrapMethodsList2.size();
            BootstrapMethodsList bootstrapMethodsList3 = new BootstrapMethodsList(size + size2);
            for (int i = 0; i < size; i++) {
                bootstrapMethodsList3.m7118set(i, bootstrapMethodsList.m7117get(i));
            }
            for (int i2 = 0; i2 < size2; i2++) {
                bootstrapMethodsList3.m7118set(size + i2, bootstrapMethodsList2.m7117get(i2));
            }
            return bootstrapMethodsList3;
        }
        return bootstrapMethodsList2;
    }

    public static class Item {
        private final BootstrapMethodArgumentsList bootstrapMethodArgumentsList;
        private final CstMethodHandle bootstrapMethodHandle;
        private final CstType declaringClass;

        public Item(CstType cstType, CstMethodHandle cstMethodHandle, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
            if (cstType == null) {
                throw new NullPointerException("declaringClass == null");
            }
            if (cstMethodHandle == null) {
                throw new NullPointerException("bootstrapMethodHandle == null");
            }
            if (bootstrapMethodArgumentsList == null) {
                throw new NullPointerException("bootstrapMethodArguments == null");
            }
            this.bootstrapMethodHandle = cstMethodHandle;
            this.bootstrapMethodArgumentsList = bootstrapMethodArgumentsList;
            this.declaringClass = cstType;
        }

        public CstMethodHandle getBootstrapMethodHandle() {
            return this.bootstrapMethodHandle;
        }

        public BootstrapMethodArgumentsList getBootstrapMethodArguments() {
            return this.bootstrapMethodArgumentsList;
        }

        public CstType getDeclaringClass() {
            return this.declaringClass;
        }
    }
}
