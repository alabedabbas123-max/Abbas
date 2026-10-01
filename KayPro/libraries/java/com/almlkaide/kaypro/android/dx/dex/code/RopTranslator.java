package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.FillArrayDataInsn;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.InvokePolymorphicInsn;
import com.almlkaide.kaypro.android.dx.rop.code.LocalVariableInfo;
import com.almlkaide.kaypro.android.dx.rop.code.PlainCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.code.SwitchInsn;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingInsn;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.util.Bits;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;

public final class RopTranslator {
    private final BlockAddresses addresses;
    private final DexOptions dexOptions;
    private final LocalVariableInfo locals;
    private final RopMethod method;
    private int[] order = (int[]) null;
    private final OutputCollector output;
    private final int paramSize;
    private final boolean paramsAreInOrder;
    private final int positionInfo;
    private final int regCount;
    private final TranslationVisitor translationVisitor;

    public static DalvCode translate(RopMethod ropMethod, int i, LocalVariableInfo localVariableInfo, int i2, DexOptions dexOptions) {
        return new RopTranslator(ropMethod, i, localVariableInfo, i2, dexOptions).translateAndGetResult();
    }

    RopTranslator(RopMethod ropMethod, int i, LocalVariableInfo localVariableInfo, int i2, DexOptions dexOptions) {
        this.dexOptions = dexOptions;
        this.method = ropMethod;
        this.positionInfo = i;
        this.locals = localVariableInfo;
        this.addresses = new BlockAddresses(ropMethod);
        this.paramSize = i2;
        this.paramsAreInOrder = calculateParamsAreInOrder(ropMethod, i2);
        BasicBlockList blocks = ropMethod.getBlocks();
        int size = blocks.size();
        int instructionCount = (size * 3) + blocks.getInstructionCount();
        instructionCount = localVariableInfo != null ? instructionCount + localVariableInfo.getAssignmentCount() + size : instructionCount;
        this.regCount = (this.paramsAreInOrder ? 0 : this.paramSize) + blocks.getRegCount();
        this.output = new OutputCollector(dexOptions, instructionCount, size * 3, this.regCount, i2);
        if (localVariableInfo != null) {
            this.translationVisitor = new LocalVariableAwareTranslationVisitor(this, this.output, localVariableInfo);
        } else {
            this.translationVisitor = new TranslationVisitor(this, this.output);
        }
    }

