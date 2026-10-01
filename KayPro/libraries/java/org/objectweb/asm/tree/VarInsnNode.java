package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class VarInsnNode extends AbstractInsnNode {

    public int f6686var;

    public VarInsnNode(int i, int i2) {
        super(i);
        this.f6686var = i2;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(this.opcode, this.f6686var);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new VarInsnNode(this.opcode, this.f6686var).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 2;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
