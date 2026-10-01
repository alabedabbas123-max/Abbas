package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dex.DexException;
import com.almlkaide.kaypro.android.dx.io.IndexType;
import com.almlkaide.kaypro.android.dx.io.OpcodeInfo;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.EOFException;

public abstract class DecodedInstruction {
    private final InstructionCodec format;
    private final int index;
    private final IndexType indexType;
    private final long literal;
    private final int opcode;
    private final int target;

    public abstract int getRegisterCount();

    public abstract DecodedInstruction withIndex(int i);

    public static DecodedInstruction decode(CodeInput codeInput) throws EOFException {
        int i = codeInput.read();
        return OpcodeInfo.getFormat(Opcodes.extractOpcodeFromUnit(i)).decode(i, codeInput);
    }

    public static DecodedInstruction[] decodeAll(short[] sArr) {
        DecodedInstruction[] decodedInstructionArr = new DecodedInstruction[sArr.length];
        ShortArrayCodeInput shortArrayCodeInput = new ShortArrayCodeInput(sArr);
        while (shortArrayCodeInput.hasMore()) {
            try {
                decodedInstructionArr[shortArrayCodeInput.cursor()] = decode(shortArrayCodeInput);
            } catch (EOFException e) {
                throw new DexException(e);
            }
        }
        return decodedInstructionArr;
    }

