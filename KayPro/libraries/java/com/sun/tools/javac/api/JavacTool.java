package com.sun.tools.javac.api;

import com.sun.source.util.JavacTask;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.main.JavacOption;
import com.sun.tools.javac.main.Main;
import com.sun.tools.javac.main.RecognizedOptions;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.ClientCodeException;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Pair;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

public final class JavacTool implements JavaCompiler {
    private final Main sharedCompiler;
    private final List<Pair<String, String>> options = new ArrayList();
    private final Context dummyContext = new Context();
    private final PrintWriter silent = new PrintWriter(new OutputStream() {
        @Override
        public void write(int b) {
        }
    });

    @Override
    public StandardJavaFileManager getStandardFileManager(DiagnosticListener diagnosticListener, Locale locale, Charset charset) {
        return getStandardFileManager((DiagnosticListener<? super JavaFileObject>) diagnosticListener, locale, charset);
    }

    @Override
    public JavaCompiler.CompilationTask getTask(Writer writer, JavaFileManager javaFileManager, DiagnosticListener diagnosticListener, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        return getTask(writer, javaFileManager, (DiagnosticListener<? super JavaFileObject>) diagnosticListener, (Iterable<String>) iterable, (Iterable<String>) iterable2, (Iterable<? extends JavaFileObject>) iterable3);
    }

    @Deprecated
    public JavacTool() {
        Main main = new Main("javac", this.silent);
        this.sharedCompiler = main;
        main.setOptions(Options.instance(this.dummyContext));
    }

    public static JavacTool create() {
        return new JavacTool();
    }

