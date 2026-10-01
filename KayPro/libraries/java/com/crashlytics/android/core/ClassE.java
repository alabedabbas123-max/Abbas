package com.crashlytics.android.core;

class ClassE {
    private static java.lang.String DW;
    private static final java.util.concurrent.atomic.AtomicLong j6 = null;

    static {
        j6 = new java.util.concurrent.atomic.AtomicLong(0);
    }

    public ClassE(io.fabric.sdk.android.services.common.v r9) {
        byte[] r0 = new byte[10];
        FH(r0);
        DW(r0);
        j6(r0);
        java.lang.String r10 = io.fabric.sdk.android.services.common.i.FH(r9.Hw());
        java.lang.String r1 = io.fabric.sdk.android.services.common.i.j6(r0);
        DW = java.lang.String.format(java.util.Locale.US, "%s-%s-%s-%s", new java.lang.Object[]{r1.substring(0, 12), r1.substring(12, 16), r1.subSequence(16, 20), r10.substring(0, 12)}).toUpperCase(java.util.Locale.US);
    }

    private void DW(byte[] r4) {
        byte[] r0 = DW(j6.incrementAndGet());
        r4[6] = r0[0];
        r4[7] = r0[1];
    }

    private static byte[] DW(long r1) {
        java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(2);
        r0.putShort((short) r1);
        r0.order(java.nio.ByteOrder.BIG_ENDIAN);
        r0.position(0);
        return r0.array();
    }

    private void FH(byte[] r8) {
        long r0 = new java.util.Date().getTime();
        long r4 = r0 / 1000;
        byte[] r2 = j6(r4);
        r8[0] = r2[0];
        r8[1] = r2[1];
        r8[2] = r2[2];
        r8[3] = r2[3];
        byte[] r1 = DW(r0 % 1000);
        r8[4] = r1[0];
        r8[5] = r1[1];
    }

    private void j6(byte[] r4) {
        byte[] r0 = DW(java.lang.Integer.valueOf(android.os.Process.myPid()).shortValue());
        r4[8] = r0[0];
        r4[9] = r0[1];
    }

    private static byte[] j6(long r1) {
        java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(4);
        r0.putInt((int) r1);
        r0.order(java.nio.ByteOrder.BIG_ENDIAN);
        r0.position(0);
        return r0.array();
    }

    public java.lang.String toString() {
        return DW;
    }
}
