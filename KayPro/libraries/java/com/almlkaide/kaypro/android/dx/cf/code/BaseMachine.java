package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import java.util.ArrayList;

public abstract class BaseMachine implements Machine {
    private int argCount;
    private TypeBearer[] args;
    private SwitchList auxCases;
    private Constant auxCst;
    private ArrayList<Constant> auxInitValues;
    private int auxInt;
    private int auxTarget;
    private Type auxType;
    private int localIndex;
    private boolean localInfo;
    private RegisterSpec localTarget;
    private final Prototype prototype;
    private int resultCount;
    private TypeBearer[] results;

    public BaseMachine(Prototype prototype) {
        if (prototype == null) {
            throw new NullPointerException("prototype == null");
        }
        this.prototype = prototype;
        this.args = new TypeBearer[10];
        this.results = new TypeBearer[6];
        clearArgs();
    }

    @Override
    public Prototype getPrototype() {
        return this.prototype;
    }

    @Override
    public final void clearArgs() {
        this.argCount = 0;
        this.auxType = (Type) null;
        this.auxInt = 0;
        this.auxCst = (Constant) null;
        this.auxTarget = 0;
        this.auxCases = (SwitchList) null;
        this.auxInitValues = (ArrayList) null;
        this.localIndex = -1;
        this.localInfo = false;
        this.localTarget = (RegisterSpec) null;
        this.resultCount = -1;
    }

