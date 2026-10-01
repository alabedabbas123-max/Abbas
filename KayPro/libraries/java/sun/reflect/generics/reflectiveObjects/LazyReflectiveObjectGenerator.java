package sun.reflect.generics.reflectiveObjects;

import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.visitor.Reifier;

public abstract class LazyReflectiveObjectGenerator {
    private GenericsFactory factory;

    protected LazyReflectiveObjectGenerator(GenericsFactory f) {
        this.factory = f;
    }

    private GenericsFactory getFactory() {
        return this.factory;
    }

    protected Reifier getReifier() {
        return Reifier.make(getFactory());
    }
}
