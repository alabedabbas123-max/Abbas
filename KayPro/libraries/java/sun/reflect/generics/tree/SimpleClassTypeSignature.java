package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class SimpleClassTypeSignature implements FieldTypeSignature {
    private boolean dollar;
    private String name;
    private TypeArgument[] typeArgs;

    private SimpleClassTypeSignature(String n, boolean dollar, TypeArgument[] tas) {
        this.name = n;
        this.dollar = dollar;
        this.typeArgs = tas;
    }

    public static SimpleClassTypeSignature make(String n, boolean dollar, TypeArgument[] tas) {
        return new SimpleClassTypeSignature(n, dollar, tas);
    }

    public boolean getDollar() {
        return this.dollar;
    }

    public String getName() {
        return this.name;
    }

    public TypeArgument[] getTypeArguments() {
        return this.typeArgs;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitSimpleClassTypeSignature(this);
    }
}
