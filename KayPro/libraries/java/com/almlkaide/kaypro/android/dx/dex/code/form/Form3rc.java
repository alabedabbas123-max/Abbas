package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class Form3rc extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form3rc();

    Form3rc() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(InsnFormat.regRangeString(dalvInsn.getRegisters())).append(", ").toString()).append(dalvInsn.cstString()).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return z ? dalvInsn.cstComment() : "";
    }

    @Override
    public int codeSize() {
        return 3;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        if (!(dalvInsn instanceof CstInsn)) {
            return false;
        }
        CstInsn cstInsn = (CstInsn) dalvInsn;
        int index = cstInsn.getIndex();
        Constant constant = cstInsn.getConstant();
        if (!InsnFormat.unsignedFitsInShort(index)) {
            return false;
        }
        if (!(constant instanceof CstMethodRef) && !(constant instanceof CstType) && !(constant instanceof CstCallSiteRef)) {
            return false;
        }
        RegisterSpecList registers = cstInsn.getRegisters();
        registers.size();
        return registers.size() == 0 || (InsnFormat.isRegListSequential(registers) && InsnFormat.unsignedFitsInShort(registers.m7188get(0).getReg()) && InsnFormat.unsignedFitsInByte(registers.getWordCount()));
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.getWordCount()), (short) ((CstInsn) dalvInsn).getIndex(), (short) (registers.size() == 0 ? 0 : registers.m7188get(0).getReg()));
    }
}
