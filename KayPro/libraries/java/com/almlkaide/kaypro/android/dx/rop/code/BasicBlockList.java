package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import com.almlkaide.kaypro.android.dx.util.LabeledItem;
import com.almlkaide.kaypro.android.dx.util.LabeledList;

public final class BasicBlockList extends LabeledList {
    private int regCount;

    public BasicBlockList(int i) {
        super(i);
        this.regCount = -1;
    }

    BasicBlockList(BasicBlockList basicBlockList) {
        super(basicBlockList);
        this.regCount = basicBlockList.regCount;
    }

    public BasicBlock m7181get(int i) {
        return (BasicBlock) get0(i);
    }

    public void m7182set(int i, BasicBlock basicBlock) {
        super.m7236set(i, (LabeledItem) basicBlock);
        this.regCount = -1;
    }

    public int getRegCount() {
        if (this.regCount == -1) {
            RegCountVisitor regCountVisitor = new RegCountVisitor();
            forEachInsn(regCountVisitor);
            this.regCount = regCountVisitor.getRegCount();
        }
        return this.regCount;
    }

    public int getInstructionCount() {
        int size = size();
        int i = 0;
        int size2 = 0;
        while (i < size) {
            BasicBlock basicBlock = (BasicBlock) getOrNull0(i);
            i++;
            size2 = basicBlock != null ? basicBlock.getInsns().size() + size2 : size2;
        }
        return size2;
    }

    public int getEffectiveInstructionCount() {
        int i;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            BasicBlock basicBlock = (BasicBlock) getOrNull0(i2);
            if (basicBlock != null) {
                InsnList insns = basicBlock.getInsns();
                int size2 = insns.size();
                i = i3;
                for (int i4 = 0; i4 < size2; i4++) {
                    if (insns.m7183get(i4).getOpcode().getOpcode() != 54) {
                        i++;
                    }
                }
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        return i3;
    }

    public BasicBlock labelToBlock(int i) {
        int iIndexOfLabel = indexOfLabel(i);
        if (iIndexOfLabel < 0) {
            throw new IllegalArgumentException(new StringBuffer().append("no such label: ").append(Hex.m7225u2(i)).toString());
        }
        return m7181get(iIndexOfLabel);
    }

    public void forEachInsn(Insn.Visitor visitor) {
        int size = size();
        for (int i = 0; i < size; i++) {
            m7181get(i).getInsns().forEach(visitor);
        }
    }

    public BasicBlockList withRegisterOffset(int i) {
        int size = size();
        BasicBlockList basicBlockList = new BasicBlockList(size);
        for (int i2 = 0; i2 < size; i2++) {
            BasicBlock basicBlock = (BasicBlock) get0(i2);
            if (basicBlock != null) {
                basicBlockList.m7182set(i2, basicBlock.withRegisterOffset(i));
            }
        }
        if (isImmutable()) {
            basicBlockList.setImmutable();
        }
        return basicBlockList;
    }

    public BasicBlockList getMutableCopy() {
        return new BasicBlockList(this);
    }

    public BasicBlock preferredSuccessorOf(BasicBlock basicBlock) {
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        IntList successors = basicBlock.getSuccessors();
        switch (successors.size()) {
            case 0:
                return (BasicBlock) null;
            case 1:
                return labelToBlock(successors.m7231get(0));
            default:
                if (primarySuccessor != -1) {
                    return labelToBlock(primarySuccessor);
                }
                return labelToBlock(successors.m7231get(0));
        }
    }

    public boolean catchesEqual(BasicBlock basicBlock, BasicBlock basicBlock2) {
        if (!StdTypeList.equalContents(basicBlock.getExceptionHandlerTypes(), basicBlock2.getExceptionHandlerTypes())) {
            return false;
        }
        IntList successors = basicBlock.getSuccessors();
        IntList successors2 = basicBlock2.getSuccessors();
        int size = successors.size();
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        int primarySuccessor2 = basicBlock2.getPrimarySuccessor();
        if ((primarySuccessor == -1 || primarySuccessor2 == -1) && primarySuccessor != primarySuccessor2) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int iM7231get = successors.m7231get(i);
            int iM7231get2 = successors2.m7231get(i);
            if (iM7231get == primarySuccessor) {
                if (iM7231get2 != primarySuccessor2) {
                    return false;
                }
            } else if (iM7231get != iM7231get2) {
                return false;
            }
        }
        return true;
    }

    private static class RegCountVisitor implements Insn.Visitor {
        private int regCount = 0;

        public int getRegCount() {
            return this.regCount;
        }

        @Override
        public void visitPlainInsn(PlainInsn plainInsn) {
            visit(plainInsn);
        }

        @Override
        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
            visit(plainCstInsn);
        }

        @Override
        public void visitSwitchInsn(SwitchInsn switchInsn) {
            visit(switchInsn);
        }

        @Override
        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
            visit(throwingCstInsn);
        }

        @Override
        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
            visit(throwingInsn);
        }

        @Override
        public void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn) {
            visit(fillArrayDataInsn);
        }

        @Override
        public void visitInvokePolymorphicInsn(InvokePolymorphicInsn invokePolymorphicInsn) {
            visit(invokePolymorphicInsn);
        }

        private void visit(Insn insn) {
            RegisterSpec result = insn.getResult();
            if (result != null) {
                processReg(result);
            }
            RegisterSpecList sources = insn.getSources();
            int size = sources.size();
            for (int i = 0; i < size; i++) {
                processReg(sources.m7188get(i));
            }
        }

        private void processReg(RegisterSpec registerSpec) {
            int nextReg = registerSpec.getNextReg();
            if (nextReg > this.regCount) {
                this.regCount = nextReg;
            }
        }
    }
}
