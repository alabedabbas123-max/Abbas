package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class TypeListItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ELEMENT_SIZE = 2;
    private static final int HEADER_SIZE = 4;
    private final TypeList list;

    public TypeListItem(TypeList typeList) {
        super(4, (typeList.size() * 2) + 4);
        this.list = typeList;
    }

    public int hashCode() {
        return StdTypeList.hashContents(this.list);
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_TYPE_LIST;
    }

    @Override
    public void addContents(DexFile dexFile) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            typeIds.intern(this.list.getType(i));
        }
    }

    @Override
    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    public TypeList getList() {
        return this.list;
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.list.size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(offsetString()).append(" type_list").toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  size: ").append(Hex.m7227u4(size)).toString());
            for (int i = 0; i < size; i++) {
                Type type = this.list.getType(i);
                annotatedOutput.annotate(2, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  ").append(Hex.m7225u2(typeIds.indexOf(type))).toString()).append(" // ").toString()).append(type.toHuman()).toString());
            }
        }
        annotatedOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            annotatedOutput.writeShort(typeIds.indexOf(this.list.getType(i2)));
        }
    }

    @Override
    protected int compareTo0(OffsettedItem offsettedItem) {
        return StdTypeList.compareContents(this.list, ((TypeListItem) offsettedItem).list);
    }
}
