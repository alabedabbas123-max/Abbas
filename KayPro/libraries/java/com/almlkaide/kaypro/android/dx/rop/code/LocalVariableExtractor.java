package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.util.Bits;
import com.almlkaide.kaypro.android.dx.util.IntList;

public final class LocalVariableExtractor {
    private final BasicBlockList blocks;
    private final RopMethod method;
    private final LocalVariableInfo resultInfo;
    private final int[] workSet;

    public static LocalVariableInfo extract(RopMethod ropMethod) {
        return new LocalVariableExtractor(ropMethod).doit();
    }

    LocalVariableExtractor(RopMethod ropMethod) {
        if (ropMethod == null) {
            throw new NullPointerException("method == null");
        }
        BasicBlockList blocks = ropMethod.getBlocks();
        int maxLabel = blocks.getMaxLabel();
        this.method = ropMethod;
        this.blocks = blocks;
        this.resultInfo = new LocalVariableInfo(ropMethod);
        this.workSet = Bits.makeBitSet(maxLabel);
    }

    private LocalVariableInfo doit() {
        int firstLabel = this.method.getFirstLabel();
        while (firstLabel >= 0) {
            Bits.clear(this.workSet, firstLabel);
            processBlock(firstLabel);
            firstLabel = Bits.findFirst(this.workSet, 0);
        }
        this.resultInfo.setImmutable();
        return this.resultInfo;
    }

    private void processBlock(int i) {
        RegisterSpecSet registerSpecSetMutableCopyOfStarts = this.resultInfo.mutableCopyOfStarts(i);
        BasicBlock basicBlockLabelToBlock = this.blocks.labelToBlock(i);
        InsnList insns = basicBlockLabelToBlock.getInsns();
        int size = insns.size();
        boolean z = basicBlockLabelToBlock.hasExceptionHandlers() && insns.getLast().getResult() != null;
        int i2 = size - 1;
        RegisterSpecSet registerSpecSetMutableCopy = registerSpecSetMutableCopyOfStarts;
        for (int i3 = 0; i3 < size; i3++) {
            if (z && i3 == i2) {
                registerSpecSetMutableCopy.setImmutable();
                registerSpecSetMutableCopy = registerSpecSetMutableCopy.mutableCopy();
            }
            Insn insnM7183get = insns.m7183get(i3);
            RegisterSpec localAssignment = insnM7183get.getLocalAssignment();
            if (localAssignment == null) {
                RegisterSpec result = insnM7183get.getResult();
                if (result != null && registerSpecSetMutableCopy.m7190get(result.getReg()) != null) {
                    registerSpecSetMutableCopy.remove(registerSpecSetMutableCopy.m7190get(result.getReg()));
                }
            } else {
                RegisterSpec registerSpecWithSimpleType = localAssignment.withSimpleType();
                if (!registerSpecWithSimpleType.equals(registerSpecSetMutableCopy.m7191get(registerSpecWithSimpleType))) {
                    RegisterSpec registerSpecLocalItemToSpec = registerSpecSetMutableCopy.localItemToSpec(registerSpecWithSimpleType.getLocalItem());
                    if (registerSpecLocalItemToSpec != null && registerSpecLocalItemToSpec.getReg() != registerSpecWithSimpleType.getReg()) {
                        registerSpecSetMutableCopy.remove(registerSpecLocalItemToSpec);
                    }
                    this.resultInfo.addAssignment(insnM7183get, registerSpecWithSimpleType);
                    registerSpecSetMutableCopy.m7192put(registerSpecWithSimpleType);
                }
            }
        }
        registerSpecSetMutableCopy.setImmutable();
        IntList successors = basicBlockLabelToBlock.getSuccessors();
        int size2 = successors.size();
        int primarySuccessor = basicBlockLabelToBlock.getPrimarySuccessor();
        for (int i4 = 0; i4 < size2; i4++) {
            int iM7231get = successors.m7231get(i4);
            if (this.resultInfo.mergeStarts(iM7231get, iM7231get == primarySuccessor ? registerSpecSetMutableCopy : registerSpecSetMutableCopyOfStarts)) {
                Bits.m7218set(this.workSet, iM7231get);
            }
        }
    }
}
