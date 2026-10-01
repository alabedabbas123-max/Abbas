package abcd;

public class KA extends java.io.OutputStream {
    java.util.zip.CRC32 DW;
    int FH;
    java.io.OutputStream Hw;
    int j6;
    java.io.OutputStream v5;

    public KA(int r4, java.io.OutputStream r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = 0;
                    this.DW = new java.util.zip.CRC32();
                    this.FH = 0;
                    this.Hw = r5;
                    if (r4 == 0) { $pc0 = 5; continue $sw0; }
                    this.v5 = new java.util.zip.DeflaterOutputStream(r5, new java.util.zip.Deflater(9, true));
                    return;
                }
                case 5: {
                    this.v5 = r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.j6;
    }

    public java.io.OutputStream FH() {
        return this.Hw;
    }

    @Override
    public void close() {
        this.v5.flush();
        this.v5.close();
        this.FH = (int) this.DW.getValue();
    }

    @Override
    public void flush() {
        this.v5.flush();
    }

    public int j6() {
        return this.FH;
    }

    @Override
    public void write(int r2) {
        this.v5.write(r2);
        this.DW.update(r2);
        this.j6++;
    }

    @Override
    public void write(byte[] r2) {
        this.v5.write(r2);
        this.DW.update(r2);
        this.j6 += r2.length;
    }

    @Override
    public void write(byte[] r2, int r3, int r4) {
        this.v5.write(r2, r3, r4);
        this.DW.update(r2, r3, r4);
        this.j6 += r4;
    }
}
