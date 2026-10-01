package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.Leb128;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class StringDataItem extends OffsettedItem {
    private final CstString value;

    @Override
    public void addContents(DexFile dexFile) {
    }

    public StringDataItem(CstString cstString) {
        super(1, writeSize(cstString));
        this.value = cstString;
    }

    private static int writeSize(CstString cstString) {
        return Leb128.unsignedLeb128Size(cstString.getUtf16Size()) + cstString.getUtf8Size() + 1;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_STRING_DATA_ITEM;
    }

    @Override
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        ByteArray bytes = this.value.getBytes();
        int utf16Size = this.value.getUtf16Size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(utf16Size), new StringBuffer().append("utf16_size: ").append(Hex.m7227u4(utf16Size)).toString());
            annotatedOutput.annotate(bytes.size() + 1, this.value.toQuoted());
        }
        annotatedOutput.writeUleb128(utf16Size);
        annotatedOutput.write(bytes);
        annotatedOutput.writeByte(0);
    }

    @Override
    public String toHuman() {
        return this.value.toQuoted();
    }

    @Override
    protected int compareTo0(OffsettedItem offsettedItem) {
        return this.value.compareTo2((Constant) ((StringDataItem) offsettedItem).value);
    }
}
