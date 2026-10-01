package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class IntSignature implements BaseType {
    private static IntSignature singleton = new IntSignature();

    private IntSignature() {
    }

    public static IntSignature make() {
        return singleton;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitIntSignature(this);
    }
}
