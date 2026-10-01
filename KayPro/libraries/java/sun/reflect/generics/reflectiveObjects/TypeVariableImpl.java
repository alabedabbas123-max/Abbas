package sun.reflect.generics.reflectiveObjects;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.tree.FieldTypeSignature;
import sun.reflect.generics.visitor.Reifier;

public class TypeVariableImpl<D extends GenericDeclaration> extends LazyReflectiveObjectGenerator implements TypeVariable<D> {
    static final boolean $assertionsDisabled = false;
    private FieldTypeSignature[] boundASTs;
    private Type[] bounds;
    D genericDeclaration;
    private String name;

    private TypeVariableImpl(D decl, String n, FieldTypeSignature[] bs, GenericsFactory f) {
        super(f);
        this.genericDeclaration = decl;
        this.name = n;
        this.boundASTs = bs;
    }

    private FieldTypeSignature[] getBoundASTs() {
        return this.boundASTs;
    }

    public static <T extends GenericDeclaration> TypeVariableImpl<T> make(T decl, String name, FieldTypeSignature[] bs, GenericsFactory f) {
        return new TypeVariableImpl<>(decl, name, bs, f);
    }

    @Override
    public Type[] getBounds() {
        if (this.bounds == null) {
            FieldTypeSignature[] fts = getBoundASTs();
            Type[] ts = new Type[fts.length];
            for (int j = 0; j < fts.length; j++) {
                Reifier r = getReifier();
                fts[j].accept(r);
                ts[j] = r.getResult();
            }
            this.bounds = ts;
        }
        return (Type[]) this.bounds.clone();
    }

    @Override
    public D getGenericDeclaration() {
        return this.genericDeclaration;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName();
    }

    public boolean equals(Object o) {
        if (!(o instanceof TypeVariable)) {
            return false;
        }
        TypeVariable that = (TypeVariable) o;
        GenericDeclaration thatDecl = that.getGenericDeclaration();
        String thatName = that.getName();
        D d = this.genericDeclaration;
        if (d == null) {
            if (thatDecl != null) {
                return false;
            }
        } else if (!d.equals(thatDecl)) {
            return false;
        }
        String str = this.name;
        if (str == null) {
            if (thatName != null) {
                return false;
            }
        } else if (!str.equals(thatName)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.genericDeclaration.hashCode() ^ this.name.hashCode();
    }
}
