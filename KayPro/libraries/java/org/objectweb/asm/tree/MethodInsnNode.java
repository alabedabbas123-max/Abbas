package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class MethodInsnNode extends AbstractInsnNode {
    public String desc;

    public boolean f6682itf;
    public String name;
    public String owner;

    public MethodInsnNode(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, i == 185);
    }

    public MethodInsnNode(int i, String str, String str2, String str3, boolean z) {
        super(i);
        this.owner = str;
        this.name = str2;
        this.desc = str3;
        this.f6682itf = z;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(this.opcode, this.owner, this.name, this.desc, this.f6682itf);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new MethodInsnNode(this.opcode, this.owner, this.name, this.desc, this.f6682itf);
    }

    @Override
    public int getType() {
        return 5;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
