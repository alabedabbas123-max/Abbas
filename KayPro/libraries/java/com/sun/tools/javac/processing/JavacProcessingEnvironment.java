package com.sun.tools.javac.processing;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.file.FSInfo;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.model.JavacTypes;
import com.sun.tools.javac.api.JavacTaskImpl;
import com.sun.tools.javac.api.JavacTrees;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.parser.Keywords;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.Abort;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.ClientCodeException;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Convert;
import com.sun.tools.javac.util.FatalError;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.JavacMessages;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementScanner7;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;

public class JavacProcessingEnvironment implements ProcessingEnvironment, Closeable {
    private Context context;
    JCDiagnostic.Factory diags;
    private DiscoveredProcessors discoveredProcs;
    private final JavacElements elementUtils;
    private final boolean fatalErrors;
    private final JavacFiler filer;
    private boolean foundTypeProcessors;
    private final boolean lint;

    Log f507log;
    private final JavacMessager messager;
    private JavacMessages messages;
    Options options;
    private final Set<String> platformAnnotations;
    private final boolean printProcessorInfo;
    private final boolean printRounds;
    private final boolean procOnly;
    private ClassLoader processorClassLoader;
    private final Map<String, String> processorOptions;
    private final boolean showResolveErrors;
    Source source;
    private Set<Symbol.PackageSymbol> specifiedPackages = Collections.emptySet();
    private final JavacTypes typeUtils;
    private final Set<String> unmatchedProcessorOptions;
    private final boolean verbose;
    private final boolean werror;
    private static TreeScanner treeCleaner = new TreeScanner() {
        @Override
        public void scan(JCTree node) {
            super.scan(node);
            if (node != null) {
                node.type = null;
            }
        }

        @Override
        public void visitTopLevel(JCTree.JCCompilationUnit node) {
            node.packge = null;
            super.visitTopLevel(node);
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl node) {
            node.f539sym = null;
            super.visitClassDef(node);
        }

        @Override
        public void visitMethodDef(JCTree.JCMethodDecl node) {
            node.f544sym = null;
            super.visitMethodDef(node);
        }

        @Override
        public void visitVarDef(JCTree.JCVariableDecl node) {
            node.f547sym = null;
            super.visitVarDef(node);
        }

        @Override
        public void visitNewClass(JCTree.JCNewClass node) {
            node.constructor = null;
            super.visitNewClass(node);
        }

        @Override
        public void visitAssignop(JCTree.JCAssignOp node) {
            node.operator = null;
            super.visitAssignop(node);
        }

        @Override
        public void visitUnary(JCTree.JCUnary node) {
            node.operator = null;
            super.visitUnary(node);
        }

        @Override
        public void visitBinary(JCTree.JCBinary node) {
            node.operator = null;
            super.visitBinary(node);
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess node) {
            node.f542sym = null;
            super.visitSelect(node);
        }

        @Override
        public void visitIdent(JCTree.JCIdent node) {
            node.f543sym = null;
            super.visitIdent(node);
        }
    };
    private static final Pattern allMatches = Pattern.compile(".*");
    public static final Pattern noMatches = Pattern.compile("(\\P{all})+");

    public JavacProcessingEnvironment(Context context, Iterable<? extends Processor> processors) {
        this.context = context;
        this.f507log = Log.instance(context);
        this.source = Source.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        Options optionsInstance = Options.instance(context);
        this.options = optionsInstance;
        this.printProcessorInfo = optionsInstance.isSet(OptionName.XPRINTPROCESSORINFO);
        this.printRounds = this.options.isSet(OptionName.XPRINTROUNDS);
        this.verbose = this.options.isSet(OptionName.VERBOSE);
        this.lint = Lint.instance(context).isEnabled(Lint.LintCategory.PROCESSING);
        this.procOnly = this.options.isSet(OptionName.PROC, "only") || this.options.isSet(OptionName.XPRINT);
        this.fatalErrors = this.options.isSet("fatalEnterError");
        this.showResolveErrors = this.options.isSet("showResolveErrors");
        this.werror = this.options.isSet(OptionName.WERROR);
        this.platformAnnotations = initPlatformAnnotations();
        this.foundTypeProcessors = false;
        this.filer = new JavacFiler(context);
        this.messager = new JavacMessager(context, this);
        this.elementUtils = JavacElements.instance(context);
        this.typeUtils = JavacTypes.instance(context);
        this.processorOptions = initProcessorOptions(context);
        this.unmatchedProcessorOptions = initUnmatchedProcessorOptions();
        this.messages = JavacMessages.instance(context);
        initProcessorIterator(context, processors);
    }

    private Set<String> initPlatformAnnotations() {
        Set<String> platformAnnotations = new HashSet<>();
        platformAnnotations.add("java.lang.Deprecated");
        platformAnnotations.add("java.lang.Override");
        platformAnnotations.add("java.lang.SuppressWarnings");
        platformAnnotations.add("java.lang.annotation.Documented");
        platformAnnotations.add("java.lang.annotation.Inherited");
        platformAnnotations.add("java.lang.annotation.Retention");
        platformAnnotations.add("java.lang.annotation.Target");
        return Collections.unmodifiableSet(platformAnnotations);
    }

