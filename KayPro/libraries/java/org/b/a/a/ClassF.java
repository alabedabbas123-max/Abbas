package org.b.a.a;

import org.b.a.b.Interfacee;

class ClassF implements Interfacee {
    ClassF() {
    }

    @Override
    public String mo7554a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 0) {
                break;
            }
            sb.append((char) (b & 255));
        }
        return sb.toString();
    }
}
