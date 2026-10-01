package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;

public final class LocalStart extends ZeroSizeInsn {
    private final RegisterSpec local;

    public static String localString(RegisterSpec registerSpec) {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(registerSpec.regString()).append(' ').toString()).append(registerSpec.getLocalItem().toString()).toString()).append(": ").toString()).append(registerSpec.getTypeBearer().toHuman()).toString();
    }

    public LocalStart(SourcePosition sourcePosition, RegisterSpec registerSpec) {
        super(sourcePosition);
        if (registerSpec == null) {
            throw new NullPointerException("local == null");
        }
        this.local = registerSpec;
    }

    @Override
    public DalvInsn withRegisterOffset(int i) {
        return new LocalStart(getPosition(), this.local.withOffset(i));
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalStart(getPosition(), this.local);
    }

    public RegisterSpec getLocal() {
        return this.local;
    }

    @Override
    protected String argString() {
        return this.local.toString();
    }

    @Override
    protected String listingString0(boolean z) {
        return new StringBuffer().append("local-start ").append(localString(this.local)).toString();
    }

    @Override
    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalStart(getPosition(), registerMapper.mo7199map(this.local));
    }
}
