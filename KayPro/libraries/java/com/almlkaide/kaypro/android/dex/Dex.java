package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.ByteInput;
import com.almlkaide.kaypro.android.dex.util.ByteOutput;
import com.almlkaide.kaypro.android.dex.util.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.zip.Adler32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class Dex {
    private static final int CHECKSUM_OFFSET = 8;
    private static final int CHECKSUM_SIZE = 4;
    static final short[] EMPTY_SHORT_ARRAY = new short[0];
    private static final int SIGNATURE_OFFSET = 12;
    private static final int SIGNATURE_SIZE = 20;
    private ByteBuffer data;
    private final FieldIdTable fieldIds;
    private final MethodIdTable methodIds;
    private int nextSectionStart;
    private final ProtoIdTable protoIds;
    private final StringTable strings;
    private final TableOfContents tableOfContents;
    private final TypeIndexToDescriptorIndexTable typeIds;
    private final TypeIndexToDescriptorTable typeNames;

    public Dex(byte[] bArr) throws IOException {
        this(ByteBuffer.wrap(bArr));
    }

    Dex(ByteBuffer byteBuffer) throws IOException {
        this.tableOfContents = new TableOfContents();
        this.nextSectionStart = 0;
        this.strings = new StringTable(this);
        this.typeIds = new TypeIndexToDescriptorIndexTable(this);
        this.typeNames = new TypeIndexToDescriptorTable(this);
        this.protoIds = new ProtoIdTable(this);
        this.fieldIds = new FieldIdTable(this);
        this.methodIds = new MethodIdTable(this);
        this.data = byteBuffer;
        this.data.order(ByteOrder.LITTLE_ENDIAN);
        this.tableOfContents.readFrom(this);
    }

    public Dex(int i) throws IOException {
        this.tableOfContents = new TableOfContents();
        this.nextSectionStart = 0;
        this.strings = new StringTable(this);
        this.typeIds = new TypeIndexToDescriptorIndexTable(this);
        this.typeNames = new TypeIndexToDescriptorTable(this);
        this.protoIds = new ProtoIdTable(this);
        this.fieldIds = new FieldIdTable(this);
        this.methodIds = new MethodIdTable(this);
        this.data = ByteBuffer.wrap(new byte[i]);
        this.data.order(ByteOrder.LITTLE_ENDIAN);
    }

    public Dex(InputStream inputStream) throws IOException {
        this.tableOfContents = new TableOfContents();
        this.nextSectionStart = 0;
        this.strings = new StringTable(this);
        this.typeIds = new TypeIndexToDescriptorIndexTable(this);
        this.typeNames = new TypeIndexToDescriptorTable(this);
        this.protoIds = new ProtoIdTable(this);
        this.fieldIds = new FieldIdTable(this);
        this.methodIds = new MethodIdTable(this);
        try {
            loadFrom(inputStream);
        } finally {
            inputStream.close();
        }
    }

    public Dex(File file) throws IOException {
        Throwable th = null;
        this.tableOfContents = new TableOfContents();
        this.nextSectionStart = 0;
        this.strings = new StringTable(this);
        this.typeIds = new TypeIndexToDescriptorIndexTable(this);
        this.typeNames = new TypeIndexToDescriptorTable(this);
        this.protoIds = new ProtoIdTable(this);
        this.fieldIds = new FieldIdTable(this);
        this.methodIds = new MethodIdTable(this);
        if (FileUtils.hasArchiveSuffix(file.getName())) {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry(DexFormat.DEX_IN_JAR_NAME);
            if (entry != null) {
                try {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        loadFrom(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        zipFile.close();
                        return;
                    } catch (Throwable th2) {
                        if (inputStream == null) {
                            throw th2;
                        }
                        inputStream.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (0 == 0) {
                        throw th3;
                    }
                    if (null != th3) {
                        th.addSuppressed(th3);
                    }
                    throw null;
                }
            }
            throw new DexException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Expected ").append(DexFormat.DEX_IN_JAR_NAME).toString()).append(" in ").toString()).append(file).toString());
        }
        if (file.getName().endsWith(".dex")) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    loadFrom(fileInputStream);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    if (fileInputStream == null) {
                        throw th4;
                    }
                    fileInputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (0 == 0) {
                    throw th5;
                }
                if (null != th5) {
                    th.addSuppressed(th5);
                }
                throw null;
            }
        }
        throw new DexException(new StringBuffer().append("unknown output extension: ").append(file).toString());
    }

    private void loadFrom(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                this.data = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                this.data.order(ByteOrder.LITTLE_ENDIAN);
                this.tableOfContents.readFrom(this);
                return;
            }
        }
    }

    public static void checkBounds(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("index:").append(i).toString()).append(", length=").toString()).append(i2).toString());
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.data.duplicate();
        byteBufferDuplicate.clear();
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(bArr.length, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            outputStream.write(bArr, 0, iMin);
        }
    }

    public void writeTo(File file) throws IOException {
        Throwable th = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                writeTo(fileOutputStream);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th2) {
                if (fileOutputStream == null) {
                    throw th2;
                }
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            if (0 == 0) {
                throw th3;
            }
            if (null != th3) {
                th.addSuppressed(th3);
            }
        }
    }

    public TableOfContents getTableOfContents() {
        return this.tableOfContents;
    }

    public Section open(int i) {
        if (i < 0 || i >= this.data.capacity()) {
            throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("position=").append(i).toString()).append(" length=").toString()).append(this.data.capacity()).toString());
        }
        ByteBuffer byteBufferDuplicate = this.data.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(this.data.capacity());
        return new Section(this, "section", byteBufferDuplicate);
    }

    public Section appendSection(int i, String str) {
        if ((i & 3) != 0) {
            throw new IllegalStateException("Not four byte aligned!");
        }
        int i2 = this.nextSectionStart + i;
        ByteBuffer byteBufferDuplicate = this.data.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferDuplicate.position(this.nextSectionStart);
        byteBufferDuplicate.limit(i2);
        Section section = new Section(this, str, byteBufferDuplicate);
        this.nextSectionStart = i2;
        return section;
    }

    public int getLength() {
        return this.data.capacity();
    }

    public int getNextSectionStart() {
        return this.nextSectionStart;
    }

    public byte[] getBytes() {
        ByteBuffer byteBufferDuplicate = this.data.duplicate();
        byte[] bArr = new byte[byteBufferDuplicate.capacity()];
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.get(bArr);
        return bArr;
    }

    public List<String> strings() {
        return this.strings;
    }

    public List<Integer> typeIds() {
        return this.typeIds;
    }

    public List<String> typeNames() {
        return this.typeNames;
    }

    public List<ProtoId> protoIds() {
        return this.protoIds;
    }

    public List<FieldId> fieldIds() {
        return this.fieldIds;
    }

    public List<MethodId> methodIds() {
        return this.methodIds;
    }

    public Iterable<ClassDef> classDefs() {
        return new ClassDefIterable(this);
    }

    public TypeList readTypeList(int i) {
        return i == 0 ? TypeList.EMPTY : open(i).readTypeList();
    }

    public ClassData readClassData(ClassDef classDef) {
        int classDataOffset = classDef.getClassDataOffset();
        if (classDataOffset == 0) {
            throw new IllegalArgumentException("offset == 0");
        }
        return open(classDataOffset).readClassData();
    }

    public Code readCode(ClassData.Method method) {
        int codeOffset = method.getCodeOffset();
        if (codeOffset == 0) {
            throw new IllegalArgumentException("offset == 0");
        }
        return open(codeOffset).readCode();
    }

    public byte[] computeSignature() throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferDuplicate = this.data.duplicate();
            byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
            byteBufferDuplicate.position(32);
            while (byteBufferDuplicate.hasRemaining()) {
                int iMin = Math.min(bArr.length, byteBufferDuplicate.remaining());
                byteBufferDuplicate.get(bArr, 0, iMin);
                messageDigest.update(bArr, 0, iMin);
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError();
        }
    }

    public int computeChecksum() throws IOException {
        Adler32 adler32 = new Adler32();
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.data.duplicate();
        byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
        byteBufferDuplicate.position(12);
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(bArr.length, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            adler32.update(bArr, 0, iMin);
        }
        return (int) adler32.getValue();
    }

    public void writeHashes() throws IOException {
        open(12).write(computeSignature());
        open(8).writeInt(computeChecksum());
    }

    public int descriptorIndexFromTypeIndex(int i) {
        checkBounds(i, this.tableOfContents.typeIds.size);
        return this.data.getInt(this.tableOfContents.typeIds.f4980off + (i * 4));
    }

    public final class Section implements ByteInput, ByteOutput {
        private final ByteBuffer data;
        private final int initialPosition;
        private final String name;
        private final Dex this$0;

        Section(Dex c1679Dex, String str, ByteBuffer byteBuffer) {
            this.this$0 = c1679Dex;
            this.name = str;
            this.data = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        public int getPosition() {
            return this.data.position();
        }

        public int readInt() {
            return this.data.getInt();
        }

        public short readShort() {
            return this.data.getShort();
        }

        public int readUnsignedShort() {
            return readShort() & 65535;
        }

        @Override
        public byte readByte() {
            return this.data.get();
        }

        public byte[] readByteArray(int i) {
            byte[] bArr = new byte[i];
            this.data.get(bArr);
            return bArr;
        }

        public short[] readShortArray(int i) {
            if (i == 0) {
                return Dex.EMPTY_SHORT_ARRAY;
            }
            short[] sArr = new short[i];
            for (int i2 = 0; i2 < i; i2++) {
                sArr[i2] = readShort();
            }
            return sArr;
        }

        public int readUleb128() {
            return Leb128.readUnsignedLeb128(this);
        }

        public int readUleb128p1() {
            return Leb128.readUnsignedLeb128(this) - 1;
        }

        public int readSleb128() {
            return Leb128.readSignedLeb128(this);
        }

        public void writeUleb128p1(int i) {
            writeUleb128(i + 1);
        }

        public TypeList readTypeList() {
            short[] shortArray = readShortArray(readInt());
            alignToFourBytes();
            return new TypeList(this.this$0, shortArray);
        }

        public String readString() {
            int i = readInt();
            int iPosition = this.data.position();
            int iLimit = this.data.limit();
            this.data.position(i);
            this.data.limit(this.data.capacity());
            try {
                try {
                    int uleb128 = readUleb128();
                    String strDecode = Mutf8.decode(this, new char[uleb128]);
                    if (strDecode.length() != uleb128) {
                        throw new DexException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Declared length ").append(uleb128).toString()).append(" doesn't match decoded length of ").toString()).append(strDecode.length()).toString());
                    }
                    this.data.position(iPosition);
                    this.data.limit(iLimit);
                    return strDecode;
                } catch (UTFDataFormatException e) {
                    throw new DexException(e);
                }
            } catch (Throwable th) {
                this.data.position(iPosition);
                this.data.limit(iLimit);
                throw th;
            }
        }

        public FieldId readFieldId() {
            return new FieldId(this.this$0, readUnsignedShort(), readUnsignedShort(), readInt());
        }

        public MethodId readMethodId() {
            return new MethodId(this.this$0, readUnsignedShort(), readUnsignedShort(), readInt());
        }

        public ProtoId readProtoId() {
            return new ProtoId(this.this$0, readInt(), readInt(), readInt());
        }

        public CallSiteId readCallSiteId() {
            return new CallSiteId(this.this$0, readInt());
        }

        public MethodHandle readMethodHandle() {
            return new MethodHandle(this.this$0, MethodHandle.MethodHandleType.fromValue(readUnsignedShort()), readUnsignedShort(), readUnsignedShort(), readUnsignedShort());
        }

        public ClassDef readClassDef() {
            return new ClassDef(this.this$0, getPosition(), readInt(), readInt(), readInt(), readInt(), readInt(), readInt(), readInt(), readInt());
        }

        public Code readCode() {
            Code.C1678Try[] tries;
            Code.CatchHandler[] catchHandlers;
            int unsignedShort = readUnsignedShort();
            int unsignedShort2 = readUnsignedShort();
            int unsignedShort3 = readUnsignedShort();
            int unsignedShort4 = readUnsignedShort();
            int i = readInt();
            short[] shortArray = readShortArray(readInt());
            if (unsignedShort4 > 0) {
                if (shortArray.length % 2 == 1) {
                    readShort();
                }
                Section sectionOpen = this.this$0.open(this.data.position());
                skip(unsignedShort4 * 8);
                catchHandlers = readCatchHandlers();
                tries = sectionOpen.readTries(unsignedShort4, catchHandlers);
            } else {
                tries = new Code.C1678Try[0];
                catchHandlers = new Code.CatchHandler[0];
            }
            return new Code(unsignedShort, unsignedShort2, unsignedShort3, i, shortArray, tries, catchHandlers);
        }

        private Code.CatchHandler[] readCatchHandlers() {
            int iPosition = this.data.position();
            int uleb128 = readUleb128();
            Code.CatchHandler[] catchHandlerArr = new Code.CatchHandler[uleb128];
            for (int i = 0; i < uleb128; i++) {
                catchHandlerArr[i] = readCatchHandler(this.data.position() - iPosition);
            }
            return catchHandlerArr;
        }

        private Code.C1678Try[] readTries(int i, Code.CatchHandler[] catchHandlerArr) {
            Code.C1678Try[] c1678TryArr = new Code.C1678Try[i];
            for (int i2 = 0; i2 < i; i2++) {
                c1678TryArr[i2] = new Code.C1678Try(readInt(), readUnsignedShort(), findCatchHandlerIndex(catchHandlerArr, readUnsignedShort()));
            }
            return c1678TryArr;
        }

        private int findCatchHandlerIndex(Code.CatchHandler[] catchHandlerArr, int i) {
            for (int i2 = 0; i2 < catchHandlerArr.length; i2++) {
                if (catchHandlerArr[i2].getOffset() == i) {
                    return i2;
                }
            }
            throw new IllegalArgumentException();
        }

        private Code.CatchHandler readCatchHandler(int i) {
            int sleb128 = readSleb128();
            int iAbs = Math.abs(sleb128);
            int[] iArr = new int[iAbs];
            int[] iArr2 = new int[iAbs];
            for (int i2 = 0; i2 < iAbs; i2++) {
                iArr[i2] = readUleb128();
                iArr2[i2] = readUleb128();
            }
            return new Code.CatchHandler(iArr, iArr2, sleb128 <= 0 ? readUleb128() : -1, i);
        }

        public ClassData readClassData() {
            return new ClassData(readFields(readUleb128()), readFields(readUleb128()), readMethods(readUleb128()), readMethods(readUleb128()));
        }

        private ClassData.Field[] readFields(int i) {
            ClassData.Field[] fieldArr = new ClassData.Field[i];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int uleb128 = readUleb128() + i3;
                fieldArr[i2] = new ClassData.Field(uleb128, readUleb128());
                i2++;
                i3 = uleb128;
            }
            return fieldArr;
        }

        private ClassData.Method[] readMethods(int i) {
            ClassData.Method[] methodArr = new ClassData.Method[i];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int uleb128 = readUleb128() + i3;
                methodArr[i2] = new ClassData.Method(uleb128, readUleb128(), readUleb128());
                i2++;
                i3 = uleb128;
            }
            return methodArr;
        }

        private byte[] getBytesFrom(int i) {
            byte[] bArr = new byte[this.data.position() - i];
            this.data.position(i);
            this.data.get(bArr);
            return bArr;
        }

        public Annotation readAnnotation() {
            byte b = readByte();
            int iPosition = this.data.position();
            new EncodedValueReader(this, 29).skipValue();
            return new Annotation(this.this$0, b, new EncodedValue(getBytesFrom(iPosition)));
        }

        public EncodedValue readEncodedArray() {
            int iPosition = this.data.position();
            new EncodedValueReader(this, 28).skipValue();
            return new EncodedValue(getBytesFrom(iPosition));
        }

        public void skip(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            this.data.position(this.data.position() + i);
        }

        public void alignToFourBytes() {
            this.data.position((this.data.position() + 3) & (-4));
        }

        public void alignToFourBytesWithZeroFill() {
            while ((this.data.position() & 3) != 0) {
                this.data.put((byte) 0);
            }
        }

        public void assertFourByteAligned() {
            if ((this.data.position() & 3) != 0) {
                throw new IllegalStateException("Not four byte aligned!");
            }
        }

        public void write(byte[] bArr) {
            this.data.put(bArr);
        }

        @Override
        public void writeByte(int i) {
            this.data.put((byte) i);
        }

        public void writeShort(short s) {
            this.data.putShort(s);
        }

        public void writeUnsignedShort(int i) {
            short s = (short) i;
            if (i != (65535 & s)) {
                throw new IllegalArgumentException(new StringBuffer().append("Expected an unsigned short: ").append(i).toString());
            }
            writeShort(s);
        }

        public void write(short[] sArr) {
            for (short s : sArr) {
                writeShort(s);
            }
        }

        public void writeInt(int i) {
            this.data.putInt(i);
        }

        public void writeUleb128(int i) {
            try {
                Leb128.writeUnsignedLeb128(this, i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new DexException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Section limit ").append(this.data.limit()).toString()).append(" exceeded by ").toString()).append(this.name).toString());
            }
        }

        public void writeSleb128(int i) {
            try {
                Leb128.writeSignedLeb128(this, i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new DexException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Section limit ").append(this.data.limit()).toString()).append(" exceeded by ").toString()).append(this.name).toString());
            }
        }

        public void writeStringData(String str) {
            try {
                writeUleb128(str.length());
                write(Mutf8.encode(str));
                writeByte(0);
            } catch (UTFDataFormatException e) {
                throw new AssertionError();
            }
        }

        public void writeTypeList(TypeList typeList) {
            short[] types = typeList.getTypes();
            writeInt(types.length);
            for (short s : types) {
                writeShort(s);
            }
            alignToFourBytesWithZeroFill();
        }

        public int used() {
            return this.data.position() - this.initialPosition;
        }
    }

    private final class StringTable extends AbstractList<String> implements RandomAccess {
        private final Dex this$0;

        @Override
        public Object get(int i) {
            return get(i);
        }

        @Override
        public String get(int i) {
            Dex.checkBounds(i, this.this$0.tableOfContents.stringIds.size);
            return this.this$0.open(this.this$0.tableOfContents.stringIds.f4980off + (i * 4)).readString();
        }

        @Override
        public int size() {
            return this.this$0.tableOfContents.stringIds.size;
        }

        public StringTable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }

    private final class TypeIndexToDescriptorIndexTable extends AbstractList<Integer> implements RandomAccess {
        private final Dex this$0;

        @Override
        public Object get(int i) {
            return get(i);
        }

        @Override
        public Integer get(int i) {
            return new Integer(this.this$0.descriptorIndexFromTypeIndex(i));
        }

        @Override
        public int size() {
            return this.this$0.tableOfContents.typeIds.size;
        }

        public TypeIndexToDescriptorIndexTable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }

    private final class TypeIndexToDescriptorTable extends AbstractList<String> implements RandomAccess {
        private final Dex this$0;

        @Override
        public Object get(int i) {
            return get(i);
        }

        @Override
        public String get(int i) {
            return this.this$0.strings.get(this.this$0.descriptorIndexFromTypeIndex(i));
        }

        @Override
        public int size() {
            return this.this$0.tableOfContents.typeIds.size;
        }

        public TypeIndexToDescriptorTable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }

    private final class ProtoIdTable extends AbstractList<ProtoId> implements RandomAccess {
        private final Dex this$0;

        @Override
        public Object get(int i) {
            return get(i);
        }

        @Override
        public ProtoId get(int i) {
            Dex.checkBounds(i, this.this$0.tableOfContents.protoIds.size);
            return this.this$0.open(this.this$0.tableOfContents.protoIds.f4980off + (i * 12)).readProtoId();
        }

        @Override
        public int size() {
            return this.this$0.tableOfContents.protoIds.size;
        }

        public ProtoIdTable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }

    private final class FieldIdTable extends AbstractList<FieldId> implements RandomAccess {
        private final Dex this$0;

        @Override
        public Object get(int i) {
            return get(i);
        }

        @Override
        public FieldId get(int i) {
            Dex.checkBounds(i, this.this$0.tableOfContents.fieldIds.size);
            return this.this$0.open(this.this$0.tableOfContents.fieldIds.f4980off + (i * 8)).readFieldId();
        }

        @Override
        public int size() {
            return this.this$0.tableOfContents.fieldIds.size;
        }

        public FieldIdTable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }

    private final class MethodIdTable extends AbstractList<MethodId> implements RandomAccess {
        private final Dex this$0;

        @Override
        public Object get(int i) {
            return get(i);
        }

        @Override
        public MethodId get(int i) {
            Dex.checkBounds(i, this.this$0.tableOfContents.methodIds.size);
            return this.this$0.open(this.this$0.tableOfContents.methodIds.f4980off + (i * 8)).readMethodId();
        }

        @Override
        public int size() {
            return this.this$0.tableOfContents.methodIds.size;
        }

        public MethodIdTable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }

    private final class ClassDefIterator implements Iterator<ClassDef> {
        private int count = 0;

        private final Section f4973in;
        private final Dex this$0;

        @Override
        public ClassDef next() {
            return next();
        }

        @Override
        public boolean hasNext() {
            return this.count < this.this$0.tableOfContents.classDefs.size;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public ClassDef next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.count++;
            return this.f4973in.readClassDef();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public ClassDefIterator(Dex c1679Dex) {
            this.this$0 = c1679Dex;
            this.f4973in = this.this$0.open(this.this$0.tableOfContents.classDefs.f4980off);
        }
    }

    private final class ClassDefIterable implements Iterable<ClassDef> {
        private final Dex this$0;

        @Override
        public Iterator<ClassDef> iterator() {
            return !this.this$0.tableOfContents.classDefs.exists() ? Collections.emptySet().iterator() : new ClassDefIterator(this.this$0);
        }

        public ClassDefIterable(Dex c1679Dex) {
            this.this$0 = c1679Dex;
        }
    }
}
