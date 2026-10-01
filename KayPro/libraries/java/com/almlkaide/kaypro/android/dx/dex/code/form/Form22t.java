package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.TargetInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form22t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form22t();

    Form22t() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(registers.m7188get(0).regString()).append(", ").toString()).append(registers.m7188get(1).regString()).toString()).append(", ").toString()).append(InsnFormat.branchString(dalvInsn)).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.branchComment(dalvInsn);
    }

    @Override
    public int codeSize() {
        return 2;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof TargetInsn) || registers.size() != 2 || !InsnFormat.unsignedFitsInNibble(registers.m7188get(0).getReg()) || !InsnFormat.unsignedFitsInNibble(registers.m7188get(1).getReg())) {
            return false;
        }
        TargetInsn targetInsn = (TargetInsn) dalvInsn;
        if (targetInsn.hasTargetOffset()) {
            return branchFits(targetInsn);
        }
        return true;
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, InsnFormat.unsignedFitsInNibble(registers.m7188get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInNibble(registers.m7188get(1).getReg()));
        return bitSet;
    }

    @Override
    public boolean branchFits(TargetInsn targetInsn) {
        int targetOffset = targetInsn.getTargetOffset();
        return targetOffset != 0 && InsnFormat.signedFitsInShort(targetOffset);
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(registers.m7188get(0).getReg(), registers.m7188get(1).getReg())), (short) ((TargetInsn) dalvInsn).getTargetOffset());
    }
}
