package sun.misc;

import java.text.MessageFormat;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.jar.Attributes;

public class ExtensionInfo {
    public static final int COMPATIBLE = 0;
    public static final int INCOMPATIBLE = 4;
    public static final int REQUIRE_IMPLEMENTATION_UPGRADE = 2;
    public static final int REQUIRE_SPECIFICATION_UPGRADE = 1;
    public static final int REQUIRE_VENDOR_SWITCH = 3;

    private static final ResourceBundle f587rb = ResourceBundle.getBundle("sun.misc.resources.Messages");
    public String implementationVersion;
    public String name;
    public String specVendor;
    public String specVersion;
    public String title;

    public String f588url;
    public String vendor;
    public String vendorId;

    public ExtensionInfo() {
    }

    public ExtensionInfo(String extensionKey, Attributes attr) throws NullPointerException {
        String s;
        if (extensionKey != null) {
            s = extensionKey + "-";
        } else {
            s = "";
        }
        String attrKey = s + Attributes.Name.EXTENSION_NAME.toString();
        String value = attr.getValue(attrKey);
        this.name = value;
        if (value != null) {
            this.name = value.trim();
        }
        String attrKey2 = s + Attributes.Name.SPECIFICATION_TITLE.toString();
        String value2 = attr.getValue(attrKey2);
        this.title = value2;
        if (value2 != null) {
            this.title = value2.trim();
        }
        String attrKey3 = s + Attributes.Name.SPECIFICATION_VERSION.toString();
        String value3 = attr.getValue(attrKey3);
        this.specVersion = value3;
        if (value3 != null) {
            this.specVersion = value3.trim();
        }
        String attrKey4 = s + Attributes.Name.SPECIFICATION_VENDOR.toString();
        String value4 = attr.getValue(attrKey4);
        this.specVendor = value4;
        if (value4 != null) {
            this.specVendor = value4.trim();
        }
        String attrKey5 = s + Attributes.Name.IMPLEMENTATION_VERSION.toString();
        String value5 = attr.getValue(attrKey5);
        this.implementationVersion = value5;
        if (value5 != null) {
            this.implementationVersion = value5.trim();
        }
        String attrKey6 = s + Attributes.Name.IMPLEMENTATION_VENDOR.toString();
        String value6 = attr.getValue(attrKey6);
        this.vendor = value6;
        if (value6 != null) {
            this.vendor = value6.trim();
        }
        String attrKey7 = s + Attributes.Name.IMPLEMENTATION_VENDOR_ID.toString();
        String value7 = attr.getValue(attrKey7);
        this.vendorId = value7;
        if (value7 != null) {
            this.vendorId = value7.trim();
        }
        String attrKey8 = s + Attributes.Name.IMPLEMENTATION_URL.toString();
        String value8 = attr.getValue(attrKey8);
        this.f588url = value8;
        if (value8 != null) {
            this.f588url = value8.trim();
        }
    }

