package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInvokeDynamic;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMemberRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Bits;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;

public final class BasicBlocker implements BytecodeArray.Visitor {
    private final int[] blockSet;
    private final ByteCatchList[] catchLists;
    private final int[] liveSet;
    private final ConcreteMethod method;
    private int previousOffset;
    private final IntList[] targetLists;
    private final int[] workSet;

    public static ByteBlockList identifyBlocks(ConcreteMethod concreteMethod) {
        BasicBlocker basicBlocker = new BasicBlocker(concreteMethod);
        basicBlocker.doit();
        return basicBlocker.getBlockList();
    }

    BasicBlocker(ConcreteMethod concreteMethod) {
        if (concreteMethod == null) {
            throw new NullPointerException("method == null");
        }
        this.method = concreteMethod;
        int size = concreteMethod.getCode().size() + 1;
        this.workSet = Bits.makeBitSet(size);
        this.liveSet = Bits.makeBitSet(size);
        this.blockSet = Bits.makeBitSet(size);
        this.targetLists = new IntList[size];
        this.catchLists = new ByteCatchList[size];
        this.previousOffset = -1;
    }

    @Override
    public void visitInvalid(int i, int i2, int i3) {
        visitCommon(i2, i3, true);
    }

    @Override
    public void visitNoArgs(int i, int i2, int i3, Type type) {
        switch (i) {
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 190:
            case 194:
            case 195:
                visitCommon(i2, i3, true);
                visitThrowing(i2, i3, true);
                break;
            case 108:
            case 112:
                visitCommon(i2, i3, true);
                if (type == Type.f5078INT || type == Type.LONG) {
                    visitThrowing(i2, i3, true);
                }
                break;
            case 172:
            case 177:
                visitCommon(i2, i3, false);
                this.targetLists[i2] = IntList.EMPTY;
                break;
            case 191:
                visitCommon(i2, i3, false);
                visitThrowing(i2, i3, false);
                break;
            default:
                visitCommon(i2, i3, true);
                break;
        }
    }

    @Override
    public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
        if (i == 169) {
            visitCommon(i2, i3, false);
            this.targetLists[i2] = IntList.EMPTY;
        } else {
            visitCommon(i2, i3, true);
        }
    }

    @Override
    public void visitConstant(int i, int i2, int i3, Constant constant, int i4) {
        visitCommon(i2, i3, true);
        if ((constant instanceof CstMemberRef) || (constant instanceof CstType) || (constant instanceof CstString) || (constant instanceof CstInvokeDynamic) || (constant instanceof CstMethodHandle) || (constant instanceof CstProtoRef)) {
            visitThrowing(i2, i3, true);
        }
    }

    @Override
    public void visitBranch(int i, int i2, int i3, int i4) {
        switch (i) {
            case 167:
                visitCommon(i2, i3, false);
                this.targetLists[i2] = IntList.makeImmutable(i4);
                break;
            case 168:
                addWorkIfNecessary(i2, true);
            default:
                int i5 = i2 + i3;
                visitCommon(i2, i3, true);
                addWorkIfNecessary(i5, true);
                this.targetLists[i2] = IntList.makeImmutable(i5, i4);
                break;
        }
        addWorkIfNecessary(i4, true);
    }

    @Override
    public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
        visitCommon(i2, i3, false);
        addWorkIfNecessary(switchList.getDefaultTarget(), true);
        int size = switchList.size();
        for (int i5 = 0; i5 < size; i5++) {
            addWorkIfNecessary(switchList.getTarget(i5), true);
        }
        this.targetLists[i2] = switchList.getTargets();
    }

    @Override
    public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
        visitCommon(i, i2, true);
        visitThrowing(i, i2, true);
    }

    private ByteBlockList getBlockList() {
        int i;
        int i2;
        ByteCatchList byteCatchList;
        ByteBlock[] byteBlockArr = new ByteBlock[this.method.getCode().size()];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iFindFirst = Bits.findFirst(this.blockSet, i3 + 1);
            if (iFindFirst < 0) {
                break;
            }
            if (Bits.m7216get(this.liveSet, i3)) {
                int i5 = iFindFirst - 1;
                IntList intListMakeImmutable = (IntList) null;
                while (true) {
                    if (i5 < i3) {
                        i2 = -1;
                        break;
                    }
                    intListMakeImmutable = this.targetLists[i5];
                    if (intListMakeImmutable != null) {
                        i2 = i5;
                        break;
                    }
                    i5--;
                }
                if (intListMakeImmutable == null) {
                    intListMakeImmutable = IntList.makeImmutable(iFindFirst);
                    byteCatchList = ByteCatchList.EMPTY;
                } else {
                    byteCatchList = this.catchLists[i2];
                    if (byteCatchList == null) {
                        byteCatchList = ByteCatchList.EMPTY;
                    }
                }
                byteBlockArr[i4] = new ByteBlock(i3, i3, iFindFirst, intListMakeImmutable, byteCatchList);
                i = i4 + 1;
            } else {
                i = i4;
            }
            i3 = iFindFirst;
            i4 = i;
        }
        ByteBlockList byteBlockList = new ByteBlockList(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            byteBlockList.m7121set(i6, byteBlockArr[i6]);
        }
        return byteBlockList;
    }

    private void doit() {
        BytecodeArray code = this.method.getCode();
        ByteCatchList catches = this.method.getCatches();
        int size = catches.size();
        Bits.m7218set(this.workSet, 0);
        Bits.m7218set(this.blockSet, 0);
        while (!Bits.isEmpty(this.workSet)) {
            try {
                code.processWorkSet(this.workSet, this);
                for (int i = 0; i < size; i++) {
                    ByteCatchList.Item itemM7122get = catches.m7122get(i);
                    int startPc = itemM7122get.getStartPc();
                    int endPc = itemM7122get.getEndPc();
                    if (Bits.anyInRange(this.liveSet, startPc, endPc)) {
                        Bits.m7218set(this.blockSet, startPc);
                        Bits.m7218set(this.blockSet, endPc);
                        addWorkIfNecessary(itemM7122get.getHandlerPc(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new SimException(new StringBuffer().append("flow of control falls off ").append("end of method").toString(), e);
            }
        }
    }

    private void addWorkIfNecessary(int i, boolean z) {
        if (!Bits.m7216get(this.liveSet, i)) {
            Bits.m7218set(this.workSet, i);
        }
        if (z) {
            Bits.m7218set(this.blockSet, i);
        }
    }

    private void visitCommon(int i, int i2, boolean z) {
        Bits.m7218set(this.liveSet, i);
        if (z) {
            addWorkIfNecessary(i + i2, false);
        } else {
            Bits.m7218set(this.blockSet, i + i2);
        }
    }

    private void visitThrowing(int i, int i2, boolean z) {
        int i3 = i + i2;
        if (z) {
            addWorkIfNecessary(i3, true);
        }
        ByteCatchList byteCatchListListFor = this.method.getCatches().listFor(i);
        this.catchLists[i] = byteCatchListListFor;
        IntList[] intListArr = this.targetLists;
        if (!z) {
            i3 = -1;
        }
        intListArr[i] = byteCatchListListFor.toTargetList(i3);
    }

    @Override
    public void setPreviousOffset(int i) {
        this.previousOffset = i;
    }

    @Override
    public int getPreviousOffset() {
        return this.previousOffset;
    }
}
