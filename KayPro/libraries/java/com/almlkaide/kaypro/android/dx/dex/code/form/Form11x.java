package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.SimpleInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form11x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form11x();

    Form11x() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return dalvInsn.getRegisters().m7188get(0).regString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    @Override
    public int codeSize() {
        return 1;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return (dalvInsn instanceof SimpleInsn) && registers.size() == 1 && InsnFormat.unsignedFitsInByte(registers.m7188get(0).getReg());
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
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, dalvInsn.getRegisters().m7188get(0).getReg()));
    }
}
