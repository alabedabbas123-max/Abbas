package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;

public interface Member extends HasAttribute {
    int getAccessFlags();

    @Override
    AttributeList getAttributes();

    CstType getDefiningClass();

    CstString getDescriptor();

    CstString getName();

    CstNat getNat();
}
