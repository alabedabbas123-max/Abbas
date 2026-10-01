package com.almlkaide.kaypro.android.dex;

public final class Code {
    private final CatchHandler[] catchHandlers;
    private final int debugInfoOffset;
    private final int insSize;
    private final short[] instructions;
    private final int outsSize;
    private final int registersSize;
    private final C1678Try[] tries;

    public Code(int i, int i2, int i3, int i4, short[] sArr, C1678Try[] c1678TryArr, CatchHandler[] catchHandlerArr) {
        this.registersSize = i;
        this.insSize = i2;
        this.outsSize = i3;
        this.debugInfoOffset = i4;
        this.instructions = sArr;
        this.tries = c1678TryArr;
        this.catchHandlers = catchHandlerArr;
    }

    public int getRegistersSize() {
        return this.registersSize;
    }

    public int getInsSize() {
        return this.insSize;
    }

    public int getOutsSize() {
        return this.outsSize;
    }

    public int getDebugInfoOffset() {
        return this.debugInfoOffset;
    }

    public short[] getInstructions() {
        return this.instructions;
    }

    public C1678Try[] getTries() {
        return this.tries;
    }

    public CatchHandler[] getCatchHandlers() {
        return this.catchHandlers;
    }

    public static class C1678Try {
        final int catchHandlerIndex;
        final int instructionCount;
        final int startAddress;

        C1678Try(int i, int i2, int i3) {
            this.startAddress = i;
            this.instructionCount = i2;
            this.catchHandlerIndex = i3;
        }

        public int getStartAddress() {
            return this.startAddress;
        }

        public int getInstructionCount() {
            return this.instructionCount;
        }

        public int getCatchHandlerIndex() {
            return this.catchHandlerIndex;
        }
    }

    public static class CatchHandler {
        final int[] addresses;
        final int catchAllAddress;
        final int offset;
        final int[] typeIndexes;

        public CatchHandler(int[] iArr, int[] iArr2, int i, int i2) {
            this.typeIndexes = iArr;
            this.addresses = iArr2;
            this.catchAllAddress = i;
            this.offset = i2;
        }

        public int[] getTypeIndexes() {
            return this.typeIndexes;
        }

        public int[] getAddresses() {
            return this.addresses;
        }

        public int getCatchAllAddress() {
            return this.catchAllAddress;
        }

        public int getOffset() {
            return this.offset;
        }
    }
}
