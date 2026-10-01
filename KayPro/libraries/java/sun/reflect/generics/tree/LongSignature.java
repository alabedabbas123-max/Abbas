package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class LongSignature implements BaseType {
    private static LongSignature singleton = new LongSignature();

    private LongSignature() {
    }

    public static LongSignature make() {
        return singleton;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitLongSignature(this);
    }
}
