package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.Visitor;

public class MethodTypeSignature implements Signature {
    private FieldTypeSignature[] exceptionTypes;
    private FormalTypeParameter[] formalTypeParams;
    private TypeSignature[] parameterTypes;
    private ReturnType returnType;

    private MethodTypeSignature(FormalTypeParameter[] ftps, TypeSignature[] pts, ReturnType rt, FieldTypeSignature[] ets) {
        this.formalTypeParams = ftps;
        this.parameterTypes = pts;
        this.returnType = rt;
        this.exceptionTypes = ets;
    }

    public static MethodTypeSignature make(FormalTypeParameter[] ftps, TypeSignature[] pts, ReturnType rt, FieldTypeSignature[] ets) {
        return new MethodTypeSignature(ftps, pts, rt, ets);
    }

    @Override
    public FormalTypeParameter[] getFormalTypeParameters() {
        return this.formalTypeParams;
    }

    public TypeSignature[] getParameterTypes() {
        return this.parameterTypes;
    }

    public ReturnType getReturnType() {
        return this.returnType;
    }

    public FieldTypeSignature[] getExceptionTypes() {
        return this.exceptionTypes;
    }

    public void accept(Visitor v) {
        v.visitMethodTypeSignature(this);
    }
}
