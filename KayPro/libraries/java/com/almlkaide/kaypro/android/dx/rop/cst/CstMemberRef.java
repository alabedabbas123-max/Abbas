package com.almlkaide.kaypro.android.dx.rop.cst;

import org.apache.commons.io.FilenameUtils;

public abstract class CstMemberRef extends TypedConstant {
    private final CstType definingClass;

    private final CstNat f5075nat;

    CstMemberRef(CstType cstType, CstNat cstNat) {
        if (cstType == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (cstNat == null) {
            throw new NullPointerException("nat == null");
        }
        this.definingClass = cstType;
        this.f5075nat = cstNat;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CstMemberRef cstMemberRef = (CstMemberRef) obj;
        return this.definingClass.equals(cstMemberRef.definingClass) && this.f5075nat.equals(cstMemberRef.f5075nat);
    }

    public final int hashCode() {
        return (this.definingClass.hashCode() * 31) ^ this.f5075nat.hashCode();
    }

    @Override
    protected int compareTo0(Constant constant) {
        CstMemberRef cstMemberRef = (CstMemberRef) constant;
        int iCompareTo = this.definingClass.compareTo2((Constant) cstMemberRef.definingClass);
        return iCompareTo != 0 ? iCompareTo : this.f5075nat.getName().compareTo2((Constant) cstMemberRef.f5075nat.getName());
    }

    public final String toString() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(typeName()).append('{').toString()).append(toHuman()).toString()).append('}').toString();
    }

    @Override
    public final boolean isCategory2() {
        return false;
    }

    @Override
    public final String toHuman() {
        return new StringBuffer().append(new StringBuffer().append(this.definingClass.toHuman()).append(FilenameUtils.EXTENSION_SEPARATOR).toString()).append(this.f5075nat.toHuman()).toString();
    }

    public final CstType getDefiningClass() {
        return this.definingClass;
    }

    public final CstNat getNat() {
        return this.f5075nat;
    }
}
