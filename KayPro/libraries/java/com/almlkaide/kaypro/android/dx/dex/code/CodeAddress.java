package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;

public final class CodeAddress extends ZeroSizeInsn {
    private final boolean bindsClosely;

    public CodeAddress(SourcePosition sourcePosition) {
        this(sourcePosition, false);
    }

    public CodeAddress(SourcePosition sourcePosition, boolean z) {
        super(sourcePosition);
        this.bindsClosely = z;
    }

    @Override
    public final DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new CodeAddress(getPosition());
    }

    @Override
    protected String argString() {
        return (String) null;
    }

    @Override
    protected String listingString0(boolean z) {
        return "code-address";
    }

    public boolean getBindsClosely() {
        return this.bindsClosely;
    }
}
