package com.baidu.mobstat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class cg implements Interfacece {

    public static final List<Abstractcj> f4401a;

    public static int f4402b;

    public static boolean f4403c;

    static final boolean f4404h;

    public final BlockingQueue<ByteBuffer> f4405d;

    public final BlockingQueue<ByteBuffer> f4406e;

    public SelectionKey f4407f;

    public ByteChannel f4408g;

    private final Interfacech f4409i;

    private Abstractcj f4412l;

    private Interfacece.b f4413m;

    private volatile boolean f4410j = false;

    private Interfacece.a f4411k = Interfacece.a.NOT_YET_CONNECTED;

    private Interfacecw f4414n = null;

    private ByteBuffer f4415o = ByteBuffer.allocate(0);

    private Interfacecy f4416p = null;

    private String f4417q = null;

    private Integer f4418r = null;

    private Boolean f4419s = null;

    private String f4420t = null;

    static {
        f4404h = !cg.class.desiredAssertionStatus();
        f4401a = new ArrayList(4);
        f4402b = 16384;
        f4403c = false;
        f4401a.add(new cl());
        f4401a.add(new ck());
    }

    public cg(Interfacech interfaceC1471ch, Abstractcj abstractC1473cj) {
        this.f4412l = null;
        if (interfaceC1471ch == null || abstractC1473cj == null) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f4405d = new LinkedBlockingQueue();
        this.f4406e = new LinkedBlockingQueue();
        this.f4409i = interfaceC1471ch;
        this.f4413m = Interfacece.b.CLIENT;
        if (abstractC1473cj != null) {
            this.f4412l = abstractC1473cj.mo6682c();
        }
    }

    public void m6633a(ByteBuffer byteBuffer) {
        if (!f4404h && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        if (f4403c) {
            System.out.println("process(" + byteBuffer.remaining() + "): {" + (byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())) + "}");
        }
        if (this.f4411k != Interfacece.a.NOT_YET_CONNECTED) {
            m6624d(byteBuffer);
        } else if (m6623c(byteBuffer)) {
            if (!f4404h && this.f4415o.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (byteBuffer.hasRemaining()) {
                m6624d(byteBuffer);
            } else if (this.f4415o.hasRemaining()) {
                m6624d(this.f4415o);
            }
        }
        if (!f4404h && !m6640d() && !m6641e() && byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    private boolean m6623c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int iM6691a;
        if (this.f4415o.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f4415o.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f4415o.capacity() + byteBuffer.remaining());
                this.f4415o.flip();
                byteBufferAllocate.put(this.f4415o);
                this.f4415o = byteBufferAllocate;
            }
            this.f4415o.put(byteBuffer);
            this.f4415o.flip();
            byteBuffer2 = this.f4415o;
        }
        byteBuffer2.mark();
        try {
            if (this.f4412l == null && m6625e(byteBuffer2) == Abstractcj.b.MATCHED) {
                try {
                    m6626f(ByteBuffer.wrap(di.m6738a(this.f4409i.mo6613a(this))));
                    m6628a(-3, "");
                } catch (cn e) {
                    m6622c(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
                }
                return false;
            }
            try {
                if (this.f4413m == Interfacece.b.CLIENT) {
                    this.f4412l.m6680a(this.f4413m);
                    Interfacedd interfaceC1494ddM6684d = this.f4412l.m6684d(byteBuffer2);
                    if (!(interfaceC1494ddM6684d instanceof Interfacedf)) {
                        m6637b(1002, "wrong http function", false);
                        return false;
                    }
                    Interfacedf interfaceC1496df = (Interfacedf) interfaceC1494ddM6684d;
                    if (this.f4412l.mo6673a(this.f4416p, interfaceC1496df) == Abstractcj.b.MATCHED) {
                        try {
                            this.f4409i.mo6616a(this, this.f4416p, interfaceC1496df);
                            m6619a(interfaceC1496df);
                            return true;
                        } catch (cn e2) {
                            m6637b(e2.m6692a(), e2.getMessage(), false);
                            return false;
                        } catch (RuntimeException e3) {
                            this.f4409i.mo6647a(this, e3);
                            m6637b(-1, e3.getMessage(), false);
                            return false;
                        }
                    }
                    m6628a(1002, "draft " + this.f4412l + " refuses handshake");
                }
            } catch (cp e4) {
                m6631a(e4);
            }
            return false;
        } catch (cm e5) {
            if (this.f4415o.capacity() == 0) {
                byteBuffer2.reset();
                iM6691a = e5.m6691a();
                if (iM6691a == 0) {
                    iM6691a = byteBuffer2.capacity() + 16;
                } else if (!f4404h) {
                    throw new AssertionError();
                }
                this.f4415o = ByteBuffer.allocate(iM6691a);
                this.f4415o.put(byteBuffer);
            } else {
                this.f4415o.position(this.f4415o.limit());
                this.f4415o.limit(this.f4415o.capacity());
            }
        }
        if (this.f4415o.capacity() == 0) {
            byteBuffer2.reset();
            iM6691a = e5.m6691a();
            if (iM6691a == 0) {
                iM6691a = byteBuffer2.capacity() + 16;
            } else if (!f4404h && e5.m6691a() < byteBuffer2.remaining()) {
                throw new AssertionError();
            }
            this.f4415o = ByteBuffer.allocate(iM6691a);
            this.f4415o.put(byteBuffer);
        } else {
            this.f4415o.position(this.f4415o.limit());
            this.f4415o.limit(this.f4415o.capacity());
        }
        return false;
    }

    private void m6624d(ByteBuffer byteBuffer) {
        String strMo6694b;
        try {
            for (Interfacecw interfaceC1486cw : this.f4412l.mo6683c(byteBuffer)) {
                if (f4403c) {
                    System.out.println("matched frame: " + interfaceC1486cw);
                }
                Interfacecw.a aVarMo6706f = interfaceC1486cw.mo6706f();
                boolean zMo6704d = interfaceC1486cw.mo6704d();
                if (this.f4411k != Interfacece.a.CLOSING) {
                    if (aVarMo6706f == Interfacecw.a.CLOSING) {
                        int i = 1005;
                        if (!(interfaceC1486cw instanceof Interfacect)) {
                            strMo6694b = "";
                        } else {
                            Interfacect interfaceC1483ct = (Interfacect) interfaceC1486cw;
                            int iMo6693a = interfaceC1483ct.mo6693a();
                            strMo6694b = interfaceC1483ct.mo6694b();
                            i = iMo6693a;
                        }
                        if (this.f4411k == Interfacece.a.CLOSING) {
                            m6629a(i, strMo6694b, true);
                        } else if (this.f4412l.mo6681b() == Abstractcj.a.TWOWAY) {
                            m6622c(i, strMo6694b, true);
                        } else {
                            m6637b(i, strMo6694b, false);
                        }
                    } else if (aVarMo6706f == Interfacecw.a.PING) {
                        this.f4409i.mo6617b(this, interfaceC1486cw);
                    } else if (aVarMo6706f == Interfacecw.a.PONG) {
                        this.f4409i.mo6618c(this, interfaceC1486cw);
                    } else if (!zMo6704d || aVarMo6706f == Interfacecw.a.CONTINUOUS) {
                        if (aVarMo6706f != Interfacecw.a.CONTINUOUS) {
                            if (this.f4414n != null) {
                                throw new cn(1002, "Previous continuous frame sequence not completed.");
                            }
                            this.f4414n = interfaceC1486cw;
                        } else if (zMo6704d) {
                            if (this.f4414n == null) {
                                throw new cn(1002, "Continuous frame sequence was not started.");
                            }
                            if (this.f4414n.mo6706f() == Interfacecw.a.TEXT) {
                                int iMax = Math.max(this.f4414n.mo6699c().limit() - 64, 0);
                                this.f4414n.mo6703a(interfaceC1486cw);
                                if (!di.m6737a(this.f4414n.mo6699c(), iMax)) {
                                    throw new cn(1007);
                                }
                            }
                            this.f4414n = null;
                        } else if (this.f4414n == null) {
                            throw new cn(1002, "Continuous frame sequence was not started.");
                        }
                        if (aVarMo6706f == Interfacecw.a.TEXT && !di.m6739b(interfaceC1486cw.mo6699c())) {
                            throw new cn(1007);
                        }
                        if (aVarMo6706f == Interfacecw.a.CONTINUOUS && this.f4414n != null && this.f4414n.mo6706f() == Interfacecw.a.TEXT) {
                            int iMax2 = Math.max(this.f4414n.mo6699c().limit() - 64, 0);
                            this.f4414n.mo6703a(interfaceC1486cw);
                            if (!di.m6737a(this.f4414n.mo6699c(), iMax2)) {
                                throw new cn(1007);
                            }
                        }
                        try {
                            this.f4409i.mo6614a(this, interfaceC1486cw);
                        } catch (RuntimeException e) {
                            this.f4409i.mo6647a(this, e);
                        }
                    } else {
                        if (this.f4414n != null) {
                            throw new cn(1002, "Continuous frame sequence not completed.");
                        }
                        if (aVarMo6706f == Interfacecw.a.TEXT) {
                            try {
                                this.f4409i.mo6648a(this, di.m6735a(interfaceC1486cw.mo6699c()));
                            } catch (RuntimeException e2) {
                                this.f4409i.mo6647a(this, e2);
                            }
                        } else if (aVarMo6706f == Interfacecw.a.BINARY) {
                            try {
                                this.f4409i.mo6649a(this, interfaceC1486cw.mo6699c());
                            } catch (RuntimeException e3) {
                                this.f4409i.mo6647a(this, e3);
                            }
                        } else {
                            throw new cn(1002, "non control or continious frame expected");
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (cn e4) {
            this.f4409i.mo6647a(this, e4);
            m6631a(e4);
        }
    }

    private void m6622c(int i, String str, boolean z) {
        if (this.f4411k != Interfacece.a.CLOSING && this.f4411k != Interfacece.a.CLOSED) {
            if (this.f4411k == Interfacece.a.OPEN) {
                if (i == 1006) {
                    if (!f4404h && z) {
                        throw new AssertionError();
                    }
                    this.f4411k = Interfacece.a.CLOSING;
                    m6637b(i, str, false);
                    return;
                }
                if (this.f4412l.mo6681b() != Abstractcj.a.NONE) {
                    if (!z) {
                        try {
                            try {
                                this.f4409i.mo6644a(this, i, str);
                            } catch (RuntimeException e) {
                                this.f4409i.mo6647a(this, e);
                            }
                        } catch (cn e2) {
                            this.f4409i.mo6647a(this, e2);
                            m6637b(1006, "generated frame is invalid", false);
                        }
                    }
                    mo6612a(new cu(i, str));
                }
                m6637b(i, str, z);
            } else if (i == -3) {
                if (!f4404h && !z) {
                    throw new AssertionError();
                }
                m6637b(-3, str, true);
            } else {
                m6637b(-1, str, false);
            }
            if (i == 1002) {
                m6637b(i, str, z);
            }
            this.f4411k = Interfacece.a.CLOSING;
            this.f4415o = null;
        }
    }

    public void m6628a(int i, String str) {
        m6622c(i, str, false);
    }

    protected synchronized void m6629a(int i, String str, boolean z) {
        if (this.f4411k != Interfacece.a.CLOSED) {
            if (this.f4407f != null) {
                this.f4407f.cancel();
            }
            if (this.f4408g != null) {
                try {
                    this.f4408g.close();
                } catch (IOException e) {
                    this.f4409i.mo6647a(this, e);
                }
            }
            try {
                this.f4409i.mo6645a(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f4409i.mo6647a(this, e2);
            }
            if (this.f4412l != null) {
                this.f4412l.mo6679a();
            }
            this.f4416p = null;
            this.f4411k = Interfacece.a.CLOSED;
            this.f4405d.clear();
        }
    }

    protected void m6630a(int i, boolean z) {
        m6629a(i, "", z);
    }

    public void m6636b(int i, String str) {
        m6629a(i, str, false);
    }

    protected synchronized void m6637b(int i, String str, boolean z) {
        if (!this.f4410j) {
            this.f4418r = Integer.valueOf(i);
            this.f4417q = str;
            this.f4419s = Boolean.valueOf(z);
            this.f4410j = true;
            this.f4409i.mo6650b(this);
            try {
                this.f4409i.mo6651b(this, i, str, z);
            } catch (RuntimeException e) {
                this.f4409i.mo6647a(this, e);
            }
            if (this.f4412l != null) {
                this.f4412l.mo6679a();
            }
            this.f4416p = null;
        }
    }

    public void m6635b() {
        if (m6643g() == Interfacece.a.NOT_YET_CONNECTED) {
            m6630a(-1, true);
            return;
        }
        if (this.f4410j) {
            m6629a(this.f4418r.intValue(), this.f4417q, this.f4419s.booleanValue());
            return;
        }
        if (this.f4412l.mo6681b() == Abstractcj.a.NONE) {
            m6630a(1000, true);
        } else if (this.f4412l.mo6681b() == Abstractcj.a.ONEWAY) {
            m6630a(1000, true);
        } else {
            m6630a(1006, true);
        }
    }

    public void m6627a(int i) {
        m6622c(i, "", false);
    }

    public void m6631a(cn c1477cn) {
        m6622c(c1477cn.m6692a(), c1477cn.getMessage(), false);
    }

    public void m6638b(ByteBuffer byteBuffer) throws cs, IllegalArgumentException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m6620a(this.f4412l.mo6678a(byteBuffer, this.f4413m == Interfacece.b.CLIENT));
    }

    public void m6634a(byte[] bArr) throws cs, IllegalArgumentException {
        m6638b(ByteBuffer.wrap(bArr));
    }

    private void m6620a(Collection<Interfacecw> collection) {
        if (!m6639c()) {
            throw new cs();
        }
        Iterator<Interfacecw> it = collection.iterator();
        while (it.hasNext()) {
            mo6612a(it.next());
        }
    }

    @Override
    public void mo6612a(Interfacecw interfaceC1486cw) {
        if (f4403c) {
            System.out.println("send frame: " + interfaceC1486cw);
        }
        m6626f(this.f4412l.mo6675a(interfaceC1486cw));
    }

    private Abstractcj.b m6625e(ByteBuffer byteBuffer) throws cm {
        byteBuffer.mark();
        if (byteBuffer.limit() > Abstractcj.f4437c.length) {
            return Abstractcj.b.NOT_MATCHED;
        }
        if (byteBuffer.limit() < Abstractcj.f4437c.length) {
            throw new cm(Abstractcj.f4437c.length);
        }
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            if (Abstractcj.f4437c[i] == byteBuffer.get()) {
                i++;
            } else {
                byteBuffer.reset();
                return Abstractcj.b.NOT_MATCHED;
            }
        }
        return Abstractcj.b.MATCHED;
    }

    public void m6632a(Interfacecz interfaceC1489cz) throws cp {
        if (!f4404h && this.f4411k == Interfacece.a.CONNECTING) {
            throw new AssertionError("shall only be called once");
        }
        this.f4416p = this.f4412l.mo6674a(interfaceC1489cz);
        this.f4420t = interfaceC1489cz.mo6707a();
        if (!f4404h && this.f4420t == null) {
            throw new AssertionError();
        }
        try {
            this.f4409i.mo6615a((Interfacece) this, this.f4416p);
            m6621a(this.f4412l.m6676a(this.f4416p, this.f4413m));
        } catch (cn e) {
            throw new cp("Handshake data rejected by client.");
        } catch (RuntimeException e2) {
            this.f4409i.mo6647a(this, e2);
            throw new cp("rejected because of" + e2);
        }
    }

    private void m6626f(ByteBuffer byteBuffer) {
        if (f4403c) {
            System.out.println("write(" + byteBuffer.remaining() + "): {" + (byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array())) + "}");
        }
        this.f4405d.add(byteBuffer);
        this.f4409i.mo6650b(this);
    }

    private void m6621a(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            m6626f(it.next());
        }
    }

    private void m6619a(Interfacedd interfaceC1494dd) {
        if (f4403c) {
            System.out.println("open using draft: " + this.f4412l.getClass().getSimpleName());
        }
        this.f4411k = Interfacece.a.OPEN;
        try {
            this.f4409i.mo6646a(this, interfaceC1494dd);
        } catch (RuntimeException e) {
            this.f4409i.mo6647a(this, e);
        }
    }

    public boolean m6639c() {
        if (!f4404h && this.f4411k == Interfacece.a.OPEN && this.f4410j) {
            throw new AssertionError();
        }
        return this.f4411k == Interfacece.a.OPEN;
    }

    public boolean m6640d() {
        return this.f4411k == Interfacece.a.CLOSING;
    }

    public boolean m6641e() {
        return this.f4410j;
    }

    public boolean m6642f() {
        return this.f4411k == Interfacece.a.CLOSED;
    }

    public Interfacece.a m6643g() {
        return this.f4411k;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public InetSocketAddress mo6611a() {
        return this.f4409i.mo6652c(this);
    }
}
