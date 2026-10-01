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
        return java.lang.System.getProperty(r0);
    L4:
        return null;
    }

    @Override
    public boolean DW() {
        return this.DW.isEstablished();
    }

    @Override
    public byte[] DW(byte[] r4, int r5, int r6) {
        org.ietf.jgss.MessageProp r0 = new org.ietf.jgss.MessageProp(0, true);     // Catch: org.ietf.jgss.GSSException -> L4
        return this.DW.getMIC(r4, r5, r6, r0);
    L4:
        return null;
    }

    @Override
    public void j6() {
        this.DW.dispose();     // Catch: org.ietf.jgss.GSSException -> L4
        return;
    }

    @Override
    public void j6(java.lang.String r6, java.lang.String r7) {
        org.ietf.jgss.Oid r8 = new org.ietf.jgss.Oid("1.2.840.113554.1.2.2");     // Catch: org.ietf.jgss.GSSException -> L7
        org.ietf.jgss.Oid r0 = new org.ietf.jgss.Oid("1.2.840.113554.1.2.2.1");     // Catch: org.ietf.jgss.GSSException -> L7
        org.ietf.jgss.GSSManager r1 = org.ietf.jgss.GSSManager.getInstance();     // Catch: org.ietf.jgss.GSSException -> L7
        r7 = java.net.InetAddress.getByName(r7).getCanonicalHostName();     // Catch: java.net.UnknownHostException -> L10 org.ietf.jgss.GSSException -> L7
    L5:
        this.DW = r1.createContext(r1.createName("host/" + r7, r0), r8, null, 0);     // Catch: org.ietf.jgss.GSSException -> L7
        this.DW.requestMutualAuth(true);     // Catch: org.ietf.jgss.GSSException -> L7
        this.DW.requestConf(true);     // Catch: org.ietf.jgss.GSSException -> L7
        this.DW.requestInteg(true);     // Catch: org.ietf.jgss.GSSException -> L7
        this.DW.requestCredDeleg(true);     // Catch: org.ietf.jgss.GSSException -> L7
        this.DW.requestAnonymity(false);     // Catch: org.ietf.jgss.GSSException -> L7
        return;
    L7:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString());
    }

    @Override
    public byte[] j6(byte[] r4, int r5, int r6) {
    L11:
        th = move-exception;
        if (j6 != null) goto L22;
        DW("javax.security.auth.useSubjectCredsOnly", "true");
    L22:
        throw th;
    L16:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString());     // Catch: java.lang.Throwable -> L11
    L13:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString());     // Catch: java.lang.Throwable -> L11
    L4:
        if (j6 != null) goto L6;
        DW("javax.security.auth.useSubjectCredsOnly", "false");     // Catch: java.lang.Throwable -> L11 java.lang.SecurityException -> L13 org.ietf.jgss.GSSException -> L16
    L6:
        byte[] r7 = this.DW.initSecContext(r4, 0, r6);     // Catch: java.lang.Throwable -> L11 java.lang.SecurityException -> L13 org.ietf.jgss.GSSException -> L16
    L8:
        if (j6 != null) goto L10;
        DW("javax.security.auth.useSubjectCredsOnly", "true");
    L10:
        return r7;
    }
}
