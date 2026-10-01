package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.MutabilityControl;

public final class ExecutionStack extends MutabilityControl {
    private final boolean[] local;
    private final TypeBearer[] stack;
    private int stackPtr;

    public ExecutionStack(int i) {
        super(i != 0);
        this.stack = new TypeBearer[i];
        this.local = new boolean[i];
        this.stackPtr = 0;
    }

    public ExecutionStack copy() {
        ExecutionStack executionStack = new ExecutionStack(this.stack.length);
        System.arraycopy(this.stack, 0, executionStack.stack, 0, this.stack.length);
        System.arraycopy(this.local, 0, executionStack.local, 0, this.local.length);
        executionStack.stackPtr = this.stackPtr;
        return executionStack;
    }

    public void annotate(ExceptionWithContext exceptionWithContext) {
        int i = this.stackPtr - 1;
        int i2 = 0;
        while (i2 <= i) {
            exceptionWithContext.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("stack[").append(i2 == i ? "top0" : Hex.m7225u2(i - i2)).toString()).append("]: ").toString()).append(stackElementString(this.stack[i2])).toString());
            i2++;
        }
    }

    public void makeInitialized(Type type) {
        if (this.stackPtr != 0) {
            throwIfImmutable();
            Type initializedType = type.getInitializedType();
            for (int i = 0; i < this.stackPtr; i++) {
                if (this.stack[i] == type) {
                    this.stack[i] = initializedType;
                }
            }
        }
    }

    public int getMaxStack() {
        return this.stack.length;
    }

    public int size() {
        return this.stackPtr;
    }

    public void clear() {
        throwIfImmutable();
        for (int i = 0; i < this.stackPtr; i++) {
            this.stack[i] = (TypeBearer) null;
            this.local[i] = false;
        }
        this.stackPtr = 0;
    }

    public void push(TypeBearer typeBearer) {
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            int category = frameType.getType().getCategory();
            if (this.stackPtr + category > this.stack.length) {
                throwSimException("overflow");
                return;
            }
            if (category == 2) {
                this.stack[this.stackPtr] = (TypeBearer) null;
                this.stackPtr++;
            }
            this.stack[this.stackPtr] = frameType;
            this.stackPtr++;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    public void setLocal() {
        throwIfImmutable();
        this.local[this.stackPtr] = true;
    }

    public TypeBearer peek(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        return i >= this.stackPtr ? throwSimException("underflow") : this.stack[(this.stackPtr - i) - 1];
    }

    public boolean peekLocal(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i >= this.stackPtr) {
            throw new SimException("stack: underflow");
        }
        return this.local[(this.stackPtr - i) - 1];
    }

    public Type peekType(int i) {
        return peek(i).getType();
    }

    public TypeBearer m7125pop() {
        throwIfImmutable();
        TypeBearer typeBearerPeek = peek(0);
        this.stack[this.stackPtr - 1] = (TypeBearer) null;
        this.local[this.stackPtr - 1] = false;
        this.stackPtr -= typeBearerPeek.getType().getCategory();
        return typeBearerPeek;
    }

    public void change(int i, TypeBearer typeBearer) {
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            int i2 = (this.stackPtr - i) - 1;
            TypeBearer typeBearer2 = this.stack[i2];
            if (typeBearer2 == null || typeBearer2.getType().getCategory() != frameType.getType().getCategory()) {
                throwSimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("incompatible substitution: ").append(stackElementString(typeBearer2)).toString()).append(" -> ").toString()).append(stackElementString(frameType)).toString());
            }
            this.stack[i2] = frameType;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    public ExecutionStack merge(ExecutionStack executionStack) {
        try {
            return Merger.mergeStack(this, executionStack);
        } catch (SimException e) {
            e.addContext("underlay stack:");
            annotate(e);
            e.addContext("overlay stack:");
            executionStack.annotate(e);
            throw e;
        }
    }

    private static String stackElementString(TypeBearer typeBearer) {
        return typeBearer == null ? "<invalid>" : typeBearer.toString();
    }

    private static TypeBearer throwSimException(String str) {
        throw new SimException(new StringBuffer().append("stack: ").append(str).toString());
    }
}
