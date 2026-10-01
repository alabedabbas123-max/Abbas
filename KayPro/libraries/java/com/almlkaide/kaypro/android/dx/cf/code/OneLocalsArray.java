package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.Hex;
import org.apache.commons.io.IOUtils;

public class OneLocalsArray extends LocalsArray {
    private final TypeBearer[] locals;

    @Override
    public LocalsArray copy() {
        return copy();
    }

    public OneLocalsArray(int i) {
        super(i != 0);
        this.locals = new TypeBearer[i];
    }

    @Override
    public OneLocalsArray copy() {
        OneLocalsArray oneLocalsArray = new OneLocalsArray(this.locals.length);
        System.arraycopy(this.locals, 0, oneLocalsArray.locals, 0, this.locals.length);
        return oneLocalsArray;
    }

    @Override
    public void annotate(ExceptionWithContext exceptionWithContext) {
        for (int i = 0; i < this.locals.length; i++) {
            TypeBearer typeBearer = this.locals[i];
            exceptionWithContext.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("locals[").append(Hex.m7225u2(i)).toString()).append("]: ").toString()).append(typeBearer == null ? "<invalid>" : typeBearer.toString()).toString());
        }
    }

    @Override
    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.locals.length; i++) {
            TypeBearer typeBearer = this.locals[i];
            sb.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("locals[").append(Hex.m7225u2(i)).toString()).append("]: ").toString()).append(typeBearer == null ? "<invalid>" : typeBearer.toString()).toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString());
        }
        return sb.toString();
    }

    @Override
    public void makeInitialized(Type type) {
        int length = this.locals.length;
        if (length != 0) {
            throwIfImmutable();
            Type initializedType = type.getInitializedType();
            for (int i = 0; i < length; i++) {
                if (this.locals[i] == type) {
                    this.locals[i] = initializedType;
                }
            }
        }
    }

    @Override
    public int getMaxLocals() {
        return this.locals.length;
    }

    @Override
    public void mo7133set(int i, TypeBearer typeBearer) {
        TypeBearer typeBearer2;
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            if (frameType.getType().isCategory2()) {
                this.locals[i + 1] = (TypeBearer) null;
            }
            this.locals[i] = frameType;
            if (i == 0 || (typeBearer2 = this.locals[i - 1]) == null || !typeBearer2.getType().isCategory2()) {
                return;
            }
            this.locals[i - 1] = (TypeBearer) null;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    @Override
    public void mo7134set(RegisterSpec registerSpec) {
        mo7133set(registerSpec.getReg(), registerSpec);
    }

    @Override
    public void invalidate(int i) {
        throwIfImmutable();
        this.locals[i] = (TypeBearer) null;
    }

    @Override
    public TypeBearer getOrNull(int i) {
        return this.locals[i];
    }

    @Override
    public TypeBearer mo7132get(int i) {
        TypeBearer typeBearer = this.locals[i];
        if (typeBearer == null) {
            return throwSimException(i, "invalid");
        }
        return typeBearer;
    }

    @Override
    public TypeBearer getCategory1(int i) {
        TypeBearer typeBearerMo7132get = mo7132get(i);
        Type type = typeBearerMo7132get.getType();
        if (type.isUninitialized()) {
            return throwSimException(i, "uninitialized instance");
        }
        if (type.isCategory2()) {
            return throwSimException(i, "category-2");
        }
        return typeBearerMo7132get;
    }

    @Override
    public TypeBearer getCategory2(int i) {
        TypeBearer typeBearerMo7132get = mo7132get(i);
        if (typeBearerMo7132get.getType().isCategory1()) {
            return throwSimException(i, "category-1");
        }
        return typeBearerMo7132get;
    }

    @Override
    public LocalsArray merge(LocalsArray localsArray) {
        return localsArray instanceof OneLocalsArray ? merge((OneLocalsArray) localsArray) : localsArray.merge(this);
    }

    public OneLocalsArray merge(OneLocalsArray oneLocalsArray) {
        try {
            return Merger.mergeLocals(this, oneLocalsArray);
        } catch (SimException e) {
            e.addContext("underlay locals:");
            annotate(e);
            e.addContext("overlay locals:");
            oneLocalsArray.annotate(e);
            throw e;
        }
    }

    @Override
    public LocalsArraySet mergeWithSubroutineCaller(LocalsArray localsArray, int i) {
        return new LocalsArraySet(getMaxLocals()).mergeWithSubroutineCaller(localsArray, i);
    }

    @Override
    protected OneLocalsArray getPrimary() {
        return this;
    }

    private static TypeBearer throwSimException(int i, String str) {
        throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("local ").append(Hex.m7225u2(i)).toString()).append(": ").toString()).append(str).toString());
    }
}
