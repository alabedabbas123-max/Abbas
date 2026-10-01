package com.jcraft.jsch.jgss;

public class GSSContextKrb5 implements com.jcraft.jsch.GSSContext {
    private static java.lang.String j6;
    private org.ietf.jgss.GSSContext DW;

    static {
        j6 = j6("javax.security.auth.useSubjectCredsOnly");
    }

    public GSSContextKrb5() {
        this.DW = null;
    }

    private static void DW(java.lang.String r0, java.lang.String r1) {
        java.lang.System.setProperty(r0, r1);     // Catch: java.lang.Exception -> L4
        return;
    }

    private static java.lang.String j6(java.lang.String r0) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return java.lang.System.getProperty(r0);
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean DW() {
        return this.DW.isEstablished();
    }

    @Override
    public byte[] DW(byte[] r4, int r5, int r6) {
        org.ietf.jgss.MessageProp r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = new org.ietf.jgss.MessageProp(0, true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.ietf.jgss.GSSException) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this.DW.getMIC(r4, r5, r6, r0);
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6() {
        this.DW.dispose();     // Catch: org.ietf.jgss.GSSException -> L4
        return;
    }

    @Override
    public void j6(java.lang.String r6, java.lang.String r7) {
        org.ietf.jgss.Oid r8 = null;
        org.ietf.jgss.Oid r0 = null;
        org.ietf.jgss.GSSManager r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r8 = new org.ietf.jgss.Oid("1.2.840.113554.1.2.2");
                        r0 = new org.ietf.jgss.Oid("1.2.840.113554.1.2.2.1");
                        r1 = org.ietf.jgss.GSSManager.getInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof org.ietf.jgss.GSSException) { $pc2 = 7; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r7 = java.net.InetAddress.getByName(r7).getCanonicalHostName();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.net.UnknownHostException) { $pc2 = 10; continue $sw2; }
                        if ($t instanceof org.ietf.jgss.GSSException) { $pc2 = 7; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this.DW = r1.createContext(r1.createName("host/" + r7, r0), r8, null, 0);
                        this.DW.requestMutualAuth(true);
                        this.DW.requestConf(true);
                        this.DW.requestInteg(true);
                        this.DW.requestCredDeleg(true);
                        this.DW.requestAnonymity(false);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof org.ietf.jgss.GSSException) { $pc2 = 7; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    e = $ex2;
                    throw new com.jcraft.jsch.JSchException(e.toString());
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] j6(byte[] r4, int r5, int r6) {
        byte[] r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (j6 != null) { $pc3 = 22; continue $sw3; }
                    DW("javax.security.auth.useSubjectCredsOnly", "true");
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 16: {
                    e = $ex3;
                    try {
                        throw new com.jcraft.jsch.JSchException(e.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                }
                case 13: {
                    e = $ex3;
                    try {
                        throw new com.jcraft.jsch.JSchException(e.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                }
                case 4: {
                    if (j6 != null) { $pc3 = 6; continue $sw3; }
                    try {
                        DW("javax.security.auth.useSubjectCredsOnly", "false");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.SecurityException) { $pc3 = 13; continue $sw3; }
                        if ($t instanceof org.ietf.jgss.GSSException) { $pc3 = 16; continue $sw3; }
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r7 = this.DW.initSecContext(r4, 0, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.SecurityException) { $pc3 = 13; continue $sw3; }
                        if ($t instanceof org.ietf.jgss.GSSException) { $pc3 = 16; continue $sw3; }
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (j6 != null) { $pc3 = 10; continue $sw3; }
                    DW("javax.security.auth.useSubjectCredsOnly", "true");
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
