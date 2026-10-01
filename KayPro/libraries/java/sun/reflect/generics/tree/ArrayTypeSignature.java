package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class ArrayTypeSignature implements FieldTypeSignature {
    private TypeSignature componentType;

    private ArrayTypeSignature(TypeSignature ct) {
        this.componentType = ct;
    }

    public static ArrayTypeSignature make(TypeSignature ct) {
        return new ArrayTypeSignature(ct);
    }

    public TypeSignature getComponentType() {
        return this.componentType;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitArrayTypeSignature(this);
    }
}
