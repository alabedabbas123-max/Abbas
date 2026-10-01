package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecSet;

public abstract class RegisterMapper {
    public abstract int getNewRegisterCount();

    public abstract RegisterSpec mo7199map(RegisterSpec registerSpec);

    public final RegisterSpecList m7208map(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        RegisterSpecList registerSpecList2 = new RegisterSpecList(size);
        for (int i = 0; i < size; i++) {
            registerSpecList2.m7189set(i, mo7199map(registerSpecList.m7188get(i)));
        }
        registerSpecList2.setImmutable();
        return registerSpecList2.equals(registerSpecList) ? registerSpecList : registerSpecList2;
    }

    public final RegisterSpecSet m7209map(RegisterSpecSet registerSpecSet) {
        int maxSize = registerSpecSet.getMaxSize();
        RegisterSpecSet registerSpecSet2 = new RegisterSpecSet(getNewRegisterCount());
        for (int i = 0; i < maxSize; i++) {
            RegisterSpec registerSpecM7190get = registerSpecSet.m7190get(i);
            if (registerSpecM7190get != null) {
                registerSpecSet2.m7192put(mo7199map(registerSpecM7190get));
            }
        }
        registerSpecSet2.setImmutable();
        return registerSpecSet2.equals(registerSpecSet) ? registerSpecSet : registerSpecSet2;
    }
}
