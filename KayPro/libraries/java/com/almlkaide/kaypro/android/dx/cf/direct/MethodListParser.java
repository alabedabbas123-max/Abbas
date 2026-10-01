package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.cf.iface.Member;
import com.almlkaide.kaypro.android.dx.cf.iface.StdMethod;
import com.almlkaide.kaypro.android.dx.cf.iface.StdMethodList;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;

final class MethodListParser extends MemberListParser {
    private final StdMethodList methods;

    public MethodListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i, attributeFactory);
        this.methods = new StdMethodList(getCount());
    }

    public StdMethodList getList() {
        parseIfNecessary();
        return this.methods;
    }

    @Override
    protected String humanName() {
        return "method";
    }

    @Override
    protected String humanAccessFlags(int i) {
        return AccessFlags.methodString(i);
    }

    @Override
    protected int getAttributeContext() {
        return 2;
    }

    @Override
    protected Member mo7137set(int i, int i2, CstNat cstNat, AttributeList attributeList) {
        StdMethod stdMethod = new StdMethod(getDefiner(), i2, cstNat, attributeList);
        this.methods.m7143set(i, stdMethod);
        return stdMethod;
    }
}
