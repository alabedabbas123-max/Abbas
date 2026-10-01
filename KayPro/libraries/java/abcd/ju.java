package abcd;

public final class ju {
    public static java.lang.String j6(abcd.St r7, char[] r8) {
        int r1 = 0;
        char r2 = 0;
        int r4 = 0;
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r2 = (char) (r7.readByte() & 255);
                    if (r2 == 0) { $pc0 = 6; continue $sw0; }
                    r8[r1] = r2;
                    if (r2 < 128) { $pc0 = 9; continue $sw0; }
                    if ((r2 & 224) != 192) { $pc0 = 19; continue $sw0; }
                    r4 = r7.readByte() & 255;
                    if ((r4 & 192) != 128) { $pc0 = 17; continue $sw0; }
                    r3 = r1 + 1;
                    r8[r1] = (char) (((r2 & 31) << 6) | (r4 & 63));
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r1 = r3;
                    { $pc0 = 3; continue $sw0; }
                }
                case 17: {
                    throw new java.io.UTFDataFormatException("bad second byte");
                }
                case 19: {
                    if ((r2 & 240) != 224) { $pc0 = 28; continue $sw0; }
                    r5 = r7.readByte() & 255;
                    r6 = r7.readByte() & 255;
                    if ((r5 & 192) != 128) { $pc0 = 26; continue $sw0; }
                    if ((r6 & 192) != 128) { $pc0 = 26; continue $sw0; }
                    r3 = r1 + 1;
                    r8[r1] = (char) ((((r2 & 15) << 12) | ((r5 & 63) << 6)) | (r6 & 63));
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    throw new java.io.UTFDataFormatException("bad second or third byte");
                }
                case 28: {
                    throw new java.io.UTFDataFormatException("bad byte");
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 6: {
                    return new java.lang.String(r8, 0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
