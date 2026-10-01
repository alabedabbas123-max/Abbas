package com.jcraft.jsch;

public interface SignatureRSA extends com.jcraft.jsch.Signature {
    void DW(byte[] r1, byte[] r2);

    void j6(byte[] r1, byte[] r2);
}
