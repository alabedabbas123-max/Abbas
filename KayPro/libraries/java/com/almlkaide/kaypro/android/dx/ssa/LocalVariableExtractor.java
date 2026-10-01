package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecSet;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;

public class LocalVariableExtractor {
    private final ArrayList<SsaBasicBlock> blocks;
    private final SsaMethod method;
    private final LocalVariableInfo resultInfo;
    private final BitSet workSet;

    public static LocalVariableInfo extract(SsaMethod ssaMethod) {
        return new LocalVariableExtractor(ssaMethod).doit();
    }

    LocalVariableExtractor(SsaMethod ssaMethod) {
        if (ssaMethod == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
        this.method = ssaMethod;
        this.blocks = blocks;
        this.resultInfo = new LocalVariableInfo(ssaMethod);
        this.workSet = new BitSet(blocks.size());
    }

    private LocalVariableInfo doit() {
        if (this.method.getRegCount() > 0) {
            int entryBlockIndex = this.method.getEntryBlockIndex();
            while (entryBlockIndex >= 0) {
                this.workSet.clear(entryBlockIndex);
                processBlock(entryBlockIndex);
                entryBlockIndex = this.workSet.nextSetBit(0);
            }
        }
        this.resultInfo.setImmutable();
        return this.resultInfo;
    }

    private void processBlock(int i) {
        RegisterSpecSet registerSpecSetMutableCopy;
        RegisterSpecSet registerSpecSetMutableCopyOfStarts = this.resultInfo.mutableCopyOfStarts(i);
        SsaBasicBlock ssaBasicBlock = this.blocks.get(i);
        ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
        int size = insns.size();
        if (i != this.method.getExitBlockIndex()) {
            SsaInsn ssaInsn = insns.get(size - 1);
            boolean z = (ssaInsn.getOriginalRopInsn().getCatches().size() != 0) && ssaInsn.getResult() != null;
            int i2 = size - 1;
            int i3 = 0;
            RegisterSpecSet registerSpecSet = registerSpecSetMutableCopyOfStarts;
            while (i3 < size) {
                if (z && i3 == i2) {
                    registerSpecSet.setImmutable();
                    registerSpecSetMutableCopy = registerSpecSet.mutableCopy();
                } else {
                    registerSpecSetMutableCopy = registerSpecSet;
                }
                SsaInsn ssaInsn2 = insns.get(i3);
                RegisterSpec localAssignment = ssaInsn2.getLocalAssignment();
                if (localAssignment == null) {
                    RegisterSpec result = ssaInsn2.getResult();
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
                        this.resultInfo.addAssignment(ssaInsn2, registerSpecWithSimpleType);
                        registerSpecSetMutableCopy.m7192put(registerSpecWithSimpleType);
                    }
                }
                i3++;
                registerSpecSet = registerSpecSetMutableCopy;
            }
            registerSpecSet.setImmutable();
            IntList successorList = ssaBasicBlock.getSuccessorList();
            int size2 = successorList.size();
            int primarySuccessorIndex = ssaBasicBlock.getPrimarySuccessorIndex();
            for (int i4 = 0; i4 < size2; i4++) {
                int iM7231get = successorList.m7231get(i4);
                if (this.resultInfo.mergeStarts(iM7231get, iM7231get == primarySuccessorIndex ? registerSpecSet : registerSpecSetMutableCopyOfStarts)) {
                    this.workSet.set(iM7231get);
                }
            }
        }
    }
}
