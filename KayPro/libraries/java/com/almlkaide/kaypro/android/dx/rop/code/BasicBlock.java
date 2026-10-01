package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import com.almlkaide.kaypro.android.dx.util.LabeledItem;

public final class BasicBlock implements LabeledItem {
    private final InsnList insns;
    private final int label;
    private final int primarySuccessor;
    private final IntList successors;

    public interface Visitor {
        void visitBlock(BasicBlock basicBlock);
    }

    public BasicBlock(int i, InsnList insnList, IntList intList, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            insnList.throwIfMutable();
            int size = insnList.size();
            if (size == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            for (int i3 = size - 2; i3 >= 0; i3--) {
                if (insnList.m7183get(i3).getOpcode().getBranchingness() != 1) {
                    throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("insns[").append(i3).toString()).append("] is a ").toString()).append("branch or can throw").toString());
                }
            }
            if (insnList.m7183get(size - 1).getOpcode().getBranchingness() == 1) {
                throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append("insns does not end with ").append("a branch or throwing ").toString()).append("instruction").toString());
            }
            try {
                intList.throwIfMutable();
                if (i2 < -1) {
                    throw new IllegalArgumentException("primarySuccessor < -1");
                }
                if (i2 >= 0 && !intList.contains(i2)) {
                    throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("primarySuccessor ").append(i2).toString()).append(" not in successors ").toString()).append(intList).toString());
                }
                this.label = i;
                this.insns = insnList;
                this.successors = intList;
                this.primarySuccessor = i2;
            } catch (NullPointerException e) {
                throw new NullPointerException("successors == null");
            }
        } catch (NullPointerException e2) {
            throw new NullPointerException("insns == null");
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public int getLabel() {
        return this.label;
    }

    public InsnList getInsns() {
        return this.insns;
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public int getPrimarySuccessor() {
        return this.primarySuccessor;
    }

    public int getSecondarySuccessor() {
        if (this.successors.size() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int iM7231get = this.successors.m7231get(0);
        if (iM7231get == this.primarySuccessor) {
            return this.successors.m7231get(1);
        }
        return iM7231get;
    }

    public Insn getFirstInsn() {
        return this.insns.m7183get(0);
    }

    public Insn getLastInsn() {
        return this.insns.getLast();
    }

    public boolean canThrow() {
        return this.insns.getLast().canThrow();
    }

    public boolean hasExceptionHandlers() {
        return this.insns.getLast().getCatches().size() != 0;
    }

    public TypeList getExceptionHandlerTypes() {
        return this.insns.getLast().getCatches();
    }

    public BasicBlock withRegisterOffset(int i) {
        return new BasicBlock(this.label, this.insns.withRegisterOffset(i), this.successors, this.primarySuccessor);
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append('{').append(Hex.m7225u2(this.label)).toString()).append('}').toString();
    }
}
