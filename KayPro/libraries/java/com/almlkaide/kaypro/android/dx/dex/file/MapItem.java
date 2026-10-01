package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;

public final class MapItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 12;
    private final Item firstItem;
    private final int itemCount;
    private final Item lastItem;
    private final Section section;
    private final ItemType type;

    @Override
    public void addContents(DexFile dexFile) {
    }

    public static void addMap(Section[] sectionArr, MixedItemSection mixedItemSection) {
        if (sectionArr == null) {
            throw new NullPointerException("sections == null");
        }
        if (mixedItemSection.items().size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (Section section : sectionArr) {
            Item item = (Item) null;
            Item item2 = (Item) null;
            int i = 0;
            ItemType itemType = (ItemType) null;
            for (Item item3 : section.items()) {
                ItemType itemType2 = item3.itemType();
                if (itemType2 != itemType) {
                    if (i != 0) {
                        arrayList.add(new MapItem(itemType, section, item, item2, i));
                    }
                    i = 0;
                    item = item3;
                    itemType = itemType2;
                }
                i++;
                item2 = item3;
            }
            if (i != 0) {
                arrayList.add(new MapItem(itemType, section, item, item2, i));
            } else if (section == mixedItemSection) {
                arrayList.add(new MapItem(mixedItemSection));
            }
        }
        mixedItemSection.m7168add(new UniformListItem(ItemType.TYPE_MAP_LIST, arrayList));
    }

    MapItem(ItemType itemType, Section section, Item item, Item item2, int i) {
        super(4, 12);
        if (itemType == null) {
            throw new NullPointerException("type == null");
        }
        if (section == null) {
            throw new NullPointerException("section == null");
        }
        if (item == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (item2 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.type = itemType;
        this.section = section;
        this.firstItem = item;
        this.lastItem = item2;
        this.itemCount = i;
    }

    MapItem(Section section) {
        super(4, 12);
        if (section == null) {
            throw new NullPointerException("section == null");
        }
        this.type = ItemType.TYPE_MAP_LIST;
        this.section = section;
        this.firstItem = (Item) null;
        this.lastItem = (Item) null;
        this.itemCount = 1;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_MAP_ITEM;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.section.toString());
        sb.append(' ');
        sb.append(this.type.toHuman());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final String toHuman() {
        return toString();
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteItemOffset;
        int mapValue = this.type.getMapValue();
        if (this.firstItem == null) {
            absoluteItemOffset = this.section.getFileOffset();
        } else {
            absoluteItemOffset = this.section.getAbsoluteItemOffset(this.firstItem);
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(offsetString()).append(' ').toString()).append(this.type.getTypeName()).toString()).append(" map").toString());
            annotatedOutput.annotate(2, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  type:   ").append(Hex.m7225u2(mapValue)).toString()).append(" // ").toString()).append(this.type.toString()).toString());
            annotatedOutput.annotate(2, "  unused: 0");
            annotatedOutput.annotate(4, new StringBuffer().append("  size:   ").append(Hex.m7227u4(this.itemCount)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  offset: ").append(Hex.m7227u4(absoluteItemOffset)).toString());
        }
        annotatedOutput.writeShort(mapValue);
        annotatedOutput.writeShort(0);
        annotatedOutput.writeInt(this.itemCount);
        annotatedOutput.writeInt(absoluteItemOffset);
    }
}
