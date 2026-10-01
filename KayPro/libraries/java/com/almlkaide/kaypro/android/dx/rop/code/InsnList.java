package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class InsnList extends FixedSizeList {
    public InsnList(int i) {
        super(i);
    }

    public Insn m7183get(int i) {
        return (Insn) get0(i);
    }

    public void m7184set(int i, Insn insn) {
        set0(i, insn);
    }

    public Insn getLast() {
        return m7183get(size() - 1);
    }

    public void forEach(Insn.Visitor visitor) {
        int size = size();
        for (int i = 0; i < size; i++) {
            m7183get(i).accept(visitor);
        }
    }

    public boolean contentEquals(InsnList insnList) {
        int size;
        if (insnList == null || (size = size()) != insnList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!m7183get(i).contentEquals(insnList.m7183get(i))) {
                return false;
            }
        }
        return true;
    }

    public InsnList withRegisterOffset(int i) {
        int size = size();
        InsnList insnList = new InsnList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Insn insn = (Insn) get0(i2);
            if (insn != null) {
                insnList.set0(i2, insn.withRegisterOffset(i));
            }
        }
        if (isImmutable()) {
            insnList.setImmutable();
        }
        return insnList;
    }
}
