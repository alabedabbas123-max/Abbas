package com.sun.tools.javac.main;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.Main;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.comp.Annotate;
import com.sun.tools.javac.comp.Attr;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.comp.Check;
import com.sun.tools.javac.comp.Enter;
import com.sun.tools.javac.comp.Flow;
import com.sun.tools.javac.comp.Lower;
import com.sun.tools.javac.comp.Todo;
import com.sun.tools.javac.comp.TransTypes;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.jvm.Gen;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.ClassWriter;
import com.sun.tools.javac.parser.Parser;
import com.sun.tools.javac.parser.ParserFactory;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.Pretty;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.tree.TreeTranslator;
import com.sun.tools.javac.util.Abort;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.BaseFileManager;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Pair;
import com.sun.tools.javac.util.RichDiagnosticFormatter;
import com.sun.tools.javac.jvm.ClassReader.BadClassFile;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.Processor;
import javax.lang.model.SourceVersion;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;

public class JavaCompiler implements ClassReader.SourceCompleter {
    private static ResourceBundle versionRB = null;
    private static final String versionRBName = "com.sun.tools.javac.resources.version";
    protected Annotate annotate;
    protected boolean annotationProcessingOccurred;
    protected Attr attr;
    public boolean attrParseOnly;

    protected Check f453chk;
    protected CompilePolicy compilePolicy;
    protected final Name completionFailureName;
    protected Context context;
    protected JavaCompiler delegateCompiler;
    protected boolean devVerbose;
    JCDiagnostic.Factory diagFactory;
    public String encoding;
    protected Enter enter;
    protected JavaFileManager fileManager;
    protected Flow flow;

    protected Gen f454gen;
    public boolean genEndPos;
    protected boolean implicitSourceFilesRead;
    protected ImplicitSourcePolicy implicitSourcePolicy;
    public boolean lineDebugInfo;

    public Log f455log;
    protected Lower lower;
    protected TreeMaker make;
    protected Names names;
    protected Options options;
    protected ParserFactory parserFactory;
    public boolean printFlat;
    protected boolean processPcks;
    protected ClassReader reader;
    boolean relax;
    private List<JCTree.JCClassDecl> rootClasses;
    public CompileState shouldStopPolicy;
    protected Source source;
    public boolean sourceOutput;
    public boolean stubOutput;
    protected Symtab syms;
    protected TaskListener taskListener;
    public Todo todo;
    protected TransTypes transTypes;
    protected Types types;
    public boolean verbose;
    public boolean verboseCompilePolicy;
    protected boolean werror;
    protected ClassWriter writer;
    protected static final Context.C0723Key<JavaCompiler> compilerKey = new Context.C0723Key<>();
    private static CompilePolicy DEFAULT_COMPILE_POLICY = CompilePolicy.BY_TODO;
    protected boolean explicitAnnotationProcessingRequested = false;
    private CompileStates compileStates = new CompileStates();
    protected Set<JavaFileObject> inputFiles = new HashSet();
    public boolean keepComments = false;
    private boolean hasBeenUsed = false;
    private long start_msec = 0;
    public long elapsed_msec = 0;
    boolean processAnnotations = false;
    private JavacProcessingEnvironment procEnvImpl = null;
    HashMap<Env<AttrContext>, Queue<Pair<Env<AttrContext>, JCTree.JCClassDecl>>> desugaredEnvs = new HashMap<>();

    public static JavaCompiler instance(Context context) {
        JavaCompiler instance = (JavaCompiler) context.m501get(compilerKey);
        if (instance == null) {
            return new JavaCompiler(context);
        }
        return instance;
    }

    public static String version() {
        return version("release");
    }

    public static String fullVersion() {
        return version("full");
    }

    private static String version(String key) {
        if (versionRB == null) {
            try {
                versionRB = ResourceBundle.getBundle(versionRBName);
            } catch (MissingResourceException e) {
                return Log.getLocalizedString("version.not.available", new Object[0]);
            }
        }
        try {
            return versionRB.getString(key);
        } catch (MissingResourceException e2) {
            return Log.getLocalizedString("version.not.available", new Object[0]);
        }
    }

    protected enum CompilePolicy {
        ATTR_ONLY,
        CHECK_ONLY,
        SIMPLE,
        BY_FILE,
        BY_TODO;

        static CompilePolicy decode(String option) {
            if (option == null) {
                return JavaCompiler.DEFAULT_COMPILE_POLICY;
            }
            if (option.equals("attr")) {
                return ATTR_ONLY;
            }
            if (option.equals("check")) {
                return CHECK_ONLY;
            }
            if (option.equals("simple")) {
                return SIMPLE;
            }
            if (option.equals("byfile")) {
                return BY_FILE;
            }
            if (!option.equals("bytodo")) {
                return JavaCompiler.DEFAULT_COMPILE_POLICY;
            }
            return BY_TODO;
        }
    }

    protected enum ImplicitSourcePolicy {
        NONE,
        CLASS,
        UNSET;

        static ImplicitSourcePolicy decode(String option) {
            if (option == null) {
                return UNSET;
            }
            if (option.equals("none")) {
                return NONE;
            }
            if (option.equals("class")) {
                return CLASS;
            }
            return UNSET;
        }
    }

