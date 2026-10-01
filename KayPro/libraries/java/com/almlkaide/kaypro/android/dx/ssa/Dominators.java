package com.almlkaide.kaypro.android.dx.ssa;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

public final class Dominators {
    private final ArrayList<SsaBasicBlock> blocks;
    private final DomFront.DomInfo[] domInfos;
    private final DFSInfo[] info;
    private final SsaMethod meth;
    private final boolean postdom;
    private final ArrayList<SsaBasicBlock> vertex = new ArrayList<>();

    private static final class DFSInfo {
        public SsaBasicBlock ancestor;
        public ArrayList<SsaBasicBlock> bucket = new ArrayList<>();
        public SsaBasicBlock parent;

        public SsaBasicBlock f5079rep;
        public int semidom;
    }

    Dominators(SsaMethod ssaMethod, DomFront.DomInfo[] domInfoArr, boolean z) {
        this.meth = ssaMethod;
        this.domInfos = domInfoArr;
        this.postdom = z;
        this.blocks = ssaMethod.getBlocks();
        this.info = new DFSInfo[this.blocks.size() + 2];
    }

    public static Dominators make(SsaMethod ssaMethod, DomFront.DomInfo[] domInfoArr, boolean z) {
        Dominators dominators = new Dominators(ssaMethod, domInfoArr, z);
        dominators.m7203run();
        return dominators;
    }

    private BitSet getSuccs(SsaBasicBlock ssaBasicBlock) {
        return this.postdom ? ssaBasicBlock.getPredecessors() : ssaBasicBlock.getSuccessors();
    }

    private BitSet getPreds(SsaBasicBlock ssaBasicBlock) {
        return this.postdom ? ssaBasicBlock.getSuccessors() : ssaBasicBlock.getPredecessors();
    }

    private void compress(SsaBasicBlock ssaBasicBlock) {
        if (this.info[this.info[ssaBasicBlock.getIndex()].ancestor.getIndex()].ancestor != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(ssaBasicBlock);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size();
                DFSInfo dFSInfo = this.info[((SsaBasicBlock) arrayList.get(size - 1)).getIndex()];
                SsaBasicBlock ssaBasicBlock2 = dFSInfo.ancestor;
                DFSInfo dFSInfo2 = this.info[ssaBasicBlock2.getIndex()];
                if (hashSet.add(ssaBasicBlock2) && dFSInfo2.ancestor != null) {
                    arrayList.add(ssaBasicBlock2);
                } else {
                    arrayList.remove(size - 1);
                    if (dFSInfo2.ancestor != null) {
                        SsaBasicBlock ssaBasicBlock3 = dFSInfo2.f5079rep;
                        if (this.info[ssaBasicBlock3.getIndex()].semidom < this.info[dFSInfo.f5079rep.getIndex()].semidom) {
                            dFSInfo.f5079rep = ssaBasicBlock3;
                        }
                        dFSInfo.ancestor = dFSInfo2.ancestor;
                    }
                }
            }
        }
    }

    private SsaBasicBlock eval(SsaBasicBlock ssaBasicBlock) {
        DFSInfo dFSInfo = this.info[ssaBasicBlock.getIndex()];
        if (dFSInfo.ancestor != null) {
            compress(ssaBasicBlock);
            return dFSInfo.f5079rep;
        }
        return ssaBasicBlock;
    }

    private void m7203run() {
        int i;
        SsaBasicBlock exitBlock = this.postdom ? this.meth.getExitBlock() : this.meth.getEntryBlock();
        if (exitBlock != null) {
            this.vertex.add(exitBlock);
            this.domInfos[exitBlock.getIndex()].idom = exitBlock.getIndex();
        }
        this.meth.forEachBlockDepthFirst(this.postdom, new DfsWalker(this));
        int size = this.vertex.size() - 1;
        for (int i2 = size; i2 >= 2; i2--) {
            SsaBasicBlock ssaBasicBlock = this.vertex.get(i2);
            DFSInfo dFSInfo = this.info[ssaBasicBlock.getIndex()];
            BitSet preds = getPreds(ssaBasicBlock);
            for (int iNextSetBit = preds.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = preds.nextSetBit(iNextSetBit + 1)) {
                SsaBasicBlock ssaBasicBlock2 = this.blocks.get(iNextSetBit);
                if (this.info[ssaBasicBlock2.getIndex()] != null && (i = this.info[eval(ssaBasicBlock2).getIndex()].semidom) < dFSInfo.semidom) {
                    dFSInfo.semidom = i;
                }
            }
            this.info[this.vertex.get(dFSInfo.semidom).getIndex()].bucket.add(ssaBasicBlock);
            dFSInfo.ancestor = dFSInfo.parent;
            ArrayList<SsaBasicBlock> arrayList = this.info[dFSInfo.parent.getIndex()].bucket;
            while (!arrayList.isEmpty()) {
                SsaBasicBlock ssaBasicBlockRemove = arrayList.remove(arrayList.size() - 1);
                SsaBasicBlock ssaBasicBlockEval = eval(ssaBasicBlockRemove);
                if (this.info[ssaBasicBlockEval.getIndex()].semidom < this.info[ssaBasicBlockRemove.getIndex()].semidom) {
                    this.domInfos[ssaBasicBlockRemove.getIndex()].idom = ssaBasicBlockEval.getIndex();
                } else {
                    this.domInfos[ssaBasicBlockRemove.getIndex()].idom = dFSInfo.parent.getIndex();
                }
            }
        }
        for (int i3 = 2; i3 <= size; i3++) {
            SsaBasicBlock ssaBasicBlock3 = this.vertex.get(i3);
            if (this.domInfos[ssaBasicBlock3.getIndex()].idom != this.vertex.get(this.info[ssaBasicBlock3.getIndex()].semidom).getIndex()) {
                this.domInfos[ssaBasicBlock3.getIndex()].idom = this.domInfos[this.domInfos[ssaBasicBlock3.getIndex()].idom].idom;
            }
        }
    }

    private class DfsWalker implements SsaBasicBlock.Visitor {
        private int dfsNum = 0;
        private final Dominators this$0;

        @Override
        public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
            DFSInfo dFSInfo = new DFSInfo();
            int i = this.dfsNum + 1;
            this.dfsNum = i;
            dFSInfo.semidom = i;
            dFSInfo.f5079rep = ssaBasicBlock;
            dFSInfo.parent = ssaBasicBlock2;
            this.this$0.vertex.add(ssaBasicBlock);
            this.this$0.info[ssaBasicBlock.getIndex()] = dFSInfo;
        }

        public DfsWalker(Dominators dominators) {
            this.this$0 = dominators;
        }
    }
}
