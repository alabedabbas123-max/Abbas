package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.cf.iface.Member;
import com.almlkaide.kaypro.android.dx.cf.iface.StdField;
import com.almlkaide.kaypro.android.dx.cf.iface.StdFieldList;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;

final class FieldListParser extends MemberListParser {
    private final StdFieldList fields;

    public FieldListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i, attributeFactory);
        this.fields = new StdFieldList(getCount());
    }

    public StdFieldList getList() {
        parseIfNecessary();
        return this.fields;
    }

    @Override
    protected String humanName() {
        return "field";
    }

    @Override
    protected String humanAccessFlags(int i) {
        return AccessFlags.fieldString(i);
    }

    @Override
    protected int getAttributeContext() {
        return 1;
    }

    @Override
    protected Member mo7137set(int i, int i2, CstNat cstNat, AttributeList attributeList) {
        StdField stdField = new StdField(getDefiner(), i2, cstNat, attributeList);
        this.fields.m7142set(i, stdField);
        return stdField;
    }
}
