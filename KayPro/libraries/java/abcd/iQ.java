package abcd;

public class iQ {
    private static abcd.iQ j6;

    static {
        j6 = new abcd.iQ();
    }

    public iQ() {
    }

    public static abcd.iQ j6() {
        return j6;
    }
}
