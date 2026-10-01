package sun.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class VM {

    @Deprecated
    public static final int STATE_GREEN = 1;

    @Deprecated
    public static final int STATE_RED = 3;

    @Deprecated
    public static final int STATE_YELLOW = 2;
    private static boolean suspended = false;
    private static volatile boolean booted = false;
    private static long directMemory = 67108864;
    private static boolean defaultAllowArraySyntax = false;
    private static boolean allowArraySyntax = false;
    private static volatile int finalRefCount = 0;
    private static volatile int peakFinalRefCount = 0;
    private static Map<Integer, Thread.State> threadStateMap = null;
    private static Map<Integer, String> threadStateNames = null;

    private static native void getThreadStateValues(int[][] iArr, String[][] strArr);

    private static native void initialize();

    static {
        initialize();
    }

    @Deprecated
    public static boolean threadsSuspended() {
        return suspended;
    }

    public static boolean allowThreadSuspension(ThreadGroup g, boolean b) {
        return g.allowThreadSuspension(b);
    }

    @Deprecated
    public static boolean suspendThreads() {
        suspended = true;
        return true;
    }

    @Deprecated
    public static void unsuspendThreads() {
        suspended = false;
    }

    @Deprecated
    public static void unsuspendSomeThreads() {
    }

    @Deprecated
    public static final int getState() {
        return 1;
    }

    @Deprecated
    public static void registerVMNotification(VMNotification n) {
    }

    @Deprecated
    public static void asChange(int as_old, int as_new) {
    }

    @Deprecated
    public static void asChange_otherthread(int as_old, int as_new) {
    }

    public static void booted() {
        booted = true;
    }

    public static boolean isBooted() {
        return booted;
    }

    public static long maxDirectMemory() {
        if (booted) {
            return directMemory;
        }
        Properties p = System.getProperties();
        String s = (String) p.remove("sun.nio.MaxDirectMemorySize");
        System.setProperties(p);
        if (s != null) {
            if (s.equals("-1")) {
                directMemory = Runtime.getRuntime().maxMemory();
            } else {
                long l = Long.parseLong(s);
                if (l > -1) {
                    directMemory = l;
                }
            }
        }
        return directMemory;
    }

    public static boolean allowArraySyntax() {
        boolean z;
        if (!booted) {
            String s = System.getProperty("sun.lang.ClassLoader.allowArraySyntax");
            if (s == null) {
                z = defaultAllowArraySyntax;
            } else {
                z = Boolean.parseBoolean(s);
            }
            allowArraySyntax = z;
        }
        return allowArraySyntax;
    }

    public static void initializeOSEnvironment() {
    }

    public static int getFinalRefCount() {
        return finalRefCount;
    }

    public static int getPeakFinalRefCount() {
        return peakFinalRefCount;
    }

    public static void addFinalRefCount(int n) {
        finalRefCount += n;
        if (finalRefCount > peakFinalRefCount) {
            peakFinalRefCount = finalRefCount;
        }
    }

    public static Thread.State toThreadState(int threadStatus) {
        initThreadStateMap();
        Thread.State s = threadStateMap.get(Integer.valueOf(threadStatus));
        if (s == null) {
            return Thread.State.RUNNABLE;
        }
        return s;
    }

    private static synchronized void initThreadStateMap() {
        if (threadStateMap != null) {
            return;
        }
        Thread.State[] ts = Thread.State.values();
        int[][] vmThreadStateValues = new int[ts.length][];
        String[][] vmThreadStateNames = new String[ts.length][];
        getThreadStateValues(vmThreadStateValues, vmThreadStateNames);
        threadStateMap = new HashMap();
        threadStateNames = new HashMap();
        for (int i = 0; i < ts.length; i++) {
            String state = ts[i].name();
            int[] values = null;
            String[] names = null;
            for (int j = 0; j < ts.length; j++) {
                if (vmThreadStateNames[j][0].startsWith(state)) {
                    values = vmThreadStateValues[j];
                    names = vmThreadStateNames[j];
                }
            }
            if (values == null) {
                throw new InternalError("No VM thread state mapped to " + state);
            }
            if (values.length != names.length) {
                throw new InternalError("VM thread state values and names  mapped to " + state + ": length not matched");
            }
            for (int k = 0; k < values.length; k++) {
                threadStateMap.put(Integer.valueOf(values[k]), ts[i]);
                threadStateNames.put(Integer.valueOf(values[k]), names[k]);
            }
        }
    }
}
