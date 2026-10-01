package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

public class SsaRenamer implements Runnable {
    private static final boolean DEBUG = false;
    private int nextSsaReg;
    private final int ropRegCount;
    private final SsaMethod ssaMeth;
    private final ArrayList<LocalItem> ssaRegToLocalItems;
    private IntList ssaRegToRopReg;
    private final RegisterSpec[][] startsForBlocks;
    private int threshold;

    public SsaRenamer(SsaMethod ssaMethod) {
        this.ropRegCount = ssaMethod.getRegCount();
        this.ssaMeth = ssaMethod;
        this.nextSsaReg = this.ropRegCount;
        this.threshold = 0;
        this.startsForBlocks = new RegisterSpec[ssaMethod.getBlocks().size()][];
        this.ssaRegToLocalItems = new ArrayList<>();
        RegisterSpec[] registerSpecArr = new RegisterSpec[this.ropRegCount];
        for (int i = 0; i < this.ropRegCount; i++) {
            registerSpecArr[i] = RegisterSpec.make(i, Type.VOID);
        }
        this.startsForBlocks[ssaMethod.getEntryBlockIndex()] = registerSpecArr;
    }

    public SsaRenamer(SsaMethod ssaMethod, int i) {
        this(ssaMethod);
        this.threshold = i;
    }

