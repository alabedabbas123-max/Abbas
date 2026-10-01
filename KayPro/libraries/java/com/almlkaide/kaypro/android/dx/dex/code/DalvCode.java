package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import java.util.HashSet;

public final class DalvCode {
    private CatchTable catches;
    private DalvInsnList insns;
    private LocalList locals;
    private final int positionInfo;
    private PositionList positions;
    private CatchBuilder unprocessedCatches;
    private OutputFinisher unprocessedInsns;

    public interface AssignIndicesCallback {
        int getIndex(Constant constant);
    }

    public DalvCode(int i, OutputFinisher outputFinisher, CatchBuilder catchBuilder) {
        if (outputFinisher == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        if (catchBuilder == null) {
            throw new NullPointerException("unprocessedCatches == null");
        }
        this.positionInfo = i;
        this.unprocessedInsns = outputFinisher;
        this.unprocessedCatches = catchBuilder;
        this.catches = (CatchTable) null;
        this.positions = (PositionList) null;
        this.locals = (LocalList) null;
        this.insns = (DalvInsnList) null;
    }

    private void finishProcessingIfNecessary() {
        if (this.insns == null) {
            this.insns = this.unprocessedInsns.finishProcessingAndGetList();
            this.positions = PositionList.make(this.insns, this.positionInfo);
            this.locals = LocalList.make(this.insns);
            this.catches = this.unprocessedCatches.build();
            this.unprocessedInsns = (OutputFinisher) null;
            this.unprocessedCatches = (CatchBuilder) null;
        }
    }

    public void assignIndices(AssignIndicesCallback assignIndicesCallback) {
        this.unprocessedInsns.assignIndices(assignIndicesCallback);
    }

    public boolean hasPositions() {
        return this.positionInfo != 1 && this.unprocessedInsns.hasAnyPositionInfo();
    }

    public boolean hasLocals() {
        return this.unprocessedInsns.hasAnyLocalInfo();
    }

    public boolean hasAnyCatches() {
        return this.unprocessedCatches.hasAnyCatches();
    }

    public HashSet<Type> getCatchTypes() {
        return this.unprocessedCatches.getCatchTypes();
    }

    public HashSet<Constant> getInsnConstants() {
        return this.unprocessedInsns.getAllConstants();
    }

    public DalvInsnList getInsns() {
        finishProcessingIfNecessary();
        return this.insns;
    }

    public CatchTable getCatches() {
        finishProcessingIfNecessary();
        return this.catches;
    }

    public PositionList getPositions() {
        finishProcessingIfNecessary();
        return this.positions;
    }

    public LocalList getLocals() {
        finishProcessingIfNecessary();
        return this.locals;
    }
}
