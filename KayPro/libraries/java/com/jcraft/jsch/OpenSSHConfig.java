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
            this.FH = r9;
            this.DW = new java.util.Vector();
            this.j6 = r10;
            this.DW.addElement(com.jcraft.jsch.OpenSSHConfig.j6(r9).get(""));
            byte[] r11 = com.jcraft.jsch.Util.FH(r10);
            if (com.jcraft.jsch.OpenSSHConfig.DW(r9).size() <= 1) goto L23;
            int r0 = 1;
        L6:
            if (r0 >= com.jcraft.jsch.OpenSSHConfig.DW(r9).size()) goto L30;
            java.lang.String[] r2 = ((java.lang.String) com.jcraft.jsch.OpenSSHConfig.DW(r9).elementAt(r0)).split("[ \t]");
            int r4 = 0;
        L10:
            if (r4 >= r2.length) goto L11;
            java.lang.String r5 = r2[r4].trim();
            if (r5.startsWith("!") == false) goto L15;
            r5 = r5.substring(1).trim();
            boolean r6 = true;
        L17:
            if (com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r5), r11) == false) goto L20;
            if (r6 == true) goto L22;
            this.DW.addElement(com.jcraft.jsch.OpenSSHConfig.j6(r9).get((java.lang.String) com.jcraft.jsch.OpenSSHConfig.DW(r9).elementAt(r0)));
        L22:
            r4 = r4 + 1;
            goto L10
        L20:
            if (r6 == false) goto L22;
            this.DW.addElement(com.jcraft.jsch.OpenSSHConfig.j6(r9).get((java.lang.String) com.jcraft.jsch.OpenSSHConfig.DW(r9).elementAt(r0)));
            goto L22
        L15:
            r6 = false;
            goto L17
        L11:
            r0 = r0 + 1;
            goto L6
        L30:
            return;
        }

        private java.lang.String DW(java.lang.String r8) {
            if (com.jcraft.jsch.OpenSSHConfig.j6().get(r8) == null) goto L5;
            r8 = (java.lang.String) com.jcraft.jsch.OpenSSHConfig.j6().get(r8);
        L5:
            java.lang.String r2 = null;
            int r0 = 0;
        L7:
            if (r0 >= this.DW.size()) goto L17;
            java.util.Vector r3 = (java.util.Vector) this.DW.elementAt(r0);
            int r4 = 0;
        L11:
            if (r4 >= r3.size()) goto L16;
            java.lang.String[] r5 = (java.lang.String[]) r3.elementAt(r4);
            if (r5[0].equals(r8) == true) goto L15;
            r4 = r4 + 1;
            goto L11
        L15:
            r2 = r5[1];
        L16:
            if (r2 != null) goto L17;
            r0 = r0 + 1;
        L17:
            return r2;
        }

        private java.lang.String[] FH(java.lang.String r8) {
            java.util.Vector r0 = new java.util.Vector();
            int r2 = 0;
        L4:
            if (r2 >= this.DW.size()) goto L5;
            java.util.Vector r3 = (java.util.Vector) this.DW.elementAt(r2);
            int r4 = 0;
        L9:
            if (r4 >= r3.size()) goto L10;
            java.lang.String[] r5 = (java.lang.String[]) r3.elementAt(r4);
            if (r5[0].equals(r8) == false) goto L16;
            java.lang.String r6 = r5[1];
            if (r6 == null) goto L16;
            r0.remove(r6);
            r0.addElement(r6);
        L16:
            r4 = r4 + 1;
            goto L9
        L10:
            r2 = r2 + 1;
            goto L4
        L5:
            java.lang.String[] r9 = new java.lang.String[r0.size()];
            r0.toArray(r9);
            return r9;
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
            if (r2.equals("compression.s2c") == false) goto L5;
        L9:
            java.lang.String r3 = DW(r2);
            if (r3 != null) goto L12;
            return "none,zlib@openssh.com,zlib";
        L12:
            if (r3.equals("no") == true) goto L18;
            return "zlib@openssh.com,zlib,none";
        L18:
            return "none,zlib@openssh.com,zlib";
        L5:
            if (r2.equals("compression.c2s") == true) goto L9;
            return DW(r2);
        }

        @Override
        public int j6() {
            return java.lang.Integer.parseInt(DW("Port"));
        L5:
            return -1;
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