    @Override
    public void run() {
        this.ssaMeth.forEachBlockDepthFirstDom(new SsaBasicBlock.Visitor(this) {
            private final SsaRenamer this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
                new BlockRenamer(this.this$0, ssaBasicBlock).process();
            }
        });
        this.ssaMeth.setNewRegCount(this.nextSsaReg);
        this.ssaMeth.onInsnsChanged();
    }

    public static RegisterSpec[] dupArray(RegisterSpec[] registerSpecArr) {
        RegisterSpec[] registerSpecArr2 = new RegisterSpec[registerSpecArr.length];
        System.arraycopy(registerSpecArr, 0, registerSpecArr2, 0, registerSpecArr.length);
        return registerSpecArr2;
    }

    public LocalItem getLocalForNewReg(int i) {
        return i < this.ssaRegToLocalItems.size() ? this.ssaRegToLocalItems.get(i) : (LocalItem) null;
    }

    public void setNameForSsaReg(RegisterSpec registerSpec) {
        int reg = registerSpec.getReg();
        LocalItem localItem = registerSpec.getLocalItem();
        this.ssaRegToLocalItems.ensureCapacity(reg + 1);
        while (this.ssaRegToLocalItems.size() <= reg) {
            this.ssaRegToLocalItems.add((LocalItem) null);
        }
        this.ssaRegToLocalItems.set(reg, localItem);
    }

    public boolean isBelowThresholdRegister(int i) {
        return i < this.threshold;
    }

    public boolean isVersionZeroRegister(int i) {
        return i < this.ropRegCount;
    }

    public static boolean equalsHandlesNulls(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private class BlockRenamer implements SsaInsn.Visitor {
        private final SsaBasicBlock block;
        private final RegisterSpec[] currentMapping;
        private final SsaRenamer this$0;
        private final HashSet<SsaInsn> movesToKeep = new HashSet<>();
        private final HashMap<SsaInsn, SsaInsn> insnsToReplace = new HashMap<>();
        private final RenamingMapper mapper = new RenamingMapper(this);

        BlockRenamer(SsaRenamer ssaRenamer, SsaBasicBlock ssaBasicBlock) {
            this.this$0 = ssaRenamer;
            this.block = ssaBasicBlock;
            this.currentMapping = this.this$0.startsForBlocks[ssaBasicBlock.getIndex()];
            this.this$0.startsForBlocks[ssaBasicBlock.getIndex()] = (RegisterSpec[]) null;
        }

        private class RenamingMapper extends RegisterMapper {
            private final BlockRenamer this$0;

            public RenamingMapper(BlockRenamer blockRenamer) {
                this.this$0 = blockRenamer;
            }

            @Override
            public int getNewRegisterCount() {
                return this.this$0.this$0.nextSsaReg;
            }

            @Override
            public RegisterSpec mo7199map(RegisterSpec registerSpec) {
                if (registerSpec == null) {
                    return (RegisterSpec) null;
                }
                return registerSpec.withReg(this.this$0.currentMapping[registerSpec.getReg()].getReg());
            }
        }

        public void process() {
            this.block.forEachInsn(this);
            updateSuccessorPhis();
            ArrayList<SsaInsn> insns = this.block.getInsns();
            for (int size = insns.size() - 1; size >= 0; size--) {
                SsaInsn ssaInsn = insns.get(size);
                SsaInsn ssaInsn2 = this.insnsToReplace.get(ssaInsn);
                if (ssaInsn2 != null) {
                    insns.set(size, ssaInsn2);
                } else if (ssaInsn.isNormalMoveInsn() && !this.movesToKeep.contains(ssaInsn)) {
                    insns.remove(size);
                }
            }
            boolean z = true;
            for (SsaBasicBlock ssaBasicBlock : this.block.getDomChildren()) {
                if (ssaBasicBlock != this.block) {
                    this.this$0.startsForBlocks[ssaBasicBlock.getIndex()] = z ? this.currentMapping : SsaRenamer.dupArray(this.currentMapping);
                    z = false;
                }
            }
        }

        private void addMapping(int i, RegisterSpec registerSpec) {
            int reg = registerSpec.getReg();
            LocalItem localItem = registerSpec.getLocalItem();
            this.currentMapping[i] = registerSpec;
            for (int length = this.currentMapping.length - 1; length >= 0; length--) {
                if (reg == this.currentMapping[length].getReg()) {
                    this.currentMapping[length] = registerSpec;
                }
            }
            if (localItem != null) {
                this.this$0.setNameForSsaReg(registerSpec);
                for (int length2 = this.currentMapping.length - 1; length2 >= 0; length2--) {
                    RegisterSpec registerSpec2 = this.currentMapping[length2];
                    if (reg != registerSpec2.getReg() && localItem.equals(registerSpec2.getLocalItem())) {
                        this.currentMapping[length2] = registerSpec2.withLocalItem((LocalItem) null);
                    }
                }
            }
        }

        @Override
        public void visitPhiInsn(PhiInsn phiInsn) {
            processResultReg(phiInsn);
        }

        @Override
        public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            RegisterSpec result = normalSsaInsn.getResult();
            int reg = result.getReg();
            int reg2 = normalSsaInsn.getSources().m7188get(0).getReg();
            normalSsaInsn.mapSourceRegisters(this.mapper);
            int reg3 = normalSsaInsn.getSources().m7188get(0).getReg();
            LocalItem localItem = this.currentMapping[reg2].getLocalItem();
            LocalItem localItem2 = result.getLocalItem();
            if (localItem2 == null) {
                localItem2 = localItem;
            }
            LocalItem localForNewReg = this.this$0.getLocalForNewReg(reg3);
            boolean z = localForNewReg == null || localItem2 == null || localItem2.equals(localForNewReg);
            RegisterSpec registerSpecMakeLocalOptional = RegisterSpec.makeLocalOptional(reg3, result.getType(), localItem2);
            if (!Optimizer.getPreserveLocals() || (z && SsaRenamer.equalsHandlesNulls(localItem2, localItem) && this.this$0.threshold == 0)) {
                addMapping(reg, registerSpecMakeLocalOptional);
                return;
            }
            if (z && localItem == null && this.this$0.threshold == 0) {
                this.insnsToReplace.put(normalSsaInsn, SsaInsn.makeFromRop(new PlainInsn(Rops.opMarkLocal(registerSpecMakeLocalOptional), SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.make(RegisterSpec.make(registerSpecMakeLocalOptional.getReg(), registerSpecMakeLocalOptional.getType(), localItem2))), this.block));
                addMapping(reg, registerSpecMakeLocalOptional);
            } else {
                processResultReg(normalSsaInsn);
                this.movesToKeep.add(normalSsaInsn);
            }
        }

        @Override
        public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
            normalSsaInsn.mapSourceRegisters(this.mapper);
            processResultReg(normalSsaInsn);
        }

        void processResultReg(SsaInsn ssaInsn) {
            RegisterSpec result = ssaInsn.getResult();
            if (result != null) {
                int reg = result.getReg();
                if (!this.this$0.isBelowThresholdRegister(reg)) {
                    ssaInsn.changeResultReg(this.this$0.nextSsaReg);
                    addMapping(reg, ssaInsn.getResult());
                    this.this$0.nextSsaReg++;
                }
            }
        }

        private void updateSuccessorPhis() {
            PhiInsn.Visitor visitor = new PhiInsn.Visitor(this) {
                private final BlockRenamer this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void visitPhiInsn(PhiInsn phiInsn) {
                    int ropResultReg = phiInsn.getRopResultReg();
                    if (!this.this$0.this$0.isBelowThresholdRegister(ropResultReg)) {
                        RegisterSpec registerSpec = this.this$0.currentMapping[ropResultReg];
                        if (!this.this$0.this$0.isVersionZeroRegister(registerSpec.getReg())) {
                            phiInsn.addPhiOperand(registerSpec, this.this$0.block);
                        }
                    }
                }
            };
            BitSet successors = this.block.getSuccessors();
            for (int iNextSetBit = successors.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = successors.nextSetBit(iNextSetBit + 1)) {
                this.this$0.ssaMeth.getBlocks().get(iNextSetBit).forEachPhiInsn(visitor);
            }
        }
    }
}
