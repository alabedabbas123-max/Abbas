package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.cf.iface.MethodList;
import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.InsnList;
import com.almlkaide.kaypro.android.dx.rop.code.PlainCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingInsn;
import com.almlkaide.kaypro.android.dx.rop.code.TranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.Bits;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Ropper {
    private static final int PARAM_ASSIGNMENT = -1;
    private static final int RETURN = -2;
    private static final int SPECIAL_LABEL_COUNT = 7;
    private static final int SYNCH_CATCH_1 = -6;
    private static final int SYNCH_CATCH_2 = -7;
    private static final int SYNCH_RETURN = -3;
    private static final int SYNCH_SETUP_1 = -4;
    private static final int SYNCH_SETUP_2 = -5;
    private final ByteBlockList blocks;
    private final CatchInfo[] catchInfos;
    private final ExceptionSetupLabelAllocator exceptionSetupLabelAllocator;
    private boolean hasSubroutines;
    private final RopperMachine machine;
    private final int maxLabel;
    private final int maxLocals;
    private final ConcreteMethod method;
    private final ArrayList<BasicBlock> result;
    private final ArrayList<IntList> resultSubroutines;

    private final Simulator f5008sim;
    private final Frame[] startFrames;
    private final Subroutine[] subroutines;
    private boolean synchNeedsExceptionHandler;

    private class CatchInfo {
        private final Map<Type, ExceptionHandlerSetup> setups = new HashMap();
        private final Ropper this$0;

        ExceptionHandlerSetup getSetup(Type type) {
            ExceptionHandlerSetup exceptionHandlerSetup = this.setups.get(type);
            if (exceptionHandlerSetup == null) {
                ExceptionHandlerSetup exceptionHandlerSetup2 = new ExceptionHandlerSetup(type, this.this$0.exceptionSetupLabelAllocator.getNextLabel());
                this.setups.put(type, exceptionHandlerSetup2);
                return exceptionHandlerSetup2;
            }
            return exceptionHandlerSetup;
        }

        Collection<ExceptionHandlerSetup> getSetups() {
            return this.setups.values();
        }

        public CatchInfo(Ropper ropper) {
            this.this$0 = ropper;
        }
    }

    private static class ExceptionHandlerSetup {
        private Type caughtType;
        private int label;

        ExceptionHandlerSetup(Type type, int i) {
            this.caughtType = type;
            this.label = i;
        }

        Type getCaughtType() {
            return this.caughtType;
        }

        public int getLabel() {
            return this.label;
        }
    }

    private class Subroutine {
        private BitSet callerBlocks;
        private BitSet retBlocks;
        private int startBlock;
        private final Ropper this$0;

        Subroutine(Ropper ropper, int i) {
            this.this$0 = ropper;
            this.startBlock = i;
            this.retBlocks = new BitSet(this.this$0.maxLabel);
            this.callerBlocks = new BitSet(this.this$0.maxLabel);
            this.this$0.hasSubroutines = true;
        }

        Subroutine(Ropper ropper, int i, int i2) {
            this(ropper, i);
            addRetBlock(i2);
        }

        int getStartBlock() {
            return this.startBlock;
        }

        void addRetBlock(int i) {
            this.retBlocks.set(i);
        }

        void addCallerBlock(int i) {
            this.callerBlocks.set(i);
        }

        IntList getSuccessors() {
            IntList intList = new IntList(this.callerBlocks.size());
            int iNextSetBit = this.callerBlocks.nextSetBit(0);
            while (iNextSetBit >= 0) {
                intList.m7230add(this.this$0.labelToBlock(iNextSetBit).getSuccessors().m7231get(0));
                iNextSetBit = this.callerBlocks.nextSetBit(iNextSetBit + 1);
            }
            intList.setImmutable();
            return intList;
        }

        void mergeToSuccessors(Frame frame, int[] iArr) {
            int iNextSetBit = this.callerBlocks.nextSetBit(0);
            while (iNextSetBit >= 0) {
                int iM7231get = this.this$0.labelToBlock(iNextSetBit).getSuccessors().m7231get(0);
                Frame frameSubFrameForLabel = frame.subFrameForLabel(this.startBlock, iNextSetBit);
                if (frameSubFrameForLabel != null) {
                    this.this$0.mergeAndWorkAsNecessary(iM7231get, -1, (Subroutine) null, frameSubFrameForLabel, iArr);
                } else {
                    Bits.m7218set(iArr, iNextSetBit);
                }
                iNextSetBit = this.callerBlocks.nextSetBit(iNextSetBit + 1);
            }
        }
    }

    public static RopMethod convert(ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList, DexOptions dexOptions) {
        try {
            Ropper ropper = new Ropper(concreteMethod, translationAdvice, methodList, dexOptions);
            ropper.doit();
            return ropper.getRopMethod();
        } catch (SimException e) {
            e.addContext(new StringBuffer().append("...while working on method ").append(concreteMethod.getNat().toHuman()).toString());
            throw e;
        }
    }

    Ropper(ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList, DexOptions dexOptions) {
        if (concreteMethod == null) {
            throw new NullPointerException("method == null");
        }
        if (translationAdvice == null) {
            throw new NullPointerException("advice == null");
        }
        this.method = concreteMethod;
        this.blocks = BasicBlocker.identifyBlocks(concreteMethod);
        this.maxLabel = this.blocks.getMaxLabel();
        this.maxLocals = concreteMethod.getMaxLocals();
        this.machine = new RopperMachine(this, concreteMethod, translationAdvice, methodList);
        this.f5008sim = new Simulator(this.machine, concreteMethod, dexOptions);
        this.startFrames = new Frame[this.maxLabel];
        this.subroutines = new Subroutine[this.maxLabel];
        this.result = new ArrayList<>((this.blocks.size() * 2) + 10);
        this.resultSubroutines = new ArrayList<>((this.blocks.size() * 2) + 10);
        this.catchInfos = new CatchInfo[this.maxLabel];
        this.synchNeedsExceptionHandler = false;
        this.startFrames[0] = new Frame(this.maxLocals, concreteMethod.getMaxStack());
        this.exceptionSetupLabelAllocator = new ExceptionSetupLabelAllocator(this);
    }

    int getFirstTempStackReg() {
        int normalRegCount = getNormalRegCount();
        return isSynchronized() ? normalRegCount + 1 : normalRegCount;
    }

    private int getSpecialLabel(int i) {
        return this.maxLabel + this.method.getCatches().size() + (i ^ (-1));
    }

    private int getMinimumUnreservedLabel() {
        return this.maxLabel + this.method.getCatches().size() + 7;
    }

    private int getAvailableLabel() {
        int minimumUnreservedLabel = getMinimumUnreservedLabel();
        Iterator<BasicBlock> it = this.result.iterator();
        while (it.hasNext()) {
            int label = it.next().getLabel();
            if (label >= minimumUnreservedLabel) {
                minimumUnreservedLabel = label + 1;
            }
        }
        return minimumUnreservedLabel;
    }

    private boolean isSynchronized() {
        return (this.method.getAccessFlags() & 32) != 0;
    }

    private boolean isStatic() {
        return (this.method.getAccessFlags() & 8) != 0;
    }

    private int getNormalRegCount() {
        return this.maxLocals + this.method.getMaxStack();
    }

    private RegisterSpec getSynchReg() {
        int normalRegCount = getNormalRegCount();
        return RegisterSpec.make(normalRegCount >= 1 ? normalRegCount : 1, Type.OBJECT);
    }

    private int labelToResultIndex(int i) {
        int size = this.result.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.result.get(i2).getLabel() == i) {
                return i2;
            }
        }
        return -1;
    }

    public BasicBlock labelToBlock(int i) {
        int iLabelToResultIndex = labelToResultIndex(i);
        if (iLabelToResultIndex < 0) {
            throw new IllegalArgumentException(new StringBuffer().append("no such label ").append(Hex.m7225u2(i)).toString());
        }
        return this.result.get(iLabelToResultIndex);
    }

    public void addBlock(BasicBlock basicBlock, IntList intList) {
        if (basicBlock == null) {
            throw new NullPointerException("block == null");
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
    }

    private boolean addOrReplaceBlock(BasicBlock basicBlock, IntList intList) {
        boolean z;
        if (basicBlock == null) {
            throw new NullPointerException("block == null");
        }
        int iLabelToResultIndex = labelToResultIndex(basicBlock.getLabel());
        if (iLabelToResultIndex < 0) {
            z = false;
        } else {
            removeBlockAndSpecialSuccessors(iLabelToResultIndex);
            z = true;
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
        return z;
    }

    public boolean addOrReplaceBlockNoDelete(BasicBlock basicBlock, IntList intList) {
        boolean z;
        if (basicBlock == null) {
            throw new NullPointerException("block == null");
        }
        int iLabelToResultIndex = labelToResultIndex(basicBlock.getLabel());
        if (iLabelToResultIndex < 0) {
            z = false;
        } else {
            this.result.remove(iLabelToResultIndex);
            this.resultSubroutines.remove(iLabelToResultIndex);
            z = true;
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
        return z;
    }

    private void removeBlockAndSpecialSuccessors(int i) {
        int minimumUnreservedLabel = getMinimumUnreservedLabel();
        IntList successors = this.result.get(i).getSuccessors();
        int size = successors.size();
        this.result.remove(i);
        this.resultSubroutines.remove(i);
        for (int i2 = 0; i2 < size; i2++) {
            int iM7231get = successors.m7231get(i2);
            if (iM7231get >= minimumUnreservedLabel) {
                int iLabelToResultIndex = labelToResultIndex(iM7231get);
                if (iLabelToResultIndex < 0) {
                    throw new RuntimeException(new StringBuffer().append("Invalid label ").append(Hex.m7225u2(iM7231get)).toString());
                }
                removeBlockAndSpecialSuccessors(iLabelToResultIndex);
            }
        }
    }

    private RopMethod getRopMethod() {
        int size = this.result.size();
        BasicBlockList basicBlockList = new BasicBlockList(size);
        for (int i = 0; i < size; i++) {
            basicBlockList.m7182set(i, this.result.get(i));
        }
        basicBlockList.setImmutable();
        return new RopMethod(basicBlockList, getSpecialLabel(-1));
    }

    private void doit() {
        int[] iArrMakeBitSet = Bits.makeBitSet(this.maxLabel);
        Bits.m7218set(iArrMakeBitSet, 0);
        addSetupBlocks();
        setFirstFrame();
        while (true) {
            int iFindFirst = Bits.findFirst(iArrMakeBitSet, 0);
            if (iFindFirst < 0) {
                break;
            }
            Bits.clear(iArrMakeBitSet, iFindFirst);
            try {
                processBlock(this.blocks.labelToBlock(iFindFirst), this.startFrames[iFindFirst], iArrMakeBitSet);
            } catch (SimException e) {
                e.addContext(new StringBuffer().append("...while working on block ").append(Hex.m7225u2(iFindFirst)).toString());
                throw e;
            }
        }
        addReturnBlock();
        addSynchExceptionHandlerBlock();
        addExceptionSetupBlocks();
        if (this.hasSubroutines) {
            inlineSubroutines();
        }
    }

    private void setFirstFrame() {
        this.startFrames[0].initializeWithParameters(this.method.getEffectiveDescriptor().getParameterTypes());
        this.startFrames[0].setImmutable();
    }

    private void processBlock(ByteBlock byteBlock, Frame frame, int[] iArr) {
        int size;
        Subroutine subroutine;
        IntList intList;
        int i;
        IntList intListMakeImmutable;
        int iM7231get;
        IntList intList2;
        int i2;
        IntList intListMakeImmutable2;
        ByteCatchList catches = byteBlock.getCatches();
        this.machine.startBlock(catches.toRopCatchList());
        Frame frameCopy = frame.copy();
        this.f5008sim.simulate(byteBlock, frameCopy);
        frameCopy.setImmutable();
        int extraBlockCount = this.machine.getExtraBlockCount();
        ArrayList<Insn> insns = this.machine.getInsns();
        int size2 = insns.size();
        int size3 = catches.size();
        IntList successors = byteBlock.getSuccessors();
        Subroutine subroutine2 = (Subroutine) null;
        if (this.machine.hasJsr()) {
            size = 1;
            int iM7231get2 = successors.m7231get(1);
            if (this.subroutines[iM7231get2] == null) {
                this.subroutines[iM7231get2] = new Subroutine(this, iM7231get2);
            }
            this.subroutines[iM7231get2].addCallerBlock(byteBlock.getLabel());
            subroutine = this.subroutines[iM7231get2];
            intList = successors;
        } else if (this.machine.hasRet()) {
            int subroutineAddress = this.machine.getReturnAddress().getSubroutineAddress();
            if (this.subroutines[subroutineAddress] == null) {
                this.subroutines[subroutineAddress] = new Subroutine(this, subroutineAddress, byteBlock.getLabel());
            } else {
                this.subroutines[subroutineAddress].addRetBlock(byteBlock.getLabel());
            }
            IntList successors2 = this.subroutines[subroutineAddress].getSuccessors();
            this.subroutines[subroutineAddress].mergeToSuccessors(frameCopy, iArr);
            size = successors2.size();
            subroutine = subroutine2;
            intList = successors2;
        } else if (this.machine.wereCatchesUsed()) {
            subroutine = subroutine2;
            size = size3;
            intList = successors;
        } else {
            size = 0;
            subroutine = subroutine2;
            intList = successors;
        }
        int size4 = intList.size();
        for (int i3 = size; i3 < size4; i3++) {
            int iM7231get3 = intList.m7231get(i3);
            try {
                mergeAndWorkAsNecessary(iM7231get3, byteBlock.getLabel(), subroutine, frameCopy, iArr);
            } catch (SimException e) {
                e.addContext(new StringBuffer().append("...while merging to block ").append(Hex.m7225u2(iM7231get3)).toString());
                throw e;
            }
        }
        if (size4 == 0 && this.machine.returns()) {
            i = 1;
            intListMakeImmutable = IntList.makeImmutable(getSpecialLabel(-2));
        } else {
            i = size4;
            intListMakeImmutable = intList;
        }
        if (i == 0) {
            iM7231get = -1;
        } else {
            int primarySuccessorIndex = this.machine.getPrimarySuccessorIndex();
            iM7231get = primarySuccessorIndex >= 0 ? intListMakeImmutable.m7231get(primarySuccessorIndex) : primarySuccessorIndex;
        }
        boolean z = isSynchronized() && this.machine.canThrow();
        if (z || size3 != 0) {
            boolean z2 = false;
            IntList intList3 = new IntList(i);
            int i4 = 0;
            while (i4 < size3) {
                ByteCatchList.Item itemM7122get = catches.m7122get(i4);
                CstType exceptionClass = itemM7122get.getExceptionClass();
                int handlerPc = itemM7122get.getHandlerPc();
                boolean z3 = z2 | (exceptionClass == CstType.OBJECT);
                try {
                    mergeAndWorkAsNecessary(handlerPc, byteBlock.getLabel(), (Subroutine) null, frameCopy.makeExceptionHandlerStartFrame(exceptionClass), iArr);
                    CatchInfo catchInfo = this.catchInfos[handlerPc];
                    if (catchInfo == null) {
                        catchInfo = new CatchInfo(this);
                        this.catchInfos[handlerPc] = catchInfo;
                    }
                    intList3.m7230add(catchInfo.getSetup(exceptionClass.getClassType()).getLabel());
                    i4++;
                    z2 = z3;
                } catch (SimException e2) {
                    e2.addContext(new StringBuffer().append("...while merging exception to block ").append(Hex.m7225u2(handlerPc)).toString());
                    throw e2;
                }
            }
            if (z && !z2) {
                intList3.m7230add(getSpecialLabel(SYNCH_CATCH_1));
                this.synchNeedsExceptionHandler = true;
                for (int i5 = (size2 - extraBlockCount) - 1; i5 < size2; i5++) {
                    Insn insn = insns.get(i5);
                    if (insn.canThrow()) {
                        insns.set(i5, insn.withAddedCatch(Type.OBJECT));
                    }
                }
            }
            if (iM7231get >= 0) {
                intList3.m7230add(iM7231get);
            }
            intList3.setImmutable();
            intList2 = intList3;
        } else {
            intList2 = intListMakeImmutable;
        }
        int iIndexOf = intList2.indexOf(iM7231get);
        int i6 = iM7231get;
        IntList intListMutableCopy = intList2;
        int i7 = size2;
        for (int i8 = extraBlockCount; i8 > 0; i8--) {
            int i9 = i7 - 1;
            Insn insn2 = insns.get(i9);
            boolean z4 = insn2.getOpcode().getBranchingness() == 1;
            InsnList insnList = new InsnList(z4 ? 2 : 1);
            insnList.m7184set(0, insn2);
            if (z4) {
                insnList.m7184set(1, new PlainInsn(Rops.GOTO, insn2.getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
                intListMakeImmutable2 = IntList.makeImmutable(i6);
            } else {
                intListMakeImmutable2 = intListMutableCopy;
            }
            insnList.setImmutable();
            int availableLabel = getAvailableLabel();
            addBlock(new BasicBlock(availableLabel, insnList, intListMakeImmutable2, i6), frameCopy.getSubroutines());
            intListMutableCopy = intListMutableCopy.mutableCopy();
            intListMutableCopy.m7234set(iIndexOf, availableLabel);
            intListMutableCopy.setImmutable();
            i6 = availableLabel;
            i7 = i9;
        }
        Insn insn3 = i7 == 0 ? (Insn) null : insns.get(i7 - 1);
        if (insn3 == null || insn3.getOpcode().getBranchingness() == 1) {
            insns.add(new PlainInsn(Rops.GOTO, insn3 == null ? SourcePosition.NO_INFO : insn3.getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
            i2 = i7 + 1;
        } else {
            i2 = i7;
        }
        InsnList insnList2 = new InsnList(i2);
        for (int i10 = 0; i10 < i2; i10++) {
            insnList2.m7184set(i10, insns.get(i10));
        }
        insnList2.setImmutable();
        addOrReplaceBlock(new BasicBlock(byteBlock.getLabel(), insnList2, intListMutableCopy, i6), frameCopy.getSubroutines());
    }

    public void mergeAndWorkAsNecessary(int i, int i2, Subroutine subroutine, Frame frame, int[] iArr) {
        Frame frameMergeWith;
        Frame frame2 = this.startFrames[i];
        if (frame2 != null) {
            if (subroutine != null) {
                frameMergeWith = frame2.mergeWithSubroutineCaller(frame, subroutine.getStartBlock(), i2);
            } else {
                frameMergeWith = frame2.mergeWith(frame);
            }
            if (frameMergeWith != frame2) {
                this.startFrames[i] = frameMergeWith;
                Bits.m7218set(iArr, i);
                return;
            }
            return;
        }
        if (subroutine != null) {
            this.startFrames[i] = frame.makeNewSubroutineStartFrame(i, i2);
        } else {
            this.startFrames[i] = frame;
        }
        Bits.m7218set(iArr, i);
    }

    private void addSetupBlocks() {
        InsnList insnList;
        LocalVariableList localVariables = this.method.getLocalVariables();
        SourcePosition sourcePositionMakeSourcePosistion = this.method.makeSourcePosistion(0);
        StdTypeList parameterTypes = this.method.getEffectiveDescriptor().getParameterTypes();
        int size = parameterTypes.size();
        InsnList insnList2 = new InsnList(size + 1);
        int i = 0;
        int category = 0;
        while (i < size) {
            Type typeM7197get = parameterTypes.m7197get(i);
            LocalVariableList.Item itemPcAndIndexToLocal = localVariables.pcAndIndexToLocal(0, category);
            insnList2.m7184set(i, new PlainCstInsn(Rops.opMoveParam(typeM7197get), sourcePositionMakeSourcePosistion, itemPcAndIndexToLocal == null ? RegisterSpec.make(category, typeM7197get) : RegisterSpec.makeLocalOptional(category, typeM7197get, itemPcAndIndexToLocal.getLocalItem()), RegisterSpecList.EMPTY, CstInteger.make(category)));
            i++;
            category += typeM7197get.getCategory();
        }
        insnList2.m7184set(size, new PlainInsn(Rops.GOTO, sourcePositionMakeSourcePosistion, (RegisterSpec) null, RegisterSpecList.EMPTY));
        insnList2.setImmutable();
        boolean zIsSynchronized = isSynchronized();
        int specialLabel = zIsSynchronized ? getSpecialLabel(-4) : 0;
        addBlock(new BasicBlock(getSpecialLabel(-1), insnList2, IntList.makeImmutable(specialLabel), specialLabel), IntList.EMPTY);
        if (zIsSynchronized) {
            RegisterSpec synchReg = getSynchReg();
            if (isStatic()) {
                ThrowingCstInsn throwingCstInsn = new ThrowingCstInsn(Rops.CONST_OBJECT, sourcePositionMakeSourcePosistion, RegisterSpecList.EMPTY, StdTypeList.EMPTY, this.method.getDefiningClass());
                InsnList insnList3 = new InsnList(1);
                insnList3.m7184set(0, throwingCstInsn);
                insnList = insnList3;
            } else {
                InsnList insnList4 = new InsnList(2);
                insnList4.m7184set(0, new PlainCstInsn(Rops.MOVE_PARAM_OBJECT, sourcePositionMakeSourcePosistion, synchReg, RegisterSpecList.EMPTY, CstInteger.VALUE_0));
                insnList4.m7184set(1, new PlainInsn(Rops.GOTO, sourcePositionMakeSourcePosistion, (RegisterSpec) null, RegisterSpecList.EMPTY));
                insnList = insnList4;
            }
            int specialLabel2 = getSpecialLabel(SYNCH_SETUP_2);
            insnList.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList, IntList.makeImmutable(specialLabel2), specialLabel2), IntList.EMPTY);
            InsnList insnList5 = new InsnList(isStatic() ? 2 : 1);
            if (isStatic()) {
                insnList5.m7184set(0, new PlainInsn(Rops.opMoveResultPseudo(synchReg), sourcePositionMakeSourcePosistion, synchReg, RegisterSpecList.EMPTY));
            }
            insnList5.m7184set(isStatic() ? 1 : 0, new ThrowingInsn(Rops.MONITOR_ENTER, sourcePositionMakeSourcePosistion, RegisterSpecList.make(synchReg), StdTypeList.EMPTY));
            insnList5.setImmutable();
            addBlock(new BasicBlock(specialLabel2, insnList5, IntList.makeImmutable(0), 0), IntList.EMPTY);
        }
    }

    private void addReturnBlock() {
        RegisterSpecList registerSpecListMake;
        Rop returnOp = this.machine.getReturnOp();
        if (returnOp != null) {
            SourcePosition returnPosition = this.machine.getReturnPosition();
            int specialLabel = getSpecialLabel(-2);
            if (isSynchronized()) {
                InsnList insnList = new InsnList(1);
                insnList.m7184set(0, new ThrowingInsn(Rops.MONITOR_EXIT, returnPosition, RegisterSpecList.make(getSynchReg()), StdTypeList.EMPTY));
                insnList.setImmutable();
                int specialLabel2 = getSpecialLabel(-3);
                addBlock(new BasicBlock(specialLabel, insnList, IntList.makeImmutable(specialLabel2), specialLabel2), IntList.EMPTY);
                specialLabel = specialLabel2;
            }
            InsnList insnList2 = new InsnList(1);
            TypeList sources = returnOp.getSources();
            if (sources.size() == 0) {
                registerSpecListMake = RegisterSpecList.EMPTY;
            } else {
                registerSpecListMake = RegisterSpecList.make(RegisterSpec.make(0, sources.getType(0)));
            }
            insnList2.m7184set(0, new PlainInsn(returnOp, returnPosition, (RegisterSpec) null, registerSpecListMake));
            insnList2.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList2, IntList.EMPTY, -1), IntList.EMPTY);
        }
    }

    private void addSynchExceptionHandlerBlock() {
        if (this.synchNeedsExceptionHandler) {
            SourcePosition sourcePositionMakeSourcePosistion = this.method.makeSourcePosistion(0);
            RegisterSpec registerSpecMake = RegisterSpec.make(0, Type.THROWABLE);
            InsnList insnList = new InsnList(2);
            insnList.m7184set(0, new PlainInsn(Rops.opMoveException(Type.THROWABLE), sourcePositionMakeSourcePosistion, registerSpecMake, RegisterSpecList.EMPTY));
            insnList.m7184set(1, new ThrowingInsn(Rops.MONITOR_EXIT, sourcePositionMakeSourcePosistion, RegisterSpecList.make(getSynchReg()), StdTypeList.EMPTY));
            insnList.setImmutable();
            int specialLabel = getSpecialLabel(SYNCH_CATCH_2);
            addBlock(new BasicBlock(getSpecialLabel(SYNCH_CATCH_1), insnList, IntList.makeImmutable(specialLabel), specialLabel), IntList.EMPTY);
            InsnList insnList2 = new InsnList(1);
            insnList2.m7184set(0, new ThrowingInsn(Rops.THROW, sourcePositionMakeSourcePosistion, RegisterSpecList.make(registerSpecMake), StdTypeList.EMPTY));
            insnList2.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList2, IntList.EMPTY, -1), IntList.EMPTY);
        }
    }

    private void addExceptionSetupBlocks() {
        int length = this.catchInfos.length;
        for (int i = 0; i < length; i++) {
            CatchInfo catchInfo = this.catchInfos[i];
            if (catchInfo != null) {
                for (ExceptionHandlerSetup exceptionHandlerSetup : catchInfo.getSetups()) {
                    SourcePosition position = labelToBlock(i).getFirstInsn().getPosition();
                    InsnList insnList = new InsnList(2);
                    insnList.m7184set(0, new PlainInsn(Rops.opMoveException(exceptionHandlerSetup.getCaughtType()), position, RegisterSpec.make(this.maxLocals, exceptionHandlerSetup.getCaughtType()), RegisterSpecList.EMPTY));
                    insnList.m7184set(1, new PlainInsn(Rops.GOTO, position, (RegisterSpec) null, RegisterSpecList.EMPTY));
                    insnList.setImmutable();
                    addBlock(new BasicBlock(exceptionHandlerSetup.getLabel(), insnList, IntList.makeImmutable(i), i), this.startFrames[i].getSubroutines());
                }
            }
        }
    }

    public boolean isSubroutineCaller(BasicBlock basicBlock) {
        IntList successors = basicBlock.getSuccessors();
        if (successors.size() < 2) {
            return false;
        }
        int iM7231get = successors.m7231get(1);
        return iM7231get < this.subroutines.length && this.subroutines[iM7231get] != null;
    }

    private void inlineSubroutines() {
        IntList intList = new IntList(4);
        forEachNonSubBlockDepthFirst(0, new BasicBlock.Visitor(this, intList) {
            private final Ropper this$0;
            private final IntList val$reachableSubroutineCallerLabels;

            {
                this.this$0 = this;
                this.val$reachableSubroutineCallerLabels = intList;
            }

            @Override
            public void visitBlock(BasicBlock basicBlock) {
                if (this.this$0.isSubroutineCaller(basicBlock)) {
                    this.val$reachableSubroutineCallerLabels.m7230add(basicBlock.getLabel());
                }
            }
        });
        int availableLabel = getAvailableLabel();
        ArrayList arrayList = new ArrayList(availableLabel);
        for (int i = 0; i < availableLabel; i++) {
            arrayList.add((IntList) null);
        }
        for (int i2 = 0; i2 < this.result.size(); i2++) {
            BasicBlock basicBlock = this.result.get(i2);
            if (basicBlock != null) {
                arrayList.set(basicBlock.getLabel(), this.resultSubroutines.get(i2));
            }
        }
        int size = intList.size();
        for (int i3 = 0; i3 < size; i3++) {
            new SubroutineInliner(this, new LabelAllocator(getAvailableLabel()), arrayList).inlineSubroutineCalledFrom(labelToBlock(intList.m7231get(i3)));
        }
        deleteUnreachableBlocks();
    }

    private void deleteUnreachableBlocks() {
        IntList intList = new IntList(this.result.size());
        this.resultSubroutines.clear();
        forEachNonSubBlockDepthFirst(getSpecialLabel(-1), new BasicBlock.Visitor(this, intList) {
            private final Ropper this$0;
            private final IntList val$reachableLabels;

            {
                this.this$0 = this;
                this.val$reachableLabels = intList;
            }

            @Override
            public void visitBlock(BasicBlock basicBlock) {
                this.val$reachableLabels.m7230add(basicBlock.getLabel());
            }
        });
        intList.sort();
        for (int size = this.result.size() - 1; size >= 0; size--) {
            if (intList.indexOf(this.result.get(size).getLabel()) < 0) {
                this.result.remove(size);
            }
        }
    }

    private static class LabelAllocator {
        int nextAvailableLabel;

        LabelAllocator(int i) {
            this.nextAvailableLabel = i;
        }

        int getNextLabel() {
            int i = this.nextAvailableLabel;
            this.nextAvailableLabel = i + 1;
            return i;
        }
    }

    private class ExceptionSetupLabelAllocator extends LabelAllocator {
        int maxSetupLabel;
        private final Ropper this$0;

        ExceptionSetupLabelAllocator(Ropper ropper) {
            super(ropper.maxLabel);
            this.this$0 = ropper;
            this.maxSetupLabel = this.this$0.maxLabel + this.this$0.method.getCatches().size();
        }

        @Override
        int getNextLabel() {
            if (this.nextAvailableLabel >= this.maxSetupLabel) {
                throw new IndexOutOfBoundsException();
            }
            int i = this.nextAvailableLabel;
            this.nextAvailableLabel = i + 1;
            return i;
        }
    }

    private class SubroutineInliner {
        private final LabelAllocator labelAllocator;
        private final ArrayList<IntList> labelToSubroutines;
        private final HashMap<Integer, Integer> origLabelToCopiedLabel = new HashMap<>();
        private int subroutineStart;
        private int subroutineSuccessor;
        private final Ropper this$0;
        private final BitSet workList;

        SubroutineInliner(Ropper ropper, LabelAllocator labelAllocator, ArrayList<IntList> arrayList) {
            this.this$0 = ropper;
            this.workList = new BitSet(this.this$0.maxLabel);
            this.labelAllocator = labelAllocator;
            this.labelToSubroutines = arrayList;
        }

        void inlineSubroutineCalledFrom(BasicBlock basicBlock) {
            this.subroutineSuccessor = basicBlock.getSuccessors().m7231get(0);
            this.subroutineStart = basicBlock.getSuccessors().m7231get(1);
            int iMapOrAllocateLabel = mapOrAllocateLabel(this.subroutineStart);
            int iNextSetBit = this.workList.nextSetBit(0);
            while (iNextSetBit >= 0) {
                this.workList.clear(iNextSetBit);
                int iIntValue = this.origLabelToCopiedLabel.get(new Integer(iNextSetBit)).intValue();
                copyBlock(iNextSetBit, iIntValue);
                if (this.this$0.isSubroutineCaller(this.this$0.labelToBlock(iNextSetBit))) {
                    new SubroutineInliner(this.this$0, this.labelAllocator, this.labelToSubroutines).inlineSubroutineCalledFrom(this.this$0.labelToBlock(iIntValue));
                }
                iNextSetBit = this.workList.nextSetBit(0);
            }
            this.this$0.addOrReplaceBlockNoDelete(new BasicBlock(basicBlock.getLabel(), basicBlock.getInsns(), IntList.makeImmutable(iMapOrAllocateLabel), iMapOrAllocateLabel), this.labelToSubroutines.get(basicBlock.getLabel()));
        }

        private void copyBlock(int i, int i2) {
            IntList intListMakeImmutable;
            BasicBlock basicBlockLabelToBlock = this.this$0.labelToBlock(i);
            IntList successors = basicBlockLabelToBlock.getSuccessors();
            int i3 = -1;
            if (this.this$0.isSubroutineCaller(basicBlockLabelToBlock)) {
                intListMakeImmutable = IntList.makeImmutable(mapOrAllocateLabel(successors.m7231get(0)), successors.m7231get(1));
            } else {
                Subroutine subroutineSubroutineFromRetBlock = this.this$0.subroutineFromRetBlock(i);
                if (subroutineSubroutineFromRetBlock != null) {
                    if (subroutineSubroutineFromRetBlock.startBlock != this.subroutineStart) {
                        throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("ret instruction returns to label ").append(Hex.m7225u2(subroutineSubroutineFromRetBlock.startBlock)).toString()).append(" expected: ").toString()).append(Hex.m7225u2(this.subroutineStart)).toString());
                    }
                    intListMakeImmutable = IntList.makeImmutable(this.subroutineSuccessor);
                    i3 = this.subroutineSuccessor;
                } else {
                    int primarySuccessor = basicBlockLabelToBlock.getPrimarySuccessor();
                    int size = successors.size();
                    IntList intList = new IntList(size);
                    int i4 = 0;
                    while (i4 < size) {
                        int iM7231get = successors.m7231get(i4);
                        int iMapOrAllocateLabel = mapOrAllocateLabel(iM7231get);
                        intList.m7230add(iMapOrAllocateLabel);
                        if (primarySuccessor != iM7231get) {
                            iMapOrAllocateLabel = i3;
                        }
                        i4++;
                        i3 = iMapOrAllocateLabel;
                    }
                    intList.setImmutable();
                    intListMakeImmutable = intList;
                }
            }
            this.this$0.addBlock(new BasicBlock(i2, this.this$0.filterMoveReturnAddressInsns(basicBlockLabelToBlock.getInsns()), intListMakeImmutable, i3), this.labelToSubroutines.get(i2));
        }

        private boolean involvedInSubroutine(int i, int i2) {
            IntList intList = this.labelToSubroutines.get(i);
            return intList != null && intList.size() > 0 && intList.m7235top() == i2;
        }

        private int mapOrAllocateLabel(int i) {
            Integer num = this.origLabelToCopiedLabel.get(new Integer(i));
            if (num != null) {
                return num.intValue();
            }
            if (involvedInSubroutine(i, this.subroutineStart)) {
                int nextLabel = this.labelAllocator.getNextLabel();
                this.workList.set(i);
                this.origLabelToCopiedLabel.put(new Integer(i), new Integer(nextLabel));
                while (this.labelToSubroutines.size() <= nextLabel) {
                    this.labelToSubroutines.add((IntList) null);
                }
                this.labelToSubroutines.set(nextLabel, this.labelToSubroutines.get(i));
                return nextLabel;
            }
            return i;
        }
    }

    public Subroutine subroutineFromRetBlock(int i) {
        for (int length = this.subroutines.length - 1; length >= 0; length--) {
            if (this.subroutines[length] != null) {
                Subroutine subroutine = this.subroutines[length];
                if (subroutine.retBlocks.get(i)) {
                    return subroutine;
                }
            }
        }
        return (Subroutine) null;
    }

    public InsnList filterMoveReturnAddressInsns(InsnList insnList) {
        int i;
        int size = insnList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (insnList.m7183get(i3).getOpcode() != Rops.MOVE_RETURN_ADDRESS) {
                i2++;
            }
        }
        if (i2 != size) {
            InsnList insnList2 = new InsnList(i2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                Insn insnM7183get = insnList.m7183get(i4);
                if (insnM7183get.getOpcode() != Rops.MOVE_RETURN_ADDRESS) {
                    i = i5 + 1;
                    insnList2.m7184set(i5, insnM7183get);
                } else {
                    i = i5;
                }
                i4++;
                i5 = i;
            }
            insnList2.setImmutable();
            return insnList2;
        }
        return insnList;
    }

    private void forEachNonSubBlockDepthFirst(int i, BasicBlock.Visitor visitor) {
        forEachNonSubBlockDepthFirst0(labelToBlock(i), visitor, new BitSet(this.maxLabel));
    }

    private void forEachNonSubBlockDepthFirst0(BasicBlock basicBlock, BasicBlock.Visitor visitor, BitSet bitSet) {
        int iLabelToResultIndex;
        visitor.visitBlock(basicBlock);
        bitSet.set(basicBlock.getLabel());
        IntList successors = basicBlock.getSuccessors();
        int size = successors.size();
        for (int i = 0; i < size; i++) {
            int iM7231get = successors.m7231get(i);
            if (!bitSet.get(iM7231get) && ((!isSubroutineCaller(basicBlock) || i <= 0) && (iLabelToResultIndex = labelToResultIndex(iM7231get)) >= 0)) {
                forEachNonSubBlockDepthFirst0(this.result.get(iLabelToResultIndex), visitor, bitSet);
            }
        }
    }
}
