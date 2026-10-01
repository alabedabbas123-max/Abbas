package sun.reflect.generics.scope;

import java.lang.reflect.TypeVariable;

public class DummyScope implements Scope {
    private static DummyScope singleton = new DummyScope();

    private DummyScope() {
    }

    public static DummyScope make() {
        return singleton;
    }

    @Override
    public TypeVariable<?> lookup(String name) {
        return null;
    }
}
