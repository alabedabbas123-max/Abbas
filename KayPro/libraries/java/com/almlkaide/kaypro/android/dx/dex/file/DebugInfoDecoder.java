package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.Leb128;
import com.almlkaide.kaypro.android.dex.util.ByteArrayByteInput;
import com.almlkaide.kaypro.android.dex.util.ByteInput;
import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsnList;
import com.almlkaide.kaypro.android.dx.dex.code.LocalList;
import com.almlkaide.kaypro.android.dx.dex.code.PositionList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DebugInfoDecoder {
    private final int codesize;
    private final Prototype desc;
    private final byte[] encoded;
    private final DexFile file;
    private final boolean isStatic;
    private final LocalEntry[] lastEntryForReg;
    private final ArrayList<LocalEntry> locals;
    private final ArrayList<PositionEntry> positions;
    private final int regSize;
    private final int thisStringIdx;
    private int line = 1;
    private int address = 0;

    DebugInfoDecoder(byte[] bArr, int i, int i2, boolean z, CstMethodRef cstMethodRef, DexFile dexFile) {
        if (bArr == null) {
            throw new NullPointerException("encoded == null");
        }
        this.encoded = bArr;
        this.isStatic = z;
        this.desc = cstMethodRef.getPrototype();
        this.file = dexFile;
        this.regSize = i2;
        this.positions = new ArrayList<>();
        this.locals = new ArrayList<>();
        this.codesize = i;
        this.lastEntryForReg = new LocalEntry[i2];
        int iIndexOf = -1;
        try {
            iIndexOf = dexFile.getStringIds().indexOf(new CstString("this"));
        } catch (IllegalArgumentException e) {
        }
        this.thisStringIdx = iIndexOf;
    }

    private static class PositionEntry {
        public int address;
        public int line;

        public PositionEntry(int i, int i2) {
            this.address = i;
            this.line = i2;
        }
    }

    private static class LocalEntry {
        public int address;
        public boolean isStart;
        public int nameIndex;

        public int f5027reg;
        public int signatureIndex;
        public int typeIndex;

        public LocalEntry(int i, boolean z, int i2, int i3, int i4, int i5) {
            this.address = i;
            this.isStart = z;
            this.f5027reg = i2;
            this.nameIndex = i3;
            this.typeIndex = i4;
            this.signatureIndex = i5;
        }

        public String toString() {
            Object[] objArr = new Object[6];
            objArr[0] = new Integer(this.address);
            objArr[1] = this.isStart ? "start" : "end";
            objArr[2] = new Integer(this.f5027reg);
            objArr[3] = new Integer(this.nameIndex);
            objArr[4] = new Integer(this.typeIndex);
            objArr[5] = new Integer(this.signatureIndex);
            return String.format("[%x %s v%d %04x %04x %04x]", objArr);
        }
    }

    public List<PositionEntry> getPositionList() {
        return this.positions;
    }

    public List<LocalEntry> getLocals() {
        return this.locals;
    }

    public void decode() {
        try {
            decode0();
        } catch (Exception e) {
            throw ExceptionWithContext.withContext(e, "...while decoding debug info");
        }
    }

    private int readStringIndex(ByteInput byteInput) throws IOException {
        return Leb128.readUnsignedLeb128(byteInput) - 1;
    }

    private int getParamBase() {
        return (this.regSize - this.desc.getParameterTypes().getWordCount()) - (this.isStatic ? 0 : 1);
    }

    private void decode0() throws IOException {
        LocalEntry localEntry;
        ByteArrayByteInput byteArrayByteInput = new ByteArrayByteInput(this.encoded);
        this.line = Leb128.readUnsignedLeb128(byteArrayByteInput);
        int unsignedLeb128 = Leb128.readUnsignedLeb128(byteArrayByteInput);
        StdTypeList parameterTypes = this.desc.getParameterTypes();
        int paramBase = getParamBase();
        if (unsignedLeb128 != parameterTypes.size()) {
            throw new RuntimeException("Mismatch between parameters_size and prototype");
        }
        if (!this.isStatic) {
            LocalEntry localEntry2 = new LocalEntry(0, true, paramBase, this.thisStringIdx, 0, 0);
            this.locals.add(localEntry2);
            this.lastEntryForReg[paramBase] = localEntry2;
            paramBase++;
        }
        for (int i = 0; i < unsignedLeb128; i++) {
            Type type = parameterTypes.getType(i);
            int stringIndex = readStringIndex(byteArrayByteInput);
            if (stringIndex == -1) {
                localEntry = new LocalEntry(0, true, paramBase, -1, 0, 0);
            } else {
                localEntry = new LocalEntry(0, true, paramBase, stringIndex, 0, 0);
            }
            this.locals.add(localEntry);
            this.lastEntryForReg[paramBase] = localEntry;
            paramBase += type.getCategory();
        }
        while (true) {
            int i2 = byteArrayByteInput.readByte() & 255;
            switch (i2) {
                case 0:
                    return;
                case 1:
                    this.address += Leb128.readUnsignedLeb128(byteArrayByteInput);
                    break;
                case 2:
                    this.line += Leb128.readSignedLeb128(byteArrayByteInput);
                    break;
                case 3:
                    int unsignedLeb129 = Leb128.readUnsignedLeb128(byteArrayByteInput);
                    LocalEntry localEntry3 = new LocalEntry(this.address, true, unsignedLeb129, readStringIndex(byteArrayByteInput), readStringIndex(byteArrayByteInput), 0);
                    this.locals.add(localEntry3);
                    this.lastEntryForReg[unsignedLeb129] = localEntry3;
                    break;
                case 4:
                    int unsignedLeb1210 = Leb128.readUnsignedLeb128(byteArrayByteInput);
                    LocalEntry localEntry4 = new LocalEntry(this.address, true, unsignedLeb1210, readStringIndex(byteArrayByteInput), readStringIndex(byteArrayByteInput), readStringIndex(byteArrayByteInput));
                    this.locals.add(localEntry4);
                    this.lastEntryForReg[unsignedLeb1210] = localEntry4;
                    break;
                case 5:
                    int unsignedLeb1211 = Leb128.readUnsignedLeb128(byteArrayByteInput);
                    try {
                        LocalEntry localEntry5 = this.lastEntryForReg[unsignedLeb1211];
                        if (!localEntry5.isStart) {
                            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("nonsensical ").append("END_LOCAL on dead register v").toString()).append(unsignedLeb1211).toString());
                        }
                        LocalEntry localEntry6 = new LocalEntry(this.address, false, unsignedLeb1211, localEntry5.nameIndex, localEntry5.typeIndex, localEntry5.signatureIndex);
                        this.locals.add(localEntry6);
                        this.lastEntryForReg[unsignedLeb1211] = localEntry6;
                    } catch (NullPointerException e) {
                        throw new RuntimeException(new StringBuffer().append("Encountered END_LOCAL on new v").append(unsignedLeb1211).toString());
                    }
                    break;
                case 6:
                    int unsignedLeb1212 = Leb128.readUnsignedLeb128(byteArrayByteInput);
                    try {
                        LocalEntry localEntry7 = this.lastEntryForReg[unsignedLeb1212];
                        if (localEntry7.isStart) {
                            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("nonsensical ").append("RESTART_LOCAL on live register v").toString()).append(unsignedLeb1212).toString());
                        }
                        LocalEntry localEntry8 = new LocalEntry(this.address, true, unsignedLeb1212, localEntry7.nameIndex, localEntry7.typeIndex, 0);
                        this.locals.add(localEntry8);
                        this.lastEntryForReg[unsignedLeb1212] = localEntry8;
                    } catch (NullPointerException e2) {
                        throw new RuntimeException(new StringBuffer().append("Encountered RESTART_LOCAL on new v").append(unsignedLeb1212).toString());
                    }
                    break;
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    if (i2 < 10) {
                        throw new RuntimeException(new StringBuffer().append("Invalid extended opcode encountered ").append(i2).toString());
                    }
                    int i3 = i2 - 10;
                    this.address += i3 / 15;
                    this.line = ((i3 % 15) - 4) + this.line;
                    this.positions.add(new PositionEntry(this.address, this.line));
                    break;
                    break;
            }
        }
    }

    public static void validateEncode(byte[] bArr, DexFile dexFile, CstMethodRef cstMethodRef, DalvCode dalvCode, boolean z) {
        PositionList positions = dalvCode.getPositions();
        LocalList locals = dalvCode.getLocals();
        DalvInsnList insns = dalvCode.getInsns();
        try {
            validateEncode0(bArr, insns.codeSize(), insns.getRegistersSize(), z, cstMethodRef, dexFile, positions, locals);
        } catch (RuntimeException e) {
            System.err.println("instructions:");
            insns.debugPrint((OutputStream) System.err, "  ", true);
            System.err.println("local list:");
            locals.debugPrint(System.err, "  ");
            throw ExceptionWithContext.withContext(e, new StringBuffer().append("while processing ").append(cstMethodRef.toHuman()).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0212  */
    private static void validateEncode0(byte[] bArr, int i, int i2, boolean z, CstMethodRef cstMethodRef, DexFile dexFile, PositionList positionList, LocalList localList) {
        boolean z2;
        LocalEntry localEntry;
        int i3;
        DebugInfoDecoder debugInfoDecoder = new DebugInfoDecoder(bArr, i, i2, z, cstMethodRef, dexFile);
        debugInfoDecoder.decode();
        List<PositionEntry> positionList2 = debugInfoDecoder.getPositionList();
        if (positionList2.size() != positionList.size()) {
            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Decoded positions table not same size was ").append(positionList2.size()).toString()).append(" expected ").toString()).append(positionList.size()).toString());
        }
        for (PositionEntry positionEntry : positionList2) {
            boolean z3 = false;
            for (int size = positionList.size() - 1; size >= 0; size--) {
                PositionList.Entry entryM7163get = positionList.m7163get(size);
                if (positionEntry.line == entryM7163get.getPosition().getLine() && positionEntry.address == entryM7163get.getAddress()) {
                    z3 = true;
                    break;
                }
            }
            if (!z3) {
                throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Could not match position entry: ").append(positionEntry.address).toString()).append(", ").toString()).append(positionEntry.line).toString());
            }
        }
        List<LocalEntry> locals = debugInfoDecoder.getLocals();
        int i4 = debugInfoDecoder.thisStringIdx;
        int size2 = locals.size();
        int paramBase = debugInfoDecoder.getParamBase();
        int i5 = 0;
        while (i5 < size2) {
            LocalEntry localEntry2 = locals.get(i5);
            int i6 = localEntry2.nameIndex;
            if (i6 >= 0 && i6 != i4) {
                i3 = size2;
                break;
                break;
            }
            int i7 = i5 + 1;
            while (true) {
                if (i7 >= size2) {
                    i3 = size2;
                    break;
                }
                LocalEntry localEntry3 = locals.get(i7);
                if (localEntry3.address != 0) {
                    i3 = size2;
                    break;
                } else if (localEntry2.f5027reg != localEntry3.f5027reg || !localEntry3.isStart) {
                    i7++;
                } else {
                    locals.set(i5, localEntry3);
                    locals.remove(i7);
                    i3 = size2 - 1;
                    break;
                }
            }
            i5++;
            size2 = i3;
        }
        int size3 = localList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                z2 = false;
                break;
            }
            LocalList.Entry entryM7156get = localList.m7156get(i9);
            if (entryM7156get.getDisposition() != LocalList.Disposition.END_REPLACED) {
                int i10 = i8;
                do {
                    localEntry = locals.get(i10);
                    if (localEntry.nameIndex >= 0) {
                        break;
                    } else {
                        i10++;
                    }
                } while (i10 < size2);
                int i11 = localEntry.address;
                if (localEntry.f5027reg != entryM7156get.getRegister()) {
                    System.err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("local register mismatch at orig ").append(i9).toString()).append(" / decoded ").toString()).append(i10).toString());
                    z2 = true;
                    break;
                }
                if (!localEntry.isStart) {
                    if (entryM7156get.isStart()) {
                        System.err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("local start/end mismatch at orig ").append(i9).toString()).append(" / decoded ").toString()).append(i10).toString());
                        z2 = true;
                        break;
                    } else {
                        if (i11 == entryM7156get.getAddress() && (i11 != 0 || localEntry.f5027reg < paramBase)) {
                            System.err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("local address mismatch at orig ").append(i9).toString()).append(" / decoded ").toString()).append(i10).toString());
                            z2 = true;
                            break;
                        }
                        i8 = i10 + 1;
                    }
                } else if (!entryM7156get.isStart()) {
                    System.err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("local start/end mismatch at orig ").append(i9).toString()).append(" / decoded ").toString()).append(i10).toString());
                    z2 = true;
                    break;
                } else {
                    if (i11 == entryM7156get.getAddress()) {
                    }
                    i8 = i10 + 1;
                }
            }
            i9++;
        }
        if (z2) {
            System.err.println("decoded locals:");
            Iterator<LocalEntry> it = locals.iterator();
            while (it.hasNext()) {
                System.err.println(new StringBuffer().append("  ").append(it.next()).toString());
            }
            throw new RuntimeException("local table problem");
        }
    }
}
