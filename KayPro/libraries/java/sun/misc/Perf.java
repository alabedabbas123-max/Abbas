package sun.misc;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.Permission;
import java.security.PrivilegedAction;

public final class Perf {
    private static final int PERF_MODE_RO = 0;
    private static final int PERF_MODE_RW = 1;
    private static Perf instance;

    private native ByteBuffer attach(String str, int i, int i2) throws IOException, IllegalArgumentException;

    public native void detach(ByteBuffer byteBuffer);

    private static native void registerNatives();

    public native ByteBuffer createByteArray(String str, int i, int i2, byte[] bArr, int i3);

    public native ByteBuffer createLong(String str, int i, int i2, long j);

    public native long highResCounter();

    public native long highResFrequency();

    private Perf() {
    }

    public static class GetPerfAction implements PrivilegedAction<Perf> {
        @Override
        public Perf run() {
            return Perf.getPerf();
        }
    }

    public static Perf getPerf() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            Permission perm = new RuntimePermission("sun.misc.Perf.getPerf");
            security.checkPermission(perm);
        }
        return instance;
    }

    public ByteBuffer attach(int lvmid, String mode) throws IOException, IllegalArgumentException {
        if (mode.compareTo("r") == 0) {
            return attachImpl(null, lvmid, 0);
        }
        if (mode.compareTo("rw") == 0) {
            return attachImpl(null, lvmid, 1);
        }
        throw new IllegalArgumentException("unknown mode");
    }

    public ByteBuffer attach(String user, int lvmid, String mode) throws IOException, IllegalArgumentException {
        if (mode.compareTo("r") == 0) {
            return attachImpl(user, lvmid, 0);
        }
        if (mode.compareTo("rw") == 0) {
            return attachImpl(user, lvmid, 1);
        }
        throw new IllegalArgumentException("unknown mode");
    }

    private ByteBuffer attachImpl(String user, int lvmid, int mode) throws IOException, IllegalArgumentException {
        final ByteBuffer b = attach(user, lvmid, mode);
        if (lvmid == 0) {
            return b;
        }
        ByteBuffer dup = b.duplicate();
        Cleaner.create(dup, new Runnable() {
            static final boolean $assertionsDisabled = false;

            @Override
            public void run() {
                try {
                    Perf.instance.detach(b);
                } catch (Throwable th) {
                }
            }
        });
        return dup;
    }

    public ByteBuffer createString(String name, int variability, int units, String value, int maxLength) {
        byte[] v = getBytes(value);
        byte[] v1 = new byte[v.length + 1];
        System.arraycopy(v, 0, v1, 0, v.length);
        v1[v.length] = 0;
        return createByteArray(name, variability, units, v1, Math.max(v1.length, maxLength));
    }

    public ByteBuffer createString(String name, int variability, int units, String value) {
        byte[] v = getBytes(value);
        byte[] v1 = new byte[v.length + 1];
        System.arraycopy(v, 0, v1, 0, v.length);
        v1[v.length] = 0;
        return createByteArray(name, variability, units, v1, v1.length);
    }

    private static byte[] getBytes(String s) {
        try {
            byte[] bytes = s.getBytes("UTF-8");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    static {
        registerNatives();
        instance = new Perf();
    }
}
