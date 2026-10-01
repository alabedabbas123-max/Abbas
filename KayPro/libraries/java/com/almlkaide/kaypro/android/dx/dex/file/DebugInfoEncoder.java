package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.dex.code.LocalList;
import com.almlkaide.kaypro.android.dx.dex.code.PositionList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public final class DebugInfoEncoder {
    private static final boolean DEBUG = false;
    private AnnotatedOutput annotateTo;
    private final int codeSize;
    private PrintWriter debugPrint;
    private final Prototype desc;
    private final DexFile file;
    private final boolean isStatic;
    private final LocalList.Entry[] lastEntryForReg;
    private final LocalList locals;
    private final PositionList positions;
    private String prefix;
    private final int regSize;
    private boolean shouldConsume;
    private int address = 0;
    private int line = 1;
    private final ByteArrayAnnotatedOutput output = new ByteArrayAnnotatedOutput();

    public DebugInfoEncoder(PositionList positionList, LocalList localList, DexFile dexFile, int i, int i2, boolean z, CstMethodRef cstMethodRef) {
        this.positions = positionList;
        this.locals = localList;
        this.file = dexFile;
        this.desc = cstMethodRef.getPrototype();
        this.isStatic = z;
        this.codeSize = i;
        this.regSize = i2;
        this.lastEntryForReg = new LocalList.Entry[i2];
    }

    private void annotate(int i, String str) {
        if (this.prefix != null) {
            str = new StringBuffer().append(this.prefix).append(str).toString();
        }
        if (this.annotateTo != null) {
            AnnotatedOutput annotatedOutput = this.annotateTo;
            if (!this.shouldConsume) {
                i = 0;
            }
            annotatedOutput.annotate(i, str);
        }
        if (this.debugPrint != null) {
            this.debugPrint.println(str);
        }
    }

    public byte[] convert() {
        try {
            return convert0();
        } catch (IOException e) {
            throw ExceptionWithContext.withContext(e, "...while encoding debug info");
        }
    }

    public byte[] convertAndAnnotate(String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        this.prefix = str;
        this.debugPrint = printWriter;
        this.annotateTo = annotatedOutput;
        this.shouldConsume = z;
        return convert();
    }

    private byte[] convert0() throws IOException {
        ArrayList<PositionList.Entry> arrayListBuildSortedPositions = buildSortedPositions();
        emitHeader(arrayListBuildSortedPositions, extractMethodArguments());
        this.output.writeByte(7);
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(1, String.format("%04x: prologue end", new Integer(this.address)));
        }
        int size = arrayListBuildSortedPositions.size();
        int size2 = this.locals.size();
        int iEmitLocalsAtAddress = 0;
        int i = 0;
        while (true) {
            iEmitLocalsAtAddress = emitLocalsAtAddress(iEmitLocalsAtAddress);
            int iEmitPositionsAtAddress = emitPositionsAtAddress(i, arrayListBuildSortedPositions);
            int address = iEmitLocalsAtAddress < size2 ? this.locals.m7156get(iEmitLocalsAtAddress).getAddress() : Integer.MAX_VALUE;
            int address2 = iEmitPositionsAtAddress < size ? arrayListBuildSortedPositions.get(iEmitPositionsAtAddress).getAddress() : Integer.MAX_VALUE;
            int iMin = Math.min(address2, address);
            if (iMin == Integer.MAX_VALUE || (iMin == this.codeSize && address == Integer.MAX_VALUE && address2 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == address2) {
                i = iEmitPositionsAtAddress + 1;
                emitPosition(arrayListBuildSortedPositions.get(iEmitPositionsAtAddress));
            } else {
                emitAdvancePc(iMin - this.address);
                i = iEmitPositionsAtAddress;
            }
        }
        emitEndSequence();
        return this.output.toByteArray();
    }

    private int emitLocalsAtAddress(int i) throws IOException {
        int size = this.locals.size();
        while (i < size && this.locals.m7156get(i).getAddress() == this.address) {
            i++;
            LocalList.Entry entryM7156get = this.locals.m7156get(i);
            int register = entryM7156get.getRegister();
            LocalList.Entry entry = this.lastEntryForReg[register];
            if (entryM7156get != entry) {
                this.lastEntryForReg[register] = entryM7156get;
                if (entryM7156get.isStart()) {
                    if (entry == null || !entryM7156get.matches(entry)) {
                        emitLocalStart(entryM7156get);
                    } else {
                        if (entry.isStart()) {
                            throw new RuntimeException("shouldn't happen");
                        }
                        emitLocalRestart(entryM7156get);
                    }
                } else if (entryM7156get.getDisposition() != LocalList.Disposition.END_REPLACED) {
                    emitLocalEnd(entryM7156get);
                }
            }
        }
        return i;
    }

    private int emitPositionsAtAddress(int i, ArrayList<PositionList.Entry> arrayList) throws IOException {
        int size = arrayList.size();
        while (i < size && arrayList.get(i).getAddress() == this.address) {
            emitPosition(arrayList.get(i));
            i++;
        }
        return i;
    }

    private void emitHeader(ArrayList<PositionList.Entry> arrayList, ArrayList<LocalList.Entry> arrayList2) throws IOException {
        int i;
        LocalList.Entry next;
        boolean z = (this.annotateTo == null && this.debugPrint == null) ? false : true;
        int cursor = this.output.getCursor();
        if (arrayList.size() > 0) {
            this.line = arrayList.get(0).getPosition().getLine();
        }
        this.output.writeUleb128(this.line);
        if (z) {
            annotate(this.output.getCursor() - cursor, new StringBuffer().append("line_start: ").append(this.line).toString());
        }
        int paramBase = getParamBase();
        StdTypeList parameterTypes = this.desc.getParameterTypes();
        int size = parameterTypes.size();
        if (this.isStatic) {
            i = paramBase;
        } else {
            for (LocalList.Entry entry : arrayList2) {
                if (paramBase == entry.getRegister()) {
                    this.lastEntryForReg[paramBase] = entry;
                    break;
                }
            }
            i = paramBase + 1;
        }
        int cursor2 = this.output.getCursor();
        this.output.writeUleb128(size);
        if (z) {
            annotate(this.output.getCursor() - cursor2, String.format("parameters_size: %04x", new Integer(size)));
        }
        int i2 = 0;
        int category = i;
        while (i2 < size) {
            Type typeM7197get = parameterTypes.m7197get(i2);
            LocalList.Entry entry2 = (LocalList.Entry) null;
            int cursor3 = this.output.getCursor();
            Iterator<LocalList.Entry> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = entry2;
                    break;
                }
                next = it.next();
                if (category == next.getRegister()) {
                    if (next.getSignature() != null) {
                        emitStringIndex((CstString) null);
                    } else {
                        emitStringIndex(next.getName());
                    }
                    this.lastEntryForReg[category] = next;
                    break;
                }
            }
            if (next == null) {
                emitStringIndex((CstString) null);
            }
            if (z) {
                annotate(this.output.getCursor() - cursor3, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("parameter ").append((next == null || next.getSignature() != null) ? "<unnamed>" : next.getName().toHuman()).toString()).append(" ").toString()).append("v").toString()).append(category).toString());
            }
            i2++;
            category += typeM7197get.getCategory();
        }
        for (LocalList.Entry entry3 : this.lastEntryForReg) {
            if (entry3 != null && entry3.getSignature() != null) {
                emitLocalStartExtended(entry3);
            }
        }
    }

    private ArrayList<PositionList.Entry> buildSortedPositions() {
        int size = this.positions == null ? 0 : this.positions.size();
        ArrayList<PositionList.Entry> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.positions.m7163get(i));
        }
        Collections.sort(arrayList, new Comparator<PositionList.Entry>(this) {
            private final DebugInfoEncoder this$0;

            {
                this.this$0 = this;
            }

            @Override
            public int compare(PositionList.Entry entry, PositionList.Entry entry2) {
                return compare2(entry, entry2);
            }

            public int compare2(PositionList.Entry entry, PositionList.Entry entry2) {
                return entry.getAddress() - entry2.getAddress();
            }

            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }
        });
        return arrayList;
    }

    private int getParamBase() {
        return (this.regSize - this.desc.getParameterTypes().getWordCount()) - (this.isStatic ? 0 : 1);
    }

    private ArrayList<LocalList.Entry> extractMethodArguments() {
        ArrayList<LocalList.Entry> arrayList = new ArrayList<>(this.desc.getParameterTypes().size());
        int paramBase = getParamBase();
        BitSet bitSet = new BitSet(this.regSize - paramBase);
        int size = this.locals.size();
        for (int i = 0; i < size; i++) {
            LocalList.Entry entryM7156get = this.locals.m7156get(i);
            int register = entryM7156get.getRegister();
            if (register >= paramBase && !bitSet.get(register - paramBase)) {
                bitSet.set(register - paramBase);
                arrayList.add(entryM7156get);
            }
        }
        Collections.sort(arrayList, new Comparator<LocalList.Entry>(this) {
            private final DebugInfoEncoder this$0;

            {
                this.this$0 = this;
            }

            @Override
            public int compare(LocalList.Entry entry, LocalList.Entry entry2) {
                return compare2(entry, entry2);
            }

            public int compare2(LocalList.Entry entry, LocalList.Entry entry2) {
                return entry.getRegister() - entry2.getRegister();
            }

            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }
        });
        return arrayList;
    }

    private String entryAnnotationString(LocalList.Entry entry) {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        sb.append(entry.getRegister());
        sb.append(' ');
        CstString name = entry.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.toHuman());
        }
        sb.append(' ');
        CstType type = entry.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.toHuman());
        }
        CstString signature = entry.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.toHuman());
        }
        return sb.toString();
    }

    private void emitLocalRestart(LocalList.Entry entry) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(6);
        emitUnsignedLeb128(entry.getRegister());
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(this.output.getCursor() - cursor, String.format("%04x: +local restart %s", new Integer(this.address), entryAnnotationString(entry)));
    }

    private void emitStringIndex(CstString cstString) throws IOException {
        if (cstString == null || this.file == null) {
            this.output.writeUleb128(0);
        } else {
            this.output.writeUleb128(this.file.getStringIds().indexOf(cstString) + 1);
        }
    }

    private void emitTypeIndex(CstType cstType) throws IOException {
        if (cstType == null || this.file == null) {
            this.output.writeUleb128(0);
        } else {
            this.output.writeUleb128(this.file.getTypeIds().indexOf(cstType) + 1);
        }
    }

    private void emitLocalStart(LocalList.Entry entry) throws IOException {
        if (entry.getSignature() != null) {
            emitLocalStartExtended(entry);
            return;
        }
        int cursor = this.output.getCursor();
        this.output.writeByte(3);
        emitUnsignedLeb128(entry.getRegister());
        emitStringIndex(entry.getName());
        emitTypeIndex(entry.getType());
        if (this.annotateTo != null || this.debugPrint != null) {
            annotate(this.output.getCursor() - cursor, String.format("%04x: +local %s", new Integer(this.address), entryAnnotationString(entry)));
        }
    }

    private void emitLocalStartExtended(LocalList.Entry entry) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(4);
        emitUnsignedLeb128(entry.getRegister());
        emitStringIndex(entry.getName());
        emitTypeIndex(entry.getType());
        emitStringIndex(entry.getSignature());
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(this.output.getCursor() - cursor, String.format("%04x: +localx %s", new Integer(this.address), entryAnnotationString(entry)));
    }

    private void emitLocalEnd(LocalList.Entry entry) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(5);
        this.output.writeUleb128(entry.getRegister());
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(this.output.getCursor() - cursor, String.format("%04x: -local %s", new Integer(this.address), entryAnnotationString(entry)));
    }

    private void emitPosition(PositionList.Entry entry) throws IOException {
        int line = entry.getPosition().getLine();
        int address = entry.getAddress();
        int i = line - this.line;
        int i2 = address - this.address;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            emitAdvanceLine(i);
            i = 0;
        }
        int iComputeOpcode = computeOpcode(i, i2);
        if ((iComputeOpcode & (-256)) > 0) {
            emitAdvancePc(i2);
            iComputeOpcode = computeOpcode(i, 0);
            if ((iComputeOpcode & (-256)) > 0) {
                emitAdvanceLine(i);
                iComputeOpcode = computeOpcode(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.output.writeByte(iComputeOpcode);
        this.line = i + this.line;
        this.address += i2;
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(1, String.format("%04x: line %d", new Integer(this.address), new Integer(this.line)));
    }

    private static int computeOpcode(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return i + 4 + (i2 * 15) + 10;
    }

    private void emitAdvanceLine(int i) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(2);
        this.output.writeSleb128(i);
        this.line += i;
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(this.output.getCursor() - cursor, String.format("line = %d", new Integer(this.line)));
    }

    private void emitAdvancePc(int i) throws IOException {
        int cursor = this.output.getCursor();
        this.output.writeByte(1);
        this.output.writeUleb128(i);
        this.address += i;
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(this.output.getCursor() - cursor, String.format("%04x: advance pc", new Integer(this.address)));
    }

    private void emitUnsignedLeb128(int i) throws IOException {
        if (i < 0) {
            throw new RuntimeException(new StringBuffer().append("Signed value where unsigned required: ").append(i).toString());
        }
        this.output.writeUleb128(i);
    }

    private void emitEndSequence() {
        this.output.writeByte(0);
        if (this.annotateTo == null && this.debugPrint == null) {
            return;
        }
        annotate(1, "end sequence");
    }
}
