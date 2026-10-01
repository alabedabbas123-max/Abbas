package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class MultiANewArrayInsnNode extends AbstractInsnNode {
    public String desc;
    public int dims;

    public MultiANewArrayInsnNode(String str, int i) {
        super(197);
        this.desc = str;
        this.dims = i;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMultiANewArrayInsn(this.desc, this.dims);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new MultiANewArrayInsnNode(this.desc, this.dims).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 13;
    }
}
