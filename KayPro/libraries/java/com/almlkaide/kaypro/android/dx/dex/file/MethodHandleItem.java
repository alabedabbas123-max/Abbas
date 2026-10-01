package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBaseMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInterfaceMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class MethodHandleItem extends IndexedItem {
    private final int ITEM_SIZE = 8;
    private final CstMethodHandle methodHandle;

    public MethodHandleItem(CstMethodHandle cstMethodHandle) {
        this.methodHandle = cstMethodHandle;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override
    public int writeSize() {
        return 8;
    }

    @Override
    public void addContents(DexFile dexFile) {
        dexFile.getMethodHandles().intern(this.methodHandle);
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int targetIndex = getTargetIndex(dexFile);
        int methodHandleType = this.methodHandle.getMethodHandleType();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(this.methodHandle.toString()).toString());
            annotatedOutput.annotate(2, new StringBuffer().append(new StringBuffer().append("type:     ").append(Hex.m7225u2(methodHandleType)).toString()).append(new StringBuffer().append(" // ").append(CstMethodHandle.getMethodHandleTypeName(methodHandleType)).toString()).toString());
            annotatedOutput.annotate(2, new StringBuffer().append("reserved: ").append(Hex.m7225u2(0)).toString());
            String string = new StringBuffer().append(" // ").append(this.methodHandle.getRef().toString()).toString();
            if (this.methodHandle.isAccessor()) {
                annotatedOutput.annotate(2, new StringBuffer().append(new StringBuffer().append("fieldId:  ").append(Hex.m7225u2(targetIndex)).toString()).append(string).toString());
            } else {
                annotatedOutput.annotate(2, new StringBuffer().append(new StringBuffer().append("methodId: ").append(Hex.m7225u2(targetIndex)).toString()).append(string).toString());
            }
            annotatedOutput.annotate(2, new StringBuffer().append("reserved: ").append(Hex.m7225u2(0)).toString());
        }
        annotatedOutput.writeShort(methodHandleType);
        annotatedOutput.writeShort(0);
        annotatedOutput.writeShort(getTargetIndex(dexFile));
        annotatedOutput.writeShort(0);
    }

    private int getTargetIndex(DexFile dexFile) {
        Constant ref = this.methodHandle.getRef();
        if (this.methodHandle.isAccessor()) {
            return dexFile.getFieldIds().indexOf((CstFieldRef) ref);
        }
        if (this.methodHandle.isInvocation()) {
            if (ref instanceof CstInterfaceMethodRef) {
                ref = ((CstInterfaceMethodRef) ref).toMethodRef();
            }
            return dexFile.getMethodIds().indexOf((CstBaseMethodRef) ref);
        }
        throw new IllegalStateException("Unhandled invocation type");
    }
}
