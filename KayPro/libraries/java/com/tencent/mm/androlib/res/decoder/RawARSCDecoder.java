package com.tencent.mm.androlib.res.decoder;

import com.mindprod.ledatastream.LEDataInputStream;
import com.tencent.mm.androlib.AndrolibException;
import com.tencent.mm.androlib.res.data.ResPackage;
import com.tencent.mm.androlib.res.data.ResType;
import com.tencent.mm.util.ExtDataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import org.apache.commons.io.input.CountingInputStream;

public class RawARSCDecoder {
    private static final short ENTRY_FLAG_COMPLEX = 1;
    private static final short ENTRY_FLAG_PUBLIC = 2;
    private static final short ENTRY_FLAG_WEAK = 4;
    private static final int KNOWN_CONFIG_BYTES = 64;
    private static final Logger LOGGER;
    private static HashMap<Integer, Set<String>> mExistTypeNames;
    private final CountingInputStream mCountIn;
    private Header mHeader;

    private ExtDataInput f5101mIn;
    private ResPackage mPkg;
    private ResPackage[] mPkgs;
    private int mResId;
    private StringBlock mSpecNames;
    private ResType mType;
    private StringBlock mTypeNames;
    private int mTypeIdOffset = 0;
    private int mCurTypeID = -1;

    public static class FlagsOffset {
        public final int count;
        public final int offset;

        public FlagsOffset(int i, int i2) {
            this.offset = i;
            this.count = i2;
        }
    }

    public static class Header {
        public static final short TYPE_LIBRARY = 515;
        public static final short TYPE_NONE = -1;
        public static final short TYPE_PACKAGE = 512;
        public static final short TYPE_SPEC_TYPE = 514;
        public static final short TYPE_TABLE = 2;
        public static final short TYPE_TYPE = 513;
        public final int chunkSize;
        public final int endPosition;
        public final int headerSize;
        public final int startPosition;
        public final short type;

        public Header(short s, int i, int i2, int i3) {
            this.type = s;
            this.headerSize = i;
            this.chunkSize = i2;
            this.startPosition = i3;
            this.endPosition = i3 + i2;
        }

        public static Header read(ExtDataInput extDataInput, CountingInputStream countingInputStream) throws IOException {
            int count = countingInputStream.getCount();
            try {
                return new Header(extDataInput.readShort(), extDataInput.readShort(), extDataInput.readInt(), count);
            } catch (EOFException e) {
                return new Header((short) -1, 0, 0, countingInputStream.getCount());
            }
        }
    }

