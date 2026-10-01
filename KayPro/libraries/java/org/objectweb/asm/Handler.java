package org.objectweb.asm;

class Handler {

    Label f6536a;

    Label f6537b;

    Label f6538c;

    String f6539d;

    int f6540e;

    Handler f6541f;

    Handler() {
    }

    static Handler m8954a(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        handler.f6541f = m8954a(handler.f6541f, label, label2);
        int i = handler.f6536a.f6553c;
        int i2 = handler.f6537b.f6553c;
        int i3 = label.f6553c;
        int i4 = label2 == null ? Integer.MAX_VALUE : label2.f6553c;
        if (i3 >= i2 || i4 <= i) {
            return handler;
        }
        if (i3 <= i) {
            if (i4 >= i2) {
                return handler.f6541f;
            }
            handler.f6536a = label2;
            return handler;
        }
        if (i4 >= i2) {
            handler.f6537b = label;
            return handler;
        }
        Handler handler2 = new Handler();
        handler2.f6536a = label2;
        handler2.f6537b = handler.f6537b;
        handler2.f6538c = handler.f6538c;
        handler2.f6539d = handler.f6539d;
        handler2.f6540e = handler.f6540e;
        handler2.f6541f = handler.f6541f;
        handler.f6537b = label;
        handler.f6541f = handler2;
        return handler;
    }
}
