package com.almlkaide.kaypro.android.dx.command.dexer;

import com.baidu.android.common.util.BuildConfig;
import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.DexException;
import com.almlkaide.kaypro.android.dex.DexFormat;
import com.almlkaide.kaypro.android.dex.util.FileUtils;
import com.almlkaide.kaypro.android.dx.Version;
import com.almlkaide.kaypro.android.dx.command.UsageException;
import com.almlkaide.kaypro.android.dx.merge.CollisionPolicy;
import com.almlkaide.kaypro.android.dx.merge.DexMerger;
import com.almlkaide.kaypro.android.dx.cf.code.SimException;
import com.almlkaide.kaypro.android.dx.cf.direct.ClassPathOpener;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.direct.StdAttributeFactory;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.dex.file.ClassDefItem;
import com.almlkaide.kaypro.android.dx.dex.file.DexFile;
import com.almlkaide.kaypro.android.dx.dex.file.EncodedMethod;
import com.almlkaide.kaypro.android.dx.dex.cf.CfOptions;
import com.almlkaide.kaypro.android.dx.dex.cf.CfTranslator;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

public class Main {
    private static boolean $assertionsDisabled = false;
    private static final Attributes.Name CREATED_BY;
    private static final String DEX_EXTENSION = ".dex";
    private static final String DEX_PREFIX = "classes";
    private static final String IN_RE_CORE_CLASSES = "Ill-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application's project, when using an IDE (such as\nEclipse). If you are sure you're not intentionally defining a\ncore class, then this is the most likely explanation of what's\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n";
    private static final String[] JAVAX_CORE;
    private static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";
    private static final int MAX_FIELD_ADDED_DURING_DEX_CREATION = 9;
    private static final int MAX_METHOD_ADDED_DURING_DEX_CREATION = 2;
    private volatile boolean anyFilesProcessed;
    private Arguments args;
    private ExecutorService classDefItemConsumer;
    private ExecutorService classTranslatorPool;
    private final DxContext context;
    private ExecutorService dexOutPool;
    private DexFile outputDex;
    private TreeMap<String, byte[]> outputResources;
    private AtomicInteger errors = new AtomicInteger(0);
    private final List<byte[]> libraryDexBuffers = new ArrayList();
    private List<Future<Boolean>> addToDexFutures = new ArrayList();
    private List<Future<byte[]>> dexOutputFutures = new ArrayList();
    private Object dexRotationLock = new Object();
    private int maxMethodIdsInProcess = 0;
    private int maxFieldIdsInProcess = 0;
    private long minimumFileAge = 0;
    private Set<String> classesInMainDex = (Set) null;
    private List<byte[]> dexOutputArrays = new ArrayList();
    private OutputStreamWriter humanOutWriter = (OutputStreamWriter) null;

    private static class StopProcessing extends RuntimeException {
    }

