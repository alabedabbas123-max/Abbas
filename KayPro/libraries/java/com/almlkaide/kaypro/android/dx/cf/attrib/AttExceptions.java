package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.MutabilityException;

public final class AttExceptions extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Exceptions";
    private final TypeList exceptions;

    public AttExceptions(TypeList typeList) {
        super(ATTRIBUTE_NAME);
        try {
            if (typeList.isMutable()) {
                throw new MutabilityException("exceptions.isMutable()");
            }
            this.exceptions = typeList;
        } catch (NullPointerException e) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override
    public int byteLength() {
        return (this.exceptions.size() * 2) + 8;
    }

    public TypeList getExceptions() {
        return this.exceptions;
    }
}
