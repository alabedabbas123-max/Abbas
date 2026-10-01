package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class ShortSignature implements BaseType {
    private static ShortSignature singleton = new ShortSignature();

    private ShortSignature() {
    }

    public static ShortSignature make() {
        return singleton;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitShortSignature(this);
    }
}
