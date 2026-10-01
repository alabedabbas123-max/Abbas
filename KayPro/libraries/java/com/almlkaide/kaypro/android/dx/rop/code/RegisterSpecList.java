package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;
import java.util.BitSet;

public final class RegisterSpecList extends FixedSizeList implements TypeList {
    public static final RegisterSpecList EMPTY = new RegisterSpecList(0);

    public static RegisterSpecList make(RegisterSpec registerSpec) {
        RegisterSpecList registerSpecList = new RegisterSpecList(1);
        registerSpecList.m7189set(0, registerSpec);
        return registerSpecList;
    }

    public static RegisterSpecList make(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        RegisterSpecList registerSpecList = new RegisterSpecList(2);
        registerSpecList.m7189set(0, registerSpec);
        registerSpecList.m7189set(1, registerSpec2);
        return registerSpecList;
    }

    public static RegisterSpecList make(RegisterSpec registerSpec, RegisterSpec registerSpec2, RegisterSpec registerSpec3) {
        RegisterSpecList registerSpecList = new RegisterSpecList(3);
        registerSpecList.m7189set(0, registerSpec);
        registerSpecList.m7189set(1, registerSpec2);
        registerSpecList.m7189set(2, registerSpec3);
        return registerSpecList;
    }

    public static RegisterSpecList make(RegisterSpec registerSpec, RegisterSpec registerSpec2, RegisterSpec registerSpec3, RegisterSpec registerSpec4) {
        RegisterSpecList registerSpecList = new RegisterSpecList(4);
        registerSpecList.m7189set(0, registerSpec);
        registerSpecList.m7189set(1, registerSpec2);
        registerSpecList.m7189set(2, registerSpec3);
        registerSpecList.m7189set(3, registerSpec4);
        return registerSpecList;
    }

    public RegisterSpecList(int i) {
        super(i);
    }

    @Override
    public Type getType(int i) {
        return m7188get(i).getType().getType();
    }

    @Override
    public int getWordCount() {
        int size = size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int category = getType(i).getCategory() + i2;
            i++;
            i2 = category;
        }
        return i2;
    }

    @Override
    public TypeList withAddedType(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    public RegisterSpec m7188get(int i) {
        return (RegisterSpec) get0(i);
    }

    public RegisterSpec specForRegister(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            RegisterSpec registerSpecM7188get = m7188get(i2);
            if (registerSpecM7188get.getReg() == i) {
                return registerSpecM7188get;
            }
        }
        return (RegisterSpec) null;
    }

    public int indexOfRegister(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (m7188get(i2).getReg() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void m7189set(int i, RegisterSpec registerSpec) {
        set0(i, registerSpec);
    }

    public int getRegistersSize() {
        int nextReg;
        int size = size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            RegisterSpec registerSpec = (RegisterSpec) get0(i);
            if (registerSpec == null || (nextReg = registerSpec.getNextReg()) <= i2) {
                nextReg = i2;
            }
            i++;
            i2 = nextReg;
        }
        return i2;
    }

    public RegisterSpecList withFirst(RegisterSpec registerSpec) {
        int size = size();
        RegisterSpecList registerSpecList = new RegisterSpecList(size + 1);
        for (int i = 0; i < size; i++) {
            registerSpecList.set0(i + 1, get0(i));
        }
        registerSpecList.set0(0, registerSpec);
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    public RegisterSpecList withoutFirst() {
        int size = size() - 1;
        if (size == 0) {
            return EMPTY;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        for (int i = 0; i < size; i++) {
            registerSpecList.set0(i, get0(i + 1));
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
            return registerSpecList;
        }
        return registerSpecList;
    }

    public RegisterSpecList withoutLast() {
        int size = size() - 1;
        if (size == 0) {
            return EMPTY;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        for (int i = 0; i < size; i++) {
            registerSpecList.set0(i, get0(i));
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
            return registerSpecList;
        }
        return registerSpecList;
    }

    public RegisterSpecList subset(BitSet bitSet) {
        int i = 0;
        int size = size() - bitSet.cardinality();
        if (size == 0) {
            return EMPTY;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= size()) {
                break;
            }
            if (bitSet.get(i2)) {
                i = i3;
            } else {
                registerSpecList.set0(i3, get0(i2));
                i = i3 + 1;
            }
            i2++;
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    public RegisterSpecList withOffset(int i) {
        int size = size();
        if (size != 0) {
            RegisterSpecList registerSpecList = new RegisterSpecList(size);
            for (int i2 = 0; i2 < size; i2++) {
                RegisterSpec registerSpec = (RegisterSpec) get0(i2);
                if (registerSpec != null) {
                    registerSpecList.set0(i2, registerSpec.withOffset(i));
                }
            }
            if (isImmutable()) {
                registerSpecList.setImmutable();
            }
            return registerSpecList;
        }
        return this;
    }

    public RegisterSpecList withExpandedRegisters(int i, boolean z, BitSet bitSet) {
        int size = size();
        if (size != 0) {
            Expander expander = new Expander(this, bitSet, i, z);
            for (int i2 = 0; i2 < size; i2++) {
                expander.expandRegister(i2);
            }
            return expander.getResult();
        }
        return this;
    }

    private static class Expander {
        private int base;
        private final BitSet compatRegs;
        private boolean duplicateFirst;
        private final RegisterSpecList regSpecList;
        private final RegisterSpecList result;

        Expander(RegisterSpecList registerSpecList, BitSet bitSet, int i, boolean z) {
            this.regSpecList = registerSpecList;
            this.compatRegs = bitSet;
            this.base = i;
            this.result = new RegisterSpecList(registerSpecList.size());
            this.duplicateFirst = z;
        }

        public void expandRegister(int i) {
            expandRegister(i, (RegisterSpec) this.regSpecList.get0(i));
        }

        private void expandRegister(int i, RegisterSpec registerSpec) {
            boolean z = true;
            if (this.compatRegs != null && this.compatRegs.get(i)) {
                z = false;
            }
            if (z) {
                registerSpec = registerSpec.withReg(this.base);
                if (!this.duplicateFirst) {
                    this.base += registerSpec.getCategory();
                }
            }
            this.duplicateFirst = false;
            this.result.set0(i, registerSpec);
        }

        public RegisterSpecList getResult() {
            if (this.regSpecList.isImmutable()) {
                this.result.setImmutable();
            }
            return this.result;
        }
    }
}
