package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBaseMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstEnumRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Adler32;

public final class DexFile {
    private final CallSiteIdsSection callSiteIds;
    private final DexOptions dexOptions;
    private int dumpWidth;
    private int fileSize;
    private final MethodHandlesSection methodHandles;
    private final Section[] sections;
    private final HeaderSection header = new HeaderSection(this);
    private final MixedItemSection typeLists = new MixedItemSection((String) null, this, 4, MixedItemSection.SortType.NONE);
    private final MixedItemSection wordData = new MixedItemSection("word_data", this, 4, MixedItemSection.SortType.TYPE);
    private final MixedItemSection stringData = new MixedItemSection("string_data", this, 1, MixedItemSection.SortType.INSTANCE);
    private final MixedItemSection classData = new MixedItemSection((String) null, this, 1, MixedItemSection.SortType.NONE);
    private final MixedItemSection byteData = new MixedItemSection("byte_data", this, 1, MixedItemSection.SortType.TYPE);
    private final StringIdsSection stringIds = new StringIdsSection(this);
    private final TypeIdsSection typeIds = new TypeIdsSection(this);
    private final ProtoIdsSection protoIds = new ProtoIdsSection(this);
    private final FieldIdsSection fieldIds = new FieldIdsSection(this);
    private final MethodIdsSection methodIds = new MethodIdsSection(this);
    private final ClassDefsSection classDefs = new ClassDefsSection(this);

    private final MixedItemSection f5029map = new MixedItemSection("map", this, 4, MixedItemSection.SortType.NONE);

    public DexFile(DexOptions dexOptions) {
        this.dexOptions = dexOptions;
        if (dexOptions.apiIsSupported(26)) {
            this.callSiteIds = new CallSiteIdsSection(this);
            this.methodHandles = new MethodHandlesSection(this);
            this.sections = new Section[]{this.header, this.stringIds, this.typeIds, this.protoIds, this.fieldIds, this.methodIds, this.classDefs, this.callSiteIds, this.methodHandles, this.wordData, this.typeLists, this.stringData, this.byteData, this.classData, this.f5029map};
        } else {
            this.callSiteIds = (CallSiteIdsSection) null;
            this.methodHandles = (MethodHandlesSection) null;
            this.sections = new Section[]{this.header, this.stringIds, this.typeIds, this.protoIds, this.fieldIds, this.methodIds, this.classDefs, this.wordData, this.typeLists, this.stringData, this.byteData, this.classData, this.f5029map};
        }
        this.fileSize = -1;
        this.dumpWidth = 79;
    }

    public boolean isEmpty() {
        return this.classDefs.items().isEmpty();
    }

    public DexOptions getDexOptions() {
        return this.dexOptions;
    }

    public void m7167add(ClassDefItem classDefItem) {
        this.classDefs.m7166add(classDefItem);
    }

    public ClassDefItem getClassOrNull(String str) {
        try {
            return (ClassDefItem) this.classDefs.mo7165get(new CstType(Type.internClassName(str)));
        } catch (IllegalArgumentException e) {
            return (ClassDefItem) null;
        }
    }

    public void writeTo(OutputStream outputStream, Writer writer, boolean z) throws IOException {
        writeTo(outputStream, (Storage) null, writer, z);
    }

    public void writeTo(OutputStream outputStream, Storage storage, Writer writer, boolean z) throws IOException {
        boolean z2 = writer != null;
        ByteArrayAnnotatedOutput dex0 = toDex0(z2, z, storage);
        if (outputStream != null) {
            outputStream.write(dex0.getArray());
        }
        if (z2) {
            dex0.writeAnnotationsTo(writer);
        }
    }

    public ByteArrayAnnotatedOutput writeTo(Storage storage) {
        return toDex0(false, false, storage);
    }

    public byte[] toDex(Writer writer, boolean z) throws IOException {
        boolean z2 = writer != null;
        ByteArrayAnnotatedOutput dex0 = toDex0(z2, z, (Storage) null);
        if (z2) {
            dex0.writeAnnotationsTo(writer);
        }
        return dex0.getArray();
    }

