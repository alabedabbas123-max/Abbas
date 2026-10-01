package com.almlkaide.kaypro.android.dx.rop.cst;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import java.util.ArrayList;
import java.util.List;

public final class CstInvokeDynamic extends Constant {
    private final int bootstrapMethodIndex;
    private CstCallSite callSite;
    private CstType declaringClass;

    private final CstNat f5074nat;
    private final Prototype prototype;
    private final List<CstCallSiteRef> references = new ArrayList();

    public static CstInvokeDynamic make(int i, CstNat cstNat) {
        return new CstInvokeDynamic(i, cstNat);
    }

    CstInvokeDynamic(int i, CstNat cstNat) {
        this.bootstrapMethodIndex = i;
        this.f5074nat = cstNat;
        this.prototype = Prototype.fromDescriptor(cstNat.getDescriptor().toHuman());
    }

    public CstCallSiteRef addReference() {
        CstCallSiteRef cstCallSiteRef = new CstCallSiteRef(this, this.references.size());
        this.references.add(cstCallSiteRef);
        return cstCallSiteRef;
    }

    public List<CstCallSiteRef> getReferences() {
        return this.references;
    }

    public String toString() {
        return toHuman();
    }

    @Override
    public String typeName() {
        return "InvokeDynamic";
    }

    @Override
    public String toHuman() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("InvokeDynamic(").append(this.declaringClass != null ? this.declaringClass.toHuman() : "Unknown").toString()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString()).append(this.bootstrapMethodIndex).toString()).append(", ").toString()).append(this.f5074nat.toHuman()).toString()).append(")").toString();
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    protected int compareTo0(Constant constant) {
        CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) constant;
        int iCompare = Integer.compare(this.bootstrapMethodIndex, cstInvokeDynamic.getBootstrapMethodIndex());
        if (iCompare == 0) {
            int iCompareTo = this.f5074nat.compareTo2((Constant) cstInvokeDynamic.getNat());
            if (iCompareTo == 0) {
                int iCompareTo2 = this.declaringClass.compareTo2((Constant) cstInvokeDynamic.getDeclaringClass());
                return iCompareTo2 == 0 ? this.callSite.compareTo2((Constant) cstInvokeDynamic.getCallSite()) : iCompareTo2;
            }
            return iCompareTo;
        }
        return iCompare;
    }

    public int getBootstrapMethodIndex() {
        return this.bootstrapMethodIndex;
    }

    public CstNat getNat() {
        return this.f5074nat;
    }

    public Prototype getPrototype() {
        return this.prototype;
    }

    public Type getReturnType() {
        return this.prototype.getReturnType();
    }

    public void setDeclaringClass(CstType cstType) {
        if (this.declaringClass != null) {
            throw new IllegalArgumentException("already added declaring class");
        }
        if (cstType == null) {
            throw new NullPointerException("declaringClass == null");
        }
        this.declaringClass = cstType;
    }

    public CstType getDeclaringClass() {
        return this.declaringClass;
    }

    public void setCallSite(CstCallSite cstCallSite) {
        if (this.callSite != null) {
            throw new IllegalArgumentException("already added call site");
        }
        if (cstCallSite == null) {
            throw new NullPointerException("callSite == null");
        }
        this.callSite = cstCallSite;
    }

    public CstCallSite getCallSite() {
        return this.callSite;
    }
}
