package sun.misc;

final class NativeSignalHandler implements SignalHandler {
    private final long handler;

    private static native void handle0(int i, long j);

    long getHandler() {
        return this.handler;
    }

    NativeSignalHandler(long handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Signal sig) {
        handle0(sig.getNumber(), this.handler);
    }
}
