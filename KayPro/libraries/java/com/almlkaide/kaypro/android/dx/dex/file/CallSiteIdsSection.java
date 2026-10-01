package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSite;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class CallSiteIdsSection extends UniformItemSection {
    private final TreeMap<CstCallSiteRef, CallSiteIdItem> callSiteIds;
    private final TreeMap<CstCallSite, CallSiteItem> callSites;

    public CallSiteIdsSection(DexFile dexFile) {
        super("call_site_ids", dexFile, 4);
        this.callSiteIds = new TreeMap<>();
        this.callSites = new TreeMap<>();
    }

    @Override
    public IndexedItem mo7165get(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        throwIfNotPrepared();
        CallSiteIdItem callSiteIdItem = this.callSiteIds.get((CstCallSiteRef) constant);
        if (callSiteIdItem == null) {
            throw new IllegalArgumentException("not found");
        }
        return callSiteIdItem;
    }

    @Override
    protected void orderItems() {
        int i = 0;
        Iterator<CallSiteIdItem> it = this.callSiteIds.values().iterator();
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }

    @Override
    public Collection<? extends Item> items() {
        return this.callSiteIds.values();
    }

    public synchronized void intern(CstCallSiteRef cstCallSiteRef) {
        try {
            if (cstCallSiteRef == null) {
                throw new NullPointerException("cstRef");
            }
            throwIfPrepared();
            if (this.callSiteIds.get(cstCallSiteRef) == null) {
                this.callSiteIds.put(cstCallSiteRef, new CallSiteIdItem(cstCallSiteRef));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void addCallSiteItem(CstCallSite cstCallSite, CallSiteItem callSiteItem) {
        if (cstCallSite == null) {
            throw new NullPointerException("callSite == null");
        }
        if (callSiteItem == null) {
            throw new NullPointerException("callSiteItem == null");
        }
        this.callSites.put(cstCallSite, callSiteItem);
    }

    CallSiteItem getCallSiteItem(CstCallSite cstCallSite) {
        if (cstCallSite == null) {
            throw new NullPointerException("callSite == null");
        }
        return this.callSites.get(cstCallSite);
    }
}
