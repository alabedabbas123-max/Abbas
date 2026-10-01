package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class BooleanSignature implements BaseType {
    private static BooleanSignature singleton = new BooleanSignature();

    private BooleanSignature() {
    }

    public static BooleanSignature make() {
        return singleton;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitBooleanSignature(this);
    }
}
