package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class LookupSwitchInsnNode extends AbstractInsnNode {
    public LabelNode dflt;
    public List keys;
    public List labels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupSwitchInsnNode(LabelNode labelNode, int[] iArr, LabelNode[] labelNodeArr) {
        super(171);
        this.dflt = labelNode;
        this.keys = new ArrayList(iArr == null ? 0 : iArr.length);
        this.labels = new ArrayList(labelNodeArr == null ? 0 : labelNodeArr.length);
        if (iArr != null) {
            for (int i : iArr) {
                this.keys.add(new Integer(i));
            }
        }
        if (labelNodeArr != null) {
            this.labels.addAll(Arrays.asList(labelNodeArr));
        }
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        int[] iArr = new int[this.keys.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = ((Integer) this.keys.get(i)).intValue();
        }
        Label[] labelArr = new Label[this.labels.size()];
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            labelArr[i2] = ((LabelNode) this.labels.get(i2)).getLabel();
        }
        methodVisitor.visitLookupSwitchInsn(this.dflt.getLabel(), iArr, labelArr);
        acceptAnnotations(methodVisitor);
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        LookupSwitchInsnNode lookupSwitchInsnNode = new LookupSwitchInsnNode(clone(this.dflt, map), null, clone(this.labels, map));
        lookupSwitchInsnNode.keys.addAll(this.keys);
        return lookupSwitchInsnNode.cloneAnnotations(this);
    }

    @Override
    public int getType() {
        return 12;
    }
}
