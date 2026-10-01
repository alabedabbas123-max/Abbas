package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.Collection;
import java.util.Iterator;

public abstract class UniformItemSection extends Section {
    public abstract IndexedItem mo7165get(Constant constant);

    protected abstract void orderItems();

    public UniformItemSection(String str, DexFile dexFile, int i) {
        super(str, dexFile, i);
    }

    @Override
    public final int writeSize() {
        Collection<? extends Item> collectionItems = items();
        int size = collectionItems.size();
        if (size == 0) {
            return 0;
        }
        return collectionItems.iterator().next().writeSize() * size;
    }

    @Override
    protected final void prepare0() {
        DexFile file = getFile();
        orderItems();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().addContents(file);
        }
    }

    @Override
    protected final void writeTo0(AnnotatedOutput annotatedOutput) {
        DexFile file = getFile();
        int alignment = getAlignment();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().writeTo(file, annotatedOutput);
            annotatedOutput.alignTo(alignment);
        }
    }

    @Override
    public final int getAbsoluteItemOffset(Item item) {
        IndexedItem indexedItem = (IndexedItem) item;
        return getAbsoluteOffset(indexedItem.getIndex() * indexedItem.writeSize());
    }
}
