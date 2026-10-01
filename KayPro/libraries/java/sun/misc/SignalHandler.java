package sun.misc;

public interface SignalHandler {
    public static final SignalHandler SIG_DFL = new NativeSignalHandler(0);
    public static final SignalHandler SIG_IGN = new NativeSignalHandler(1);

    void handle(Signal signal);
}
