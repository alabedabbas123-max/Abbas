package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSite;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;

public final class CallSiteItem extends OffsettedItem {
    private byte[] encodedForm;
    private final CstCallSite value;

    public CallSiteItem(CstCallSite cstCallSite) {
        super(1, writeSize(cstCallSite));
        this.value = cstCallSite;
    }

    private static int writeSize(CstCallSite cstCallSite) {
        return -1;
    }

    @Override
    protected void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeArray(this.value, true);
        this.encodedForm = byteArrayAnnotatedOutput.toByteArray();
        setWriteSize(this.encodedForm.length);
    }

    @Override
    public String toHuman() {
        return this.value.toHuman();
    }

    public String toString() {
        return this.value.toString();
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(offsetString()).append(" call site").toString());
            new ValueEncoder(dexFile, annotatedOutput).writeArray(this.value, true);
        } else {
            annotatedOutput.write(this.encodedForm);
        }
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override
    public void addContents(DexFile dexFile) {
        ValueEncoder.addContents(dexFile, this.value);
    }
}
