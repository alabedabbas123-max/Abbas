package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.ToHuman;

public final class MethodAnnotationStruct implements ToHuman, Comparable<MethodAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstMethodRef method;

    @Override
    public int compareTo(MethodAnnotationStruct methodAnnotationStruct) {
        return compareTo2(methodAnnotationStruct);
    }

    public MethodAnnotationStruct(CstMethodRef cstMethodRef, AnnotationSetItem annotationSetItem) {
        if (cstMethodRef == null) {
            throw new NullPointerException("method == null");
        }
        if (annotationSetItem == null) {
            throw new NullPointerException("annotations == null");
        }
        this.method = cstMethodRef;
        this.annotations = annotationSetItem;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MethodAnnotationStruct) {
            return this.method.equals(((MethodAnnotationStruct) obj).method);
        }
        return false;
    }

    public int compareTo2(MethodAnnotationStruct methodAnnotationStruct) {
        return this.method.compareTo2((Constant) methodAnnotationStruct.method);
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        this.annotations = (AnnotationSetItem) wordData.intern(this.annotations);
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append("    ").append(this.method.toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("      method_idx:      ").append(Hex.m7227u4(iIndexOf)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("      annotations_off: ").append(Hex.m7227u4(absoluteOffset)).toString());
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    @Override
    public String toHuman() {
        return new StringBuffer().append(new StringBuffer().append(this.method.toHuman()).append(": ").toString()).append(this.annotations).toString();
    }

    public CstMethodRef getMethod() {
        return this.method;
    }

    public Annotations getAnnotations() {
        return this.annotations.getAnnotations();
    }
}
