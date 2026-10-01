package com.baidu.mobstat;

import java.nio.ByteBuffer;

public class cu extends cx implements Interfacect {

    static final ByteBuffer f4454a = ByteBuffer.allocate(0);

    private int f4455f;

    private String f4456g;

    public cu() {
        super(Interfacecw.a.CLOSING);
        mo6701a(true);
    }

    public cu(int i, String str) throws cn {
        super(Interfacecw.a.CLOSING);
        mo6701a(true);
        m6695a(i, str);
    }

    private void m6695a(int i, String str) throws cn {
        String str2 = str == null ? "" : str;
        if (i == 1015) {
            str2 = "";
            i = 1005;
        }
        if (i == 1005) {
            if (str2.length() > 0) {
                throw new cn(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        if (i > 1011 && i < 3000 && i != 1015) {
            throw new cn(1002, "Trying to send an illegal close code!");
        }
        byte[] bArrM6738a = di.m6738a(str2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrM6738a.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrM6738a);
        byteBufferAllocate2.rewind();
        mo6698a(byteBufferAllocate2);
    }

    private void m6696g() throws co {
        this.f4455f = 1005;
        ByteBuffer byteBufferMo6699c = super.mo6699c();
        byteBufferMo6699c.mark();
        if (byteBufferMo6699c.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBufferMo6699c.getShort());
            byteBufferAllocate.position(0);
            this.f4455f = byteBufferAllocate.getInt();
            if (this.f4455f == 1006 || this.f4455f == 1015 || this.f4455f == 1005 || this.f4455f > 4999 || this.f4455f < 1000 || this.f4455f == 1004) {
                throw new co("closecode must not be sent over the wire: " + this.f4455f);
            }
        }
        byteBufferMo6699c.reset();
    }

    @Override
    public int mo6693a() {
        return this.f4455f;
    }

    private void m6697h() throws cn {
        if (this.f4455f == 1005) {
            this.f4456g = di.m6735a(super.mo6699c());
            return;
        }
        ByteBuffer byteBufferMo6699c = super.mo6699c();
        int iPosition = byteBufferMo6699c.position();
        try {
            try {
                byteBufferMo6699c.position(byteBufferMo6699c.position() + 2);
                this.f4456g = di.m6735a(byteBufferMo6699c);
                byteBufferMo6699c.position(iPosition);
            } catch (IllegalArgumentException e) {
                throw new co(e);
            }
        } catch (Throwable th) {
            byteBufferMo6699c.position(iPosition);
            throw th;
        }
    }

    @Override
    public String mo6694b() {
        return this.f4456g;
    }

    @Override
    public String toString() {
        return super.toString() + "code: " + this.f4455f;
    }

    @Override
    public void mo6698a(ByteBuffer byteBuffer) throws cn {
        super.mo6698a(byteBuffer);
        m6696g();
        m6697h();
    }

    @Override
    public ByteBuffer mo6699c() {
        return this.f4455f == 1005 ? f4454a : super.mo6699c();
    }
}
