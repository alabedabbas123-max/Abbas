package sun.reflect.generics.scope;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

public abstract class AbstractScope<D extends GenericDeclaration> implements Scope {
    private Scope enclosingScope;
    private D recvr;

    protected abstract Scope computeEnclosingScope();

    protected AbstractScope(D decl) {
        this.recvr = decl;
    }

    protected D getRecvr() {
        return this.recvr;
    }

    protected Scope getEnclosingScope() {
        if (this.enclosingScope == null) {
            this.enclosingScope = computeEnclosingScope();
        }
        return this.enclosingScope;
    }

    @Override
    public TypeVariable<?> lookup(String name) {
        for (TypeVariable<?> typeVariable : getRecvr().getTypeParameters()) {
            if (typeVariable.getName().equals(name)) {
                return typeVariable;
            }
        }
        return getEnclosingScope().lookup(name);
    }
}
