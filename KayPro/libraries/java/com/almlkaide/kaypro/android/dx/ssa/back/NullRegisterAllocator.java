package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.ssa.BasicRegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;

public class NullRegisterAllocator extends RegisterAllocator {
    public NullRegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
    }

    @Override
    public boolean wantsParamsMovedHigh() {
        return false;
    }

    @Override
    public RegisterMapper allocateRegisters() {
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        for (int i = 0; i < regCount; i++) {
            basicRegisterMapper.addMapping(i, i * 2, 2);
        }
        return basicRegisterMapper;
    }
}
