package sun.misc;

import java.util.Hashtable;

public final class Signal {
    private static Hashtable handlers = new Hashtable(4);
    private static Hashtable signals = new Hashtable(4);
    private String name;
    private int number;

    private static native int findSignal(String str);

    private static native long handle0(int i, long j);

    private static native void raise0(int i);

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof Signal)) {
            return false;
        }
        Signal other1 = (Signal) other;
        return this.name.equals(other1.name) && this.number == other1.number;
    }

    public int hashCode() {
        return this.number;
    }

    public String toString() {
        return "SIG" + this.name;
    }

    public Signal(String name) {
        int iFindSignal = findSignal(name);
        this.number = iFindSignal;
        this.name = name;
        if (iFindSignal < 0) {
            throw new IllegalArgumentException("Unknown signal: " + name);
        }
    }

    public static synchronized SignalHandler handle(Signal sig, SignalHandler handler) throws IllegalArgumentException {
        long newH = handler instanceof NativeSignalHandler ? ((NativeSignalHandler) handler).getHandler() : 2L;
        long oldH = handle0(sig.number, newH);
        if (oldH == -1) {
            throw new IllegalArgumentException("Signal already used by VM or OS: " + sig);
        }
        signals.put(new Integer(sig.number), sig);
        synchronized (handlers) {
            SignalHandler oldHandler = (SignalHandler) handlers.get(sig);
            handlers.remove(sig);
            if (newH == 2) {
                handlers.put(sig, handler);
            }
            if (oldH == 0) {
                return SignalHandler.SIG_DFL;
            }
            if (oldH == 1) {
                return SignalHandler.SIG_IGN;
            }
            if (oldH == 2) {
                return oldHandler;
            }
            return new NativeSignalHandler(oldH);
        }
    }

    public static void raise(Signal sig) throws IllegalArgumentException {
        if (handlers.get(sig) == null) {
            throw new IllegalArgumentException("Unhandled signal: " + sig);
        }
        raise0(sig.number);
    }

    private static void dispatch(int number) {
        final Signal sig = (Signal) signals.get(new Integer(number));
        final SignalHandler handler = (SignalHandler) handlers.get(sig);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                handler.handle(sig);
            }
        };
        if (handler != null) {
            new Thread(runnable, sig + " handler").start();
        }
    }
}
