package com.jcraft.jsch;

public class OpenSSHConfig implements com.jcraft.jsch.ConfigRepository {
    private static final java.util.Hashtable j6 = null;
    private final java.util.Hashtable DW;
    private final java.util.Vector FH;

    class MyConfig implements com.jcraft.jsch.ConfigRepository.Config {
        private java.util.Vector DW;
        final com.jcraft.jsch.OpenSSHConfig FH;
        private java.lang.String j6;

        MyConfig(com.jcraft.jsch.OpenSSHConfig r9, java.lang.String r10) {
            byte[] r11 = null;
            int r0 = 0;
            java.lang.String[] r2 = null;
            int r4 = 0;
            java.lang.String r5 = null;
            boolean r6 = false;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.FH = r9;
                        this.DW = new java.util.Vector();
                        this.j6 = r10;
                        this.DW.addElement(com.jcraft.jsch.OpenSSHConfig.j6(r9).get(""));
                        r11 = com.jcraft.jsch.Util.FH(r10);
                        if (com.jcraft.jsch.OpenSSHConfig.DW(r9).size() <= 1) { $pc0 = 23; continue $sw0; }
                        r0 = 1;
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        if (r0 >= com.jcraft.jsch.OpenSSHConfig.DW(r9).size()) { $pc0 = 30; continue $sw0; }
                        r2 = ((java.lang.String) com.jcraft.jsch.OpenSSHConfig.DW(r9).elementAt(r0)).split("[ \t]");
                        r4 = 0;
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        if (r4 >= r2.length) { $pc0 = 11; continue $sw0; }
                        r5 = r2[r4].trim();
                        if (r5.startsWith("!") == false) { $pc0 = 15; continue $sw0; }
                        r5 = r5.substring(1).trim();
                        r6 = true;
                        $pc0 = 17; continue $sw0;
                    }
                    case 17: {
                        if (com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r5), r11) == false) { $pc0 = 20; continue $sw0; }
                        if (r6 == true) { $pc0 = 22; continue $sw0; }
                        this.DW.addElement(com.jcraft.jsch.OpenSSHConfig.j6(r9).get((java.lang.String) com.jcraft.jsch.OpenSSHConfig.DW(r9).elementAt(r0)));
                        $pc0 = 22; continue $sw0;
                    }
                    case 22: {
                        r4 = r4 + 1;
                        { $pc0 = 10; continue $sw0; }
                    }
                    case 20: {
                        if (r6 == false) { $pc0 = 22; continue $sw0; }
                        this.DW.addElement(com.jcraft.jsch.OpenSSHConfig.j6(r9).get((java.lang.String) com.jcraft.jsch.OpenSSHConfig.DW(r9).elementAt(r0)));
                        { $pc0 = 22; continue $sw0; }
                    }
                    case 15: {
                        r6 = false;
                        { $pc0 = 17; continue $sw0; }
                    }
                    case 11: {
                        r0 = r0 + 1;
                        { $pc0 = 6; continue $sw0; }
                    }
                    case 30: {
                        return;
                    }
                    case 23: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private java.lang.String DW(java.lang.String r8) {
            java.lang.String r2 = null;
            int r0 = 0;
            java.util.Vector r3 = null;
            int r4 = 0;
            java.lang.String[] r5 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (com.jcraft.jsch.OpenSSHConfig.j6().get(r8) == null) { $pc1 = 5; continue $sw1; }
                        r8 = (java.lang.String) com.jcraft.jsch.OpenSSHConfig.j6().get(r8);
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r2 = null;
                        r0 = 0;
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        if (r0 >= this.DW.size()) { $pc1 = 17; continue $sw1; }
                        r3 = (java.util.Vector) this.DW.elementAt(r0);
                        r4 = 0;
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        if (r4 >= r3.size()) { $pc1 = 16; continue $sw1; }
                        r5 = (java.lang.String[]) r3.elementAt(r4);
                        if (r5[0].equals(r8) == true) { $pc1 = 15; continue $sw1; }
                        r4 = r4 + 1;
                        { $pc1 = 11; continue $sw1; }
                    }
                    case 15: {
                        r2 = r5[1];
                        $pc1 = 16; continue $sw1;
                    }
                    case 16: {
                        if (r2 != null) { $pc1 = 17; continue $sw1; }
                        r0 = r0 + 1;
                        $pc1 = 17; continue $sw1;
                    }
                    case 17: {
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private java.lang.String[] FH(java.lang.String r8) {
            java.util.Vector r0 = null;
            int r2 = 0;
            java.util.Vector r3 = null;
            int r4 = 0;
            java.lang.String[] r5 = null;
            java.lang.String r6 = null;
            java.lang.String[] r9 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = new java.util.Vector();
                        r2 = 0;
                        $pc2 = 4; continue $sw2;
                    }
                    case 4: {
                        if (r2 >= this.DW.size()) { $pc2 = 5; continue $sw2; }
                        r3 = (java.util.Vector) this.DW.elementAt(r2);
                        r4 = 0;
                        $pc2 = 9; continue $sw2;
                    }
                    case 9: {
                        if (r4 >= r3.size()) { $pc2 = 10; continue $sw2; }
                        r5 = (java.lang.String[]) r3.elementAt(r4);
                        if (r5[0].equals(r8) == false) { $pc2 = 16; continue $sw2; }
                        r6 = r5[1];
                        if (r6 == null) { $pc2 = 16; continue $sw2; }
                        r0.remove(r6);
                        r0.addElement(r6);
                        $pc2 = 16; continue $sw2;
                    }
                    case 16: {
                        r4 = r4 + 1;
                        { $pc2 = 9; continue $sw2; }
                    }
                    case 10: {
                        r2 = r2 + 1;
                        { $pc2 = 4; continue $sw2; }
                    }
                    case 5: {
                        r9 = new java.lang.String[r0.size()];
                        r0.toArray(r9);
                        return r9;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String DW() {
            return DW("User");
        }

        @Override
        public java.lang.String FH() {
            return DW("Hostname");
        }

        @Override
        public java.lang.String getValue(java.lang.String r2) {
            java.lang.String r3 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (r2.equals("compression.s2c") == false) { $pc3 = 5; continue $sw3; }
                        $pc3 = 9; continue $sw3;
                    }
                    case 9: {
                        r3 = DW(r2);
                        if (r3 != null) { $pc3 = 12; continue $sw3; }
                        return "none,zlib@openssh.com,zlib";
                    }
                    case 12: {
                        if (r3.equals("no") == true) { $pc3 = 18; continue $sw3; }
                        return "zlib@openssh.com,zlib,none";
                    }
                    case 18: {
                        return "none,zlib@openssh.com,zlib";
                    }
                    case 5: {
                        if (r2.equals("compression.c2s") == true) { $pc3 = 9; continue $sw3; }
                        return DW(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int j6() {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        return java.lang.Integer.parseInt(DW("Port"));
                    }
                    case 5: {
                        return -1;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String[] j6(java.lang.String r1) {
            return FH(r1);
        }
    }

    static {
        j6 = new java.util.Hashtable();
        j6.put("kex", "KexAlgorithms");
        j6.put("server_host_key", "HostKeyAlgorithms");
        j6.put("cipher.c2s", "Ciphers");
        j6.put("cipher.s2c", "Ciphers");
        j6.put("mac.c2s", "Macs");
        j6.put("mac.s2c", "Macs");
        j6.put("compression.s2c", "Compression");
        j6.put("compression.c2s", "Compression");
        j6.put("compression_level", "CompressionLevel");
        j6.put("MaxAuthTries", "NumberOfPasswordPrompts");
    }

    static java.util.Vector DW(com.jcraft.jsch.OpenSSHConfig r0) {
        return r0.FH;
    }

    static java.util.Hashtable j6() {
        return j6;
    }

    static java.util.Hashtable j6(com.jcraft.jsch.OpenSSHConfig r0) {
        return r0.DW;
    }

    @Override
    public com.jcraft.jsch.ConfigRepository.Config j6(java.lang.String r2) {
        return new com.jcraft.jsch.OpenSSHConfig.MyConfig(this, r2);
    }
}
