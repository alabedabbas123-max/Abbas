package abcd;

class RunnableeQ implements java.lang.Runnable {
    final java.lang.String DW;
    final android.os.Bundle FH;
    final abcd.gQ Hw;
    final int j6;

    RunnableeQ(abcd.gQ r1, int r2, java.lang.String r3, android.os.Bundle r4) {
        this.Hw = r1;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
    }

    @Override
    public void run() {
        abcd.gQ.j6(this.Hw).j6(this.j6, this.DW, this.FH);
    }
}
