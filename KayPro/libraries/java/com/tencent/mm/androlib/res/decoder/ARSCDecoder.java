package com.tencent.mm.androlib.res.decoder;

import com.baidu.android.common.util.DeviceId;
import com.baidu.mobstat.Config;
import com.blankj.utilcode.constant.MemoryConstants;
import com.mindprod.ledatastream.LEDataInputStream;
import com.mindprod.ledatastream.LEDataOutputStream;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import com.tencent.mm.androlib.AndrolibException;
import com.tencent.mm.androlib.ApkDecoder;
import com.tencent.mm.androlib.res.data.ResPackage;
import com.tencent.mm.androlib.res.data.ResType;
import com.tencent.mm.androlib.res.util.StringUtil;
import com.tencent.mm.resourceproguard.Configuration;
import com.tencent.mm.util.ExtDataInput;
import com.tencent.mm.util.ExtDataOutput;
import com.tencent.mm.util.FileOperation;
import com.tencent.mm.util.Md5Util;
import com.tencent.mm.util.Utils;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

public class ARSCDecoder {
    private static final boolean DEBUG = false;
    private static final short ENTRY_FLAG_COMPLEX = 1;
    private static final int KNOWN_CONFIG_BYTES = 56;
    private static final Logger LOGGER;
    public static int mMergeDuplicatedResCount;
    public static Map<Integer, String> mTableStringsResguard;
    private final ApkDecoder mApkDecoder;
    private Header mHeader;

    private ExtDataInput f5098mIn;
    private Writer mMappingWriter;
    private Writer mMergeDuplicatedResMappingWriter;
    private ExtDataOutput mOut;
    private ResPackage mPkg;
    private ResPackage[] mPkgs;
    private int[] mPkgsLenghtChange;
    private int mResId;
    private ResguardStringBuilder mResguardBuilder;
    private StringBlock mSpecNames;
    private StringBlock mTableStrings;
    private ResType mType;
    private StringBlock mTypeNames;
    private int mTableLenghtChange = 0;
    private int mCurrTypeID = -1;
    private int mCurEntryID = -1;
    private int mCurPackageID = -1;
    private long mMergeDuplicatedResTotalSize = 0;
    private boolean mShouldResguardForType = false;
    private Map<Long, List<MergeDuplicatedResInfo>> mMergeDuplicatedResInfoData = new HashMap();
    private final Map<String, String> mOldFileName = new LinkedHashMap();
    private final Map<String, Integer> mCurSpecNameToPos = new LinkedHashMap();
    private final HashSet<String> mShouldResguardTypeSet = new HashSet<>();

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
        public final short type;

        public Header(short s, int i) {
            this.type = s;
            this.chunkSize = i;
        }

        public static Header read(ExtDataInput extDataInput) throws IOException {
            try {
                short s = extDataInput.readShort();
                extDataInput.readShort();
                return new Header(s, extDataInput.readInt());
            } catch (EOFException e) {
                return new Header((short) -1, 0);
            }
        }

