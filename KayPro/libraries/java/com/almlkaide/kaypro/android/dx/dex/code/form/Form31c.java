package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.CstInsn;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form31c extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form31c();

    Form31c() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(dalvInsn.getRegisters().m7188get(0).regString()).append(", ").toString()).append(dalvInsn.cstString()).toString();
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
        RegisterSpec registerSpecM7188get;
        if (!(dalvInsn instanceof CstInsn)) {
            return false;
        }
        RegisterSpecList registers = dalvInsn.getRegisters();
        switch (registers.size()) {
            case 1:
                registerSpecM7188get = registers.m7188get(0);
                break;
            case 2:
                registerSpecM7188get = registers.m7188get(0);
                if (registerSpecM7188get.getReg() != registers.m7188get(1).getReg()) {
                    return false;
                }
                break;
            default:
                return false;
        }
        if (!InsnFormat.unsignedFitsInByte(registerSpecM7188get.getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        return (constant instanceof CstType) || (constant instanceof CstFieldRef) || (constant instanceof CstString);
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        BitSet bitSet = new BitSet(size);
        boolean zUnsignedFitsInByte = InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg());
        if (size == 1) {
            bitSet.set(0, zUnsignedFitsInByte);
        } else if (registers.m7188get(0).getReg() == registers.m7188get(1).getReg()) {
            bitSet.set(0, zUnsignedFitsInByte);
            bitSet.set(1, zUnsignedFitsInByte);
        }
        return bitSet;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.m7188get(0).getReg()), ((CstInsn) dalvInsn).getIndex());
    }
}