    public int isCompatibleWith(ExtensionInfo ei) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = this.name;
        if (str6 == null || (str = ei.name) == null || str6.compareTo(str) != 0) {
            return 4;
        }
        String str7 = this.specVersion;
        if (str7 == null || (str2 = ei.specVersion) == null) {
            return 0;
        }
        int version = compareExtensionVersion(str7, str2);
        if (version < 0) {
            String str8 = this.vendorId;
            if (str8 != null && (str5 = ei.vendorId) != null && str8.compareTo(str5) != 0) {
                return 3;
            }
            return 1;
        }
        String str9 = this.vendorId;
        if (str9 != null && (str3 = ei.vendorId) != null) {
            if (str9.compareTo(str3) != 0) {
                return 3;
            }
            String str10 = this.implementationVersion;
            if (str10 != null && (str4 = ei.implementationVersion) != null) {
                int version2 = compareExtensionVersion(str10, str4);
                if (version2 < 0) {
                    return 2;
                }
            }
        }
        return 0;
    }

    public String toString() {
        return "Extension : title(" + this.title + "), name(" + this.name + "), spec vendor(" + this.specVendor + "), spec version(" + this.specVersion + "), impl vendor(" + this.vendor + "), impl vendor id(" + this.vendorId + "), impl version(" + this.implementationVersion + "), impl url(" + this.f588url + ")";
    }

    private int compareExtensionVersion(String source, String target) throws NumberFormatException {
        return strictCompareExtensionVersion(source.toLowerCase(), target.toLowerCase());
    }

    private int strictCompareExtensionVersion(String source, String target) throws NumberFormatException {
        if (source.equals(target)) {
            return 0;
        }
        StringTokenizer stk = new StringTokenizer(source, ".,");
        StringTokenizer ttk = new StringTokenizer(target, ".,");
        int n = 0;
        if (stk.hasMoreTokens()) {
            n = convertToken(stk.nextToken().toString());
        }
        int m = ttk.hasMoreTokens() ? convertToken(ttk.nextToken().toString()) : 0;
        if (n > m) {
            return 1;
        }
        if (m > n) {
            return -1;
        }
        int sIdx = source.indexOf(".");
        int tIdx = target.indexOf(".");
        if (sIdx == -1) {
            sIdx = source.length() - 1;
        }
        if (tIdx == -1) {
            tIdx = target.length() - 1;
        }
        return strictCompareExtensionVersion(source.substring(sIdx + 1), target.substring(tIdx + 1));
    }

    private int convertToken(String token) {
        int patchVersion;
        String msVersion;
        if (token != null && !token.equals("")) {
            int charVersion = 0;
            int strLength = token.length();
            Object[] args = {this.name};
            MessageFormat mf = new MessageFormat(f587rb.getString("optpkg.versionerror"));
            String versionError = mf.format(args);
            int prIndex = token.indexOf("-");
            int patchIndex = token.indexOf("_");
            if (prIndex == -1 && patchIndex == -1) {
                try {
                    return Integer.parseInt(token) * 100;
                } catch (NumberFormatException e) {
                    System.out.println(versionError);
                    return 0;
                }
            }
            if (patchIndex != -1) {
                try {
                    int prversion = Integer.parseInt(token.substring(0, patchIndex));
                    char lastChar = token.charAt(strLength - 1);
                    if (!Character.isLetter(lastChar)) {
                        patchVersion = Integer.parseInt(token.substring(patchIndex + 1, strLength));
                    } else {
                        int charValue = Character.getNumericValue(lastChar);
                        int endIndex = strLength - 1;
                        patchVersion = Integer.parseInt(token.substring(patchIndex + 1, endIndex));
                        if (charValue >= Character.getNumericValue('a') && charValue <= Character.getNumericValue('z')) {
                            charVersion = (patchVersion * 100) + charValue;
                        } else {
                            charVersion = 0;
                            System.out.println(versionError);
                        }
                    }
                    return (prversion * 100) + patchVersion + charVersion;
                } catch (NumberFormatException e2) {
                    System.out.println(versionError);
                    return 0;
                }
            }
            try {
                int mrversion = Integer.parseInt(token.substring(0, prIndex));
                String prString = token.substring(prIndex + 1);
                int delta = 0;
                if (prString.indexOf("ea") != -1) {
                    String msVersion2 = prString.substring(2);
                    delta = 50;
                    msVersion = msVersion2;
                } else if (prString.indexOf("alpha") != -1) {
                    String msVersion3 = prString.substring(5);
                    delta = 40;
                    msVersion = msVersion3;
                } else if (prString.indexOf("beta") != -1) {
                    String msVersion4 = prString.substring(4);
                    delta = 30;
                    msVersion = msVersion4;
                } else if (prString.indexOf("rc") == -1) {
                    msVersion = "";
                } else {
                    String msVersion5 = prString.substring(2);
                    delta = 20;
                    msVersion = msVersion5;
                }
                if (msVersion == null || msVersion.equals("")) {
                    return (mrversion * 100) - delta;
                }
                try {
                    return ((mrversion * 100) - delta) + Integer.parseInt(msVersion);
                } catch (NumberFormatException e3) {
                    System.out.println(versionError);
                    return 0;
                }
            } catch (NumberFormatException e4) {
                System.out.println(versionError);
                return 0;
            }
        }
        return 0;
    }
}
