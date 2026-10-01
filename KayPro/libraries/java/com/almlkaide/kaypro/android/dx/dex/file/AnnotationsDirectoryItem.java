package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class AnnotationsDirectoryItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ELEMENT_SIZE = 8;
    private static final int HEADER_SIZE = 16;
    private AnnotationSetItem classAnnotations;
    private ArrayList<FieldAnnotationStruct> fieldAnnotations;
    private ArrayList<MethodAnnotationStruct> methodAnnotations;
    private ArrayList<ParameterAnnotationStruct> parameterAnnotations;

    public AnnotationsDirectoryItem() {
        super(4, -1);
        this.classAnnotations = (AnnotationSetItem) null;
        this.fieldAnnotations = (ArrayList) null;
        this.methodAnnotations = (ArrayList) null;
        this.parameterAnnotations = (ArrayList) null;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    public boolean isEmpty() {
        return this.classAnnotations == null && this.fieldAnnotations == null && this.methodAnnotations == null && this.parameterAnnotations == null;
    }

    public boolean isInternable() {
        return this.classAnnotations != null && this.fieldAnnotations == null && this.methodAnnotations == null && this.parameterAnnotations == null;
    }

    public int hashCode() {
        if (this.classAnnotations == null) {
            return 0;
        }
        return this.classAnnotations.hashCode();
    }

    @Override
    public int compareTo0(OffsettedItem offsettedItem) {
        if (!isInternable()) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        return this.classAnnotations.compareTo2((OffsettedItem) ((AnnotationsDirectoryItem) offsettedItem).classAnnotations);
    }

    public void setClassAnnotations(Annotations annotations, DexFile dexFile) {
        if (annotations == null) {
            throw new NullPointerException("annotations == null");
        }
        if (this.classAnnotations != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.classAnnotations = new AnnotationSetItem(annotations, dexFile);
    }

    public void addFieldAnnotations(CstFieldRef cstFieldRef, Annotations annotations, DexFile dexFile) {
        if (this.fieldAnnotations == null) {
            this.fieldAnnotations = new ArrayList<>();
        }
        this.fieldAnnotations.add(new FieldAnnotationStruct(cstFieldRef, new AnnotationSetItem(annotations, dexFile)));
    }

    public void addMethodAnnotations(CstMethodRef cstMethodRef, Annotations annotations, DexFile dexFile) {
        if (this.methodAnnotations == null) {
            this.methodAnnotations = new ArrayList<>();
        }
        this.methodAnnotations.add(new MethodAnnotationStruct(cstMethodRef, new AnnotationSetItem(annotations, dexFile)));
    }

    public void addParameterAnnotations(CstMethodRef cstMethodRef, AnnotationsList annotationsList, DexFile dexFile) {
        if (this.parameterAnnotations == null) {
            this.parameterAnnotations = new ArrayList<>();
        }
        this.parameterAnnotations.add(new ParameterAnnotationStruct(cstMethodRef, annotationsList, dexFile));
    }

    public Annotations getMethodAnnotations(CstMethodRef cstMethodRef) {
        if (this.methodAnnotations == null) {
            return (Annotations) null;
        }
        for (MethodAnnotationStruct methodAnnotationStruct : this.methodAnnotations) {
            if (methodAnnotationStruct.getMethod().equals(cstMethodRef)) {
                return methodAnnotationStruct.getAnnotations();
            }
        }
        return (Annotations) null;
    }

    public AnnotationsList getParameterAnnotations(CstMethodRef cstMethodRef) {
        if (this.parameterAnnotations == null) {
            return (AnnotationsList) null;
        }
        for (ParameterAnnotationStruct parameterAnnotationStruct : this.parameterAnnotations) {
            if (parameterAnnotationStruct.getMethod().equals(cstMethodRef)) {
                return parameterAnnotationStruct.getAnnotationsList();
            }
        }
        return (AnnotationsList) null;
    }

    @Override
    public void addContents(DexFile dexFile) {
        MixedItemSection wordData = dexFile.getWordData();
        if (this.classAnnotations != null) {
            this.classAnnotations = (AnnotationSetItem) wordData.intern(this.classAnnotations);
        }
        if (this.fieldAnnotations != null) {
            Iterator<FieldAnnotationStruct> it = this.fieldAnnotations.iterator();
            while (it.hasNext()) {
                it.next().addContents(dexFile);
            }
        }
        if (this.methodAnnotations != null) {
            Iterator<MethodAnnotationStruct> it2 = this.methodAnnotations.iterator();
            while (it2.hasNext()) {
                it2.next().addContents(dexFile);
            }
        }
        if (this.parameterAnnotations != null) {
            Iterator<ParameterAnnotationStruct> it3 = this.parameterAnnotations.iterator();
            while (it3.hasNext()) {
                it3.next().addContents(dexFile);
            }
        }
    }

    @Override
    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    @Override
    protected void place0(Section section, int i) {
        setWriteSize(((listSize(this.fieldAnnotations) + listSize(this.methodAnnotations) + listSize(this.parameterAnnotations)) * 8) + 16);
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.classAnnotations);
        int iListSize = listSize(this.fieldAnnotations);
        int iListSize2 = listSize(this.methodAnnotations);
        int iListSize3 = listSize(this.parameterAnnotations);
        if (zAnnotates) {
            annotatedOutput.annotate(0, new StringBuffer().append(offsetString()).append(" annotations directory").toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  class_annotations_off: ").append(Hex.m7227u4(absoluteOffsetOr0)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  fields_size:           ").append(Hex.m7227u4(iListSize)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  methods_size:          ").append(Hex.m7227u4(iListSize2)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  parameters_size:       ").append(Hex.m7227u4(iListSize3)).toString());
        }
        annotatedOutput.writeInt(absoluteOffsetOr0);
        annotatedOutput.writeInt(iListSize);
        annotatedOutput.writeInt(iListSize2);
        annotatedOutput.writeInt(iListSize3);
        if (iListSize != 0) {
            Collections.sort(this.fieldAnnotations);
            if (zAnnotates) {
                annotatedOutput.annotate(0, "  fields:");
            }
            Iterator<FieldAnnotationStruct> it = this.fieldAnnotations.iterator();
            while (it.hasNext()) {
                it.next().writeTo(dexFile, annotatedOutput);
            }
        }
        if (iListSize2 != 0) {
            Collections.sort(this.methodAnnotations);
            if (zAnnotates) {
                annotatedOutput.annotate(0, "  methods:");
            }
            Iterator<MethodAnnotationStruct> it2 = this.methodAnnotations.iterator();
            while (it2.hasNext()) {
                it2.next().writeTo(dexFile, annotatedOutput);
            }
        }
        if (iListSize3 != 0) {
            Collections.sort(this.parameterAnnotations);
            if (zAnnotates) {
                annotatedOutput.annotate(0, "  parameters:");
            }
            Iterator<ParameterAnnotationStruct> it3 = this.parameterAnnotations.iterator();
            while (it3.hasNext()) {
                it3.next().writeTo(dexFile, annotatedOutput);
            }
        }
    }

    private static int listSize(ArrayList<?> arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    void debugPrint(PrintWriter printWriter) {
        if (this.classAnnotations != null) {
            printWriter.println(new StringBuffer().append("  class annotations: ").append(this.classAnnotations).toString());
        }
        if (this.fieldAnnotations != null) {
            printWriter.println("  field annotations:");
            Iterator<FieldAnnotationStruct> it = this.fieldAnnotations.iterator();
            while (it.hasNext()) {
                printWriter.println(new StringBuffer().append("    ").append(it.next().toHuman()).toString());
            }
        }
        if (this.methodAnnotations != null) {
            printWriter.println("  method annotations:");
            Iterator<MethodAnnotationStruct> it2 = this.methodAnnotations.iterator();
            while (it2.hasNext()) {
                printWriter.println(new StringBuffer().append("    ").append(it2.next().toHuman()).toString());
            }
        }
        if (this.parameterAnnotations != null) {
            printWriter.println("  parameter annotations:");
            Iterator<ParameterAnnotationStruct> it3 = this.parameterAnnotations.iterator();
            while (it3.hasNext()) {
                printWriter.println(new StringBuffer().append("    ").append(it3.next().toHuman()).toString());
            }
        }
    }
}
