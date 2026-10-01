package abcd;

public final class Ln {
    public static int DW;
    public static int FH;
    public static int Hw;
    public static int VH;
    public static int Zo;
    public static int j6;
    public static int v5;

    public static void j6(int r1) {
        VH += r1;
    }

    public static void j6(abcd.Un r3, abcd.Un r4) {
        v5 += r4.Hw().rN() - r3.Hw().rN();
        Hw += r4.Hw().yS() - r3.Hw().yS();
        Zo += r4.Hw().rN();
    }

    public static void j6(abcd.fs r3, abcd.fs r4) {
        int r0 = r3.j6().er();
        int r5 = r3.j6().BT();
        int r1 = r4.j6().er();
        DW += r1 - r0;
        j6 += r4.j6().BT() - r5;
        FH += r1;
    }
}
