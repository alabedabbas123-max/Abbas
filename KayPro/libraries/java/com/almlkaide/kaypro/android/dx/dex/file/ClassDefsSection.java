package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class ClassDefsSection extends UniformItemSection {
    private final TreeMap<Type, ClassDefItem> classDefs;
    private ArrayList<ClassDefItem> orderedDefs;

    public ClassDefsSection(DexFile dexFile) {
        super("class_defs", dexFile, 4);
        this.classDefs = new TreeMap<>();
        this.orderedDefs = (ArrayList) null;
    }

    @Override
    public Collection<? extends Item> items() {
        return this.orderedDefs != null ? this.orderedDefs : this.classDefs.values();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        ClassDefItem classDefItem = this.classDefs.get(((CstType) constant).getClassType());
        if (classDefItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return classDefItem;
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.classDefs.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("class_defs_size: ").append(Hex.m7227u4(size)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("class_defs_off:  ").append(Hex.m7227u4(fileOffset)).toString());
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public void m7166add(ClassDefItem classDefItem) {
        try {
            Type classType = classDefItem.getThisClass().getClassType();
            throwIfPrepared();
            if (this.classDefs.get(classType) != null) {
                throw new IllegalArgumentException(new StringBuffer().append("already added: ").append(classType).toString());
            }
            this.classDefs.put(classType, classDefItem);
        } catch (NullPointerException e) {
            throw new NullPointerException("clazz == null");
        }
    }

    @Override
    protected void orderItems() {
        int size = this.classDefs.size();
        int iOrderItems0 = 0;
        this.orderedDefs = new ArrayList<>(size);
        Iterator<Type> it = this.classDefs.keySet().iterator();
        while (it.hasNext()) {
            iOrderItems0 = orderItems0(it.next(), iOrderItems0, size - iOrderItems0);
        }
    }

    private int orderItems0(Type type, int i, int i2) {
        ClassDefItem classDefItem = this.classDefs.get(type);
        if (classDefItem != null && !classDefItem.hasIndex()) {
            if (i2 < 0) {
                throw new RuntimeException(new StringBuffer().append("class circularity with ").append(type).toString());
            }
            int i3 = i2 - 1;
            CstType superclass = classDefItem.getSuperclass();
            if (superclass != null) {
                i = orderItems0(superclass.getClassType(), i, i3);
            }
            TypeList interfaces = classDefItem.getInterfaces();
            int size = interfaces.size();
            for (int i4 = 0; i4 < size; i4++) {
                i = orderItems0(interfaces.getType(i4), i, i3);
            }
            classDefItem.setIndex(i);
            this.orderedDefs.add(classDefItem);
            return i + 1;
        }
        return i;
    }
}
