package com.tencent.mm.resourceproguard;

import com.tencent.mm.util.Utils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Configuration {
    public static final String ASRC_FILE = "resource.asrc";
    private static final String ATTR_7ZIP = "seventzip";
    private static final String ATTR_ACTIVE = "isactive";
    private static final String ATTR_ID = "id";
    private static final String ATTR_KEEPROOT = "keeproot";
    private static final String ATTR_SIGNFILE = "metaname";
    private static final String ATTR_SIGNFILE_ALIAS = "alias";
    private static final String ATTR_SIGNFILE_KEYPASS = "keypass";
    private static final String ATTR_SIGNFILE_PATH = "path";
    private static final String ATTR_SIGNFILE_STOREPASS = "storepass";
    private static final String ATTR_VALUE = "value";
    private static final String COMPRESS_ISSUE = "compress";
    public static final String DEFAULT_DIGEST_ALG = "SHA1";
    private static final String MAPPING_ISSUE = "keepmapping";
    private static final String MERGE_DUPLICATED_RES = "mergeDuplicatedRes";
    private static final String PROPERTY_ISSUE = "property";
    private static final String SIGN_ISSUE = "sign";
    private static final String TAG_ISSUE = "issue";
    private static final String WHITELIST_ISSUE = "whitelist";
    private final Pattern MAP_PATTERN;
    public final String digestAlg;
    public String m7zipPath;
    public final HashSet<Pattern> mCompressPatterns;
    public String mFixedResName;
    public boolean mKeepRoot;
    public String mKeyPass;
    public boolean mMergeDuplicatedRes;
    public String mMetaName;
    public final HashMap<String, String> mOldFileMapping;
    public File mOldMappingFile;
    public final HashMap<String, HashMap<String, HashMap<String, String>>> mOldResMapping;
    public File mSignatureFile;
    public String mStoreAlias;
    public String mStorePass;
    public boolean mUse7zip;
    public boolean mUseCompress;
    public boolean mUseKeepMapping;
    public boolean mUseSignAPK;
    public boolean mUseWhiteList;
    public final HashMap<String, HashMap<String, HashSet<Pattern>>> mWhiteList;
    public String mZipalignPath;

    public Configuration(InputParam inputParam) throws IOException {
        this.MAP_PATTERN = Pattern.compile("\\s+(.*)->(.*)");
        this.mUse7zip = true;
        this.mKeepRoot = false;
        this.mMergeDuplicatedRes = false;
        this.mMetaName = "META-INF";
        this.mFixedResName = (String) null;
        this.mUseSignAPK = false;
        this.mUseKeepMapping = false;
        this.mWhiteList = new HashMap<>();
        this.mOldResMapping = new HashMap<>();
        this.mOldFileMapping = new HashMap<>();
        this.mCompressPatterns = new HashSet<>();
        this.digestAlg = inputParam.digestAlg;
        if (inputParam.useSign) {
            setSignData(inputParam.signFile, inputParam.keypass, inputParam.storealias, inputParam.storepass);
        }
        if (inputParam.mappingFile != null) {
            this.mUseKeepMapping = true;
            setKeepMappingData(inputParam.mappingFile);
        }
        for (String str : inputParam.whiteList) {
            this.mUseWhiteList = true;
            addWhiteList(str);
        }
        this.mUse7zip = inputParam.use7zip;
        this.mKeepRoot = inputParam.keepRoot;
        this.mMergeDuplicatedRes = inputParam.mergeDuplicatedRes;
        this.mMetaName = inputParam.metaName;
        this.mFixedResName = inputParam.fixedResName;
        for (String str2 : inputParam.compressFilePattern) {
            this.mUseCompress = true;
            addToCompressPatterns(str2);
        }
        this.m7zipPath = inputParam.sevenZipPath;
        this.mZipalignPath = inputParam.zipAlignPath;
    }

    public Configuration(File file, String str, String str2, File file2, File file3, String str3, String str4, String str5) throws Throwable {
        this.MAP_PATTERN = Pattern.compile("\\s+(.*)->(.*)");
        this.mUse7zip = true;
        this.mKeepRoot = false;
        this.mMergeDuplicatedRes = false;
        this.mMetaName = "META-INF";
        this.mFixedResName = (String) null;
        this.mUseSignAPK = false;
        this.mUseKeepMapping = false;
        this.mWhiteList = new HashMap<>();
        this.mOldResMapping = new HashMap<>();
        this.mOldFileMapping = new HashMap<>();
        this.mCompressPatterns = new HashSet<>();
        this.digestAlg = DEFAULT_DIGEST_ALG;
        if (file3 != null) {
            setSignData(file3, str3, str4, str5);
        }
        if (file2 != null) {
            setKeepMappingData(file2);
        }
        readXmlConfig(file);
        this.m7zipPath = str;
        this.mZipalignPath = str2;
    }

    private void addToCompressPatterns(String str) throws IOException {
        if (str.length() == 0) {
            throw new IOException(String.format("Invalid config file: Missing required attribute %s\n", ATTR_VALUE));
        }
        this.mCompressPatterns.add(Pattern.compile(Utils.convertToPatternString(str)));
    }

    private void addWhiteList(String str) throws IOException {
        if (str.length() == 0) {
            throw new IOException(new StringBuffer().append("Invalid config file: Missing required attribute ").append(ATTR_VALUE).toString());
        }
        int iIndexOf = str.indexOf(".R.");
        if (iIndexOf == -1) {
            throw new IOException(String.format("please write the full package name,eg com.tencent.mm.R.drawable.dfdf, but yours %s\n", str));
        }
        String strTrim = str.trim();
        String strSubstring = strTrim.substring(0, iIndexOf);
        int iIndexOf2 = strTrim.indexOf(".", iIndexOf + 3);
        String strSubstring2 = strTrim.substring(iIndexOf + 3, iIndexOf2);
        String strSubstring3 = strTrim.substring(iIndexOf2 + 1);
        HashMap<String, HashSet<Pattern>> map = this.mWhiteList.containsKey(strSubstring) ? this.mWhiteList.get(strSubstring) : new HashMap<>();
        HashSet<Pattern> hashSet = map.containsKey(strSubstring2) ? map.get(strSubstring2) : new HashSet<>();
        String strConvertToPatternString = Utils.convertToPatternString(strSubstring3);
        hashSet.add(Pattern.compile(strConvertToPatternString));
        map.put(strSubstring2, hashSet);
        System.out.println(String.format("convertToPatternString typeName %s format %s", strSubstring2, strConvertToPatternString));
        this.mWhiteList.put(strSubstring, map);
    }

    private void loadMappingFilesFromXml(Node node) throws IOException {
        if (this.mOldMappingFile != null) {
            System.err.println("Mapping file already load from command line, ignore this config");
            return;
        }
        NodeList childNodes = node.getChildNodes();
        if (childNodes.getLength() > 0) {
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    String attribute = ((Element) nodeItem).getAttribute(ATTR_VALUE);
                    if (attribute.length() == 0) {
                        throw new IOException(String.format("Invalid config file: Missing required attribute %s\n", ATTR_VALUE));
                    }
                    readOldMapping(attribute);
                }
            }
        }
    }

    private void processOldMappingFile() throws IOException {
        this.mOldResMapping.clear();
        this.mOldFileMapping.clear();
        try {
            FileReader fileReader = new FileReader(this.mOldMappingFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        if (line.length() > 0) {
                            Matcher matcher = this.MAP_PATTERN.matcher(line);
                            if (matcher.find()) {
                                String strGroup = matcher.group(2);
                                String strGroup2 = matcher.group(1);
                                String strTrim = strGroup.trim();
                                String strTrim2 = strGroup2.trim();
                                if (line.contains("/")) {
                                    this.mOldFileMapping.put(strTrim2, strTrim);
                                } else {
                                    int iIndexOf = strTrim2.indexOf(".R.");
                                    if (iIndexOf == -1) {
                                        throw new IOException(String.format(new StringBuffer().append("the old mapping file packagename is malformed, ").append("it should be like com.tencent.mm.R.attr.test, yours %s\n").toString(), strTrim2));
                                    }
                                    String strSubstring = strTrim2.substring(0, iIndexOf);
                                    int iIndexOf2 = strTrim2.indexOf(".", iIndexOf + 3);
                                    String strSubstring2 = strTrim2.substring(iIndexOf + 3, iIndexOf2);
                                    String strSubstring3 = strTrim2.substring(iIndexOf2 + 1);
                                    String strSubstring4 = strTrim.substring(strTrim.indexOf(".", iIndexOf + 3) + 1);
                                    HashMap<String, HashMap<String, String>> map = this.mOldResMapping.containsKey(strSubstring) ? this.mOldResMapping.get(strSubstring) : new HashMap<>();
                                    HashMap<String, String> map2 = map.containsKey(strSubstring2) ? map.get(strSubstring2) : new HashMap<>();
                                    map2.put(strSubstring3, strSubstring4);
                                    map.put(strSubstring2, map2);
                                    this.mOldResMapping.put(strSubstring, map);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw new RuntimeException("Error while mapping file");
            }
        } catch (FileNotFoundException e4) {
            throw new IOException(String.format("Could not find old mapping file %s", this.mOldMappingFile.getAbsolutePath()));
        }
    }

    private void readCompressFromXml(Node node) throws IOException {
        NodeList childNodes = node.getChildNodes();
        if (childNodes.getLength() > 0) {
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    addToCompressPatterns(((Element) nodeItem).getAttribute(ATTR_VALUE));
                }
            }
        }
    }

    private void readOldMapping(String str) throws IOException {
        this.mOldMappingFile = new File(str);
        if (!this.mOldMappingFile.exists()) {
            throw new IOException(String.format("the old mapping file do not exit, raw path= %s\n", this.mOldMappingFile.getAbsolutePath()));
        }
        processOldMappingFile();
        System.out.printf("you are using the keepmapping mode to proguard resouces: old mapping path:%s\n", this.mOldMappingFile.getAbsolutePath());
    }

    private void readPropertyFromXml(Node node) throws IOException {
        NodeList childNodes = node.getChildNodes();
        if (childNodes.getLength() > 0) {
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    Element element = (Element) nodeItem;
                    String tagName = element.getTagName();
                    String attribute = element.getAttribute(ATTR_VALUE);
                    if (attribute.length() == 0) {
                        throw new IOException(String.format("Invalid config file: Missing required attribute %s\n", ATTR_VALUE));
                    }
                    if (tagName.equals(ATTR_7ZIP)) {
                        this.mUse7zip = attribute.equals("true");
                    } else if (tagName.equals(ATTR_KEEPROOT)) {
                        this.mKeepRoot = attribute.equals("true");
                        System.out.println(new StringBuffer().append("mKeepRoot ").append(this.mKeepRoot).toString());
                    } else if (tagName.equals(MERGE_DUPLICATED_RES)) {
                        this.mMergeDuplicatedRes = attribute.equals("true");
                        System.out.println(new StringBuffer().append("mMergeDuplicatedRes ").append(this.mMergeDuplicatedRes).toString());
                    } else if (tagName.equals(ATTR_SIGNFILE)) {
                        this.mMetaName = attribute.trim();
                    } else {
                        System.err.println(new StringBuffer().append("unknown tag ").append(tagName).toString());
                    }
                }
            }
        }
    }

    private void readSignFromXml(Node node) throws IOException {
        if (this.mSignatureFile != null) {
            System.err.println("already set the sign info from command line, ignore this");
            return;
        }
        NodeList childNodes = node.getChildNodes();
        if (childNodes.getLength() > 0) {
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    Element element = (Element) nodeItem;
                    String tagName = element.getTagName();
                    String attribute = element.getAttribute(ATTR_VALUE);
                    if (attribute.length() == 0) {
                        throw new IOException(String.format("Invalid config file: Missing required attribute %s\n", ATTR_VALUE));
                    }
                    if (tagName.equals("path")) {
                        this.mSignatureFile = new File(attribute);
                        if (!this.mSignatureFile.exists()) {
                            throw new IOException(String.format("the signature file do not exit, raw path= %s\n", this.mSignatureFile.getAbsolutePath()));
                        }
                    } else if (tagName.equals(ATTR_SIGNFILE_STOREPASS)) {
                        this.mStorePass = attribute;
                        this.mStorePass = this.mStorePass.trim();
                    } else if (tagName.equals(ATTR_SIGNFILE_KEYPASS)) {
                        this.mKeyPass = attribute;
                        this.mKeyPass = this.mKeyPass.trim();
                    } else if (tagName.equals(ATTR_SIGNFILE_ALIAS)) {
                        this.mStoreAlias = attribute;
                        this.mStoreAlias = this.mStoreAlias.trim();
                    } else {
                        System.err.println(new StringBuffer().append("unknown tag ").append(tagName).toString());
                    }
                }
            }
        }
    }

    private void readWhiteListFromXml(Node node) throws IOException {
        NodeList childNodes = node.getChildNodes();
        if (childNodes.getLength() > 0) {
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    addWhiteList(((Element) nodeItem).getAttribute(ATTR_VALUE));
                }
            }
        }
    }

    private void readXmlConfig(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        if (!file.exists()) {
            return;
        }
        System.out.printf("reading config file, %s\n", file.getAbsolutePath());
        BufferedInputStream bufferedInputStream2 = (BufferedInputStream) null;
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file));
            try {
                InputSource inputSource = new InputSource(bufferedInputStream3);
                documentBuilderFactoryNewInstance.setNamespaceAware(false);
                documentBuilderFactoryNewInstance.setValidating(false);
                NodeList elementsByTagName = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputSource).getElementsByTagName(TAG_ISSUE);
                int length = elementsByTagName.getLength();
                for (int i = 0; i < length; i++) {
                    Node nodeItem = elementsByTagName.item(i);
                    Element element = (Element) nodeItem;
                    String attribute = element.getAttribute("id");
                    String attribute2 = element.getAttribute(ATTR_ACTIVE);
                    if (attribute.length() == 0) {
                        System.err.println("Invalid config file: Missing required issue id attribute");
                    } else {
                        boolean z = attribute2 != null && attribute2.equals("true");
                        if (attribute.equals(PROPERTY_ISSUE)) {
                            readPropertyFromXml(nodeItem);
                        } else if (attribute.equals(WHITELIST_ISSUE)) {
                            this.mUseWhiteList = z;
                            if (this.mUseWhiteList) {
                                readWhiteListFromXml(nodeItem);
                            }
                        } else if (attribute.equals(COMPRESS_ISSUE)) {
                            this.mUseCompress = z;
                            if (this.mUseCompress) {
                                readCompressFromXml(nodeItem);
                            }
                        } else if (attribute.equals("sign")) {
                            this.mUseSignAPK = z | this.mUseSignAPK;
                            if (this.mUseSignAPK) {
                                readSignFromXml(nodeItem);
                            }
                        } else if (attribute.equals(MAPPING_ISSUE)) {
                            this.mUseKeepMapping = z;
                            if (this.mUseKeepMapping) {
                                loadMappingFilesFromXml(nodeItem);
                            }
                        } else {
                            System.err.println(new StringBuffer().append("unknown issue ").append(attribute).toString());
                        }
                    }
                }
                if (bufferedInputStream3 != null) {
                    try {
                        bufferedInputStream3.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream3;
                if (bufferedInputStream == null) {
                    throw th;
                }
                try {
                    bufferedInputStream.close();
                    throw th;
                } catch (IOException e2) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    private void setKeepMappingData(File file) throws IOException {
        if (this.mUseKeepMapping) {
            this.mOldMappingFile = file;
            if (!this.mOldMappingFile.exists()) {
                throw new IOException(String.format("the old mapping file do not exit, raw path= %s", this.mOldMappingFile.getAbsolutePath()));
            }
            processOldMappingFile();
        }
    }

    private void setSignData(File file, String str, String str2, String str3) throws IOException {
        this.mUseSignAPK = true;
        this.mSignatureFile = file;
        if (!this.mSignatureFile.exists()) {
            throw new IOException(String.format("the signature file do not exit, raw path= %s\n", this.mSignatureFile.getAbsolutePath()));
        }
        this.mKeyPass = str;
        this.mStoreAlias = str2;
        this.mStorePass = str3;
    }
}
