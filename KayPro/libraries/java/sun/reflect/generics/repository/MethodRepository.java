package sun.reflect.generics.repository;

import java.lang.reflect.Type;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.tree.MethodTypeSignature;
import sun.reflect.generics.visitor.Reifier;

public class MethodRepository extends ConstructorRepository {
    private Type returnType;

    private MethodRepository(String rawSig, GenericsFactory f) {
        super(rawSig, f);
    }

    public static MethodRepository make(String rawSig, GenericsFactory f) {
        return new MethodRepository(rawSig, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type getReturnType() {
        if (this.returnType == null) {
            Reifier r = getReifier();
            ((MethodTypeSignature) getTree()).getReturnType().accept(r);
            this.returnType = r.getResult();
        }
        return this.returnType;
    }
}
