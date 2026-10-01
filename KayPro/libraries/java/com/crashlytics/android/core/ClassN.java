package com.crashlytics.android.core;

class ClassN {
    private final android.app.AlertDialog.Builder DW;
    private final com.crashlytics.android.core.ClassN.b j6;

    interface a {
        void j6(boolean r1);
    }

    private static class b {
        private final java.util.concurrent.CountDownLatch DW;
        private boolean j6;

        private b() {
            this.j6 = false;
            this.DW = new java.util.concurrent.CountDownLatch(1);
        }

        b(com.crashlytics.android.core.DialogInterfaceOnClickListenerk r1) {
            this();
        }

        boolean DW() {
            return this.j6;
        }

        void j6() {
            this.DW.await();     // Catch: java.lang.InterruptedException -> L4
            return;
        }

        void j6(boolean r1) {
            this.j6 = r1;
            this.DW.countDown();
        }
    }

    private ClassN(android.app.AlertDialog.Builder r1, com.crashlytics.android.core.ClassN.b r2) {
        this.j6 = r2;
        this.DW = r1;
    }

    private static int j6(float r0, int r1) {
        return (int) (r0 * r1);
    }

    private static android.widget.ScrollView j6(android.app.Activity r5, java.lang.String r6) {
        float r0 = r5.getResources().getDisplayMetrics().density;
        int r1 = j6(r0, 5);
        android.widget.TextView r2 = new android.widget.TextView(r5);
        r2.setAutoLinkMask(15);
        r2.setText(r6);
        r2.setTextAppearance(r5, 16973892);
        r2.setPadding(r1, r1, r1, r1);
        r2.setFocusable(false);
        android.widget.ScrollView r7 = new android.widget.ScrollView(r5);
        r7.setPadding(j6(r0, 14), j6(r0, 2), j6(r0, 10), j6(r0, 12));
        r7.addView(r2);
        return r7;
    }

    public static com.crashlytics.android.core.ClassN j6(android.app.Activity r5, abcd.gA r6, com.crashlytics.android.core.ClassN.a r7) {
        com.crashlytics.android.core.ClassN.b r0 = null;
        com.crashlytics.android.core.qa r1 = null;
        android.app.AlertDialog.Builder r2 = null;
        android.widget.ScrollView r8 = null;
        com.crashlytics.android.core.DialogInterfaceOnClickListenerk r3 = null;
        com.crashlytics.android.core.DialogInterfaceOnClickListenerl r9 = null;
        com.crashlytics.android.core.DialogInterfaceOnClickListenerm r10 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new com.crashlytics.android.core.ClassN.b(null);
                    r1 = new com.crashlytics.android.core.qa(r5, r6);
                    r2 = new android.app.AlertDialog.Builder(r5);
                    r8 = j6(r5, r1.FH());
                    r3 = new com.crashlytics.android.core.DialogInterfaceOnClickListenerk(r0);
                    r2.setView(r8).setTitle(r1.v5()).setCancelable(false).setNeutralButton(r1.Hw(), r3);
                    if (r6.Hw == false) { $pc0 = 6; continue $sw0; }
                    r9 = new com.crashlytics.android.core.DialogInterfaceOnClickListenerl(r0);
                    r2.setNegativeButton(r1.DW(), r9);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r6.Zo == false) { $pc0 = 9; continue $sw0; }
                    r10 = new com.crashlytics.android.core.DialogInterfaceOnClickListenerm(r7, r0);
                    r2.setPositiveButton(r1.j6(), r10);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return new com.crashlytics.android.core.ClassN(r2, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        return this.j6.DW();
    }

    public void FH() {
        this.DW.show();
    }

    public void j6() {
        this.j6.j6();
    }
}