    static {
        try {
            $assertionsDisabled = !Class.forName("com.almlkaide.kaypro.android.dx.command.dexer.Main").desiredAssertionStatus();
            CREATED_BY = new Attributes.Name("Created-By");
            JAVAX_CORE = new String[]{"accessibility", "crypto", "imageio", "management", "naming", "net", "print", "rmi", "security", "sip", "sound", "sql", "swing", "transaction", "xml"};
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public Main(DxContext dxContext) {
        this.context = dxContext;
    }

    public static void main(String[] strArr) throws Throwable {
        DxContext dxContext = new DxContext();
        Arguments arguments = new Arguments(dxContext);
        arguments.parse(strArr);
        int iRunDx = new Main(dxContext).runDx(arguments);
        if (iRunDx != 0) {
            System.exit(iRunDx);
        }
    }

    public static void clearInternTables() {
        Prototype.clearInternTable();
        RegisterSpec.clearInternTable();
        CstType.clearInternTable();
        Type.clearInternTable();
    }

    public static int m7144run(Arguments arguments) throws IOException {
        return new Main(new DxContext()).runDx(arguments);
    }

    public int runDx(Arguments arguments) throws IOException {
        this.errors.set(0);
        this.libraryDexBuffers.clear();
        this.args = arguments;
        this.args.makeOptionsObjects();
        OutputStream outputStreamOpenOutput = (OutputStream) null;
        if (this.args.humanOutName != null) {
            outputStreamOpenOutput = openOutput(this.args.humanOutName);
            this.humanOutWriter = new OutputStreamWriter(outputStreamOpenOutput);
        }
        OutputStream outputStream = outputStreamOpenOutput;
        try {
            if (this.args.multiDex) {
                return runMultiDex();
            }
            return runMonoDex();
        } finally {
            closeOutput(outputStream);
        }
    }

    private int runMonoDex() throws IOException {
        File file;
        File file2 = (File) null;
        if (!this.args.incremental) {
            file = file2;
        } else {
            if (this.args.outName == null) {
                this.context.f5013err.println("error: no incremental output name specified");
                return -1;
            }
            File file3 = new File(this.args.outName);
            if (file3.exists()) {
                this.minimumFileAge = file3.lastModified();
            }
            file = file3;
        }
        if (!processAllFiles()) {
            return 1;
        }
        if (this.args.incremental && !this.anyFilesProcessed) {
            return 0;
        }
        byte[] bArrWriteDex = (byte[]) null;
        if ((!this.outputDex.isEmpty() || this.args.humanOutName != null) && (bArrWriteDex = writeDex(this.outputDex)) == null) {
            return 2;
        }
        if (this.args.incremental) {
            bArrWriteDex = mergeIncremental(bArrWriteDex, file);
        }
        byte[] bArrMergeLibraryDexBuffers = mergeLibraryDexBuffers(bArrWriteDex);
        if (this.args.jarOutput) {
            this.outputDex = (DexFile) null;
            if (bArrMergeLibraryDexBuffers != null) {
                this.outputResources.put(DexFormat.DEX_IN_JAR_NAME, bArrMergeLibraryDexBuffers);
            }
            if (!createJar(this.args.outName)) {
                return 3;
            }
        } else if (bArrMergeLibraryDexBuffers != null && this.args.outName != null) {
            OutputStream outputStreamOpenOutput = openOutput(this.args.outName);
            outputStreamOpenOutput.write(bArrMergeLibraryDexBuffers);
            closeOutput(outputStreamOpenOutput);
        }
        return 0;
    }

    private int runMultiDex() throws Throwable {
        if (!$assertionsDisabled && this.args.incremental) {
            throw new AssertionError();
        }
        if (this.args.mainDexListFile != null) {
            this.classesInMainDex = new HashSet();
            readPathsFromFile(this.args.mainDexListFile, this.classesInMainDex);
        }
        this.dexOutPool = Executors.newFixedThreadPool(this.args.numThreads);
        if (!processAllFiles()) {
            return 1;
        }
        if (!this.libraryDexBuffers.isEmpty()) {
            throw new DexException("Library dex files are not supported in multi-dex mode");
        }
        if (this.outputDex != null) {
            this.dexOutputFutures.add(this.dexOutPool.submit(new DexWriter(this, this.outputDex)));
            this.outputDex = (DexFile) null;
        }
        try {
            this.dexOutPool.shutdown();
            if (!this.dexOutPool.awaitTermination(600L, TimeUnit.SECONDS)) {
                throw new RuntimeException("Timed out waiting for dex writer threads.");
            }
            Iterator<Future<byte[]>> it = this.dexOutputFutures.iterator();
            while (it.hasNext()) {
                this.dexOutputArrays.add(it.next().get());
            }
            if (this.args.jarOutput) {
                for (int i = 0; i < this.dexOutputArrays.size(); i++) {
                    this.outputResources.put(getDexFileName(i), this.dexOutputArrays.get(i));
                }
                return !createJar(this.args.outName) ? 3 : 0;
            }
            if (this.args.outName == null) {
                return 0;
            }
            File file = new File(this.args.outName);
            if (!$assertionsDisabled && !file.isDirectory()) {
                throw new AssertionError();
            }
            for (int i2 = 0; i2 < this.dexOutputArrays.size(); i2++) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, getDexFileName(i2)));
                try {
                    fileOutputStream.write(this.dexOutputArrays.get(i2));
                    closeOutput(fileOutputStream);
                } catch (Throwable th) {
                    closeOutput(fileOutputStream);
                    throw th;
                }
            }
            return 0;
        } catch (InterruptedException e) {
            this.dexOutPool.shutdownNow();
            throw new RuntimeException("A dex writer thread has been interrupted.");
        } catch (Exception e2) {
            this.dexOutPool.shutdownNow();
            throw new RuntimeException("Unexpected exception in dex writer thread");
        }
    }

    private static String getDexFileName(int i) {
        return i == 0 ? DexFormat.DEX_IN_JAR_NAME : new StringBuffer().append(new StringBuffer().append(DEX_PREFIX).append(i + 1).toString()).append(DEX_EXTENSION).toString();
    }

    public static void readPathsFromFile(String str, Collection<String> collection) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = (BufferedReader) null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        collection.add(fixPath(line));
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader == null) {
                        throw th;
                    }
                    bufferedReader.close();
                    throw th;
                }
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }

    private byte[] mergeIncremental(byte[] bArr, File file) throws IOException {
        Dex c1679DexMerge = (Dex) null;
        Dex c1679Dex = (Dex) null;
        if (bArr != null) {
            c1679DexMerge = new Dex(bArr);
        }
        if (file.exists()) {
            c1679Dex = new Dex(file);
        }
        if (c1679DexMerge == null && c1679Dex == null) {
            return (byte[]) null;
        }
        if (c1679DexMerge == null) {
            c1679DexMerge = c1679Dex;
        } else if (c1679Dex != null) {
            c1679DexMerge = new DexMerger(new Dex[]{c1679DexMerge, c1679Dex}, CollisionPolicy.KEEP_FIRST, this.context).merge();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c1679DexMerge.writeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] mergeLibraryDexBuffers(byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            arrayList.add(new Dex(bArr));
        }
        Iterator<byte[]> it = this.libraryDexBuffers.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dex(it.next()));
        }
        if (arrayList.isEmpty()) {
            return (byte[]) null;
        }
        return new DexMerger((Dex[]) arrayList.toArray(new Dex[arrayList.size()]), CollisionPolicy.FAIL, this.context).merge().getBytes();
    }

    private boolean processAllFiles() {
        createDexFile();
        if (this.args.jarOutput) {
            this.outputResources = new TreeMap<>();
        }
        this.anyFilesProcessed = false;
        String[] strArr = this.args.fileNames;
        Arrays.sort(strArr);
        this.classTranslatorPool = new ThreadPoolExecutor(this.args.numThreads, this.args.numThreads, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(this.args.numThreads * 2, true), new ThreadPoolExecutor.CallerRunsPolicy());
        this.classDefItemConsumer = Executors.newSingleThreadExecutor();
        try {
            if (this.args.mainDexListFile != null) {
                ClassPathOpener.FileNameFilter mainDexListFilter = this.args.strictNameCheck ? new MainDexListFilter(this) : new BestEffortMainDexListFilter(this);
                for (String str : strArr) {
                    processOne(str, mainDexListFilter);
                }
                if (this.dexOutputFutures.size() > 0) {
                    throw new DexException(new StringBuffer().append(new StringBuffer().append("Too many classes in ").append("--main-dex-list").toString()).append(", main dex capacity exceeded").toString());
                }
                if (this.args.minimalMainDex) {
                    synchronized (this.dexRotationLock) {
                        while (true) {
                            if (this.maxMethodIdsInProcess <= 0 && this.maxFieldIdsInProcess <= 0) {
                                break;
                            }
                            try {
                                this.dexRotationLock.wait();
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    rotateDexFile();
                }
                RemoveModuleInfoFilter removeModuleInfoFilter = new RemoveModuleInfoFilter(new NotFilter(mainDexListFilter));
                for (String str2 : strArr) {
                    processOne(str2, removeModuleInfoFilter);
                }
            } else {
                RemoveModuleInfoFilter removeModuleInfoFilter2 = new RemoveModuleInfoFilter(ClassPathOpener.acceptAll);
                for (String str3 : strArr) {
                    processOne(str3, removeModuleInfoFilter2);
                }
            }
        } catch (StopProcessing e2) {
        }
        try {
            this.classTranslatorPool.shutdown();
            this.classTranslatorPool.awaitTermination(600L, TimeUnit.SECONDS);
            this.classDefItemConsumer.shutdown();
            this.classDefItemConsumer.awaitTermination(600L, TimeUnit.SECONDS);
            Iterator<Future<Boolean>> it = this.addToDexFutures.iterator();
            while (it.hasNext()) {
                try {
                    it.next().get();
                } catch (ExecutionException e3) {
                    if (this.errors.incrementAndGet() < 10) {
                        if (this.args.debug) {
                            this.context.f5013err.println("Uncaught translation error:");
                            e3.getCause().printStackTrace(this.context.f5013err);
                        } else {
                            this.context.f5013err.println(new StringBuffer().append("Uncaught translation error: ").append(e3.getCause()).toString());
                        }
                    } else {
                        throw new InterruptedException("Too many errors");
                    }
                }
            }
            int i = this.errors.get();
            if (i != 0) {
                this.context.f5013err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(i).append(" error").toString()).append(i == 1 ? "" : "s").toString()).append("; aborting").toString());
                return false;
            }
            if (this.args.incremental && !this.anyFilesProcessed) {
                return true;
            }
            if (!this.anyFilesProcessed && !this.args.emptyOk) {
                this.context.f5013err.println("no classfiles specified");
                return false;
            }
            if (this.args.optimize && this.args.statistics) {
                this.context.codeStatistics.dumpStatistics(this.context.f5014out);
            }
            return true;
        } catch (InterruptedException e4) {
            this.classTranslatorPool.shutdownNow();
            this.classDefItemConsumer.shutdownNow();
            throw new RuntimeException("Translation has been interrupted", e4);
        } catch (Exception e5) {
            this.classTranslatorPool.shutdownNow();
            this.classDefItemConsumer.shutdownNow();
            e5.printStackTrace(this.context.f5014out);
            throw new RuntimeException("Unexpected exception in translator thread.", e5);
        }
    }

    private void createDexFile() {
        this.outputDex = new DexFile(this.args.dexOptions);
        if (this.args.dumpWidth != 0) {
            this.outputDex.setDumpWidth(this.args.dumpWidth);
        }
    }

    public void rotateDexFile() {
        if (this.outputDex != null) {
            if (this.dexOutPool != null) {
                this.dexOutputFutures.add(this.dexOutPool.submit(new DexWriter(this, this.outputDex)));
            } else {
                this.dexOutputArrays.add(writeDex(this.outputDex));
            }
        }
        createDexFile();
    }

    private void processOne(String str, ClassPathOpener.FileNameFilter fileNameFilter) {
        if (new ClassPathOpener(str, true, fileNameFilter, new FileBytesConsumer(this)).process()) {
            updateStatus(true);
        }
    }

    public void updateStatus(boolean z) {
        this.anyFilesProcessed |= z;
    }

    public boolean processFileBytes(String str, long j, byte[] bArr) {
        boolean zEndsWith = str.endsWith(".class");
        boolean zEquals = str.equals(DexFormat.DEX_IN_JAR_NAME);
        boolean z = this.outputResources != null;
        if (!zEndsWith && !zEquals && !z) {
            if (!this.args.verbose) {
                return false;
            }
            this.context.f5014out.println(new StringBuffer().append("ignored resource ").append(str).toString());
            return false;
        }
        if (this.args.verbose) {
            this.context.f5014out.println(new StringBuffer().append(new StringBuffer().append("processing ").append(str).toString()).append("...").toString());
        }
        String strFixPath = fixPath(str);
        if (zEndsWith) {
            if (z && this.args.keepClassesInJar) {
                synchronized (this.outputResources) {
                    this.outputResources.put(strFixPath, bArr);
                }
            }
            if (j < this.minimumFileAge) {
                return true;
            }
            processClass(strFixPath, bArr);
            return false;
        }
        if (zEquals) {
            synchronized (this.libraryDexBuffers) {
                this.libraryDexBuffers.add(bArr);
            }
            return true;
        }
        synchronized (this.outputResources) {
            this.outputResources.put(strFixPath, bArr);
        }
        return true;
    }

    private boolean processClass(String str, byte[] bArr) {
        if (!this.args.coreLibrary) {
            checkClassName(str);
        }
        try {
            new DirectClassFileConsumer(this, str, bArr, (Future) null).call(new ClassParserTask(this, str, bArr).call());
            return true;
        } catch (ParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("Exception parsing classes", e2);
        }
    }

    public DirectClassFile parseClass(String str, byte[] bArr) {
        DirectClassFile directClassFile = new DirectClassFile(bArr, str, this.args.cfOptions.strictNameCheck);
        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        directClassFile.getMagic();
        return directClassFile;
    }

    public ClassDefItem translateClass(byte[] bArr, DirectClassFile directClassFile) {
        try {
            return CfTranslator.translate(this.context, directClassFile, bArr, this.args.cfOptions, this.args.dexOptions, this.outputDex);
        } catch (ParseException e) {
            this.context.f5013err.println("\ntrouble processing:");
            if (this.args.debug) {
                e.printStackTrace(this.context.f5013err);
            } else {
                e.printContext(this.context.f5013err);
            }
            this.errors.incrementAndGet();
            return (ClassDefItem) null;
        }
    }

    public boolean addClassToDex(ClassDefItem classDefItem) {
        synchronized (this.outputDex) {
            this.outputDex.m7167add(classDefItem);
        }
        return true;
    }

    private void checkClassName(String str) {
        boolean z = true;
        if (!str.startsWith("java/")) {
            if (str.startsWith("javax/")) {
                int iIndexOf = str.indexOf(47, 6);
                if (iIndexOf != -1) {
                    z = Arrays.binarySearch(JAVAX_CORE, str.substring(6, iIndexOf)) >= 0;
                }
            } else {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        this.context.f5013err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("\ntrouble processing \"").append(str).toString()).append("\":\n\n").toString()).append(IN_RE_CORE_CLASSES).toString());
        this.errors.incrementAndGet();
        throw new StopProcessing();
    }

    public byte[] writeDex(DexFile dexFile) {
        byte[] dex = (byte[]) null;
        try {
            try {
                if (this.args.methodToDump != null) {
                    dexFile.toDex((Writer) null, false);
                    dumpMethod(dexFile, this.args.methodToDump, this.humanOutWriter);
                } else {
                    dex = dexFile.toDex(this.humanOutWriter, this.args.verboseDump);
                }
                if (this.args.statistics) {
                    this.context.f5014out.println(dexFile.getStatistics().toHuman());
                }
                return dex;
            } finally {
                if (this.humanOutWriter != null) {
                    this.humanOutWriter.flush();
                }
            }
        } catch (Exception e) {
            if (this.args.debug) {
                this.context.f5013err.println("\ntrouble writing output:");
                e.printStackTrace(this.context.f5013err);
            } else {
                this.context.f5013err.println(new StringBuffer().append("\ntrouble writing output: ").append(e.getMessage()).toString());
            }
            return (byte[]) null;
        }
    }

    private boolean createJar(String str) {
        try {
            Manifest manifestMakeManifest = makeManifest();
            OutputStream outputStreamOpenOutput = openOutput(str);
            JarOutputStream jarOutputStream = new JarOutputStream(outputStreamOpenOutput, manifestMakeManifest);
            try {
                for (Map.Entry<String, byte[]> entry : this.outputResources.entrySet()) {
                    String key = entry.getKey();
                    byte[] value = entry.getValue();
                    JarEntry jarEntry = new JarEntry(key);
                    int length = value.length;
                    if (this.args.verbose) {
                        this.context.f5014out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("writing ").append(key).toString()).append("; size ").toString()).append(length).toString()).append("...").toString());
                    }
                    jarEntry.setSize(length);
                    jarOutputStream.putNextEntry(jarEntry);
                    jarOutputStream.write(value);
                    jarOutputStream.closeEntry();
                }
                return true;
            } finally {
                jarOutputStream.finish();
                jarOutputStream.flush();
                closeOutput(outputStreamOpenOutput);
            }
        } catch (Exception e) {
            if (this.args.debug) {
                this.context.f5013err.println("\ntrouble writing output:");
                e.printStackTrace(this.context.f5013err);
            } else {
                this.context.f5013err.println(new StringBuffer().append("\ntrouble writing output: ").append(e.getMessage()).toString());
            }
            return false;
        }
    }

    private Manifest makeManifest() throws IOException {
        Manifest manifest;
        Attributes mainAttributes;
        String string;
        byte[] bArr = this.outputResources.get(MANIFEST_NAME);
        if (bArr == null) {
            manifest = new Manifest();
            mainAttributes = manifest.getMainAttributes();
            mainAttributes.put(Attributes.Name.MANIFEST_VERSION, BuildConfig.VERSION_NAME);
        } else {
            manifest = new Manifest(new ByteArrayInputStream(bArr));
            mainAttributes = manifest.getMainAttributes();
            this.outputResources.remove(MANIFEST_NAME);
        }
        String value = mainAttributes.getValue(CREATED_BY);
        if (value == null) {
            string = "";
        } else {
            string = new StringBuffer().append(value).append(" + ").toString();
        }
        mainAttributes.put(CREATED_BY, new StringBuffer().append(string).append(new StringBuffer().append("dx ").append(Version.VERSION).toString()).toString());
        mainAttributes.putValue("Dex-Location", DexFormat.DEX_IN_JAR_NAME);
        return manifest;
    }

    private OutputStream openOutput(String str) throws IOException {
        return (str.equals("-") || str.startsWith("-.")) ? this.context.f5014out : new FileOutputStream(str);
    }

    private void closeOutput(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.flush();
            if (outputStream != this.context.f5014out) {
                outputStream.close();
            }
        }
    }

    public static String fixPath(String str) {
        if (File.separatorChar == '\\') {
            str = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, '/');
        }
        int iLastIndexOf = str.lastIndexOf("/./");
        if (iLastIndexOf != -1) {
            return str.substring(iLastIndexOf + 3);
        }
        if (str.startsWith("./")) {
            return str.substring(2);
        }
        return str;
    }

    private void dumpMethod(DexFile dexFile, String str, OutputStreamWriter outputStreamWriter) {
        boolean zEndsWith = str.endsWith("*");
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf == str.length() - 1) {
            this.context.f5013err.println(new StringBuffer().append("bogus fully-qualified method name: ").append(str).toString());
            return;
        }
        String strReplace = str.substring(0, iLastIndexOf).replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
        String strSubstring = str.substring(iLastIndexOf + 1);
        ClassDefItem classOrNull = dexFile.getClassOrNull(strReplace);
        if (classOrNull == null) {
            this.context.f5013err.println(new StringBuffer().append("no such class: ").append(strReplace).toString());
            return;
        }
        String strSubstring2 = zEndsWith ? strSubstring.substring(0, strSubstring.length() - 1) : strSubstring;
        ArrayList<EncodedMethod> methods = classOrNull.getMethods();
        TreeMap treeMap = new TreeMap();
        for (EncodedMethod encodedMethod : methods) {
            String string = encodedMethod.getName().getString();
            if ((zEndsWith && string.startsWith(strSubstring2)) || (!zEndsWith && string.equals(strSubstring2))) {
                treeMap.put(encodedMethod.getRef().getNat(), encodedMethod);
            }
        }
        if (treeMap.size() == 0) {
            this.context.f5013err.println(new StringBuffer().append("no such method: ").append(str).toString());
            return;
        }
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        for (EncodedMethod encodedMethod2 : treeMap.values()) {
            encodedMethod2.debugPrint(printWriter, this.args.verboseDump);
            CstString sourceFile = classOrNull.getSourceFile();
            if (sourceFile != null) {
                printWriter.println(new StringBuffer().append("  source file: ").append(sourceFile.toQuoted()).toString());
            }
            Annotations methodAnnotations = classOrNull.getMethodAnnotations(encodedMethod2.getRef());
            AnnotationsList parameterAnnotations = classOrNull.getParameterAnnotations(encodedMethod2.getRef());
            if (methodAnnotations != null) {
                printWriter.println("  method annotations:");
                Iterator<Annotation> it = methodAnnotations.getAnnotations().iterator();
                while (it.hasNext()) {
                    printWriter.println(new StringBuffer().append("    ").append(it.next()).toString());
                }
            }
            if (parameterAnnotations != null) {
                printWriter.println("  parameter annotations:");
                int size = parameterAnnotations.size();
                for (int i = 0; i < size; i++) {
                    printWriter.println(new StringBuffer().append("    parameter ").append(i).toString());
                    Iterator<Annotation> it2 = parameterAnnotations.m7179get(i).getAnnotations().iterator();
                    while (it2.hasNext()) {
                        printWriter.println(new StringBuffer().append("      ").append(it2.next()).toString());
                    }
                }
            }
        }
        printWriter.flush();
    }

    private static class NotFilter implements ClassPathOpener.FileNameFilter {
        private final ClassPathOpener.FileNameFilter filter;

        NotFilter(ClassPathOpener.FileNameFilter fileNameFilter) {
            this.filter = fileNameFilter;
        }

        @Override
        public boolean accept(String str) {
            return !this.filter.accept(str);
        }
    }

    private static class RemoveModuleInfoFilter implements ClassPathOpener.FileNameFilter {
        protected final ClassPathOpener.FileNameFilter delegate;

        public RemoveModuleInfoFilter(ClassPathOpener.FileNameFilter fileNameFilter) {
            this.delegate = fileNameFilter;
        }

        @Override
        public boolean accept(String str) {
            return this.delegate.accept(str) && !"module-info.class".equals(str);
        }
    }

    private class MainDexListFilter implements ClassPathOpener.FileNameFilter {
        private final Main this$0;

        @Override
        public boolean accept(String str) {
            if (!str.endsWith(".class")) {
                return true;
            }
            return this.this$0.classesInMainDex.contains(Main.fixPath(str));
        }

        public MainDexListFilter(Main main) {
            this.this$0 = main;
        }
    }

    private class BestEffortMainDexListFilter implements ClassPathOpener.FileNameFilter {

        Map<String, List<String>> f5015map = new HashMap();
        private final Main this$0;

        public BestEffortMainDexListFilter(Main main) {
            this.this$0 = main;
            Iterator it = this.this$0.classesInMainDex.iterator();
            while (it.hasNext()) {
                String strFixPath = Main.fixPath((String) it.next());
                String simpleName = getSimpleName(strFixPath);
                List<String> arrayList = this.f5015map.get(simpleName);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f5015map.put(simpleName, arrayList);
                }
                arrayList.add(strFixPath);
            }
        }

        @Override
        public boolean accept(String str) {
            if (!str.endsWith(".class")) {
                return true;
            }
            String strFixPath = Main.fixPath(str);
            List<String> list = this.f5015map.get(getSimpleName(strFixPath));
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (strFixPath.endsWith(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }

        private String getSimpleName(String str) {
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                return str.substring(iLastIndexOf + 1);
            }
            return str;
        }
    }

    public static class Arguments {
        private static final String INCREMENTAL_OPTION = "--incremental";
        private static final String INPUT_LIST_OPTION = "--input-list";
        private static final String MAIN_DEX_LIST_OPTION = "--main-dex-list";
        private static final String MINIMAL_MAIN_DEX_OPTION = "--minimal-main-dex";
        private static final String MULTI_DEX_OPTION = "--multi-dex";
        private static final String NUM_THREADS_OPTION = "--num-threads";
        public boolean allowAllInterfaceMethodInvokes;
        public CfOptions cfOptions;
        public final DxContext context;
        public boolean coreLibrary;
        public boolean debug;
        public DexOptions dexOptions;
        public String dontOptimizeListFile;
        public int dumpWidth;
        public boolean emptyOk;
        public String[] fileNames;
        public boolean forceJumbo;
        public String humanOutName;
        public boolean incremental;
        private List<String> inputList;
        public boolean jarOutput;
        public boolean keepClassesInJar;
        public boolean localInfo;
        public String mainDexListFile;
        public int maxNumberOfIdxPerDex;
        public String methodToDump;
        public int minSdkVersion;
        public boolean minimalMainDex;
        public boolean multiDex;
        public int numThreads;
        public boolean optimize;
        public String optimizeListFile;
        public String outName;
        private boolean outputIsDirectDex;
        private boolean outputIsDirectory;
        public int positionInfo;
        public boolean statistics;
        public boolean strictNameCheck;
        public boolean verbose;
        public boolean verboseDump;
        public boolean warnings;

        public Arguments(DxContext dxContext) {
            this.debug = false;
            this.warnings = true;
            this.verbose = false;
            this.verboseDump = false;
            this.coreLibrary = false;
            this.methodToDump = (String) null;
            this.dumpWidth = 0;
            this.outName = (String) null;
            this.humanOutName = (String) null;
            this.strictNameCheck = true;
            this.emptyOk = false;
            this.jarOutput = false;
            this.keepClassesInJar = false;
            this.minSdkVersion = 13;
            this.positionInfo = 2;
            this.localInfo = true;
            this.incremental = false;
            this.forceJumbo = false;
            this.allowAllInterfaceMethodInvokes = false;
            this.optimize = true;
            this.optimizeListFile = (String) null;
            this.dontOptimizeListFile = (String) null;
            this.numThreads = 1;
            this.multiDex = false;
            this.mainDexListFile = (String) null;
            this.minimalMainDex = false;
            this.maxNumberOfIdxPerDex = 65536;
            this.inputList = (List) null;
            this.outputIsDirectory = false;
            this.outputIsDirectDex = false;
            this.context = dxContext;
        }

        public Arguments() {
            this(new DxContext());
        }

        private static class ArgumentsParser {
            private final String[] arguments;
            private String current;
            private int index = 0;
            private String lastValue;

            public ArgumentsParser(String[] strArr) {
                this.arguments = strArr;
            }

            public String getCurrent() {
                return this.current;
            }

            public String getLastValue() {
                return this.lastValue;
            }

            public boolean getNext() {
                if (this.index >= this.arguments.length) {
                    return false;
                }
                this.current = this.arguments[this.index];
                if (this.current.equals("--") || !this.current.startsWith("--")) {
                    return false;
                }
                this.index++;
                return true;
            }

            private boolean getNextValue() {
                if (this.index >= this.arguments.length) {
                    return false;
                }
                this.current = this.arguments[this.index];
                this.index++;
                return true;
            }

            public String[] getRemaining() {
                int length = this.arguments.length - this.index;
                String[] strArr = new String[length];
                if (length > 0) {
                    System.arraycopy(this.arguments, this.index, strArr, 0, length);
                }
                return strArr;
            }

            public boolean isArg(String str) {
                int length = str.length();
                if (length > 0 && str.charAt(length - 1) == '=') {
                    if (this.current.startsWith(str)) {
                        this.lastValue = this.current.substring(length);
                        return true;
                    }
                    String strSubstring = str.substring(0, length - 1);
                    if (!this.current.equals(strSubstring)) {
                        return false;
                    }
                    if (getNextValue()) {
                        this.lastValue = this.current;
                        return true;
                    }
                    System.err.println(new StringBuffer().append("Missing value after parameter ").append(strSubstring).toString());
                    throw new UsageException();
                }
                return this.current.equals(str);
            }
        }

        private void parseFlags(ArgumentsParser argumentsParser) throws Throwable {
            int i;
            while (argumentsParser.getNext()) {
                if (argumentsParser.isArg("--debug")) {
                    this.debug = true;
                } else if (argumentsParser.isArg("--no-warning")) {
                    this.warnings = false;
                } else if (argumentsParser.isArg("--verbose")) {
                    this.verbose = true;
                } else if (argumentsParser.isArg("--verbose-dump")) {
                    this.verboseDump = true;
                } else if (argumentsParser.isArg("--no-files")) {
                    this.emptyOk = true;
                } else if (argumentsParser.isArg("--no-optimize")) {
                    this.optimize = false;
                } else if (argumentsParser.isArg("--no-strict")) {
                    this.strictNameCheck = false;
                } else if (argumentsParser.isArg("--core-library")) {
                    this.coreLibrary = true;
                } else if (argumentsParser.isArg("--statistics")) {
                    this.statistics = true;
                } else if (argumentsParser.isArg("--optimize-list=")) {
                    if (this.dontOptimizeListFile != null) {
                        this.context.f5013err.println(new StringBuffer().append("--optimize-list and ").append("--no-optimize-list are incompatible.").toString());
                        throw new UsageException();
                    }
                    this.optimize = true;
                    this.optimizeListFile = argumentsParser.getLastValue();
                } else if (argumentsParser.isArg("--no-optimize-list=")) {
                    if (this.dontOptimizeListFile != null) {
                        this.context.f5013err.println(new StringBuffer().append("--optimize-list and ").append("--no-optimize-list are incompatible.").toString());
                        throw new UsageException();
                    }
                    this.optimize = true;
                    this.dontOptimizeListFile = argumentsParser.getLastValue();
                } else if (argumentsParser.isArg("--keep-classes")) {
                    this.keepClassesInJar = true;
                } else if (argumentsParser.isArg("--output=")) {
                    this.outName = argumentsParser.getLastValue();
                    if (new File(this.outName).isDirectory()) {
                        this.jarOutput = false;
                        this.outputIsDirectory = true;
                    } else if (FileUtils.hasArchiveSuffix(this.outName)) {
                        this.jarOutput = true;
                    } else if (this.outName.endsWith(Main.DEX_EXTENSION) || this.outName.equals("-")) {
                        this.jarOutput = false;
                        this.outputIsDirectDex = true;
                    } else {
                        this.context.f5013err.println(new StringBuffer().append("unknown output extension: ").append(this.outName).toString());
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--dump-to=")) {
                    this.humanOutName = argumentsParser.getLastValue();
                } else if (argumentsParser.isArg("--dump-width=")) {
                    this.dumpWidth = Integer.parseInt(argumentsParser.getLastValue());
                } else if (argumentsParser.isArg("--dump-method=")) {
                    this.methodToDump = argumentsParser.getLastValue();
                    this.jarOutput = false;
                } else if (argumentsParser.isArg("--positions=")) {
                    String strIntern = argumentsParser.getLastValue().intern();
                    if (strIntern == "none") {
                        this.positionInfo = 1;
                    } else if (strIntern == "important") {
                        this.positionInfo = 3;
                    } else if (strIntern == "lines") {
                        this.positionInfo = 2;
                    } else {
                        this.context.f5013err.println(new StringBuffer().append("unknown positions option: ").append(strIntern).toString());
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--no-locals")) {
                    this.localInfo = false;
                } else if (argumentsParser.isArg(new StringBuffer().append(NUM_THREADS_OPTION).append("=").toString())) {
                    this.numThreads = Integer.parseInt(argumentsParser.getLastValue());
                } else if (argumentsParser.isArg(INCREMENTAL_OPTION)) {
                    this.incremental = true;
                } else if (argumentsParser.isArg("--force-jumbo")) {
                    this.forceJumbo = true;
                } else if (argumentsParser.isArg(MULTI_DEX_OPTION)) {
                    this.multiDex = true;
                } else if (argumentsParser.isArg(new StringBuffer().append("--main-dex-list").append("=").toString())) {
                    this.mainDexListFile = argumentsParser.getLastValue();
                } else if (argumentsParser.isArg(MINIMAL_MAIN_DEX_OPTION)) {
                    this.minimalMainDex = true;
                } else if (argumentsParser.isArg("--set-max-idx-number=")) {
                    this.maxNumberOfIdxPerDex = Integer.parseInt(argumentsParser.getLastValue());
                } else if (argumentsParser.isArg(new StringBuffer().append(INPUT_LIST_OPTION).append("=").toString())) {
                    File file = new File(argumentsParser.getLastValue());
                    try {
                        this.inputList = new ArrayList();
                        Main.readPathsFromFile(file.getAbsolutePath(), this.inputList);
                    } catch (IOException e) {
                        this.context.f5013err.println(new StringBuffer().append("Unable to read input list file: ").append(file.getName()).toString());
                        throw new UsageException();
                    }
                } else if (argumentsParser.isArg("--min-sdk-version=")) {
                    String lastValue = argumentsParser.getLastValue();
                    try {
                        i = Integer.parseInt(lastValue);
                    } catch (NumberFormatException e2) {
                        i = -1;
                    }
                    if (i < 1) {
                        System.err.println(new StringBuffer().append("improper min-sdk-version option: ").append(lastValue).toString());
                        throw new UsageException();
                    }
                    this.minSdkVersion = i;
                } else if (argumentsParser.isArg("--allow-all-interface-method-invokes")) {
                    this.allowAllInterfaceMethodInvokes = true;
                } else {
                    this.context.f5013err.println(new StringBuffer().append("unknown option: ").append(argumentsParser.getCurrent()).toString());
                    throw new UsageException();
                }
            }
        }

        public void parse(String[] strArr) throws Throwable {
            ArgumentsParser argumentsParser = new ArgumentsParser(strArr);
            parseFlags(argumentsParser);
            this.fileNames = argumentsParser.getRemaining();
            if (this.inputList != null && !this.inputList.isEmpty()) {
                this.inputList.addAll(Arrays.asList(this.fileNames));
                this.fileNames = (String[]) this.inputList.toArray(new String[this.inputList.size()]);
            }
            if (this.fileNames.length == 0) {
                if (!this.emptyOk) {
                    this.context.f5013err.println("no input files specified");
                    throw new UsageException();
                }
            } else if (this.emptyOk) {
                this.context.f5014out.println("ignoring input files");
            }
            if (this.humanOutName == null && this.methodToDump != null) {
                this.humanOutName = "-";
            }
            if (this.mainDexListFile != null && !this.multiDex) {
                this.context.f5013err.println(new StringBuffer().append(new StringBuffer().append("--main-dex-list").append(" is only supported in combination with ").toString()).append(MULTI_DEX_OPTION).toString());
                throw new UsageException();
            }
            if (this.minimalMainDex && (this.mainDexListFile == null || !this.multiDex)) {
                this.context.f5013err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(MINIMAL_MAIN_DEX_OPTION).append(" is only supported in combination with ").toString()).append(MULTI_DEX_OPTION).toString()).append(" and ").toString()).append("--main-dex-list").toString());
                throw new UsageException();
            }
            if (this.multiDex && this.incremental) {
                this.context.f5013err.println(new StringBuffer().append(new StringBuffer().append(INCREMENTAL_OPTION).append(" is not supported with ").toString()).append(MULTI_DEX_OPTION).toString());
                throw new UsageException();
            }
            if (this.multiDex && this.outputIsDirectDex) {
                this.context.f5013err.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Unsupported output \"").append(this.outName).toString()).append("\". ").toString()).append(MULTI_DEX_OPTION).toString()).append(" supports only archive or directory output").toString());
                throw new UsageException();
            }
            if (this.outputIsDirectory && !this.multiDex) {
                this.outName = new File(this.outName, DexFormat.DEX_IN_JAR_NAME).getPath();
            }
            makeOptionsObjects();
        }

        public void parseFlags(String[] strArr) throws Throwable {
            parseFlags(new ArgumentsParser(strArr));
        }

        public void makeOptionsObjects() {
            this.cfOptions = new CfOptions();
            this.cfOptions.positionInfo = this.positionInfo;
            this.cfOptions.localInfo = this.localInfo;
            this.cfOptions.strictNameCheck = this.strictNameCheck;
            this.cfOptions.optimize = this.optimize;
            this.cfOptions.optimizeListFile = this.optimizeListFile;
            this.cfOptions.dontOptimizeListFile = this.dontOptimizeListFile;
            this.cfOptions.statistics = this.statistics;
            if (this.warnings) {
                this.cfOptions.warn = this.context.f5013err;
            } else {
                this.cfOptions.warn = this.context.noop;
            }
            this.dexOptions = new DexOptions(this.context.f5013err);
            this.dexOptions.minSdkVersion = this.minSdkVersion;
            this.dexOptions.forceJumbo = this.forceJumbo;
            this.dexOptions.allowAllInterfaceMethodInvokes = this.allowAllInterfaceMethodInvokes;
        }
    }

    private class FileBytesConsumer implements ClassPathOpener.Consumer {
        private final Main this$0;

        @Override
        public boolean processFileBytes(String str, long j, byte[] bArr) {
            return this.this$0.processFileBytes(str, j, bArr);
        }

        @Override
        public void onException(Exception exc) {
            if (exc instanceof StopProcessing) {
                throw ((StopProcessing) exc);
            }
            if (exc instanceof SimException) {
                this.this$0.context.f5013err.println("\nEXCEPTION FROM SIMULATION:");
                this.this$0.context.f5013err.println(new StringBuffer().append(exc.getMessage()).append(IOUtils.LINE_SEPARATOR_UNIX).toString());
                this.this$0.context.f5013err.println(((SimException) exc).getContext());
            } else if (exc instanceof ParseException) {
                this.this$0.context.f5013err.println("\nPARSE ERROR:");
                ParseException parseException = (ParseException) exc;
                if (this.this$0.args.debug) {
                    parseException.printStackTrace(this.this$0.context.f5013err);
                } else {
                    parseException.printContext(this.this$0.context.f5013err);
                }
            } else {
                this.this$0.context.f5013err.println("\nUNEXPECTED TOP-LEVEL EXCEPTION:");
                exc.printStackTrace(this.this$0.context.f5013err);
            }
            this.this$0.errors.incrementAndGet();
        }

        @Override
        public void onProcessArchiveStart(File file) {
            if (this.this$0.args.verbose) {
                this.this$0.context.f5014out.println(new StringBuffer().append(new StringBuffer().append("processing archive ").append(file).toString()).append("...").toString());
            }
        }

        public FileBytesConsumer(Main main) {
            this.this$0 = main;
        }
    }

    private class ClassParserTask implements Callable<DirectClassFile> {
        byte[] bytes;
        String name;
        private final Main this$0;

        @Override
        public DirectClassFile call() throws Exception {
            return call();
        }

        ClassParserTask(Main main, String str, byte[] bArr) {
            this.this$0 = main;
            this.name = str;
            this.bytes = bArr;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public DirectClassFile call() throws Exception {
            return this.this$0.parseClass(this.name, this.bytes);
        }
    }

    private class DirectClassFileConsumer implements Callable<Boolean> {
        byte[] bytes;
        Future<DirectClassFile> dcff;
        String name;
        private final Main this$0;

        @Override
        public Boolean call() throws Exception {
            return call();
        }

        DirectClassFileConsumer(Main main, String str, byte[] bArr, Future<DirectClassFile> future) {
            this.this$0 = main;
            this.name = str;
            this.bytes = bArr;
            this.dcff = future;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public Boolean call() throws Exception {
            return call(this.dcff.get());
        }

        public Boolean call(DirectClassFile directClassFile) {
            int size;
            int size2;
            int size3;
            int size4;
            if (this.this$0.args.multiDex) {
                int size5 = directClassFile.getConstantPool().size();
                size2 = directClassFile.getMethods().size() + size5 + 2;
                size = size5 + directClassFile.getFields().size() + 9;
                synchronized (this.this$0.dexRotationLock) {
                    synchronized (this.this$0.outputDex) {
                        size3 = this.this$0.outputDex.getMethodIds().items().size();
                        size4 = this.this$0.outputDex.getFieldIds().items().size();
                    }
                    while (true) {
                        if (size3 + size2 + this.this$0.maxMethodIdsInProcess <= this.this$0.args.maxNumberOfIdxPerDex && size4 + size + this.this$0.maxFieldIdsInProcess <= this.this$0.args.maxNumberOfIdxPerDex) {
                            break;
                        }
                        if (this.this$0.maxMethodIdsInProcess > 0 || this.this$0.maxFieldIdsInProcess > 0) {
                            try {
                                this.this$0.dexRotationLock.wait();
                            } catch (InterruptedException e) {
                            }
                        } else {
                            if (this.this$0.outputDex.getClassDefs().items().size() <= 0) {
                                break;
                            }
                            this.this$0.rotateDexFile();
                        }
                        synchronized (this.this$0.outputDex) {
                            size3 = this.this$0.outputDex.getMethodIds().items().size();
                            size4 = this.this$0.outputDex.getFieldIds().items().size();
                        }
                    }
                    this.this$0.maxMethodIdsInProcess += size2;
                    this.this$0.maxFieldIdsInProcess += size;
                }
            } else {
                size = 0;
                size2 = 0;
            }
            this.this$0.addToDexFutures.add(this.this$0.classDefItemConsumer.submit(new ClassDefItemConsumer(this.this$0, this.name, this.this$0.classTranslatorPool.submit(new ClassTranslatorTask(this.this$0, this.name, this.bytes, directClassFile)), size2, size)));
            return new Boolean(true);
        }
    }

    private class ClassTranslatorTask implements Callable<ClassDefItem> {
        byte[] bytes;
        DirectClassFile classFile;
        String name;
        private final Main this$0;

        @Override
        public ClassDefItem call() {
            return call();
        }

        ClassTranslatorTask(Main main, String str, byte[] bArr, DirectClassFile directClassFile) {
            this.this$0 = main;
            this.name = str;
            this.bytes = bArr;
            this.classFile = directClassFile;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public ClassDefItem call() {
            return this.this$0.translateClass(this.bytes, this.classFile);
        }
    }

    private class ClassDefItemConsumer implements Callable<Boolean> {
        Future<ClassDefItem> futureClazz;
        int maxFieldIdsInClass;
        int maxMethodIdsInClass;
        String name;
        private final Main this$0;

        @Override
        public Boolean call() throws Exception {
            return call();
        }

        ClassDefItemConsumer(Main main, String str, Future<ClassDefItem> future, int i, int i2) {
            this.this$0 = main;
            this.name = str;
            this.futureClazz = future;
            this.maxMethodIdsInClass = i;
            this.maxFieldIdsInClass = i2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public Boolean call() throws Exception {
            try {
                try {
                    ClassDefItem classDefItem = this.futureClazz.get();
                    if (classDefItem != null) {
                        this.this$0.addClassToDex(classDefItem);
                        this.this$0.updateStatus(true);
                    }
                    Boolean bool = new Boolean(true);
                    if (this.this$0.args.multiDex) {
                        synchronized (this.this$0.dexRotationLock) {
                            this.this$0.maxMethodIdsInProcess -= this.maxMethodIdsInClass;
                            this.this$0.maxFieldIdsInProcess -= this.maxFieldIdsInClass;
                            this.this$0.dexRotationLock.notifyAll();
                        }
                    }
                    return bool;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Exception) {
                        throw ((Exception) cause);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                if (this.this$0.args.multiDex) {
                    synchronized (this.this$0.dexRotationLock) {
                        this.this$0.maxMethodIdsInProcess -= this.maxMethodIdsInClass;
                        this.this$0.maxFieldIdsInProcess -= this.maxFieldIdsInClass;
                        this.this$0.dexRotationLock.notifyAll();
                    }
                }
                throw th;
            }
        }
    }

    private class DexWriter implements Callable<byte[]> {
        private final DexFile dexFile;
        private final Main this$0;

        @Override
        public byte[] call() throws IOException {
            return call2();
        }

        DexWriter(Main main, DexFile dexFile) {
            this.this$0 = main;
            this.dexFile = dexFile;
        }

        @Override
        public byte[] call2() throws IOException {
            return this.this$0.writeDex(this.dexFile);
        }
    }
}