    public DecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j) {
        if (instructionCodec == null) {
            throw new NullPointerException("format == null");
        }
        if (!Opcodes.isValidShape(i)) {
            throw new IllegalArgumentException("invalid opcode");
        }
        this.format = instructionCodec;
        this.opcode = i;
        this.index = i2;
        this.indexType = indexType;
        this.target = i3;
        this.literal = j;
    }

    public final InstructionCodec getFormat() {
        return this.format;
    }

    public final int getOpcode() {
        return this.opcode;
    }

    public final short getOpcodeUnit() {
        return (short) this.opcode;
    }

    public final int getIndex() {
        return this.index;
    }

    public final short getIndexUnit() {
        return (short) this.index;
    }

    public final IndexType getIndexType() {
        return this.indexType;
    }

    public final int getTarget() {
        return this.target;
    }

    public final int getTarget(int i) {
        return this.target - i;
    }

    public final short getTargetUnit(int i) {
        int target = getTarget(i);
        if (target != ((short) target)) {
            throw new DexException(new StringBuffer().append("Target out of range: ").append(Hex.m7222s4(target)).toString());
        }
        return (short) target;
    }

    public final int getTargetByte(int i) {
        int target = getTarget(i);
        if (target != ((byte) target)) {
            throw new DexException(new StringBuffer().append("Target out of range: ").append(Hex.m7222s4(target)).toString());
        }
        return target & 255;
    }

    public final long getLiteral() {
        return this.literal;
    }

    public final int getLiteralInt() {
        if (this.literal != ((int) this.literal)) {
            throw new DexException(new StringBuffer().append("Literal out of range: ").append(Hex.m7228u8(this.literal)).toString());
        }
        return (int) this.literal;
    }

    public final short getLiteralUnit() {
        if (this.literal != ((short) this.literal)) {
            throw new DexException(new StringBuffer().append("Literal out of range: ").append(Hex.m7228u8(this.literal)).toString());
        }
        return (short) this.literal;
    }

    public final int getLiteralByte() {
        if (this.literal != ((byte) this.literal)) {
            throw new DexException(new StringBuffer().append("Literal out of range: ").append(Hex.m7228u8(this.literal)).toString());
        }
        return ((int) this.literal) & 255;
    }

    public final int getLiteralNibble() {
        if (this.literal < -8 || this.literal > 7) {
            throw new DexException(new StringBuffer().append("Literal out of range: ").append(Hex.m7228u8(this.literal)).toString());
        }
        return ((int) this.literal) & 15;
    }

    public int getA() {
        return 0;
    }

    public int getB() {
        return 0;
    }

    public int getC() {
        return 0;
    }

    public int getD() {
        return 0;
    }

    public int getE() {
        return 0;
    }

    public final short getRegisterCountUnit() {
        int registerCount = getRegisterCount();
        if (((-65536) & registerCount) != 0) {
            throw new DexException(new StringBuffer().append("Register count out of range: ").append(Hex.m7228u8(registerCount)).toString());
        }
        return (short) registerCount;
    }

    public final short getAUnit() {
        int a2 = getA();
        if (((-65536) & a2) != 0) {
            throw new DexException(new StringBuffer().append("Register A out of range: ").append(Hex.m7228u8(a2)).toString());
        }
        return (short) a2;
    }

    public final short getAByte() {
        int a2 = getA();
        if ((a2 & (-256)) != 0) {
            throw new DexException(new StringBuffer().append("Register A out of range: ").append(Hex.m7228u8(a2)).toString());
        }
        return (short) a2;
    }

    public final short getANibble() {
        int a2 = getA();
        if ((a2 & (-16)) != 0) {
            throw new DexException(new StringBuffer().append("Register A out of range: ").append(Hex.m7228u8(a2)).toString());
        }
        return (short) a2;
    }

    public final short getBUnit() {
        int b = getB();
        if (((-65536) & b) != 0) {
            throw new DexException(new StringBuffer().append("Register B out of range: ").append(Hex.m7228u8(b)).toString());
        }
        return (short) b;
    }

    public final short getBByte() {
        int b = getB();
        if ((b & (-256)) != 0) {
            throw new DexException(new StringBuffer().append("Register B out of range: ").append(Hex.m7228u8(b)).toString());
        }
        return (short) b;
    }

    public final short getBNibble() {
        int b = getB();
        if ((b & (-16)) != 0) {
            throw new DexException(new StringBuffer().append("Register B out of range: ").append(Hex.m7228u8(b)).toString());
        }
        return (short) b;
    }

    public final short getCUnit() {
        int c = getC();
        if (((-65536) & c) != 0) {
            throw new DexException(new StringBuffer().append("Register C out of range: ").append(Hex.m7228u8(c)).toString());
        }
        return (short) c;
    }

    public final short getCByte() {
        int c = getC();
        if ((c & (-256)) != 0) {
            throw new DexException(new StringBuffer().append("Register C out of range: ").append(Hex.m7228u8(c)).toString());
        }
        return (short) c;
    }

    public final short getCNibble() {
        int c = getC();
        if ((c & (-16)) != 0) {
            throw new DexException(new StringBuffer().append("Register C out of range: ").append(Hex.m7228u8(c)).toString());
        }
        return (short) c;
    }

    public final short getDUnit() {
        int d = getD();
        if (((-65536) & d) != 0) {
            throw new DexException(new StringBuffer().append("Register D out of range: ").append(Hex.m7228u8(d)).toString());
        }
        return (short) d;
    }

    public final short getDByte() {
        int d = getD();
        if ((d & (-256)) != 0) {
            throw new DexException(new StringBuffer().append("Register D out of range: ").append(Hex.m7228u8(d)).toString());
        }
        return (short) d;
    }

    public final short getDNibble() {
        int d = getD();
        if ((d & (-16)) != 0) {
            throw new DexException(new StringBuffer().append("Register D out of range: ").append(Hex.m7228u8(d)).toString());
        }
        return (short) d;
    }

    public final short getENibble() {
        int e = getE();
        if ((e & (-16)) != 0) {
            throw new DexException(new StringBuffer().append("Register E out of range: ").append(Hex.m7228u8(e)).toString());
        }
        return (short) e;
    }

    public final void encode(CodeOutput codeOutput) {
        this.format.encode(this, codeOutput);
    }

    public DecodedInstruction withProtoIndex(int i, int i2) {
        throw new IllegalStateException(getClass().toString());
    }

    public short getProtoIndex() {
        throw new IllegalStateException(getClass().toString());
    }
}
