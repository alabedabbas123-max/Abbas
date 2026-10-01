package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class CstNat extends Constant {
    public static final CstNat PRIMITIVE_TYPE_NAT = new CstNat(new CstString("TYPE"), new CstString("Ljava/lang/Class;"));
    private final CstString descriptor;
    private final CstString name;

    public CstNat(CstString cstString, CstString cstString2) {
        if (cstString == null) {
            throw new NullPointerException("name == null");
        }
        if (cstString2 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.name = cstString;
        this.descriptor = cstString2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstNat)) {
            return false;
        }
        CstNat cstNat = (CstNat) obj;
        return this.name.equals(cstNat.name) && this.descriptor.equals(cstNat.descriptor);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) ^ this.descriptor.hashCode();
    }

    @Override
    protected int compareTo0(Constant constant) {
        CstNat cstNat = (CstNat) constant;
        int iCompareTo = this.name.compareTo2((Constant) cstNat.name);
        return iCompareTo != 0 ? iCompareTo : this.descriptor.compareTo2((Constant) cstNat.descriptor);
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append("nat{").append(toHuman()).toString()).append('}').toString();
    }

    @Override
    public String typeName() {
        return "nat";
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    public CstString getName() {
        return this.name;
    }

    public CstString getDescriptor() {
        return this.descriptor;
    }

    @Override
    public String toHuman() {
        return new StringBuffer().append(new StringBuffer().append(this.name.toHuman()).append(':').toString()).append(this.descriptor.toHuman()).toString();
    }

    public Type getFieldType() {
        return Type.intern(this.descriptor.getString());
    }

    public final boolean isInstanceInit() {
        return this.name.getString().equals("<init>");
    }

    public final boolean isClassInit() {
        return this.name.getString().equals("<clinit>");
    }
}
