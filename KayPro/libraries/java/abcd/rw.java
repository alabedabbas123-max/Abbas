package abcd;

public class rw {
    private static void DW(java.lang.String r1, long r2) {
        VH().edit().putLong(r1, r2).commit();
    }

    private static void DW(java.lang.String r1, boolean r2) {
        VH().edit().putBoolean(r1, r2).commit();
    }

    public static boolean DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6("last_run_version", -1) == com.appfour.backbone.api.Api.getLastUpdateTime()) { $pc0 = 6; continue $sw0; }
                    DW("last_run_version", com.appfour.backbone.api.Api.getLastUpdateTime());
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(abcd.lw r2) {
        return j6("is_event_defined_" + r2.DW(), false);
    }

    public static java.io.File FH() {
        return abcd.uw.j6(abcd.wu.j6(), "probesdex_" + com.appfour.backbone.api.Api.getProcessName());
    }

    public static boolean Hw() {
        return j6("has_fetched_referrer", false);
    }

    private static android.content.SharedPreferences VH() {
        return abcd.wu.j6().getSharedPreferences("BACKBONE_" + com.appfour.backbone.api.Api.getProcessName(), 0);
    }

    public static void Zo() {
        DW("has_fetched_referrer", true);
    }

    private static long j6(java.lang.String r1, long r2) {
        return VH().getLong(r1, r2);
    }

    public static void j6(abcd.lw r2) {
        DW("is_event_defined_" + r2.DW(), true);
    }

    public static void j6(boolean r1) {
        DW("is_developer", r1);
    }

    public static boolean j6() {
        boolean r1 = false;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = j6("is_first_run", true);
                    if (r1 == false) { $pc1 = 5; continue $sw1; }
                    DW("is_first_run", false);
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.lang.String r1, boolean r2) {
        return VH().getBoolean(r1, r2);
    }

    public static boolean v5() {
        return j6("is_developer", false);
    }
}
