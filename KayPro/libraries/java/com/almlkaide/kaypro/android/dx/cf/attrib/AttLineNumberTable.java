package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.cf.code.LineNumberList;
import com.almlkaide.kaypro.android.dx.util.MutabilityException;

public final class AttLineNumberTable extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "LineNumberTable";
    private final LineNumberList lineNumbers;

    public AttLineNumberTable(LineNumberList lineNumberList) {
        super(ATTRIBUTE_NAME);
        try {
            if (lineNumberList.isMutable()) {
                throw new MutabilityException("lineNumbers.isMutable()");
            }
            this.lineNumbers = lineNumberList;
        } catch (NullPointerException e) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override
    public int byteLength() {
        return (this.lineNumbers.size() * 4) + 8;
    }

    public LineNumberList getLineNumbers() {
        return this.lineNumbers;
    }
}
