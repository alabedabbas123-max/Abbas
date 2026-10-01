package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.util.MutabilityException;

public abstract class BaseParameterAnnotations extends BaseAttribute {
    private final int byteLength;
    private final AnnotationsList parameterAnnotations;

    public BaseParameterAnnotations(String str, AnnotationsList annotationsList, int i) {
        super(str);
        try {
            if (annotationsList.isMutable()) {
                throw new MutabilityException("parameterAnnotations.isMutable()");
            }
            this.parameterAnnotations = annotationsList;
            this.byteLength = i;
        } catch (NullPointerException e) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override
    public final int byteLength() {
        return this.byteLength + 6;
    }

    public final AnnotationsList getParameterAnnotations() {
        return this.parameterAnnotations;
    }
}
