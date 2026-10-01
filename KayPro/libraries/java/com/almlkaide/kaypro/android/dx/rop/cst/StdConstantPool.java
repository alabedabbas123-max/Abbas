package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.MutabilityControl;

public final class StdConstantPool extends MutabilityControl implements ConstantPool {
    private final Constant[] entries;

    public StdConstantPool(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.entries = new Constant[i];
    }

    @Override
    public int size() {
        return this.entries.length;
    }

    @Override
    public Constant getOrNull(int i) {
        try {
            return this.entries[i];
        } catch (IndexOutOfBoundsException e) {
            return throwInvalid(i);
        }
    }

    @Override
    public Constant get0Ok(int i) {
        return i == 0 ? (Constant) null : mo7193get(i);
    }

    @Override
    public Constant mo7193get(int i) {
        try {
            Constant constant = this.entries[i];
            if (constant == null) {
                throwInvalid(i);
                return constant;
            }
            return constant;
        } catch (IndexOutOfBoundsException e) {
            return throwInvalid(i);
        }
    }

    @Override
    public Constant[] getEntries() {
        return this.entries;
    }

    public void m7196set(int i, Constant constant) {
        Constant constant2;
        throwIfImmutable();
        boolean z = constant != null && constant.isCategory2();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        if (z) {
            if (i == this.entries.length - 1) {
                throw new IllegalArgumentException(new StringBuffer().append("(n == size - 1) && ").append("cst.isCategory2()").toString());
            }
            this.entries[i + 1] = (Constant) null;
        }
        if (constant != null && this.entries[i] == null && (constant2 = this.entries[i - 1]) != null && constant2.isCategory2()) {
            this.entries[i - 1] = (Constant) null;
        }
        this.entries[i] = constant;
    }

    private static Constant throwInvalid(int i) {
        throw new ExceptionWithContext(new StringBuffer().append("invalid constant pool index ").append(Hex.m7225u2(i)).toString());
    }
}
