package com.baidu.mobstat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public abstract class AbstractRunnableci extends Abstractcf implements Interfacece, Runnable {

    static final boolean f4421c;

    private cg f4422a;

    protected URI f4423b;

    private InputStream f4425e;

    private OutputStream f4426f;

    private Thread f4428h;

    private Abstractcj f4429i;

    private Map<String, String> f4430j;

    private int f4433m;

    private Socket f4424d = null;

    private Proxy f4427g = Proxy.NO_PROXY;

    private CountDownLatch f4431k = new CountDownLatch(1);

    private CountDownLatch f4432l = new CountDownLatch(1);

    public abstract void mo5991a(int i, String str, boolean z);

    public abstract void mo5992a(Interfacedf interfaceC1496df);

    public abstract void mo5993a(Exception exc);

    public abstract void mo5994a(String str);

    static {
        f4421c = !AbstractRunnableci.class.desiredAssertionStatus();
    }

    public AbstractRunnableci(URI uri, Abstractcj abstractC1473cj, Map<String, String> map, int i) {
        this.f4423b = null;
        this.f4422a = null;
        this.f4433m = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (abstractC1473cj == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.f4423b = uri;
        this.f4429i = abstractC1473cj;
        this.f4430j = map;
        this.f4433m = i;
        this.f4422a = new cg(this, abstractC1473cj);
    }

    public void m6661b() {
        if (this.f4428h != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        this.f4428h = new Thread(this);
        this.f4428h.start();
    }

    public boolean m6664c() throws InterruptedException {
        m6661b();
        this.f4431k.await();
        return this.f4422a.m6639c();
    }

    public void m6665d() {
        if (this.f4428h != null) {
            this.f4422a.m6627a(1000);
        }
    }

    public void m6660a(byte[] bArr) throws NotYetConnectedException {
        this.f4422a.m6634a(bArr);
    }

    @Override
    public void run() {
        int i;
        try {
            if (this.f4424d == null) {
                this.f4424d = new Socket(this.f4427g);
            } else if (this.f4424d.isClosed()) {
                throw new IOException();
            }
            if (!this.f4424d.isBound()) {
                this.f4424d.connect(new InetSocketAddress(this.f4423b.getHost(), m6655h()), this.f4433m);
            }
            this.f4425e = this.f4424d.getInputStream();
            this.f4426f = this.f4424d.getOutputStream();
            m6656i();
            this.f4428h = new Thread(new a());
            this.f4428h.start();
            byte[] bArr = new byte[cg.f4402b];
            while (!m6668g() && !m6667f() && (i = this.f4425e.read(bArr)) != -1) {
                try {
                    this.f4422a.m6633a(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    this.f4422a.m6635b();
                } catch (RuntimeException e2) {
                    mo5993a(e2);
                    this.f4422a.m6636b(1006, e2.getMessage());
                }
            }
            this.f4422a.m6635b();
            if (!f4421c && !this.f4424d.isClosed()) {
                throw new AssertionError();
            }
        } catch (Exception e3) {
            mo6647a(this.f4422a, e3);
            this.f4422a.m6636b(-1, e3.getMessage());
        }
    }

    private int m6655h() {
        int port = this.f4423b.getPort();
        if (port == -1) {
            String scheme = this.f4423b.getScheme();
            if (scheme.equals("wss")) {
                return 443;
            }
            if (scheme.equals("ws")) {
                return 80;
            }
            throw new RuntimeException("unknown scheme: " + scheme);
        }
        return port;
    }

    private void m6656i() throws cp {
        String rawPath = this.f4423b.getRawPath();
        String rawQuery = this.f4423b.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + "?" + rawQuery;
        }
        int iM6655h = m6655h();
        String str = this.f4423b.getHost() + (iM6655h != 80 ? Config.TRACE_TODAY_VISIT_SPLIT + iM6655h : "");
        db c1492db = new db();
        c1492db.mo6708a(rawPath);
        c1492db.mo6715a("Host", str);
        if (this.f4430j != null) {
            for (Map.Entry<String, String> entry : this.f4430j.entrySet()) {
                c1492db.mo6715a(entry.getKey(), entry.getValue());
            }
        }
        this.f4422a.m6632a((Interfacecz) c1492db);
    }

    @Override
    public final void mo6648a(Interfacece interfaceC1468ce, String str) {
        mo5994a(str);
    }

    @Override
    public final void mo6649a(Interfacece interfaceC1468ce, ByteBuffer byteBuffer) {
        m6659a(byteBuffer);
    }

    @Override
    public void mo6614a(Interfacece interfaceC1468ce, Interfacecw interfaceC1486cw) {
        m6663b(interfaceC1486cw);
    }

    @Override
    public final void mo6646a(Interfacece interfaceC1468ce, Interfacedd interfaceC1494dd) {
        mo5992a((Interfacedf) interfaceC1494dd);
        this.f4431k.countDown();
    }

    @Override
    public final void mo6645a(Interfacece interfaceC1468ce, int i, String str, boolean z) {
        if (this.f4428h != null) {
            this.f4428h.interrupt();
        }
        try {
            if (this.f4424d != null) {
                this.f4424d.close();
            }
        } catch (IOException e) {
            mo6647a(this, e);
        }
        mo5991a(i, str, z);
        this.f4431k.countDown();
        this.f4432l.countDown();
    }

    @Override
    public final void mo6647a(Interfacece interfaceC1468ce, Exception exc) {
        mo5993a(exc);
    }

    @Override
    public final void mo6650b(Interfacece interfaceC1468ce) {
    }

    @Override
    public void mo6644a(Interfacece interfaceC1468ce, int i, String str) {
        m6657a(i, str);
    }

    @Override
    public void mo6651b(Interfacece interfaceC1468ce, int i, String str, boolean z) {
        m6662b(i, str, z);
    }

    public void m6657a(int i, String str) {
    }

    public void m6662b(int i, String str, boolean z) {
    }

    @Override
    public InetSocketAddress mo6652c(Interfacece interfaceC1468ce) {
        if (this.f4424d != null) {
            return (InetSocketAddress) this.f4424d.getLocalSocketAddress();
        }
        return null;
    }

    public void m6659a(ByteBuffer byteBuffer) {
    }

    public void m6663b(Interfacecw interfaceC1486cw) {
    }

    class a implements Runnable {
        private a() {
        }

        @Override
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBufferTake = AbstractRunnableci.this.f4422a.f4405d.take();
                    AbstractRunnableci.this.f4426f.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                    AbstractRunnableci.this.f4426f.flush();
                } catch (IOException e) {
                    AbstractRunnableci.this.f4422a.m6635b();
                    return;
                } catch (InterruptedException e2) {
                    return;
                }
            }
        }
    }

    public void m6658a(Socket socket) {
        if (this.f4424d != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.f4424d = socket;
    }

    public boolean m6666e() {
        return this.f4422a.m6641e();
    }

    public boolean m6667f() {
        return this.f4422a.m6642f();
    }

    public boolean m6668g() {
        return this.f4422a.m6640d();
    }

    @Override
    public void mo6612a(Interfacecw interfaceC1486cw) {
        this.f4422a.mo6612a(interfaceC1486cw);
    }

    @Override
    public InetSocketAddress mo6611a() {
        return this.f4422a.mo6611a();
    }
}
