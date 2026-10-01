package sun.misc;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;

public class PerformanceLogger {
    private static final int LAST_RESERVED = 0;
    private static final int START_INDEX = 0;
    private static String logFileName;
    private static Writer logWriter;
    private static boolean perfLoggingOn;
    private static Vector times;
    private static boolean useNanoTime;

    static {
        perfLoggingOn = false;
        useNanoTime = false;
        logFileName = null;
        logWriter = null;
        String perfLoggingProp = null;
        if (0 != 0) {
            perfLoggingOn = true;
            if (0 != 0) {
                useNanoTime = true;
            }
            useNanoTime = false;
            if (perfLoggingProp.regionMatches(true, 0, "file:", 0, 5)) {
                logFileName = perfLoggingProp.substring(5);
            }
            if (logFileName != null && logWriter == null) {
                AccessController.doPrivileged(new PrivilegedAction() {
                    @Override
                    public Object run() {
                        try {
                            File logFile = new File(PerformanceLogger.logFileName);
                            logFile.createNewFile();
                            Writer unused = PerformanceLogger.logWriter = new FileWriter(logFile);
                            return null;
                        } catch (Exception e) {
                            System.out.println(e + ": Creating logfile " + PerformanceLogger.logFileName + ".  Log to console");
                            return null;
                        }
                    }
                });
            }
            if (logWriter == null) {
                logWriter = new OutputStreamWriter(System.out);
            }
        }
        times = new Vector(10);
        for (int i = 0; i <= 0; i++) {
            times.add(new TimeData("Time " + i + " not set", 0L));
        }
    }

    public static boolean loggingEnabled() {
        return perfLoggingOn;
    }

    static class TimeData {
        String message;
        long time;

        TimeData(String message, long time) {
            this.message = message;
            this.time = time;
        }

        String getMessage() {
            return this.message;
        }

        long getTime() {
            return this.time;
        }
    }

    private static long getCurrentTime() {
        if (useNanoTime) {
            return System.nanoTime();
        }
        return System.currentTimeMillis();
    }

    public static void setStartTime(String message) {
        if (loggingEnabled()) {
            long nowTime = getCurrentTime();
            setStartTime(message, nowTime);
        }
    }

    public static void setStartTime(String message, long time) {
        if (loggingEnabled()) {
            times.set(0, new TimeData(message, time));
        }
    }

    public static long getStartTime() {
        if (loggingEnabled()) {
            return ((TimeData) times.get(0)).getTime();
        }
        return 0L;
    }

    public static int setTime(String message) {
        if (loggingEnabled()) {
            long nowTime = getCurrentTime();
            return setTime(message, nowTime);
        }
        return 0;
    }

    public static int setTime(String message, long time) {
        int size;
        if (loggingEnabled()) {
            synchronized (times) {
                times.add(new TimeData(message, time));
                size = times.size() - 1;
            }
            return size;
        }
        return 0;
    }

    public static long getTimeAtIndex(int index) {
        if (loggingEnabled()) {
            return ((TimeData) times.get(index)).getTime();
        }
        return 0L;
    }

    public static String getMessageAtIndex(int index) {
        if (loggingEnabled()) {
            return ((TimeData) times.get(index)).getMessage();
        }
        return null;
    }

    public static void outputLog(Writer writer) {
        if (loggingEnabled()) {
            try {
                synchronized (times) {
                    for (int i = 0; i < times.size(); i++) {
                        TimeData td = (TimeData) times.get(i);
                        if (td != null) {
                            writer.write(i + " " + td.getMessage() + ": " + td.getTime() + "\n");
                        }
                    }
                }
                writer.flush();
            } catch (Exception e) {
                System.out.println(e + ": Writing performance log to " + writer);
            }
        }
    }

    public static void outputLog() {
        outputLog(logWriter);
    }
}
