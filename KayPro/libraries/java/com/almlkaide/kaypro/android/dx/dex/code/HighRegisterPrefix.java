package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class HighRegisterPrefix extends VariableSizeInsn {
    private SimpleInsn[] insns;

    public HighRegisterPrefix(SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(sourcePosition, registerSpecList);
        if (registerSpecList.size() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.insns = (SimpleInsn[]) null;
    }

    @Override
    public int codeSize() {
        int iCodeSize = 0;
        calculateInsnsIfNecessary();
        SimpleInsn[] simpleInsnArr = this.insns;
        int i = 0;
        while (true) {
            int i2 = iCodeSize;
            if (i < simpleInsnArr.length) {
                iCodeSize = simpleInsnArr[i].codeSize() + i2;
                i++;
            } else {
                return i2;
            }
        }
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput) {
        calculateInsnsIfNecessary();
        for (SimpleInsn simpleInsn : this.insns) {
            simpleInsn.writeTo(annotatedOutput);
        }
    }

    private void calculateInsnsIfNecessary() {
        if (this.insns == null) {
            RegisterSpecList registers = getRegisters();
            int size = registers.size();
            this.insns = new SimpleInsn[size];
            int category = 0;
            for (int i = 0; i < size; i++) {
                RegisterSpec registerSpecM7188get = registers.m7188get(i);
                this.insns[i] = moveInsnFor(registerSpecM7188get, category);
                category += registerSpecM7188get.getCategory();
            }
        }
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new HighRegisterPrefix(getPosition(), registerSpecList);
    }

    @Override
    protected String argString() {
        return (String) null;
    }

    @Override
    protected String listingString0(boolean z) {
        RegisterSpecList registers = getRegisters();
        int size = registers.size();
        StringBuilder sb = new StringBuilder(100);
        int category = 0;
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpecM7188get = registers.m7188get(i);
            SimpleInsn simpleInsnMoveInsnFor = moveInsnFor(registerSpecM7188get, category);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(simpleInsnMoveInsnFor.listingString0(z));
            category += registerSpecM7188get.getCategory();
        }
        return sb.toString();
    }

    private static SimpleInsn moveInsnFor(RegisterSpec registerSpec, int i) {
        return DalvInsn.makeMove(SourcePosition.NO_INFO, RegisterSpec.make(i, registerSpec.getType()), registerSpec);
    }
}
