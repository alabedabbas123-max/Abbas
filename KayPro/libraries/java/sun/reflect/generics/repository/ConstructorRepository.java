package sun.reflect.generics.repository;

import java.lang.reflect.Type;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.parser.SignatureParser;
import sun.reflect.generics.tree.FieldTypeSignature;
import sun.reflect.generics.tree.MethodTypeSignature;
import sun.reflect.generics.tree.TypeSignature;
import sun.reflect.generics.visitor.Reifier;

public class ConstructorRepository extends GenericDeclRepository<MethodTypeSignature> {
    private Type[] exceptionTypes;
    private Type[] paramTypes;

    protected ConstructorRepository(String rawSig, GenericsFactory f) {
        super(rawSig, f);
    }

    @Override
    public MethodTypeSignature parse(String s) {
        return SignatureParser.make().parseMethodSig(s);
    }

    public static ConstructorRepository make(String rawSig, GenericsFactory f) {
        return new ConstructorRepository(rawSig, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type[] getParameterTypes() {
        if (this.paramTypes == null) {
            TypeSignature[] pts = ((MethodTypeSignature) getTree()).getParameterTypes();
            Type[] ps = new Type[pts.length];
            for (int i = 0; i < pts.length; i++) {
                Reifier r = getReifier();
                pts[i].accept(r);
                ps[i] = r.getResult();
            }
            this.paramTypes = ps;
        }
        return (Type[]) this.paramTypes.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type[] getExceptionTypes() {
        if (this.exceptionTypes == null) {
            FieldTypeSignature[] ets = ((MethodTypeSignature) getTree()).getExceptionTypes();
            Type[] es = new Type[ets.length];
            for (int i = 0; i < ets.length; i++) {
                Reifier r = getReifier();
                ets[i].accept(r);
                es[i] = r.getResult();
            }
            this.exceptionTypes = es;
        }
        return (Type[]) this.exceptionTypes.clone();
    }
}
