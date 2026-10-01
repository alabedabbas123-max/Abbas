package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.MultiCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class Form4rcc extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form4rcc();

    Form4rcc() {
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
        return 4;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        if (!(dalvInsn instanceof MultiCstInsn)) {
            return false;
        }
        MultiCstInsn multiCstInsn = (MultiCstInsn) dalvInsn;
        int index = multiCstInsn.getIndex(0);
        int index2 = multiCstInsn.getIndex(1);
        if (!InsnFormat.unsignedFitsInShort(index) || !InsnFormat.unsignedFitsInShort(index2) || !(multiCstInsn.getConstant(0) instanceof CstMethodRef) || !(multiCstInsn.getConstant(1) instanceof CstProtoRef)) {
            return false;
        }
        RegisterSpecList registers = multiCstInsn.getRegisters();
        int size = registers.size();
        if (size == 0) {
            return true;
        }
        return InsnFormat.unsignedFitsInByte(registers.getWordCount()) && InsnFormat.unsignedFitsInShort(size) && InsnFormat.unsignedFitsInShort(registers.m7188get(0).getReg()) && InsnFormat.isRegListSequential(registers);
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        MultiCstInsn multiCstInsn = (MultiCstInsn) dalvInsn;
        short index = (short) multiCstInsn.getIndex(0);
        short index2 = (short) multiCstInsn.getIndex(1);
        RegisterSpecList registers = dalvInsn.getRegisters();
        short reg = (short) 0;
        if (registers.size() > 0) {
            reg = (short) registers.m7188get(0).getReg();
        }
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.getWordCount()), index, reg, index2);
    }
}
