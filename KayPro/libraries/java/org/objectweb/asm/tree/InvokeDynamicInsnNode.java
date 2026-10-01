package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;

public class InvokeDynamicInsnNode extends AbstractInsnNode {

    public Handle f6678bsm;
    public Object[] bsmArgs;
    public String desc;
    public String name;

    public InvokeDynamicInsnNode(String str, String str2, Handle handle, Object... objArr) {
        super(186);
        this.name = str;
        this.desc = str2;
        this.f6678bsm = handle;
        this.bsmArgs = objArr;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitInvokeDynamicInsn(this.name, this.desc, this.f6678bsm, this.bsmArgs);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new InvokeDynamicInsnNode(this.name, this.desc, this.f6678bsm, this.bsmArgs).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 6;
    }
}
