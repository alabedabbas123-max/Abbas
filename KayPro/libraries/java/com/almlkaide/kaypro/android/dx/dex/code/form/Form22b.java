package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form22b extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form22b();

    Form22b() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(registers.m7188get(0).regString()).append(", ").toString()).append(registers.m7188get(1).regString()).toString()).append(", ").toString()).append(InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant())).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), 8);
    }

    @Override
    public int codeSize() {
        return 2;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 2 || !InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg()) || !InsnFormat.unsignedFitsInByte(registers.m7188get(1).getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if (!(constant instanceof CstLiteralBits)) {
            return false;
        }
        CstLiteralBits cstLiteralBits = (CstLiteralBits) constant;
        return cstLiteralBits.fitsInInt() && InsnFormat.signedFitsInByte(cstLiteralBits.getIntBits());
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInByte(registers.m7188get(1).getReg()));
        return bitSet;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.m7188get(0).getReg()), InsnFormat.codeUnit(registers.m7188get(1).getReg(), ((CstLiteralBits) ((CstInsn) dalvInsn).getConstant()).getIntBits() & 255));
    }
}
