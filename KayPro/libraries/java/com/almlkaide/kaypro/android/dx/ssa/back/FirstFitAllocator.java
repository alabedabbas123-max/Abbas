package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.rop.code.CstInsn;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.ssa.BasicRegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.NormalSsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;
import com.almlkaide.kaypro.android.dx.util.BitIntSet;
import java.util.BitSet;

public class FirstFitAllocator extends RegisterAllocator {
    private static final boolean PRESLOT_PARAMS = true;
    private final BitSet mapped;

    public FirstFitAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
        this.mapped = new BitSet(ssaMethod.getRegCount());
    }

    @Override
    public boolean wantsParamsMovedHigh() {
        return true;
    }

    @Override
    public RegisterMapper allocateRegisters() {
        int iParamNumberFromMoveParam;
        boolean z;
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        int paramWidth = this.ssaMeth.getParamWidth();
        for (int i = 0; i < regCount; i++) {
            if (!this.mapped.get(i)) {
                int categoryForSsaReg = getCategoryForSsaReg(i);
                BitIntSet bitIntSet = new BitIntSet(regCount);
                this.interference.mergeInterferenceSet(i, bitIntSet);
                if (isDefinitionMoveParam(i)) {
                    iParamNumberFromMoveParam = paramNumberFromMoveParam((NormalSsaInsn) this.ssaMeth.getDefinitionForRegister(i));
                    basicRegisterMapper.addMapping(i, iParamNumberFromMoveParam, categoryForSsaReg);
                    z = true;
                } else {
                    basicRegisterMapper.addMapping(i, paramWidth, categoryForSsaReg);
                    iParamNumberFromMoveParam = paramWidth;
                    z = false;
                }
                for (int i2 = i + 1; i2 < regCount; i2++) {
                    if (!this.mapped.get(i2) && !isDefinitionMoveParam(i2) && !bitIntSet.mo7215has(i2) && (!z || categoryForSsaReg >= getCategoryForSsaReg(i2))) {
                        this.interference.mergeInterferenceSet(i2, bitIntSet);
                        categoryForSsaReg = Math.max(categoryForSsaReg, getCategoryForSsaReg(i2));
                        basicRegisterMapper.addMapping(i2, iParamNumberFromMoveParam, categoryForSsaReg);
                        this.mapped.set(i2);
                    }
                }
                this.mapped.set(i);
                if (!z) {
                    paramWidth += categoryForSsaReg;
                }
            }
        }
        return basicRegisterMapper;
    }

    private int paramNumberFromMoveParam(NormalSsaInsn normalSsaInsn) {
        return ((CstInteger) ((CstInsn) normalSsaInsn.getOriginalRopInsn()).getConstant()).getValue();
    }
}
