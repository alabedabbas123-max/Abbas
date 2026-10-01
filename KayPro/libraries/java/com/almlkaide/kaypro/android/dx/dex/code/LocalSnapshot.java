package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecSet;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;

public final class LocalSnapshot extends ZeroSizeInsn {
    private final RegisterSpecSet locals;

    public LocalSnapshot(SourcePosition sourcePosition, RegisterSpecSet registerSpecSet) {
        super(sourcePosition);
        if (registerSpecSet == null) {
            throw new NullPointerException("locals == null");
        }
        this.locals = registerSpecSet;
    }

    @Override
    public DalvInsn withRegisterOffset(int i) {
        return new LocalSnapshot(getPosition(), this.locals.withOffset(i));
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalSnapshot(getPosition(), this.locals);
    }

    public RegisterSpecSet getLocals() {
        return this.locals;
    }

    @Override
    protected String argString() {
        return this.locals.toString();
    }

    @Override
    protected String listingString0(boolean z) {
        int size = this.locals.size();
        int maxSize = this.locals.getMaxSize();
        StringBuilder sb = new StringBuilder((size * 40) + 100);
        sb.append("local-snapshot");
        for (int i = 0; i < maxSize; i++) {
            RegisterSpec registerSpecM7190get = this.locals.m7190get(i);
            if (registerSpecM7190get != null) {
                sb.append("\n  ");
                sb.append(LocalStart.localString(registerSpecM7190get));
            }
        }
        return sb.toString();
    }

    @Override
    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalSnapshot(getPosition(), registerMapper.m7209map(this.locals));
    }
}