        public static Header readAndWriteHeader(ExtDataInput extDataInput, ExtDataOutput extDataOutput, int i) throws AndrolibException, IOException {
            try {
                short s = extDataInput.readShort();
                extDataOutput.writeShort(s);
                extDataOutput.writeShort(extDataInput.readShort());
                int i2 = extDataInput.readInt() - i;
                if (i2 <= 0) {
                    throw new AndrolibException(String.format("readAndWriteHeader size < 0: size=%d", new Integer(i2)));
                }
                extDataOutput.writeInt(i2);
                return new Header(s, i2);
            } catch (EOFException e) {
                return new Header((short) -1, 0);
            }
        }
    }

    private static class MergeDuplicatedResInfo {
        private String fileName;
        private String filePath;

        private String f5099md5;
        private String originalName;

        static class Builder {
            private String fileName;
            private String filePath;

            private String f5100md5;
            private String originalName;

            MergeDuplicatedResInfo create() {
                return new MergeDuplicatedResInfo(this.fileName, this.filePath, this.originalName, this.f5100md5);
            }

            Builder setFileName(String str) {
                this.fileName = str;
                return this;
            }

            Builder setFilePath(String str) {
                this.filePath = str;
                return this;
            }

            public Builder setMd5(String str) {
                this.f5100md5 = str;
                return this;
            }

            Builder setOriginalName(String str) {
                this.originalName = str;
                return this;
            }
        }

        MergeDuplicatedResInfo(String str, String str2, String str3, String str4) {
            this.fileName = str;
            this.filePath = str2;
            this.originalName = str3;
            this.f5099md5 = str4;
        }
    }

    private class ResguardStringBuilder {
        private final Set<Integer> mIsReplaced;
        private final Set<Integer> mIsWhiteList;
        private final List<String> mReplaceStringBuffer;
        private final ARSCDecoder this$0;
        private String[] mAToZ = {Config.APP_VERSION_CODE, "b", "c", "d", "e", "f", "g", "h", "i", "j", Config.APP_KEY, "l", Config.MODEL, "n", Config.f3881OS, "p", "q", "r", "s", "t", "u", "v", Config.DEVICE_WIDTH, "x", "y", "z"};
        private String[] mAToAll = {DeviceId.CUIDInfo.I_EMPTY, "1", "2", "3", "4", "5", "6", "7", "8", "9", "_", Config.APP_VERSION_CODE, "b", "c", "d", "e", "f", "g", "h", "i", "j", Config.APP_KEY, "l", Config.MODEL, "n", Config.f3881OS, "p", "q", "r", "s", "t", "u", "v", Config.DEVICE_WIDTH, "x", "y", "z"};
        private HashSet<String> mFileNameBlackList = new HashSet<>();

        public ResguardStringBuilder(ARSCDecoder aRSCDecoder) {
            this.this$0 = aRSCDecoder;
            this.mFileNameBlackList.add("con");
            this.mFileNameBlackList.add("prn");
            this.mFileNameBlackList.add("aux");
            this.mFileNameBlackList.add("nul");
            this.mReplaceStringBuffer = new ArrayList();
            this.mIsReplaced = new HashSet();
            this.mIsWhiteList = new HashSet();
        }

        public String getReplaceString() throws AndrolibException {
            if (this.mReplaceStringBuffer.isEmpty()) {
                throw new AndrolibException(String.format("now can only proguard less than 35594 in a single type\n", new Object[0]));
            }
            return this.mReplaceStringBuffer.remove(0);
        }

        public boolean isInWhiteList(int i) {
            return this.mIsWhiteList.contains(new Integer(i));
        }

        public boolean isReplaced(int i) {
            return this.mIsReplaced.contains(new Integer(i));
        }

        public void removeStrings(Collection<String> collection) {
            if (collection == null) {
                return;
            }
            this.mReplaceStringBuffer.removeAll(collection);
        }

        public void reset(HashSet<Pattern> hashSet) {
            this.mReplaceStringBuffer.clear();
            this.mIsReplaced.clear();
            this.mIsWhiteList.clear();
            for (int i = 0; i < this.mAToZ.length; i++) {
                String str = this.mAToZ[i];
                if (!Utils.match(str, hashSet)) {
                    this.mReplaceStringBuffer.add(str);
                }
            }
            for (int i2 = 0; i2 < this.mAToZ.length; i2++) {
                String str2 = this.mAToZ[i2];
                for (int i3 = 0; i3 < this.mAToAll.length; i3++) {
                    String string = new StringBuffer().append(str2).append(this.mAToAll[i3]).toString();
                    if (!Utils.match(string, hashSet)) {
                        this.mReplaceStringBuffer.add(string);
                    }
                }
            }
            for (int i4 = 0; i4 < this.mAToZ.length; i4++) {
                String str3 = this.mAToZ[i4];
                for (int i5 = 0; i5 < this.mAToAll.length; i5++) {
                    String str4 = this.mAToAll[i5];
                    for (int i6 = 0; i6 < this.mAToAll.length; i6++) {
                        String string2 = new StringBuffer().append(new StringBuffer().append(str3).append(str4).toString()).append(this.mAToAll[i6]).toString();
                        if (!this.mFileNameBlackList.contains(string2) && !Utils.match(string2, hashSet)) {
                            this.mReplaceStringBuffer.add(string2);
                        }
                    }
                }
            }
        }

        public void setInReplaceList(int i) {
            this.mIsReplaced.add(new Integer(i));
        }

        public void setInWhiteList(int i) {
            this.mIsWhiteList.add(new Integer(i));
        }
    }

    static {
        try {
            LOGGER = Logger.getLogger(Class.forName("com.tencent.mm.androlib.res.decoder.ARSCDecoder").getName());
            mTableStringsResguard = new LinkedHashMap();
            mMergeDuplicatedResCount = 0;
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    ARSCDecoder(InputStream inputStream, ApkDecoder apkDecoder) throws AndrolibException, IOException {
        this.f5098mIn = new ExtDataInput(new LEDataInputStream(inputStream));
        this.mApkDecoder = apkDecoder;
        proguardFileName();
    }

    ARSCDecoder(InputStream inputStream, ApkDecoder apkDecoder, ResPackage[] resPackageArr) throws FileNotFoundException {
        this.mApkDecoder = apkDecoder;
        this.f5098mIn = new ExtDataInput(new LEDataInputStream(inputStream));
        this.mOut = new ExtDataOutput(new LEDataOutputStream(new FileOutputStream(this.mApkDecoder.getOutTempARSCFile(), false)));
        this.mPkgs = resPackageArr;
        this.mPkgsLenghtChange = new int[resPackageArr.length];
    }

    private void checkChunkType(int i) throws AndrolibException {
        if (this.mHeader.type != i) {
            throw new AndrolibException(String.format("Invalid chunk type: expected=0x%08x, got=0x%08x", new Integer(i), new Short(this.mHeader.type)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    private void dealWithNonWhiteList(int i, Configuration configuration) throws AndrolibException, IOException {
        boolean z;
        String replaceString = (String) null;
        if (configuration.mUseKeepMapping) {
            String name = this.mPkg.getName();
            if (configuration.mOldResMapping.containsKey(name)) {
                HashMap<String, HashMap<String, String>> map = configuration.mOldResMapping.get(name);
                String name2 = this.mType.getName();
                if (map.containsKey(name2)) {
                    HashMap<String, String> map2 = map.get(name2);
                    String string = this.mSpecNames.m7237get(i).toString();
                    if (map2.containsKey(string)) {
                        replaceString = map2.get(string);
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            replaceString = this.mResguardBuilder.getReplaceString();
        }
        this.mResguardBuilder.setInReplaceList(this.mCurEntryID);
        if (replaceString == null) {
            throw new AndrolibException("readEntry replaceString == null");
        }
        generalResIDMapping(this.mPkg.getName(), this.mType.getName(), this.mSpecNames.m7237get(i).toString(), replaceString);
        this.mPkg.putSpecNamesReplace(this.mResId, replaceString);
        this.mPkg.putSpecNamesblock(configuration.mFixedResName != null && configuration.mFixedResName.length() > 0 ? configuration.mFixedResName : replaceString, replaceString);
        this.mType.putSpecResguardName(replaceString);
    }

    private boolean dealWithWhiteList(int i, Configuration configuration) throws AndrolibException {
        String name = this.mPkg.getName();
        if (configuration.mWhiteList.containsKey(name)) {
            HashMap<String, HashSet<Pattern>> map = configuration.mWhiteList.get(name);
            String name2 = this.mType.getName();
            if (map.containsKey(name2)) {
                String string = this.mSpecNames.m7237get(i).toString();
                Iterator<Pattern> it = map.get(name2).iterator();
                while (it.hasNext()) {
                    if (it.next().matcher(string).matches()) {
                        this.mPkg.putSpecNamesReplace(this.mResId, string);
                        this.mPkg.putSpecNamesblock(string, string);
                        this.mResguardBuilder.setInWhiteList(this.mCurEntryID);
                        this.mType.putSpecResguardName(string);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ResPackage[] decode(InputStream inputStream, ApkDecoder apkDecoder) throws AndrolibException {
        try {
            return new ARSCDecoder(inputStream, apkDecoder).readTable();
        } catch (IOException e) {
            throw new AndrolibException("Could not decode arsc file", e);
        }
    }

    private void generalFileResMapping() throws IOException {
        this.mMappingWriter.write("res path mapping:\n");
        for (String str : this.mOldFileName.keySet()) {
            this.mMappingWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append(str).toString()).append(" -> ").toString()).append(this.mOldFileName.get(str)).toString());
            this.mMappingWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
        }
        this.mMappingWriter.write("\n\n");
        this.mMappingWriter.write("res id mapping:\n");
        this.mMappingWriter.flush();
    }

    private void generalFilterEnd(int i, long j) throws IOException {
        this.mMergeDuplicatedResMappingWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("removed: count(").append(i).toString()).append("), totalSize(").toString()).append(getNetFileSizeDescription(j)).toString()).append(")").toString());
        this.mMergeDuplicatedResMappingWriter.flush();
    }

    private void generalFilterResIDMapping(String str, String str2, String str3, String str4, long j) throws IOException {
        this.mMergeDuplicatedResMappingWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append(str).toString()).append(" : ").toString()).append(str2).toString()).append(" -> ").toString()).append(str3).toString()).append(" : ").toString()).append(str4).toString()).append(" (size:").toString()).append(getNetFileSizeDescription(j)).toString()).append(")").toString());
        this.mMergeDuplicatedResMappingWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
        this.mMergeDuplicatedResMappingWriter.flush();
    }

    private void generalResIDMapping(String str, String str2, String str3, String str4) throws IOException {
        this.mMappingWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append(str).toString()).append(".R.").toString()).append(str2).toString()).append(".").toString()).append(str3).toString()).append(" -> ").toString()).append(str).toString()).append(".R.").toString()).append(str2).toString()).append(".").toString()).append(str4).toString());
        this.mMappingWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
        this.mMappingWriter.flush();
    }

    private static String getNetFileSizeDescription(long j) {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("###.0");
        if (j >= MemoryConstants.f4579GB) {
            sb.append(decimalFormat.format(j / 1.073741824E9d)).append("GB");
        } else if (j >= 1048576) {
            sb.append(decimalFormat.format(j / 1048576.0d)).append("MB");
        } else if (j >= 1024) {
            sb.append(decimalFormat.format(j / 1024.0d)).append("KB");
        } else if (j <= 0) {
            sb.append("0B");
        } else {
            sb.append((int) j).append("B");
        }
        return sb.toString();
    }

    private HashSet<Pattern> getWhiteList(String str) {
        String name = this.mPkg.getName();
        return (this.mApkDecoder.getConfig().mWhiteList.containsKey(name) && this.mApkDecoder.getConfig().mUseWhiteList) ? this.mApkDecoder.getConfig().mWhiteList.get(name).get(str) : (HashSet) null;
    }

    private void initResGuardBuild(int i) {
        this.mResguardBuilder.reset(getWhiteList(this.mType.getName()));
        this.mResguardBuilder.removeStrings(RawARSCDecoder.getExistTypeSpecNameStrings(i));
        reduceFromOldMappingFile();
    }

    private boolean isToResguardFile(String str) {
        return (str.equals("string") || str.equals("id") || str.equals("array")) ? false : true;
    }

    private MergeDuplicatedResInfo mergeDuplicated(File file, File file2, String str, String str2) throws IOException {
        MergeDuplicatedResInfo mergeDuplicatedResInfo = (MergeDuplicatedResInfo) null;
        List<MergeDuplicatedResInfo> arrayList = this.mMergeDuplicatedResInfoData.get(new Long(file.length()));
        if (arrayList != null) {
            for (MergeDuplicatedResInfo mergeDuplicatedResInfo2 : arrayList) {
                if (mergeDuplicatedResInfo2.f5099md5 == null) {
                    mergeDuplicatedResInfo2.f5099md5 = Md5Util.getMD5Str(new File(mergeDuplicatedResInfo2.filePath));
                }
                String mD5Str = Md5Util.getMD5Str(file);
                if (!mD5Str.isEmpty() && mD5Str.equals(mergeDuplicatedResInfo2.f5099md5)) {
                    mergeDuplicatedResInfo2.f5099md5 = mD5Str;
                    mergeDuplicatedResInfo = mergeDuplicatedResInfo2;
                    break;
                }
            }
        }
        if (mergeDuplicatedResInfo != null) {
            generalFilterResIDMapping(str, str2, mergeDuplicatedResInfo.originalName, mergeDuplicatedResInfo.fileName, file.length());
            mMergeDuplicatedResCount++;
            this.mMergeDuplicatedResTotalSize += file.length();
        } else {
            MergeDuplicatedResInfo mergeDuplicatedResInfoCreate = new MergeDuplicatedResInfo.Builder().setFileName(str2).setFilePath(file2.getAbsolutePath()).setOriginalName(str).create();
            mergeDuplicatedResInfoCreate.fileName = str2;
            mergeDuplicatedResInfoCreate.filePath = file2.getAbsolutePath();
            mergeDuplicatedResInfoCreate.originalName = str;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mMergeDuplicatedResInfoData.put(new Long(file.length()), arrayList);
            }
            arrayList.add(mergeDuplicatedResInfoCreate);
        }
        return mergeDuplicatedResInfo;
    }

    private Header nextChunk() throws IOException {
        Header header = Header.read(this.f5098mIn);
        this.mHeader = header;
        return header;
    }

    private void nextChunkCheckType(int i) throws AndrolibException, IOException {
        nextChunk();
        checkChunkType(i);
    }

    private void proguardFileName() throws AndrolibException, IOException {
        int i = 0;
        this.mMappingWriter = new BufferedWriter(new FileWriter(this.mApkDecoder.getResMappingFile(), false));
        this.mMergeDuplicatedResMappingWriter = new BufferedWriter(new FileWriter(this.mApkDecoder.getMergeDuplicatedResMappingFile(), false));
        this.mMergeDuplicatedResMappingWriter.write("res filter path mapping:\n");
        this.mMergeDuplicatedResMappingWriter.flush();
        this.mResguardBuilder = new ResguardStringBuilder(this);
        this.mResguardBuilder.reset((HashSet) null);
        Configuration config = this.mApkDecoder.getConfig();
        File[] fileArrListFiles = this.mApkDecoder.getRawResFile().listFiles();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (name.contains("-")) {
                name = name.substring(0, name.indexOf("-"));
            }
            this.mShouldResguardTypeSet.add(name);
        }
        if (!config.mKeepRoot) {
            if (config.mUseKeepMapping) {
                HashMap<String, String> map = config.mOldFileMapping;
                ArrayList arrayList = new ArrayList();
                String strSubstring = "r";
                for (String str : map.values()) {
                    int iIndexOf = str.indexOf("/");
                    if (iIndexOf == -1) {
                        throw new IOException(String.format("the old mapping res file path should be like r/a, yours %s\n", str));
                    }
                    strSubstring = str.substring(0, iIndexOf);
                    arrayList.add(str.substring(iIndexOf + 1));
                }
                this.mResguardBuilder.removeStrings(arrayList);
                while (i < fileArrListFiles.length) {
                    String string = new StringBuffer().append(new StringBuffer().append("res").append("/").toString()).append(fileArrListFiles[i].getName()).toString();
                    if (map.containsKey(string)) {
                        this.mOldFileName.put(string, map.get(string));
                    } else {
                        this.mOldFileName.put(string, new StringBuffer().append(new StringBuffer().append(strSubstring).append("/").toString()).append(this.mResguardBuilder.getReplaceString()).toString());
                    }
                    i++;
                }
            } else {
                while (i < fileArrListFiles.length) {
                    this.mOldFileName.put(new StringBuffer().append(new StringBuffer().append("res").append("/").toString()).append(fileArrListFiles[i].getName()).toString(), new StringBuffer().append(new StringBuffer().append("r").append("/").toString()).append(this.mResguardBuilder.getReplaceString()).toString());
                    i++;
                }
            }
            generalFileResMapping();
        }
        Utils.cleanDir(this.mApkDecoder.getOutResFile());
    }

    private void reWriteTable() throws AndrolibException, IOException {
        this.f5098mIn = new ExtDataInput(new LEDataInputStream(new FileInputStream(this.mApkDecoder.getOutTempARSCFile())));
        this.mOut = new ExtDataOutput(new LEDataOutputStream(new FileOutputStream(this.mApkDecoder.getOutARSCFile(), false)));
        writeNextChunkCheck(2, this.mTableLenghtChange);
        int i = this.f5098mIn.readInt();
        this.mOut.writeInt(i);
        StringBlock.writeAll(this.f5098mIn, this.mOut);
        for (int i2 = 0; i2 < i; i2++) {
            this.mCurPackageID = i2;
            writeNextChunk(this.mPkgsLenghtChange[this.mCurPackageID]);
            this.mOut.writeBytes(this.f5098mIn, this.mHeader.chunkSize - 8);
        }
        this.mApkDecoder.getOutTempARSCFile().delete();
    }

    private void readComplexEntry(boolean z, int i) throws Throwable {
        this.f5098mIn.readInt();
        int i2 = this.f5098mIn.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5098mIn.readInt();
            readValue(z, i);
        }
    }

    private void readConfig() throws Throwable {
        checkChunkType(513);
        this.f5098mIn.skipInt();
        int i = this.f5098mIn.readInt();
        this.f5098mIn.readInt();
        readConfigFlags();
        int[] intArray = this.f5098mIn.readIntArray(i);
        for (int i2 = 0; i2 < intArray.length; i2++) {
            this.mCurEntryID = i2;
            if (intArray[i2] != -1) {
                this.mResId = (this.mResId & (-65536)) | i2;
                readEntry();
            }
        }
    }

    private void readConfigFlags() throws AndrolibException, IOException {
        int i;
        int i2;
        int i3 = this.f5098mIn.readInt();
        int i4 = 28;
        if (i3 < 28) {
            throw new AndrolibException("Config size < 28");
        }
        this.f5098mIn.readShort();
        this.f5098mIn.readShort();
        char[] cArr = {(char) this.f5098mIn.readByte(), (char) this.f5098mIn.readByte()};
        char[] cArr2 = {(char) this.f5098mIn.readByte(), (char) this.f5098mIn.readByte()};
        this.f5098mIn.readByte();
        this.f5098mIn.readByte();
        this.f5098mIn.readUnsignedShort();
        this.f5098mIn.readByte();
        this.f5098mIn.readByte();
        this.f5098mIn.readByte();
        this.f5098mIn.skipBytes(1);
        this.f5098mIn.readShort();
        this.f5098mIn.readShort();
        this.f5098mIn.readShort();
        this.f5098mIn.skipBytes(2);
        if (i3 >= 32) {
            this.f5098mIn.readByte();
            this.f5098mIn.readByte();
            this.f5098mIn.readShort();
            i4 = 32;
        }
        if (i3 >= 36) {
            this.f5098mIn.readShort();
            this.f5098mIn.readShort();
            i = 36;
        } else {
            i = i4;
        }
        if (i3 >= 48) {
            readScriptOrVariantChar(4).toCharArray();
            readScriptOrVariantChar(8).toCharArray();
            i2 = 48;
        } else {
            i2 = i;
        }
        if (i3 >= 52) {
            this.f5098mIn.readByte();
            this.f5098mIn.skipBytes(3);
            i2 = 52;
        }
        if (i3 >= 56) {
            this.f5098mIn.skipBytes(4);
            i2 = 56;
        }
        int i5 = i3 - 56;
        if (i5 > 0) {
            byte[] bArr = new byte[i5];
            int i6 = i2 + i5;
            this.f5098mIn.readFully(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.equals(BigInteger.ZERO)) {
                LOGGER.fine(String.format("Config flags size > %d, but exceeding bytes are all zero, so it should be ok.", new Integer(56)));
            } else {
                LOGGER.warning(String.format("Config flags size > %d. Exceeding bytes: 0x%X.", new Integer(56), bigInteger));
            }
        }
    }

    private void readEntry() throws Throwable {
        this.f5098mIn.skipBytes(2);
        short s = this.f5098mIn.readShort();
        int i = this.f5098mIn.readInt();
        if (this.mPkg.isCanResguard() && !this.mResguardBuilder.isReplaced(this.mCurEntryID) && !this.mResguardBuilder.isInWhiteList(this.mCurEntryID)) {
            Configuration config = this.mApkDecoder.getConfig();
            if (!(config.mUseWhiteList ? dealWithWhiteList(i, config) : false)) {
                dealWithNonWhiteList(i, config);
            }
        }
        if ((s & 1) == 0) {
            readValue(true, i);
        } else {
            readComplexEntry(false, i);
        }
    }

    private void readLibraryType() throws Throwable {
        checkChunkType(515);
        int i = this.f5098mIn.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            System.out.printf("Decoding Shared Library (%s), pkgId: %d\n", this.f5098mIn.readNullEndedString(128, true), new Integer(this.f5098mIn.readInt()));
        }
        while (nextChunk().type == 513) {
            readTableTypeSpec();
        }
    }

    private ResPackage readPackage() throws Throwable {
        checkChunkType(512);
        byte b = (byte) this.f5098mIn.readInt();
        String nullEndedString = this.f5098mIn.readNullEndedString(128, true);
        System.out.printf("reading packagename %s\n", nullEndedString);
        this.f5098mIn.skipInt();
        this.f5098mIn.skipInt();
        this.f5098mIn.skipInt();
        this.f5098mIn.skipInt();
        this.mCurrTypeID = -1;
        this.mTypeNames = StringBlock.read(this.f5098mIn);
        this.mSpecNames = StringBlock.read(this.f5098mIn);
        this.mResId = b << 24;
        this.mPkg = new ResPackage(b, nullEndedString);
        if (this.mPkg.getName().equals(Project.ANDROID)) {
            this.mPkg.setCanResguard(false);
        } else {
            this.mPkg.setCanResguard(true);
        }
        nextChunk();
        while (this.mHeader.type == 515) {
            readLibraryType();
        }
        while (this.mHeader.type == 514) {
            readTableTypeSpec();
        }
        return this.mPkg;
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
            com.tencent.mm.util.ExtDataInput r2 = r3.f5098mIn
            r2.skipBytes(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L15:
            com.tencent.mm.util.ExtDataInput r2 = r3.f5098mIn
            byte r2 = r2.readByte()
            short r2 = (short) r2
            if (r2 == 0) goto Lb
            char r2 = (char) r2
            r1.append(r2)
            r4 = r0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.androlib.res.decoder.ARSCDecoder.readScriptOrVariantChar(int):java.lang.String");
    }

    private ResPackage[] readTable() throws AndrolibException, IOException {
        nextChunkCheckType(2);
        int i = this.f5098mIn.readInt();
        this.mTableStrings = StringBlock.read(this.f5098mIn);
        ResPackage[] resPackageArr = new ResPackage[i];
        nextChunk();
        for (int i2 = 0; i2 < i; i2++) {
            resPackageArr[i2] = readPackage();
        }
        this.mMappingWriter.close();
        System.out.printf("resources mapping file %s done\n", this.mApkDecoder.getResMappingFile().getAbsolutePath());
        generalFilterEnd(mMergeDuplicatedResCount, this.mMergeDuplicatedResTotalSize);
        this.mMergeDuplicatedResMappingWriter.close();
        System.out.printf("resources filter mapping file %s done\n", this.mApkDecoder.getMergeDuplicatedResMappingFile().getAbsolutePath());
        return resPackageArr;
    }

    private void readTableTypeSpec() throws Throwable {
        checkChunkType(514);
        byte b = this.f5098mIn.readByte();
        this.f5098mIn.skipBytes(3);
        int i = this.f5098mIn.readInt();
        this.mType = new ResType(this.mTypeNames.getString(b - 1), this.mPkg);
        if (this.mCurrTypeID != b) {
            this.mCurrTypeID = b;
            initResGuardBuild(this.mCurrTypeID);
        }
        this.mShouldResguardForType = isToResguardFile(this.mTypeNames.getString(b - 1));
        this.f5098mIn.skipBytes(i * 4);
        this.mResId = (b << 16) | ((-16777216) & this.mResId);
        while (nextChunk().type == 513) {
            readConfig();
        }
    }

    private void readValue(boolean z, int i) throws Throwable {
        MergeDuplicatedResInfo mergeDuplicatedResInfo;
        String str;
        this.f5098mIn.skipCheckShort((short) 8);
        this.f5098mIn.skipCheckByte((byte) 0);
        byte b = this.f5098mIn.readByte();
        int i2 = this.f5098mIn.readInt();
        if (this.mPkg.isCanResguard() && z && b == 3 && this.mShouldResguardForType && this.mShouldResguardTypeSet.contains(this.mType.getName()) && mTableStringsResguard.get(new Integer(i2)) == null) {
            String string = this.mTableStrings.m7237get(i2).toString();
            if (StringUtil.isBlank(string) || string.equalsIgnoreCase("null")) {
                return;
            }
            String specRepplace = this.mPkg.getSpecRepplace(this.mResId);
            int iLastIndexOf = string.lastIndexOf("/");
            if (iLastIndexOf == -1) {
                throw new AndrolibException(String.format("can not find \\ or raw string in res path = %s", string));
            }
            String strSubstring = string.substring(0, iLastIndexOf);
            if (!this.mApkDecoder.getConfig().mKeepRoot) {
                strSubstring = this.mOldFileName.get(string.substring(0, iLastIndexOf));
            }
            if (strSubstring == null) {
                System.err.printf("can not found new res path, raw=%s\n", string);
                return;
            }
            String string2 = new StringBuffer().append(new StringBuffer().append(strSubstring).append("/").toString()).append(specRepplace).toString();
            int iIndexOf = string.indexOf(".");
            String string3 = iIndexOf != -1 ? new StringBuffer().append(string2).append(string.substring(iIndexOf)).toString() : string2;
            String str2 = new String(string);
            String str3 = new String(string3);
            if (!File.separator.contains("/")) {
                str3 = str3.replace("/", File.separator);
                str2 = str2.replace("/", File.separator);
            }
            File file = new File(new StringBuffer().append(new StringBuffer().append(this.mApkDecoder.getOutTempDir().getAbsolutePath()).append(File.separator).toString()).append(str2).toString());
            File file2 = new File(new StringBuffer().append(new StringBuffer().append(this.mApkDecoder.getOutDir().getAbsolutePath()).append(File.separator).toString()).append(str3).toString());
            MergeDuplicatedResInfo mergeDuplicatedResInfoMergeDuplicated = (MergeDuplicatedResInfo) null;
            boolean z2 = this.mApkDecoder.getConfig().mMergeDuplicatedRes;
            if (!z2 || (mergeDuplicatedResInfoMergeDuplicated = mergeDuplicated(file, file2, str2, string3)) == null) {
                mergeDuplicatedResInfo = mergeDuplicatedResInfoMergeDuplicated;
                str = string3;
            } else {
                File file3 = new File(mergeDuplicatedResInfoMergeDuplicated.filePath);
                str = mergeDuplicatedResInfoMergeDuplicated.fileName;
                mergeDuplicatedResInfo = mergeDuplicatedResInfoMergeDuplicated;
                file2 = file3;
            }
            HashMap<String, Integer> compressData = this.mApkDecoder.getCompressData();
            if (compressData.containsKey(string)) {
                compressData.put(str, compressData.get(string));
            } else {
                System.err.printf("can not find the compress dataresFile=%s\n", string);
            }
            if (!file.exists()) {
                System.err.printf("can not find res file, you delete it? path: resFile=%s\n", file.getAbsolutePath());
                return;
            }
            if (!z2 && file2.exists()) {
                throw new AndrolibException(String.format("res dest file is already  found: destFile=%s", file2.getAbsolutePath()));
            }
            if (mergeDuplicatedResInfo == null) {
                FileOperation.copyFileUsingStream(file, file2);
            }
            this.mApkDecoder.removeCopiedResFile(file);
            mTableStringsResguard.put(new Integer(i2), str);
        }
    }

    private void reduceFromOldMappingFile() {
        if (this.mPkg.isCanResguard() && this.mApkDecoder.getConfig().mUseKeepMapping) {
            HashMap<String, HashMap<String, HashMap<String, String>>> map = this.mApkDecoder.getConfig().mOldResMapping;
            String name = this.mPkg.getName();
            if (map.containsKey(name)) {
                HashMap<String, HashMap<String, String>> map2 = map.get(name);
                String name2 = this.mType.getName();
                if (map2.containsKey(name2)) {
                    this.mResguardBuilder.removeStrings(map2.get(name2).values());
                }
            }
        }
    }

    public static void write(InputStream inputStream, ApkDecoder apkDecoder, ResPackage[] resPackageArr) throws AndrolibException {
        try {
            new ARSCDecoder(inputStream, apkDecoder, resPackageArr).writeTable();
        } catch (IOException e) {
            throw new AndrolibException("Could not decode arsc file", e);
        }
    }

    private void writeComplexEntry() throws AndrolibException, IOException {
        this.mOut.writeInt(this.f5098mIn.readInt());
        int i = this.f5098mIn.readInt();
        this.mOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.mOut.writeInt(this.f5098mIn.readInt());
            writeValue();
        }
    }

    private void writeConfig() throws AndrolibException, IOException {
        checkChunkType(513);
        this.mOut.writeInt(this.f5098mIn.readInt());
        int i = this.f5098mIn.readInt();
        this.mOut.writeInt(i);
        this.mOut.writeInt(this.f5098mIn.readInt());
        writeConfigFlags();
        int[] intArray = this.f5098mIn.readIntArray(i);
        this.mOut.writeIntArray(intArray);
        for (int i2 = 0; i2 < intArray.length; i2++) {
            if (intArray[i2] != -1) {
                this.mResId = (this.mResId & (-65536)) | i2;
                writeEntry();
            }
        }
    }

    private void writeConfigFlags() throws AndrolibException, IOException {
        int i = this.f5098mIn.readInt();
        if (i < 28) {
            throw new AndrolibException("Config size < 28");
        }
        this.mOut.writeInt(i);
        this.mOut.writeBytes(this.f5098mIn, i - 4);
    }

    private void writeEntry() throws AndrolibException, IOException {
        this.mOut.writeBytes(this.f5098mIn, 2);
        short s = this.f5098mIn.readShort();
        this.mOut.writeShort(s);
        int iIntValue = this.f5098mIn.readInt();
        ResPackage resPackage = this.mPkgs[this.mCurPackageID];
        if (resPackage.isCanResguard() && (iIntValue = this.mCurSpecNameToPos.get(resPackage.getSpecRepplace(this.mResId)).intValue()) < 0) {
            throw new AndrolibException(String.format("writeEntry new specNamesId < 0 %d", new Integer(iIntValue)));
        }
        this.mOut.writeInt(iIntValue);
        if ((s & 1) == 0) {
            writeValue();
        } else {
            writeComplexEntry();
        }
    }

    private void writeLibraryType() throws AndrolibException, IOException {
        checkChunkType(515);
        int i = this.f5098mIn.readInt();
        this.mOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.mOut.writeInt(this.f5098mIn.readInt());
            this.mOut.writeBytes(this.f5098mIn, 256);
        }
        writeNextChunk(0);
        while (this.mHeader.type == 513) {
            writeTableTypeSpec();
        }
    }

    private Header writeNextChunk(int i) throws AndrolibException, IOException {
        this.mHeader = Header.readAndWriteHeader(this.f5098mIn, this.mOut, i);
        return this.mHeader;
    }

    private Header writeNextChunkCheck(int i, int i2) throws AndrolibException, IOException {
        this.mHeader = Header.readAndWriteHeader(this.f5098mIn, this.mOut, i2);
        if (this.mHeader.type != i) {
            throw new AndrolibException(String.format("Invalid chunk type: expected=%d, got=%d", new Integer(i), new Short(this.mHeader.type)));
        }
        return this.mHeader;
    }

    private void writePackage() throws AndrolibException, IOException {
        checkChunkType(512);
        byte b = (byte) this.f5098mIn.readInt();
        this.mOut.writeInt(b);
        this.mResId = b << 24;
        this.mOut.writeBytes(this.f5098mIn, 256);
        this.mOut.writeInt(this.f5098mIn.readInt());
        this.mOut.writeInt(this.f5098mIn.readInt());
        this.mOut.writeInt(this.f5098mIn.readInt());
        this.mOut.writeInt(this.f5098mIn.readInt());
        StringBlock.writeAll(this.f5098mIn, this.mOut);
        if (this.mPkgs[this.mCurPackageID].isCanResguard()) {
            int iWriteSpecNameStringBlock = StringBlock.writeSpecNameStringBlock(this.f5098mIn, this.mOut, this.mPkgs[this.mCurPackageID].getSpecNamesBlock(), this.mCurSpecNameToPos);
            int[] iArr = this.mPkgsLenghtChange;
            int i = this.mCurPackageID;
            iArr[i] = iArr[i] + iWriteSpecNameStringBlock;
            this.mTableLenghtChange = iWriteSpecNameStringBlock + this.mTableLenghtChange;
        } else {
            StringBlock.writeAll(this.f5098mIn, this.mOut);
        }
        writeNextChunk(0);
        while (this.mHeader.type == 515) {
            writeLibraryType();
        }
        while (this.mHeader.type == 514) {
            writeTableTypeSpec();
        }
    }

    private void writeTable() throws AndrolibException, IOException {
        System.out.printf("writing new resources.arsc \n", new Object[0]);
        this.mTableLenghtChange = 0;
        writeNextChunkCheck(2, 0);
        int i = this.f5098mIn.readInt();
        this.mOut.writeInt(i);
        this.mTableLenghtChange += StringBlock.writeTableNameStringBlock(this.f5098mIn, this.mOut, mTableStringsResguard);
        writeNextChunk(0);
        if (i != this.mPkgs.length) {
            throw new AndrolibException(String.format("writeTable package count is different before %d, now %d", new Integer(this.mPkgs.length), new Integer(i)));
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.mCurPackageID = i2;
            writePackage();
        }
        reWriteTable();
    }

    private void writeTableTypeSpec() throws AndrolibException, IOException {
        checkChunkType(514);
        byte b = this.f5098mIn.readByte();
        this.mOut.writeByte(b);
        this.mResId = (b << 16) | ((-16777216) & this.mResId);
        this.mOut.writeBytes(this.f5098mIn, 3);
        int i = this.f5098mIn.readInt();
        this.mOut.writeInt(i);
        this.mOut.writeIntArray(this.f5098mIn.readIntArray(i));
        while (writeNextChunk(0).type == 513) {
            writeConfig();
        }
    }

    private void writeValue() throws AndrolibException, IOException {
        this.mOut.writeCheckShort(this.f5098mIn.readShort(), (short) 8);
        this.mOut.writeCheckByte(this.f5098mIn.readByte(), (byte) 0);
        this.mOut.writeByte(this.f5098mIn.readByte());
        this.mOut.writeInt(this.f5098mIn.readInt());
    }
}
