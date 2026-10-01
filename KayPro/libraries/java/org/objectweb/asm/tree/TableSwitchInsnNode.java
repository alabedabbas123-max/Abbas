package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class TableSwitchInsnNode extends AbstractInsnNode {
    public LabelNode dflt;
    public List labels;

    public int f6683max;

    public int f6684min;

    public TableSwitchInsnNode(int i, int i2, LabelNode labelNode, LabelNode... labelNodeArr) {
        super(170);
        this.f6684min = i;
        this.f6683max = i2;
        this.dflt = labelNode;
        this.labels = new ArrayList();
        if (labelNodeArr != null) {
            this.labels.addAll(Arrays.asList(labelNodeArr));
        }
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        Label[] labelArr = new Label[this.labels.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= labelArr.length) {
                methodVisitor.visitTableSwitchInsn(this.f6684min, this.f6683max, this.dflt.getLabel(), labelArr);
                acceptAnnotations(methodVisitor);
                return;
            } else {
                labelArr[i2] = ((LabelNode) this.labels.get(i2)).getLabel();
                i = i2 + 1;
            }
        }
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        return new TableSwitchInsnNode(this.f6684min, this.f6683max, clone(this.dflt, map), clone(this.labels, map)).cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 11;
    }
}
