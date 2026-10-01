package sun.reflect.generics.repository;

import java.lang.reflect.TypeVariable;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.tree.FormalTypeParameter;
import sun.reflect.generics.tree.Signature;
import sun.reflect.generics.visitor.Reifier;

public abstract class GenericDeclRepository<S extends Signature> extends AbstractRepository<S> {
    private TypeVariable[] typeParams;

    protected GenericDeclRepository(String rawSig, GenericsFactory f) {
        super(rawSig, f);
    }

    public TypeVariable[] getTypeParameters() {
        if (this.typeParams == null) {
            FormalTypeParameter[] ftps = getTree().getFormalTypeParameters();
            TypeVariable[] tps = new TypeVariable[ftps.length];
            for (int i = 0; i < ftps.length; i++) {
                Reifier r = getReifier();
                ftps[i].accept(r);
                tps[i] = (TypeVariable) r.getResult();
            }
            this.typeParams = tps;
        }
        return (TypeVariable[]) this.typeParams.clone();
    }
}
