package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class FrameNode extends AbstractInsnNode {
    public List local;
    public List stack;
    public int type;

    private FrameNode() {
        super(-1);
    }

    public FrameNode(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super(-1);
        this.type = i;
        switch (i) {
            case -1:
            case 0:
                this.local = asList(i2, objArr);
                this.stack = asList(i3, objArr2);
                break;
            case 1:
                this.local = asList(i2, objArr);
                break;
            case 2:
                this.local = Arrays.asList(new Object[i2]);
                break;
            case 4:
                this.stack = asList(1, objArr2);
                break;
        }
    }

    private static Object[] asArray(List list) {
        Object[] objArr = new Object[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= objArr.length) {
                return objArr;
            }
            Object label = list.get(i2);
            if (label instanceof LabelNode) {
                label = ((LabelNode) label).getLabel();
            }
            objArr[i2] = label;
            i = i2 + 1;
        }
    }

    private static List asList(int i, Object[] objArr) {
        return Arrays.asList(objArr).subList(0, i);
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        switch (this.type) {
            case -1:
            case 0:
                methodVisitor.visitFrame(this.type, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
                break;
            case 1:
                methodVisitor.visitFrame(this.type, this.local.size(), asArray(this.local), 0, null);
                break;
            case 2:
                methodVisitor.visitFrame(this.type, this.local.size(), null, 0, null);
                break;
            case 3:
                methodVisitor.visitFrame(this.type, 0, null, 0, null);
                break;
            case 4:
                methodVisitor.visitFrame(this.type, 0, null, 1, asArray(this.stack));
                break;
        }
    }

    @Override
    public AbstractInsnNode clone(Map map) {
        FrameNode frameNode = new FrameNode();
        frameNode.type = this.type;
        if (this.local != null) {
            frameNode.local = new ArrayList();
            for (int i = 0; i < this.local.size(); i++) {
                Object obj = this.local.get(i);
                if (obj instanceof LabelNode) {
                    obj = map.get(obj);
                }
                frameNode.local.add(obj);
            }
        }
        if (this.stack != null) {
            frameNode.stack = new ArrayList();
            for (int i2 = 0; i2 < this.stack.size(); i2++) {
                Object obj2 = this.stack.get(i2);
                if (obj2 instanceof LabelNode) {
                    obj2 = map.get(obj2);
                }
                frameNode.stack.add(obj2);
            }
        }
        return frameNode;
    }

    @Override
    public int getType() {
        return 14;
    }
}
