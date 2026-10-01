package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.cst.CstString;

public final class AttSourceDebugExtension extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "SourceDebugExtension";
    private final CstString smapString;

    public AttSourceDebugExtension(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString == null) {
            throw new NullPointerException("smapString == null");
        }
        this.smapString = cstString;
    }

    @Override
    public int byteLength() {
        return this.smapString.getUtf8Size() + 6;
    }

    public CstString getSmapString() {
        return this.smapString;
    }
}
