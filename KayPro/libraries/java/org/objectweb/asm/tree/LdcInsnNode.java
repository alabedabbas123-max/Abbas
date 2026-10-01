package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class LdcInsnNode extends AbstractInsnNode {

    public Object f6679cst;

    public LdcInsnNode(Object obj) {
        super(18);
        this.f6679cst = obj;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(this.f6679cst);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new LdcInsnNode(this.f6679cst).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 9;
    }
}
