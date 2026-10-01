package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.DexIndexOverflowException;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class TypeIdsSection extends UniformItemSection {
    private final TreeMap<Type, TypeIdItem> typeIds;

    public TypeIdsSection(DexFile dexFile) {
        super("type_ids", dexFile, 4);
        this.typeIds = new TreeMap<>();
    }

    @Override
    public Collection<? extends Item> items() {
        return this.typeIds.values();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        TypeIdItem typeIdItem = this.typeIds.get(((CstType) constant).getClassType());
        if (typeIdItem == null) {
            throw new IllegalArgumentException(new StringBuffer().append("not found: ").append(constant).toString());
        }
        return typeIdItem;
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.typeIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (size > 65536) {
            throw new DexIndexOverflowException(String.format(new StringBuffer().append(new StringBuffer().append("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%n").append("You may try using multi-dex. If multi-dex is enabled then the list of ").toString()).append("classes for the main dex list is too large.").toString(), new Integer(items().size()), new Integer(65536)));
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("type_ids_size:   ").append(Hex.m7227u4(size)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("type_ids_off:    ").append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public synchronized TypeIdItem intern(Type type) {
        TypeIdItem typeIdItem;
        try {
            if (type == null) {
                throw new NullPointerException("type == null");
            }
            throwIfPrepared();
            typeIdItem = this.typeIds.get(type);
            if (typeIdItem == null) {
                typeIdItem = new TypeIdItem(new CstType(type));
                this.typeIds.put(type, typeIdItem);
            }
        } catch (Throwable th) {
            throw th;
        }
        return typeIdItem;
    }

    public synchronized TypeIdItem intern(CstType cstType) {
        TypeIdItem typeIdItem;
        try {
            if (cstType == null) {
                throw new NullPointerException("type == null");
            }
            throwIfPrepared();
            Type classType = cstType.getClassType();
            typeIdItem = this.typeIds.get(classType);
            if (typeIdItem == null) {
                typeIdItem = new TypeIdItem(cstType);
                this.typeIds.put(classType, typeIdItem);
            }
        } catch (Throwable th) {
            throw th;
        }
        return typeIdItem;
    }

    public int indexOf(Type type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        throwIfNotPrepared();
        TypeIdItem typeIdItem = this.typeIds.get(type);
        if (typeIdItem == null) {
            throw new IllegalArgumentException(new StringBuffer().append("not found: ").append(type).toString());
        }
        return typeIdItem.getIndex();
    }

    public int indexOf(CstType cstType) {
        if (cstType == null) {
            throw new NullPointerException("type == null");
        }
        return indexOf(cstType.getClassType());
    }

    @Override
    protected void orderItems() {
        int i = 0;
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            ((TypeIdItem) it.next()).setIndex(i);
            i++;
        }
    }
}
