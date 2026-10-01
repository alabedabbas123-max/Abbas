package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form21h extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form21h();

    Form21h() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(dalvInsn.getRegisters().m7188get(0).regString()).append(", ").toString()).append(InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant())).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), dalvInsn.getRegisters().m7188get(0).getCategory() == 1 ? 32 : 64);
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
        if (registers.m7188get(0).getCategory() == 1) {
            return (cstLiteralBits.getIntBits() & 65535) == 0;
        }
        return (cstLiteralBits.getLongBits() & 281474976710655L) == ((long) 0);
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
        short longBits;
        RegisterSpecList registers = dalvInsn.getRegisters();
        CstLiteralBits cstLiteralBits = (CstLiteralBits) ((CstInsn) dalvInsn).getConstant();
        if (registers.m7188get(0).getCategory() == 1) {
            longBits = (short) (cstLiteralBits.getIntBits() >>> 16);
        } else {
            longBits = (short) (cstLiteralBits.getLongBits() >>> 48);
        }
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.m7188get(0).getReg()), longBits);
    }
}
