package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class LabelNode extends AbstractInsnNode {
    private Label label;

    public LabelNode() {
        super(-1);
    }

    public LabelNode(Label label) {
        super(-1);
        this.label = label;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLabel(getLabel());
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return (AbstractInsnNode) map.get(this);
    }

    public Label getLabel() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }

    @Override
    public int getType() {
        return 8;
    }

    public void resetLabel() {
        this.label = null;
    }
}
