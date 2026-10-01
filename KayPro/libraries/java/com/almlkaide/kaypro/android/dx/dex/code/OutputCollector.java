package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import java.util.ArrayList;

public final class OutputCollector {
    private final OutputFinisher finisher;
    private ArrayList<DalvInsn> suffix;

    public OutputCollector(DexOptions dexOptions, int i, int i2, int i3, int i4) {
        this.finisher = new OutputFinisher(dexOptions, i, i3, i4);
        this.suffix = new ArrayList<>(i2);
    }

    public void m7159add(DalvInsn dalvInsn) {
        this.finisher.m7161add(dalvInsn);
    }

    public DalvInsn m7160get(int i) {
        return (i >= this.finisher.size() || i < 0) ? (DalvInsn) null : this.finisher.m7162get(i);
    }

    public int size() {
        return this.finisher.size();
    }

    public void reverseBranch(int i, CodeAddress codeAddress) {
        this.finisher.reverseBranch(i, codeAddress);
    }

    public void addSuffix(DalvInsn dalvInsn) {
        this.suffix.add(dalvInsn);
    }

    public OutputFinisher getFinisher() {
        if (this.suffix == null) {
            throw new UnsupportedOperationException("already processed");
        }
        appendSuffixToOutput();
        return this.finisher;
    }

    private void appendSuffixToOutput() {
        int size = this.suffix.size();
        for (int i = 0; i < size; i++) {
            this.finisher.m7161add(this.suffix.get(i));
        }
        this.suffix = (ArrayList) null;
    }
}
