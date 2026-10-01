package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class FieldInsnNode extends AbstractInsnNode {
    public String desc;
    public String name;
    public String owner;

    public FieldInsnNode(int i, String str, String str2, String str3) {
        super(i);
        this.owner = str;
        this.name = str2;
        this.desc = str3;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new FieldInsnNode(this.opcode, this.owner, this.name, this.desc).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 4;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
