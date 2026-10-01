package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBaseMethodRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Collection;
import java.util.TreeMap;

public final class MethodIdsSection extends MemberIdsSection {
    private final TreeMap<CstBaseMethodRef, MethodIdItem> methodIds;

    public MethodIdsSection(DexFile dexFile) {
        super("method_ids", dexFile);
        this.methodIds = new TreeMap<>();
    }

    @Override
    public Collection<? extends Item> items() {
        return this.methodIds.values();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        MethodIdItem methodIdItem = this.methodIds.get((CstBaseMethodRef) constant);
        if (methodIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return methodIdItem;
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.methodIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("method_ids_size: ").append(Hex.m7227u4(size)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("method_ids_off:  ").append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public synchronized MethodIdItem intern(CstBaseMethodRef cstBaseMethodRef) {
        MethodIdItem methodIdItem;
        try {
            if (cstBaseMethodRef == null) {
                throw new NullPointerException("method == null");
            }
            throwIfPrepared();
            methodIdItem = this.methodIds.get(cstBaseMethodRef);
            if (methodIdItem == null) {
                methodIdItem = new MethodIdItem(cstBaseMethodRef);
                this.methodIds.put(cstBaseMethodRef, methodIdItem);
            }
        } catch (Throwable th) {
            throw th;
        }
        return methodIdItem;
    }

    public int indexOf(CstBaseMethodRef cstBaseMethodRef) {
        if (cstBaseMethodRef == null) {
            throw new NullPointerException("ref == null");
        }
        throwIfNotPrepared();
        MethodIdItem methodIdItem = this.methodIds.get(cstBaseMethodRef);
        if (methodIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return methodIdItem.getIndex();
    }
}
