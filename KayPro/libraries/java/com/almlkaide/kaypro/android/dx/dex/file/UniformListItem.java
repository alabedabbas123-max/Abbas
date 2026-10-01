package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.dex.file.OffsettedItem;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Iterator;
import java.util.List;

public final class UniformListItem<T extends OffsettedItem> extends OffsettedItem {
    private static final int HEADER_SIZE = 4;
    private final ItemType itemType;
    private final List<T> items;

    public UniformListItem(ItemType itemType, List<T> list) {
        super(getAlignment(list), writeSize(list));
        if (itemType == null) {
            throw new NullPointerException("itemType == null");
        }
        this.items = list;
        this.itemType = itemType;
    }

    private static int getAlignment(List<? extends OffsettedItem> list) {
        try {
            return Math.max(4, list.get(0).getAlignment());
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException e2) {
            throw new NullPointerException("items == null");
        }
    }

    private static int writeSize(List<? extends OffsettedItem> list) {
        OffsettedItem offsettedItem = list.get(0);
        return (offsettedItem.writeSize() * list.size()) + getAlignment(list);
    }

    @Override
    public ItemType itemType() {
        return this.itemType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append(this.items);
        return sb.toString();
    }

    @Override
    public void addContents(DexFile dexFile) {
        Iterator<T> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().addContents(dexFile);
        }
    }

    @Override
    public final String toHuman() {
        StringBuilder sb = new StringBuilder(100);
        boolean z = true;
        sb.append("{");
        for (T t : this.items) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(t.toHuman());
        }
        sb.append("}");
        return sb.toString();
    }

    public final List<T> getItems() {
        return this.items;
    }

    @Override
    protected void place0(Section section, int i) {
        int i2;
        int iHeaderSize = i + headerSize();
        boolean z = true;
        int alignment = -1;
        int i3 = -1;
        for (T t : this.items) {
            int iWriteSize = t.writeSize();
            if (z) {
                alignment = t.getAlignment();
                z = false;
                i2 = iWriteSize;
            } else {
                if (iWriteSize != i3) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (t.getAlignment() != alignment) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
                i2 = i3;
            }
            i3 = i2;
            iHeaderSize = t.place(section, iHeaderSize) + iWriteSize;
        }
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int size = this.items.size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(offsetString()).append(" ").toString()).append(typeName()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  size: ").append(Hex.m7227u4(size)).toString());
        }
        annotatedOutput.writeInt(size);
        Iterator<T> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().writeTo(dexFile, annotatedOutput);
        }
    }

    private int headerSize() {
        return getAlignment();
    }
}
