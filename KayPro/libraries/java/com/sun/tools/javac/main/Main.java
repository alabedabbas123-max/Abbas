package com.sun.tools.javac.main;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.file.CacheFSInfo;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.processing.AnnotationProcessingError;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.ClientCodeException;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.FatalError;
import com.sun.tools.javac.util.JavacMessages;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.PropagatedException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.MissingResourceException;
import java.util.Set;
import javax.annotation.processing.Processor;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class Main {
    public static final int EXIT_ABNORMAL = 4;
    public static final int EXIT_CMDERR = 2;
    public static final int EXIT_ERROR = 1;
    public static final int EXIT_OK = 0;
    public static final int EXIT_SYSERR = 3;
    private static final String javacBundleName = "com.sun.tools.javac.resources.javac";
    private static JavacMessages messages;
    boolean apiMode;
    public ListBuffer<String> classnames;
    private DiagnosticListener diagnosticListener;
    private JavaFileManager fileManager;
    public Set<File> filenames;
    private Options options;

    PrintWriter f457out;
    String ownName;
    private JavacOption.Option[] recognizedOptions;

    public Main(String name) {
        this(name, new PrintWriter((OutputStream) System.err, true));
    }

    public Main(String name, PrintWriter out) {
        this.filenames = null;
        this.classnames = null;
        this.recognizedOptions = RecognizedOptions.getJavaCompilerOptions(new RecognizedOptions.OptionHelper() {
            @Override
            public void setOut(PrintWriter out2) {
                Main.this.f457out = out2;
            }

            @Override
            public void error(String key, Object... args) {
                Main.this.error(key, args);
            }

            @Override
            public void printVersion() {
                Log.printLines(Main.this.f457out, Main.getLocalizedString("version", Main.this.ownName, JavaCompiler.version()));
            }

            @Override
            public void printFullVersion() {
                Log.printLines(Main.this.f457out, Main.getLocalizedString("fullVersion", Main.this.ownName, JavaCompiler.fullVersion()));
            }

            @Override
            public void printHelp() {
                Main.this.help();
            }

            @Override
            public void printXhelp() {
                Main.this.xhelp();
            }

            @Override
            public void addFile(File f) {
                Main.this.filenames.add(f);
            }

            @Override
            public void addClassName(String s) {
                Main.this.classnames.append(s);
            }
        });
        this.options = null;
        this.ownName = name;
        this.f457out = out;
    }

    public static String getLocalizedString(String key, Object... args) {
        try {
            if (messages == null) {
                messages = new JavacMessages(javacBundleName);
            }
            return messages.getLocalizedString("javac." + key, args);
        } catch (MissingResourceException e) {
            throw new Error("Fatal Error: Resource for javac is missing", e);
        }
    }

    public static void useRawMessages(boolean enable) {
        String str = javacBundleName;
        if (enable) {
            messages = new JavacMessages(str) {
                @Override
                public String getLocalizedString(String key, Object... args) {
                    return key;
                }
            };
        } else {
            messages = new JavacMessages(javacBundleName);
        }
    }

    public DiagnosticListener getDiagnosticListener() {
        return this.diagnosticListener;
    }

    public void setDiagnosticListener(DiagnosticListener diagnosticListener) {
        this.diagnosticListener = diagnosticListener;
    }

    void help() {
        Log.printLines(this.f457out, getLocalizedString("msg.usage.header", this.ownName));
        int i = 0;
        while (true) {
            JavacOption.Option[] optionArr = this.recognizedOptions;
            if (i < optionArr.length) {
                optionArr[i].help(this.f457out);
                i++;
            } else {
                this.f457out.println();
                return;
            }
        }
    }

    void xhelp() {
        int i = 0;
        while (true) {
            JavacOption.Option[] optionArr = this.recognizedOptions;
            if (i < optionArr.length) {
                optionArr[i].xhelp(this.f457out);
                i++;
            } else {
                this.f457out.println();
                Log.printLines(this.f457out, getLocalizedString("msg.usage.nonstandard.footer", new Object[0]));
                return;
            }
        }
    }

    void error(String key, Object... args) {
        if (this.apiMode) {
            String msg = getLocalizedString(key, args);
            throw new PropagatedException(new IllegalStateException(msg));
        }
        warning(key, args);
        Log.printLines(this.f457out, getLocalizedString("msg.usage", this.ownName));
    }

    void warning(String key, Object... args) {
        Log.printLines(this.f457out, this.ownName + ": " + getLocalizedString(key, args));
    }

    public JavacOption.Option getOption(String flag) {
        for (JavacOption.Option option : this.recognizedOptions) {
            if (option.matches(flag)) {
                return option;
            }
        }
        return null;
    }

    public void setOptions(Options options) {
        if (options == null) {
            throw null;
        }
        this.options = options;
    }

    public void setAPIMode(boolean apiMode) {
        this.apiMode = apiMode;
    }

    public Collection<File> processArgs(String[] flags) {
        return processArgs(flags, null);
    }

    public Collection<File> processArgs(String[] flags, String[] classNames) {
        Source source;
        Target target;
        int ac = 0;
        while (ac < flags.length) {
            String flag = flags[ac];
            ac++;
            JavacOption.Option option = null;
            if (flag.length() > 0) {
                int firstOptionToCheck = flag.charAt(0) == '-' ? 0 : this.recognizedOptions.length - 1;
                int j = firstOptionToCheck;
                while (true) {
                    JavacOption.Option[] optionArr = this.recognizedOptions;
                    if (j >= optionArr.length) {
                        break;
                    }
                    if (!optionArr[j].matches(flag)) {
                        j++;
                    } else {
                        option = this.recognizedOptions[j];
                        break;
                    }
                }
            }
            if (option == null) {
                error("err.invalid.flag", flag);
                return null;
            }
            if (option.hasArg()) {
                if (ac == flags.length) {
                    error("err.req.arg", flag);
                    return null;
                }
                String operand = flags[ac];
                ac++;
                if (option.process(this.options, flag, operand)) {
                    return null;
                }
            } else if (option.process(this.options, flag)) {
                return null;
            }
        }
        ListBuffer<String> listBuffer = this.classnames;
        if (listBuffer != null && classNames != null) {
            listBuffer.addAll(Arrays.asList(classNames));
        }
        if (!checkDirectory(OptionName.D) || !checkDirectory(OptionName.S)) {
            return null;
        }
        String sourceString = this.options.m514get(OptionName.SOURCE);
        if (sourceString != null) {
            source = Source.lookup(sourceString);
        } else {
            source = Source.DEFAULT;
        }
        String targetString = this.options.m514get(OptionName.TARGET);
        if (targetString != null) {
            target = Target.lookup(targetString);
        } else {
            target = Target.DEFAULT;
        }
        if (Character.isDigit(target.name.charAt(0))) {
            if (target.compareTo(source.requiredTarget()) < 0) {
                if (targetString != null) {
                    if (sourceString == null) {
                        warning("warn.target.default.source.conflict", targetString, source.requiredTarget().name);
                    } else {
                        warning("warn.source.target.conflict", sourceString, source.requiredTarget().name);
                    }
                    return null;
                }
                Target target2 = source.requiredTarget();
                this.options.m517put("-target", target2.name);
            } else if (targetString == null && !source.allowGenerics()) {
                Target target3 = Target.JDK1_4;
                this.options.m517put("-target", target3.name);
            }
        }
        String showClass = this.options.m515get("showClass");
        if (showClass != null) {
            if (showClass.equals("showClass")) {
                showClass = "com.sun.tools.javac.Main";
            }
            showClass(showClass);
        }
        return this.filenames;
    }

    private boolean checkDirectory(OptionName optName) {
        String value = this.options.m514get(optName);
        if (value == null) {
            return true;
        }
        File file = new File(value);
        if (!file.exists()) {
            error("err.dir.not.found", value);
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        error("err.file.not.directory", value);
        return false;
    }

    public int compile(String[] args) {
        Context context = new Context();
        JavacFileManager.preRegister(context);
        int result = compile(args, context);
        JavaFileManager javaFileManager = this.fileManager;
        if (javaFileManager instanceof JavacFileManager) {
            ((JavacFileManager) javaFileManager).close();
        }
        return result;
    }

    public int compile(String[] args, Context context) {
        return compile(args, context, List.m507nil(), null);
    }

    public int compile(String[] args, Context context, List<JavaFileObject> fileObjects, Iterable<? extends Processor> processors) {
        return compile(args, null, context, fileObjects, processors);
    }

    /* JADX WARN: Code duplicated, block: B:229:0x0366 A[Catch: all -> 0x0468, TRY_ENTER, TryCatch #29 {all -> 0x0468, blocks: (B:229:0x0366, B:231:0x036c, B:233:0x0370, B:235:0x037a, B:247:0x039b, B:248:0x039f, B:251:0x03a6, B:252:0x03af, B:255:0x03b6, B:257:0x03ba, B:266:0x03d6, B:267:0x03df, B:270:0x03e6, B:281:0x0408, B:292:0x042a, B:303:0x044c), top: B:339:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x037a A[Catch: all -> 0x0468, TRY_LEAVE, TryCatch #29 {all -> 0x0468, blocks: (B:229:0x0366, B:231:0x036c, B:233:0x0370, B:235:0x037a, B:247:0x039b, B:248:0x039f, B:251:0x03a6, B:252:0x03af, B:255:0x03b6, B:257:0x03ba, B:266:0x03d6, B:267:0x03df, B:270:0x03e6, B:281:0x0408, B:292:0x042a, B:303:0x044c), top: B:339:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:325:0x03ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0452 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0430 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x040e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public int compile(String[] args, String[] classNames, Context context, List<JavaFileObject> fileObjects, Iterable<? extends Processor> processors) {
        Throwable ex;
        StackOverflowError ex2;
        OutOfMemoryError ex3;
        IOException ex4;
        PropagatedException ex5;
        FatalError ex6;
        ClientCodeException ex7;
        AnnotationProcessingError ex8;
        List<JavaFileObject> fileObjects2;
        if (this.options == null) {
            this.options = Options.instance(context);
        }
        this.filenames = new LinkedHashSet();
        this.classnames = new ListBuffer<>();
        JavaCompiler comp = null;
        try {
            try {
                if (args.length == 0) {
                    if (classNames != null) {
                        try {
                            if (classNames.length == 0) {
                            }
                        } catch (AnnotationProcessingError e) {
                            ex8 = e;
                        } catch (ClientCodeException e2) {
                            ex7 = e2;
                            throw new RuntimeException(ex7.getCause());
                        } catch (FatalError e3) {
                            ex6 = e3;
                            feMessage(ex6);
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex9) {
                                    throw new RuntimeException(ex9.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 3;
                        } catch (PropagatedException e4) {
                            ex5 = e4;
                            throw ex5.getCause();
                        } catch (IOException e5) {
                            ex4 = e5;
                            ioMessage(ex4);
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex10) {
                                    throw new RuntimeException(ex10.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 3;
                        } catch (OutOfMemoryError e6) {
                            ex3 = e6;
                            resourceMessage(ex3);
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex11) {
                                    throw new RuntimeException(ex11.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 3;
                        } catch (StackOverflowError e7) {
                            ex2 = e7;
                            resourceMessage(ex2);
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex12) {
                                    throw new RuntimeException(ex12.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 3;
                        } catch (Throwable th) {
                            ex = th;
                            if (comp != null) {
                                bugMessage(ex);
                            } else {
                                bugMessage(ex);
                            }
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex13) {
                                    throw new RuntimeException(ex13.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 4;
                        }
                    }
                    if (fileObjects.isEmpty()) {
                        help();
                        if (0 != 0) {
                            try {
                                comp.close();
                            } catch (ClientCodeException ex14) {
                                throw new RuntimeException(ex14.getCause());
                            }
                        }
                        this.filenames = null;
                        this.options = null;
                        return 2;
                    }
                }
                try {
                    Collection<File> files = processArgs(CommandLine.parse(args), classNames);
                    if (files == null) {
                        if (0 != 0) {
                            try {
                                comp.close();
                            } catch (ClientCodeException ex15) {
                                throw new RuntimeException(ex15.getCause());
                            }
                        }
                        this.filenames = null;
                        this.options = null;
                        return 2;
                    }
                    if (files.isEmpty() && fileObjects.isEmpty() && this.classnames.isEmpty()) {
                        if (!this.options.isSet(OptionName.HELP) && !this.options.isSet(OptionName.X) && !this.options.isSet(OptionName.VERSION) && !this.options.isSet(OptionName.FULLVERSION)) {
                            if (JavaCompiler.explicitAnnotationProcessingRequested(this.options)) {
                                error("err.no.source.files.classes", new Object[0]);
                            } else {
                                error("err.no.source.files", new Object[0]);
                            }
                            if (0 != 0) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex16) {
                                    throw new RuntimeException(ex16.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 2;
                        }
                        if (0 != 0) {
                            try {
                                comp.close();
                            } catch (ClientCodeException ex17) {
                                throw new RuntimeException(ex17.getCause());
                            }
                        }
                        this.filenames = null;
                        this.options = null;
                        return 0;
                    }
                    boolean forceStdOut = this.options.isSet("stdout");
                    if (forceStdOut) {
                        this.f457out.flush();
                        this.f457out = new PrintWriter((OutputStream) System.out, true);
                    }
                    context.m504put(Log.outKey, this.f457out);
                    if (this.diagnosticListener != null) {
                        context.m506put((Class<DiagnosticListener>) DiagnosticListener.class, this.diagnosticListener);
                    }
                    boolean batchMode = this.options.isUnset("nonBatchMode") && System.getProperty("nonBatchMode") == null;
                    if (batchMode) {
                        CacheFSInfo.preRegister(context);
                    }
                    this.fileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
                    comp = JavaCompiler.instance(context);
                    if (comp == null) {
                        if (comp != null) {
                            try {
                                comp.close();
                            } catch (ClientCodeException ex18) {
                                throw new RuntimeException(ex18.getCause());
                            }
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    }
                    Log log = Log.instance(context);
                    if (files.isEmpty()) {
                        fileObjects2 = fileObjects;
                    } else {
                        comp = JavaCompiler.instance(context);
                        List<JavaFileObject> otherFiles = List.m507nil();
                        JavacFileManager dfm = (JavacFileManager) this.fileManager;
                        for (JavaFileObject fo : dfm.getJavaFileObjectsFromFiles(files)) {
                            otherFiles = otherFiles.prepend(fo);
                        }
                        fileObjects2 = fileObjects;
                        for (JavaFileObject fo2 : otherFiles) {
                            try {
                                fileObjects2 = fileObjects2.prepend(fo2);
                            } catch (AnnotationProcessingError e8) {
                                ex8 = e8;
                            } catch (ClientCodeException e9) {
                                ex7 = e9;
                                throw new RuntimeException(ex7.getCause());
                            } catch (FatalError e10) {
                                ex6 = e10;
                                feMessage(ex6);
                                if (comp != null) {
                                    comp.close();
                                }
                                this.filenames = null;
                                this.options = null;
                                return 3;
                            } catch (PropagatedException e11) {
                                ex5 = e11;
                                throw ex5.getCause();
                            } catch (IOException e12) {
                                ex4 = e12;
                                ioMessage(ex4);
                                if (comp != null) {
                                    comp.close();
                                }
                                this.filenames = null;
                                this.options = null;
                                return 3;
                            } catch (OutOfMemoryError e13) {
                                ex3 = e13;
                                resourceMessage(ex3);
                                if (comp != null) {
                                    comp.close();
                                }
                                this.filenames = null;
                                this.options = null;
                                return 3;
                            } catch (StackOverflowError e14) {
                                ex2 = e14;
                                resourceMessage(ex2);
                                if (comp != null) {
                                    comp.close();
                                }
                                this.filenames = null;
                                this.options = null;
                                return 3;
                            } catch (Throwable th2) {
                                ex = th2;
                                if (comp != null) {
                                    bugMessage(ex);
                                } else {
                                    bugMessage(ex);
                                }
                                if (comp != null) {
                                    comp.close();
                                }
                                this.filenames = null;
                                this.options = null;
                                return 4;
                            }
                        }
                    }
                    try {
                        comp.compile(fileObjects2, this.classnames.toList(), processors);
                        if (log.expectDiagKeys == null) {
                            if (comp.errorCount() != 0) {
                                if (comp != null) {
                                    try {
                                        comp.close();
                                    } catch (ClientCodeException ex19) {
                                        throw new RuntimeException(ex19.getCause());
                                    }
                                }
                                this.filenames = null;
                                this.options = null;
                                return 1;
                            }
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex20) {
                                    throw new RuntimeException(ex20.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 0;
                        }
                        if (log.expectDiagKeys.isEmpty()) {
                            Log.printLines(log.noticeWriter, "all expected diagnostics found");
                            if (comp != null) {
                                try {
                                    comp.close();
                                } catch (ClientCodeException ex21) {
                                    throw new RuntimeException(ex21.getCause());
                                }
                            }
                            this.filenames = null;
                            this.options = null;
                            return 0;
                        }
                        Log.printLines(log.noticeWriter, "expected diagnostic keys not found: " + log.expectDiagKeys);
                        if (comp != null) {
                            try {
                                comp.close();
                            } catch (ClientCodeException ex22) {
                                throw new RuntimeException(ex22.getCause());
                            }
                        }
                        this.filenames = null;
                        this.options = null;
                        return 1;
                    } catch (AnnotationProcessingError e15) {
                        ex8 = e15;
                    } catch (ClientCodeException e16) {
                        ex7 = e16;
                        throw new RuntimeException(ex7.getCause());
                    } catch (FatalError e17) {
                        ex6 = e17;
                        feMessage(ex6);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (PropagatedException e18) {
                        ex5 = e18;
                        throw ex5.getCause();
                    } catch (IOException e19) {
                        ex4 = e19;
                        ioMessage(ex4);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (OutOfMemoryError e20) {
                        ex3 = e20;
                        resourceMessage(ex3);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (StackOverflowError e21) {
                        ex2 = e21;
                        resourceMessage(ex2);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (Throwable th3) {
                        ex = th3;
                        if (comp != null || comp.errorCount() == 0 || this.options == null || this.options.isSet("dev")) {
                            bugMessage(ex);
                        }
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 4;
                    }
                } catch (FileNotFoundException e22) {
                    try {
                        Log.printLines(this.f457out, this.ownName + ": " + getLocalizedString("err.file.not.found", e22.getMessage()));
                        if (0 != 0) {
                            try {
                                comp.close();
                            } catch (ClientCodeException ex23) {
                                throw new RuntimeException(ex23.getCause());
                            }
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (AnnotationProcessingError e23) {
                        ex8 = e23;
                    } catch (ClientCodeException e24) {
                        ex7 = e24;
                        throw new RuntimeException(ex7.getCause());
                    } catch (FatalError e25) {
                        ex6 = e25;
                        feMessage(ex6);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (PropagatedException e26) {
                        ex5 = e26;
                        throw ex5.getCause();
                    } catch (IOException e27) {
                        ex4 = e27;
                        ioMessage(ex4);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (OutOfMemoryError e28) {
                        ex3 = e28;
                        resourceMessage(ex3);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (StackOverflowError e29) {
                        ex2 = e29;
                        resourceMessage(ex2);
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 3;
                    } catch (Throwable th4) {
                        ex = th4;
                        if (comp != null) {
                            bugMessage(ex);
                        } else {
                            bugMessage(ex);
                        }
                        if (comp != null) {
                            comp.close();
                        }
                        this.filenames = null;
                        this.options = null;
                        return 4;
                    }
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    try {
                        comp.close();
                    } catch (ClientCodeException ex24) {
                        throw new RuntimeException(ex24.getCause());
                    }
                }
                this.filenames = null;
                this.options = null;
                throw th5;
            }
        } catch (AnnotationProcessingError e30) {
            ex8 = e30;
        } catch (ClientCodeException e31) {
            ex7 = e31;
        } catch (FatalError e32) {
            ex6 = e32;
        } catch (PropagatedException e33) {
            ex5 = e33;
        } catch (IOException e34) {
            ex4 = e34;
        } catch (OutOfMemoryError e35) {
            ex3 = e35;
        } catch (StackOverflowError e36) {
            ex2 = e36;
        } catch (Throwable th6) {
            ex = th6;
        }
        if (this.apiMode) {
            throw new RuntimeException(ex8.getCause());
        }
        apMessage(ex8);
        if (comp != null) {
            try {
                comp.close();
            } catch (ClientCodeException ex25) {
                throw new RuntimeException(ex25.getCause());
            }
        }
        this.filenames = null;
        this.options = null;
        return 3;
    }

    void bugMessage(Throwable ex) {
        Log.printLines(this.f457out, getLocalizedString("msg.bug", JavaCompiler.version()));
        ex.printStackTrace(this.f457out);
    }

    void feMessage(Throwable ex) {
        Log.printLines(this.f457out, ex.getMessage());
        if (ex.getCause() != null && this.options.isSet("dev")) {
            ex.getCause().printStackTrace(this.f457out);
        }
    }

    void ioMessage(Throwable ex) {
        Log.printLines(this.f457out, getLocalizedString("msg.io", new Object[0]));
        ex.printStackTrace(this.f457out);
    }

    void resourceMessage(Throwable ex) {
        Log.printLines(this.f457out, getLocalizedString("msg.resource", new Object[0]));
        ex.printStackTrace(this.f457out);
    }

    void apMessage(AnnotationProcessingError ex) {
        Log.printLines(this.f457out, getLocalizedString("msg.proc.annotation.uncaught.exception", new Object[0]));
        ex.getCause().printStackTrace(this.f457out);
    }

    void showClass(String className) {
        int n;
        this.f457out.println("javac: show class: " + className);
        URL url = getClass().getResource('/' + className.replace('.', '/') + ".class");
        if (url == null) {
            this.f457out.println("  class not found");
            return;
        }
        this.f457out.println("  " + url);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            DigestInputStream in = new DigestInputStream(url.openStream(), md);
            try {
                byte[] buf = new byte[Flags.ANNOTATION];
                do {
                    n = in.read(buf);
                } while (n > 0);
                byte[] digest = md.digest();
                in.close();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                this.f457out.println("  MD5 checksum: " + ((Object) sb));
            } catch (Throwable th) {
                in.close();
                throw th;
            }
        } catch (Exception e) {
            this.f457out.println("  cannot compute digest: " + e);
        }
    }
}
