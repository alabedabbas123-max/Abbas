package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class DoubleSignature implements BaseType {
    private static DoubleSignature singleton = new DoubleSignature();

    private DoubleSignature() {
    }

    public static DoubleSignature make() {
        return singleton;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitDoubleSignature(this);
    }
}
