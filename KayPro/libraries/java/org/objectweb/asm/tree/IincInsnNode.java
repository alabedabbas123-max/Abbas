package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class IincInsnNode extends AbstractInsnNode {
    public int incr;

    public int f6677var;

    public IincInsnNode(int i, int i2) {
        super(132);
        this.f6677var = i;
        this.incr = i2;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitIincInsn(this.f6677var, this.incr);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new IincInsnNode(this.f6677var, this.incr).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 10;
    }
}
