package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.util.IntSet;
import java.util.ArrayList;
import java.util.BitSet;

public class DomFront {
    private static final boolean DEBUG = false;
    private final DomInfo[] domInfos;
    private final SsaMethod meth;
    private final ArrayList<SsaBasicBlock> nodes;

    public static class DomInfo {
        public IntSet dominanceFrontiers;
        public int idom = -1;
    }

    public DomFront(SsaMethod ssaMethod) {
        this.meth = ssaMethod;
        this.nodes = ssaMethod.getBlocks();
        int size = this.nodes.size();
        this.domInfos = new DomInfo[size];
        for (int i = 0; i < size; i++) {
            this.domInfos[i] = new DomInfo();
        }
    }

    public DomInfo[] m7202run() {
        int size = this.nodes.size();
        Dominators.make(this.meth, this.domInfos, false);
        buildDomTree();
        for (int i = 0; i < size; i++) {
            this.domInfos[i].dominanceFrontiers = SetFactory.makeDomFrontSet(size);
        }
        calcDomFronts();
        return this.domInfos;
    }

    private void debugPrintDomChildren() {
        int size = this.nodes.size();
        for (int i = 0; i < size; i++) {
            SsaBasicBlock ssaBasicBlock = this.nodes.get(i);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('{');
            boolean z = false;
            for (SsaBasicBlock ssaBasicBlock2 : ssaBasicBlock.getDomChildren()) {
                if (z) {
                    stringBuffer.append(',');
                }
                stringBuffer.append(ssaBasicBlock2);
                z = true;
            }
            stringBuffer.append('}');
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("domChildren[").append(ssaBasicBlock).toString()).append("]: ").toString()).append((Object) stringBuffer).toString());
        }
    }

    private void buildDomTree() {
        int size = this.nodes.size();
        for (int i = 0; i < size; i++) {
            DomInfo domInfo = this.domInfos[i];
            if (domInfo.idom != -1) {
                this.nodes.get(domInfo.idom).addDomChild(this.nodes.get(i));
            }
        }
    }

    private void calcDomFronts() {
        int size = this.nodes.size();
        for (int i = 0; i < size; i++) {
            SsaBasicBlock ssaBasicBlock = this.nodes.get(i);
            DomInfo domInfo = this.domInfos[i];
            BitSet predecessors = ssaBasicBlock.getPredecessors();
            if (predecessors.cardinality() > 1) {
                for (int iNextSetBit = predecessors.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = predecessors.nextSetBit(iNextSetBit + 1)) {
                    int i2 = iNextSetBit;
                    while (i2 != domInfo.idom && i2 != -1) {
                        DomInfo domInfo2 = this.domInfos[i2];
                        if (domInfo2.dominanceFrontiers.mo7215has(i)) {
                            break;
                        }
                        domInfo2.dominanceFrontiers.mo7214add(i);
                        i2 = domInfo2.idom;
                    }
                }
            }
        }
    }
}