    public JavaCompiler(Context context) {
        Name nameFromString;
        this.context = context;
        context.m504put(compilerKey, this);
        if (context.m502get(JavaFileManager.class) == null) {
            JavacFileManager.preRegister(context);
        }
        this.names = Names.instance(context);
        this.f455log = Log.instance(context);
        this.diagFactory = JCDiagnostic.Factory.instance(context);
        this.reader = ClassReader.instance(context);
        this.make = TreeMaker.instance(context);
        this.writer = ClassWriter.instance(context);
        this.enter = Enter.instance(context);
        this.todo = Todo.instance(context);
        this.fileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
        this.parserFactory = ParserFactory.instance(context);
        try {
            this.syms = Symtab.instance(context);
        } catch (Symbol.CompletionFailure ex) {
            this.f455log.error("cant.access", ex.f340sym, ex.getDetailValue());
            if (ex instanceof ClassReader.BadClassFile) {
                throw new Abort();
            }
        }
        this.source = Source.instance(context);
        this.attr = Attr.instance(context);
        this.f453chk = Check.instance(context);
        this.f454gen = Gen.instance(context);
        this.flow = Flow.instance(context);
        this.transTypes = TransTypes.instance(context);
        this.lower = Lower.instance(context);
        this.annotate = Annotate.instance(context);
        this.types = Types.instance(context);
        this.taskListener = (TaskListener) context.m502get(TaskListener.class);
        this.reader.sourceCompleter = this;
        Options optionsInstance = Options.instance(context);
        this.options = optionsInstance;
        this.verbose = optionsInstance.isSet(OptionName.VERBOSE);
        this.sourceOutput = this.options.isSet(OptionName.PRINTSOURCE);
        this.stubOutput = this.options.isSet("-stubs");
        this.relax = this.options.isSet("-relax");
        this.printFlat = this.options.isSet("-printflat");
        this.attrParseOnly = this.options.isSet("-attrparseonly");
        this.encoding = this.options.m514get(OptionName.ENCODING);
        this.lineDebugInfo = this.options.isUnset(OptionName.G_CUSTOM) || this.options.isSet(OptionName.G_CUSTOM, "lines");
        this.genEndPos = this.options.isSet(OptionName.XJCOV) || context.m502get(DiagnosticListener.class) != null;
        this.devVerbose = this.options.isSet("dev");
        this.processPcks = this.options.isSet("process.packages");
        this.werror = this.options.isSet(OptionName.WERROR);
        if (this.source.compareTo(Source.DEFAULT) < 0) {
            if (this.options.isUnset(OptionName.XLINT_CUSTOM, "-" + Lint.LintCategory.OPTIONS.option)) {
                Object obj = this.fileManager;
                if ((obj instanceof BaseFileManager) && ((BaseFileManager) obj).isDefaultBootClassPath()) {
                    this.f455log.warning(Lint.LintCategory.OPTIONS, "source.no.bootclasspath", this.source.name);
                }
            }
        }
        this.verboseCompilePolicy = this.options.isSet("verboseCompilePolicy");
        if (this.attrParseOnly) {
            this.compilePolicy = CompilePolicy.ATTR_ONLY;
        } else {
            this.compilePolicy = CompilePolicy.decode(this.options.m515get("compilePolicy"));
        }
        this.implicitSourcePolicy = ImplicitSourcePolicy.decode(this.options.m515get("-implicit"));
        if (this.options.isSet("failcomplete")) {
            nameFromString = this.names.fromString(this.options.m515get("failcomplete"));
        } else {
            nameFromString = null;
        }
        this.completionFailureName = nameFromString;
        this.shouldStopPolicy = this.options.isSet("shouldStopPolicy") ? CompileState.valueOf(this.options.m515get("shouldStopPolicy")) : null;
        if (this.options.isUnset("oldDiags")) {
            this.f455log.setDiagnosticFormatter(RichDiagnosticFormatter.instance(context));
        }
    }

    public enum CompileState {
        PARSE(1),
        ENTER(2),
        PROCESS(3),
        ATTR(4),
        FLOW(5),
        TRANSTYPES(6),
        LOWER(7),
        GENERATE(8);

        private int value;

        CompileState(int value) {
            this.value = value;
        }

        boolean isDone(CompileState other) {
            return this.value >= other.value;
        }
    }

    protected class CompileStates extends HashMap<Env<AttrContext>, CompileState> {
        private static final long serialVersionUID = 1812267524140424433L;

        protected CompileStates() {
        }

        boolean isDone(Env<AttrContext> env, CompileState cs) {
            CompileState ecs = get(env);
            return ecs != null && ecs.isDone(cs);
        }
    }

    protected boolean shouldStop(CompileState cs) {
        if (this.shouldStopPolicy == null) {
            return errorCount() > 0 || unrecoverableError();
        }
        return cs.ordinal() > this.shouldStopPolicy.ordinal();
    }

    public int errorCount() {
        JavaCompiler javaCompiler = this.delegateCompiler;
        if (javaCompiler != null && javaCompiler != this) {
            return javaCompiler.errorCount();
        }
        if (this.werror && this.f455log.nerrors == 0 && this.f455log.nwarnings > 0) {
            this.f455log.error("warnings.and.werror", new Object[0]);
        }
        return this.f455log.nerrors;
    }

    protected final <T> Queue<T> stopIfError(CompileState cs, Queue<T> queue) {
        return shouldStop(cs) ? ListBuffer.m512lb() : queue;
    }

    protected final <T> List<T> stopIfError(CompileState cs, List<T> list) {
        return shouldStop(cs) ? List.m507nil() : list;
    }

    public int warningCount() {
        JavaCompiler javaCompiler = this.delegateCompiler;
        if (javaCompiler != null && javaCompiler != this) {
            return javaCompiler.warningCount();
        }
        return this.f455log.nwarnings;
    }

    public CharSequence readSource(JavaFileObject filename) {
        try {
            this.inputFiles.add(filename);
            return filename.getCharContent(false);
        } catch (IOException e) {
            this.f455log.error("error.reading.file", filename, JavacFileManager.getMessage(e));
            return null;
        }
    }

