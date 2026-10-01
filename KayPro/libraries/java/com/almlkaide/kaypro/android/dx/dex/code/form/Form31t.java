package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.TargetInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form31t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form31t();

    Form31t() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(dalvInsn.getRegisters().m7188get(0).regString()).append(", ").toString()).append(InsnFormat.branchString(dalvInsn)).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.branchComment(dalvInsn);
    }

    @Override
    public int codeSize() {
        return 3;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return (dalvInsn instanceof TargetInsn) && registers.size() == 1 && InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg());
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg()));
        return bitSet;
    }

    @Override
    public boolean branchFits(TargetInsn targetInsn) {
        return true;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.m7188get(0).getReg()), ((TargetInsn) dalvInsn).getTargetOffset());
    }
}
