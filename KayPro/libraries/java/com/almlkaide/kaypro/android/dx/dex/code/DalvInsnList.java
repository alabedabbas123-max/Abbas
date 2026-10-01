package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBaseMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;
import com.almlkaide.kaypro.android.dx.util.IndentingWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public final class DalvInsnList extends FixedSizeList {
    private final int regCount;

    public static DalvInsnList makeImmutable(ArrayList<DalvInsn> arrayList, int i) {
        int size = arrayList.size();
        DalvInsnList dalvInsnList = new DalvInsnList(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            dalvInsnList.m7153set(i2, arrayList.get(i2));
        }
        dalvInsnList.setImmutable();
        return dalvInsnList;
    }

    public DalvInsnList(int i, int i2) {
        super(i);
        this.regCount = i2;
    }

    public DalvInsn m7152get(int i) {
        return (DalvInsn) get0(i);
    }

    public void m7153set(int i, DalvInsn dalvInsn) {
        set0(i, dalvInsn);
    }

    public int codeSize() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        return m7152get(size - 1).getNextAddress();
    }

    public void writeTo(AnnotatedOutput annotatedOutput) {
        String strListingString;
        int cursor = annotatedOutput.getCursor();
        int size = size();
        if (annotatedOutput.annotates()) {
            boolean zIsVerbose = annotatedOutput.isVerbose();
            for (int i = 0; i < size; i++) {
                DalvInsn dalvInsn = (DalvInsn) get0(i);
                int iCodeSize = dalvInsn.codeSize() * 2;
                if (iCodeSize != 0 || zIsVerbose) {
                    strListingString = dalvInsn.listingString("  ", annotatedOutput.getAnnotationWidth(), true);
                } else {
                    strListingString = (String) null;
                }
                if (strListingString != null) {
                    annotatedOutput.annotate(iCodeSize, strListingString);
                } else if (iCodeSize != 0) {
                    annotatedOutput.annotate(iCodeSize, "");
                }
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn2 = (DalvInsn) get0(i2);
            try {
                dalvInsn2.writeTo(annotatedOutput);
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, new StringBuffer().append("...while writing ").append(dalvInsn2).toString());
            }
        }
        int cursor2 = (annotatedOutput.getCursor() - cursor) / 2;
        if (cursor2 != codeSize()) {
            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("write length mismatch; expected ").append(codeSize()).toString()).append(" but actually wrote ").toString()).append(cursor2).toString());
        }
    }

    public int getRegistersSize() {
        return this.regCount;
    }

    public int getOutsSize() {
        int wordCount;
        int size = size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            DalvInsn dalvInsn = (DalvInsn) get0(i);
            if (dalvInsn instanceof CstInsn) {
                Constant constant = ((CstInsn) dalvInsn).getConstant();
                if (constant instanceof CstBaseMethodRef) {
                    wordCount = ((CstBaseMethodRef) constant).getParameterWordCount(dalvInsn.getOpcode().getFamily() == 113);
                } else {
                    wordCount = constant instanceof CstCallSiteRef ? ((CstCallSiteRef) constant).getPrototype().getParameterTypes().getWordCount() : 0;
                }
            } else {
                if (!(dalvInsn instanceof MultiCstInsn)) {
                    wordCount = i2;
                } else {
                    if (dalvInsn.getOpcode().getFamily() != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    wordCount = ((CstProtoRef) ((MultiCstInsn) dalvInsn).getConstant(1)).getPrototype().getParameterTypes().getWordCount() + 1;
                }
                i++;
                i2 = wordCount;
            }
            if (wordCount <= i2) {
                wordCount = i2;
            }
            i++;
            i2 = wordCount;
        }
        return i2;
    }

    public void debugPrint(Writer writer, String str, boolean z) {
        String strListingString;
        IndentingWriter indentingWriter = new IndentingWriter(writer, 0, str);
        int size = size();
        for (int i = 0; i < size; i++) {
            try {
                DalvInsn dalvInsn = (DalvInsn) get0(i);
                if (dalvInsn.codeSize() != 0 || z) {
                    strListingString = dalvInsn.listingString("", 0, z);
                } else {
                    strListingString = (String) null;
                }
                if (strListingString != null) {
                    indentingWriter.write(strListingString);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        indentingWriter.flush();
    }

    public void debugPrint(OutputStream outputStream, String str, boolean z) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        debugPrint(outputStreamWriter, str, z);
        try {
            outputStreamWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