    static {
        try {
            LOGGER = Logger.getLogger(Class.forName("com.tencent.mm.androlib.res.decoder.ARSCDecoder").getName());
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    RawARSCDecoder(InputStream inputStream) throws AndrolibException, IOException {
        CountingInputStream countingInputStream = new CountingInputStream(inputStream);
        this.mCountIn = countingInputStream;
        this.f5101mIn = new ExtDataInput(new LEDataInputStream(countingInputStream));
        mExistTypeNames = new HashMap<>();
    }

    private void checkChunkType(int i) throws AndrolibException {
        if (this.mHeader.type != i) {
            throw new AndrolibException(String.format("Invalid chunk type: expected=0x%08x, got=0x%08x", new Integer(i), new Short(this.mHeader.type)));
        }
    }

    public static ResPackage[] decode(InputStream inputStream) throws AndrolibException {
        try {
            RawARSCDecoder rawARSCDecoder = new RawARSCDecoder(inputStream);
            System.out.printf("parse to get the exist names in the resouces.arsc first\n", new Object[0]);
            return rawARSCDecoder.readTable();
        } catch (IOException e) {
            throw new AndrolibException("Could not decode arsc file", e);
        }
    }

    public static Set<String> getExistTypeSpecNameStrings(int i) {
        return mExistTypeNames.get(new Integer(i));
    }

    private Header nextChunk() throws IOException {
        Header header = Header.read(this.f5101mIn, this.mCountIn);
        this.mHeader = header;
        return header;
    }

    private void nextChunkCheckType(int i) throws AndrolibException, IOException {
        nextChunk();
        checkChunkType(i);
    }

    private void putTypeSpecNameStrings(int i, String str) {
        Set<String> hashSet = mExistTypeNames.get(new Integer(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        hashSet.add(str);
        mExistTypeNames.put(new Integer(i), hashSet);
    }

    private void readComplexEntry(boolean z, int i) throws AndrolibException, IOException {
        this.f5101mIn.readInt();
        int i2 = this.f5101mIn.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5101mIn.readInt();
            readValue(z, i);
        }
    }

    private void readConfig() throws AndrolibException, IOException {
        checkChunkType(513);
        int unsignedByte = this.f5101mIn.readUnsignedByte() - this.mTypeIdOffset;
        this.f5101mIn.readByte();
        this.f5101mIn.skipBytes(2);
        int i = this.f5101mIn.readInt();
        this.f5101mIn.readInt();
        readConfigFlags();
        int[] intArray = this.f5101mIn.readIntArray(i);
        for (int i2 = 0; i2 < intArray.length; i2++) {
            if (intArray[i2] != -1) {
                this.mResId = (this.mResId & (-65536)) | i2;
                readEntry();
            }
        }
    }

    private void readConfigFlags() throws AndrolibException, IOException {
        int i;
        int i2;
        int i3 = 28;
        int i4 = this.f5101mIn.readInt();
        if (i4 < 28) {
            throw new AndrolibException("Config size < 28");
        }
        this.f5101mIn.readShort();
        this.f5101mIn.readShort();
        char[] cArr = {(char) this.f5101mIn.readByte(), (char) this.f5101mIn.readByte()};
        char[] cArr2 = {(char) this.f5101mIn.readByte(), (char) this.f5101mIn.readByte()};
        this.f5101mIn.readByte();
        this.f5101mIn.readByte();
        this.f5101mIn.readUnsignedShort();
        this.f5101mIn.readByte();
        this.f5101mIn.readByte();
        this.f5101mIn.readByte();
        this.f5101mIn.skipBytes(1);
        this.f5101mIn.readShort();
        this.f5101mIn.readShort();
        this.f5101mIn.readShort();
        this.f5101mIn.skipBytes(2);
        if (i4 >= 32) {
            this.f5101mIn.readByte();
            this.f5101mIn.readByte();
            this.f5101mIn.readShort();
            i3 = 32;
        }
        if (i4 >= 36) {
            this.f5101mIn.readShort();
            this.f5101mIn.readShort();
            i = 36;
        } else {
            i = i3;
        }
        if (i4 >= 48) {
            readScriptOrVariantChar(4).toCharArray();
            readScriptOrVariantChar(8).toCharArray();
            i2 = 48;
        } else {
            i2 = i;
        }
        if (i4 >= 52) {
            this.f5101mIn.readByte();
            this.f5101mIn.skipBytes(3);
            i2 = 52;
        }
        if (i4 >= 56) {
            this.f5101mIn.skipBytes(4);
            i2 = 56;
        }
        if (i4 >= 64) {
            this.f5101mIn.skipBytes(8);
            i2 = 64;
        }
        int i5 = i4 - 64;
        if (i5 <= 0) {
            int i6 = i4 - i2;
            if (i6 > 0) {
                this.f5101mIn.skipBytes(i6);
                return;
            }
            return;
        }
        byte[] bArr = new byte[i5];
        this.f5101mIn.readFully(bArr);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.equals(BigInteger.ZERO)) {
            LOGGER.fine(String.format("Config flags size > %d, but exceeding bytes are all zero, so it should be ok.", new Integer(64)));
        } else {
            LOGGER.warning(String.format("Config flags size > %d. Exceeding bytes: 0x%X.", new Integer(64), bigInteger));
        }
    }

    private void readEntry() throws AndrolibException, IOException {
        this.f5101mIn.skipBytes(2);
        short s = this.f5101mIn.readShort();
        int i = this.f5101mIn.readInt();
        putTypeSpecNameStrings(this.mCurTypeID, this.mSpecNames.getString(i));
        if ((s & 1) == 0) {
            readValue(true, i);
        } else {
            readComplexEntry(false, i);
        }
    }

    private void readLibraryType() throws AndrolibException, IOException {
        checkChunkType(515);
        int i = this.f5101mIn.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            System.out.printf("Decoding Shared Library (%s), pkgId: %d\n", this.f5101mIn.readNullEndedString(128, true), new Integer(this.f5101mIn.readInt()));
        }
        nextChunk();
        while (this.mHeader.type == 513) {
            readTableTypeSpec();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 short, still in use, count: 1, list:
          (r2v3 short) from 0x001e: CAST (char) (r2v3 short)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:148)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:101)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:117)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    private java.lang.String readScriptOrVariantChar(int r4) throws com.tencent.mm.androlib.AndrolibException, java.io.IOException {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r0 = 16
            r1.<init>(r0)
        L7:
            int r0 = r4 + (-1)
            if (r4 != 0) goto L15
        Lb:
            com.tencent.mm.util.ExtDataInput r2 = r3.f5101mIn
            r2.skipBytes(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L15:
            com.tencent.mm.util.ExtDataInput r2 = r3.f5101mIn
            byte r2 = r2.readByte()
            short r2 = (short) r2
            if (r2 == 0) goto Lb
            char r2 = (char) r2
            r1.append(r2)
            r4 = r0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.androlib.res.decoder.RawARSCDecoder.readScriptOrVariantChar(int):java.lang.String");
    }

    private void readSingleTableTypeSpec() throws AndrolibException, IOException {
        checkChunkType(514);
        int unsignedByte = this.f5101mIn.readUnsignedByte();
        this.f5101mIn.skipBytes(3);
        this.f5101mIn.skipBytes(this.f5101mIn.readInt() * 4);
        this.mCurTypeID = unsignedByte;
        this.mResId = ((-16777216) & this.mResId) | (unsignedByte << 16);
        this.mType = new ResType(this.mTypeNames.getString(unsignedByte - 1), this.mPkg);
    }

    private ResPackage[] readTable() throws AndrolibException, IOException {
        nextChunkCheckType(2);
        int i = this.f5101mIn.readInt();
        StringBlock.read(this.f5101mIn);
        ResPackage[] resPackageArr = new ResPackage[i];
        nextChunk();
        for (int i2 = 0; i2 < i; i2++) {
            resPackageArr[i2] = readTablePackage();
        }
        return resPackageArr;
    }

    private ResPackage readTablePackage() throws AndrolibException, IOException {
        checkChunkType(512);
        int i = this.f5101mIn.readInt();
        String nullEndedString = this.f5101mIn.readNullEndedString(128, true);
        this.f5101mIn.skipInt();
        this.f5101mIn.skipInt();
        this.f5101mIn.skipInt();
        this.f5101mIn.skipInt();
        if (this.mHeader.headerSize == 288) {
            this.mTypeIdOffset = this.f5101mIn.readInt();
        }
        this.mTypeNames = StringBlock.read(this.f5101mIn);
        this.mSpecNames = StringBlock.read(this.f5101mIn);
        this.mResId = i << 24;
        this.mPkg = new ResPackage(i, nullEndedString);
        nextChunk();
        while (this.mHeader.type == 515) {
            readLibraryType();
        }
        while (this.mHeader.type == 514) {
            readTableTypeSpec();
        }
        return this.mPkg;
    }

    private void readTableTypeSpec() throws AndrolibException, IOException {
        readSingleTableTypeSpec();
        nextChunk();
        while (this.mHeader.type == 514) {
            readSingleTableTypeSpec();
            nextChunk();
        }
        while (this.mHeader.type == 513) {
            readConfig();
            nextChunk();
        }
    }

    private void readValue(boolean z, int i) throws AndrolibException, IOException {
        this.f5101mIn.skipCheckShort((short) 8);
        this.f5101mIn.skipCheckByte((byte) 0);
        this.f5101mIn.readByte();
        this.f5101mIn.readInt();
    }
}
