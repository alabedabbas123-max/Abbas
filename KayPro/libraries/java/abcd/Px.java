package abcd;

final class Px extends com.google.android.gms.common.api.a.AbstractC0058a<com.google.android.gms.signin.internal.a, abcd.Nx> {
    Px() {
    }

    @Override
    public final com.google.android.gms.common.api.a.f j6(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.C2021d r11, abcd.Nx r12, com.google.android.gms.common.api.f r13, com.google.android.gms.common.api.g r14) {
        abcd.Nx r15 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r15 = r12;
                    if (r15 != null) { $pc0 = 6; continue $sw0; }
                    r15 = abcd.Nx.j6;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return new com.google.android.gms.signin.internal.a(r9, r10, true, r11, r15, r13, r14);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
