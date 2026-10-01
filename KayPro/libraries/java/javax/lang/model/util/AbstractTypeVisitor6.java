package javax.lang.model.util;

import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVisitor;
import javax.lang.model.type.UnionType;
import javax.lang.model.type.UnknownTypeException;

public abstract class AbstractTypeVisitor6<R, P> implements TypeVisitor<R, P> {
    protected AbstractTypeVisitor6() {
    }

    @Override
    public final R visit(TypeMirror typeMirror, P p) {
        return (R) typeMirror.accept(this, p);
    }

    @Override
    public final R visit(TypeMirror typeMirror) {
        return (R) typeMirror.accept(this, null);
    }

    @Override
    public R visitUnion(UnionType t, P p) {
        return visitUnknown(t, p);
    }

    @Override
    public R visitUnknown(TypeMirror t, P p) {
        throw new UnknownTypeException(t, p);
    }
}
