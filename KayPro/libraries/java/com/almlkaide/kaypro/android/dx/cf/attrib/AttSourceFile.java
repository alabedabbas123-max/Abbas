package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.cst.CstString;

public final class AttSourceFile extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "SourceFile";
    private final CstString sourceFile;

    public AttSourceFile(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString == null) {
            throw new NullPointerException("sourceFile == null");
        }
        this.sourceFile = cstString;
    }

    @Override
    public int byteLength() {
        return 8;
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }
}
