package a.e;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import a.j.ClassX;

public class am {

    private DataOutputStream f615a;

    private final int f616b;

    private final String f617c;

    private List f618d = new ArrayList();

    private Set f619e = new HashSet();

    private long f620f;

    public am(OutputStream outputStream, byte[] bArr, String str, int i) throws IOException {
        this.f615a = new DataOutputStream(outputStream);
        this.f617c = str;
        this.f616b = i;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public void m1728a(int i) throws IOException {
        this.f615a.write(i);
        this.f615a.write(i >>> 8);
    }

    public void m1729a(long j) throws IOException {
        this.f615a.write((int) j);
        this.f615a.write((int) (j >>> 8));
        this.f615a.write((int) (j >>> 16));
        this.f615a.write((int) (j >>> 24));
    }

    private void m1732b() {
        this.f620f = this.f615a.size();
    }

    public void m1733b(int i) throws IOException {
        this.f615a.write(i);
        this.f615a.write(i >>> 8);
        this.f615a.write(i >>> 16);
        this.f615a.write(i >>> 24);
    }

    private void m1735c() throws IOException {
        long size = ((long) this.f615a.size()) - this.f620f;
        m1733b(101010256);
        m1728a(0);
        m1728a(0);
        m1728a(this.f618d.size());
        m1728a(this.f618d.size());
        m1729a(size);
        m1729a(this.f620f);
        if (this.f617c == null) {
            m1728a(0);
            return;
        }
        byte[] bArrM3178a = ClassX.m3178a(this.f617c);
        m1728a(bArrM3178a.length);
        this.f615a.write(bArrM3178a);
    }

    public OutputStream m1736a(String str, boolean z, int i) {
        return m1737a(str, z, i, null, null);
    }

    public OutputStream m1737a(String str, boolean z, int i, byte[] bArr, String str2) throws IOException {
        if (!this.f619e.add(str)) {
            throw new IOException("Duplicate jar entry [" + str + "]");
        }
        ao c0259ao = new ao(this, str, z, i, bArr, str2);
        this.f618d.add(c0259ao);
        return c0259ao.m1746a();
    }

    public void m1738a() throws IOException {
        m1732b();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f618d.size()) {
                m1735c();
                this.f615a.close();
                this.f615a = null;
                this.f618d = null;
                this.f619e = null;
                return;
            }
            ((ao) this.f618d.get(i2)).m1747b();
            i = i2 + 1;
        }
    }
}