    protected JCTree.JCCompilationUnit parse(JavaFileObject filename, CharSequence content) {
        long msec = m481now();
        JCTree.JCCompilationUnit tree = this.make.TopLevel(List.m507nil(), null, List.m507nil());
        if (content != null) {
            if (this.verbose) {
                this.f455log.printVerbose("parsing.started", filename);
            }
            if (this.taskListener != null) {
                TaskEvent e = new TaskEvent(TaskEvent.Kind.PARSE, filename);
                this.taskListener.started(e);
            }
            Parser parser = this.parserFactory.newParser(content, keepComments(), this.genEndPos, this.lineDebugInfo);
            tree = parser.parseCompilationUnit();
            if (this.verbose) {
                this.f455log.printVerbose("parsing.done", Long.toString(elapsed(msec)));
            }
        }
        tree.sourcefile = filename;
        if (content != null && this.taskListener != null) {
            TaskEvent e2 = new TaskEvent(TaskEvent.Kind.PARSE, tree);
            this.taskListener.finished(e2);
        }
        return tree;
    }

    protected boolean keepComments() {
        return this.keepComments || this.sourceOutput || this.stubOutput;
    }

    @Deprecated
    public JCTree.JCCompilationUnit parse(String filename) {
        JavacFileManager fm = (JavacFileManager) this.fileManager;
        return parse(fm.getJavaFileObjectsFromStrings(List.m508of(filename)).iterator().next());
    }

    public JCTree.JCCompilationUnit parse(JavaFileObject filename) {
        JavaFileObject prev = this.f455log.useSource(filename);
        try {
            JCTree.JCCompilationUnit t = parse(filename, readSource(filename));
            if (t.endPositions != null) {
                this.f455log.setEndPosTable(filename, t.endPositions);
            }
            return t;
        } finally {
            this.f455log.useSource(prev);
        }
    }

    public Symbol resolveBinaryNameOrIdent(String name) {
        try {
            Name flatname = this.names.fromString(name.replace("/", "."));
            return this.reader.loadClass(flatname);
        } catch (Symbol.CompletionFailure e) {
            return resolveIdent(name);
        }
    }

    public Symbol resolveIdent(String name) {
        if (name.equals("")) {
            return this.syms.errSymbol;
        }
        JavaFileObject prev = this.f455log.useSource(null);
        JCTree.JCExpression tree = null;
        try {
            for (String s : name.split("\\.", -1)) {
                if (!SourceVersion.isIdentifier(s)) {
                    return this.syms.errSymbol;
                }
                tree = tree == null ? this.make.Ident(this.names.fromString(s)) : this.make.Select(tree, this.names.fromString(s));
            }
            JCTree.JCCompilationUnit toplevel = this.make.TopLevel(List.m507nil(), null, List.m507nil());
            toplevel.packge = this.syms.unnamedPackage;
            return this.attr.attribIdent(tree, toplevel);
        } finally {
            this.f455log.useSource(prev);
        }
    }

    JavaFileObject printSource(Env<AttrContext> env, JCTree.JCClassDecl cdef) throws IOException {
        JavaFileObject outFile = this.fileManager.getJavaFileForOutput(StandardLocation.CLASS_OUTPUT, cdef.f539sym.flatname.toString(), JavaFileObject.Kind.SOURCE, null);
        if (this.inputFiles.contains(outFile)) {
            this.f455log.error(cdef.m489pos(), "source.cant.overwrite.input.file", outFile);
            return null;
        }
        BufferedWriter out = new BufferedWriter(outFile.openWriter());
        try {
            new Pretty(out, true).printUnit(env.toplevel, cdef);
            if (this.verbose) {
                this.f455log.printVerbose("wrote.file", outFile);
            }
            return outFile;
        } finally {
            out.close();
        }
    }

    JavaFileObject genCode(Env<AttrContext> env, JCTree.JCClassDecl cdef) throws IOException {
        try {
            if (this.f454gen.genClass(env, cdef) && errorCount() == 0) {
                return this.writer.writeClass(cdef.f539sym);
            }
            return null;
        } catch (Symbol.CompletionFailure ex) {
            this.f453chk.completionError(cdef.m489pos(), ex);
            return null;
        } catch (ClassWriter.PoolOverflow e) {
            this.f455log.error(cdef.m489pos(), "limit.pool", new Object[0]);
            return null;
        } catch (ClassWriter.StringOverflow ex2) {
            this.f455log.error(cdef.m489pos(), "limit.string.overflow", ex2.value.substring(0, 20));
            return null;
        }
    }

    @Override
    public void complete(Symbol.ClassSymbol c) throws Symbol.CompletionFailure {
        JCTree.JCCompilationUnit tree;
        if (this.completionFailureName == c.fullname) {
            throw new Symbol.CompletionFailure(c, "user-selected completion failure by class name");
        }
        JavaFileObject filename = c.classfile;
        JavaFileObject prev = this.f455log.useSource(filename);
        try {
            try {
                tree = parse(filename, filename.getCharContent(false));
            } catch (IOException e) {
                this.f455log.error("error.reading.file", filename, JavacFileManager.getMessage(e));
                tree = this.make.TopLevel(List.m507nil(), null, List.m507nil());
            }
            this.f455log.useSource(prev);
            if (this.taskListener != null) {
                TaskEvent e2 = new TaskEvent(TaskEvent.Kind.ENTER, tree);
                this.taskListener.started(e2);
            }
            this.enter.complete(List.m508of(tree), c);
            if (this.taskListener != null) {
                TaskEvent e3 = new TaskEvent(TaskEvent.Kind.ENTER, tree);
                this.taskListener.finished(e3);
            }
            if (this.enter.getEnv(c) == null) {
                boolean isPkgInfo = tree.sourcefile.isNameCompatible("package-info", JavaFileObject.Kind.SOURCE);
                if (isPkgInfo) {
                    if (this.enter.getEnv(tree.packge) == null) {
                        JCDiagnostic diag = this.diagFactory.fragment("file.does.not.contain.package", c.location());
                        ClassReader classReader = this.reader;
                        Objects.requireNonNull(classReader);
                        throw classReader.new BadClassFile(c, filename, diag);
                    }
                } else {
                    JCDiagnostic diag2 = this.diagFactory.fragment("file.doesnt.contain.class", c.getQualifiedName());
                    ClassReader classReader2 = this.reader;
                    Objects.requireNonNull(classReader2);
                    throw classReader2.new BadClassFile(c, filename, diag2);
                }
            }
            this.implicitSourceFilesRead = true;
        } catch (Throwable th) {
            this.f455log.useSource(prev);
            throw th;
        }
    }

