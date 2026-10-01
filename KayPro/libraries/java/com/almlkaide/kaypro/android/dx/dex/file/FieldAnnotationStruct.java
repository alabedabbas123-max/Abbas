package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.ToHuman;

public final class FieldAnnotationStruct implements ToHuman, Comparable<FieldAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstFieldRef field;

    @Override
    public int compareTo(FieldAnnotationStruct fieldAnnotationStruct) {
        return compareTo2(fieldAnnotationStruct);
    }

    public FieldAnnotationStruct(CstFieldRef cstFieldRef, AnnotationSetItem annotationSetItem) {
        if (cstFieldRef == null) {
            throw new NullPointerException("field == null");
        }
        if (annotationSetItem == null) {
            throw new NullPointerException("annotations == null");
        }
        this.field = cstFieldRef;
        this.annotations = annotationSetItem;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof FieldAnnotationStruct) {
            return this.field.equals(((FieldAnnotationStruct) obj).field);
        }
        return false;
    }

    public int compareTo2(FieldAnnotationStruct fieldAnnotationStruct) {
        return this.field.compareTo2((Constant) fieldAnnotationStruct.field);
    }

    public void addContents(DexFile dexFile) {
        FieldIdsSection fieldIds = dexFile.getFieldIds();
        MixedItemSection wordData = dexFile.getWordData();
        fieldIds.intern(this.field);
        this.annotations = (AnnotationSetItem) wordData.intern(this.annotations);
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getFieldIds().indexOf(this.field);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append("    ").append(this.field.toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("      field_idx:       ").append(Hex.m7227u4(iIndexOf)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("      annotations_off: ").append(Hex.m7227u4(absoluteOffset)).toString());
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    @Override
    public String toHuman() {
        return new StringBuffer().append(new StringBuffer().append(this.field.toHuman()).append(": ").toString()).append(this.annotations).toString();
    }

    public CstFieldRef getField() {
        return this.field;
    }

    public Annotations getAnnotations() {
        return this.annotations.getAnnotations();
    }
}
