package javax.lang.model.util;

import javax.lang.model.type.UnionType;

public abstract class AbstractTypeVisitor7<R, P> extends AbstractTypeVisitor6<R, P> {
    @Override
    public abstract R visitUnion(UnionType unionType, P p);

    protected AbstractTypeVisitor7() {
    }
}
