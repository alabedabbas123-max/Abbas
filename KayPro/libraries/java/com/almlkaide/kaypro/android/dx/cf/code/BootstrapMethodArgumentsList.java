package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstDouble;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFloat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLong;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public class BootstrapMethodArgumentsList extends FixedSizeList {
    public BootstrapMethodArgumentsList(int i) {
        super(i);
    }

    public Constant m7115get(int i) {
        return (Constant) get0(i);
    }

    public void m7116set(int i, Constant constant) {
        if ((constant instanceof CstString) || (constant instanceof CstType) || (constant instanceof CstInteger) || (constant instanceof CstLong) || (constant instanceof CstFloat) || (constant instanceof CstDouble) || (constant instanceof CstMethodHandle) || (constant instanceof CstProtoRef)) {
            set0(i, constant);
        } else {
            throw new IllegalArgumentException(new StringBuffer().append("bad type for bootstrap argument: ").append(constant.getClass()).toString());
        }
    }
}
