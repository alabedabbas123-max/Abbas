package com.almlkaide.kaypro.android.dx.ssa.back;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.ssa.SetFactory;
import com.almlkaide.kaypro.android.dx.util.IntSet;
import java.util.ArrayList;

public class InterferenceGraph {
    private final ArrayList<IntSet> interference;

    public InterferenceGraph(int i) {
        this.interference = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.interference.add(SetFactory.makeInterferenceSet(i));
        }
    }

    public void m7212add(int i, int i2) {
        ensureCapacity(Math.max(i, i2) + 1);
        this.interference.get(i).mo7214add(i2);
        this.interference.get(i2).mo7214add(i);
    }

    public void dumpToStdout() {
        int size = this.interference.size();
        for (int i = 0; i < size; i++) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Reg ").append(i).toString()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString()).append(this.interference.get(i).toString()).toString());
        }
    }

    public void mergeInterferenceSet(int i, IntSet intSet) {
        if (i < this.interference.size()) {
            intSet.merge(this.interference.get(i));
        }
    }

    private void ensureCapacity(int i) {
        this.interference.ensureCapacity(i);
        for (int size = this.interference.size(); size < i; size++) {
            this.interference.add(SetFactory.makeInterferenceSet(i));
        }
    }
}