    private void initProcessorIterator(Context context, Iterable<? extends Processor> processors) {
        Iterator<? extends Processor> processorIterator;
        ClassLoader classLoader;
        Iterator<? extends Processor> processorIterator2;
        Log log = Log.instance(context);
        if (this.options.isSet(OptionName.XPRINT)) {
            try {
                Processor processor = (Processor) PrintingProcessor.class.newInstance();
                processorIterator = List.m508of(processor).iterator();
            } catch (Throwable t) {
                AssertionError assertError = new AssertionError("Problem instantiating PrintingProcessor.");
                assertError.initCause(t);
                throw assertError;
            }
        } else if (processors != null) {
            processorIterator = processors.iterator();
        } else {
            String processorNames = this.options.m514get(OptionName.PROCESSOR);
            JavaFileManager fileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
            try {
                if (fileManager.hasLocation(StandardLocation.ANNOTATION_PROCESSOR_PATH)) {
                    classLoader = fileManager.getClassLoader(StandardLocation.ANNOTATION_PROCESSOR_PATH);
                } else {
                    classLoader = fileManager.getClassLoader(StandardLocation.CLASS_PATH);
                }
                this.processorClassLoader = classLoader;
                if (processorNames != null) {
                    processorIterator2 = new NameProcessIterator(processorNames, this.processorClassLoader, log);
                } else {
                    processorIterator2 = new ServiceIterator(this.processorClassLoader, log);
                }
                processorIterator = processorIterator2;
            } catch (SecurityException e) {
                processorIterator = handleServiceLoaderUnavailability("proc.cant.create.loader", e);
            }
        }
        this.discoveredProcs = new DiscoveredProcessors(processorIterator);
    }

    public Iterator<Processor> handleServiceLoaderUnavailability(String key, Exception e) {
        Iterable<? extends File> workingPath;
        JavaFileManager fileManager = (JavaFileManager) this.context.m502get(JavaFileManager.class);
        if (fileManager instanceof JavacFileManager) {
            StandardJavaFileManager standardFileManager = (JavacFileManager) fileManager;
            if (fileManager.hasLocation(StandardLocation.ANNOTATION_PROCESSOR_PATH)) {
                workingPath = standardFileManager.getLocation(StandardLocation.ANNOTATION_PROCESSOR_PATH);
            } else {
                workingPath = standardFileManager.getLocation(StandardLocation.CLASS_PATH);
            }
            if (needClassLoader(this.options.m514get(OptionName.PROCESSOR), workingPath)) {
                handleException(key, e);
            }
        } else {
            handleException(key, e);
        }
        java.util.List<Processor> pl = Collections.emptyList();
        return pl.iterator();
    }

    private void handleException(String key, Exception e) {
        if (e == null) {
            this.f507log.error(key, new Object[0]);
            throw new Abort();
        }
        this.f507log.error(key, e.getLocalizedMessage());
        throw new Abort(e);
    }

    private class ServiceIterator implements Iterator<Processor> {
        private Iterator<?> iterator;
        private boolean jusl;
        private Object loader;
        private Class<?> loaderClass;

        private Log f511log;

        ServiceIterator(ClassLoader classLoader, Log log) {
            String loadMethodName;
            this.f511log = log;
            try {
                try {
                    this.loaderClass = Class.forName("java.util.ServiceLoader");
                    loadMethodName = "load";
                    this.jusl = true;
                } catch (ClassNotFoundException e) {
                    try {
                        this.loaderClass = Class.forName("sun.misc.Service");
                        this.jusl = false;
                        loadMethodName = "providers";
                    } catch (ClassNotFoundException e2) {
                        this.iterator = JavacProcessingEnvironment.this.handleServiceLoaderUnavailability("proc.no.service", null);
                        return;
                    }
                }
                Method loadMethod = this.loaderClass.getMethod(loadMethodName, Class.class, ClassLoader.class);
                Object result = loadMethod.invoke(null, Processor.class, classLoader);
                if (this.jusl) {
                    this.loader = result;
                    Method m = this.loaderClass.getMethod("iterator", new Class[0]);
                    result = m.invoke(result, new Object[0]);
                }
                this.iterator = (Iterator) result;
            } catch (Throwable t) {
                log.error("proc.service.problem", new Object[0]);
                throw new Abort(t);
            }
        }

        @Override
        public boolean hasNext() {
            try {
                return this.iterator.hasNext();
            } catch (Throwable t) {
                if ("ServiceConfigurationError".equals(t.getClass().getSimpleName())) {
                    this.f511log.error("proc.bad.config.file", t.getLocalizedMessage());
                }
                throw new Abort(t);
            }
        }

