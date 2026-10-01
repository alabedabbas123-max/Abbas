package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.Type;

public class CstCallSiteRef extends Constant {

    private final int f5073id;
    private final CstInvokeDynamic invokeDynamic;

    CstCallSiteRef(CstInvokeDynamic cstInvokeDynamic, int i) {
        if (cstInvokeDynamic == null) {
            throw new NullPointerException("invokeDynamic == null");
        }
        this.invokeDynamic = cstInvokeDynamic;
        this.f5073id = i;
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    public String typeName() {
        return "CallSiteRef";
    }

    @Override
    protected int compareTo0(Constant constant) {
        CstCallSiteRef cstCallSiteRef = (CstCallSiteRef) constant;
        int iCompareTo = this.invokeDynamic.compareTo2((Constant) cstCallSiteRef.invokeDynamic);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f5073id, cstCallSiteRef.f5073id);
    }

    @Override
    public String toHuman() {
        return getCallSite().toHuman();
    }

    public String toString() {
        return getCallSite().toString();
    }

    public Prototype getPrototype() {
        return this.invokeDynamic.getPrototype();
    }

    public Type getReturnType() {
        return this.invokeDynamic.getReturnType();
    }

    public CstCallSite getCallSite() {
        return this.invokeDynamic.getCallSite();
    }
}
