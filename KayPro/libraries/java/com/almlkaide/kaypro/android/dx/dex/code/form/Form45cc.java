package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.MultiCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.BitSet;

public final class Form45cc extends InsnFormat {
    private static final int MAX_NUM_OPS = 5;
    public static final InsnFormat THE_ONE = new Form45cc();

    Form45cc() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return new StringBuffer().append(new StringBuffer().append(InsnFormat.regListString(explicitize(dalvInsn.getRegisters()))).append(", ").toString()).append(dalvInsn.cstString()).toString();
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
        if (multiCstInsn.getNumberOfConstants() == 2) {
            return InsnFormat.unsignedFitsInShort(multiCstInsn.getIndex(0)) && InsnFormat.unsignedFitsInShort(multiCstInsn.getIndex(1)) && (multiCstInsn.getConstant(0) instanceof CstMethodRef) && (multiCstInsn.getConstant(1) instanceof CstProtoRef) && wordCount(multiCstInsn.getRegisters()) >= 0;
        }
        return false;
    }

    @Override
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpecM7188get = registers.m7188get(i);
            bitSet.set(i, InsnFormat.unsignedFitsInNibble((registerSpecM7188get.getCategory() + registerSpecM7188get.getReg()) - 1));
        }
        return bitSet;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        MultiCstInsn multiCstInsn = (MultiCstInsn) dalvInsn;
        short index = (short) multiCstInsn.getIndex(0);
        short index2 = (short) multiCstInsn.getIndex(1);
        RegisterSpecList registerSpecListExplicitize = explicitize(dalvInsn.getRegisters());
        int size = registerSpecListExplicitize.size();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(size > 4 ? registerSpecListExplicitize.m7188get(4).getReg() : 0, size)), index, InsnFormat.codeUnit(size > 0 ? registerSpecListExplicitize.m7188get(0).getReg() : 0, size > 1 ? registerSpecListExplicitize.m7188get(1).getReg() : 0, size > 2 ? registerSpecListExplicitize.m7188get(2).getReg() : 0, size > 3 ? registerSpecListExplicitize.m7188get(3).getReg() : 0), index2);
    }

    private static int wordCount(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        if (size > 5) {
            return -1;
        }
        int category = 0;
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpecM7188get = registerSpecList.m7188get(i);
            category += registerSpecM7188get.getCategory();
            if (!InsnFormat.unsignedFitsInNibble((registerSpecM7188get.getCategory() + registerSpecM7188get.getReg()) - 1)) {
                return -1;
            }
        }
        if (category > 5) {
            category = -1;
        }
        return category;
    }

    private static RegisterSpecList explicitize(RegisterSpecList registerSpecList) {
        int i;
        int iWordCount = wordCount(registerSpecList);
        int size = registerSpecList.size();
        if (iWordCount != size) {
            RegisterSpecList registerSpecList2 = new RegisterSpecList(iWordCount);
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                RegisterSpec registerSpecM7188get = registerSpecList.m7188get(i2);
                registerSpecList2.m7189set(i3, registerSpecM7188get);
                if (registerSpecM7188get.getCategory() == 2) {
                    registerSpecList2.m7189set(i3 + 1, RegisterSpec.make(registerSpecM7188get.getReg() + 1, Type.VOID));
                    i = i3 + 2;
                } else {
                    i = i3 + 1;
                }
                i2++;
                i3 = i;
            }
            registerSpecList2.setImmutable();
            return registerSpecList2;
        }
        return registerSpecList;
    }
}
