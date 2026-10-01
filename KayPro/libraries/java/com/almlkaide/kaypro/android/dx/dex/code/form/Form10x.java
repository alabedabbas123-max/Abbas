package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.SimpleInsn;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class Form10x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form10x();

    Form10x() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return "";
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
        return (dalvInsn instanceof SimpleInsn) && dalvInsn.getRegisters().size() == 0;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0));
    }
}
