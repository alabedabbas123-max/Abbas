package a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FilenameUtils;
import a.j.ClassL;

public class ClassS {
    private static String m3261a(String str, char c) {
        int iLastIndexOf = str.lastIndexOf(c);
        return iLastIndexOf < 0 ? "" : str.substring(0, iLastIndexOf);
    }

    private static String m3262a(Set set) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!m3266a(set, str)) {
                stringBuffer.append(str).append(", ");
            }
        }
        return stringBuffer.toString();
    }

    private static Set m3263a(LineNumberReader lineNumberReader) {
        HashSet hashSet = new HashSet();
        while (true) {
            try {
                String line = lineNumberReader.readLine();
                if (line == null) {
                    break;
                }
                String strTrim = line.trim();
                if (strTrim.startsWith("at ")) {
                    String strM3261a = m3261a(m3261a(m3261a(strTrim.substring(2).trim(), '('), FilenameUtils.EXTENSION_SEPARATOR), FilenameUtils.EXTENSION_SEPARATOR);
                    if (strM3261a.length() > 0 && !m3265a(strM3261a)) {
                        hashSet.add(strM3261a);
                    }
                }
            } catch (IOException e) {
            }
        }
        return hashSet;
    }

    public static void m3264a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        Set setM3263a = m3263a(new LineNumberReader(new InputStreamReader(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()))));
        if (setM3263a.size() > 0) {
            String strM3262a = m3262a(setM3263a);
            ClassL.m3161a("ProGuard is released under the GNU General Public License. You therefore");
            ClassL.m3161a("must ensure that programs that link to it (" + strM3262a + "...)");
            ClassL.m3161a("carry the GNU General Public License as well. Alternatively, you can");
            ClassL.m3161a("apply for an exception with the author of ProGuard.");
        }
    }

    private static boolean m3265a(String str) {
        return str.startsWith("java") || str.startsWith("sun.reflect") || str.startsWith("proguard") || str.startsWith("org.apache.tools.ant") || str.startsWith("org.apache.tools.maven") || str.startsWith("org.gradle") || str.startsWith("org.codehaus.groovy") || str.startsWith("org.eclipse") || str.startsWith("org.netbeans") || str.startsWith("com.android") || str.startsWith("com.sun.kvem") || str.startsWith("net.certiv.proguarddt") || str.startsWith("groovy") || str.startsWith("scala") || str.startsWith("sbt") || str.startsWith("xsbt") || str.startsWith("eclipseme");
    }

    private static boolean m3266a(Set set, String str) {
        int iIndexOf = 0;
        while (!set.contains(str.substring(0, iIndexOf))) {
            iIndexOf = str.indexOf(46, iIndexOf + 1);
            if (iIndexOf < 0) {
                return false;
            }
        }
        return true;
    }
}
