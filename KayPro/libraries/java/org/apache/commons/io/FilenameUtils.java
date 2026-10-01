package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class FilenameUtils {
    private static final int NOT_FOUND = -1;
    private static final char OTHER_SEPARATOR;
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';
    public static final char EXTENSION_SEPARATOR = '.';
    public static final String EXTENSION_SEPARATOR_STR = Character.toString(EXTENSION_SEPARATOR);
    private static final char SYSTEM_SEPARATOR = File.separatorChar;

    static {
        if (isSystemWindows()) {
            OTHER_SEPARATOR = (char) 47;
        } else {
            OTHER_SEPARATOR = (char) 92;
        }
    }

    public static String concat(String str, String str2) {
        int prefixLength = getPrefixLength(str2);
        if (prefixLength < 0) {
            return null;
        }
        if (prefixLength > 0) {
            return normalize(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return normalize(str2);
        }
        return isSeparator(str.charAt(length + (-1))) ? normalize(str + str2) : normalize(str + '/' + str2);
    }

    public static boolean directoryContains(String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (str2 == null || IOCase.SYSTEM.checkEquals(str, str2)) {
            return false;
        }
        return IOCase.SYSTEM.checkStartsWith(str2, str);
    }

    private static String doGetFullPath(String str, boolean z) {
        int prefixLength;
        if (str != null && (prefixLength = getPrefixLength(str)) >= 0) {
            if (prefixLength >= str.length()) {
                return z ? getPrefix(str) : str;
            }
            int iIndexOfLastSeparator = indexOfLastSeparator(str);
            if (iIndexOfLastSeparator < 0) {
                return str.substring(0, prefixLength);
            }
            int i = (z ? 1 : 0) + iIndexOfLastSeparator;
            if (i == 0) {
                i++;
            }
            return str.substring(0, i);
        }
        return null;
    }

    private static String doGetPath(String str, int i) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        int iIndexOfLastSeparator = indexOfLastSeparator(str);
        int i2 = iIndexOfLastSeparator + i;
        if (prefixLength >= str.length() || iIndexOfLastSeparator < 0 || prefixLength >= i2) {
            return "";
        }
        String strSubstring = str.substring(prefixLength, i2);
        failIfNullBytePresent(strSubstring);
        return strSubstring;
    }

    private static String doNormalize(String str, char c, boolean z) {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        if (str == null) {
            return null;
        }
        failIfNullBytePresent(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int prefixLength = getPrefixLength(str);
        if (prefixLength < 0) {
            return null;
        }
        char[] cArr = new char[length + 2];
        str.getChars(0, str.length(), cArr, 0);
        char c2 = c == SYSTEM_SEPARATOR ? OTHER_SEPARATOR : SYSTEM_SEPARATOR;
        for (int i3 = 0; i3 < cArr.length; i3++) {
            if (cArr[i3] == c2) {
                cArr[i3] = c;
            }
        }
        if (cArr[length - 1] != c) {
            i = length + 1;
            cArr[length] = c;
            z2 = false;
        } else {
            i = length;
            z2 = true;
        }
        int i4 = prefixLength + 1;
        while (i4 < i) {
            if (cArr[i4] == c && cArr[i4 - 1] == c) {
                System.arraycopy(cArr, i4, cArr, i4 - 1, i - i4);
                i--;
                i4--;
            }
            i4++;
        }
        int i5 = prefixLength + 1;
        int i6 = i;
        while (i5 < i6) {
            if (cArr[i5] == c && cArr[i5 - 1] == '.' && (i5 == prefixLength + 1 || cArr[i5 - 2] == c)) {
                z3 = i5 == i6 + (-1) ? true : z2;
                System.arraycopy(cArr, i5 + 1, cArr, i5 - 1, i6 - i5);
                i5--;
                i6 -= 2;
            } else {
                z3 = z2;
            }
            i5++;
            z2 = z3;
        }
        int i7 = prefixLength + 2;
        boolean z4 = z2;
        while (i7 < i6) {
            if (cArr[i7] != c || cArr[i7 - 1] != '.' || cArr[i7 - 2] != '.' || (i7 != prefixLength + 2 && cArr[i7 - 3] != c)) {
                i2 = i7;
            } else {
                if (i7 == prefixLength + 2) {
                    return null;
                }
                if (i7 == i6 - 1) {
                    z4 = true;
                }
                int i8 = i7 - 4;
                while (true) {
                    if (i8 < prefixLength) {
                        System.arraycopy(cArr, i7 + 1, cArr, prefixLength, i6 - i7);
                        i6 -= (i7 + 1) - prefixLength;
                        i2 = prefixLength + 1;
                        break;
                    }
                    if (cArr[i8] == c) {
                        System.arraycopy(cArr, i7 + 1, cArr, i8 + 1, i6 - i7);
                        i6 -= i7 - i8;
                        i2 = i8 + 1;
                        break;
                    }
                    i8--;
                }
            }
            i7 = i2 + 1;
        }
        if (i6 <= 0) {
            return "";
        }
        if (i6 <= prefixLength) {
            return new String(cArr, 0, i6);
        }
        return (z4 && z) ? new String(cArr, 0, i6) : new String(cArr, 0, i6 - 1);
    }

    public static boolean equals(String str, String str2) {
        return equals(str, str2, false, IOCase.SENSITIVE);
    }

    public static boolean equals(String str, String str2, boolean z, IOCase iOCase) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z) {
            str = normalize(str);
            str2 = normalize(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (iOCase == null) {
            iOCase = IOCase.SENSITIVE;
        }
        return iOCase.checkEquals(str, str2);
    }

    public static boolean equalsNormalized(String str, String str2) {
        return equals(str, str2, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
        return equals(str, str2, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String str, String str2) {
        return equals(str, str2, false, IOCase.SYSTEM);
    }

    private static void failIfNullBytePresent(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 0) {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    public static String getBaseName(String str) {
        return removeExtension(getName(str));
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOfExtension = indexOfExtension(str);
        return iIndexOfExtension == -1 ? "" : str.substring(iIndexOfExtension + 1);
    }

    public static String getFullPath(String str) {
        return doGetFullPath(str, true);
    }

    public static String getFullPathNoEndSeparator(String str) {
        return doGetFullPath(str, false);
    }

    public static String getName(String str) {
        if (str == null) {
            return null;
        }
        failIfNullBytePresent(str);
        return str.substring(indexOfLastSeparator(str) + 1);
    }

    public static String getPath(String str) {
        return doGetPath(str, 1);
    }

    public static String getPathNoEndSeparator(String str) {
        return doGetPath(str, 0);
    }

    public static String getPrefix(String str) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength > str.length()) {
            failIfNullBytePresent(str + '/');
            return str + '/';
        }
        String strSubstring = str.substring(0, prefixLength);
        failIfNullBytePresent(strSubstring);
        return strSubstring;
    }

    public static int getPrefixLength(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (cCharAt == '~') {
                return 2;
            }
            if (!isSeparator(cCharAt)) {
                return 0;
            }
        } else {
            if (cCharAt == '~') {
                int iIndexOf = str.indexOf(47, 1);
                int iIndexOf2 = str.indexOf(92, 1);
                if (iIndexOf == -1 && iIndexOf2 == -1) {
                    return length + 1;
                }
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                }
                return Math.min(iIndexOf, iIndexOf2 == -1 ? iIndexOf : iIndexOf2) + 1;
            }
            char cCharAt2 = str.charAt(1);
            if (cCharAt2 == ':') {
                char upperCase = Character.toUpperCase(cCharAt);
                if (upperCase >= 'A' && upperCase <= 'Z') {
                    return (length == 2 || !isSeparator(str.charAt(2))) ? 2 : 3;
                }
                if (upperCase != '/') {
                    return -1;
                }
            } else {
                if (isSeparator(cCharAt) && isSeparator(cCharAt2)) {
                    int iIndexOf3 = str.indexOf(47, 2);
                    int iIndexOf4 = str.indexOf(92, 2);
                    if ((iIndexOf3 == -1 && iIndexOf4 == -1) || iIndexOf3 == 2 || iIndexOf4 == 2) {
                        return -1;
                    }
                    if (iIndexOf3 == -1) {
                        iIndexOf3 = iIndexOf4;
                    }
                    return Math.min(iIndexOf3, iIndexOf4 == -1 ? iIndexOf3 : iIndexOf4) + 1;
                }
                if (!isSeparator(cCharAt)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int indexOfExtension(String str) {
        int iLastIndexOf;
        if (str != null && indexOfLastSeparator(str) <= (iLastIndexOf = str.lastIndexOf(46))) {
            return iLastIndexOf;
        }
        return -1;
    }

    public static int indexOfLastSeparator(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean isExtension(String str, String str2) {
        if (str == null) {
            return false;
        }
        failIfNullBytePresent(str);
        if (str2 == null || str2.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        return getExtension(str).equals(str2);
    }

    public static boolean isExtension(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        failIfNullBytePresent(str);
        if (collection == null || collection.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (extension.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExtension(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        failIfNullBytePresent(str);
        if (strArr == null || strArr.length == 0) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        for (String str2 : strArr) {
            if (extension.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSeparator(char c) {
        return c == '/' || c == '\\';
    }

    static boolean isSystemWindows() {
        return SYSTEM_SEPARATOR == '\\';
    }

    public static String normalize(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, true);
    }

    public static String normalize(String str, boolean z) {
        return doNormalize(str, z ? '/' : '\\', true);
    }

    public static String normalizeNoEndSeparator(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, false);
    }

    public static String normalizeNoEndSeparator(String str, boolean z) {
        return doNormalize(str, z ? '/' : '\\', false);
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        failIfNullBytePresent(str);
        int iIndexOfExtension = indexOfExtension(str);
        return iIndexOfExtension != -1 ? str.substring(0, iIndexOfExtension) : str;
    }

    public static String separatorsToSystem(String str) {
        if (str == null) {
            return null;
        }
        return isSystemWindows() ? separatorsToWindows(str) : separatorsToUnix(str);
    }

    public static String separatorsToUnix(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String separatorsToWindows(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    static String[] splitOnTokens(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        char c = 0;
        int i = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 == '?' || c2 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c2 == '?') {
                    arrayList.add("?");
                } else if (c != '*') {
                    arrayList.add("*");
                }
            } else {
                sb.append(c2);
            }
            i++;
            c = c2;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean wildcardMatch(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SENSITIVE);
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (iOCase == null) {
            iOCase = IOCase.SENSITIVE;
        }
        String[] strArrSplitOnTokens = splitOnTokens(str2);
        Stack stack = new Stack();
        boolean z = false;
        int length = 0;
        int i = 0;
        do {
            if (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                i = iArr[0];
                length = iArr[1];
                z = true;
            }
            while (i < strArrSplitOnTokens.length) {
                if (strArrSplitOnTokens[i].equals("?")) {
                    length++;
                    if (length > str.length()) {
                        break;
                    }
                    z = false;
                    i++;
                } else {
                    if (strArrSplitOnTokens[i].equals("*")) {
                        if (i == strArrSplitOnTokens.length - 1) {
                            length = str.length();
                            z = true;
                        } else {
                            z = true;
                        }
                    } else if (z) {
                        length = iOCase.checkIndexOf(str, length, strArrSplitOnTokens[i]);
                        if (length == -1) {
                            break;
                        }
                        int iCheckIndexOf = iOCase.checkIndexOf(str, length + 1, strArrSplitOnTokens[i]);
                        if (iCheckIndexOf >= 0) {
                            stack.push(new int[]{i, iCheckIndexOf});
                        }
                        length += strArrSplitOnTokens[i].length();
                        z = false;
                    } else {
                        if (!iOCase.checkRegionMatches(str, length, strArrSplitOnTokens[i])) {
                            break;
                        }
                        length += strArrSplitOnTokens[i].length();
                        z = false;
                    }
                    i++;
                }
            }
            if (i == strArrSplitOnTokens.length && length == str.length()) {
                return true;
            }
        } while (stack.size() > 0);
        return false;
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SYSTEM);
    }
}
