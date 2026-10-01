package org.objectweb.asm.tree.analysis;

import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;

public class SourceValue implements Value {
    public final Set insns;
    public final int size;

    public SourceValue(int i) {
        this(i, SmallSet.emptySet());
    }

    public SourceValue(int i, Set set) {
        this.size = i;
        this.insns = set;
    }

    public SourceValue(int i, AbstractInsnNode abstractInsnNode) {
        this.size = i;
        this.insns = new SmallSet(abstractInsnNode, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourceValue)) {
            return false;
        }
        SourceValue sourceValue = (SourceValue) obj;
        return this.size == sourceValue.size && this.insns.equals(sourceValue.insns);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.insns.hashCode();
    }
}
