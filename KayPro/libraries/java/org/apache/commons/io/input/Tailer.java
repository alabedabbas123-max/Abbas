package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

public class Tailer implements Runnable {
    private static final int DEFAULT_BUFSIZE = 4096;
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final Charset cset;
    private final long delayMillis;

    private final boolean f5392end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;

    private volatile boolean f5393run;

    public Tailer(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        this.f5393run = true;
        this.file = file;
        this.delayMillis = j;
        this.f5392end = z;
        this.inbuf = new byte[i];
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z2;
        this.cset = charset;
    }

    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    public Tailer(File file, TailerListener tailerListener, long j) {
        this(file, tailerListener, j, false);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z) {
        this(file, tailerListener, j, z, 4096);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, int i) {
        this(file, tailerListener, j, z, false, i);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        this(file, tailerListener, j, z, z2, 4096);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        this(file, DEFAULT_CHARSET, tailerListener, j, z, z2, i);
    }

    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        Tailer tailer = new Tailer(file, charset, tailerListener, j, z, z2, i);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public static Tailer create(File file, TailerListener tailerListener) {
        return create(file, tailerListener, 1000L, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j) {
        return create(file, tailerListener, j, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z) {
        return create(file, tailerListener, j, z, 4096);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, int i) {
        return create(file, tailerListener, j, z, false, i);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        return create(file, tailerListener, j, z, z2, 4096);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        return create(file, DEFAULT_CHARSET, tailerListener, j, z, z2, i);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private long readLines(RandomAccessFile randomAccessFile) throws Throwable {
        Throwable th;
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long j = filePointer;
            boolean z = false;
            long filePointer2 = filePointer;
            while (getRun() && (i = randomAccessFile.read(this.inbuf)) != -1) {
                long j2 = j;
                for (int i2 = 0; i2 < i; i2++) {
                    byte b = this.inbuf[i2];
                    switch (b) {
                        case 10:
                            this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.cset));
                            byteArrayOutputStream.reset();
                            j2 = ((long) i2) + filePointer2 + 1;
                            z = false;
                            break;
                        case 11:
                        case 12:
                        default:
                            if (z) {
                                this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.cset));
                                byteArrayOutputStream.reset();
                                j2 = ((long) i2) + filePointer2 + 1;
                                z = false;
                            }
                            byteArrayOutputStream.write(b);
                            break;
                        case 13:
                            if (z) {
                                byteArrayOutputStream.write(13);
                            }
                            z = true;
                            break;
                    }
                }
                j = j2;
                filePointer2 = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(j);
            if (this.listener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) this.listener).endOfFileReached();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return j;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (byteArrayOutputStream != null) {
                    if (th != null) {
                        byteArrayOutputStream.close();
                    } else {
                        byteArrayOutputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    public long getDelay() {
        return this.delayMillis;
    }

    public File getFile() {
        return this.file;
    }

    protected boolean getRun() {
        return this.f5393run;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8 A[Catch: FileNotFoundException -> 0x00af, InterruptedException -> 0x00c4, Exception -> 0x00cc, all -> 0x016d, TRY_LEAVE, TryCatch #8 {all -> 0x016d, blocks: (B:45:0x0096, B:59:0x00b0, B:56:0x00ab, B:67:0x00c8, B:64:0x00c0, B:57:0x00ae), top: B:136:0x0096 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.apache.commons.io.input.Tailer] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override
    public void run() throws Throwable {
        ?? r8;
        ?? r2;
        ?? r0;
        ?? r1;
        Throwable th;
        Throwable th2;
        ?? randomAccessFile;
        long jLastModified;
        ?? randomAccessFile2 = 0;
        long jLastModified2 = 0;
        long lines = 0;
        while (getRun() && randomAccessFile2 == 0) {
            try {
                try {
                    try {
                        randomAccessFile2 = new RandomAccessFile(this.file, "r");
                    } catch (FileNotFoundException e) {
                        this.listener.fileNotFound();
                        randomAccessFile2 = randomAccessFile2;
                    }
                    if (randomAccessFile2 == 0) {
                        Thread.sleep(this.delayMillis);
                    } else {
                        lines = this.f5392end ? this.file.length() : 0L;
                        jLastModified2 = this.file.lastModified();
                        randomAccessFile2.seek(lines);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r2 = randomAccessFile2;
                }
            } catch (InterruptedException e2) {
                e = e2;
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
                r8 = randomAccessFile2;
            }
        }
        long j = jLastModified2;
        ?? r9 = randomAccessFile2;
        while (getRun()) {
            try {
                boolean zIsFileNewer = FileUtils.isFileNewer(this.file, j);
                long length = this.file.length();
                if (length < lines) {
                    this.listener.fileRotated();
                    try {
                        randomAccessFile = new RandomAccessFile(this.file, "r");
                        try {
                            try {
                                readLines(r9);
                            } catch (IOException e4) {
                                this.listener.handle(e4);
                            }
                            if (r9 != 0) {
                                try {
                                    try {
                                        r9.close();
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r2 = randomAccessFile;
                                        r8 = r2;
                                        if (r8 != 0) {
                                            try {
                                                r8.close();
                                            } catch (IOException e5) {
                                                this.listener.handle(e5);
                                            }
                                        }
                                        stop();
                                        throw th;
                                    }
                                } catch (FileNotFoundException e6) {
                                    lines = 0;
                                    try {
                                        this.listener.fileNotFound();
                                        Thread.sleep(this.delayMillis);
                                        r9 = randomAccessFile;
                                    } catch (InterruptedException e7) {
                                        e = e7;
                                        randomAccessFile2 = randomAccessFile;
                                        Thread.currentThread().interrupt();
                                        this.listener.handle(e);
                                        r1 = randomAccessFile2;
                                        if (randomAccessFile2 != 0) {
                                            try {
                                                randomAccessFile2.close();
                                                r1 = randomAccessFile2;
                                            } catch (IOException e8) {
                                                this.listener.handle(e8);
                                                r1 = e8;
                                            }
                                        }
                                        stop();
                                        randomAccessFile2 = r1;
                                        return;
                                    } catch (Exception e9) {
                                        e = e9;
                                        randomAccessFile2 = randomAccessFile;
                                        this.listener.handle(e);
                                        r0 = randomAccessFile2;
                                        if (randomAccessFile2 != 0) {
                                            try {
                                                randomAccessFile2.close();
                                                r0 = randomAccessFile2;
                                            } catch (IOException e10) {
                                                this.listener.handle(e10);
                                                r0 = e10;
                                            }
                                        }
                                        stop();
                                        randomAccessFile2 = r0;
                                        return;
                                    }
                                } catch (InterruptedException e11) {
                                    e = e11;
                                    randomAccessFile2 = randomAccessFile;
                                    Thread.currentThread().interrupt();
                                    this.listener.handle(e);
                                    r1 = randomAccessFile2;
                                    if (randomAccessFile2 != 0) {
                                        randomAccessFile2.close();
                                        r1 = randomAccessFile2;
                                    }
                                    stop();
                                    randomAccessFile2 = r1;
                                    return;
                                } catch (Exception e12) {
                                    e = e12;
                                    randomAccessFile2 = randomAccessFile;
                                    this.listener.handle(e);
                                    r0 = randomAccessFile2;
                                    if (randomAccessFile2 != 0) {
                                        randomAccessFile2.close();
                                        r0 = randomAccessFile2;
                                    }
                                    stop();
                                    randomAccessFile2 = r0;
                                    return;
                                }
                            }
                            lines = 0;
                            r9 = randomAccessFile;
                        } catch (Throwable th6) {
                            th = null;
                            th2 = th6;
                            randomAccessFile = randomAccessFile;
                            if (r9 != 0) {
                                if (th != null) {
                                    r9.close();
                                } else {
                                    r9.close();
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th7) {
                        th = null;
                        th2 = th7;
                        randomAccessFile = r9;
                    }
                } else {
                    if (length > lines) {
                        lines = readLines(r9);
                        jLastModified = this.file.lastModified();
                    } else if (zIsFileNewer) {
                        r9.seek(0L);
                        lines = readLines(r9);
                        jLastModified = this.file.lastModified();
                    } else {
                        jLastModified = j;
                    }
                    if (this.reOpen && r9 != 0) {
                        r9.close();
                    }
                    Thread.sleep(this.delayMillis);
                    r9 = r9;
                    if (getRun() && this.reOpen) {
                        r9 = r9;
                        randomAccessFile2 = new RandomAccessFile(this.file, "r");
                        try {
                            randomAccessFile2.seek(lines);
                            r9 = randomAccessFile2;
                        } catch (InterruptedException e13) {
                            e = e13;
                            Thread.currentThread().interrupt();
                            this.listener.handle(e);
                            r1 = randomAccessFile2;
                            if (randomAccessFile2 != 0) {
                                randomAccessFile2.close();
                                r1 = randomAccessFile2;
                            }
                            stop();
                            randomAccessFile2 = r1;
                            return;
                        } catch (Exception e14) {
                            e = e14;
                            this.listener.handle(e);
                            r0 = randomAccessFile2;
                            if (randomAccessFile2 != 0) {
                                randomAccessFile2.close();
                                r0 = randomAccessFile2;
                            }
                            stop();
                            randomAccessFile2 = r0;
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            r8 = randomAccessFile2;
                            if (r8 != 0) {
                                r8.close();
                            }
                            stop();
                            throw th;
                        }
                    }
                    r9 = r9;
                    j = jLastModified;
                }
            } catch (InterruptedException e15) {
                e = e15;
                randomAccessFile2 = r9;
            } catch (Exception e16) {
                e = e16;
                randomAccessFile2 = r9;
            } catch (Throwable th9) {
                th = th9;
                r8 = r9;
            }
            return;
        }
        if (r9 != 0) {
            try {
                r9.close();
            } catch (IOException e17) {
                this.listener.handle(e17);
            }
        }
        stop();
    }

    public void stop() {
        this.f5393run = false;
    }
}
