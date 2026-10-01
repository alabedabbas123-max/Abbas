package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class MethodHandlesSection extends UniformItemSection {
    private final TreeMap<CstMethodHandle, MethodHandleItem> methodHandles;

    public MethodHandlesSection(DexFile dexFile) {
        super("method_handles", dexFile, 8);
        this.methodHandles = new TreeMap<>();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        MethodHandleItem methodHandleItem = this.methodHandles.get((CstMethodHandle) constant);
        if (methodHandleItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return methodHandleItem;
    }

    @Override
    protected void orderItems() {
        int i = 0;
        Iterator<MethodHandleItem> it = this.methodHandles.values().iterator();
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }

    @Override
    public Collection<? extends Item> items() {
        return this.methodHandles.values();
    }

    public synchronized void intern(CstMethodHandle cstMethodHandle) {
        try {
            if (cstMethodHandle == null) {
                throw new NullPointerException("methodHandle == null");
            }
            throwIfPrepared();
            if (this.methodHandles.get(cstMethodHandle) == null) {
                this.methodHandles.put(cstMethodHandle, new MethodHandleItem(cstMethodHandle));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    int indexOf(CstMethodHandle cstMethodHandle) {
        return this.methodHandles.get(cstMethodHandle).getIndex();
    }
}
