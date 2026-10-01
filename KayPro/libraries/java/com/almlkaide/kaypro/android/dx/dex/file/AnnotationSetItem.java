package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Iterator;

public final class AnnotationSetItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ENTRY_WRITE_SIZE = 4;
    private final Annotations annotations;
    private final AnnotationItem[] items;

    public AnnotationSetItem(Annotations annotations, DexFile dexFile) {
        super(4, writeSize(annotations));
        this.annotations = annotations;
        this.items = new AnnotationItem[annotations.size()];
        int i = 0;
        Iterator<Annotation> it = annotations.getAnnotations().iterator();
        while (it.hasNext()) {
            this.items[i] = new AnnotationItem(it.next(), dexFile);
            i++;
        }
    }

    private static int writeSize(Annotations annotations) {
        try {
            return (annotations.size() * 4) + 4;
        } catch (NullPointerException e) {
            throw new NullPointerException("list == null");
        }
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override
    protected int compareTo0(OffsettedItem offsettedItem) {
        return this.annotations.compareTo2(((AnnotationSetItem) offsettedItem).annotations);
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override
    public String toHuman() {
        return this.annotations.toString();
    }

    @Override
    public void addContents(DexFile dexFile) {
        MixedItemSection byteData = dexFile.getByteData();
        int length = this.items.length;
        for (int i = 0; i < length; i++) {
            this.items[i] = (AnnotationItem) byteData.intern(this.items[i]);
        }
    }

    @Override
    protected void place0(Section section, int i) {
        AnnotationItem.sortByTypeIdIndex(this.items);
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        int length = this.items.length;
        if (zAnnotates) {
            annotatedOutput.annotate(0, new StringBuffer().append(offsetString()).append(" annotation set").toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  size: ").append(Hex.m7227u4(length)).toString());
        }
        annotatedOutput.writeInt(length);
        for (int i = 0; i < length; i++) {
            int absoluteOffset = this.items[i].getAbsoluteOffset();
            if (zAnnotates) {
                annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  entries[").append(Integer.toHexString(i)).toString()).append("]: ").toString()).append(Hex.m7227u4(absoluteOffset)).toString());
                this.items[i].annotateTo(annotatedOutput, "    ");
            }
            annotatedOutput.writeInt(absoluteOffset);
        }
    }
}
