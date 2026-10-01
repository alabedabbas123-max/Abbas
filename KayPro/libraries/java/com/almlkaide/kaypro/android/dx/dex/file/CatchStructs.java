package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.dex.code.CatchHandlerList;
import com.almlkaide.kaypro.android.dx.dex.code.CatchTable;
import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public final class CatchStructs {
    private static final int TRY_ITEM_WRITE_SIZE = 8;
    private final DalvCode code;
    private CatchTable table = (CatchTable) null;
    private byte[] encodedHandlers = (byte[]) null;
    private int encodedHandlerHeaderSize = 0;
    private TreeMap<CatchHandlerList, Integer> handlerOffsets = (TreeMap) null;

    public CatchStructs(DalvCode dalvCode) {
        this.code = dalvCode;
    }

    private void finishProcessingIfNecessary() {
        if (this.table == null) {
            this.table = this.code.getCatches();
        }
    }

    public int triesSize() {
        finishProcessingIfNecessary();
        return this.table.size();
    }

    public void debugPrint(PrintWriter printWriter, String str) {
        annotateEntries(str, printWriter, (AnnotatedOutput) null);
    }

    public void encode(DexFile dexFile) {
        int i;
        finishProcessingIfNecessary();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.table.size();
        this.handlerOffsets = new TreeMap<>();
        for (int i2 = 0; i2 < size; i2++) {
            this.handlerOffsets.put(this.table.m7150get(i2).getHandlers(), (Integer) null);
        }
        if (this.handlerOffsets.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        this.encodedHandlerHeaderSize = byteArrayAnnotatedOutput.writeUleb128(this.handlerOffsets.size());
        for (Map.Entry<CatchHandlerList, Integer> entry : this.handlerOffsets.entrySet()) {
            CatchHandlerList key = entry.getKey();
            int size2 = key.size();
            boolean zCatchesAll = key.catchesAll();
            entry.setValue(new Integer(byteArrayAnnotatedOutput.getCursor()));
            if (zCatchesAll) {
                byteArrayAnnotatedOutput.writeSleb128(-(size2 - 1));
                i = size2 - 1;
            } else {
                byteArrayAnnotatedOutput.writeSleb128(size2);
                i = size2;
            }
            for (int i3 = 0; i3 < i; i3++) {
                CatchHandlerList.Entry entryM7147get = key.m7147get(i3);
                byteArrayAnnotatedOutput.writeUleb128(typeIds.indexOf(entryM7147get.getExceptionType()));
                byteArrayAnnotatedOutput.writeUleb128(entryM7147get.getHandler());
            }
            if (zCatchesAll) {
                byteArrayAnnotatedOutput.writeUleb128(key.m7147get(i).getHandler());
            }
        }
        this.encodedHandlers = byteArrayAnnotatedOutput.toByteArray();
    }

    public int writeSize() {
        return (triesSize() * 8) + this.encodedHandlers.length;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        finishProcessingIfNecessary();
        if (annotatedOutput.annotates()) {
            annotateEntries("  ", (PrintWriter) null, annotatedOutput);
        }
        int size = this.table.size();
        for (int i = 0; i < size; i++) {
            CatchTable.Entry entryM7150get = this.table.m7150get(i);
            int start = entryM7150get.getStart();
            int end = entryM7150get.getEnd();
            int i2 = end - start;
            if (i2 >= 65536) {
                throw new UnsupportedOperationException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("bogus exception range: ").append(Hex.m7227u4(start)).toString()).append("..").toString()).append(Hex.m7227u4(end)).toString());
            }
            annotatedOutput.writeInt(start);
            annotatedOutput.writeShort(i2);
            annotatedOutput.writeShort(this.handlerOffsets.get(entryM7150get.getHandlers()).intValue());
        }
        annotatedOutput.write(this.encodedHandlers);
    }

    private void annotateEntries(String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput) {
        finishProcessingIfNecessary();
        boolean z = annotatedOutput != null;
        int i = z ? 6 : 0;
        int i2 = z ? 2 : 0;
        int size = this.table.size();
        String string = new StringBuffer().append(str).append("  ").toString();
        if (z) {
            annotatedOutput.annotate(0, new StringBuffer().append(str).append("tries:").toString());
        } else {
            printWriter.println(new StringBuffer().append(str).append("tries:").toString());
        }
        for (int i3 = 0; i3 < size; i3++) {
            CatchTable.Entry entryM7150get = this.table.m7150get(i3);
            CatchHandlerList handlers = entryM7150get.getHandlers();
            String string2 = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(string).append("try ").toString()).append(Hex.u2or4(entryM7150get.getStart())).toString()).append("..").toString()).append(Hex.u2or4(entryM7150get.getEnd())).toString();
            String human = handlers.toHuman(string, "");
            if (z) {
                annotatedOutput.annotate(i, string2);
                annotatedOutput.annotate(i2, human);
            } else {
                printWriter.println(string2);
                printWriter.println(human);
            }
        }
        if (z) {
            annotatedOutput.annotate(0, new StringBuffer().append(str).append("handlers:").toString());
            annotatedOutput.annotate(this.encodedHandlerHeaderSize, new StringBuffer().append(new StringBuffer().append(string).append("size: ").toString()).append(Hex.m7225u2(this.handlerOffsets.size())).toString());
            CatchHandlerList catchHandlerList = (CatchHandlerList) null;
            int i4 = 0;
            for (Map.Entry<CatchHandlerList, Integer> entry : this.handlerOffsets.entrySet()) {
                CatchHandlerList key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                if (catchHandlerList != null) {
                    annotateAndConsumeHandlers(catchHandlerList, i4, iIntValue - i4, string, printWriter, annotatedOutput);
                }
                catchHandlerList = key;
                i4 = iIntValue;
            }
            annotateAndConsumeHandlers(catchHandlerList, i4, this.encodedHandlers.length - i4, string, printWriter, annotatedOutput);
        }
    }

    private static void annotateAndConsumeHandlers(CatchHandlerList catchHandlerList, int i, int i2, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput) {
        String human = catchHandlerList.toHuman(str, new StringBuffer().append(Hex.m7225u2(i)).append(": ").toString());
        if (printWriter != null) {
            printWriter.println(human);
        }
        annotatedOutput.annotate(i2, human);
    }
}
