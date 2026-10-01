package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class LocalVariableAnnotationNode extends TypeAnnotationNode {

    public List f6680end;
    public List index;
    public List start;

    public LocalVariableAnnotationNode(int i, int i2, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        super(i, i2, typePath, str);
        this.start = new ArrayList(labelNodeArr.length);
        this.start.addAll(Arrays.asList(labelNodeArr));
        this.f6680end = new ArrayList(labelNodeArr2.length);
        this.f6680end.addAll(Arrays.asList(labelNodeArr2));
        this.index = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            this.index.add(new Integer(i3));
        }
    }

    public LocalVariableAnnotationNode(int i, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        this(Opcodes.ASM5, i, typePath, labelNodeArr, labelNodeArr2, iArr, str);
    }

    public void accept(MethodVisitor methodVisitor, boolean z) {
        Label[] labelArr = new Label[this.start.size()];
        Label[] labelArr2 = new Label[this.f6680end.size()];
        int[] iArr = new int[this.index.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= labelArr.length) {
                accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, labelArr, labelArr2, iArr, this.desc, true));
                return;
            }
            labelArr[i2] = ((LabelNode) this.start.get(i2)).getLabel();
            labelArr2[i2] = ((LabelNode) this.f6680end.get(i2)).getLabel();
            iArr[i2] = ((Integer) this.index.get(i2)).intValue();
            i = i2 + 1;
        }
    }
}
