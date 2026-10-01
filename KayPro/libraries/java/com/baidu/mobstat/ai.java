package com.baidu.mobstat;

import android.text.TextUtils;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

class ai {

    private static final ByteBuffer f4051c = ByteBuffer.allocate(0);

    private a f4052a;

    private b f4053b;

    public interface a {
        void mo5987a();

        void mo5988a(String str);

        void mo5989a(boolean z);

        void mo5990b();
    }

    private Socket m5983c() {
        SSLSocketFactory socketFactory;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        } catch (Exception e) {
            socketFactory = null;
        }
        if (socketFactory == null) {
            return null;
        }
        try {
            return socketFactory.createSocket();
        } catch (Exception e2) {
            return null;
        }
    }

    public ai(URI uri, a aVar) throws c {
        this.f4052a = aVar;
        try {
            this.f4053b = new b(uri, 5000, uri.toString().startsWith("wss://") ? m5983c() : null);
            this.f4053b.m6664c();
        } catch (InterruptedException e) {
            throw new c(e);
        }
    }

    public void m5984a() {
        if (this.f4053b != null) {
            this.f4053b.m6665d();
        }
    }

    public void m5985a(JSONObject jSONObject) throws NotYetConnectedException {
        if (this.f4053b != null) {
            this.f4053b.m6660a(jSONObject.toString().getBytes());
        }
    }

    public boolean m5986b() {
        return (this.f4053b.m6667f() || this.f4053b.m6668g() || this.f4053b.m6666e()) ? false : true;
    }

    class b extends AbstractRunnableci {
        public b(URI uri, int i, Socket socket) throws InterruptedException {
            super(uri, new cl(), null, i);
            m6658a(socket);
        }

        @Override
        public void mo5992a(Interfacedf interfaceC1496df) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onOpen");
            }
            if (ai.this.f4052a != null) {
                ai.this.f4052a.mo5987a();
            }
        }

        @Override
        public void mo5994a(String str) {
            JSONObject jSONObject;
            int iIntValue;
            String string = null;
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onMessage: " + str);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception e) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        string = jSONObject.getString("type");
                    } catch (Exception e2) {
                    }
                    if (!TextUtils.isEmpty(string)) {
                        if (string.equals("deploy")) {
                            try {
                                ai.this.f4052a.mo5988a(((JSONObject) jSONObject.get("data")).toString());
                                return;
                            } catch (Exception e3) {
                                return;
                            }
                        }
                        try {
                            iIntValue = ((Integer) ((JSONObject) jSONObject.get("data")).get("status")).intValue();
                        } catch (Exception e4) {
                            iIntValue = -1;
                        }
                        switch (iIntValue) {
                            case 801020:
                                bb.m6313c().m6300a("autotrace: connect established");
                                al.m6009a().m6050a(2);
                                break;
                            case 801021:
                                bb.m6313c().m6300a("autotrace: connect failed, connect has been established");
                                al.m6009a().m6051a(5, "already connect");
                                break;
                            case 801024:
                                bb.m6313c().m6300a("autotrace: connect confirm");
                                al.m6009a().m6050a(3);
                                if (ai.this.f4052a != null) {
                                    ai.this.f4052a.mo5990b();
                                }
                                break;
                        }
                    }
                }
            }
        }

        @Override
        public void mo5991a(int i, String str, boolean z) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onClose,  reason:" + str + ", remote:" + z);
            }
            bb.m6313c().m6300a("autotrace: connect closed, server:" + z + " reason:" + str);
            al.m6009a().m6051a(5, "remote:" + z + "|reason:" + str);
            if (ai.this.f4052a != null) {
                ai.this.f4052a.mo5989a(z);
            }
        }

        @Override
        public void mo5993a(Exception exc) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onError");
            }
        }
    }

    public class c extends IOException {
        public c(Throwable th) {
            super(th.getMessage());
        }
    }
}
