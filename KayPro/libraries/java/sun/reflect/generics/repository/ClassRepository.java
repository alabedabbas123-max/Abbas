package sun.reflect.generics.repository;

import java.lang.reflect.Type;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.parser.SignatureParser;
import sun.reflect.generics.tree.ClassSignature;
import sun.reflect.generics.tree.TypeTree;
import sun.reflect.generics.visitor.Reifier;

public class ClassRepository extends GenericDeclRepository<ClassSignature> {
    private Type[] superInterfaces;
    private Type superclass;

    private ClassRepository(String rawSig, GenericsFactory f) {
        super(rawSig, f);
    }

    @Override
    public ClassSignature parse(String s) {
        return SignatureParser.make().parseClassSig(s);
    }

    public static ClassRepository make(String rawSig, GenericsFactory f) {
        return new ClassRepository(rawSig, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type getSuperclass() {
        if (this.superclass == null) {
            Reifier r = getReifier();
            ((ClassSignature) getTree()).getSuperclass().accept(r);
            this.superclass = r.getResult();
        }
        return this.superclass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type[] getSuperInterfaces() {
        if (this.superInterfaces == null) {
            TypeTree[] ts = ((ClassSignature) getTree()).getSuperInterfaces();
            Type[] sis = new Type[ts.length];
            for (int i = 0; i < ts.length; i++) {
                Reifier r = getReifier();
                ts[i].accept(r);
                sis[i] = r.getResult();
            }
            this.superInterfaces = sis;
        }
        return (Type[]) this.superInterfaces.clone();
    }
}
