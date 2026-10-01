package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form21s extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form21s();

    Form21s() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(dalvInsn.getRegisters().m7188get(0).regString()).append(", ").toString()).append(InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant())).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), 16);
    }

    @Override
    public int codeSize() {
        return 2;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 1 || !InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if (!(constant instanceof CstLiteralBits)) {
            return false;
        }
        CstLiteralBits cstLiteralBits = (CstLiteralBits) constant;
        return cstLiteralBits.fitsInInt() && InsnFormat.signedFitsInShort(cstLiteralBits.getIntBits());
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg()));
        return bitSet;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, dalvInsn.getRegisters().m7188get(0).getReg()), (short) ((CstLiteralBits) ((CstInsn) dalvInsn).getConstant()).getIntBits());
    }
}
