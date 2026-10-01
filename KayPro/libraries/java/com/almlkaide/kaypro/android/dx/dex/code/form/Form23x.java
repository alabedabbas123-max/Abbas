package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.SimpleInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form23x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form23x();

    Form23x() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(registers.m7188get(0).regString()).append(", ").toString()).append(registers.m7188get(1).regString()).toString()).append(", ").toString()).append(registers.m7188get(2).regString()).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    @Override
    public int codeSize() {
        return 2;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return (dalvInsn instanceof SimpleInsn) && registers.size() == 3 && InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg()) && InsnFormat.unsignedFitsInByte(registers.m7188get(1).getReg()) && InsnFormat.unsignedFitsInByte(registers.m7188get(2).getReg());
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(3);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInByte(registers.m7188get(1).getReg()));
        bitSet.set(2, InsnFormat.unsignedFitsInByte(registers.m7188get(2).getReg()));
        return bitSet;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.m7188get(0).getReg()), InsnFormat.codeUnit(registers.m7188get(1).getReg(), registers.m7188get(2).getReg()));
    }
}
