package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteral64;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form51l extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form51l();

    Form51l() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(dalvInsn.getRegisters().m7188get(0).regString()).append(", ").toString()).append(InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant())).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), 64);
    }

    @Override
    public int codeSize() {
        return 5;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if ((dalvInsn instanceof CstInsn) && registers.size() == 1 && InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg())) {
            return ((CstInsn) dalvInsn).getConstant() instanceof CstLiteral64;
        }
        return false;
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
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.m7188get(0).getReg()), ((CstLiteral64) ((CstInsn) dalvInsn).getConstant()).getLongBits());
    }
}
