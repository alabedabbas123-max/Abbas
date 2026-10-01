package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class CharSignature implements BaseType {
    private static CharSignature singleton = new CharSignature();

    private CharSignature() {
    }

    public static CharSignature make() {
        return singleton;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitCharSignature(this);
    }
}
