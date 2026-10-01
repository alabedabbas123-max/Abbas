package com.jcraft.jsch;

public interface SignatureDSA extends com.jcraft.jsch.Signature {
    void DW(byte[] r1, byte[] r2, byte[] r3, byte[] r4);

    void j6(byte[] r1, byte[] r2, byte[] r3, byte[] r4);
}
