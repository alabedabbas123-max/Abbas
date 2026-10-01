package com.baidu.mobstat;

import java.net.InetSocketAddress;

public abstract class Abstractcf implements Interfacech {
    @Override
    public void mo6616a(Interfacece interfaceC1468ce, Interfacecy interfaceC1488cy, Interfacedf interfaceC1496df) throws cn {
    }

    @Override
    public void mo6615a(Interfacece interfaceC1468ce, Interfacecy interfaceC1488cy) throws cn {
    }

    @Override
    public void mo6614a(Interfacece interfaceC1468ce, Interfacecw interfaceC1486cw) {
    }

    @Override
    public void mo6617b(Interfacece interfaceC1468ce, Interfacecw interfaceC1486cw) {
        cx c1487cx = new cx(interfaceC1486cw);
        c1487cx.mo6700a(Interfacecw.a.PONG);
        interfaceC1468ce.mo6612a(c1487cx);
    }

    @Override
    public void mo6618c(Interfacece interfaceC1468ce, Interfacecw interfaceC1486cw) {
    }

    @Override
    public String mo6613a(Interfacece interfaceC1468ce) throws cn {
        InetSocketAddress inetSocketAddressMo6611a = interfaceC1468ce.mo6611a();
        if (inetSocketAddressMo6611a == null) {
            throw new cp("socket not bound");
        }
        return "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"" + inetSocketAddressMo6611a.getPort() + "\" /></cross-domain-policy>\u0000";
    }
}
