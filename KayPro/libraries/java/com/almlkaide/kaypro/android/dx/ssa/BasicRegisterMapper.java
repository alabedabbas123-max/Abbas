package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.util.IntList;

public class BasicRegisterMapper extends RegisterMapper {
    private final IntList oldToNew;
    private int runningCountNewRegisters;

    public BasicRegisterMapper(int i) {
        this.oldToNew = new IntList(i);
    }

    @Override
    public int getNewRegisterCount() {
        return this.runningCountNewRegisters;
    }

    @Override
    public RegisterSpec mo7199map(RegisterSpec registerSpec) {
        int iM7231get;
        if (registerSpec == null) {
            return (RegisterSpec) null;
        }
        try {
            iM7231get = this.oldToNew.m7231get(registerSpec.getReg());
        } catch (IndexOutOfBoundsException e) {
            iM7231get = -1;
        }
        if (iM7231get < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return registerSpec.withReg(iM7231get);
    }

    public int oldToNew(int i) {
        if (i >= this.oldToNew.size()) {
            return -1;
        }
        return this.oldToNew.m7231get(i);
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append("Old\tNew\n");
        int size = this.oldToNew.size();
        for (int i = 0; i < size; i++) {
            sb.append(i);
            sb.append('\t');
            sb.append(this.oldToNew.m7231get(i));
            sb.append('\n');
        }
        sb.append("new reg count:");
        sb.append(this.runningCountNewRegisters);
        sb.append('\n');
        return sb.toString();
    }

    public void addMapping(int i, int i2, int i3) {
        if (i >= this.oldToNew.size()) {
            for (int size = i - this.oldToNew.size(); size >= 0; size--) {
                this.oldToNew.m7230add(-1);
            }
        }
        this.oldToNew.m7234set(i, i2);
        if (this.runningCountNewRegisters < i2 + i3) {
            this.runningCountNewRegisters = i2 + i3;
        }
    }
}
