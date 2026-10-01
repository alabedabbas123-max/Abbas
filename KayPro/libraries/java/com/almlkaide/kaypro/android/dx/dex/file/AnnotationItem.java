package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationVisibility;
import com.almlkaide.kaypro.android.dx.rop.annotation.NameValuePair;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;
import java.util.Arrays;
import java.util.Comparator;

public final class AnnotationItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final TypeIdSorter TYPE_ID_SORTER = new TypeIdSorter();
    private static final int VISIBILITY_BUILD = 0;
    private static final int VISIBILITY_RUNTIME = 1;
    private static final int VISIBILITY_SYSTEM = 2;
    private final Annotation annotation;
    private byte[] encodedForm;
    private TypeIdItem type;

    private static class TypeIdSorter implements Comparator<AnnotationItem> {
        @Override
        public int compare(AnnotationItem annotationItem, AnnotationItem annotationItem2) {
            return compare2(annotationItem, annotationItem2);
        }

        public int compare2(AnnotationItem annotationItem, AnnotationItem annotationItem2) {
            int index = annotationItem.type.getIndex();
            int index2 = annotationItem2.type.getIndex();
            if (index < index2) {
                return -1;
            }
            if (index > index2) {
                return 1;
            }
            return 0;
        }
    }

    public static void sortByTypeIdIndex(AnnotationItem[] annotationItemArr) {
        Arrays.sort(annotationItemArr, TYPE_ID_SORTER);
    }

    public AnnotationItem(Annotation annotation, DexFile dexFile) {
        super(1, -1);
        if (annotation == null) {
            throw new NullPointerException("annotation == null");
        }
        this.annotation = annotation;
        this.type = (TypeIdItem) null;
        this.encodedForm = (byte[]) null;
        addContents(dexFile);
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_ITEM;
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    @Override
    protected int compareTo0(OffsettedItem offsettedItem) {
        return this.annotation.compareTo2(((AnnotationItem) offsettedItem).annotation);
    }

    @Override
    public String toHuman() {
        return this.annotation.toHuman();
    }

    @Override
    public void addContents(DexFile dexFile) {
        this.type = dexFile.getTypeIds().intern(this.annotation.getType());
        ValueEncoder.addContents(dexFile, this.annotation);
    }

    @Override
    protected void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeAnnotation(this.annotation, false);
        this.encodedForm = byteArrayAnnotatedOutput.toByteArray();
        setWriteSize(this.encodedForm.length + 1);
    }

    public void annotateTo(AnnotatedOutput annotatedOutput, String str) {
        annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(str).append("visibility: ").toString()).append(this.annotation.getVisibility().toHuman()).toString());
        annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(str).append("type: ").toString()).append(this.annotation.getType().toHuman()).toString());
        for (NameValuePair nameValuePair : this.annotation.getNameValuePairs()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(str).append(nameValuePair.getName().toHuman()).toString()).append(": ").toString()).append(ValueEncoder.constantToHuman(nameValuePair.getValue())).toString());
        }
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        AnnotationVisibility visibility = this.annotation.getVisibility();
        if (zAnnotates) {
            annotatedOutput.annotate(0, new StringBuffer().append(offsetString()).append(" annotation").toString());
            annotatedOutput.annotate(1, new StringBuffer().append("  visibility: VISBILITY_").append(visibility).toString());
        }
        if (visibility == AnnotationVisibility.BUILD) {
            annotatedOutput.writeByte(0);
        } else if (visibility == AnnotationVisibility.RUNTIME) {
            annotatedOutput.writeByte(1);
        } else if (visibility == AnnotationVisibility.SYSTEM) {
            annotatedOutput.writeByte(2);
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        if (zAnnotates) {
            new ValueEncoder(dexFile, annotatedOutput).writeAnnotation(this.annotation, true);
        } else {
            annotatedOutput.write(this.encodedForm);
        }
    }
}
