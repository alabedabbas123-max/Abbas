package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public abstract class OffsettedItem extends Item implements Comparable<OffsettedItem> {
    private Section addedTo;
    private final int alignment;
    private int offset;
    private int writeSize;

    @Override
    public final int compareTo(OffsettedItem offsettedItem) {
        return compareTo2(offsettedItem);
    }

    protected void place0(Section section, int i) {
    }

    public abstract String toHuman();

    protected abstract void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput);

    public static int getAbsoluteOffsetOr0(OffsettedItem offsettedItem) {
        if (offsettedItem == null) {
            return 0;
        }
        return offsettedItem.getAbsoluteOffset();
    }

    public OffsettedItem(int i, int i2) {
        Section.validateAlignment(i);
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.alignment = i;
        this.writeSize = i2;
        this.addedTo = (Section) null;
        this.offset = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsettedItem offsettedItem = (OffsettedItem) obj;
        return itemType() == offsettedItem.itemType() && compareTo0(offsettedItem) == 0;
    }

    public final int compareTo2(OffsettedItem offsettedItem) {
        if (this == offsettedItem) {
            return 0;
        }
        ItemType itemType = itemType();
        ItemType itemType2 = offsettedItem.itemType();
        if (itemType != itemType2) {
            return itemType.compareTo(itemType2);
        }
        return compareTo0(offsettedItem);
    }

    public final void setWriteSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.writeSize >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.writeSize = i;
    }

    @Override
    public final int writeSize() {
        if (this.writeSize < 0) {
            throw new UnsupportedOperationException("writeSize is unknown");
        }
        return this.writeSize;
    }

    @Override
    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
        try {
            if (this.writeSize < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            annotatedOutput.assertCursor(getAbsoluteOffset());
            writeTo0(dexFile, annotatedOutput);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, new StringBuffer().append("...while writing ").append(this).toString());
        }
    }

    public final int getRelativeOffset() {
        if (this.offset < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.offset;
    }

    public final int getAbsoluteOffset() {
        if (this.offset < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.addedTo.getAbsoluteOffset(this.offset);
    }

    public final int place(Section section, int i) {
        if (section == null) {
            throw new NullPointerException("addedTo == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.addedTo != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.alignment - 1;
        int i3 = (i2 ^ (-1)) & (i + i2);
        this.addedTo = section;
        this.offset = i3;
        place0(section, i3);
        return i3;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final String offsetString() {
        return new StringBuffer().append(new StringBuffer().append('[').append(Integer.toHexString(getAbsoluteOffset())).toString()).append(']').toString();
    }

    protected int compareTo0(OffsettedItem offsettedItem) {
        throw new UnsupportedOperationException("unsupported");
    }
}
