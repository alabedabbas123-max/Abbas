package a.j;

public class ClassL {

    private static final StringBuilder f1334a = new StringBuilder();

    public static void m3160a() {
        StringBuilder sb = f1334a;
        synchronized (sb) {
            sb.append('\n');
        }
    }

    public static void m3161a(String str) {
        StringBuilder sb = f1334a;
        synchronized (sb) {
            sb.append(str);
            sb.append('\n');
        }
    }

    public static void m3162b() {
        StringBuilder sb = f1334a;
        synchronized (sb) {
            sb.setLength(0);
        }
    }

    public static String m3163c() {
        String string;
        StringBuilder sb = f1334a;
        synchronized (sb) {
            string = sb.toString();
        }
        return string;
    }
}
