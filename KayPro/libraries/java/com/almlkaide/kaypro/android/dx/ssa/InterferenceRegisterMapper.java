package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.ssa.back.InterferenceGraph;
import com.almlkaide.kaypro.android.dx.util.BitIntSet;
import java.util.ArrayList;

public class InterferenceRegisterMapper extends BasicRegisterMapper {
    private final ArrayList<BitIntSet> newRegInterference;
    private final InterferenceGraph oldRegInterference;

    public InterferenceRegisterMapper(InterferenceGraph interferenceGraph, int i) {
        super(i);
        this.newRegInterference = new ArrayList<>();
        this.oldRegInterference = interferenceGraph;
    }

    @Override
    public void addMapping(int i, int i2, int i3) {
        super.addMapping(i, i2, i3);
        addInterfence(i2, i);
        if (i3 == 2) {
            addInterfence(i2 + 1, i);
        }
    }

    public boolean interferes(int i, int i2, int i3) {
        BitIntSet bitIntSet;
        if (i2 >= this.newRegInterference.size() || (bitIntSet = this.newRegInterference.get(i2)) == null) {
            return false;
        }
        if (i3 == 1) {
            return bitIntSet.mo7215has(i);
        }
        return bitIntSet.mo7215has(i) || interferes(i, i2 + 1, i3 + (-1));
    }

    public boolean interferes(RegisterSpec registerSpec, int i) {
        return interferes(registerSpec.getReg(), i, registerSpec.getCategory());
    }

    private void addInterfence(int i, int i2) {
        this.newRegInterference.ensureCapacity(i + 1);
        while (i >= this.newRegInterference.size()) {
            this.newRegInterference.add(new BitIntSet(i + 1));
        }
        this.oldRegInterference.mergeInterferenceSet(i2, this.newRegInterference.get(i));
    }

    public boolean areAnyPinned(RegisterSpecList registerSpecList, int i, int i2) {
        int size = registerSpecList.size();
        for (int i3 = 0; i3 < size; i3++) {
            RegisterSpec registerSpecM7188get = registerSpecList.m7188get(i3);
            int iOldToNew = oldToNew(registerSpecM7188get.getReg());
            if (iOldToNew == i || ((registerSpecM7188get.getCategory() == 2 && iOldToNew + 1 == i) || (i2 == 2 && iOldToNew == i + 1))) {
                return true;
            }
        }
        return false;
    }
}
