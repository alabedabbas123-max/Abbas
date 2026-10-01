package abcd;

class pv implements abcd.Interfacejv {
    final abcd.Bv DW;
    final com.appfour.backbone.api.closures.OnNotificationClosure j6;

    pv(abcd.Bv r1, com.appfour.backbone.api.closures.OnNotificationClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r3) {
        return this.j6.getValue((com.appfour.backbone.api.objects.UserNotification) r3[0]);
    }
}
