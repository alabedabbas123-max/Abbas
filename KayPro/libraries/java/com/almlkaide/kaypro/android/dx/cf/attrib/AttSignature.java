package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.cst.CstString;

public final class AttSignature extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Signature";
    private final CstString signature;

    public AttSignature(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString == null) {
            throw new NullPointerException("signature == null");
        }
        this.signature = cstString;
    }

    @Override
    public int byteLength() {
        return 8;
    }

    public CstString getSignature() {
        return this.signature;
    }
}
