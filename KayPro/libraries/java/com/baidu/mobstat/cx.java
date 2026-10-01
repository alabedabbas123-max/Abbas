package com.baidu.mobstat;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class cx implements Interfacecv {

    protected static byte[] f4464b = new byte[0];

    private ByteBuffer f4465a;

    protected boolean f4466c;

    protected Interfacecw.a f4467d;

    protected boolean f4468e;

    public cx() {
    }

    public cx(Interfacecw.a aVar) {
        this.f4467d = aVar;
        this.f4465a = ByteBuffer.wrap(f4464b);
    }

    public cx(Interfacecw interfaceC1486cw) {
        this.f4466c = interfaceC1486cw.mo6704d();
        this.f4467d = interfaceC1486cw.mo6706f();
        this.f4465a = interfaceC1486cw.mo6699c();
        this.f4468e = interfaceC1486cw.mo6705e();
    }

    @Override
    public boolean mo6704d() {
        return this.f4466c;
    }

    @Override
    public Interfacecw.a mo6706f() {
        return this.f4467d;
    }

    @Override
    public boolean mo6705e() {
        return this.f4468e;
    }

    @Override
    public ByteBuffer mo6699c() {
        return this.f4465a;
    }

    @Override
    public void mo6701a(boolean z) {
        this.f4466c = z;
    }

    @Override
    public void mo6700a(Interfacecw.a aVar) {
        this.f4467d = aVar;
    }

    @Override
    public void mo6698a(ByteBuffer byteBuffer) throws cn {
        this.f4465a = byteBuffer;
    }

    @Override
    public void mo6702b(boolean z) {
        this.f4468e = z;
    }

    @Override
    public void mo6703a(Interfacecw interfaceC1486cw) throws co {
        ByteBuffer byteBufferMo6699c = interfaceC1486cw.mo6699c();
        if (this.f4465a == null) {
            this.f4465a = ByteBuffer.allocate(byteBufferMo6699c.remaining());
            byteBufferMo6699c.mark();
            this.f4465a.put(byteBufferMo6699c);
            byteBufferMo6699c.reset();
        } else {
            byteBufferMo6699c.mark();
            this.f4465a.position(this.f4465a.limit());
            this.f4465a.limit(this.f4465a.capacity());
            if (byteBufferMo6699c.remaining() > this.f4465a.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferMo6699c.remaining() + this.f4465a.capacity());
                this.f4465a.flip();
                byteBufferAllocate.put(this.f4465a);
                byteBufferAllocate.put(byteBufferMo6699c);
                this.f4465a = byteBufferAllocate;
            } else {
                this.f4465a.put(byteBufferMo6699c);
            }
            this.f4465a.rewind();
            byteBufferMo6699c.reset();
        }
        this.f4466c = interfaceC1486cw.mo6704d();
    }

    public String toString() {
        return "Framedata{ optcode:" + mo6706f() + ", fin:" + mo6704d() + ", payloadlength:[pos:" + this.f4465a.position() + ", len:" + this.f4465a.remaining() + "], payload:" + Arrays.toString(di.m6738a(new String(this.f4465a.array()))) + "}";
    }
}
