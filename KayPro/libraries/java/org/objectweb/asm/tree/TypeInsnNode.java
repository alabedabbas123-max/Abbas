package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class TypeInsnNode extends AbstractInsnNode {
    public String desc;

    public TypeInsnNode(int i, String str) {
        super(i);
        this.desc = str;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(this.opcode, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new TypeInsnNode(this.opcode, this.desc).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 3;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
