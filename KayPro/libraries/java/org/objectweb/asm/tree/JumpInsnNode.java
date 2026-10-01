package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class JumpInsnNode extends AbstractInsnNode {
    public LabelNode label;

    public JumpInsnNode(int i, LabelNode labelNode) {
        super(i);
        this.label = labelNode;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitJumpInsn(this.opcode, this.label.getLabel());
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new JumpInsnNode(this.opcode, clone(this.label, map)).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 7;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
