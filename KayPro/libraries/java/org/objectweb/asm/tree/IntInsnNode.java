package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class IntInsnNode extends AbstractInsnNode {
    public int operand;

    public IntInsnNode(int i, int i2) {
        super(i);
        this.operand = i2;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(this.opcode, this.operand);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new IntInsnNode(this.opcode, this.operand).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 1;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
