package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.SimpleInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form32x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form32x();

    Form32x() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return new StringBuffer().append(new StringBuffer().append(registers.m7188get(0).regString()).append(", ").toString()).append(registers.m7188get(1).regString()).toString();
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    @Override
    public int codeSize() {
        return 3;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return (dalvInsn instanceof SimpleInsn) && registers.size() == 2 && InsnFormat.unsignedFitsInShort(registers.m7188get(0).getReg()) && InsnFormat.unsignedFitsInShort(registers.m7188get(1).getReg());
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, InsnFormat.unsignedFitsInShort(registers.m7188get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInShort(registers.m7188get(1).getReg()));
        return bitSet;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0), (short) registers.m7188get(0).getReg(), (short) registers.m7188get(1).getReg());
    }
}
