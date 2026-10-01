package abcd;

public class ZM extends abcd.AbstractyL implements abcd.InterfacepL {
    abcd.EL j6;

    public ZM(java.util.Date r6) {
        java.util.SimpleTimeZone r0 = null;
        java.text.SimpleDateFormat r3 = null;
        java.lang.String r7 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.SimpleTimeZone(0, "Z");
                    r3 = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
                    r3.setTimeZone(r0);
                    r7 = java.lang.String.valueOf(r3.format(r6)) + "Z";
                    r1 = java.lang.Integer.parseInt(r7.substring(0, 4));
                    if (r1 >= 1950) { $pc0 = 5; continue $sw0; }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.j6 = new abcd.jM(r7);
                    return;
                }
                case 5: {
                    if (r1 > 2049) { $pc0 = 8; continue $sw0; }
                    this.j6 = new abcd.zM(r7.substring(2));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }
}
