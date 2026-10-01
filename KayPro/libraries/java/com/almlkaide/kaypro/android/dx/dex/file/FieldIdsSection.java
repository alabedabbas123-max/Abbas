package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Collection;
import java.util.TreeMap;

public final class FieldIdsSection extends MemberIdsSection {
    private final TreeMap<CstFieldRef, FieldIdItem> fieldIds;

    public FieldIdsSection(DexFile dexFile) {
        super("field_ids", dexFile);
        this.fieldIds = new TreeMap<>();
    }

    @Override
    public Collection<? extends Item> items() {
        return this.fieldIds.values();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        FieldIdItem fieldIdItem = this.fieldIds.get((CstFieldRef) constant);
        if (fieldIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return fieldIdItem;
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.fieldIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("field_ids_size:  ").append(Hex.m7227u4(size)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("field_ids_off:   ").append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public synchronized FieldIdItem intern(CstFieldRef cstFieldRef) {
        FieldIdItem fieldIdItem;
        try {
            if (cstFieldRef == null) {
                throw new NullPointerException("field == null");
            }
            throwIfPrepared();
            fieldIdItem = this.fieldIds.get(cstFieldRef);
            if (fieldIdItem == null) {
                fieldIdItem = new FieldIdItem(cstFieldRef);
                this.fieldIds.put(cstFieldRef, fieldIdItem);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fieldIdItem;
    }

    public int indexOf(CstFieldRef cstFieldRef) {
        if (cstFieldRef == null) {
            throw new NullPointerException("ref == null");
        }
        throwIfNotPrepared();
        FieldIdItem fieldIdItem = this.fieldIds.get(cstFieldRef);
        if (fieldIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return fieldIdItem.getIndex();
    }
}
