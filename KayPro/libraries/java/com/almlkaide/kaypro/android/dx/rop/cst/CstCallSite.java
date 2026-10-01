package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.cf.code.BootstrapMethodArgumentsList;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;

public final class CstCallSite extends CstArray {
    public static CstCallSite make(CstMethodHandle cstMethodHandle, CstNat cstNat, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
        if (cstMethodHandle == null) {
            throw new NullPointerException("bootstrapMethodHandle == null");
        }
        if (cstNat == null) {
            throw new NullPointerException("nat == null");
        }
        CstArray.List list = new CstArray.List(bootstrapMethodArgumentsList.size() + 3);
        list.m7195set(0, cstMethodHandle);
        list.m7195set(1, cstNat.getName());
        list.m7195set(2, new CstProtoRef(Prototype.fromDescriptor(cstNat.getDescriptor().getString())));
        if (bootstrapMethodArgumentsList != null) {
            for (int i = 0; i < bootstrapMethodArgumentsList.size(); i++) {
                list.m7195set(i + 3, bootstrapMethodArgumentsList.m7115get(i));
            }
        }
        list.setImmutable();
        return new CstCallSite(list);
    }

    CstCallSite(CstArray.List list) {
        super(list);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CstCallSite) {
            return getList().equals(((CstCallSite) obj).getList());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getList().hashCode();
    }

    @Override
    protected int compareTo0(Constant constant) {
        return getList().compareTo2(((CstCallSite) constant).getList());
    }

    @Override
    public String toString() {
        return getList().toString("call site{", ", ", "}");
    }

    @Override
    public String typeName() {
        return "call site";
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    public String toHuman() {
        return getList().toHuman("{", ", ", "}");
    }
}
