package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.DexFormat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class HeaderItem extends IndexedItem {
    @Override
    public void addContents(DexFile dexFile) {
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_HEADER_ITEM;
    }

    @Override
    public int writeSize() {
        return 112;
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int fileOffset = dexFile.getMap().getFileOffset();
        Section firstDataSection = dexFile.getFirstDataSection();
        Section lastDataSection = dexFile.getLastDataSection();
        int fileOffset2 = firstDataSection.getFileOffset();
        int fileOffset3 = (lastDataSection.getFileOffset() + lastDataSection.writeSize()) - fileOffset2;
        String magic = dexFile.getDexOptions().getMagic();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(8, new StringBuffer().append("magic: ").append(new CstString(magic).toQuoted()).toString());
            annotatedOutput.annotate(4, "checksum");
            annotatedOutput.annotate(20, "signature");
            annotatedOutput.annotate(4, new StringBuffer().append("file_size:       ").append(Hex.m7227u4(dexFile.getFileSize())).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("header_size:     ").append(Hex.m7227u4(112)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("endian_tag:      ").append(Hex.m7227u4(DexFormat.ENDIAN_TAG)).toString());
            annotatedOutput.annotate(4, "link_size:       0");
            annotatedOutput.annotate(4, "link_off:        0");
            annotatedOutput.annotate(4, new StringBuffer().append("map_off:         ").append(Hex.m7227u4(fileOffset)).toString());
        }
        for (int i = 0; i < 8; i++) {
            annotatedOutput.writeByte(magic.charAt(i));
        }
        annotatedOutput.writeZeroes(24);
        annotatedOutput.writeInt(dexFile.getFileSize());
        annotatedOutput.writeInt(112);
        annotatedOutput.writeInt(DexFormat.ENDIAN_TAG);
        annotatedOutput.writeZeroes(8);
        annotatedOutput.writeInt(fileOffset);
        dexFile.getStringIds().writeHeaderPart(annotatedOutput);
        dexFile.getTypeIds().writeHeaderPart(annotatedOutput);
        dexFile.getProtoIds().writeHeaderPart(annotatedOutput);
        dexFile.getFieldIds().writeHeaderPart(annotatedOutput);
        dexFile.getMethodIds().writeHeaderPart(annotatedOutput);
        dexFile.getClassDefs().writeHeaderPart(annotatedOutput);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, new StringBuffer().append("data_size:       ").append(Hex.m7227u4(fileOffset3)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("data_off:        ").append(Hex.m7227u4(fileOffset2)).toString());
        }
        annotatedOutput.writeInt(fileOffset3);
        annotatedOutput.writeInt(fileOffset2);
    }
}
