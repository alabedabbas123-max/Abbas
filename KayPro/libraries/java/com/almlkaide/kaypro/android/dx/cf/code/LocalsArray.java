package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.MutabilityControl;
import com.almlkaide.kaypro.android.dx.util.ToHuman;

public abstract class LocalsArray extends MutabilityControl implements ToHuman {
    public abstract void annotate(ExceptionWithContext exceptionWithContext);

    public abstract LocalsArray copy();

    public abstract TypeBearer mo7132get(int i);

    public abstract TypeBearer getCategory1(int i);

    public abstract TypeBearer getCategory2(int i);

    public abstract int getMaxLocals();

    public abstract TypeBearer getOrNull(int i);

    protected abstract OneLocalsArray getPrimary();

    public abstract void invalidate(int i);

    public abstract void makeInitialized(Type type);

    public abstract LocalsArray merge(LocalsArray localsArray);

    public abstract LocalsArraySet mergeWithSubroutineCaller(LocalsArray localsArray, int i);

    public abstract void mo7133set(int i, TypeBearer typeBearer);

    public abstract void mo7134set(RegisterSpec registerSpec);

    protected LocalsArray(boolean z) {
        super(z);
    }
}
