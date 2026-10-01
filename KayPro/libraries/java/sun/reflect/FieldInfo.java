package sun.reflect;

import java.lang.reflect.Modifier;

public class FieldInfo {
    private int modifiers;
    private String name;
    private String signature;
    private int slot;

    FieldInfo() {
    }

    public String name() {
        return this.name;
    }

    public String signature() {
        return this.signature;
    }

    public int modifiers() {
        return this.modifiers;
    }

    public int slot() {
        return this.slot;
    }

    public boolean isPublic() {
        return Modifier.isPublic(modifiers());
    }
}
