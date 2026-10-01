package javax.lang.model.util;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class SimpleTypeVisitor6<R, P> extends AbstractTypeVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    protected SimpleTypeVisitor6() {
        this.DEFAULT_VALUE = null;
    }

    protected SimpleTypeVisitor6(R defaultValue) {
        this.DEFAULT_VALUE = defaultValue;
    }

    protected R defaultAction(TypeMirror e, P p) {
        return this.DEFAULT_VALUE;
    }

    @Override
    public R visitPrimitive(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitNull(NullType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitArray(ArrayType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitDeclared(DeclaredType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitError(ErrorType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitTypeVariable(TypeVariable t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitWildcard(WildcardType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitExecutable(ExecutableType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitNoType(NoType t, P p) {
        return defaultAction(t, p);
    }
}
