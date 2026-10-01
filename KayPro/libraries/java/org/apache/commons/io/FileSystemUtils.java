package org.apache.commons.io;

import com.baidu.mobstat.Config;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

@Deprecated
public class FileSystemUtils {

    private static final String f5378DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();

    private static final int f5379OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        int i = 3;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property == null) {
                throw new IOException("os.name not found");
            }
            String lowerCase = property.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains("windows")) {
                i = 1;
            } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("openbsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
                i = 2;
            } else if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                str = "/usr/xpg4/bin/df";
            } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                i = 0;
            }
            f5379OS = i;
            f5378DF = str;
        } catch (Exception e) {
            i = -1;
        }
    }

    @Deprecated
    public static long freeSpace(String str) throws IOException {
        return INSTANCE.freeSpaceOS(str, f5379OS, false, -1L);
    }

    @Deprecated
    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j) throws IOException {
        return freeSpaceKb(new File(".").getAbsolutePath(), j);
    }

    @Deprecated
    public static long freeSpaceKb(String str) throws IOException {
        return freeSpaceKb(str, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j) throws IOException {
        return INSTANCE.freeSpaceOS(str, f5379OS, true, j);
    }

    long freeSpaceOS(String str, int i, boolean z, long j) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        switch (i) {
            case 0:
                throw new IllegalStateException("Unsupported operating system");
            case 1:
                return z ? freeSpaceWindows(str, j) / 1024 : freeSpaceWindows(str, j);
            case 2:
                return freeSpaceUnix(str, z, false, j);
            case 3:
                return freeSpaceUnix(str, z, true, j);
            default:
                throw new IllegalStateException("Exception caught when determining operating system");
        }
    }

    long freeSpaceUnix(String str, boolean z, boolean z2, long j) throws Throwable {
        StringTokenizer stringTokenizer;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = z ? "-" + Config.APP_KEY : "-";
        if (z2) {
            str2 = str2 + "P";
        }
        List<String> listPerformCommand = performCommand(str2.length() > 1 ? new String[]{f5378DF, str2, str} : new String[]{f5378DF, str}, 3, j);
        if (listPerformCommand.size() < 2) {
            throw new IOException("Command line '" + f5378DF + "' did not return info as expected for path '" + str + "'- response was " + listPerformCommand);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(listPerformCommand.get(1), " ");
        if (stringTokenizer2.countTokens() >= 4) {
            stringTokenizer2.nextToken();
            stringTokenizer = stringTokenizer2;
        } else {
            if (stringTokenizer2.countTokens() != 1 || listPerformCommand.size() < 3) {
                throw new IOException("Command line '" + f5378DF + "' did not return data as expected for path '" + str + "'- check path is valid");
            }
            stringTokenizer = new StringTokenizer(listPerformCommand.get(2), " ");
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return parseBytes(stringTokenizer.nextToken(), str);
    }

    long freeSpaceWindows(String str, long j) throws Throwable {
        String strNormalize = FilenameUtils.normalize(str, false);
        if (strNormalize == null) {
            throw new IllegalArgumentException(str);
        }
        String str2 = (strNormalize.length() <= 0 || strNormalize.charAt(0) == '\"') ? strNormalize : "\"" + strNormalize + "\"";
        List<String> listPerformCommand = performCommand(new String[]{"cmd.exe", "/C", "dir /a /-c " + str2}, Integer.MAX_VALUE, j);
        for (int size = listPerformCommand.size() - 1; size >= 0; size--) {
            String str3 = listPerformCommand.get(size);
            if (str3.length() > 0) {
                return parseDir(str3, str2);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + str2 + "'");
    }

    Process openProcess(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    long parseBytes(String str, String str2) throws IOException {
        try {
            long j = Long.parseLong(str);
            if (j < 0) {
                throw new IOException("Command line '" + f5378DF + "' did not find free space in response for path '" + str2 + "'- check path is valid");
            }
            return j;
        } catch (NumberFormatException e) {
            throw new IOException("Command line '" + f5378DF + "' did not return numeric data as expected for path '" + str2 + "'- check path is valid", e);
        }
    }

    long parseDir(String str, String str2) throws IOException {
        int i;
        int i2;
        int i3 = 0;
        int length = str.length() - 1;
        while (true) {
            if (length < 0) {
                i = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i = length + 1;
                break;
            }
            length--;
        }
        while (true) {
            if (length < 0) {
                i2 = 0;
                break;
            }
            char cCharAt = str.charAt(length);
            if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                i2 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
        }
        StringBuilder sb = new StringBuilder(str.substring(i2, i));
        while (i3 < sb.length()) {
            if (sb.charAt(i3) == ',' || sb.charAt(i3) == '.') {
                sb.deleteCharAt(i3);
                i3--;
            }
            i3++;
        }
        return parseBytes(sb.toString(), str2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:85:? A[SYNTHETIC] */
    List<String> performCommand(String[] strArr, int i, long j) throws Throwable {
        InputStream errorStream;
        BufferedReader bufferedReader;
        OutputStream outputStream;
        InputStream inputStream;
        Process processOpenProcess;
        InterruptedException e;
        ArrayList arrayList = new ArrayList(20);
        try {
            Thread threadStart = ThreadMonitor.start(j);
            processOpenProcess = openProcess(strArr);
            try {
                inputStream = processOpenProcess.getInputStream();
                try {
                    outputStream = processOpenProcess.getOutputStream();
                    try {
                        errorStream = processOpenProcess.getErrorStream();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
                            try {
                                for (String line = bufferedReader.readLine(); line != null && arrayList.size() < i; line = bufferedReader.readLine()) {
                                    arrayList.add(line.toLowerCase(Locale.ENGLISH).trim());
                                }
                                processOpenProcess.waitFor();
                                ThreadMonitor.stop(threadStart);
                                if (processOpenProcess.exitValue() != 0) {
                                    throw new IOException("Command line returned OS error code '" + processOpenProcess.exitValue() + "' for command " + Arrays.asList(strArr));
                                }
                                if (arrayList.isEmpty()) {
                                    throw new IOException("Command line did not return any info for command " + Arrays.asList(strArr));
                                }
                                bufferedReader.close();
                                inputStream.close();
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                        outputStream = null;
                                    } catch (InterruptedException e2) {
                                        e = e2;
                                        bufferedReader = null;
                                        inputStream = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedReader = null;
                                        inputStream = null;
                                        IOUtils.closeQuietly(inputStream);
                                        IOUtils.closeQuietly(outputStream);
                                        IOUtils.closeQuietly(errorStream);
                                        IOUtils.closeQuietly((Reader) bufferedReader);
                                        if (processOpenProcess != null) {
                                            throw th;
                                        }
                                        processOpenProcess.destroy();
                                        throw th;
                                    }
                                }
                                if (errorStream != null) {
                                    errorStream.close();
                                    errorStream = null;
                                }
                                IOUtils.closeQuietly((InputStream) null);
                                IOUtils.closeQuietly(outputStream);
                                IOUtils.closeQuietly(errorStream);
                                IOUtils.closeQuietly((Reader) null);
                                if (processOpenProcess != null) {
                                    processOpenProcess.destroy();
                                }
                                return arrayList;
                            } catch (InterruptedException e3) {
                                e = e3;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (InterruptedException e4) {
                            e = e4;
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = null;
                        }
                    } catch (InterruptedException e5) {
                        e = e5;
                        errorStream = null;
                        bufferedReader = null;
                    } catch (Throwable th4) {
                        th = th4;
                        errorStream = null;
                        bufferedReader = null;
                    }
                } catch (InterruptedException e6) {
                    e = e6;
                    errorStream = null;
                    bufferedReader = null;
                    outputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    errorStream = null;
                    bufferedReader = null;
                    outputStream = null;
                }
            } catch (InterruptedException e7) {
                e = e7;
                errorStream = null;
                bufferedReader = null;
                outputStream = null;
                inputStream = null;
            } catch (Throwable th6) {
                th = th6;
                errorStream = null;
                bufferedReader = null;
                outputStream = null;
                inputStream = null;
            }
        } catch (InterruptedException e8) {
            e = e8;
            errorStream = null;
            bufferedReader = null;
            outputStream = null;
            inputStream = null;
            processOpenProcess = null;
        } catch (Throwable th7) {
            th = th7;
            errorStream = null;
            bufferedReader = null;
            outputStream = null;
            inputStream = null;
            processOpenProcess = null;
        }
        try {
            throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j, e);
        } catch (Throwable th8) {
            th = th8;
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(errorStream);
            IOUtils.closeQuietly((Reader) bufferedReader);
            if (processOpenProcess != null) {
                throw th;
            }
            processOpenProcess.destroy();
            throw th;
        }
    }
}