    public void setDumpWidth(int i) {
        if (i < 40) {
            throw new IllegalArgumentException("dumpWidth < 40");
        }
        this.dumpWidth = i;
    }

    public int getFileSize() {
        if (this.fileSize < 0) {
            throw new RuntimeException("file size not yet known");
        }
        return this.fileSize;
    }

    MixedItemSection getStringData() {
        return this.stringData;
    }

    MixedItemSection getWordData() {
        return this.wordData;
    }

    MixedItemSection getTypeLists() {
        return this.typeLists;
    }

    MixedItemSection getMap() {
        return this.f5029map;
    }

    StringIdsSection getStringIds() {
        return this.stringIds;
    }

    public ClassDefsSection getClassDefs() {
        return this.classDefs;
    }

    MixedItemSection getClassData() {
        return this.classData;
    }

    public TypeIdsSection getTypeIds() {
        return this.typeIds;
    }

    ProtoIdsSection getProtoIds() {
        return this.protoIds;
    }

    public FieldIdsSection getFieldIds() {
        return this.fieldIds;
    }

    public MethodIdsSection getMethodIds() {
        return this.methodIds;
    }

    public MethodHandlesSection getMethodHandles() {
        return this.methodHandles;
    }

    public CallSiteIdsSection getCallSiteIds() {
        return this.callSiteIds;
    }

    MixedItemSection getByteData() {
        return this.byteData;
    }

    Section getFirstDataSection() {
        return this.wordData;
    }

    Section getLastDataSection() {
        return this.f5029map;
    }

    void internIfAppropriate(Constant constant) {
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        if (constant instanceof CstString) {
            this.stringIds.intern((CstString) constant);
            return;
        }
        if (constant instanceof CstType) {
            this.typeIds.intern((CstType) constant);
            return;
        }
        if (constant instanceof CstBaseMethodRef) {
            this.methodIds.intern((CstBaseMethodRef) constant);
            return;
        }
        if (constant instanceof CstFieldRef) {
            this.fieldIds.intern((CstFieldRef) constant);
            return;
        }
        if (constant instanceof CstEnumRef) {
            this.fieldIds.intern(((CstEnumRef) constant).getFieldRef());
        } else if (constant instanceof CstProtoRef) {
            this.protoIds.intern(((CstProtoRef) constant).getPrototype());
        } else if (constant instanceof CstMethodHandle) {
            this.methodHandles.intern((CstMethodHandle) constant);
        }
    }

    IndexedItem findItemOrNull(Constant constant) {
        if (constant instanceof CstString) {
            return this.stringIds.mo7165get(constant);
        }
        if (constant instanceof CstType) {
            return this.typeIds.mo7165get(constant);
        }
        if (constant instanceof CstBaseMethodRef) {
            return this.methodIds.mo7165get(constant);
        }
        if (constant instanceof CstFieldRef) {
            return this.fieldIds.mo7165get(constant);
        }
        if (constant instanceof CstEnumRef) {
            return this.fieldIds.intern(((CstEnumRef) constant).getFieldRef());
        }
        if (constant instanceof CstProtoRef) {
            return this.protoIds.mo7165get(constant);
        }
        if (constant instanceof CstMethodHandle) {
            return this.methodHandles.mo7165get(constant);
        }
        if (constant instanceof CstCallSiteRef) {
            return this.callSiteIds.mo7165get(constant);
        }
        return (IndexedItem) null;
    }

    public static final class Storage {
        byte[] storage;

        public Storage(byte[] bArr) {
            this.storage = bArr;
        }

