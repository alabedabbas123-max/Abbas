package abcd;

public final class Ox {
    private static final com.google.android.gms.common.api.a.g<com.google.android.gms.signin.internal.a> DW = null;
    public static final com.google.android.gms.common.api.a.AbstractC0058a<com.google.android.gms.signin.internal.a, abcd.Nx> FH = null;
    private static final com.google.android.gms.common.api.a.AbstractC0058a<com.google.android.gms.signin.internal.a, java.lang.Object> Hw = null;
    public static final com.google.android.gms.common.api.a<abcd.Nx> VH = null;
    private static final com.google.android.gms.common.api.Scope Zo = null;
    private static final com.google.android.gms.common.api.a<java.lang.Object> gn = null;
    private static final com.google.android.gms.common.api.a.g<com.google.android.gms.signin.internal.a> j6 = null;
    private static final com.google.android.gms.common.api.Scope v5 = null;

    static {
        j6 = new com.google.android.gms.common.api.a.g();
        DW = new com.google.android.gms.common.api.a.g();
        FH = new abcd.Px();
        Hw = new abcd.Qx();
        v5 = new com.google.android.gms.common.api.Scope("profile");
        Zo = new com.google.android.gms.common.api.Scope("email");
        VH = new com.google.android.gms.common.api.a("SignIn.API", FH, j6);
        gn = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", Hw, DW);
    }
}
