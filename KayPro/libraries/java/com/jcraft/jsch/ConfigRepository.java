package com.jcraft.jsch;

public interface ConfigRepository {
    public static final com.jcraft.jsch.ConfigRepository DW = new com.jcraft.jsch.ConfigRepository.AnonymousClass2();
    public static final com.jcraft.jsch.ConfigRepository.Config j6 = new com.jcraft.jsch.ConfigRepository.AnonymousClass1();

    public interface Config {
        java.lang.String DW();

        java.lang.String FH();

        java.lang.String getValue(java.lang.String r1);

        int j6();

        java.lang.String[] j6(java.lang.String r1);
    }



    com.jcraft.jsch.ConfigRepository.Config j6(java.lang.String r1);
}
