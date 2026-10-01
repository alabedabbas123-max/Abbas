package abcd;

class Bu implements abcd.Interfacejv {
    final abcd.Iu DW;
    final com.appfour.backbone.api.closures.OnCrashClosure j6;

    Bu(abcd.Iu r1, com.appfour.backbone.api.closures.OnCrashClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r4) {
        return this.j6.getValue((java.lang.Thread) r4[0], (java.lang.Throwable) r4[1]);
    }
}
