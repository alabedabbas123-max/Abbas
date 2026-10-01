package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class AnnotationSetRefItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 4;
    private AnnotationSetItem annotations;

    public AnnotationSetRefItem(AnnotationSetItem annotationSetItem) {
        super(4, 4);
        if (annotationSetItem == null) {
            throw new NullPointerException("annotations == null");
        }
        this.annotations = annotationSetItem;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override
    public void addContents(DexFile dexFile) {
        this.annotations = (AnnotationSetItem) dexFile.getWordData().intern(this.annotations);
    }

    @Override
    public String toHuman() {
        return this.annotations.toHuman();
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("  annotations_off: ").append(Hex.m7227u4(absoluteOffset)).toString());
        }
        annotatedOutput.writeInt(absoluteOffset);
    }
}