    @Override
    public final void popArgs(Frame frame, int i) {
        ExecutionStack stack = frame.getStack();
        clearArgs();
        if (i > this.args.length) {
            this.args = new TypeBearer[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.args[i2] = stack.m7125pop();
        }
        this.argCount = i;
    }

    @Override
    public void popArgs(Frame frame, Prototype prototype) {
        StdTypeList parameterTypes = prototype.getParameterTypes();
        int size = parameterTypes.size();
        popArgs(frame, size);
        for (int i = 0; i < size; i++) {
            if (!Merger.isPossiblyAssignableFrom(parameterTypes.getType(i), this.args[i])) {
                throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("at stack depth ").append((size - 1) - i).toString()).append(", expected type ").toString()).append(parameterTypes.getType(i).toHuman()).toString()).append(" but found ").toString()).append(this.args[i].getType().toHuman()).toString());
            }
        }
    }

    @Override
    public final void popArgs(Frame frame, Type type) {
        popArgs(frame, 1);
        if (!Merger.isPossiblyAssignableFrom(type, this.args[0])) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("expected type ").append(type.toHuman()).toString()).append(" but found ").toString()).append(this.args[0].getType().toHuman()).toString());
        }
    }

    @Override
    public final void popArgs(Frame frame, Type type, Type type2) {
        popArgs(frame, 2);
        if (!Merger.isPossiblyAssignableFrom(type, this.args[0])) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("expected type ").append(type.toHuman()).toString()).append(" but found ").toString()).append(this.args[0].getType().toHuman()).toString());
        }
        if (!Merger.isPossiblyAssignableFrom(type2, this.args[1])) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("expected type ").append(type2.toHuman()).toString()).append(" but found ").toString()).append(this.args[1].getType().toHuman()).toString());
        }
    }

    @Override
    public final void popArgs(Frame frame, Type type, Type type2, Type type3) {
        popArgs(frame, 3);
        if (!Merger.isPossiblyAssignableFrom(type, this.args[0])) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("expected type ").append(type.toHuman()).toString()).append(" but found ").toString()).append(this.args[0].getType().toHuman()).toString());
        }
        if (!Merger.isPossiblyAssignableFrom(type2, this.args[1])) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("expected type ").append(type2.toHuman()).toString()).append(" but found ").toString()).append(this.args[1].getType().toHuman()).toString());
        }
        if (!Merger.isPossiblyAssignableFrom(type3, this.args[2])) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("expected type ").append(type3.toHuman()).toString()).append(" but found ").toString()).append(this.args[2].getType().toHuman()).toString());
        }
    }

    @Override
    public final void localArg(Frame frame, int i) {
        clearArgs();
        this.args[0] = frame.getLocals().mo7132get(i);
        this.argCount = 1;
        this.localIndex = i;
    }

    @Override
    public final void localInfo(boolean z) {
        this.localInfo = z;
    }

    @Override
    public final void auxType(Type type) {
        this.auxType = type;
    }

    @Override
    public final void auxIntArg(int i) {
        this.auxInt = i;
    }

    @Override
    public final void auxCstArg(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        this.auxCst = constant;
    }

    @Override
    public final void auxTargetArg(int i) {
        this.auxTarget = i;
    }

    @Override
    public final void auxSwitchArg(SwitchList switchList) {
        if (switchList == null) {
            throw new NullPointerException("cases == null");
        }
        this.auxCases = switchList;
    }

    @Override
    public final void auxInitValues(ArrayList<Constant> arrayList) {
        this.auxInitValues = arrayList;
    }

    @Override
    public final void localTarget(int i, Type type, LocalItem localItem) {
        this.localTarget = RegisterSpec.makeLocalOptional(i, type, localItem);
    }

    protected final int argCount() {
        return this.argCount;
    }

    protected final int argWidth() {
        int category = 0;
        int i = 0;
        while (true) {
            int i2 = category;
            if (i < this.argCount) {
                category = this.args[i].getType().getCategory() + i2;
                i++;
            } else {
                return i2;
            }
        }
    }

    protected final TypeBearer m7114arg(int i) {
        if (i >= this.argCount) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.args[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    protected final Type getAuxType() {
        return this.auxType;
    }

    protected final int getAuxInt() {
        return this.auxInt;
    }

    protected final Constant getAuxCst() {
        return this.auxCst;
    }

    protected final int getAuxTarget() {
        return this.auxTarget;
    }

    protected final SwitchList getAuxCases() {
        return this.auxCases;
    }

    protected final ArrayList<Constant> getInitValues() {
        return this.auxInitValues;
    }

    protected final int getLocalIndex() {
        return this.localIndex;
    }

    protected final boolean getLocalInfo() {
        return this.localInfo;
    }

    protected final RegisterSpec getLocalTarget(boolean z) {
        if (this.localTarget == null) {
            return (RegisterSpec) null;
        }
        if (this.resultCount != 1) {
            throw new SimException(new StringBuffer().append(new StringBuffer().append("local target with ").append(this.resultCount == 0 ? "no" : "multiple").toString()).append(" results").toString());
        }
        TypeBearer typeBearer = this.results[0];
        Type type = typeBearer.getType();
        Type type2 = this.localTarget.getType();
        if (type == type2) {
            if (z) {
                return this.localTarget.withType(typeBearer);
            }
            return this.localTarget;
        }
        if (!Merger.isPossiblyAssignableFrom(type2, type)) {
            throwLocalMismatch(type, type2);
            return (RegisterSpec) null;
        }
        if (type2 == Type.OBJECT) {
            this.localTarget = this.localTarget.withType(typeBearer);
        }
        return this.localTarget;
    }

    protected final void clearResult() {
        this.resultCount = 0;
    }

    protected final void setResult(TypeBearer typeBearer) {
        if (typeBearer == null) {
            throw new NullPointerException("result == null");
        }
        this.results[0] = typeBearer;
        this.resultCount = 1;
    }

    protected final void addResult(TypeBearer typeBearer) {
        if (typeBearer == null) {
            throw new NullPointerException("result == null");
        }
        this.results[this.resultCount] = typeBearer;
        this.resultCount++;
    }

    protected final int resultCount() {
        if (this.resultCount < 0) {
            throw new SimException("results never set");
        }
        return this.resultCount;
    }

    protected final int resultWidth() {
        int category = 0;
        int i = 0;
        while (true) {
            int i2 = category;
            if (i < this.resultCount) {
                category = this.results[i].getType().getCategory() + i2;
                i++;
            } else {
                return i2;
            }
        }
    }

    protected final TypeBearer result(int i) {
        if (i >= this.resultCount) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.results[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    protected final void storeResults(Frame frame) {
        if (this.resultCount < 0) {
            throw new SimException("results never set");
        }
        if (this.resultCount != 0) {
            if (this.localTarget != null) {
                frame.getLocals().mo7134set(getLocalTarget(false));
                return;
            }
            ExecutionStack stack = frame.getStack();
            for (int i = 0; i < this.resultCount; i++) {
                if (this.localInfo) {
                    stack.setLocal();
                }
                stack.push(this.results[i]);
            }
        }
    }

    public static void throwLocalMismatch(TypeBearer typeBearer, TypeBearer typeBearer2) {
        throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("local variable type mismatch: ").append("attempt to set or access a value of type ").toString()).append(typeBearer.toHuman()).toString()).append(" using a local variable of type ").toString()).append(typeBearer2.toHuman()).toString()).append(". This is symptomatic of .class transformation tools ").toString()).append("that ignore local variable information.").toString());
    }
}
