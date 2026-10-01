package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class HeaderSection extends UniformItemSection {
    private final List<HeaderItem> list;

    @Override
    protected void orderItems() {
    }

    public HeaderSection(DexFile dexFile) {
        super((String) null, dexFile, 4);
        HeaderItem headerItem = new HeaderItem();
        headerItem.setIndex(0);
        this.list = Collections.singletonList(headerItem);
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        return (IndexedItem) null;
    }

    @Override
    public Collection<? extends Item> items() {
        return this.list;
    }
}
