package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Comparator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

public class TryCatchBlockSorter extends MethodNode {
    protected TryCatchBlockSorter(int i, MethodVisitor methodVisitor, int i2, String str, String str2, String str3, String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.f6563mv = methodVisitor;
    }

    public TryCatchBlockSorter(MethodVisitor methodVisitor, int i, String str, String str2, String str3, String[] strArr) {
        this(Opcodes.ASM5, methodVisitor, i, str, str2, str3, strArr);
    }

    @Override
    public void visitEnd() {
        Collections.sort(this.tryCatchBlocks, new Comparator(this) {
            final TryCatchBlockSorter this$0;

            {
                this.this$0 = this;
            }

            private int blockLength(TryCatchBlockNode tryCatchBlockNode) {
                return this.this$0.instructions.indexOf(tryCatchBlockNode.f6685end) - this.this$0.instructions.indexOf(tryCatchBlockNode.start);
            }

            @Override
            public int compare(Object obj, Object obj2) {
                return compare((TryCatchBlockNode) obj, (TryCatchBlockNode) obj2);
            }

            public int compare(TryCatchBlockNode tryCatchBlockNode, TryCatchBlockNode tryCatchBlockNode2) {
                return blockLength(tryCatchBlockNode) - blockLength(tryCatchBlockNode2);
            }
        });
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.tryCatchBlocks.size()) {
                break;
            }
            ((TryCatchBlockNode) this.tryCatchBlocks.get(i2)).updateIndex(i2);
            i = i2 + 1;
        }
        if (this.f6563mv != null) {
            accept(this.f6563mv);
        }
    }
}
