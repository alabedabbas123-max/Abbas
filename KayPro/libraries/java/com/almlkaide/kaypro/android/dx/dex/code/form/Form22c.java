package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form22c extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form22c();

    Form22c() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(registers.m7188get(0).regString()).append(", ").toString()).append(registers.m7188get(1).regString()).toString()).append(", ").toString()).append(dalvInsn.cstString()).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return z ? dalvInsn.cstComment() : "";
    }

    @Override
    public int codeSize() {
        return 2;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 2 || !InsnFormat.unsignedFitsInNibble(registers.m7188get(0).getReg()) || !InsnFormat.unsignedFitsInNibble(registers.m7188get(1).getReg())) {
            return false;
        }
        CstInsn cstInsn = (CstInsn) dalvInsn;
        if (!InsnFormat.unsignedFitsInShort(cstInsn.getIndex())) {
            return false;
        }
        Constant constant = cstInsn.getConstant();
        return (constant instanceof CstType) || (constant instanceof CstFieldRef);
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
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(registers.m7188get(0).getReg(), registers.m7188get(1).getReg())), (short) ((CstInsn) dalvInsn).getIndex());
    }
}
