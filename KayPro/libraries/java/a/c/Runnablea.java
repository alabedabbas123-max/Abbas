package a.c;

import com.baidu.mobstat.Config;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.commons.io.IOUtils;
import a.j.ClassL;

public class Runnablea implements Runnable {

    private static final Set f440a = new HashSet();

    private static final Map f441b = new HashMap();

    private static final Set f442c = new HashSet();

    private static final Map f443d = new HashMap();

    private static final Set f444e = new HashSet();

    private static final Map f445f = new HashMap();

    private static final Set f446g = new HashSet();

    private static Map f447h;

    private static Set f448i;

    private static Set f449j;

    private static Method f450k;

    static {
        try {
            f450k = Class.forName("android.util.Log").getMethod(Config.DEVICE_WIDTH, String.class, String.class);
        } catch (Exception e) {
        }
    }

    private static String m1276a(ClassB c0168b) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : c0168b.f452b) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(m1282b(str));
        }
        return sb.toString();
    }

    private static String m1277a(String str) {
        return "-keep class " + str;
    }

    private static String m1278a(String str, ClassB c0168b) {
        return "-keepclassmembers class " + m1282b(str) + " {\n    public <init>(" + m1276a(c0168b) + ");\n}";
    }

    private static String m1279a(String str, String str2) {
        return "-keepclassmembers class " + m1282b(str) + " {\n    *** " + str2 + ";\n}";
    }

    private static String m1280a(String str, String str2, ClassB c0168b) {
        return "-keepclassmembers class " + m1282b(str) + " {\n    *** " + str2 + "(" + m1276a(c0168b) + ");\n}";
    }

    private static void m1281a() {
        m1284c("The following settings may help solving issues related to\nmissing classes, methods and/or fields:\n");
        Iterator it = f440a.iterator();
        while (it.hasNext()) {
            m1284c(m1277a((String) it.next()) + IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (String str : f441b.keySet()) {
            Iterator it2 = ((Set) f441b.get(str)).iterator();
            while (it2.hasNext()) {
                m1284c(m1278a(str, (ClassB) it2.next()) + IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        for (String str2 : f443d.keySet()) {
            for (ClassB c0168b : (Set) f443d.get(str2)) {
                m1284c(m1280a(str2, c0168b.f451a, c0168b) + IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        for (String str3 : f445f.keySet()) {
            Iterator it3 = ((Set) f445f.get(str3)).iterator();
            while (it3.hasNext()) {
                m1284c(m1279a(str3, (String) it3.next()) + IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
    }

    private static String m1282b(String str) {
        m1283b();
        String str2 = (String) f447h.get(str);
        return str2 != null ? str2 : str;
    }

    private static void m1283b() {
        if (f447h != null) {
            return;
        }
        f447h = new HashMap();
        f448i = new HashSet();
        f449j = new HashSet();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runnablea.class.getClassLoader().getResourceAsStream("classmap.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
                String strNextToken = stringTokenizer.nextToken();
                String strNextToken2 = stringTokenizer.nextToken();
                boolean zEquals = stringTokenizer.nextToken().equals("1");
                boolean zEquals2 = stringTokenizer.nextToken().equals("1");
                f447h.put(strNextToken2, strNextToken);
                if (zEquals) {
                    f448i.add(strNextToken2);
                }
                if (zEquals2) {
                    f449j.add(strNextToken2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m1284c(String str) {
        if (f450k == null) {
            ClassL.m3161a(str);
            return;
        }
        try {
            f450k.invoke(null, "ProGuard", str);
        } catch (Exception e) {
            ClassL.m3161a(str);
        }
    }

    @Override
    public void run() {
        m1281a();
    }
}
