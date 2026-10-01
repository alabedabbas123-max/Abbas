package com.baidu.mobstat;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

public abstract class Abstractcj {

    public static int f4435a = 1000;

    public static int f4436b = 64;

    public static final byte[] f4437c = di.m6738a("<policy-file-request/>\u0000");

    protected Interfacece.b f4438d = null;

    protected Interfacecw.a f4439e = null;

    public enum a {
        NONE,
        ONEWAY,
        TWOWAY
    }

    public enum b {
        MATCHED,
        NOT_MATCHED
    }

    public abstract b mo6673a(Interfacecy interfaceC1488cy, Interfacedf interfaceC1496df) throws cp;

    public abstract Interfacecz mo6674a(Interfacecz interfaceC1489cz) throws cp;

    public abstract ByteBuffer mo6675a(Interfacecw interfaceC1486cw);

    public abstract List<Interfacecw> mo6678a(ByteBuffer byteBuffer, boolean z);

    public abstract void mo6679a();

    public abstract a mo6681b();

    public abstract Abstractcj mo6682c();

    public abstract List<Interfacecw> mo6683c(ByteBuffer byteBuffer) throws cn;

    public static ByteBuffer m6670a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b2 = 48;
        while (byteBuffer.hasRemaining()) {
            byte b3 = byteBuffer.get();
            byteBufferAllocate.put(b3);
            if (b2 == 13 && b3 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            b2 = b3;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    public static String m6671b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM6670a = m6670a(byteBuffer);
        if (byteBufferM6670a == null) {
            return null;
        }
        return di.m6736a(byteBufferM6670a.array(), 0, byteBufferM6670a.limit());
    }

    public static Interfaceda m6669a(ByteBuffer byteBuffer, Interfacece.b bVar) throws cp, cm {
        Interfaceda interfaceC1491da;
        String strM6671b = m6671b(byteBuffer);
        if (strM6671b == null) {
            throw new cm(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strM6671b.split(" ", 3);
        if (strArrSplit.length != 3) {
            throw new cp();
        }
        if (bVar == Interfacece.b.CLIENT) {
            dc c1493dc = new dc();
            dc c1493dc2 = c1493dc;
            c1493dc2.mo6718a(Short.parseShort(strArrSplit[1]));
            c1493dc2.mo6717a(strArrSplit[2]);
            interfaceC1491da = c1493dc;
        } else {
            db c1492db = new db();
            c1492db.mo6708a(strArrSplit[1]);
            interfaceC1491da = c1492db;
        }
        String strM6671b2 = m6671b(byteBuffer);
        while (strM6671b2 != null && strM6671b2.length() > 0) {
            String[] strArrSplit2 = strM6671b2.split(Config.TRACE_TODAY_VISIT_SPLIT, 2);
            if (strArrSplit2.length != 2) {
                throw new cp("not an http header");
            }
            interfaceC1491da.mo6715a(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            strM6671b2 = m6671b(byteBuffer);
        }
        if (strM6671b2 == null) {
            throw new cm();
        }
        return interfaceC1491da;
    }

    public List<ByteBuffer> m6676a(Interfacedd interfaceC1494dd, Interfacece.b bVar) {
        return m6677a(interfaceC1494dd, bVar, true);
    }

    public List<ByteBuffer> m6677a(Interfacedd interfaceC1494dd, Interfacece.b bVar, boolean z) {
        StringBuilder sb = new StringBuilder(100);
        if (interfaceC1494dd instanceof Interfacecy) {
            sb.append("GET ");
            sb.append(((Interfacecy) interfaceC1494dd).mo6707a());
            sb.append(" HTTP/1.1");
        } else if (interfaceC1494dd instanceof Interfacedf) {
            sb.append("HTTP/1.1 101 ").append(((Interfacedf) interfaceC1494dd).mo6716a());
        } else {
            throw new RuntimeException("unknown role");
        }
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        Iterator<String> itMo6720b = interfaceC1494dd.mo6720b();
        while (itMo6720b.hasNext()) {
            String next = itMo6720b.next();
            String strMo6719b = interfaceC1494dd.mo6719b(next);
            sb.append(next);
            sb.append(": ");
            sb.append(strMo6719b);
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        byte[] bArrM6740b = di.m6740b(sb.toString());
        byte[] bArrMo6722c = z ? interfaceC1494dd.mo6722c() : null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((bArrMo6722c == null ? 0 : bArrMo6722c.length) + bArrM6740b.length);
        byteBufferAllocate.put(bArrM6740b);
        if (bArrMo6722c != null) {
            byteBufferAllocate.put(bArrMo6722c);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    public Interfacedd m6684d(ByteBuffer byteBuffer) throws cp {
        return m6669a(byteBuffer, this.f4438d);
    }

    public int m6672a(int i) throws cn {
        if (i < 0) {
            throw new cn(1002, "Negative count");
        }
        return i;
    }

    public void m6680a(Interfacece.b bVar) {
        this.f4438d = bVar;
    }
}
