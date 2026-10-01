package com.tencent.mm.androlib.res.data;

import com.tencent.mm.androlib.AndrolibException;
import java.util.HashSet;

public final class ResType {
    private final String mName;
    private final ResPackage mPackage;
    private final HashSet<String> specNames = new HashSet<>();

    public ResType(String str, ResPackage resPackage) {
        this.mName = str;
        this.mPackage = resPackage;
    }

    public String getName() {
        return this.mName;
    }

    public void putSpecResguardName(String str) throws AndrolibException {
        if (this.specNames.contains(str)) {
            throw new AndrolibException(String.format("spec proguard name duplicate in a singal type %s, spec name: %s\n", getName(), str));
        }
        this.specNames.add(str);
    }

    public String toString() {
        return this.mName;
    }
}
