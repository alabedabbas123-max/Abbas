package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class StringIdsSection extends UniformItemSection {
    private final TreeMap<CstString, StringIdItem> strings;

    public StringIdsSection(DexFile dexFile) {
        super("string_ids", dexFile, 4);
        this.strings = new TreeMap<>();
    }

    @Override
    public Collection<? extends Item> items() {
        return this.strings.values();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        StringIdItem stringIdItem = this.strings.get((CstString) constant);
        if (stringIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return stringIdItem;
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.strings.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("string_ids_size: ").append(Hex.m7227u4(size)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("string_ids_off:  ").append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public StringIdItem intern(String str) {
        return intern(new StringIdItem(new CstString(str)));
    }

    public StringIdItem intern(CstString cstString) {
        return intern(new StringIdItem(cstString));
    }

    public synchronized StringIdItem intern(StringIdItem stringIdItem) {
        StringIdItem stringIdItem2;
        try {
            if (stringIdItem == null) {
                throw new NullPointerException("string == null");
            }
            throwIfPrepared();
            CstString value = stringIdItem.getValue();
            stringIdItem2 = this.strings.get(value);
            if (stringIdItem2 == null) {
                this.strings.put(value, stringIdItem);
                stringIdItem2 = stringIdItem;
            }
        } catch (Throwable th) {
            throw th;
        }
        return stringIdItem2;
    }

    public synchronized void intern(CstNat cstNat) {
        intern(cstNat.getName());
        intern(cstNat.getDescriptor());
    }

    public int indexOf(CstString cstString) {
        if (cstString == null) {
            throw new NullPointerException("string == null");
        }
        throwIfNotPrepared();
        StringIdItem stringIdItem = this.strings.get(cstString);
        if (stringIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return stringIdItem.getIndex();
    }

    @Override
    protected void orderItems() {
        int i = 0;
        Iterator<StringIdItem> it = this.strings.values().iterator();
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }
}
