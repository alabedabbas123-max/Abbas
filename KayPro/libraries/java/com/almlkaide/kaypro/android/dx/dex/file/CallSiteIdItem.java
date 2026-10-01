package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSite;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CallSiteIdItem extends IndexedItem implements Comparable {
    private static final int ITEM_SIZE = 4;
    CallSiteItem data = (CallSiteItem) null;
    final CstCallSiteRef invokeDynamicRef;

    public CallSiteIdItem(CstCallSiteRef cstCallSiteRef) {
        this.invokeDynamicRef = cstCallSiteRef;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override
    public int writeSize() {
        return 4;
    }

    @Override
    public void addContents(DexFile dexFile) {
        CstCallSite callSite = this.invokeDynamicRef.getCallSite();
        CallSiteIdsSection callSiteIds = dexFile.getCallSiteIds();
        CallSiteItem callSiteItem = callSiteIds.getCallSiteItem(callSite);
        if (callSiteItem == null) {
            MixedItemSection byteData = dexFile.getByteData();
            callSiteItem = new CallSiteItem(callSite);
            byteData.m7168add(callSiteItem);
            callSiteIds.addCallSiteItem(callSite, callSiteItem);
        }
        this.data = callSiteItem;
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.data.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(this.invokeDynamicRef.toString()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("call_site_off: ").append(Hex.m7227u4(absoluteOffset)).toString());
        }
        annotatedOutput.writeInt(absoluteOffset);
    }

    @Override
    public int compareTo(Object obj) {
        return this.invokeDynamicRef.compareTo2((Constant) ((CallSiteIdItem) obj).invokeDynamicRef);
    }
}
