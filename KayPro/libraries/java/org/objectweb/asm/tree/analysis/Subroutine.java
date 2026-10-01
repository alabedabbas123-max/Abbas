package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;

class Subroutine {
    boolean[] access;
    List callers;
    LabelNode start;

    private Subroutine() {
    }

    Subroutine(LabelNode labelNode, int i, JumpInsnNode jumpInsnNode) {
        this.start = labelNode;
        this.access = new boolean[i];
        this.callers = new ArrayList();
        this.callers.add(jumpInsnNode);
    }

    public Subroutine copy() {
        Subroutine subroutine = new Subroutine();
        subroutine.start = this.start;
        subroutine.access = new boolean[this.access.length];
        System.arraycopy(this.access, 0, subroutine.access, 0, this.access.length);
        subroutine.callers = new ArrayList(this.callers);
        return subroutine;
    }

    public boolean merge(Subroutine subroutine) throws AnalyzerException {
        boolean z = false;
        for (int i = 0; i < this.access.length; i++) {
            if (subroutine.access[i] && !this.access[i]) {
                this.access[i] = true;
                z = true;
            }
        }
        if (subroutine.start == this.start) {
            for (int i2 = 0; i2 < subroutine.callers.size(); i2++) {
                JumpInsnNode jumpInsnNode = (JumpInsnNode) subroutine.callers.get(i2);
                if (!this.callers.contains(jumpInsnNode)) {
                    this.callers.add(jumpInsnNode);
                    z = true;
                }
            }
        }
        return z;
    }
}
