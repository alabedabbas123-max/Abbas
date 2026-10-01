package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstArray;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;

public final class EncodedArrayItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private final CstArray array;
    private byte[] encodedForm;

    public EncodedArrayItem(CstArray cstArray) {
        super(1, -1);
        if (cstArray == null) {
            throw new NullPointerException("array == null");
        }
        this.array = cstArray;
        this.encodedForm = (byte[]) null;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_ENCODED_ARRAY_ITEM;
    }

    public int hashCode() {
        return this.array.hashCode();
    }

    @Override
    protected int compareTo0(OffsettedItem offsettedItem) {
        return this.array.compareTo2((Constant) ((EncodedArrayItem) offsettedItem).array);
    }

    @Override
    public String toHuman() {
        return this.array.toHuman();
    }

    @Override
    public void addContents(DexFile dexFile) {
        ValueEncoder.addContents(dexFile, this.array);
    }

    @Override
    protected void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeArray(this.array, false);
        this.encodedForm = byteArrayAnnotatedOutput.toByteArray();
        setWriteSize(this.encodedForm.length);
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(offsetString()).append(" encoded array").toString());
            new ValueEncoder(dexFile, annotatedOutput).writeArray(this.array, true);
        } else {
            annotatedOutput.write(this.encodedForm);
        }
    }
}