    private static boolean calculateParamsAreInOrder(RopMethod ropMethod, int i) {
        boolean[] zArr = {true};
        ropMethod.getBlocks().forEachInsn(new Insn.BaseVisitor(zArr, ropMethod.getBlocks().getRegCount(), i) {
            private final int val$initialRegCount;
            private final int val$paramSize;
            private final boolean[] val$paramsAreInOrder;

            {
                this.val$paramsAreInOrder = zArr;
                this.val$initialRegCount = i;
                this.val$paramSize = i;
            }

            @Override
            public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
                if (plainCstInsn.getOpcode().getOpcode() == 3) {
                    this.val$paramsAreInOrder[0] = this.val$paramsAreInOrder[0] && ((CstInteger) plainCstInsn.getConstant()).getValue() + (this.val$initialRegCount - this.val$paramSize) == plainCstInsn.getResult().getReg();
                }
            }
        });
        return zArr[0];
    }

    private DalvCode translateAndGetResult() {
        pickOrder();
        outputInstructions();
        return new DalvCode(this.positionInfo, this.output.getFinisher(), new StdCatchBuilder(this.method, this.order, this.addresses));
    }

    private void outputInstructions() {
        BasicBlockList blocks = this.method.getBlocks();
        int[] iArr = this.order;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i + 1;
            outputBlock(blocks.labelToBlock(iArr[i]), i2 == iArr.length ? -1 : iArr[i2]);
        }
    }

    private void outputBlock(BasicBlock basicBlock, int i) {
        CodeAddress start = this.addresses.getStart(basicBlock);
        this.output.m7159add(start);
        if (this.locals != null) {
            this.output.m7159add(new LocalSnapshot(start.getPosition(), this.locals.getStarts(basicBlock)));
        }
        this.translationVisitor.setBlock(basicBlock, this.addresses.getLast(basicBlock));
        basicBlock.getInsns().forEach(this.translationVisitor);
        this.output.m7159add(this.addresses.getEnd(basicBlock));
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        Insn lastInsn = basicBlock.getLastInsn();
        if (primarySuccessor >= 0 && primarySuccessor != i) {
            if (lastInsn.getOpcode().getBranchingness() == 4 && basicBlock.getSecondarySuccessor() == i) {
                this.output.reverseBranch(1, this.addresses.getStart(primarySuccessor));
            } else {
                this.output.m7159add(new TargetInsn(Dops.GOTO, lastInsn.getPosition(), RegisterSpecList.EMPTY, this.addresses.getStart(primarySuccessor)));
            }
        }
    }

    private void pickOrder() {
        int iM7231get;
        BasicBlockList blocks = this.method.getBlocks();
        int size = blocks.size();
        int maxLabel = blocks.getMaxLabel();
        int[] iArrMakeBitSet = Bits.makeBitSet(maxLabel);
        int[] iArrMakeBitSet2 = Bits.makeBitSet(maxLabel);
        for (int i = 0; i < size; i++) {
            Bits.m7218set(iArrMakeBitSet, blocks.m7181get(i).getLabel());
        }
        int[] iArr = new int[size];
        int firstLabel = this.method.getFirstLabel();
        int i2 = 0;
        while (firstLabel != -1) {
            while (true) {
                IntList intListLabelToPredecessors = this.method.labelToPredecessors(firstLabel);
                int size2 = intListLabelToPredecessors.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    iM7231get = intListLabelToPredecessors.m7231get(i3);
                    if (Bits.m7216get(iArrMakeBitSet2, iM7231get)) {
                        break;
                    }
                    if (Bits.m7216get(iArrMakeBitSet, iM7231get) && blocks.labelToBlock(iM7231get).getPrimarySuccessor() == firstLabel) {
                        break;
                    } else {
                        i3++;
                    }
                }
                Bits.m7218set(iArrMakeBitSet2, iM7231get);
                firstLabel = iM7231get;
            }
            int label = firstLabel;
            int i4 = i2;
            while (label != -1) {
                Bits.clear(iArrMakeBitSet, label);
                Bits.clear(iArrMakeBitSet2, label);
                iArr[i4] = label;
                i4++;
                BasicBlock basicBlockLabelToBlock = blocks.labelToBlock(label);
                BasicBlock basicBlockPreferredSuccessorOf = blocks.preferredSuccessorOf(basicBlockLabelToBlock);
                if (basicBlockPreferredSuccessorOf == null) {
                    i4 = i4;
                    break;
                }
                label = basicBlockPreferredSuccessorOf.getLabel();
                int primarySuccessor = basicBlockLabelToBlock.getPrimarySuccessor();
                if (!Bits.m7216get(iArrMakeBitSet, label)) {
                    if (primarySuccessor == label || primarySuccessor < 0 || !Bits.m7216get(iArrMakeBitSet, primarySuccessor)) {
                        IntList successors = basicBlockLabelToBlock.getSuccessors();
                        int size3 = successors.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                label = -1;
                                break;
                            }
                            label = successors.m7231get(i5);
                            if (Bits.m7216get(iArrMakeBitSet, label)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        label = primarySuccessor;
                    }
                }
            }
            firstLabel = Bits.findFirst(iArrMakeBitSet, 0);
            i2 = i4;
        }
        if (i2 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        this.order = iArr;
    }

    public static RegisterSpecList getRegs(Insn insn) {
        return getRegs(insn, insn.getResult());
    }

    public static RegisterSpecList getRegs(Insn insn, RegisterSpec registerSpec) {
        RegisterSpecList sources = insn.getSources();
        if (insn.getOpcode().isCommutative() && sources.size() == 2 && registerSpec.getReg() == sources.m7188get(1).getReg()) {
            sources = RegisterSpecList.make(sources.m7188get(1), sources.m7188get(0));
        }
        return registerSpec == null ? sources : sources.withFirst(registerSpec);
    }

    private class TranslationVisitor implements Insn.Visitor {
        private BasicBlock block;
        private CodeAddress lastAddress;
        private final OutputCollector output;
        private final RopTranslator this$0;

        public TranslationVisitor(RopTranslator ropTranslator, OutputCollector outputCollector) {
            this.this$0 = ropTranslator;
            this.output = outputCollector;
        }

        public void setBlock(BasicBlock basicBlock, CodeAddress codeAddress) {
            this.block = basicBlock;
            this.lastAddress = codeAddress;
        }

        @Override
        public void visitPlainInsn(PlainInsn plainInsn) {
            DalvInsn targetInsn;
            Rop opcode = plainInsn.getOpcode();
            if (opcode.getOpcode() != 54 && opcode.getOpcode() != 56) {
                SourcePosition position = plainInsn.getPosition();
                Dop c1680DopDopFor = RopToDop.dopFor(plainInsn);
                switch (opcode.getBranchingness()) {
                    case 1:
                    case 2:
                    case 6:
                        targetInsn = new SimpleInsn(c1680DopDopFor, position, RopTranslator.getRegs(plainInsn));
                        break;
                    case 3:
                        return;
                    case 4:
                        targetInsn = new TargetInsn(c1680DopDopFor, position, RopTranslator.getRegs(plainInsn), this.this$0.addresses.getStart(this.block.getSuccessors().m7231get(1)));
                        break;
                    case 5:
                    default:
                        throw new RuntimeException("shouldn't happen");
                }
                addOutput(targetInsn);
            }
        }

        @Override
        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
            SourcePosition position = plainCstInsn.getPosition();
            Dop c1680DopDopFor = RopToDop.dopFor(plainCstInsn);
            Rop opcode = plainCstInsn.getOpcode();
            int opcode2 = opcode.getOpcode();
            if (opcode.getBranchingness() != 1) {
                throw new RuntimeException("shouldn't happen");
            }
            if (opcode2 == 3) {
                if (!this.this$0.paramsAreInOrder) {
                    RegisterSpec result = plainCstInsn.getResult();
                    addOutput(new SimpleInsn(c1680DopDopFor, position, RegisterSpecList.make(result, RegisterSpec.make(((CstInteger) plainCstInsn.getConstant()).getValue() + (this.this$0.regCount - this.this$0.paramSize), result.getType()))));
                    return;
                }
                return;
            }
            addOutput(new CstInsn(c1680DopDopFor, position, RopTranslator.getRegs(plainCstInsn), plainCstInsn.getConstant()));
        }

        @Override
        public void visitSwitchInsn(SwitchInsn switchInsn) {
            SourcePosition position = switchInsn.getPosition();
            IntList cases = switchInsn.getCases();
            IntList successors = this.block.getSuccessors();
            int size = cases.size();
            int size2 = successors.size();
            int primarySuccessor = this.block.getPrimarySuccessor();
            if (size != size2 - 1 || primarySuccessor != successors.m7231get(size)) {
                throw new RuntimeException("shouldn't happen");
            }
            CodeAddress[] codeAddressArr = new CodeAddress[size];
            for (int i = 0; i < size; i++) {
                codeAddressArr[i] = this.this$0.addresses.getStart(successors.m7231get(i));
            }
            CodeAddress codeAddress = new CodeAddress(position);
            CodeAddress codeAddress2 = new CodeAddress(this.lastAddress.getPosition(), true);
            SwitchData switchData = new SwitchData(position, codeAddress2, cases, codeAddressArr);
            DalvInsn targetInsn = new TargetInsn(switchData.isPacked() ? Dops.PACKED_SWITCH : Dops.SPARSE_SWITCH, position, RopTranslator.getRegs(switchInsn), codeAddress);
            addOutput(codeAddress2);
            addOutput(targetInsn);
            addOutputSuffix(new OddSpacer(position));
            addOutputSuffix(codeAddress);
            addOutputSuffix(switchData);
        }

        private RegisterSpec getNextMoveResultPseudo() {
            int primarySuccessor = this.block.getPrimarySuccessor();
            if (primarySuccessor < 0) {
                return (RegisterSpec) null;
            }
            Insn insnM7183get = this.this$0.method.getBlocks().labelToBlock(primarySuccessor).getInsns().m7183get(0);
            if (insnM7183get.getOpcode().getOpcode() != 56) {
                return (RegisterSpec) null;
            }
            return insnM7183get.getResult();
        }

        @Override
        public void visitInvokePolymorphicInsn(InvokePolymorphicInsn invokePolymorphicInsn) {
            SourcePosition position = invokePolymorphicInsn.getPosition();
            Dop c1680DopDopFor = RopToDop.dopFor(invokePolymorphicInsn);
            Rop opcode = invokePolymorphicInsn.getOpcode();
            if (opcode.getBranchingness() != 6) {
                throw new RuntimeException(new StringBuffer().append("Expected BRANCH_THROW got ").append(opcode.getBranchingness()).toString());
            }
            if (!opcode.isCallLike()) {
                throw new RuntimeException("Expected call-like operation");
            }
            addOutput(this.lastAddress);
            addOutput(new MultiCstInsn(c1680DopDopFor, position, invokePolymorphicInsn.getSources(), new Constant[]{invokePolymorphicInsn.getPolymorphicMethod(), invokePolymorphicInsn.getCallSiteProto()}));
        }

        @Override
        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
            DalvInsn cstInsn;
            int opcode;
            SourcePosition position = throwingCstInsn.getPosition();
            Dop c1680DopDopFor = RopToDop.dopFor(throwingCstInsn);
            Rop opcode2 = throwingCstInsn.getOpcode();
            Constant constant = throwingCstInsn.getConstant();
            if (opcode2.getBranchingness() != 6) {
                throw new RuntimeException(new StringBuffer().append("Expected BRANCH_THROW got ").append(opcode2.getBranchingness()).toString());
            }
            addOutput(this.lastAddress);
            if (opcode2.isCallLike()) {
                addOutput(new CstInsn(c1680DopDopFor, position, throwingCstInsn.getSources(), constant));
                return;
            }
            RegisterSpec nextMoveResultPseudo = getNextMoveResultPseudo();
            RegisterSpecList regs = RopTranslator.getRegs(throwingCstInsn, nextMoveResultPseudo);
            if ((c1680DopDopFor.hasResult() || opcode2.getOpcode() == 43) ? nextMoveResultPseudo == null : nextMoveResultPseudo != null) {
                throw new RuntimeException(new StringBuffer().append("Insn with result/move-result-pseudo mismatch ").append(throwingCstInsn).toString());
            }
            if (opcode2.getOpcode() == 41 && c1680DopDopFor.getOpcode() != 35) {
                cstInsn = new SimpleInsn(c1680DopDopFor, position, regs);
            } else {
                cstInsn = new CstInsn(c1680DopDopFor, position, regs, constant);
            }
            DalvInsn prevNonSpecialInsn = getPrevNonSpecialInsn();
            if (c1680DopDopFor.getOpcode() == 32 && prevNonSpecialInsn != null && (((opcode = prevNonSpecialInsn.getOpcode().getOpcode()) == 7 || opcode == 8 || opcode == 9) && cstInsn.getRegisters().size() > 0 && prevNonSpecialInsn.getRegisters().size() > 1 && cstInsn.getRegisters().m7188get(0).getReg() == prevNonSpecialInsn.getRegisters().m7188get(1).getReg())) {
                addOutput(new SimpleInsn(Dops.f5024NOP, position, RegisterSpecList.EMPTY));
            }
            addOutput(cstInsn);
        }

        @Override
        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
            SourcePosition position = throwingInsn.getPosition();
            Dop c1680DopDopFor = RopToDop.dopFor(throwingInsn);
            if (throwingInsn.getOpcode().getBranchingness() != 6) {
                throw new RuntimeException("shouldn't happen");
            }
            RegisterSpec nextMoveResultPseudo = getNextMoveResultPseudo();
            if (c1680DopDopFor.hasResult() ? nextMoveResultPseudo == null : nextMoveResultPseudo != null) {
                throw new RuntimeException(new StringBuffer().append("Insn with result/move-result-pseudo mismatch").append(throwingInsn).toString());
            }
            addOutput(this.lastAddress);
            addOutput(new SimpleInsn(c1680DopDopFor, position, RopTranslator.getRegs(throwingInsn, nextMoveResultPseudo)));
        }

        @Override
        public void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn) {
            SourcePosition position = fillArrayDataInsn.getPosition();
            Constant constant = fillArrayDataInsn.getConstant();
            ArrayList<Constant> initValues = fillArrayDataInsn.getInitValues();
            if (fillArrayDataInsn.getOpcode().getBranchingness() != 1) {
                throw new RuntimeException("shouldn't happen");
            }
            CodeAddress codeAddress = new CodeAddress(position);
            DalvInsn arrayData = new ArrayData(position, this.lastAddress, initValues, constant);
            DalvInsn targetInsn = new TargetInsn(Dops.FILL_ARRAY_DATA, position, RopTranslator.getRegs(fillArrayDataInsn), codeAddress);
            addOutput(this.lastAddress);
            addOutput(targetInsn);
            addOutputSuffix(new OddSpacer(position));
            addOutputSuffix(codeAddress);
            addOutputSuffix(arrayData);
        }

        protected void addOutput(DalvInsn dalvInsn) {
            this.output.m7159add(dalvInsn);
        }

        protected DalvInsn getPrevNonSpecialInsn() {
            for (int size = this.output.size() - 1; size >= 0; size--) {
                DalvInsn dalvInsnM7160get = this.output.m7160get(size);
                if (dalvInsnM7160get.getOpcode().getOpcode() != -1) {
                    return dalvInsnM7160get;
                }
            }
            return (DalvInsn) null;
        }

        protected void addOutputSuffix(DalvInsn dalvInsn) {
            this.output.addSuffix(dalvInsn);
        }
    }

    private class LocalVariableAwareTranslationVisitor extends TranslationVisitor {
        private final LocalVariableInfo locals;
        private final RopTranslator this$0;

        public LocalVariableAwareTranslationVisitor(RopTranslator ropTranslator, OutputCollector outputCollector, LocalVariableInfo localVariableInfo) {
            super(ropTranslator, outputCollector);
            this.this$0 = ropTranslator;
            this.locals = localVariableInfo;
        }

        @Override
        public void visitPlainInsn(PlainInsn plainInsn) {
            super.visitPlainInsn(plainInsn);
            addIntroductionIfNecessary(plainInsn);
        }

        @Override
        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
            super.visitPlainCstInsn(plainCstInsn);
            addIntroductionIfNecessary(plainCstInsn);
        }

        @Override
        public void visitSwitchInsn(SwitchInsn switchInsn) {
            super.visitSwitchInsn(switchInsn);
            addIntroductionIfNecessary(switchInsn);
        }

        @Override
        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
            super.visitThrowingCstInsn(throwingCstInsn);
            addIntroductionIfNecessary(throwingCstInsn);
        }

        @Override
        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
            super.visitThrowingInsn(throwingInsn);
            addIntroductionIfNecessary(throwingInsn);
        }

        public void addIntroductionIfNecessary(Insn insn) {
            RegisterSpec assignment = this.locals.getAssignment(insn);
            if (assignment != null) {
                addOutput(new LocalStart(insn.getPosition(), assignment));
            }
        }
    }
}
