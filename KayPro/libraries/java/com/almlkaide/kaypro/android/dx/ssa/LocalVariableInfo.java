package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecSet;
import com.almlkaide.kaypro.android.dx.util.MutabilityControl;
import java.util.ArrayList;
import java.util.HashMap;

public class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<SsaInsn, RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(SsaMethod ssaMethod) {
        if (ssaMethod == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
        this.regCount = ssaMethod.getRegCount();
        this.emptySet = new RegisterSpecSet(this.regCount);
        this.blockStarts = new RegisterSpecSet[blocks.size()];
        this.insnAssignments = new HashMap<>();
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
            throw new IllegalArgumentException("bogus index");
        }
    }

    public boolean mergeStarts(int i, RegisterSpecSet registerSpecSet) {
        RegisterSpecSet starts0 = getStarts0(i);
        if (starts0 == null) {
            setStarts(i, registerSpecSet);
            return true;
        }
        RegisterSpecSet registerSpecSetMutableCopy = starts0.mutableCopy();
        registerSpecSetMutableCopy.intersect(registerSpecSet, true);
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

    public RegisterSpecSet getStarts(SsaBasicBlock ssaBasicBlock) {
        return getStarts(ssaBasicBlock.getIndex());
    }

    public RegisterSpecSet mutableCopyOfStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0.mutableCopy() : new RegisterSpecSet(this.regCount);
    }

    public void addAssignment(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        throwIfImmutable();
        if (ssaInsn == null) {
            throw new NullPointerException("insn == null");
        }
        if (registerSpec == null) {
            throw new NullPointerException("spec == null");
        }
        this.insnAssignments.put(ssaInsn, registerSpec);
    }

    public RegisterSpec getAssignment(SsaInsn ssaInsn) {
        return this.insnAssignments.get(ssaInsn);
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
            throw new IllegalArgumentException("bogus index");
        }
    }
}
