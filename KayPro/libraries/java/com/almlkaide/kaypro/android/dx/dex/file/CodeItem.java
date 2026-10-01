package com.almlkaide.kaypro.android.dx.dex.file;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsnList;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.PrintWriter;
import java.util.Iterator;

public final class CodeItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int HEADER_SIZE = 16;
    private CatchStructs catches;
    private final DalvCode code;
    private DebugInfoItem debugInfo;
    private final boolean isStatic;

    private final CstMethodRef f5026ref;
    private final TypeList throwsList;

    public CodeItem(CstMethodRef cstMethodRef, DalvCode dalvCode, boolean z, TypeList typeList) {
        super(4, -1);
        if (cstMethodRef == null) {
            throw new NullPointerException("ref == null");
        }
        if (dalvCode == null) {
            throw new NullPointerException("code == null");
        }
        if (typeList == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f5026ref = cstMethodRef;
        this.code = dalvCode;
        this.isStatic = z;
        this.throwsList = typeList;
        this.catches = (CatchStructs) null;
        this.debugInfo = (DebugInfoItem) null;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_CODE_ITEM;
    }

    @Override
    public void addContents(DexFile dexFile) {
        MixedItemSection byteData = dexFile.getByteData();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        if (this.code.hasPositions() || this.code.hasLocals()) {
            this.debugInfo = new DebugInfoItem(this.code, this.isStatic, this.f5026ref);
            byteData.m7168add(this.debugInfo);
        }
        if (this.code.hasAnyCatches()) {
            Iterator<Type> it = this.code.getCatchTypes().iterator();
            while (it.hasNext()) {
                typeIds.intern(it.next());
            }
            this.catches = new CatchStructs(this.code);
        }
        Iterator<Constant> it2 = this.code.getInsnConstants().iterator();
        while (it2.hasNext()) {
            dexFile.internIfAppropriate(it2.next());
        }
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append("CodeItem{").append(toHuman()).toString()).append("}").toString();
    }

    @Override
    public String toHuman() {
        return this.f5026ref.toHuman();
    }

    public CstMethodRef getRef() {
        return this.f5026ref;
    }

    public void debugPrint(PrintWriter printWriter, String str, boolean z) {
        printWriter.println(new StringBuffer().append(this.f5026ref.toHuman()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString());
        DalvInsnList insns = this.code.getInsns();
        printWriter.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("regs: ").append(Hex.m7225u2(getRegistersSize())).toString()).append("; ins: ").toString()).append(Hex.m7225u2(getInsSize())).toString()).append("; outs: ").toString()).append(Hex.m7225u2(getOutsSize())).toString());
        insns.debugPrint(printWriter, str, z);
        String string = new StringBuffer().append(str).append("  ").toString();
        if (this.catches != null) {
            printWriter.print(str);
            printWriter.println("catches");
            this.catches.debugPrint(printWriter, string);
        }
        if (this.debugInfo != null) {
            printWriter.print(str);
            printWriter.println("debug info");
            this.debugInfo.debugPrint(printWriter, string);
        }
    }

    @Override
    protected void place0(Section section, int i) {
        int iWriteSize;
        DexFile file = section.getFile();
        this.code.assignIndices(new DalvCode.AssignIndicesCallback(this, file) {
            private final CodeItem this$0;
            private final DexFile val$file;

            {
                this.this$0 = this;
                this.val$file = file;
            }

            @Override
            public int getIndex(Constant constant) {
                IndexedItem indexedItemFindItemOrNull = this.val$file.findItemOrNull(constant);
                if (indexedItemFindItemOrNull == null) {
                    return -1;
                }
                return indexedItemFindItemOrNull.getIndex();
            }
        });
        if (this.catches != null) {
            this.catches.encode(file);
            iWriteSize = this.catches.writeSize();
        } else {
            iWriteSize = 0;
        }
        int iCodeSize = this.code.getInsns().codeSize();
        if ((iCodeSize & 1) != 0) {
            iCodeSize++;
        }
        setWriteSize(iWriteSize + (iCodeSize * 2) + 16);
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        int registersSize = getRegistersSize();
        int outsSize = getOutsSize();
        int insSize = getInsSize();
        int iCodeSize = this.code.getInsns().codeSize();
        boolean z = (iCodeSize & 1) != 0;
        int iTriesSize = this.catches == null ? 0 : this.catches.triesSize();
        int absoluteOffset = this.debugInfo == null ? 0 : this.debugInfo.getAbsoluteOffset();
        if (zAnnotates) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(offsetString()).append(' ').toString()).append(this.f5026ref.toHuman()).toString());
            annotatedOutput.annotate(2, new StringBuffer().append("  registers_size: ").append(Hex.m7225u2(registersSize)).toString());
            annotatedOutput.annotate(2, new StringBuffer().append("  ins_size:       ").append(Hex.m7225u2(insSize)).toString());
            annotatedOutput.annotate(2, new StringBuffer().append("  outs_size:      ").append(Hex.m7225u2(outsSize)).toString());
            annotatedOutput.annotate(2, new StringBuffer().append("  tries_size:     ").append(Hex.m7225u2(iTriesSize)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  debug_off:      ").append(Hex.m7227u4(absoluteOffset)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  insns_size:     ").append(Hex.m7227u4(iCodeSize)).toString());
            if (this.throwsList.size() != 0) {
                annotatedOutput.annotate(0, new StringBuffer().append("  throws ").append(StdTypeList.toHuman(this.throwsList)).toString());
            }
        }
        annotatedOutput.writeShort(registersSize);
        annotatedOutput.writeShort(insSize);
        annotatedOutput.writeShort(outsSize);
        annotatedOutput.writeShort(iTriesSize);
        annotatedOutput.writeInt(absoluteOffset);
        annotatedOutput.writeInt(iCodeSize);
        writeCodes(dexFile, annotatedOutput);
        if (this.catches != null) {
            if (z) {
                if (zAnnotates) {
                    annotatedOutput.annotate(2, "  padding: 0");
                }
                annotatedOutput.writeShort(0);
            }
            this.catches.writeTo(dexFile, annotatedOutput);
        }
        if (!zAnnotates || this.debugInfo == null) {
            return;
        }
        annotatedOutput.annotate(0, "  debug info");
        this.debugInfo.annotateTo(dexFile, annotatedOutput, "    ");
    }

    private void writeCodes(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        try {
            this.code.getInsns().writeTo(annotatedOutput);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, new StringBuffer().append(new StringBuffer().append("...while writing ").append("instructions for ").toString()).append(this.f5026ref.toHuman()).toString());
        }
    }

    private int getInsSize() {
        return this.f5026ref.getParameterWordCount(this.isStatic);
    }

    private int getOutsSize() {
        return this.code.getInsns().getOutsSize();
    }

    private int getRegistersSize() {
        return this.code.getInsns().getRegistersSize();
    }
}
