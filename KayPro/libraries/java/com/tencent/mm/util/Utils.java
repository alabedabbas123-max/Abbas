package com.tencent.mm.util;

import com.tencent.mm.androlib.res.util.StringUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Utils {

    static class SearchTracker {
        final String text;
        final Map<String, String> patternToReplacement = new HashMap();
        final Set<String> pendingPatterns = new HashSet();
        MatchInfo matchInfo = (MatchInfo) null;

        private static class MatchInfo {
            final String pattern;
            final String replacement;
            final int textIndex;

            MatchInfo(String str, String str2, int i) {
                this.pattern = str;
                this.replacement = str2;
                this.textIndex = i;
            }
        }

        SearchTracker(String str, String[] strArr, String[] strArr2) {
            this.text = str;
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                this.patternToReplacement.put(str2, strArr2[i]);
                this.pendingPatterns.add(str2);
            }
        }

        boolean hasNextMatch(int i) {
            String str = (String) null;
            int i2 = -1;
            for (String str2 : new ArrayList(this.pendingPatterns)) {
                int iIndexOf = this.text.indexOf(str2, i);
                if (iIndexOf == -1) {
                    this.pendingPatterns.remove(str2);
                } else if (i2 == -1 || iIndexOf < i2) {
                    str = str2;
                    i2 = iIndexOf;
                }
            }
            if (str == null) {
                return false;
            }
            this.matchInfo = new MatchInfo(str, this.patternToReplacement.get(str), i2);
            return true;
        }
    }

    public static void cleanDir(File file) {
        if (file.exists()) {
            FileOperation.deleteDir(file);
            file.mkdirs();
        }
    }

    public static String convertToPatternString(String str) {
        return replaceEach(str, new String[]{".", "?", "*", "+"}, new String[]{"\\.", ".?", ".*", ".+"});
    }

    public static boolean isBlank(String str) {
        return !isPresent(str);
    }

    public static boolean isBlank(Iterator it) {
        return !isPresent(it);
    }

    public static boolean isPresent(String str) {
        return str != null && str.length() > 0;
    }

    public static boolean isPresent(Iterator it) {
        return it != null && it.hasNext();
    }

    public static boolean match(String str, HashSet<Pattern> hashSet) {
        if (hashSet == null) {
            return false;
        }
        Iterator<Pattern> it = hashSet.iterator();
        while (it.hasNext()) {
            if (new Boolean(it.next().matcher(str).matches()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static void processOutputStreamInThread(Process process) throws IOException {
        while (new LineNumberReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
        }
    }

    private static String replaceEach(String str, String[] strArr, String[] strArr2) {
        int length = 0;
        SearchTracker searchTracker = new SearchTracker(str, strArr, strArr2);
        if (!searchTracker.hasNextMatch(0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * 2);
        do {
            SearchTracker.MatchInfo matchInfo = searchTracker.matchInfo;
            int i = matchInfo.textIndex;
            String str2 = matchInfo.pattern;
            String str3 = matchInfo.replacement;
            sb.append(str.substring(length, i));
            sb.append(str3);
            length = str2.length() + i;
        } while (searchTracker.hasNextMatch(length));
        return sb.append(str.substring(length)).toString();
    }

    public static String runCmd(String... strArr) throws Throwable {
        Process processStart;
        Process process = (Process) null;
        try {
            processStart = new ProcessBuilder(strArr).start();
            try {
                String inputStream = StringUtil.readInputStream(processStart.getInputStream());
                processStart.waitFor();
                if (processStart.exitValue() != 0) {
                    System.err.println(String.format("%s Failed! Please check your signature file.\n", strArr[0]));
                    throw new RuntimeException(StringUtil.readInputStream(processStart.getErrorStream()));
                }
                if (processStart != null) {
                    processStart.destroy();
                }
                return inputStream;
            } catch (Throwable th) {
                th = th;
                if (processStart == null) {
                    throw th;
                }
                processStart.destroy();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            processStart = process;
        }
    }

    public static String runExec(String[] strArr) throws Throwable {
        Process processExec;
        Process process = (Process) null;
        try {
            processExec = Runtime.getRuntime().exec(strArr);
            try {
                String inputStream = StringUtil.readInputStream(processExec.getInputStream());
                processExec.waitFor();
                if (processExec.exitValue() != 0) {
                    System.err.println(String.format("%s Failed! Please check your signature file.\n", strArr[0]));
                    throw new RuntimeException(StringUtil.readInputStream(processExec.getErrorStream()));
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return inputStream;
            } catch (Throwable th) {
                th = th;
                if (processExec == null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            processExec = process;
        }
    }
}
