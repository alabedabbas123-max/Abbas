package com.sun.tools.javac.api;

import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.Tree;
import com.sun.source.util.JavacTask;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Attr;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.main.CommandLine;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.main.Main;
import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.model.JavacTypes;
import com.sun.tools.javac.parser.Parser;
import com.sun.tools.javac.parser.ParserFactory;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Options;
import java.io.File;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.processing.Processor;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class JavacTaskImpl extends JavacTask {
    private String[] args;

    private ClientCodeWrapper f324ccw;
    private String[] classNames;
    private JavaCompiler compiler;
    private Main compilerMain;
    private Context context;
    private List<JavaFileObject> fileObjects;
    private ListBuffer<Env<AttrContext>> genList;
    private Locale locale;
    private Map<JavaFileObject, JCTree.JCCompilationUnit> notYetEntered;
    private boolean parsed;
    private Iterable<? extends Processor> processors;
    private Integer result;
    private TaskListener taskListener;
    private AtomicBoolean used;

    JavacTaskImpl(Main compilerMain, String[] args, String[] classNames, Context context, List<JavaFileObject> fileObjects) {
        this.used = new AtomicBoolean();
        this.result = null;
        this.parsed = false;
        this.f324ccw = ClientCodeWrapper.instance(context);
        this.compilerMain = compilerMain;
        this.args = args;
        this.classNames = classNames;
        this.context = context;
        this.fileObjects = fileObjects;
        setLocale(Locale.getDefault());
        compilerMain.getClass();
        args.getClass();
        fileObjects.getClass();
    }

    JavacTaskImpl(Main compilerMain, Iterable<String> flags, Context context, Iterable<String> classes, Iterable<? extends JavaFileObject> fileObjects) {
        this(compilerMain, toArray(flags), toArray(classes), context, toList(fileObjects));
    }

    private static String[] toArray(Iterable<String> iter) {
        ListBuffer<String> result = new ListBuffer<>();
        if (iter != null) {
            for (String s : iter) {
                result.append(s);
            }
        }
        return (String[]) result.toArray(new String[result.length()]);
    }

    private static List<JavaFileObject> toList(Iterable<? extends JavaFileObject> fileObjects) {
        if (fileObjects == null) {
            return List.m507nil();
        }
        ListBuffer<JavaFileObject> result = new ListBuffer<>();
        for (JavaFileObject fo : fileObjects) {
            result.append(fo);
        }
        return result.toList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Boolean call() {
        if (!this.used.getAndSet(true)) {
            initContext();
            this.notYetEntered = new HashMap();
            this.compilerMain.setAPIMode(true);
            this.result = Integer.valueOf(this.compilerMain.compile(this.args, this.classNames, this.context, this.fileObjects, this.processors));
            cleanup();
            return Boolean.valueOf(this.result.intValue() == 0);
        }
        throw new IllegalStateException("multiple calls to method 'call'");
    }

    @Override
    public void setProcessors(Iterable<? extends Processor> processors) {
        processors.getClass();
        if (this.used.get()) {
            throw new IllegalStateException();
        }
        this.processors = processors;
    }

    @Override
    public void setLocale(Locale locale) {
        if (this.used.get()) {
            throw new IllegalStateException();
        }
        this.locale = locale;
    }

    private void prepareCompiler() throws IOException {
        if (this.used.getAndSet(true)) {
            if (this.compiler == null) {
                throw new IllegalStateException();
            }
            return;
        }
        initContext();
        this.compilerMain.setOptions(Options.instance(this.context));
        this.compilerMain.filenames = new LinkedHashSet();
        Collection<File> filenames = this.compilerMain.processArgs(CommandLine.parse(this.args), this.classNames);
        if (!filenames.isEmpty()) {
            throw new IllegalArgumentException("Malformed arguments " + toString(filenames, " "));
        }
        JavaCompiler javaCompilerInstance = JavaCompiler.instance(this.context);
        this.compiler = javaCompilerInstance;
        javaCompilerInstance.keepComments = true;
        this.compiler.genEndPos = true;
        this.compiler.initProcessAnnotations(this.processors);
        this.notYetEntered = new HashMap();
        for (JavaFileObject file : this.fileObjects) {
            this.notYetEntered.put(file, null);
        }
        this.genList = new ListBuffer<>();
        this.args = null;
        this.classNames = null;
    }

    <T> String toString(Iterable<T> items, String sep) {
        String currSep = "";
        StringBuilder sb = new StringBuilder();
        for (T item : items) {
            sb.append(currSep);
            sb.append(item.toString());
            currSep = sep;
        }
        return sb.toString();
    }

    private void initContext() {
        this.context.m506put((Class<JavacTaskImpl>) JavacTaskImpl.class, this);
        if (this.context.m502get(TaskListener.class) != null) {
            this.context.m506put((Class<TaskListener>) TaskListener.class, (TaskListener) null);
        }
        TaskListener taskListener = this.taskListener;
        if (taskListener != null) {
            this.context.m506put((Class<TaskListener>) TaskListener.class, this.f324ccw.wrap(taskListener));
        }
        this.context.m506put((Class<Locale>) Locale.class, this.locale);
    }

    void cleanup() {
        JavaCompiler javaCompiler = this.compiler;
        if (javaCompiler != null) {
            javaCompiler.close();
        }
        this.compiler = null;
        this.compilerMain = null;
        this.args = null;
        this.classNames = null;
        this.context = null;
        this.fileObjects = null;
        this.notYetEntered = null;
    }

    public JavaFileObject asJavaFileObject(File file) {
        JavacFileManager fm = (JavacFileManager) this.context.m502get(JavaFileManager.class);
        return fm.getRegularFile(file);
    }

    @Override
    public void setTaskListener(TaskListener taskListener) {
        this.taskListener = taskListener;
    }

    @Override
    public Iterable<? extends CompilationUnitTree> parse() throws IOException {
        try {
            prepareCompiler();
            List<JCTree.JCCompilationUnit> units = this.compiler.parseFiles(this.fileObjects);
            for (JCTree.JCCompilationUnit unit : units) {
                JavaFileObject file = unit.getSourceFile();
                if (this.notYetEntered.containsKey(file)) {
                    this.notYetEntered.put(file, unit);
                }
            }
            this.parsed = true;
            JavaCompiler javaCompiler = this.compiler;
            if (javaCompiler != null && javaCompiler.f455log != null) {
                this.compiler.f455log.flush();
            }
            return units;
        } catch (Throwable th) {
            this.parsed = true;
            JavaCompiler javaCompiler2 = this.compiler;
            if (javaCompiler2 != null && javaCompiler2.f455log != null) {
                this.compiler.f455log.flush();
            }
            throw th;
        }
    }

    public Iterable<? extends TypeElement> enter() throws IOException {
        return enter(null);
    }

    public Iterable<? extends TypeElement> enter(Iterable<? extends CompilationUnitTree> trees) throws IOException {
        prepareCompiler();
        ListBuffer<JCTree.JCCompilationUnit> roots = null;
        if (trees == null) {
            if (this.notYetEntered.size() > 0) {
                if (!this.parsed) {
                    parse();
                }
                for (JavaFileObject file : this.fileObjects) {
                    JCTree.JCCompilationUnit unit = this.notYetEntered.remove(file);
                    if (unit != null) {
                        if (roots == null) {
                            roots = new ListBuffer<>();
                        }
                        roots.append(unit);
                    }
                }
                this.notYetEntered.clear();
            }
        } else {
            for (CompilationUnitTree cu : trees) {
                if (cu instanceof JCTree.JCCompilationUnit) {
                    if (roots == null) {
                        roots = new ListBuffer<>();
                    }
                    roots.append((JCTree.JCCompilationUnit) cu);
                    this.notYetEntered.remove(cu.getSourceFile());
                } else {
                    throw new IllegalArgumentException(cu.toString());
                }
            }
        }
        if (roots == null) {
            return List.m507nil();
        }
        try {
            List<JCTree.JCCompilationUnit> units = this.compiler.enterTrees(roots.toList());
            if (this.notYetEntered.isEmpty()) {
                this.compiler = this.compiler.processAnnotations(units);
            }
            ListBuffer<TypeElement> elements = new ListBuffer<>();
            Iterator<JCTree.JCCompilationUnit> it = units.iterator();
            while (it.hasNext()) {
                for (JCTree node : it.next().defs) {
                    if (node.getTag() == 3) {
                        JCTree.JCClassDecl cdef = (JCTree.JCClassDecl) node;
                        if (cdef.f539sym != null) {
                            elements.append(cdef.f539sym);
                        }
                    }
                }
            }
            return elements.toList();
        } finally {
            this.compiler.f455log.flush();
        }
    }

    @Override
    public Iterable<? extends Element> analyze() throws IOException {
        return analyze(null);
    }

    public Iterable<? extends Element> analyze(Iterable<? extends TypeElement> classes) throws IOException {
        enter(null);
        final ListBuffer<Element> results = new ListBuffer<>();
        try {
            if (classes == null) {
                handleFlowResults(this.compiler.flow(this.compiler.attribute(this.compiler.todo)), results);
            } else {
                Filter f = new Filter() {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override
                    public void process(Env<AttrContext> env) {
                        JavacTaskImpl javacTaskImpl = JavacTaskImpl.this;
                        javacTaskImpl.handleFlowResults(javacTaskImpl.compiler.flow(JavacTaskImpl.this.compiler.attribute(env)), results);
                    }
                };
                f.m446run(this.compiler.todo, classes);
            }
            this.compiler.f455log.flush();
            return results;
        } catch (Throwable th) {
            this.compiler.f455log.flush();
            throw th;
        }
    }

    public void handleFlowResults(Queue<Env<AttrContext>> queue, ListBuffer<Element> elems) {
        for (Env<AttrContext> env : queue) {
            int tag = env.tree.getTag();
            if (tag == 1) {
                JCTree.JCCompilationUnit unit = (JCTree.JCCompilationUnit) env.tree;
                if (unit.packge != null) {
                    elems.append(unit.packge);
                }
            } else if (tag == 3) {
                JCTree.JCClassDecl cdef = (JCTree.JCClassDecl) env.tree;
                if (cdef.f539sym != null) {
                    elems.append(cdef.f539sym);
                }
            }
        }
        this.genList.addAll(queue);
    }

    @Override
    public Iterable<? extends JavaFileObject> generate() throws IOException {
        return generate(null);
    }

    public Iterable<? extends JavaFileObject> generate(Iterable<? extends TypeElement> classes) throws IOException {
        final ListBuffer<JavaFileObject> results = new ListBuffer<>();
        try {
            analyze(null);
            if (classes == null) {
                this.compiler.generate(this.compiler.desugar(this.genList), results);
                this.genList.clear();
            } else {
                Filter f = new Filter() {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override
                    public void process(Env<AttrContext> env) {
                        JavacTaskImpl.this.compiler.generate(JavacTaskImpl.this.compiler.desugar(ListBuffer.m513of(env)), results);
                    }
                };
                f.m446run(this.genList, classes);
            }
            if (this.genList.isEmpty()) {
                this.compiler.reportDeferredDiagnostics();
                cleanup();
            }
            return results;
        } finally {
            JavaCompiler javaCompiler = this.compiler;
            if (javaCompiler != null) {
                javaCompiler.f455log.flush();
            }
        }
    }

    @Override
    public TypeMirror getTypeMirror(Iterable<? extends Tree> path) {
        Tree last = null;
        for (Tree node : path) {
            last = node;
        }
        return ((JCTree) last).type;
    }

    @Override
    public JavacElements getElements() {
        Context context = this.context;
        if (context == null) {
            throw new IllegalStateException();
        }
        return JavacElements.instance(context);
    }

    @Override
    public JavacTypes getTypes() {
        Context context = this.context;
        if (context == null) {
            throw new IllegalStateException();
        }
        return JavacTypes.instance(context);
    }

    public Iterable<? extends Tree> pathFor(CompilationUnitTree unit, Tree node) {
        return TreeInfo.pathFor((JCTree) node, (JCTree.JCCompilationUnit) unit).reverse();
    }

    abstract class Filter {
        abstract void process(Env<AttrContext> c0621Env);

        Filter() {
        }

        void m446run(Queue<Env<AttrContext>> list, Iterable<? extends TypeElement> classes) {
            Set<TypeElement> set = new HashSet<>();
            for (TypeElement item : classes) {
                set.add(item);
            }
            ListBuffer<Env<AttrContext>> defer = ListBuffer.m512lb();
            while (list.peek() != null) {
                Env<AttrContext> env = list.remove();
                Symbol.ClassSymbol csym = env.enclClass.f539sym;
                if (csym != null && set.contains(csym.outermostClass())) {
                    process(env);
                } else {
                    defer = defer.append(env);
                }
            }
            list.addAll(defer);
        }
    }

    public Context getContext() {
        return this.context;
    }

    public void updateContext(Context newContext) {
        this.context = newContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type parseType(String expr, TypeElement typeElement) {
        if (expr == null || expr.equals("")) {
            throw new IllegalArgumentException();
        }
        JavaCompiler javaCompilerInstance = JavaCompiler.instance(this.context);
        this.compiler = javaCompilerInstance;
        JavaFileObject prev = javaCompilerInstance.f455log.useSource(null);
        ParserFactory parserFactory = ParserFactory.instance(this.context);
        Attr attr = Attr.instance(this.context);
        try {
            CharBuffer buf = CharBuffer.wrap((expr + "\u0000").toCharArray(), 0, expr.length());
            Parser parser = parserFactory.newParser(buf, false, false, false);
            JCTree tree = parser.parseType();
            return attr.attribType(tree, (Symbol.TypeSymbol) typeElement);
        } finally {
            this.compiler.f455log.useSource(prev);
        }
    }
}
