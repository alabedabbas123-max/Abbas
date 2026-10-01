package com.jcraft.jsch;

public interface MAC {
    int j6();

    void j6(byte[] r1);

    void j6(byte[] r1, int r2);

    void update(int r1);

    void update(byte[] r1, int r2, int r3);
}