    private String argsToString(Object... args) {
        if (args.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (Object arg : args) {
            sb.append(separator);
            sb.append(arg.toString());
            separator = File.pathSeparator;
        }
        String newArgs = sb.toString();
        return newArgs;
    }

    private void setOption1(String name, JavacOption.OptionKind kind, Object... args) {
        String arg = argsToString(args);
        JavacOption option = this.sharedCompiler.getOption(name);
        if (option == null || !match(kind, option.getKind())) {
            throw new IllegalArgumentException(name);
        }
        if ((args.length != 0) != option.hasArg()) {
            throw new IllegalArgumentException(name);
        }
        if (option.hasArg()) {
            if (option.process(null, name, arg)) {
                throw new IllegalArgumentException(name);
            }
        } else if (option.process(null, name)) {
            throw new IllegalArgumentException(name);
        }
        this.options.add(new Pair<>(name, arg));
    }

    public void setOption(String name, Object... args) {
        setOption1(name, JavacOption.OptionKind.NORMAL, args);
    }

    public void setExtendedOption(String name, Object... args) {
        setOption1(name, JavacOption.OptionKind.EXTENDED, args);
    }

    private static boolean match(JavacOption.OptionKind clientKind, JavacOption.OptionKind optionKind) {
        return clientKind == (optionKind == JavacOption.OptionKind.HIDDEN ? JavacOption.OptionKind.EXTENDED : optionKind);
    }

    @Override
    public JavacFileManager getStandardFileManager(DiagnosticListener<? super JavaFileObject> diagnosticListener, Locale locale, Charset charset) {
        PrintWriter pw;
        Context context = new Context();
        context.m506put((Class<Locale>) Locale.class, locale);
        if (diagnosticListener != null) {
            context.m506put((Class<DiagnosticListener<? super JavaFileObject>>) DiagnosticListener.class, diagnosticListener);
        }
        if (charset == null) {
            pw = new PrintWriter((OutputStream) System.err, true);
        } else {
            pw = new PrintWriter((Writer) new OutputStreamWriter(System.err, charset), true);
        }
        context.m504put(Log.outKey, pw);
        return new JavacFileManager(context, true, charset);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: ClientCodeException -> 0x0097, TryCatch #3 {ClientCodeException -> 0x0097, blocks: (B:35:0x008d, B:40:0x00a2, B:41:0x00af), top: B:67:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: ClientCodeException -> 0x0097, TRY_LEAVE, TryCatch #3 {ClientCodeException -> 0x0097, blocks: (B:35:0x008d, B:40:0x00a2, B:41:0x00af), top: B:67:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    @Override
    public JavacTask getTask(Writer out, JavaFileManager fileManager, DiagnosticListener<? super JavaFileObject> diagnosticListener, Iterable<String> options, Iterable<String> classes, Iterable<? extends JavaFileObject> compilationUnits) {
        Iterable<? extends JavaFileObject> compilationUnits2;
        JavaFileManager fileManager2;
        try {
            Context context = new Context();
            ClientCodeWrapper ccw = ClientCodeWrapper.instance(context);
            if (options != null) {
                for (String option : options) {
                    option.getClass();
                }
            }
            if (classes != null) {
                for (String cls : classes) {
                    if (!SourceVersion.isName(cls)) {
                        throw new IllegalArgumentException("Not a valid class name: " + cls);
                    }
                }
            }
            if (compilationUnits != null) {
                Iterable<? extends JavaFileObject> compilationUnits3 = ccw.wrapJavaFileObjects(compilationUnits);
                try {
                    for (JavaFileObject cu : compilationUnits3) {
                        if (cu.getKind() != JavaFileObject.Kind.SOURCE) {
                            throw new IllegalArgumentException("All compilation units must be of SOURCE kind");
                        }
                        throw new RuntimeException(ex.getCause());
                    }
                    compilationUnits2 = compilationUnits3;
                } catch (ClientCodeException e) {
                    ex = e;
                }
            } else {
                compilationUnits2 = compilationUnits;
            }
            if (diagnosticListener == null) {
                if (out == null) {
                    context.m504put(Log.outKey, new PrintWriter((OutputStream) System.err, true));
                } else {
                    context.m504put(Log.outKey, new PrintWriter(out, true));
                }
                if (fileManager == null) {
                    fileManager2 = getStandardFileManager(diagnosticListener, (Locale) null, (Charset) null);
                } else {
                    fileManager2 = fileManager;
                }
                JavaFileManager fileManager3 = ccw.wrap(fileManager2);
                context.m506put((Class<JavaFileManager>) JavaFileManager.class, fileManager3);
                processOptions(context, fileManager3, options);
                Main compiler = new Main("javacTask", (PrintWriter) context.m501get(Log.outKey));
                return new JavacTaskImpl(compiler, options, context, classes, compilationUnits2);
            }
            try {
                context.m506put((Class<DiagnosticListener>) DiagnosticListener.class, ccw.wrap(diagnosticListener));
                if (out == null) {
                    context.m504put(Log.outKey, new PrintWriter((OutputStream) System.err, true));
                } else {
                    context.m504put(Log.outKey, new PrintWriter(out, true));
                }
                if (fileManager == null) {
                    try {
                        fileManager2 = getStandardFileManager(diagnosticListener, (Locale) null, (Charset) null);
                    } catch (ClientCodeException e2) {
                        ex = e2;
                    }
                } else {
                    fileManager2 = fileManager;
                }
                try {
                    JavaFileManager fileManager4 = ccw.wrap(fileManager2);
                    try {
                        context.m506put((Class<JavaFileManager>) JavaFileManager.class, fileManager4);
                        processOptions(context, fileManager4, options);
                        Main compiler2 = new Main("javacTask", (PrintWriter) context.m501get(Log.outKey));
                        return new JavacTaskImpl(compiler2, options, context, classes, compilationUnits2);
                    } catch (ClientCodeException e3) {
                        ex = e3;
                    }
                } catch (ClientCodeException e4) {
                    ex = e4;
                }
            } catch (ClientCodeException e5) {
                ex = e5;
            }
        } catch (ClientCodeException e6) {
            ex = e6;
        }
        throw new RuntimeException(ex.getCause());
    }

    private static void processOptions(Context context, JavaFileManager fileManager, Iterable<String> options) {
        if (options == null) {
            return;
        }
        Options optionTable = Options.instance(context);
        JavacOption[] recognizedOptions = RecognizedOptions.getJavacToolOptions(new RecognizedOptions.GrumpyHelper());
        Iterator<String> flags = options.iterator();
        while (flags.hasNext()) {
            String flag = flags.next();
            int j = 0;
            while (j < recognizedOptions.length && !recognizedOptions[j].matches(flag)) {
                j++;
            }
            if (j == recognizedOptions.length) {
                if (!fileManager.handleOption(flag, flags)) {
                    String msg = Main.getLocalizedString("err.invalid.flag", flag);
                    throw new IllegalArgumentException(msg);
                }
            } else {
                JavacOption option = recognizedOptions[j];
                if (option.hasArg()) {
                    if (!flags.hasNext()) {
                        String msg2 = Main.getLocalizedString("err.req.arg", flag);
                        throw new IllegalArgumentException(msg2);
                    }
                    String operand = flags.next();
                    if (option.process(optionTable, flag, operand)) {
                        throw new IllegalArgumentException(flag + " " + operand);
                    }
                } else if (option.process(optionTable, flag)) {
                    throw new IllegalArgumentException(flag);
                }
            }
        }
    }

    @Override
    public int mo447run(InputStream in, OutputStream out, OutputStream err, String... arguments) {
        if (err == null) {
            err = System.err;
        }
        for (String argument : arguments) {
            argument.getClass();
        }
        return com.sun.tools.javac.Main.compile(arguments, new PrintWriter(err, true));
    }

    @Override
    public Set<SourceVersion> getSourceVersions() {
        return Collections.unmodifiableSet(EnumSet.range(SourceVersion.RELEASE_3, SourceVersion.latest()));
    }

    @Override
    public int isSupportedOption(String str) {
        for (JavacOption.Option option : RecognizedOptions.getJavacToolOptions(new RecognizedOptions.GrumpyHelper())) {
            if (option.matches(str)) {
                return option.hasArg() ? 1 : 0;
            }
        }
        return -1;
    }
}
