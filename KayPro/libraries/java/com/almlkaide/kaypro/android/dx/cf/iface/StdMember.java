package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;

public abstract class StdMember implements Member {
    private final int accessFlags;
    private final AttributeList attributes;
    private final CstType definingClass;

    private final CstNat f5012nat;

    public StdMember(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        if (cstType == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (cstNat == null) {
            throw new NullPointerException("nat == null");
        }
        if (attributeList == null) {
            throw new NullPointerException("attributes == null");
        }
        this.definingClass = cstType;
        this.accessFlags = i;
        this.f5012nat = cstNat;
        this.attributes = attributeList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f5012nat.toHuman());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final CstType getDefiningClass() {
        return this.definingClass;
    }

    @Override
    public final int getAccessFlags() {
        return this.accessFlags;
    }

    @Override
    public final CstNat getNat() {
        return this.f5012nat;
    }

    @Override
    public final CstString getName() {
        return this.f5012nat.getName();
    }

    @Override
    public final CstString getDescriptor() {
        return this.f5012nat.getDescriptor();
    }

    @Override
    public final AttributeList getAttributes() {
        return this.attributes;
    }
}
