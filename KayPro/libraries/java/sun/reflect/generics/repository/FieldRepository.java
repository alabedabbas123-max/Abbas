package sun.reflect.generics.repository;

import java.lang.reflect.Type;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.parser.SignatureParser;
import sun.reflect.generics.tree.TypeSignature;
import sun.reflect.generics.visitor.Reifier;

public class FieldRepository extends AbstractRepository<TypeSignature> {
    private Type genericType;

    protected FieldRepository(String rawSig, GenericsFactory f) {
        super(rawSig, f);
    }

    @Override
    public TypeSignature parse(String s) {
        return SignatureParser.make().parseTypeSig(s);
    }

    public static FieldRepository make(String rawSig, GenericsFactory f) {
        return new FieldRepository(rawSig, f);
    }

    public Type getGenericType() {
        if (this.genericType == null) {
            Reifier r = getReifier();
            getTree().accept(r);
            this.genericType = r.getResult();
        }
        return this.genericType;
    }
}
