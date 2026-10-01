package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class LineNumberNode extends AbstractInsnNode {
    public int line;
    public LabelNode start;

    public LineNumberNode(int i, LabelNode labelNode) {
        super(-1);
        this.line = i;
        this.start = labelNode;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLineNumber(this.line, this.start.getLabel());
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new LineNumberNode(this.line, clone(this.start, map));
    }

    @Override
    public int getType() {
        return 15;
    }
}
