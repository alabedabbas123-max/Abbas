package abcd;

public class NE implements java.util.Comparator<abcd.ME> {
    public static final abcd.NE j6 = null;

    static {
        j6 = new abcd.NE();
    }

    public NE() {
    }

    public static int DW(abcd.ME r0, abcd.ME r1) {
        return r0.getName().compareTo(r1.getName());
    }

    public static int j6(abcd.ME r0, java.lang.String r1) {
        return r0.getName().compareTo(r1);
    }

    public static java.util.Collection<abcd.ME> j6(java.util.Collection<abcd.ME> r1) {
        java.util.ArrayList r0 = new java.util.ArrayList(r1);
        java.util.Collections.sort(r0, j6);
        return r0;
    }

    @Override
    public int compare(abcd.ME r1, abcd.ME r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.ME r1, abcd.ME r2) {
        return DW(r1, r2);
    }
}
