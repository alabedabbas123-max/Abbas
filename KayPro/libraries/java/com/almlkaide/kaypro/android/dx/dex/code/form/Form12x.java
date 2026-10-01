package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.SimpleInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form12x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form12x();

    Form12x() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        return new StringBuffer().append(new StringBuffer().append(registers.m7188get(size - 2).regString()).append(", ").toString()).append(registers.m7188get(size - 1).regString()).toString();
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
        RegisterSpec registerSpecM7188get;
        RegisterSpec registerSpecM7188get2;
        if (!(dalvInsn instanceof SimpleInsn)) {
            return false;
        }
        RegisterSpecList registers = dalvInsn.getRegisters();
        switch (registers.size()) {
            case 2:
                registerSpecM7188get = registers.m7188get(0);
                registerSpecM7188get2 = registers.m7188get(1);
                break;
            case 3:
                registerSpecM7188get = registers.m7188get(1);
                registerSpecM7188get2 = registers.m7188get(2);
                if (registerSpecM7188get.getReg() != registers.m7188get(0).getReg()) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return InsnFormat.unsignedFitsInNibble(registerSpecM7188get.getReg()) && InsnFormat.unsignedFitsInNibble(registerSpecM7188get2.getReg());
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        int reg = registers.m7188get(0).getReg();
        int reg2 = registers.m7188get(1).getReg();
        switch (registers.size()) {
            case 2:
                bitSet.set(0, InsnFormat.unsignedFitsInNibble(reg));
                bitSet.set(1, InsnFormat.unsignedFitsInNibble(reg2));
                return bitSet;
            case 3:
                if (reg != reg2) {
                    bitSet.set(0, false);
                    bitSet.set(1, false);
                } else {
                    boolean zUnsignedFitsInNibble = InsnFormat.unsignedFitsInNibble(reg2);
                    bitSet.set(0, zUnsignedFitsInNibble);
                    bitSet.set(1, zUnsignedFitsInNibble);
                }
                bitSet.set(2, InsnFormat.unsignedFitsInNibble(registers.m7188get(2).getReg()));
                return bitSet;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(registers.m7188get(size - 2).getReg(), registers.m7188get(size - 1).getReg())));
    }
}
