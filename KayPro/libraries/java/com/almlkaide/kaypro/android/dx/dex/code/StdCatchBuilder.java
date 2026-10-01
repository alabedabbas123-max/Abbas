package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.HashSet;

public final class StdCatchBuilder implements CatchBuilder {
    private static final int MAX_CATCH_RANGE = 65535;
    private final BlockAddresses addresses;
    private final RopMethod method;
    private final int[] order;

    public StdCatchBuilder(RopMethod ropMethod, int[] iArr, BlockAddresses blockAddresses) {
        if (ropMethod == null) {
            throw new NullPointerException("method == null");
        }
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (blockAddresses == null) {
            throw new NullPointerException("addresses == null");
        }
        this.method = ropMethod;
        this.order = iArr;
        this.addresses = blockAddresses;
    }

    @Override
    public CatchTable build() {
        return build(this.method, this.order, this.addresses);
    }

    @Override
    public boolean hasAnyCatches() {
        BasicBlockList blocks = this.method.getBlocks();
        int size = blocks.size();
        for (int i = 0; i < size; i++) {
            if (blocks.m7181get(i).getLastInsn().getCatches().size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public HashSet<Type> getCatchTypes() {
        HashSet<Type> hashSet = new HashSet<>(20);
        BasicBlockList blocks = this.method.getBlocks();
        int size = blocks.size();
        for (int i = 0; i < size; i++) {
            TypeList catches = blocks.m7181get(i).getLastInsn().getCatches();
            int size2 = catches.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(catches.getType(i2));
            }
        }
        return hashSet;
    }

    public static CatchTable build(RopMethod ropMethod, int[] iArr, BlockAddresses blockAddresses) {
        BasicBlock basicBlock;
        int length = iArr.length;
        BasicBlockList blocks = ropMethod.getBlocks();
        ArrayList arrayList = new ArrayList(length);
        CatchHandlerList catchHandlerList = CatchHandlerList.EMPTY;
        BasicBlock basicBlock2 = (BasicBlock) null;
        int i = 0;
        BasicBlock basicBlock3 = (BasicBlock) null;
        while (i < length) {
            BasicBlock basicBlockLabelToBlock = blocks.labelToBlock(iArr[i]);
            if (basicBlockLabelToBlock.canThrow()) {
                CatchHandlerList catchHandlerListHandlersFor = handlersFor(basicBlockLabelToBlock, blockAddresses);
                if (catchHandlerList.size() == 0) {
                    basicBlock = basicBlockLabelToBlock;
                    basicBlock3 = basicBlockLabelToBlock;
                    catchHandlerList = catchHandlerListHandlersFor;
                } else if (catchHandlerList.equals(catchHandlerListHandlersFor) && rangeIsValid(basicBlock3, basicBlockLabelToBlock, blockAddresses)) {
                    basicBlock = basicBlockLabelToBlock;
                } else {
                    if (catchHandlerList.size() != 0) {
                        arrayList.add(makeEntry(basicBlock3, basicBlock2, catchHandlerList, blockAddresses));
                    }
                    basicBlock = basicBlockLabelToBlock;
                    basicBlock3 = basicBlockLabelToBlock;
                    catchHandlerList = catchHandlerListHandlersFor;
                }
            } else {
                basicBlock = basicBlock2;
            }
            i++;
            basicBlock2 = basicBlock;
        }
        if (catchHandlerList.size() != 0) {
            arrayList.add(makeEntry(basicBlock3, basicBlock2, catchHandlerList, blockAddresses));
        }
        int size = arrayList.size();
        if (size == 0) {
            return CatchTable.EMPTY;
        }
        CatchTable catchTable = new CatchTable(size);
        for (int i2 = 0; i2 < size; i2++) {
            catchTable.m7151set(i2, (CatchTable.Entry) arrayList.get(i2));
        }
        catchTable.setImmutable();
        return catchTable;
    }

    private static CatchHandlerList handlersFor(BasicBlock basicBlock, BlockAddresses blockAddresses) {
        IntList successors = basicBlock.getSuccessors();
        int size = successors.size();
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        TypeList catches = basicBlock.getLastInsn().getCatches();
        int size2 = catches.size();
        if (size2 == 0) {
            return CatchHandlerList.EMPTY;
        }
        if ((primarySuccessor == -1 && size != size2) || (primarySuccessor != -1 && (size != size2 + 1 || primarySuccessor != successors.m7231get(size2)))) {
            throw new RuntimeException("shouldn't happen: weird successors list");
        }
        for (int i = 0; i < size2; i++) {
            if (catches.getType(i).equals(Type.OBJECT)) {
                size2 = i + 1;
                break;
            }
        }
        CatchHandlerList catchHandlerList = new CatchHandlerList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            catchHandlerList.m7149set(i2, new CstType(catches.getType(i2)), blockAddresses.getStart(successors.m7231get(i2)).getAddress());
        }
        catchHandlerList.setImmutable();
        return catchHandlerList;
    }

    private static CatchTable.Entry makeEntry(BasicBlock basicBlock, BasicBlock basicBlock2, CatchHandlerList catchHandlerList, BlockAddresses blockAddresses) {
        return new CatchTable.Entry(blockAddresses.getLast(basicBlock).getAddress(), blockAddresses.getEnd(basicBlock2).getAddress(), catchHandlerList);
    }

    private static boolean rangeIsValid(BasicBlock basicBlock, BasicBlock basicBlock2, BlockAddresses blockAddresses) {
        if (basicBlock == null) {
            throw new NullPointerException("start == null");
        }
        if (basicBlock2 == null) {
            throw new NullPointerException("end == null");
        }
        return blockAddresses.getEnd(basicBlock2).getAddress() - blockAddresses.getLast(basicBlock).getAddress() <= 65535;
    }
}
