package sun.reflect;

import java.util.ArrayList;
import java.util.List;

class Label {
    private List patches = new ArrayList();

    static class PatchInfo {

        ClassFileAssembler f634asm;
        short instrBCI;
        short patchBCI;
        int stackDepth;

        PatchInfo(ClassFileAssembler asm, short instrBCI, short patchBCI, int stackDepth) {
            this.f634asm = asm;
            this.instrBCI = instrBCI;
            this.patchBCI = patchBCI;
            this.stackDepth = stackDepth;
        }
    }

    void m554add(ClassFileAssembler asm, short instrBCI, short patchBCI, int stackDepth) {
        this.patches.add(new PatchInfo(asm, instrBCI, patchBCI, stackDepth));
    }

    public void bind() {
        for (PatchInfo patch : this.patches) {
            short curBCI = patch.f634asm.getLength();
            short offset = (short) (curBCI - patch.instrBCI);
            patch.f634asm.emitShort(patch.patchBCI, offset);
            patch.f634asm.setStack(patch.stackDepth);
        }
    }
}
