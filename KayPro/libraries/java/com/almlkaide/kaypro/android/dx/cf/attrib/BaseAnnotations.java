package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.util.MutabilityException;

public abstract class BaseAnnotations extends BaseAttribute {
    private final Annotations annotations;
    private final int byteLength;

    public BaseAnnotations(String str, Annotations annotations, int i) {
        super(str);
        try {
            if (annotations.isMutable()) {
                throw new MutabilityException("annotations.isMutable()");
            }
            this.annotations = annotations;
            this.byteLength = i;
        } catch (NullPointerException e) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override
    public final int byteLength() {
        return this.byteLength + 6;
    }

    public final Annotations getAnnotations() {
        return this.annotations;
    }
}
