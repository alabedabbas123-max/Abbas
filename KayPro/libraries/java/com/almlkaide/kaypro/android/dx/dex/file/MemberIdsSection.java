package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.DexIndexOverflowException;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class MemberIdsSection extends UniformItemSection {
    public MemberIdsSection(String str, DexFile dexFile) {
        super(str, dexFile, 4);
    }

    @Override
    protected void orderItems() {
        int i = 0;
        if (items().size() > 65536) {
            throw new DexIndexOverflowException(getTooManyMembersMessage());
        }
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            ((MemberIdItem) it.next()).setIndex(i);
            i++;
        }
    }

    private String getTooManyMembersMessage() {
        TreeMap treeMap = new TreeMap();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            String packageName = ((MemberIdItem) it.next()).getDefiningClass().getPackageName();
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(packageName);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(packageName, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%n").append("You may try using multi-dex. If multi-dex is enabled then the list of ").toString()).append("classes for the main dex list is too large.%n").toString()).append("References by package:").toString(), this instanceof MethodIdsSection ? "method" : "field", new Integer(items().size()), new Integer(65536));
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", new Integer(((AtomicInteger) entry.getValue()).get()), (String) entry.getKey());
            }
            return formatter.toString();
        } finally {
            formatter.close();
        }
    }
}
