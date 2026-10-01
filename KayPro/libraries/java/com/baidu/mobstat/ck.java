package com.baidu.mobstat;

import com.tencent.mm.resourceproguard.Configuration;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ck extends Abstractcj {

    static final boolean f4447f;

    private ByteBuffer f4448g;

    private final Random f4449h = new Random();

    static {
        f4447f = !ck.class.desiredAssertionStatus();
    }

    class a extends Throwable {

        private int f4451b;

        public a(int i) {
            this.f4451b = i;
        }

        public int m6690a() {
            return this.f4451b;
        }
    }

    @Override
    public Abstractcj.b mo6673a(Interfacecy interfaceC1488cy, Interfacedf interfaceC1496df) throws cp {
        if (!interfaceC1488cy.mo6721c("Sec-WebSocket-Key") || !interfaceC1496df.mo6721c("Sec-WebSocket-Accept")) {
            return Abstractcj.b.NOT_MATCHED;
        }
        if (m6687a(interfaceC1488cy.mo6719b("Sec-WebSocket-Key")).equals(interfaceC1496df.mo6719b("Sec-WebSocket-Accept"))) {
            return Abstractcj.b.MATCHED;
        }
        return Abstractcj.b.NOT_MATCHED;
    }

    @Override
    public ByteBuffer mo6675a(Interfacecw interfaceC1486cw) {
        int i;
        int i2 = 0;
        ByteBuffer byteBufferMo6699c = interfaceC1486cw.mo6699c();
        boolean z = this.f4438d == Interfacece.b.CLIENT;
        if (byteBufferMo6699c.remaining() <= 125) {
            i = 1;
        } else {
            i = byteBufferMo6699c.remaining() <= 65535 ? 2 : 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((z ? 4 : 0) + (i > 1 ? i + 1 : i) + 1 + byteBufferMo6699c.remaining());
        byteBufferAllocate.put((byte) (((byte) (interfaceC1486cw.mo6704d() ? -128 : 0)) | m6685a(interfaceC1486cw.mo6706f())));
        byte[] bArrM6688a = m6688a(byteBufferMo6699c.remaining(), i);
        if (!f4447f && bArrM6688a.length != i) {
            throw new AssertionError();
        }
        if (i == 1) {
            byteBufferAllocate.put((byte) (bArrM6688a[0] | (z ? (byte) -128 : (byte) 0)));
        } else if (i == 2) {
            byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 126));
            byteBufferAllocate.put(bArrM6688a);
        } else if (i == 8) {
            byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 127));
            byteBufferAllocate.put(bArrM6688a);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.f4449h.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (byteBufferMo6699c.hasRemaining()) {
                byteBufferAllocate.put((byte) (byteBufferMo6699c.get() ^ byteBufferAllocate2.get(i2 % 4)));
                i2++;
            }
        } else {
            byteBufferAllocate.put(byteBufferMo6699c);
        }
        if (!f4447f && byteBufferAllocate.remaining() != 0) {
            throw new AssertionError(byteBufferAllocate.remaining());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @Override
    public List<Interfacecw> mo6678a(ByteBuffer byteBuffer, boolean z) {
        cx c1487cx = new cx();
        try {
            c1487cx.mo6698a(byteBuffer);
            c1487cx.mo6701a(true);
            c1487cx.mo6700a(Interfacecw.a.BINARY);
            c1487cx.mo6702b(z);
            return Collections.singletonList(c1487cx);
        } catch (cn e) {
            throw new cr(e);
        }
    }

    private byte m6685a(Interfacecw.a aVar) {
        if (aVar == Interfacecw.a.CONTINUOUS) {
            return (byte) 0;
        }
        if (aVar == Interfacecw.a.TEXT) {
            return (byte) 1;
        }
        if (aVar == Interfacecw.a.BINARY) {
            return (byte) 2;
        }
        if (aVar == Interfacecw.a.CLOSING) {
            return (byte) 8;
        }
        if (aVar == Interfacecw.a.PING) {
            return (byte) 9;
        }
        if (aVar == Interfacecw.a.PONG) {
            return (byte) 10;
        }
        throw new RuntimeException("Don't know how to handle " + aVar.toString());
    }

    private String m6687a(String str) {
        try {
            return dh.m6724a(MessageDigest.getInstance(Configuration.DEFAULT_DIGEST_ALG).digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Interfacecz mo6674a(Interfacecz interfaceC1489cz) {
        interfaceC1489cz.mo6715a("Upgrade", "websocket");
        interfaceC1489cz.mo6715a("Connection", "Upgrade");
        interfaceC1489cz.mo6715a("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f4449h.nextBytes(bArr);
        interfaceC1489cz.mo6715a("Sec-WebSocket-Key", dh.m6724a(bArr));
        return interfaceC1489cz;
    }

    private byte[] m6688a(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private Interfacecw.a m6686a(byte b) throws co {
        switch (b) {
            case 0:
                return Interfacecw.a.CONTINUOUS;
            case 1:
                return Interfacecw.a.TEXT;
            case 2:
                return Interfacecw.a.BINARY;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                throw new co("unknow optcode " + ((int) b));
            case 8:
                return Interfacecw.a.CLOSING;
            case 9:
                return Interfacecw.a.PING;
            case 10:
                return Interfacecw.a.PONG;
        }
    }

    @Override
    public List<Interfacecw> mo6683c(ByteBuffer byteBuffer) throws cn {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f4448g == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f4448g.remaining();
                if (iRemaining2 > iRemaining) {
                    this.f4448g.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                    byteBuffer.position(iRemaining + byteBuffer.position());
                    return Collections.emptyList();
                }
                this.f4448g.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                byteBuffer.position(byteBuffer.position() + iRemaining2);
                linkedList.add(m6689e((ByteBuffer) this.f4448g.duplicate().position(0)));
                this.f4448g = null;
                break;
            } catch (a e) {
                this.f4448g.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m6672a(e.m6690a()));
                if (!f4447f && byteBufferAllocate.limit() <= this.f4448g.limit()) {
                    throw new AssertionError();
                }
                this.f4448g.rewind();
                byteBufferAllocate.put(this.f4448g);
                this.f4448g = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m6689e(byteBuffer));
            } catch (a e2) {
                byteBuffer.reset();
                this.f4448g = ByteBuffer.allocate(m6672a(e2.m6690a()));
                this.f4448g.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public Interfacecw m6689e(ByteBuffer byteBuffer) throws a, cn {
        Interfacecv c1487cx;
        int i = 2;
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < 2) {
            throw new a(2);
        }
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        byte b2 = (byte) ((b & 127) >> 4);
        if (b2 != 0) {
            throw new co("bad rsv " + ((int) b2));
        }
        byte b3 = byteBuffer.get();
        boolean z2 = (b3 & (-128)) != 0;
        int iIntValue = (byte) (b3 & 127);
        Interfacecw.a aVarM6686a = m6686a((byte) (b & 15));
        if (!z && (aVarM6686a == Interfacecw.a.PING || aVarM6686a == Interfacecw.a.PONG || aVarM6686a == Interfacecw.a.CLOSING)) {
            throw new co("control frames may no be fragmented");
        }
        if (iIntValue < 0 || iIntValue > 125) {
            if (aVarM6686a == Interfacecw.a.PING || aVarM6686a == Interfacecw.a.PONG || aVarM6686a == Interfacecw.a.CLOSING) {
                throw new co("more than 125 octets");
            }
            if (iIntValue == 126) {
                if (iRemaining < 4) {
                    throw new a(4);
                }
                iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i = 4;
            } else {
                i = 10;
                if (iRemaining < 10) {
                    throw new a(10);
                }
                byte[] bArr = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = byteBuffer.get();
                }
                long jLongValue = new BigInteger(bArr).longValue();
                if (jLongValue > 2147483647L) {
                    throw new cq("Payloadsize is to big...");
                }
                iIntValue = (int) jLongValue;
            }
        }
        int i3 = (z2 ? 4 : 0) + i + iIntValue;
        if (iRemaining < i3) {
            throw new a(i3);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m6672a(iIntValue));
        if (z2) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i4 = 0; i4 < iIntValue; i4++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i4 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        if (aVarM6686a == Interfacecw.a.CLOSING) {
            c1487cx = new cu();
        } else {
            c1487cx = new cx();
            c1487cx.mo6701a(z);
            c1487cx.mo6700a(aVarM6686a);
        }
        byteBufferAllocate.flip();
        c1487cx.mo6698a(byteBufferAllocate);
        if (aVarM6686a == Interfacecw.a.TEXT && !di.m6739b(c1487cx.mo6699c())) {
            throw new cn(1007);
        }
        return c1487cx;
    }

    @Override
    public void mo6679a() {
        this.f4448g = null;
    }

    @Override
    public Abstractcj mo6682c() {
        return new ck();
    }

    @Override
    public Abstractcj.a mo6681b() {
        return Abstractcj.a.TWOWAY;
    }
}
