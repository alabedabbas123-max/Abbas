package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.IntList;

public final class Frame {
    private final LocalsArray locals;
    private final ExecutionStack stack;
    private final IntList subroutines;

    Frame(LocalsArray localsArray, ExecutionStack executionStack) {
        this(localsArray, executionStack, IntList.EMPTY);
    }

    Frame(LocalsArray localsArray, ExecutionStack executionStack, IntList intList) {
        if (localsArray == null) {
            throw new NullPointerException("locals == null");
        }
        if (executionStack == null) {
            throw new NullPointerException("stack == null");
        }
        intList.throwIfMutable();
        this.locals = localsArray;
        this.stack = executionStack;
        this.subroutines = intList;
    }

    public Frame(int i, int i2) {
        this(new OneLocalsArray(i), new ExecutionStack(i2));
    }

    public Frame copy() {
        return new Frame(this.locals.copy(), this.stack.copy(), this.subroutines);
    }

    public void setImmutable() {
        this.locals.setImmutable();
        this.stack.setImmutable();
    }

    public void makeInitialized(Type type) {
        this.locals.makeInitialized(type);
        this.stack.makeInitialized(type);
    }

    public LocalsArray getLocals() {
        return this.locals;
    }

    public ExecutionStack getStack() {
        return this.stack;
    }

    public IntList getSubroutines() {
        return this.subroutines;
    }

    public void initializeWithParameters(StdTypeList stdTypeList) {
        int size = stdTypeList.size();
        int i = 0;
        int category = 0;
        while (i < size) {
            Type typeM7197get = stdTypeList.m7197get(i);
            this.locals.mo7133set(category, typeM7197get);
            i++;
            category = typeM7197get.getCategory() + category;
        }
    }

    public Frame subFrameForLabel(int i, int i2) {
        LocalsArray localsArraySubArrayForLabel = (LocalsArray) null;
        if (this.locals instanceof LocalsArraySet) {
            localsArraySubArrayForLabel = ((LocalsArraySet) this.locals).subArrayForLabel(i2);
        }
        try {
            IntList intListMutableCopy = this.subroutines.mutableCopy();
            if (intListMutableCopy.m7232pop() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            intListMutableCopy.setImmutable();
            return localsArraySubArrayForLabel == null ? (Frame) null : new Frame(localsArraySubArrayForLabel, this.stack, intListMutableCopy);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException e2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    public Frame mergeWith(Frame frame) {
        LocalsArray localsArrayMerge = getLocals().merge(frame.getLocals());
        ExecutionStack executionStackMerge = getStack().merge(frame.getStack());
        IntList intListMergeSubroutineLists = mergeSubroutineLists(frame.subroutines);
        LocalsArray localsArrayAdjustLocalsForSubroutines = adjustLocalsForSubroutines(localsArrayMerge, intListMergeSubroutineLists);
        return (localsArrayAdjustLocalsForSubroutines == getLocals() && executionStackMerge == getStack() && this.subroutines == intListMergeSubroutineLists) ? this : new Frame(localsArrayAdjustLocalsForSubroutines, executionStackMerge, intListMergeSubroutineLists);
    }

    private IntList mergeSubroutineLists(IntList intList) {
        if (this.subroutines.equals(intList)) {
            return this.subroutines;
        }
        IntList intList2 = new IntList();
        int size = this.subroutines.size();
        int size2 = intList.size();
        for (int i = 0; i < size && i < size2 && this.subroutines.m7231get(i) == intList.m7231get(i); i++) {
            intList2.m7230add(i);
        }
        intList2.setImmutable();
        return intList2;
    }

    private static LocalsArray adjustLocalsForSubroutines(LocalsArray localsArray, IntList intList) {
        if (localsArray instanceof LocalsArraySet) {
            LocalsArraySet localsArraySet = (LocalsArraySet) localsArray;
            if (intList.size() == 0) {
                return localsArraySet.getPrimary();
            }
            return localsArraySet;
        }
        return localsArray;
    }

    public Frame mergeWithSubroutineCaller(Frame frame, int i, int i2) {
        IntList intList;
        IntList intList2;
        LocalsArraySet localsArraySetMergeWithSubroutineCaller = getLocals().mergeWithSubroutineCaller(frame.getLocals(), i2);
        ExecutionStack executionStackMerge = getStack().merge(frame.getStack());
        IntList intListMutableCopy = frame.subroutines.mutableCopy();
        intListMutableCopy.m7230add(i);
        intListMutableCopy.setImmutable();
        if (localsArraySetMergeWithSubroutineCaller != getLocals() || executionStackMerge != getStack() || !this.subroutines.equals(intListMutableCopy)) {
            if (this.subroutines.equals(intListMutableCopy)) {
                intList2 = this.subroutines;
            } else {
                if (this.subroutines.size() > intListMutableCopy.size()) {
                    intList2 = this.subroutines;
                    intList = intListMutableCopy;
                } else {
                    intList = this.subroutines;
                    intList2 = intListMutableCopy;
                }
                int size = intList2.size();
                int size2 = intList.size();
                for (int i3 = size2 - 1; i3 >= 0; i3--) {
                    if (intList.m7231get(i3) != intList2.m7231get((size - size2) + i3)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
            }
            return new Frame(localsArraySetMergeWithSubroutineCaller, executionStackMerge, intList2);
        }
        return this;
    }

    public Frame makeNewSubroutineStartFrame(int i, int i2) {
        this.subroutines.mutableCopy().m7230add(i);
        return new Frame(this.locals.getPrimary(), this.stack, IntList.makeImmutable(i)).mergeWithSubroutineCaller(this, i, i2);
    }

    public Frame makeExceptionHandlerStartFrame(CstType cstType) {
        ExecutionStack executionStackCopy = getStack().copy();
        executionStackCopy.clear();
        executionStackCopy.push(cstType);
        return new Frame(getLocals(), executionStackCopy, this.subroutines);
    }

    public void annotate(ExceptionWithContext exceptionWithContext) {
        this.locals.annotate(exceptionWithContext);
        this.stack.annotate(exceptionWithContext);
    }
}
