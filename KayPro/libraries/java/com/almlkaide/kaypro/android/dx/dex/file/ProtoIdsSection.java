package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class ProtoIdsSection extends UniformItemSection {
    private final TreeMap<Prototype, ProtoIdItem> protoIds;

    public ProtoIdsSection(DexFile dexFile) {
        super("proto_ids", dexFile, 4);
        this.protoIds = new TreeMap<>();
    }

    @Override
    public Collection<? extends Item> items() {
        return this.protoIds.values();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        if (!(constant instanceof CstProtoRef)) {
            throw new IllegalArgumentException("cst not instance of CstProtoRef");
        }
        throwIfNotPrepared();
        ProtoIdItem protoIdItem = this.protoIds.get(((CstProtoRef) constant).getPrototype());
        if (protoIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return protoIdItem;
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.protoIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("proto_ids_size:  ").append(Hex.m7227u4(size)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("proto_ids_off:   ").append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public synchronized ProtoIdItem intern(Prototype prototype) {
        ProtoIdItem protoIdItem;
        try {
            if (prototype == null) {
                throw new NullPointerException("prototype == null");
            }
            throwIfPrepared();
            protoIdItem = this.protoIds.get(prototype);
            if (protoIdItem == null) {
                protoIdItem = new ProtoIdItem(prototype);
                this.protoIds.put(prototype, protoIdItem);
            }
        } catch (Throwable th) {
            throw th;
        }
        return protoIdItem;
    }

    public int indexOf(Prototype prototype) {
        if (prototype == null) {
            throw new NullPointerException("prototype == null");
        }
        throwIfNotPrepared();
        ProtoIdItem protoIdItem = this.protoIds.get(prototype);
        if (protoIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return protoIdItem.getIndex();
    }

    @Override
    protected void orderItems() {
        int i = 0;
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            ((ProtoIdItem) it.next()).setIndex(i);
            i++;
        }
    }
}