    public void compile(List<JavaFileObject> sourceFileObject) throws Throwable {
        compile(sourceFileObject, List.m507nil(), null);
    }

    public void compile(List<JavaFileObject> sourceFileObjects, List<String> classnames, Iterable<? extends Processor> processors) {
        JavacProcessingEnvironment javacProcessingEnvironment;
        if (processors != null && processors.iterator().hasNext()) {
            this.explicitAnnotationProcessingRequested = true;
        }
        if (this.hasBeenUsed) {
            throw new AssertionError("attempt to reuse JavaCompiler");
        }
        this.hasBeenUsed = true;
        this.options.m517put(OptionName.XLINT_CUSTOM + "-" + Lint.LintCategory.OPTIONS.option, "true");
        this.options.remove(OptionName.XLINT_CUSTOM + Lint.LintCategory.OPTIONS.option);
        this.start_msec = m481now();
        try {
            try {
                initProcessAnnotations(processors);
                JavaCompiler javaCompilerProcessAnnotations = processAnnotations(enterTrees(stopIfError(CompileState.PARSE, parseFiles(sourceFileObjects))), classnames);
                this.delegateCompiler = javaCompilerProcessAnnotations;
                javaCompilerProcessAnnotations.compile2();
                this.delegateCompiler.close();
                this.elapsed_msec = this.delegateCompiler.elapsed_msec;
                javacProcessingEnvironment = this.procEnvImpl;
                if (javacProcessingEnvironment == null) {
                    return;
                }
            } catch (Abort ex) {
                if (this.devVerbose) {
                    ex.printStackTrace(System.err);
                }
                javacProcessingEnvironment = this.procEnvImpl;
                if (javacProcessingEnvironment == null) {
                    return;
                }
            }
            javacProcessingEnvironment.close();
        } catch (Throwable th) {
            JavacProcessingEnvironment javacProcessingEnvironment2 = this.procEnvImpl;
            if (javacProcessingEnvironment2 != null) {
                javacProcessingEnvironment2.close();
            }
            throw th;
        }
    }

    static class C06801 {

        static final int[] f456x4ddff406;

