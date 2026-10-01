package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class StringIdItem extends IndexedItem implements Comparable {
    private StringDataItem data;
    private final CstString value;

    public StringIdItem(CstString cstString) {
        if (cstString == null) {
            throw new NullPointerException("value == null");
        }
        this.value = cstString;
        this.data = (StringDataItem) null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StringIdItem)) {
            return false;
        }
        return this.value.equals(((StringIdItem) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public int compareTo(Object obj) {
        return this.value.compareTo2((Constant) ((StringIdItem) obj).value);
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_STRING_ID_ITEM;
    }

    @Override
    public int writeSize() {
        return 4;
    }

    @Override
    public void addContents(DexFile dexFile) {
        if (this.data == null) {
            MixedItemSection stringData = dexFile.getStringData();
            this.data = new StringDataItem(this.value);
            stringData.m7168add(this.data);
        }
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.data.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(this.value.toQuoted(100)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  string_data_off: ").append(Hex.m7227u4(absoluteOffset)).toString());
        }
        annotatedOutput.writeInt(absoluteOffset);
    }

    public CstString getValue() {
        return this.value;
    }

    public StringDataItem getData() {
        return this.data;
    }
}
