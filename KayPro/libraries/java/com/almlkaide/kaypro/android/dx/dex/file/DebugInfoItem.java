package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.dex.code.DalvInsnList;
import com.almlkaide.kaypro.android.dx.dex.code.LocalList;
import com.almlkaide.kaypro.android.dx.dex.code.PositionList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.io.PrintWriter;

public class DebugInfoItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final boolean ENABLE_ENCODER_SELF_CHECK = false;
    private final DalvCode code;
    private byte[] encoded;
    private final boolean isStatic;

    private final CstMethodRef f5028ref;

    @Override
    public void addContents(DexFile dexFile) {
    }

    public DebugInfoItem(DalvCode dalvCode, boolean z, CstMethodRef cstMethodRef) {
        super(1, -1);
        if (dalvCode == null) {
            throw new NullPointerException("code == null");
        }
        this.code = dalvCode;
        this.isStatic = z;
        this.f5028ref = cstMethodRef;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_DEBUG_INFO_ITEM;
    }

    @Override
    protected void place0(Section section, int i) {
        try {
            this.encoded = encode(section.getFile(), (String) null, (PrintWriter) null, (AnnotatedOutput) null, false);
            setWriteSize(this.encoded.length);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, new StringBuffer().append("...while placing debug info for ").append(this.f5028ref.toHuman()).toString());
        }
    }

    @Override
    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    public void annotateTo(DexFile dexFile, AnnotatedOutput annotatedOutput, String str) {
        encode(dexFile, str, (PrintWriter) null, annotatedOutput, false);
    }

    public void debugPrint(PrintWriter printWriter, String str) {
        encode((DexFile) null, str, printWriter, (AnnotatedOutput) null, false);
    }

    @Override
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(new StringBuffer().append(offsetString()).append(" debug info").toString());
            encode(dexFile, (String) null, (PrintWriter) null, annotatedOutput, true);
        }
        annotatedOutput.write(this.encoded);
    }

    private byte[] encode(DexFile dexFile, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        return encode0(dexFile, str, printWriter, annotatedOutput, z);
    }

    private byte[] encode0(DexFile dexFile, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        PositionList positions = this.code.getPositions();
        LocalList locals = this.code.getLocals();
        DalvInsnList insns = this.code.getInsns();
        DebugInfoEncoder debugInfoEncoder = new DebugInfoEncoder(positions, locals, dexFile, insns.codeSize(), insns.getRegistersSize(), this.isStatic, this.f5028ref);
        if (printWriter == null && annotatedOutput == null) {
            return debugInfoEncoder.convert();
        }
        return debugInfoEncoder.convertAndAnnotate(str, printWriter, annotatedOutput, z);
    }
}
