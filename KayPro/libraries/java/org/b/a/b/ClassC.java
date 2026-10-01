package org.b.a.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ClassC implements Interfacee {

    private final char[] f5441a;

    private final List f5442b;

    public ClassC(char[] cArr) {
        this.f5441a = (char[]) cArr.clone();
        ArrayList arrayList = new ArrayList(this.f5441a.length);
        byte b = 127;
        for (int i = 0; i < this.f5441a.length; i++) {
            b = (byte) (b + 1);
            arrayList.add(new ClassD(b, this.f5441a[i]));
        }
        Collections.sort(arrayList);
        this.f5442b = Collections.unmodifiableList(arrayList);
    }

    public char m7555a(byte b) {
        return b >= 0 ? (char) b : this.f5441a[b + 128];
    }

    @Override
    public String mo7554a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = m7555a(bArr[i]);
        }
        return new String(cArr);
    }
}
