package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.TargetInsn;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class Form30t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form30t();

    Form30t() {
    }

    @Override
    public String insnArgString(DalvInsn dalvInsn) {
        return InsnFormat.branchString(dalvInsn);
    }

    @Override
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.branchComment(dalvInsn);
    }

    @Override
    public int codeSize() {
        return 3;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        return (dalvInsn instanceof TargetInsn) && dalvInsn.getRegisters().size() == 0;
    }

    @Override
    public boolean branchFits(TargetInsn targetInsn) {
        return true;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0), ((TargetInsn) dalvInsn).getTargetOffset());
    }
}
