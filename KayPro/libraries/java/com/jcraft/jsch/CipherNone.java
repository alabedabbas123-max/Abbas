package com.jcraft.jsch;

public class CipherNone implements com.jcraft.jsch.Cipher {
    public CipherNone() {
    }

    @Override
    public boolean DW() {
        return false;
    }

    @Override
    public int FH() {
        return 8;
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public void j6(int r1, byte[] r2, byte[] r3) {
    }

    @Override
    public void j6(byte[] r1, int r2, int r3, byte[] r4, int r5) {
    }
}
