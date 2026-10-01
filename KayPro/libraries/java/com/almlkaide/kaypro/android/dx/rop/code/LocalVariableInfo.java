package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.util.MutabilityControl;
import java.util.HashMap;

public final class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<Insn, RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(RopMethod ropMethod) {
        if (ropMethod == null) {
            throw new NullPointerException("method == null");
        }
        BasicBlockList blocks = ropMethod.getBlocks();
        int maxLabel = blocks.getMaxLabel();
        this.regCount = blocks.getRegCount();
        this.emptySet = new RegisterSpecSet(this.regCount);
        this.blockStarts = new RegisterSpecSet[maxLabel];
        this.insnAssignments = new HashMap<>(blocks.getInstructionCount());
        this.emptySet.setImmutable();
    }

    public void setStarts(int i, RegisterSpecSet registerSpecSet) {
        throwIfImmutable();
        if (registerSpecSet == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.blockStarts[i] = registerSpecSet;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public boolean mergeStarts(int i, RegisterSpecSet registerSpecSet) {
        RegisterSpecSet starts0 = getStarts0(i);
        if (starts0 == null) {
            setStarts(i, registerSpecSet);
            return true;
        }
        RegisterSpecSet registerSpecSetMutableCopy = starts0.mutableCopy();
        if (starts0.size() != 0) {
            registerSpecSetMutableCopy.intersect(registerSpecSet, true);
        } else {
            registerSpecSetMutableCopy = registerSpecSet.mutableCopy();
        }
        if (starts0.equals(registerSpecSetMutableCopy)) {
            return false;
        }
        registerSpecSetMutableCopy.setImmutable();
        setStarts(i, registerSpecSetMutableCopy);
        return true;
    }

    public RegisterSpecSet getStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0 : this.emptySet;
    }

    public RegisterSpecSet getStarts(BasicBlock basicBlock) {
        return getStarts(basicBlock.getLabel());
    }

    public RegisterSpecSet mutableCopyOfStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0.mutableCopy() : new RegisterSpecSet(this.regCount);
    }

    public void addAssignment(Insn insn, RegisterSpec registerSpec) {
        throwIfImmutable();
        if (insn == null) {
            throw new NullPointerException("insn == null");
        }
        if (registerSpec == null) {
            throw new NullPointerException("spec == null");
        }
        this.insnAssignments.put(insn, registerSpec);
    }

    public RegisterSpec getAssignment(Insn insn) {
        return this.insnAssignments.get(insn);
    }

    public int getAssignmentCount() {
        return this.insnAssignments.size();
    }

    public void debugDump() {
        for (int i = 0; i < this.blockStarts.length; i++) {
            if (this.blockStarts[i] != null) {
                if (this.blockStarts[i] == this.emptySet) {
                    System.out.printf("%04x: empty set\n", new Integer(i));
                } else {
                    System.out.printf("%04x: %s\n", new Integer(i), this.blockStarts[i]);
                }
            }
        }
    }

    private RegisterSpecSet getStarts0(int i) {
        try {
            return this.blockStarts[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus label");
        }
    }
}
