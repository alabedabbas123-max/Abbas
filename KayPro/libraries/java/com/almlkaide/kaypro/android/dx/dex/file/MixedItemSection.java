package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import org.apache.commons.io.IOUtils;

public final class MixedItemSection extends Section {
    private static final Comparator<OffsettedItem> TYPE_SORTER = new Comparator<OffsettedItem>() {
        @Override
        public int compare(OffsettedItem offsettedItem, OffsettedItem offsettedItem2) {
            return compare2(offsettedItem, offsettedItem2);
        }

        public int compare2(OffsettedItem offsettedItem, OffsettedItem offsettedItem2) {
            return offsettedItem.itemType().compareTo(offsettedItem2.itemType());
        }
    };
    private final HashMap<OffsettedItem, OffsettedItem> interns;
    private final ArrayList<OffsettedItem> items;
    private final SortType sort;
    private int writeSize;

    enum SortType {
        NONE,
        TYPE,
        INSTANCE;

        public static SortType valueOf(String str) {
            for (SortType sortType : values()) {
                if (sortType.name().equals(str)) {
                    return sortType;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public MixedItemSection(String str, DexFile dexFile, int i, SortType sortType) {
        super(str, dexFile, i);
        this.items = new ArrayList<>(100);
        this.interns = new HashMap<>(100);
        this.sort = sortType;
        this.writeSize = -1;
    }

    @Override
    public Collection<? extends Item> items() {
        return this.items;
    }

    @Override
    public int writeSize() {
        throwIfNotPrepared();
        return this.writeSize;
    }

    @Override
    public int getAbsoluteItemOffset(Item item) {
        return ((OffsettedItem) item).getAbsoluteOffset();
    }

    public int size() {
        return this.items.size();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        if (this.writeSize == -1) {
            throw new RuntimeException("write size not yet set");
        }
        int i = this.writeSize;
        int fileOffset = i == 0 ? 0 : getFileOffset();
        String name = getName();
        if (name == null) {
            name = "<unnamed>";
        }
        char[] cArr = new char[15 - name.length()];
        Arrays.fill(cArr, ' ');
        String str = new String(cArr);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(name).append("_size:").toString()).append(str).toString()).append(Hex.m7227u4(i)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(name).append("_off: ").toString()).append(str).toString()).append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(i);
        annotatedOutput.writeInt(fileOffset);
    }

    public void m7168add(OffsettedItem offsettedItem) {
        throwIfPrepared();
        try {
            if (offsettedItem.getAlignment() > getAlignment()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.items.add(offsettedItem);
        } catch (NullPointerException e) {
            throw new NullPointerException("item == null");
        }
    }

    public synchronized <T extends OffsettedItem> T intern(T t) {
        T t2;
        throwIfPrepared();
        OffsettedItem offsettedItem = this.interns.get(t);
        if (offsettedItem != null) {
            t2 = (T) offsettedItem;
        } else {
            m7168add(t);
            this.interns.put(t, t);
            t2 = t;
        }
        return t2;
    }

    public <T extends OffsettedItem> T m7169get(T t) {
        throwIfNotPrepared();
        OffsettedItem offsettedItem = this.interns.get(t);
        if (offsettedItem != null) {
            return (T) offsettedItem;
        }
        throw new NoSuchElementException(t.toString());
    }

    public void writeIndexAnnotation(AnnotatedOutput annotatedOutput, ItemType itemType, String str) {
        throwIfNotPrepared();
        TreeMap treeMap = new TreeMap();
        for (OffsettedItem offsettedItem : this.items) {
            if (offsettedItem.itemType() == itemType) {
                treeMap.put(offsettedItem.toHuman(), offsettedItem);
            }
        }
        if (treeMap.size() != 0) {
            annotatedOutput.annotate(0, str);
            for (Map.Entry entry : treeMap.entrySet()) {
                annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(((OffsettedItem) entry.getValue()).offsetString()).append(' ').toString()).append((String) entry.getKey()).toString()).append('\n').toString());
            }
        }
    }

    @Override
    protected void prepare0() {
        DexFile file = getFile();
        int i = 0;
        while (true) {
            int size = this.items.size();
            if (i >= size) {
                return;
            }
            int i2 = i;
            while (i2 < size) {
                this.items.get(i2).addContents(file);
                i2++;
            }
            i = i2;
        }
    }

    public void placeItems() {
        throwIfNotPrepared();
        SortType sortType = this.sort;
        if (sortType == SortType.INSTANCE) {
            Collections.sort(this.items);
        } else if (sortType == SortType.TYPE) {
            Collections.sort(this.items, TYPE_SORTER);
        }
        int size = this.items.size();
        int iWriteSize = 0;
        for (int i = 0; i < size; i++) {
            OffsettedItem offsettedItem = this.items.get(i);
            try {
                int iPlace = offsettedItem.place(this, iWriteSize);
                if (iPlace < iWriteSize) {
                    throw new RuntimeException(new StringBuffer().append("bogus place() result for ").append(offsettedItem).toString());
                }
                iWriteSize = iPlace + offsettedItem.writeSize();
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, new StringBuffer().append("...while placing ").append(offsettedItem).toString());
            }
        }
        this.writeSize = iWriteSize;
    }

    @Override
    protected void writeTo0(AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        boolean z = true;
        DexFile file = getFile();
        int iWriteSize = 0;
        for (OffsettedItem offsettedItem : this.items) {
            if (zAnnotates) {
                if (z) {
                    z = false;
                } else {
                    annotatedOutput.annotate(0, IOUtils.LINE_SEPARATOR_UNIX);
                }
            }
            int alignment = offsettedItem.getAlignment() - 1;
            int i = (alignment ^ (-1)) & (iWriteSize + alignment);
            if (iWriteSize != i) {
                annotatedOutput.writeZeroes(i - iWriteSize);
                iWriteSize = i;
            }
            offsettedItem.writeTo(file, annotatedOutput);
            iWriteSize = offsettedItem.writeSize() + iWriteSize;
        }
        if (iWriteSize != this.writeSize) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
