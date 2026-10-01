package com.baidu.android.common.util;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.android.common.security.AESUtil;
import com.baidu.android.common.security.Base64;
import com.baidu.android.common.security.MD5Util;
import com.baidu.android.common.security.SHA1Util;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceId {
    private static final String ACTION_GLAXY_CUID = "com.baidu.intent.action.GALAXY";
    private static final boolean CONFIG_WRITE_V1_STORAGE = false;
    private static final boolean DEBUG = false;
    private static final String DEFAULT_TM_DEVICEID = "";
    private static final String EXT_DIR = "backups/.SystemConfig";
    private static final String EXT_FILE = ".cuid";
    private static final String EXT_FILE_V2 = ".cuid2";
    private static final String KEY_DEVICE_ID = "com.baidu.deviceid";
    private static final String KEY_DEVICE_ID_V2 = "com.baidu.deviceid.v2";
    private static final String KEY_FLAG = "bd_setting_i";
    private static final String META_KEY_GALAXY_SF = "galaxy_sf";
    private static final String META_KEY_GLAXY_DATA = "galaxy_data";
    private static final String OLD_EXT_DIR = "baidu";
    private static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final int SDK_ANDROID_M = 23;
    private static final String SELF_CUID_FILE = "libcuid.so";
    private static final int STORAGE_SDCARD_V1 = 4;
    private static final int STORAGE_SDCARD_V2 = 8;
    private static final int STORAGE_SELF_FILE = 16;
    private static final int STORAGE_SYSTEM_SETTING_V1 = 1;
    private static final int STORAGE_SYSTEM_SETTING_V2 = 2;
    private static final int S_IRGRP = 32;
    private static final int S_IROTH = 4;
    private static final int S_IRUSR = 256;
    private static final int S_IRWXG = 56;
    private static final int S_IRWXO = 7;
    private static final int S_IRWXU = 448;
    private static final int S_IWGRP = 16;
    private static final int S_IWOTH = 2;
    private static final int S_IWUSR = 128;
    private static final int S_IXGRP = 8;
    private static final int S_IXOTH = 1;
    private static final int S_IXUSR = 64;

    private static final String f3728TAG = "DeviceId";
    private static CUIDInfo sCachedCuidInfo = null;
    private static final String sDEncoded = "ZGV2aWNlaWQ=";
    private static final String sIEncoded = "aW1laQ==";
    private static final String sVEncoded = "dmVy";
    private final Context mContext;
    private PublicKey mPublicKey;
    private int mSaveMask = 0;
    private static boolean sDataCuidInfoShable = true;
    private static final String AES_KEY = new String(Base64.decode(new byte[]{77, 122, 65, 121, 77, 84, 73, 120, 77, 68, 73, 61})) + new String(Base64.decode(new byte[]{90, 71, 108, 106, 100, 87, 82, 112, 89, 87, 73, 61}));

    private DeviceId(Context context) throws Throwable {
        this.mContext = context.getApplicationContext();
        initPublicKey();
    }

    private static String byte2hex(byte[] bArr) {
        String str;
        if (bArr == null) {
            throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
        }
        String str2 = "";
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                str = str2 + CUIDInfo.I_EMPTY + hexString;
            } else {
                str = str2 + hexString;
            }
            i++;
            str2 = str;
        }
        return str2.toLowerCase();
    }

    public static void setCuidDataShable(Context context, boolean z) {
        File file = new File(context.getApplicationContext().getFilesDir(), SELF_CUID_FILE);
        Context applicationContext = context.getApplicationContext();
        if (file.exists() && (sCachedCuidInfo == null || sDataCuidInfoShable != z)) {
            tryToModifyChmodForSelfFile(applicationContext, z);
        }
        sDataCuidInfoShable = z;
    }

    private String[] formatAndroidSigArray(Signature[] signatureArr) {
        String[] strArr = new String[signatureArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = byte2hex(SHA1Util.sha1(signatureArr[i].toByteArray()));
        }
        return strArr;
    }

    private static byte[] decryptByPublicKey(byte[] bArr, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(2, publicKey);
        return cipher.doFinal(bArr);
    }

    private void initPublicKey() throws Throwable {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        try {
            byteArrayInputStream2 = new ByteArrayInputStream(CuidCertStore.getCertBytes());
            try {
                this.mPublicKey = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream2).getPublicKey();
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Exception e) {
                        handleThrowable(e);
                    }
                }
            } catch (Exception e2) {
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Exception e3) {
                        handleThrowable(e3);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream == null) {
                    throw th;
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (Exception e4) {
                    handleThrowable(e4);
                    throw th;
                }
            }
        } catch (Exception e5) {
            byteArrayInputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
    }

    private List<CUIDBuddyInfo> collectBuddyInfos(Intent intent, boolean z) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.applicationInfo != null) {
                    try {
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString(META_KEY_GLAXY_DATA);
                            if (!TextUtils.isEmpty(string)) {
                                byte[] bArrDecode = Base64.decode(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(bArrDecode));
                                CUIDBuddyInfo cUIDBuddyInfo = new CUIDBuddyInfo();
                                cUIDBuddyInfo.priority = jSONObject.getInt("priority");
                                cUIDBuddyInfo.appInfo = resolveInfo.activityInfo.applicationInfo;
                                if (this.mContext.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    cUIDBuddyInfo.isSelf = true;
                                }
                                if (z) {
                                    String string2 = bundle.getString(META_KEY_GALAXY_SF);
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        String[] strArr = new String[jSONArray.length()];
                                        for (int i = 0; i < strArr.length; i++) {
                                            strArr[i] = jSONArray.getString(i);
                                        }
                                        if (isSigsEqual(strArr, formatAndroidSigArray(packageInfo.signatures))) {
                                            byte[] bArrDecryptByPublicKey = decryptByPublicKey(Base64.decode(string2.getBytes()), this.mPublicKey);
                                            if (bArrDecryptByPublicKey != null && Arrays.equals(bArrDecryptByPublicKey, SHA1Util.sha1(bArrDecode))) {
                                                cUIDBuddyInfo.sigMatched = true;
                                            }
                                        }
                                    }
                                }
                                arrayList.add(cUIDBuddyInfo);
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator<CUIDBuddyInfo>() {
            @Override
            public int compare(CUIDBuddyInfo cUIDBuddyInfo2, CUIDBuddyInfo cUIDBuddyInfo3) {
                int i2 = cUIDBuddyInfo3.priority - cUIDBuddyInfo2.priority;
                if (i2 == 0) {
                    if (cUIDBuddyInfo2.isSelf && cUIDBuddyInfo3.isSelf) {
                        return 0;
                    }
                    if (cUIDBuddyInfo2.isSelf) {
                        return -1;
                    }
                    if (cUIDBuddyInfo3.isSelf) {
                        return 1;
                    }
                    return i2;
                }
                return i2;
            }
        });
        return arrayList;
    }

    private boolean isSigsEqual(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    static class CUIDBuddyInfo {
        public ApplicationInfo appInfo;
        public boolean isSelf;
        public int priority;
        public boolean sigMatched;

        private CUIDBuddyInfo() {
            this.priority = 0;
            this.sigMatched = false;
            this.isSelf = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @SuppressLint({"NewApi"})
    public boolean writeToCuidFile(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        int i = (!sDataCuidInfoShable || Build.VERSION.SDK_INT >= 24) ? 0 : 1;
        try {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = this.mContext.openFileOutput(SELF_CUID_FILE, i);
                try {
                    fileOutputStreamOpenFileOutput.write(str.getBytes());
                    fileOutputStreamOpenFileOutput.flush();
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Exception e) {
                            handleThrowable(e);
                        }
                    }
                    if (Build.VERSION.SDK_INT < 21) {
                        return true;
                    }
                    if (i == 0 && sDataCuidInfoShable) {
                        return TargetApiSupport.doChmodSafely(new File(this.mContext.getFilesDir(), SELF_CUID_FILE).getAbsolutePath(), 436);
                    }
                    if (sDataCuidInfoShable) {
                        return true;
                    }
                    return TargetApiSupport.doChmodSafely(new File(this.mContext.getFilesDir(), SELF_CUID_FILE).getAbsolutePath(), 432);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStreamOpenFileOutput;
                    try {
                        handleThrowable(e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e3) {
                                handleThrowable(e3);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (Exception e4) {
                                handleThrowable(e4);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean tryToModifyChmodForSelfFile(Context context, boolean z) {
        boolean readable = false;
        File file = new File(context.getApplicationContext().getFilesDir(), SELF_CUID_FILE);
        if (!file.exists()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            try {
                if (z) {
                    readable = file.setReadable(true, false);
                } else {
                    readable = file.setReadable(false, false) && file.setReadable(true, true);
                }
                return readable;
            } catch (Exception e) {
                handleThrowable(e);
                return readable;
            }
        }
        return TargetApiSupport.doChmodSafely(file.getAbsolutePath(), z ? 436 : 432);
    }

    static class TargetApiSupport {
        TargetApiSupport() {
        }

        static boolean doChmodSafely(String str, int i) {
            try {
                Os.chmod(str, i);
                return true;
            } catch (ErrnoException e) {
                DeviceId.handleThrowable(e);
                return false;
            } catch (Exception e2) {
                DeviceId.handleThrowable(e2);
                return false;
            }
        }
    }

    public String getSystemSettingValue(String str) {
        try {
            return Settings.System.getString(this.mContext.getContentResolver(), str);
        } catch (Exception e) {
            handleThrowable(e);
            return null;
        }
    }

    public boolean tryPutSystemSettingValue(String str, String str2) {
        try {
            return Settings.System.putString(this.mContext.getContentResolver(), str, str2);
        } catch (Exception e) {
            handleThrowable(e);
            return false;
        }
    }

    public static void handleThrowable(Throwable th) {
    }

    static class CUIDInfo {
        public static final String I_EMPTY = "0";
        public static final String I_FIXED = "O";
        public static final int PROTOCAL_MAX_LENGTH = 14;
        private static final int VERSION_DEF = 2;
        public String deviceId;
        public String flag;
        public int oldValueLength;
        public int version;

        private CUIDInfo() {
            this.version = 2;
            this.oldValueLength = 0;
        }

        public boolean isIENull() {
            return isIENull(this.flag);
        }

        public boolean isIENormal() {
            return isIENormal(this.oldValueLength);
        }

        public static boolean isIENull(String str) {
            return TextUtils.isEmpty(str);
        }

        public static boolean isIENormal(int i) {
            return i >= 14;
        }

        public static CUIDInfo createFromJson(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                String strOptString = I_EMPTY;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!DeviceId.getBase64DecodeStr(DeviceId.sDEncoded).equals(next) && !DeviceId.getBase64DecodeStr(DeviceId.sVEncoded).equals(next)) {
                        strOptString = jSONObject.optString(next, I_EMPTY);
                    }
                }
                String string = jSONObject.getString(DeviceId.getBase64DecodeStr(DeviceId.sDEncoded));
                int i = jSONObject.getInt(DeviceId.getBase64DecodeStr(DeviceId.sVEncoded));
                int length = TextUtils.isEmpty(strOptString) ? 0 : strOptString.length();
                if (!TextUtils.isEmpty(string)) {
                    CUIDInfo cUIDInfo = new CUIDInfo();
                    cUIDInfo.deviceId = string;
                    cUIDInfo.version = i;
                    cUIDInfo.oldValueLength = length;
                    if (cUIDInfo.oldValueLength < 14) {
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = I_EMPTY;
                        }
                        cUIDInfo.flag = strOptString;
                        return cUIDInfo;
                    }
                    return cUIDInfo;
                }
            } catch (JSONException e) {
                DeviceId.handleThrowable(e);
            }
            return null;
        }

        public static CUIDInfo createCuidInfoFromV1Cache(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                CUIDInfo cUIDInfo = new CUIDInfo();
                cUIDInfo.deviceId = str;
                cUIDInfo.oldValueLength = TextUtils.isEmpty(str2) ? 0 : str2.length();
                if (cUIDInfo.oldValueLength < 14) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = I_EMPTY;
                    }
                    cUIDInfo.flag = str2;
                }
                return cUIDInfo;
            }
            return null;
        }

        public String toPersitString() {
            try {
                return new JSONObject().put(DeviceId.getBase64DecodeStr(DeviceId.sDEncoded), this.deviceId).put(DeviceId.getBase64DecodeStr(DeviceId.sIEncoded), this.flag).put(DeviceId.getBase64DecodeStr(DeviceId.sVEncoded), this.version).toString();
            } catch (JSONException e) {
                DeviceId.handleThrowable(e);
                return null;
            }
        }

        public String getFinalCUID() {
            String str = this.flag;
            if (TextUtils.isEmpty(str)) {
                str = I_EMPTY;
            }
            return this.deviceId + "|" + str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void writeToFile(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            handleThrowable(e);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    handleThrowable(e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            handleThrowable(e3);
                        }
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    handleThrowable(e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            handleThrowable(e5);
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e6) {
                        handleThrowable(e6);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            fileOutputStream = null;
        } catch (SecurityException e8) {
            e = e8;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.FileReader] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static String getFileContent(File file) throws Throwable {
        FileReader fileReader;
        String str = 0;
        str = 0;
        str = 0;
        try {
            try {
                fileReader = new FileReader(file);
                try {
                    char[] cArr = new char[8192];
                    CharArrayWriter charArrayWriter = new CharArrayWriter();
                    while (true) {
                        int i = fileReader.read(cArr);
                        if (i <= 0) {
                            break;
                        }
                        charArrayWriter.write(cArr, 0, i);
                    }
                    String string = charArrayWriter.toString();
                    str = string;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                            str = string;
                        } catch (Exception e) {
                            handleThrowable(e);
                            str = string;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    handleThrowable(e);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception e3) {
                            handleThrowable(e3);
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        str.close();
                    } catch (Exception e4) {
                        handleThrowable(e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                str.close();
            }
            throw th;
        }
        return str;
    }

    public static String getCUID(Context context) {
        return getOrCreateCUIDInfo(context).getFinalCUID();
    }

    private static CUIDInfo getOrCreateCUIDInfo(Context context) {
        if (sCachedCuidInfo == null) {
            synchronized (CUIDInfo.class) {
                if (sCachedCuidInfo == null) {
                    SystemClock.uptimeMillis();
                    sCachedCuidInfo = new DeviceId(context).getCUIDInfo();
                    SystemClock.uptimeMillis();
                }
            }
        }
        return sCachedCuidInfo;
    }

    public static String getDeviceID(Context context) {
        return getOrCreateCUIDInfo(context).deviceId;
    }

    private static String getAndroidId(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x019f A[EDGE_INSN: B:60:0x019f->B:28:0x00ce BREAK  A[LOOP:1: B:20:0x009a->B:68:0x009a], PHI: r3
      0x019f: PHI (r3v6 com.baidu.android.common.util.DeviceId$CUIDInfo) = 
      (r3v5 com.baidu.android.common.util.DeviceId$CUIDInfo)
      (r3v5 com.baidu.android.common.util.DeviceId$CUIDInfo)
      (r3v13 com.baidu.android.common.util.DeviceId$CUIDInfo)
     binds: [B:13:0x004e, B:15:0x0061, B:65:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    private CUIDInfo getCUIDInfo() throws Throwable {
        boolean z;
        CUIDInfo cUIDInfoCreateFromJson;
        CUIDInfo externalV1DeviceId;
        String defaultFlag;
        CUIDInfo cUIDInfo;
        String str;
        String name;
        boolean z2 = false;
        List<CUIDBuddyInfo> listCollectBuddyInfos = collectBuddyInfos(new Intent(ACTION_GLAXY_CUID).setPackage(this.mContext.getPackageName()), true);
        if (listCollectBuddyInfos == null || listCollectBuddyInfos.size() == 0) {
            for (int i = 0; i < 3; i++) {
                Log.w(f3728TAG, "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
            }
            z = false;
        } else {
            CUIDBuddyInfo cUIDBuddyInfo = listCollectBuddyInfos.get(0);
            boolean z3 = cUIDBuddyInfo.sigMatched;
            if (!cUIDBuddyInfo.sigMatched) {
                for (int i2 = 0; i2 < 3; i2++) {
                    Log.w(f3728TAG, "galaxy config err, In the release version of the signature should be matched");
                }
            }
            z = z3;
        }
        File file = new File(this.mContext.getFilesDir(), SELF_CUID_FILE);
        CUIDInfo cUIDInfoCreateFromJson2 = file.exists() ? CUIDInfo.createFromJson(decryptCUIDInfo(getFileContent(file))) : null;
        if (cUIDInfoCreateFromJson2 != null) {
            cUIDInfoCreateFromJson = cUIDInfoCreateFromJson2;
            break;
        }
        this.mSaveMask |= 16;
        List<CUIDBuddyInfo> listCollectBuddyInfos2 = collectBuddyInfos(new Intent(ACTION_GLAXY_CUID), z);
        if (listCollectBuddyInfos2 == null) {
            cUIDInfoCreateFromJson = cUIDInfoCreateFromJson2;
            break;
        }
        File filesDir = this.mContext.getFilesDir();
        if ("files".equals(filesDir.getName())) {
            name = "files";
        } else {
            Log.e(f3728TAG, "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
            name = filesDir.getName();
        }
        Iterator<CUIDBuddyInfo> it = listCollectBuddyInfos2.iterator();
        while (true) {
            if (!it.hasNext()) {
                cUIDInfoCreateFromJson = cUIDInfoCreateFromJson2;
                break;
            }
            CUIDBuddyInfo next = it.next();
            if (!next.isSelf) {
                File file2 = new File(new File(next.appInfo.dataDir, name), SELF_CUID_FILE);
                if (file2.exists()) {
                    cUIDInfoCreateFromJson = CUIDInfo.createFromJson(decryptCUIDInfo(getFileContent(file2)));
                    if (cUIDInfoCreateFromJson != null) {
                        break;
                    }
                } else {
                    cUIDInfoCreateFromJson = cUIDInfoCreateFromJson2;
                }
                cUIDInfoCreateFromJson2 = cUIDInfoCreateFromJson;
            }
        }
        if (cUIDInfoCreateFromJson == null) {
            cUIDInfoCreateFromJson = CUIDInfo.createFromJson(decryptCUIDInfo(getSystemSettingValue(KEY_DEVICE_ID_V2)));
        }
        boolean zCheckSelfPermission = checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        if (cUIDInfoCreateFromJson == null && zCheckSelfPermission) {
            this.mSaveMask |= 2;
            externalV1DeviceId = getCuidInfoFromExternalV2();
        } else {
            externalV1DeviceId = cUIDInfoCreateFromJson;
        }
        if (externalV1DeviceId == null) {
            this.mSaveMask |= 8;
            externalV1DeviceId = getCUidInfoFromSystemSettingV1();
        }
        if (externalV1DeviceId == null && zCheckSelfPermission) {
            this.mSaveMask |= 1;
            defaultFlag = getDefaultFlag("");
            externalV1DeviceId = getExternalV1DeviceId(defaultFlag);
            z2 = true;
        } else {
            defaultFlag = null;
        }
        if (externalV1DeviceId == null) {
            this.mSaveMask |= 4;
            if (!z2) {
                defaultFlag = getDefaultFlag("");
            }
            CUIDInfo cUIDInfo2 = new CUIDInfo();
            String androidId = getAndroidId(this.mContext);
            if (Build.VERSION.SDK_INT < 23) {
                str = defaultFlag + androidId + UUID.randomUUID().toString();
            } else {
                str = "com.baidu" + androidId;
            }
            cUIDInfo2.deviceId = MD5Util.toMd5(str.getBytes(), true);
            cUIDInfo2.flag = defaultFlag;
            cUIDInfo = cUIDInfo2;
        } else {
            cUIDInfo = externalV1DeviceId;
        }
        fixCUIDInfoByIE(cUIDInfo);
        writeJobThread(cUIDInfo);
        return cUIDInfo;
    }

    private synchronized void writeJobThread(CUIDInfo cUIDInfo) {
        new Thread(getWriteRunnable(cUIDInfo)).start();
    }

    public boolean fixCUIDInfoByIE(CUIDInfo cUIDInfo) {
        if (cUIDInfo.isIENormal()) {
            cUIDInfo.flag = CUIDInfo.I_FIXED;
            return true;
        }
        if (cUIDInfo.isIENull()) {
            cUIDInfo.flag = CUIDInfo.I_EMPTY;
            return true;
        }
        return false;
    }

    private Runnable getWriteRunnable(final CUIDInfo cUIDInfo) {
        return new Runnable() {
            @Override
            public void run() throws Throwable {
                CUIDInfo cUIDInfo2 = new CUIDInfo();
                cUIDInfo2.flag = cUIDInfo.flag;
                cUIDInfo2.deviceId = cUIDInfo.deviceId;
                File file = new File(DeviceId.this.mContext.getFilesDir(), DeviceId.SELF_CUID_FILE);
                String strEncryptCUIDInfo = DeviceId.encryptCUIDInfo(cUIDInfo2.toPersitString());
                if (!file.exists()) {
                    DeviceId.this.writeToCuidFile(strEncryptCUIDInfo);
                } else {
                    CUIDInfo cUIDInfoCreateFromJson = CUIDInfo.createFromJson(DeviceId.decryptCUIDInfo(DeviceId.getFileContent(file)));
                    if (cUIDInfoCreateFromJson != null) {
                        if (DeviceId.this.fixCUIDInfoByIE(cUIDInfoCreateFromJson)) {
                            DeviceId.this.writeToCuidFile(DeviceId.encryptCUIDInfo(cUIDInfoCreateFromJson.toPersitString()));
                        }
                    } else if (cUIDInfoCreateFromJson == null) {
                        DeviceId.this.writeToCuidFile(strEncryptCUIDInfo);
                    }
                }
                boolean zHasWriteSettingsPermission = DeviceId.this.hasWriteSettingsPermission();
                if (zHasWriteSettingsPermission) {
                    String systemSettingValue = DeviceId.this.getSystemSettingValue(DeviceId.KEY_DEVICE_ID_V2);
                    if (TextUtils.isEmpty(systemSettingValue)) {
                        DeviceId.this.tryPutSystemSettingValue(DeviceId.KEY_DEVICE_ID_V2, strEncryptCUIDInfo);
                    } else {
                        CUIDInfo cUIDInfoCreateFromJson2 = CUIDInfo.createFromJson(DeviceId.decryptCUIDInfo(systemSettingValue));
                        if (cUIDInfoCreateFromJson2 != null) {
                            if (DeviceId.this.fixCUIDInfoByIE(cUIDInfoCreateFromJson2)) {
                                DeviceId.this.tryPutSystemSettingValue(DeviceId.KEY_DEVICE_ID_V2, DeviceId.encryptCUIDInfo(cUIDInfoCreateFromJson2.toPersitString()));
                            }
                        } else if (cUIDInfoCreateFromJson2 == null) {
                            DeviceId.this.tryPutSystemSettingValue(DeviceId.KEY_DEVICE_ID_V2, strEncryptCUIDInfo);
                        }
                    }
                }
                boolean zCheckSelfPermission = DeviceId.this.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
                if (zCheckSelfPermission) {
                    if (!new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2").exists()) {
                        DeviceId.setExternalV2DeviceId(strEncryptCUIDInfo);
                    } else {
                        CUIDInfo cuidInfoFromExternalV2 = DeviceId.this.getCuidInfoFromExternalV2();
                        if (cuidInfoFromExternalV2 != null) {
                            if (DeviceId.this.fixCUIDInfoByIE(cuidInfoFromExternalV2)) {
                                DeviceId.setExternalV2DeviceId(DeviceId.encryptCUIDInfo(cuidInfoFromExternalV2.toPersitString()));
                            }
                        } else if (cuidInfoFromExternalV2 == null) {
                            DeviceId.setExternalV2DeviceId(strEncryptCUIDInfo);
                        }
                    }
                }
                if (zHasWriteSettingsPermission) {
                    String systemSettingValue2 = DeviceId.this.getSystemSettingValue(DeviceId.KEY_FLAG);
                    if (CUIDInfo.isIENormal(TextUtils.isEmpty(systemSettingValue2) ? 0 : systemSettingValue2.length())) {
                        DeviceId.this.tryPutSystemSettingValue(DeviceId.KEY_FLAG, CUIDInfo.I_FIXED);
                    } else if (CUIDInfo.isIENull(systemSettingValue2)) {
                        DeviceId.this.tryPutSystemSettingValue(DeviceId.KEY_FLAG, CUIDInfo.I_EMPTY);
                    }
                }
                if (zCheckSelfPermission && new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid").exists()) {
                    CUIDInfo externalV1DeviceId = DeviceId.this.getExternalV1DeviceId(DeviceId.this.getDefaultFlag(""));
                    if (externalV1DeviceId != null) {
                        if (DeviceId.this.fixCUIDInfoByIE(externalV1DeviceId)) {
                            DeviceId.setExternalDeviceId(externalV1DeviceId.flag, externalV1DeviceId.deviceId);
                            return;
                        }
                        return;
                    }
                    if (externalV1DeviceId == null) {
                    }
                }
            }
        };
    }

    public boolean hasWriteSettingsPermission() {
        return checkSelfPermission("android.permission.WRITE_SETTINGS");
    }

    public boolean checkSelfPermission(String str) {
        return this.mContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private CUIDInfo getCUidInfoFromSystemSettingV1() {
        return CUIDInfo.createCuidInfoFromV1Cache(getSystemSettingValue(KEY_DEVICE_ID), getSystemSettingValue(KEY_FLAG));
    }

    public CUIDInfo getCuidInfoFromExternalV2() throws Throwable {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            String fileContent = getFileContent(file);
            if (!TextUtils.isEmpty(fileContent)) {
                try {
                    return CUIDInfo.createFromJson(new String(AESUtil.decrypt(AES_KEY, AES_KEY, Base64.decode(fileContent.getBytes()))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public CUIDInfo getExternalV1DeviceId(String str) {
        String str2 = "";
        String str3 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            bufferedReader.close();
            String[] strArrSplit = new String(AESUtil.decrypt(AES_KEY, AES_KEY, Base64.decode(sb.toString().getBytes()))).split("=");
            if (strArrSplit != null && strArrSplit.length == 2) {
                str3 = strArrSplit[0];
                str2 = strArrSplit[1];
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e2) {
        } catch (Exception e3) {
        }
        return CUIDInfo.createCuidInfoFromV1Cache(str2, str3);
    }

    public static String encryptCUIDInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Base64.encode(AESUtil.encrypt(AES_KEY, AES_KEY, str.getBytes()), "utf-8");
        } catch (UnsupportedEncodingException e) {
            handleThrowable(e);
            return "";
        } catch (Exception e2) {
            handleThrowable(e2);
            return "";
        }
    }

    public static String decryptCUIDInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new String(AESUtil.decrypt(AES_KEY, AES_KEY, Base64.decode(str.getBytes())));
        } catch (Exception e) {
            handleThrowable(e);
            return "";
        }
    }

    public static void setExternalV2DeviceId(String str) {
        File file;
        File file2 = new File(Environment.getExternalStorageDirectory(), EXT_DIR);
        File file3 = new File(file2, EXT_FILE_V2);
        try {
            if (file2.exists() && !file2.isDirectory()) {
                Random random = new Random();
                File parentFile = file2.getParentFile();
                String name = file2.getName();
                do {
                    file = new File(parentFile, name + random.nextInt() + ".tmp");
                } while (file.exists());
                file2.renameTo(file);
                file.delete();
            }
            file2.mkdirs();
            FileWriter fileWriter = new FileWriter(file3, false);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
        } catch (Exception e2) {
        }
    }

    public static void setExternalDeviceId(String str, String str2) {
        File file;
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(Environment.getExternalStorageDirectory(), EXT_DIR);
            File file3 = new File(file2, EXT_FILE);
            try {
                if (file2.exists() && !file2.isDirectory()) {
                    Random random = new Random();
                    File parentFile = file2.getParentFile();
                    String name = file2.getName();
                    do {
                        file = new File(parentFile, name + random.nextInt() + ".tmp");
                    } while (file.exists());
                    file2.renameTo(file);
                    file.delete();
                }
                file2.mkdirs();
                FileWriter fileWriter = new FileWriter(file3, false);
                fileWriter.write(Base64.encode(AESUtil.encrypt(AES_KEY, AES_KEY, (str + "=" + str2).getBytes()), "utf-8"));
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
            } catch (Exception e2) {
            }
        }
    }

    public String getDefaultFlag(String str) {
        return CUIDInfo.I_EMPTY;
    }

    public static String getBase64DecodeStr(String str) {
        return new String(Base64.decode(str.getBytes()));
    }
}
