package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class InsnNode extends AbstractInsnNode {
    public InsnNode(int i) {
        super(i);
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(this.opcode);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new InsnNode(this.opcode).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 0;
    }
}