        @Override
        public Processor next() {
            try {
                return (Processor) this.iterator.next();
            } catch (Throwable t) {
                if ("ServiceConfigurationError".equals(t.getClass().getSimpleName())) {
                    this.f511log.error("proc.bad.config.file", t.getLocalizedMessage());
                } else {
                    this.f511log.error("proc.processor.constructor.error", t.getLocalizedMessage());
                }
                throw new Abort(t);
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void close() {
            if (this.jusl) {
                try {
                    Method reloadMethod = this.loaderClass.getMethod("reload", new Class[0]);
                    reloadMethod.invoke(this.loader, new Object[0]);
                } catch (Exception e) {
                }
            }
        }
    }

    private static class NameProcessIterator implements Iterator<Processor> {

        Log f509log;
        Iterator<String> names;
        Processor nextProc = null;
        ClassLoader processorCL;

        NameProcessIterator(String names, ClassLoader processorCL, Log log) {
            this.names = Arrays.asList(names.split(",")).iterator();
            this.processorCL = processorCL;
            this.f509log = log;
        }

        @Override
        public boolean hasNext() {
            if (this.nextProc != null) {
                return true;
            }
            if (!this.names.hasNext()) {
                return false;
            }
            String processorName = this.names.next();
            try {
                try {
                    Processor processor = (Processor) this.processorCL.loadClass(processorName).newInstance();
                    this.nextProc = processor;
                    return true;
                } catch (ClientCodeException e) {
                    throw e;
                } catch (Throwable t) {
                    throw new AnnotationProcessingError(t);
                }
            } catch (ClassCastException e2) {
                this.f509log.error("proc.processor.wrong.type", processorName);
                return false;
            } catch (ClassNotFoundException e3) {
                this.f509log.error("proc.processor.not.found", processorName);
                return false;
            } catch (Exception e4) {
                this.f509log.error("proc.processor.cant.instantiate", processorName);
                return false;
            }
        }

        @Override
        public Processor next() {
            if (hasNext()) {
                Processor p = this.nextProc;
                this.nextProc = null;
                return p;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public boolean atLeastOneProcessor() {
        return this.discoveredProcs.iterator2().hasNext();
    }

    private Map<String, String> initProcessorOptions(Context context) {
        Options options = Options.instance(context);
        Set<String> keySet = options.keySet();
        Map<String, String> tempOptions = new LinkedHashMap<>();
        for (String key : keySet) {
            if (key.startsWith("-A") && key.length() > 2) {
                int sepIndex = key.indexOf(61);
                String candidateKey = null;
                String candidateValue = null;
                if (sepIndex == -1) {
                    candidateKey = key.substring(2);
                } else if (sepIndex >= 3) {
                    candidateKey = key.substring(2, sepIndex);
                    candidateValue = sepIndex < key.length() + (-1) ? key.substring(sepIndex + 1) : null;
                }
                tempOptions.put(candidateKey, candidateValue);
            }
        }
        return Collections.unmodifiableMap(tempOptions);
    }

    private Set<String> initUnmatchedProcessorOptions() {
        Set<String> unmatchedProcessorOptions = new HashSet<>();
        unmatchedProcessorOptions.addAll(this.processorOptions.keySet());
        return unmatchedProcessorOptions;
    }

    static class ProcessorState {
        public boolean contributed = false;
        public Processor processor;
        private ArrayList<Pattern> supportedAnnotationPatterns;
        private ArrayList<String> supportedOptionNames;

        ProcessorState(Processor p, Log log, Source source, ProcessingEnvironment env) {
            this.processor = p;
            try {
                p.init(env);
                checkSourceVersionCompatibility(source, log);
                this.supportedAnnotationPatterns = new ArrayList<>();
                for (String importString : this.processor.getSupportedAnnotationTypes()) {
                    this.supportedAnnotationPatterns.add(JavacProcessingEnvironment.importStringToPattern(importString, this.processor, log));
                }
                this.supportedOptionNames = new ArrayList<>();
                for (String optionName : this.processor.getSupportedOptions()) {
                    if (checkOptionName(optionName, log)) {
                        this.supportedOptionNames.add(optionName);
                    }
                }
            } catch (ClientCodeException e) {
                throw e;
            } catch (Throwable t) {
                throw new AnnotationProcessingError(t);
            }
        }

        private void checkSourceVersionCompatibility(Source source, Log log) {
            SourceVersion procSourceVersion = this.processor.getSupportedSourceVersion();
            if (procSourceVersion.compareTo(Source.toSourceVersion(source)) < 0) {
                log.warning("proc.processor.incompatible.source.version", procSourceVersion, this.processor.getClass().getName(), source.name);
            }
        }

        private boolean checkOptionName(String optionName, Log log) {
            boolean valid = JavacProcessingEnvironment.isValidOptionName(optionName);
            if (!valid) {
                log.error("proc.processor.bad.option.name", optionName, this.processor.getClass().getName());
            }
            return valid;
        }

        public boolean annotationSupported(String annotationName) {
            for (Pattern p : this.supportedAnnotationPatterns) {
                if (p.matcher(annotationName).matches()) {
                    return true;
                }
            }
            return false;
        }

        public void removeSupportedOptions(Set<String> unmatchedProcessorOptions) {
            unmatchedProcessorOptions.removeAll(this.supportedOptionNames);
        }
    }

    class DiscoveredProcessors implements Iterable<ProcessorState> {
        ArrayList<ProcessorState> procStateList = new ArrayList<>();
        Iterator<? extends Processor> processorIterator;

        class ProcessorStateIterator implements Iterator<ProcessorState> {
            Iterator<ProcessorState> innerIter;
            boolean onProcInterator = false;

            DiscoveredProcessors f508psi;

            ProcessorStateIterator(DiscoveredProcessors psi) {
                this.f508psi = psi;
                this.innerIter = psi.procStateList.iterator();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public ProcessorState next() {
                if (!this.onProcInterator) {
                    if (this.innerIter.hasNext()) {
                        return this.innerIter.next();
                    }
                    this.onProcInterator = true;
                }
                if (this.f508psi.processorIterator.hasNext()) {
                    ProcessorState ps = new ProcessorState(this.f508psi.processorIterator.next(), JavacProcessingEnvironment.this.f507log, JavacProcessingEnvironment.this.source, JavacProcessingEnvironment.this);
                    this.f508psi.procStateList.add(ps);
                    return ps;
                }
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                if (this.onProcInterator) {
                    return this.f508psi.processorIterator.hasNext();
                }
                return this.innerIter.hasNext() || this.f508psi.processorIterator.hasNext();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            public void runContributingProcs(RoundEnvironment re) {
                if (!this.onProcInterator) {
                    Set<TypeElement> emptyTypeElements = Collections.emptySet();
                    while (this.innerIter.hasNext()) {
                        ProcessorState ps = this.innerIter.next();
                        if (ps.contributed) {
                            JavacProcessingEnvironment.this.callProcessor(ps.processor, emptyTypeElements, re);
                        }
                    }
                }
            }
        }

        @Override
        public Iterator<ProcessorState> iterator2() {
            return new ProcessorStateIterator(this);
        }

        DiscoveredProcessors(Iterator<? extends Processor> processorIterator) {
            this.processorIterator = processorIterator;
        }

        public void close() {
            Iterator<? extends Processor> it = this.processorIterator;
            if (it != null && (it instanceof ServiceIterator)) {
                ((ServiceIterator) it).close();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.sun.tools.javac.processing.JavacProcessingEnvironment$DiscoveredProcessors$ProcessorStateIterator] */
    public void discoverAndRunProcs(Context context, Set<TypeElement> annotationsPresent, List<Symbol.ClassSymbol> topLevelClasses, List<Symbol.PackageSymbol> packageInfoFiles) {
        Map<String, TypeElement> unmatchedAnnotations = new HashMap<>(annotationsPresent.size());
        for (TypeElement a : annotationsPresent) {
            unmatchedAnnotations.put(a.getQualifiedName().toString(), a);
        }
        if (unmatchedAnnotations.size() == 0) {
            unmatchedAnnotations.put("", null);
        }
        java.lang.Object Iterator2 = this.discoveredProcs.iterator2();
        Set<Element> rootElements = new LinkedHashSet<>();
        rootElements.addAll(topLevelClasses);
        rootElements.addAll(packageInfoFiles);
        RoundEnvironment renv = new JavacRoundEnvironment(false, false, Collections.unmodifiableSet(rootElements), this);
        while (unmatchedAnnotations.size() > 0 && Iterator2.hasNext()) {
            ProcessorState ps = Iterator2.next();
            Set<String> matchedNames = new HashSet<>();
            Set<TypeElement> typeElements = new LinkedHashSet<>();
            for (Map.Entry<String, TypeElement> entry : unmatchedAnnotations.entrySet()) {
                String unmatchedAnnotationName = entry.getKey();
                if (ps.annotationSupported(unmatchedAnnotationName)) {
                    matchedNames.add(unmatchedAnnotationName);
                    TypeElement te = entry.getValue();
                    if (te != null) {
                        typeElements.add(te);
                    }
                }
            }
            if (matchedNames.size() > 0 || ps.contributed) {
                boolean processingResult = callProcessor(ps.processor, typeElements, renv);
                ps.contributed = true;
                ps.removeSupportedOptions(this.unmatchedProcessorOptions);
                if (this.printProcessorInfo || this.verbose) {
                    this.f507log.printNoteLines("x.print.processor.info", ps.processor.getClass().getName(), matchedNames.toString(), Boolean.valueOf(processingResult));
                }
                if (processingResult) {
                    unmatchedAnnotations.keySet().removeAll(matchedNames);
                }
            }
        }
        unmatchedAnnotations.remove("");
        if (this.lint && unmatchedAnnotations.size() > 0) {
            unmatchedAnnotations.keySet().removeAll(this.platformAnnotations);
            if (unmatchedAnnotations.size() > 0) {
                Log c0730LogInstance = Log.instance(context);
                this.f507log = c0730LogInstance;
                c0730LogInstance.warning("proc.annotations.without.processors", unmatchedAnnotations.keySet());
            }
        }
        Iterator2.runContributingProcs(renv);
        if (this.options.isSet("displayFilerState")) {
            this.filer.displayState();
        }
    }

    public static class ComputeAnnotationSet extends ElementScanner7<Set<TypeElement>, Set<TypeElement>> {
        final Elements elements;

        public ComputeAnnotationSet(Elements elements) {
            this.elements = elements;
        }

        @Override
        public Set<TypeElement> visitPackage(PackageElement e, Set<TypeElement> p) {
            return p;
        }

        @Override
        public Set<TypeElement> scan(Element e, Set<TypeElement> p) {
            for (AnnotationMirror annotationMirror : this.elements.getAllAnnotationMirrors(e)) {
                Element e2 = annotationMirror.getAnnotationType().asElement();
                p.add((TypeElement) e2);
            }
            return (Set) super.scan(e, p);
        }
    }

    public boolean callProcessor(Processor proc, Set<? extends TypeElement> tes, RoundEnvironment renv) {
        try {
            return proc.process(tes, renv);
        } catch (ClassReader.BadClassFile ex) {
            this.f507log.error("proc.cant.access.1", ex.f340sym, ex.getDetailValue());
            return false;
        } catch (Symbol.CompletionFailure ex2) {
            StringWriter out = new StringWriter();
            ex2.printStackTrace(new PrintWriter(out));
            this.f507log.error("proc.cant.access", ex2.f340sym, ex2.getDetailValue(), out.toString());
            return false;
        } catch (ClientCodeException e) {
            throw e;
        } catch (Throwable t) {
            throw new AnnotationProcessingError(t);
        }
    }

    class Round {
        Set<TypeElement> annotationsPresent;
        final JavaCompiler compiler;
        final Context context;
        Map<String, JavaFileObject> genClassFiles;

        final Log f510log;
        int nMessagerErrors;
        final int number;
        List<Symbol.PackageSymbol> packageInfoFiles;
        List<JCTree.JCCompilationUnit> roots;
        List<Symbol.ClassSymbol> topLevelClasses;

        private Round(Context context, int number, int priorErrors, int priorWarnings) {
            this.context = context;
            this.number = number;
            this.compiler = JavaCompiler.instance(context);
            Log c0730LogInstance = Log.instance(context);
            this.f510log = c0730LogInstance;
            c0730LogInstance.nerrors = priorErrors;
            this.f510log.nwarnings += priorWarnings;
            this.f510log.deferDiagnostics = true;
            JavacProcessingEnvironment.this.context = context;
            this.topLevelClasses = List.m507nil();
            this.packageInfoFiles = List.m507nil();
        }

        Round(JavacProcessingEnvironment this$0, Context context, List<JCTree.JCCompilationUnit> roots, List<Symbol.ClassSymbol> classSymbols) {
            this(context, 1, 0, 0);
            this.roots = roots;
            this.genClassFiles = new HashMap();
            this.compiler.todo.clear();
            this.topLevelClasses = this$0.getTopLevelClasses(roots).prependList(classSymbols.reverse());
            this.packageInfoFiles = this$0.getPackageInfoFiles(roots);
            findAnnotationsPresent();
        }

        private Round(JavacProcessingEnvironment this$0, Round prev, Set<JavaFileObject> newSourceFiles, Map<String, JavaFileObject> newClassFiles) {
            this(prev.nextContext(), prev.number + 1, prev.nMessagerErrors, prev.compiler.f455log.nwarnings);
            this.genClassFiles = prev.genClassFiles;
            List<JCTree.JCCompilationUnit> parsedFiles = this.compiler.parseFiles(newSourceFiles);
            this.roots = JavacProcessingEnvironment.cleanTrees(prev.roots).appendList(parsedFiles);
            if (unrecoverableError()) {
                return;
            }
            enterClassFiles(this.genClassFiles);
            List<Symbol.ClassSymbol> newClasses = enterClassFiles(newClassFiles);
            this.genClassFiles.putAll(newClassFiles);
            enterTrees(this.roots);
            if (!unrecoverableError()) {
                this.topLevelClasses = JavacProcessingEnvironment.join(this$0.getTopLevelClasses(parsedFiles), this$0.getTopLevelClassesFromClasses(newClasses));
                this.packageInfoFiles = JavacProcessingEnvironment.join(this$0.getPackageInfoFiles(parsedFiles), this$0.getPackageInfoFilesFromClasses(newClasses));
                findAnnotationsPresent();
            }
        }

        Round next(Set<JavaFileObject> newSourceFiles, Map<String, JavaFileObject> newClassFiles) {
            try {
                return new Round(JavacProcessingEnvironment.this, this, newSourceFiles, newClassFiles);
            } finally {
                this.compiler.close(false);
            }
        }

        JavaCompiler finalCompiler(boolean errorStatus) {
            try {
                JavaCompiler c = JavaCompiler.instance(nextContext());
                c.f455log.nwarnings += this.compiler.f455log.nwarnings;
                if (errorStatus) {
                    c.f455log.nerrors += this.compiler.f455log.nerrors;
                }
                return c;
            } finally {
                this.compiler.close(false);
            }
        }

        int errorCount() {
            return this.compiler.errorCount();
        }

        int warningCount() {
            return this.compiler.warningCount();
        }

        boolean unrecoverableError() {
            if (JavacProcessingEnvironment.this.messager.errorRaised()) {
                return true;
            }
            for (JCDiagnostic d : this.f510log.deferredDiagnostics) {
                int i = C07142.$SwitchMap$javax$tools$Diagnostic$Kind[d.getKind().ordinal()];
                if (i != 1) {
                    if (i == 2 && (JavacProcessingEnvironment.this.fatalErrors || !d.isFlagSet(JCDiagnostic.DiagnosticFlag.RECOVERABLE))) {
                        return true;
                    }
                } else if (JavacProcessingEnvironment.this.werror) {
                    return true;
                }
            }
            return false;
        }

        void findAnnotationsPresent() {
            ComputeAnnotationSet annotationComputer = new ComputeAnnotationSet(JavacProcessingEnvironment.this.elementUtils);
            this.annotationsPresent = new LinkedHashSet();
            for (Symbol.ClassSymbol classSym : this.topLevelClasses) {
                annotationComputer.scan((Element) classSym, this.annotationsPresent);
            }
            for (Symbol.PackageSymbol pkgSym : this.packageInfoFiles) {
                annotationComputer.scan((Element) pkgSym, this.annotationsPresent);
            }
        }

        private List<Symbol.ClassSymbol> enterClassFiles(Map<String, JavaFileObject> classFiles) {
            Symbol.ClassSymbol cs;
            ClassReader reader = ClassReader.instance(this.context);
            Names names = Names.instance(this.context);
            List<Symbol.ClassSymbol> list = List.m507nil();
            for (Map.Entry<String, JavaFileObject> entry : classFiles.entrySet()) {
                Name name = names.fromString(entry.getKey());
                JavaFileObject file = entry.getValue();
                if (file.getKind() == JavaFileObject.Kind.CLASS) {
                    if (JavacProcessingEnvironment.this.isPkgInfo(file, JavaFileObject.Kind.CLASS)) {
                        Name packageName = Convert.packagePart(name);
                        Symbol.PackageSymbol p = reader.enterPackage(packageName);
                        if (p.package_info == null) {
                            p.package_info = reader.enterClass(Convert.shortName(name), p);
                        }
                        cs = p.package_info;
                        if (cs.classfile == null) {
                            cs.classfile = file;
                        }
                    } else {
                        cs = reader.enterClass(name, file);
                    }
                    list = list.prepend(cs);
                } else {
                    throw new AssertionError(file);
                }
            }
            return list.reverse();
        }

        private void enterTrees(List<JCTree.JCCompilationUnit> roots) {
            this.compiler.enterTrees(roots);
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [com.sun.tools.javac.processing.JavacProcessingEnvironment$DiscoveredProcessors$ProcessorStateIterator] */
        void m488run(boolean lastRound, boolean errorStatus) {
            printRoundInfo(lastRound);
            TaskListener taskListener = (TaskListener) this.context.m502get(TaskListener.class);
            if (taskListener != null) {
                taskListener.started(new TaskEvent(TaskEvent.Kind.ANNOTATION_PROCESSING_ROUND));
            }
            try {
                if (lastRound) {
                    JavacProcessingEnvironment.this.filer.setLastRound(true);
                    Set<Element> emptyRootElements = Collections.emptySet();
                    RoundEnvironment renv = new JavacRoundEnvironment(true, errorStatus, emptyRootElements, JavacProcessingEnvironment.this);
                    JavacProcessingEnvironment.this.discoveredProcs.iterator2().runContributingProcs(renv);
                } else {
                    JavacProcessingEnvironment.this.discoverAndRunProcs(this.context, this.annotationsPresent, this.topLevelClasses, this.packageInfoFiles);
                }
                if (taskListener != null) {
                    taskListener.finished(new TaskEvent(TaskEvent.Kind.ANNOTATION_PROCESSING_ROUND));
                }
                this.nMessagerErrors = JavacProcessingEnvironment.this.messager.errorCount();
            } catch (Throwable th) {
                if (taskListener != null) {
                    taskListener.finished(new TaskEvent(TaskEvent.Kind.ANNOTATION_PROCESSING_ROUND));
                }
                throw th;
            }
        }

        void showDiagnostics(boolean showAll) {
            Set<Diagnostic.Kind> kinds = EnumSet.allOf(Diagnostic.Kind.class);
            if (!showAll) {
                kinds.remove(Diagnostic.Kind.ERROR);
            }
            this.f510log.reportDeferredDiagnostics(kinds);
        }

        private void printRoundInfo(boolean lastRound) {
            if (JavacProcessingEnvironment.this.printRounds || JavacProcessingEnvironment.this.verbose) {
                List<Symbol.ClassSymbol> tlc = lastRound ? List.m507nil() : this.topLevelClasses;
                Set<TypeElement> ap = lastRound ? Collections.emptySet() : this.annotationsPresent;
                this.f510log.printNoteLines("x.print.rounds", Integer.valueOf(this.number), "{" + tlc.toString(", ") + "}", ap, Boolean.valueOf(lastRound));
            }
        }

        private Context nextContext() {
            Context next = new Context(this.context);
            Options options = Options.instance(this.context);
            Assert.checkNonNull(options);
            next.m504put(Options.optionsKey, options);
            PrintWriter out = (PrintWriter) this.context.m501get(Log.outKey);
            Assert.checkNonNull(out);
            next.m504put(Log.outKey, out);
            Locale locale = (Locale) this.context.m502get(Locale.class);
            if (locale != null) {
                next.m506put((Class<Locale>) Locale.class, locale);
            }
            Assert.checkNonNull(JavacProcessingEnvironment.this.messages);
            next.m504put(JavacMessages.messagesKey, JavacProcessingEnvironment.this.messages);
            Names names = Names.instance(this.context);
            Assert.checkNonNull(names);
            next.m504put(Names.namesKey, names);
            DiagnosticListener<?> dl = (DiagnosticListener) this.context.m502get(DiagnosticListener.class);
            if (dl != null) {
                next.m506put((Class<DiagnosticListener<?>>) DiagnosticListener.class, dl);
            }
            TaskListener tl = (TaskListener) this.context.m502get(TaskListener.class);
            if (tl != null) {
                next.m506put((Class<TaskListener>) TaskListener.class, tl);
            }
            FSInfo fsInfo = (FSInfo) this.context.m502get(FSInfo.class);
            if (fsInfo != null) {
                next.m506put((Class<FSInfo>) FSInfo.class, fsInfo);
            }
            JavaFileManager jfm = (JavaFileManager) this.context.m502get(JavaFileManager.class);
            Assert.checkNonNull(jfm);
            next.m506put((Class<JavaFileManager>) JavaFileManager.class, jfm);
            if (jfm instanceof JavacFileManager) {
                ((JavacFileManager) jfm).setContext(next);
            }
            Names names2 = Names.instance(this.context);
            Assert.checkNonNull(names2);
            next.m504put(Names.namesKey, names2);
            Keywords keywords = Keywords.instance(this.context);
            Assert.checkNonNull(keywords);
            next.m504put(Keywords.keywordsKey, keywords);
            JavaCompiler oldCompiler = JavaCompiler.instance(this.context);
            JavaCompiler nextCompiler = JavaCompiler.instance(next);
            nextCompiler.initRound(oldCompiler);
            JavacProcessingEnvironment.this.filer.newRound(next);
            JavacProcessingEnvironment.this.messager.newRound(next);
            JavacProcessingEnvironment.this.elementUtils.setContext(next);
            JavacProcessingEnvironment.this.typeUtils.setContext(next);
            JavacTaskImpl task = (JavacTaskImpl) this.context.m502get(JavacTaskImpl.class);
            if (task != null) {
                next.m506put((Class<JavacTaskImpl>) JavacTaskImpl.class, task);
                task.updateContext(next);
            }
            JavacTrees trees = (JavacTrees) this.context.m502get(JavacTrees.class);
            if (trees != null) {
                next.m506put((Class<JavacTrees>) JavacTrees.class, trees);
                trees.updateContext(next);
            }
            this.context.clear();
            return next;
        }
    }

    static class C07142 {
        static final int[] $SwitchMap$javax$tools$Diagnostic$Kind;

        static {
            int[] iArr = new int[Diagnostic.Kind.values().length];
            $SwitchMap$javax$tools$Diagnostic$Kind = iArr;
            try {
                iArr[Diagnostic.Kind.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public JavaCompiler doProcessing(Context context, List<JCTree.JCCompilationUnit> roots, List<Symbol.ClassSymbol> classSymbols, Iterable<? extends Symbol.PackageSymbol> pckSymbols) {
        boolean errorStatus;
        TaskListener taskListener = (TaskListener) context.m502get(TaskListener.class);
        this.f507log = Log.instance(context);
        Set<Symbol.PackageSymbol> specifiedPackages = new LinkedHashSet<>();
        for (Symbol.PackageSymbol psym : pckSymbols) {
            specifiedPackages.add(psym);
        }
        this.specifiedPackages = Collections.unmodifiableSet(specifiedPackages);
        Round round = new Round(this, context, roots, classSymbols);
        do {
            round.m488run(false, false);
            errorStatus = round.unrecoverableError();
            boolean moreToDo = moreToDo();
            round.showDiagnostics(errorStatus || this.showResolveErrors);
            round = round.next(new LinkedHashSet(this.filer.getGeneratedSourceFileObjects()), new LinkedHashMap(this.filer.getGeneratedClasses()));
            if (round.unrecoverableError()) {
                errorStatus = true;
            }
            if (!moreToDo) {
                break;
            }
        } while (!errorStatus);
        round.m488run(true, errorStatus);
        round.showDiagnostics(true);
        this.filer.warnIfUnclosedFiles();
        warnIfUnmatchedOptions();
        if (this.messager.errorRaised() || (this.werror && round.warningCount() > 0 && round.errorCount() > 0)) {
            errorStatus = true;
        }
        Set<JavaFileObject> newSourceFiles = new LinkedHashSet<>(this.filer.getGeneratedSourceFileObjects());
        List<JCTree.JCCompilationUnit> roots2 = cleanTrees(round.roots);
        JavaCompiler compiler = round.finalCompiler(errorStatus);
        if (newSourceFiles.size() > 0) {
            roots2 = roots2.appendList(compiler.parseFiles(newSourceFiles));
        }
        boolean errorStatus2 = errorStatus || compiler.errorCount() > 0;
        close();
        if (taskListener != null) {
            taskListener.finished(new TaskEvent(TaskEvent.Kind.ANNOTATION_PROCESSING));
        }
        if (errorStatus2) {
            if (compiler.errorCount() == 0) {
                compiler.f455log.nerrors++;
            }
            return compiler;
        }
        if (this.procOnly && !this.foundTypeProcessors) {
            compiler.todo.clear();
        } else {
            if (this.procOnly && this.foundTypeProcessors) {
                compiler.shouldStopPolicy = JavaCompiler.CompileState.FLOW;
            }
            compiler.enterTrees(roots2);
        }
        return compiler;
    }

    private void warnIfUnmatchedOptions() {
        if (!this.unmatchedProcessorOptions.isEmpty()) {
            this.f507log.warning("proc.unmatched.processor.options", this.unmatchedProcessorOptions.toString());
        }
    }

    @Override
    public void close() {
        this.filer.close();
        DiscoveredProcessors discoveredProcessors = this.discoveredProcs;
        if (discoveredProcessors != null) {
            discoveredProcessors.close();
        }
        this.discoveredProcs = null;
        Object obj = this.processorClassLoader;
        if (obj != null && (obj instanceof Closeable)) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                JCDiagnostic msg = this.diags.fragment("fatal.err.cant.close.loader", new Object[0]);
                throw new FatalError(msg, e);
            }
        }
    }

    public List<Symbol.ClassSymbol> getTopLevelClasses(List<? extends JCTree.JCCompilationUnit> units) {
        List<Symbol.ClassSymbol> classes = List.m507nil();
        for (JCTree.JCCompilationUnit unit : units) {
            for (JCTree node : unit.defs) {
                if (node.getTag() == 3) {
                    Symbol.ClassSymbol sym = ((JCTree.JCClassDecl) node).f539sym;
                    Assert.checkNonNull(sym);
                    classes = classes.prepend(sym);
                }
            }
        }
        return classes.reverse();
    }

    public List<Symbol.ClassSymbol> getTopLevelClassesFromClasses(List<? extends Symbol.ClassSymbol> syms) {
        List<Symbol.ClassSymbol> classes = List.m507nil();
        for (Symbol.ClassSymbol sym : syms) {
            if (!isPkgInfo(sym)) {
                classes = classes.prepend(sym);
            }
        }
        return classes.reverse();
    }

    public List<Symbol.PackageSymbol> getPackageInfoFiles(List<? extends JCTree.JCCompilationUnit> units) {
        List<Symbol.PackageSymbol> packages = List.m507nil();
        for (JCTree.JCCompilationUnit unit : units) {
            if (isPkgInfo(unit.sourcefile, JavaFileObject.Kind.SOURCE)) {
                packages = packages.prepend(unit.packge);
            }
        }
        return packages.reverse();
    }

    public List<Symbol.PackageSymbol> getPackageInfoFilesFromClasses(List<? extends Symbol.ClassSymbol> syms) {
        List<Symbol.PackageSymbol> packages = List.m507nil();
        for (Symbol.ClassSymbol sym : syms) {
            if (isPkgInfo(sym)) {
                packages = packages.prepend((Symbol.PackageSymbol) sym.owner);
            }
        }
        return packages.reverse();
    }

    public static <T> List<T> join(List<T> list1, List<T> list2) {
        return list1.appendList(list2);
    }

    public boolean isPkgInfo(JavaFileObject fo, JavaFileObject.Kind kind) {
        return fo.isNameCompatible("package-info", kind);
    }

    private boolean isPkgInfo(Symbol.ClassSymbol sym) {
        return isPkgInfo(sym.classfile, JavaFileObject.Kind.CLASS) && sym.packge().package_info == sym;
    }

    private boolean needClassLoader(String procNames, Iterable<? extends File> workingpath) {
        if (procNames != null) {
            return true;
        }
        URL[] urls = new URL[1];
        for (File pathElement : workingpath) {
            try {
                urls[0] = pathElement.toURI().toURL();
                if (ServiceProxy.hasService(Processor.class, urls)) {
                    return true;
                }
            } catch (ServiceProxy.ServiceConfigurationError e) {
                this.f507log.error("proc.bad.config.file", e.getLocalizedMessage());
                return true;
            } catch (MalformedURLException ex) {
                throw new AssertionError(ex);
            }
        }
        return false;
    }

    public static <T extends JCTree> List<T> cleanTrees(List<T> nodes) {
        for (T node : nodes) {
            treeCleaner.scan(node);
        }
        return nodes;
    }

    private boolean moreToDo() {
        return this.filer.newFiles();
    }

    @Override
    public Map<String, String> getOptions() {
        return this.processorOptions;
    }

    @Override
    public Messager getMessager() {
        return this.messager;
    }

    @Override
    public Filer getFiler() {
        return this.filer;
    }

    @Override
    public JavacElements getElementUtils() {
        return this.elementUtils;
    }

    @Override
    public JavacTypes getTypeUtils() {
        return this.typeUtils;
    }

    @Override
    public SourceVersion getSourceVersion() {
        return Source.toSourceVersion(this.source);
    }

    @Override
    public Locale getLocale() {
        return this.messages.getCurrentLocale();
    }

    public Set<Symbol.PackageSymbol> getSpecifiedPackages() {
        return this.specifiedPackages;
    }

    public static Pattern importStringToPattern(String s, Processor p, Log log) {
        if (isValidImportString(s)) {
            return validImportStringToPattern(s);
        }
        log.warning("proc.malformed.supported.string", s, p.getClass().getName());
        return noMatches;
    }

    public static boolean isValidImportString(String s) {
        if (s.equals("*")) {
            return true;
        }
        boolean valid = true;
        String t = s;
        int index = t.indexOf(42);
        if (index != -1) {
            if (index != t.length() - 1) {
                return false;
            }
            if (index - 1 >= 0) {
                valid = t.charAt(index + (-1)) == '.';
                t = t.substring(0, t.length() - 2);
            }
        }
        if (valid) {
            String[] javaIds = t.split("\\.", t.length() + 2);
            for (String javaId : javaIds) {
                valid &= SourceVersion.isIdentifier(javaId);
            }
        }
        return valid;
    }

    public static Pattern validImportStringToPattern(String s) {
        if (s.equals("*")) {
            return allMatches;
        }
        String s_prime = s.replace(".", "\\.");
        if (s_prime.endsWith("*")) {
            s_prime = s_prime.substring(0, s_prime.length() - 1) + ".+";
        }
        return Pattern.compile(s_prime);
    }

    public Context getContext() {
        return this.context;
    }

    public String toString() {
        return "javac ProcessingEnvironment";
    }

    public static boolean isValidOptionName(String optionName) {
        for (String s : optionName.split("\\.", -1)) {
            if (!SourceVersion.isIdentifier(s)) {
                return false;
            }
        }
        return true;
    }
}
