package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.ToHuman;
import java.util.ArrayList;

public final class ParameterAnnotationStruct implements ToHuman, Comparable<ParameterAnnotationStruct> {
    private final UniformListItem<AnnotationSetRefItem> annotationsItem;
    private final AnnotationsList annotationsList;
    private final CstMethodRef method;

    @Override
    public int compareTo(ParameterAnnotationStruct parameterAnnotationStruct) {
        return compareTo2(parameterAnnotationStruct);
    }

    public ParameterAnnotationStruct(CstMethodRef cstMethodRef, AnnotationsList annotationsList, DexFile dexFile) {
        if (cstMethodRef == null) {
            throw new NullPointerException("method == null");
        }
        if (annotationsList == null) {
            throw new NullPointerException("annotationsList == null");
        }
        this.method = cstMethodRef;
        this.annotationsList = annotationsList;
        int size = annotationsList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new AnnotationSetRefItem(new AnnotationSetItem(annotationsList.m7179get(i), dexFile)));
        }
        this.annotationsItem = new UniformListItem<>(ItemType.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterAnnotationStruct) {
            return this.method.equals(((ParameterAnnotationStruct) obj).method);
        }
        return false;
    }

    public int compareTo2(ParameterAnnotationStruct parameterAnnotationStruct) {
        return this.method.compareTo2((Constant) parameterAnnotationStruct.method);
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        wordData.m7168add(this.annotationsItem);
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotationsItem.getAbsoluteOffset();
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.method.toHuman());
        sb.append(": ");
        boolean z = true;
        for (AnnotationSetRefItem annotationSetRefItem : this.annotationsItem.getItems()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(annotationSetRefItem.toHuman());
        }
        return sb.toString();
    }

    public CstMethodRef getMethod() {
        return this.method;
    }

    public AnnotationsList getAnnotationsList() {
        return this.annotationsList;
    }
}