        static {
            int[] iArr = new int[CompilePolicy.values().length];
            f456x4ddff406 = iArr;
            try {
                iArr[CompilePolicy.ATTR_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f456x4ddff406[CompilePolicy.CHECK_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f456x4ddff406[CompilePolicy.SIMPLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f456x4ddff406[CompilePolicy.BY_FILE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f456x4ddff406[CompilePolicy.BY_TODO.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    private void compile2() {
        try {
            int i = C06801.f456x4ddff406[this.compilePolicy.ordinal()];
            if (i == 1) {
                attribute(this.todo);
            } else if (i == 2) {
                flow(attribute(this.todo));
            } else if (i == 3) {
                generate(desugar(flow(attribute(this.todo))));
            } else if (i == 4) {
                Queue<Queue<Env<AttrContext>>> q = this.todo.groupByFile();
                while (!q.isEmpty() && !shouldStop(CompileState.ATTR)) {
                    generate(desugar(flow(attribute(q.remove()))));
                }
            } else if (i == 5) {
                while (!this.todo.isEmpty()) {
                    generate(desugar(flow(attribute(this.todo.remove()))));
                }
            } else {
                Assert.error("unknown compileJava policy");
            }
        } catch (Abort ex) {
            if (this.devVerbose) {
                ex.printStackTrace(System.err);
            }
        }
        if (this.verbose) {
            long jElapsed = elapsed(this.start_msec);
            this.elapsed_msec = jElapsed;
            this.f455log.printVerbose("total", Long.toString(jElapsed));
        }
        reportDeferredDiagnostics();
        if (!this.f455log.hasDiagnosticListener()) {
            printCount("error", errorCount());
            printCount("warn", warningCount());
        }
    }

    public List<JCTree.JCCompilationUnit> parseFiles(Iterable<JavaFileObject> fileObjects) {
        if (shouldStop(CompileState.PARSE)) {
            return List.m507nil();
        }
        ListBuffer<JCTree.JCCompilationUnit> trees = ListBuffer.m512lb();
        Set<JavaFileObject> filesSoFar = new HashSet<>();
        for (JavaFileObject fileObject : fileObjects) {
            if (!filesSoFar.contains(fileObject)) {
                filesSoFar.add(fileObject);
                trees.append(parse(fileObject));
            }
        }
        return trees.toList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree.JCCompilationUnit> enterTrees(List<JCTree.JCCompilationUnit> roots) {
        if (this.taskListener != null) {
            for (JCTree.JCCompilationUnit unit : roots) {
                TaskEvent e = new TaskEvent(TaskEvent.Kind.ENTER, unit);
                this.taskListener.started(e);
            }
        }
        this.enter.main(roots);
        if (this.taskListener != null) {
            for (JCTree.JCCompilationUnit unit2 : roots) {
                TaskEvent e2 = new TaskEvent(TaskEvent.Kind.ENTER, unit2);
                this.taskListener.finished(e2);
            }
        }
        if (this.sourceOutput || this.stubOutput) {
            ListBuffer<JCTree.JCClassDecl> cdefs = ListBuffer.m512lb();
            for (JCTree.JCCompilationUnit unit3 : roots) {
                for (List list = unit3.defs; list.nonEmpty(); list = list.tail) {
                    if (list.head instanceof JCTree.JCClassDecl) {
                        cdefs.append((JCTree.JCClassDecl) list.head);
                    }
                }
            }
            this.rootClasses = cdefs.toList();
        }
        for (JCTree.JCCompilationUnit unit4 : roots) {
            this.inputFiles.add(unit4.sourcefile);
        }
        return roots;
    }

    public void initProcessAnnotations(Iterable<? extends Processor> processors) {
        if (this.options.isSet(OptionName.PROC, "none")) {
            this.processAnnotations = false;
            return;
        }
        if (this.procEnvImpl == null) {
            JavacProcessingEnvironment javacProcessingEnvironment = new JavacProcessingEnvironment(this.context, processors);
            this.procEnvImpl = javacProcessingEnvironment;
            boolean zAtLeastOneProcessor = javacProcessingEnvironment.atLeastOneProcessor();
            this.processAnnotations = zAtLeastOneProcessor;
            if (zAtLeastOneProcessor) {
                this.options.m517put("save-parameter-names", "save-parameter-names");
                this.reader.saveParameterNames = true;
                this.keepComments = true;
                this.genEndPos = true;
                TaskListener taskListener = this.taskListener;
                if (taskListener != null) {
                    taskListener.started(new TaskEvent(TaskEvent.Kind.ANNOTATION_PROCESSING));
                }
                this.f455log.deferDiagnostics = true;
                return;
            }
            this.procEnvImpl.close();
        }
    }

    public JavaCompiler processAnnotations(List<JCTree.JCCompilationUnit> roots) {
        return processAnnotations(roots, List.m507nil());
    }

    public JavaCompiler processAnnotations(List<JCTree.JCCompilationUnit> roots, List<String> classnames) {
        if (shouldStop(CompileState.PROCESS) && unrecoverableError()) {
            this.f455log.reportDeferredDiagnostics();
            return this;
        }
        if (!this.processAnnotations) {
            if (this.options.isSet(OptionName.PROC, "only")) {
                this.f455log.warning("proc.proc-only.requested.no.procs", new Object[0]);
                this.todo.clear();
            }
            if (!classnames.isEmpty()) {
                this.f455log.error("proc.no.explicit.annotation.processing.requested", classnames);
            }
            this.f455log.reportDeferredDiagnostics();
            return this;
        }
        try {
            List<Symbol.ClassSymbol> classSymbols = List.m507nil();
            List<Symbol.PackageSymbol> pckSymbols = List.m507nil();
            if (!classnames.isEmpty()) {
                if (!explicitAnnotationProcessingRequested()) {
                    this.f455log.error("proc.no.explicit.annotation.processing.requested", classnames);
                    this.f455log.reportDeferredDiagnostics();
                    return this;
                }
                boolean errors = false;
                for (String nameStr : classnames) {
                    Symbol sym = resolveBinaryNameOrIdent(nameStr);
                    if (sym == null || ((sym.kind == 1 && !this.processPcks) || sym.kind == 72)) {
                        this.f455log.error("proc.cant.find.class", nameStr);
                        errors = true;
                    } else {
                        try {
                            if (sym.kind == 1) {
                                sym.complete();
                            }
                            if (sym.exists()) {
                                if (sym.kind == 1) {
                                    pckSymbols = pckSymbols.prepend((Symbol.PackageSymbol) sym);
                                } else {
                                    classSymbols = classSymbols.prepend((Symbol.ClassSymbol) sym);
                                }
                            } else {
                                Assert.check(sym.kind == 1);
                                this.f455log.warning("proc.package.does.not.exist", nameStr);
                                pckSymbols = pckSymbols.prepend((Symbol.PackageSymbol) sym);
                            }
                        } catch (Symbol.CompletionFailure e) {
                            this.f455log.error("proc.cant.find.class", nameStr);
                            errors = true;
                        }
                    }
                }
                if (errors) {
                    this.f455log.reportDeferredDiagnostics();
                    return this;
                }
            }
            try {
                JavaCompiler c = this.procEnvImpl.doProcessing(this.context, roots, classSymbols, pckSymbols);
                if (c != this) {
                    c.annotationProcessingOccurred = true;
                    this.annotationProcessingOccurred = true;
                }
                Assert.check(!c.f455log.deferDiagnostics && c.f455log.deferredDiagnostics.size() == 0);
                return c;
            } finally {
                this.procEnvImpl.close();
            }
        } catch (Symbol.CompletionFailure ex) {
            this.f455log.error("cant.access", ex.f340sym, ex.getDetailValue());
            this.f455log.reportDeferredDiagnostics();
            return this;
        }
    }

    private boolean unrecoverableError() {
        for (JCDiagnostic d : this.f455log.deferredDiagnostics) {
            if (d.getKind() == Diagnostic.Kind.ERROR && !d.isFlagSet(JCDiagnostic.DiagnosticFlag.RECOVERABLE)) {
                return true;
            }
        }
        return false;
    }

    boolean explicitAnnotationProcessingRequested() {
        return this.explicitAnnotationProcessingRequested || explicitAnnotationProcessingRequested(this.options);
    }

    static boolean explicitAnnotationProcessingRequested(Options options) {
        return options.isSet(OptionName.PROCESSOR) || options.isSet(OptionName.PROCESSORPATH) || options.isSet(OptionName.PROC, "only") || options.isSet(OptionName.XPRINT);
    }

    public Queue<Env<AttrContext>> attribute(Queue<Env<AttrContext>> envs) {
        ListBuffer<Env<AttrContext>> results = ListBuffer.m512lb();
        while (!envs.isEmpty()) {
            results.append(attribute(envs.remove()));
        }
        return stopIfError(CompileState.ATTR, results);
    }

    public Env<AttrContext> attribute(Env<AttrContext> env) {
        JavaFileObject javaFileObject;
        if (this.compileStates.isDone(env, CompileState.ATTR)) {
            return env;
        }
        if (this.verboseCompilePolicy) {
            printNote("[attribute " + env.enclClass.f539sym + "]");
        }
        if (this.verbose) {
            this.f455log.printVerbose("checking.attribution", env.enclClass.f539sym);
        }
        if (this.taskListener != null) {
            TaskEvent e = new TaskEvent(TaskEvent.Kind.ANALYZE, env.toplevel, env.enclClass.f539sym);
            this.taskListener.started(e);
        }
        Log c0730Log = this.f455log;
        if (env.enclClass.f539sym.sourcefile != null) {
            javaFileObject = env.enclClass.f539sym.sourcefile;
        } else {
            javaFileObject = env.toplevel.sourcefile;
        }
        JavaFileObject prev = c0730Log.useSource(javaFileObject);
        try {
            this.attr.attrib(env);
            if (errorCount() > 0 && !shouldStop(CompileState.ATTR)) {
                this.attr.postAttr(env);
            }
            this.compileStates.put(env, CompileState.ATTR);
            return env;
        } finally {
            this.f455log.useSource(prev);
        }
    }

    public Queue<Env<AttrContext>> flow(Queue<Env<AttrContext>> envs) {
        ListBuffer<Env<AttrContext>> results = ListBuffer.m512lb();
        for (Env<AttrContext> env : envs) {
            flow(env, results);
        }
        return stopIfError(CompileState.FLOW, results);
    }

    public Queue<Env<AttrContext>> flow(Env<AttrContext> env) {
        ListBuffer<Env<AttrContext>> results = ListBuffer.m512lb();
        flow(env, results);
        return stopIfError(CompileState.FLOW, results);
    }

    protected void flow(Env<AttrContext> env, Queue<Env<AttrContext>> results) {
        try {
            if (shouldStop(CompileState.FLOW)) {
                if (this.taskListener != null) {
                    TaskEvent e = new TaskEvent(TaskEvent.Kind.ANALYZE, env.toplevel, env.enclClass.f539sym);
                    this.taskListener.finished(e);
                    return;
                }
                return;
            }
            if (!this.relax && !this.compileStates.isDone(env, CompileState.FLOW)) {
                if (this.verboseCompilePolicy) {
                    printNote("[flow " + env.enclClass.f539sym + "]");
                }
                JavaFileObject prev = this.f455log.useSource(env.enclClass.f539sym.sourcefile != null ? env.enclClass.f539sym.sourcefile : env.toplevel.sourcefile);
                try {
                    this.make.m495at(0);
                    TreeMaker localMake = this.make.forToplevel(env.toplevel);
                    this.flow.analyzeTree(env, localMake);
                    this.compileStates.put(env, CompileState.FLOW);
                    if (shouldStop(CompileState.FLOW)) {
                        this.f455log.useSource(prev);
                        if (this.taskListener != null) {
                            TaskEvent e2 = new TaskEvent(TaskEvent.Kind.ANALYZE, env.toplevel, env.enclClass.f539sym);
                            this.taskListener.finished(e2);
                            return;
                        }
                        return;
                    }
                    results.add(env);
                    this.f455log.useSource(prev);
                    if (this.taskListener != null) {
                        TaskEvent e3 = new TaskEvent(TaskEvent.Kind.ANALYZE, env.toplevel, env.enclClass.f539sym);
                        this.taskListener.finished(e3);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    this.f455log.useSource(prev);
                    throw th;
                }
            }
            results.add(env);
            if (this.taskListener != null) {
                TaskEvent e4 = new TaskEvent(TaskEvent.Kind.ANALYZE, env.toplevel, env.enclClass.f539sym);
                this.taskListener.finished(e4);
            }
        } catch (Throwable th2) {
            if (this.taskListener != null) {
                TaskEvent e5 = new TaskEvent(TaskEvent.Kind.ANALYZE, env.toplevel, env.enclClass.f539sym);
                this.taskListener.finished(e5);
            }
            throw th2;
        }
    }

    public Queue<Pair<Env<AttrContext>, JCTree.JCClassDecl>> desugar(Queue<Env<AttrContext>> envs) {
        ListBuffer<Pair<Env<AttrContext>, JCTree.JCClassDecl>> results = ListBuffer.m512lb();
        for (Env<AttrContext> env : envs) {
            desugar(env, results);
        }
        return stopIfError(CompileState.FLOW, results);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void desugar(Env<AttrContext> env, Queue<Pair<Env<AttrContext>, JCTree.JCClassDecl>> results) {
        if (shouldStop(CompileState.TRANSTYPES)) {
            return;
        }
        if (this.implicitSourcePolicy != ImplicitSourcePolicy.NONE || this.inputFiles.contains(env.toplevel.sourcefile)) {
            if (this.compileStates.isDone(env, CompileState.LOWER)) {
                results.addAll(this.desugaredEnvs.get(env));
                return;
            }
            C1ScanNested scanner = new C1ScanNested(env);
            scanner.scan(env.tree);
            for (Env<AttrContext> dep : scanner.dependencies) {
                if (!this.compileStates.isDone(dep, CompileState.FLOW)) {
                    this.desugaredEnvs.put(dep, desugar(flow(attribute(dep))));
                }
            }
            if (shouldStop(CompileState.TRANSTYPES)) {
                return;
            }
            if (this.verboseCompilePolicy) {
                printNote("[desugar " + env.enclClass.f539sym + "]");
            }
            JavaFileObject prev = this.f455log.useSource(env.enclClass.f539sym.sourcefile != null ? env.enclClass.f539sym.sourcefile : env.toplevel.sourcefile);
            try {
                JCTree untranslated = env.tree;
                this.make.m495at(0);
                TreeMaker localMake = this.make.forToplevel(env.toplevel);
                if (env.tree instanceof JCTree.JCCompilationUnit) {
                    if (!this.stubOutput && !this.sourceOutput && !this.printFlat) {
                        if (shouldStop(CompileState.LOWER)) {
                            this.f455log.useSource(prev);
                            return;
                        }
                        List<JCTree> pdef = this.lower.translateTopLevelClass(env, env.tree, localMake);
                        if (pdef.head != null) {
                            Assert.check(pdef.tail.isEmpty());
                            results.add(new Pair<>(env, (JCTree.JCClassDecl) pdef.head));
                        }
                    }
                    this.f455log.useSource(prev);
                    return;
                }
                if (this.stubOutput) {
                    JCTree.JCClassDecl cdef = (JCTree.JCClassDecl) env.tree;
                    if ((untranslated instanceof JCTree.JCClassDecl) && this.rootClasses.contains((JCTree.JCClassDecl) untranslated) && ((cdef.mods.flags & 5) != 0 || cdef.f539sym.packge().getQualifiedName() == this.names.java_lang)) {
                        results.add(new Pair<>(env, removeMethodBodies(cdef)));
                    }
                    this.f455log.useSource(prev);
                    return;
                }
                if (shouldStop(CompileState.TRANSTYPES)) {
                    this.f455log.useSource(prev);
                    return;
                }
                env.tree = this.transTypes.translateTopLevelClass(env.tree, localMake);
                this.compileStates.put(env, CompileState.TRANSTYPES);
                if (shouldStop(CompileState.LOWER)) {
                    this.f455log.useSource(prev);
                    return;
                }
                if (this.sourceOutput) {
                    JCTree.JCClassDecl cdef2 = (JCTree.JCClassDecl) env.tree;
                    if ((untranslated instanceof JCTree.JCClassDecl) && this.rootClasses.contains((JCTree.JCClassDecl) untranslated)) {
                        results.add(new Pair<>(env, cdef2));
                    }
                    this.f455log.useSource(prev);
                    return;
                }
                List<JCTree> cdefs = this.lower.translateTopLevelClass(env, env.tree, localMake);
                this.compileStates.put(env, CompileState.LOWER);
                if (shouldStop(CompileState.LOWER)) {
                    this.f455log.useSource(prev);
                    return;
                }
                for (List list = cdefs; list.nonEmpty(); list = list.tail) {
                    JCTree.JCClassDecl cdef3 = (JCTree.JCClassDecl) list.head;
                    results.add(new Pair<>(env, cdef3));
                }
                this.f455log.useSource(prev);
            } catch (Throwable th) {
                this.f455log.useSource(prev);
                throw th;
            }
        }
    }

    class C1ScanNested extends TreeScanner {
        Set<Env<AttrContext>> dependencies = new LinkedHashSet();
        final Env val$env;

        C1ScanNested(Env c0621Env) {
            this.val$env = c0621Env;
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl node) {
            Type st = JavaCompiler.this.types.supertype(node.f539sym.type);
            if (st.f344tag == 10) {
                Symbol.ClassSymbol c = st.tsym.outermostClass();
                Env<AttrContext> stEnv = JavaCompiler.this.enter.getEnv(c);
                if (stEnv != null && this.val$env != stEnv && this.dependencies.add(stEnv)) {
                    scan(stEnv.tree);
                }
            }
            super.visitClassDef(node);
        }
    }

    public void generate(Queue<Pair<Env<AttrContext>, JCTree.JCClassDecl>> queue) {
        generate(queue, null);
    }

    public void generate(Queue<Pair<Env<AttrContext>, JCTree.JCClassDecl>> queue, Queue<JavaFileObject> results) {
        JavaFileObject file;
        if (shouldStop(CompileState.GENERATE)) {
            return;
        }
        boolean usePrintSource = this.stubOutput || this.sourceOutput || this.printFlat;
        for (Pair<Env<AttrContext>, JCTree.JCClassDecl> x : queue) {
            Env<AttrContext> env = x.f577fst;
            JCTree.JCClassDecl cdef = x.f578snd;
            if (this.verboseCompilePolicy) {
                StringBuilder sb = new StringBuilder();
                sb.append("[generate ");
                sb.append(usePrintSource ? " source" : "code");
                sb.append(" ");
                sb.append(cdef.f539sym);
                sb.append("]");
                printNote(sb.toString());
            }
            if (this.taskListener != null) {
                TaskEvent e = new TaskEvent(TaskEvent.Kind.GENERATE, env.toplevel, cdef.f539sym);
                this.taskListener.started(e);
            }
            JavaFileObject prev = this.f455log.useSource(env.enclClass.f539sym.sourcefile != null ? env.enclClass.f539sym.sourcefile : env.toplevel.sourcefile);
            if (usePrintSource) {
                try {
                    try {
                        file = printSource(env, cdef);
                    } catch (IOException ex) {
                        this.f455log.error(cdef.m489pos(), "class.cant.write", cdef.f539sym, ex.getMessage());
                        this.f455log.useSource(prev);
                        return;
                    }
                } catch (Throwable th) {
                    this.f455log.useSource(prev);
                    throw th;
                }
            } else {
                file = genCode(env, cdef);
            }
            if (results != null && file != null) {
                results.add(file);
            }
            this.f455log.useSource(prev);
            if (this.taskListener != null) {
                TaskEvent e2 = new TaskEvent(TaskEvent.Kind.GENERATE, env.toplevel, cdef.f539sym);
                this.taskListener.finished(e2);
            }
        }
    }

    Map<JCTree.JCCompilationUnit, Queue<Env<AttrContext>>> groupByFile(Queue<Env<AttrContext>> envs) {
        Map<JCTree.JCCompilationUnit, Queue<Env<AttrContext>>> map = new LinkedHashMap<>();
        for (Env<AttrContext> env : envs) {
            Queue<Env<AttrContext>> sublist = map.get(env.toplevel);
            if (sublist == null) {
                sublist = new ListBuffer<>();
                map.put(env.toplevel, sublist);
            }
            sublist.add(env);
        }
        return map;
    }

    JCTree.JCClassDecl removeMethodBodies(JCTree.JCClassDecl cdef) {
        final boolean isInterface = (cdef.mods.flags & 512) != 0;
        return (JCTree.JCClassDecl) new TreeTranslator() {
            @Override
            public void visitMethodDef(JCTree.JCMethodDecl tree) {
                tree.mods.flags &= -33;
                for (JCTree.JCVariableDecl vd : tree.params) {
                    vd.mods.flags &= -17;
                }
                tree.body = null;
                super.visitMethodDef(tree);
            }

            @Override
            public void visitVarDef(JCTree.JCVariableDecl tree) {
                if (tree.init != null && tree.init.type.constValue() == null) {
                    tree.init = null;
                }
                super.visitVarDef(tree);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public void visitClassDef(JCTree.JCClassDecl tree) {
                ListBuffer<JCTree> newdefs = ListBuffer.m512lb();
                for (List list = tree.defs; list.tail != null; list = list.tail) {
                    JCTree t = (JCTree) list.head;
                    int tag = t.getTag();
                    if (tag != 3) {
                        if (tag == 4) {
                            if (isInterface || (((JCTree.JCMethodDecl) t).mods.flags & 5) != 0 || ((JCTree.JCMethodDecl) t).f544sym.name == JavaCompiler.this.names.init || ((((JCTree.JCMethodDecl) t).mods.flags & 2) == 0 && ((JCTree.JCMethodDecl) t).f544sym.packge().getQualifiedName() == JavaCompiler.this.names.java_lang)) {
                                newdefs.append(t);
                            }
                        } else if (tag == 5 && (isInterface || (((JCTree.JCVariableDecl) t).mods.flags & 5) != 0 || ((((JCTree.JCVariableDecl) t).mods.flags & 2) == 0 && ((JCTree.JCVariableDecl) t).f547sym.packge().getQualifiedName() == JavaCompiler.this.names.java_lang))) {
                            newdefs.append(t);
                        }
                    } else if (isInterface || (((JCTree.JCClassDecl) t).mods.flags & 5) != 0 || ((((JCTree.JCClassDecl) t).mods.flags & 2) == 0 && ((JCTree.JCClassDecl) t).f539sym.packge().getQualifiedName() == JavaCompiler.this.names.java_lang)) {
                        newdefs.append(t);
                    }
                }
                List<JCTree> it = newdefs.toList();
                tree.defs = it;
                super.visitClassDef(tree);
            }
        }.translate(cdef);
    }

    public void reportDeferredDiagnostics() {
        if (errorCount() == 0 && this.annotationProcessingOccurred && this.implicitSourceFilesRead && this.implicitSourcePolicy == ImplicitSourcePolicy.UNSET) {
            if (explicitAnnotationProcessingRequested()) {
                this.f455log.warning("proc.use.implicit", new Object[0]);
            } else {
                this.f455log.warning("proc.use.proc.or.implicit", new Object[0]);
            }
        }
        this.f453chk.reportDeferredDiagnostics();
    }

    public void close() {
        close(true);
    }

    public void close(boolean disposeNames) {
        this.rootClasses = null;
        this.reader = null;
        this.make = null;
        this.writer = null;
        this.enter = null;
        Todo todo = this.todo;
        if (todo != null) {
            todo.clear();
        }
        this.todo = null;
        this.parserFactory = null;
        this.syms = null;
        this.source = null;
        this.attr = null;
        this.f453chk = null;
        this.f454gen = null;
        this.flow = null;
        this.transTypes = null;
        this.lower = null;
        this.annotate = null;
        this.types = null;
        this.f455log.flush();
        try {
            try {
                this.fileManager.flush();
                Names names = this.names;
                if (names != null && disposeNames) {
                    names.dispose();
                }
                this.names = null;
            } catch (IOException e) {
                throw new Abort(e);
            }
        } catch (Throwable th) {
            Names names2 = this.names;
            if (names2 != null && disposeNames) {
                names2.dispose();
            }
            this.names = null;
            throw th;
        }
    }

    protected void printNote(String lines) {
        Log.printLines(this.f455log.noticeWriter, lines);
    }

    protected void printCount(String kind, int count) {
        String key;
        if (count != 0) {
            if (count == 1) {
                key = "count." + kind;
            } else {
                key = "count." + kind + ".plural";
            }
            this.f455log.printErrLines(key, String.valueOf(count));
            this.f455log.errWriter.flush();
        }
    }

    private static long m481now() {
        return System.currentTimeMillis();
    }

    private static long elapsed(long then) {
        return m481now() - then;
    }

    public void initRound(JavaCompiler prev) {
        this.genEndPos = prev.genEndPos;
        this.keepComments = prev.keepComments;
        this.start_msec = prev.start_msec;
        this.hasBeenUsed = true;
    }

    public static void enableLogging() {
        Logger logger = Logger.getLogger(Main.class.getPackage().getName());
        logger.setLevel(Level.ALL);
        for (Handler h : logger.getParent().getHandlers()) {
            h.setLevel(Level.ALL);
        }
    }
}
