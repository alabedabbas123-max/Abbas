package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.Type;

public abstract class CstBaseMethodRef extends CstMemberRef {
    private Prototype instancePrototype;
    private final Prototype prototype;

    CstBaseMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
        String string = getNat().getDescriptor().getString();
        if (isSignaturePolymorphic()) {
            this.prototype = Prototype.fromDescriptor(string);
        } else {
            this.prototype = Prototype.intern(string);
        }
        this.instancePrototype = (Prototype) null;
    }

    public final Prototype getPrototype() {
        return this.prototype;
    }

    public final Prototype getPrototype(boolean z) {
        if (z) {
            return this.prototype;
        }
        if (this.instancePrototype == null) {
            this.instancePrototype = this.prototype.withFirstParameter(getDefiningClass().getClassType());
        }
        return this.instancePrototype;
    }

    @Override
    protected final int compareTo0(Constant constant) {
        int iCompareTo0 = super.compareTo0(constant);
        if (iCompareTo0 == 0) {
            return this.prototype.compareTo2(((CstBaseMethodRef) constant).prototype);
        }
        return iCompareTo0;
    }

    @Override
    public final Type getType() {
        return this.prototype.getReturnType();
    }

    public final int getParameterWordCount(boolean z) {
        return getPrototype(z).getParameterTypes().getWordCount();
    }

    public final boolean isInstanceInit() {
        return getNat().isInstanceInit();
    }

    public final boolean isClassInit() {
        return getNat().isClassInit();
    }

    public final boolean isSignaturePolymorphic() {
        CstType definingClass = getDefiningClass();
        if (definingClass.equals(CstType.METHOD_HANDLE)) {
            String string = getNat().getName().getString();
            if (string.equals("invoke") || string.equals("invokeExact")) {
                return true;
            }
        } else if (definingClass.equals(CstType.VAR_HANDLE)) {
            String string2 = getNat().getName().getString();
            if (string2.equals("compareAndExchange") || string2.equals("compareAndExchangeAcquire") || string2.equals("compareAndExchangeRelease") || string2.equals("compareAndSet") || string2.equals("get") || string2.equals("getAcquire") || string2.equals("getAndAdd") || string2.equals("getAndAddAcquire") || string2.equals("getAndAddRelease") || string2.equals("getAndBitwiseAnd") || string2.equals("getAndBitwiseAndAcquire") || string2.equals("getAndBitwiseAndRelease") || string2.equals("getAndBitwiseOr") || string2.equals("getAndBitwiseOrAcquire") || string2.equals("getAndBitwiseOrRelease") || string2.equals("getAndBitwiseXor") || string2.equals("getAndBitwiseXorAcquire") || string2.equals("getAndBitwiseXorRelease") || string2.equals("getAndSet") || string2.equals("getAndSetAcquire") || string2.equals("getAndSetRelease") || string2.equals("getOpaque") || string2.equals("getVolatile") || string2.equals("set") || string2.equals("setOpaque") || string2.equals("setRelease") || string2.equals("setVolatile") || string2.equals("weakCompareAndSet") || string2.equals("weakCompareAndSetAcquire") || string2.equals("weakCompareAndSetPlain") || string2.equals("weakCompareAndSetRelease")) {
                return true;
            }
        }
        return false;
    }
}