        public byte[] getStorage(int i) {
            if (this.storage.length < i) {
                Logger.getAnonymousLogger().log(Level.FINER, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("DexFile storage too small  ").append(this.storage.length).toString()).append(" vs ").toString()).append(i).toString());
                this.storage = new byte[i];
            }
            return this.storage;
        }
    }

    private ByteArrayAnnotatedOutput toDex0(boolean z, boolean z2, Storage storage) {
        ExceptionWithContext exceptionWithContext;
        this.classDefs.prepare();
        this.classData.prepare();
        this.wordData.prepare();
        if (this.dexOptions.apiIsSupported(26)) {
            this.callSiteIds.prepare();
        }
        this.byteData.prepare();
        if (this.dexOptions.apiIsSupported(26)) {
            this.methodHandles.prepare();
        }
        this.methodIds.prepare();
        this.fieldIds.prepare();
        this.protoIds.prepare();
        this.typeLists.prepare();
        this.typeIds.prepare();
        this.stringIds.prepare();
        this.stringData.prepare();
        this.header.prepare();
        int length = this.sections.length;
        int iWriteSize = 0;
        for (int i = 0; i < length; i++) {
            Section section = this.sections[i];
            if ((section != this.callSiteIds && section != this.methodHandles) || !section.items().isEmpty()) {
                int fileOffset = section.setFileOffset(iWriteSize);
                if (fileOffset < iWriteSize) {
                    throw new RuntimeException(new StringBuffer().append("bogus placement for section ").append(i).toString());
                }
                try {
                    if (section == this.f5029map) {
                        MapItem.addMap(this.sections, this.f5029map);
                        this.f5029map.prepare();
                    }
                    if (section instanceof MixedItemSection) {
                        ((MixedItemSection) section).placeItems();
                    }
                    iWriteSize = section.writeSize() + fileOffset;
                } catch (RuntimeException e) {
                    throw ExceptionWithContext.withContext(e, new StringBuffer().append("...while writing section ").append(i).toString());
                }
            }
        }
        this.fileSize = iWriteSize;
        byte[] storage2 = storage == null ? new byte[this.fileSize] : storage.getStorage(this.fileSize);
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(storage2);
        if (z) {
            byteArrayAnnotatedOutput.enableAnnotations(this.dumpWidth, z2);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                Section section2 = this.sections[i2];
                if ((section2 != this.callSiteIds && section2 != this.methodHandles) || !section2.items().isEmpty()) {
                    int fileOffset2 = section2.getFileOffset() - byteArrayAnnotatedOutput.getCursor();
                    if (fileOffset2 < 0) {
                        throw new ExceptionWithContext(new StringBuffer().append("excess write of ").append(-fileOffset2).toString());
                    }
                    byteArrayAnnotatedOutput.writeZeroes(fileOffset2);
                    section2.writeTo(byteArrayAnnotatedOutput);
                }
            } catch (RuntimeException e2) {
                if (e2 instanceof ExceptionWithContext) {
                    exceptionWithContext = (ExceptionWithContext) e2;
                } else {
                    exceptionWithContext = new ExceptionWithContext(e2);
                }
                exceptionWithContext.addContext(new StringBuffer().append("...while writing section ").append(i2).toString());
                throw exceptionWithContext;
            }
        }
        if (byteArrayAnnotatedOutput.getCursor() != this.fileSize) {
            throw new RuntimeException("foreshortened write");
        }
        calcSignature(storage2, byteArrayAnnotatedOutput.getCursor());
        calcChecksum(storage2, byteArrayAnnotatedOutput.getCursor());
        if (z) {
            this.wordData.writeIndexAnnotation(byteArrayAnnotatedOutput, ItemType.TYPE_CODE_ITEM, "\nmethod code index:\n\n");
            getStatistics().writeAnnotation(byteArrayAnnotatedOutput);
            byteArrayAnnotatedOutput.finishAnnotating();
        }
        return byteArrayAnnotatedOutput;
    }

    public Statistics getStatistics() {
        Statistics statistics = new Statistics();
        for (Section section : this.sections) {
            statistics.addAll(section);
        }
        return statistics;
    }

    private static void calcSignature(byte[] bArr, int i) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, i - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("unexpected digest write: ").append(iDigest).toString()).append(" bytes").toString());
                }
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void calcChecksum(byte[] bArr, int i) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, i - 12);
        int value = (int) adler32.getValue();
        bArr[8] = (byte) value;
        bArr[9] = (byte) (value >> 8);
        bArr[10] = (byte) (value >> 16);
        bArr[11] = (byte) (value >> 24);
    }
}
