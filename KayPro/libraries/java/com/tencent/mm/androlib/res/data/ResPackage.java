package com.tencent.mm.androlib.res.data;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ResPackage {
    private final String mName;
    private boolean mCanProguard = false;
    private final Map<Integer, String> mSpecNamesReplace = new LinkedHashMap();
    private final Map<String, Set<String>> mSpecNamesBlock = new LinkedHashMap();

    public ResPackage(int i, String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }

    public Map<String, Set<String>> getSpecNamesBlock() {
        return this.mSpecNamesBlock;
    }

    public String getSpecRepplace(int i) {
        return this.mSpecNamesReplace.get(new Integer(i));
    }

    public boolean hasSpecRepplace(String str) {
        return this.mSpecNamesReplace.containsKey(str);
    }

    public boolean isCanResguard() {
        return this.mCanProguard;
    }

    public void putSpecNamesReplace(int i, String str) {
        this.mSpecNamesReplace.put(new Integer(i), str);
    }

    public void putSpecNamesblock(String str, String str2) {
        Set<String> hashSet = this.mSpecNamesBlock.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.mSpecNamesBlock.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    public void setCanResguard(boolean z) {
        this.mCanProguard = z;
    }

    public String toString() {
        return this.mName;
    }
}
