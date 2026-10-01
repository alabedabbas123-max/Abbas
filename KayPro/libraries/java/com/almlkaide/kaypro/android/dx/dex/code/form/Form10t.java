package com.almlkaide.kaypro.android.dx.dex.code.form;

import com.almlkaide.kaypro.android.dx.dex.code.DalvInsn;
import com.almlkaide.kaypro.android.dx.dex.code.InsnFormat;
import com.almlkaide.kaypro.android.dx.dex.code.TargetInsn;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class Form10t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form10t();

    Form10t() {
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
        return 1;
    }

    @Override
    public boolean isCompatible(DalvInsn dalvInsn) {
        if (!(dalvInsn instanceof TargetInsn) || dalvInsn.getRegisters().size() != 0) {
            return false;
        }
        TargetInsn targetInsn = (TargetInsn) dalvInsn;
        if (targetInsn.hasTargetOffset()) {
            return branchFits(targetInsn);
        }
        return true;
    }

    @Override
    public boolean branchFits(TargetInsn targetInsn) {
        int targetOffset = targetInsn.getTargetOffset();
        return targetOffset != 0 && InsnFormat.signedFitsInByte(targetOffset);
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, ((TargetInsn) dalvInsn).getTargetOffset() & 255));
    }
}
