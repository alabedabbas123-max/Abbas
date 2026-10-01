package com.sun.tools.javac.api;

import com.sun.source.tree.CatchTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.Scope;
import com.sun.source.tree.Tree;
import com.sun.source.util.SourcePositions;
import com.sun.source.util.TreePath;
import com.sun.source.util.Trees;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Attr;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.comp.Enter;
import com.sun.tools.javac.comp.MemberEnter;
import com.sun.tools.javac.comp.Resolve;
import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeCopier;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Pair;
import java.io.IOException;
import java.util.Map;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;

public class JavacTrees extends Trees {
    private Attr attr;
    private JavacElements elements;
    private Enter enter;
    private JavacTaskImpl javacTaskImpl;

    private Log f325log;
    private MemberEnter memberEnter;
    private Resolve resolve;
    private TreeMaker treeMaker;

    public static JavacTrees instance(JavaCompiler.CompilationTask task) {
        if (!(task instanceof JavacTaskImpl)) {
            throw new IllegalArgumentException();
        }
        return instance(((JavacTaskImpl) task).getContext());
    }

    public static JavacTrees instance(ProcessingEnvironment env) {
        if (!(env instanceof JavacProcessingEnvironment)) {
            throw new IllegalArgumentException();
        }
        return instance(((JavacProcessingEnvironment) env).getContext());
    }

    public static JavacTrees instance(Context context) {
        JavacTrees instance = (JavacTrees) context.m502get(JavacTrees.class);
        if (instance == null) {
            return new JavacTrees(context);
        }
        return instance;
    }

    private JavacTrees(Context context) {
        context.m506put((Class<JavacTrees>) JavacTrees.class, this);
        init(context);
    }

    public void updateContext(Context context) {
        init(context);
    }

    private void init(Context context) {
        this.attr = Attr.instance(context);
        this.enter = Enter.instance(context);
        this.elements = JavacElements.instance(context);
        this.f325log = Log.instance(context);
        this.resolve = Resolve.instance(context);
        this.treeMaker = TreeMaker.instance(context);
        this.memberEnter = MemberEnter.instance(context);
        this.javacTaskImpl = (JavacTaskImpl) context.m502get(JavacTaskImpl.class);
    }

    @Override
    public SourcePositions getSourcePositions() {
        return new SourcePositions() {
            @Override
            public long getStartPosition(CompilationUnitTree file, Tree tree) {
                return TreeInfo.getStartPos((JCTree) tree);
            }

            @Override
            public long getEndPosition(CompilationUnitTree file, Tree tree) {
                Map<JCTree, Integer> endPositions = ((JCTree.JCCompilationUnit) file).endPositions;
                return TreeInfo.getEndPos((JCTree) tree, endPositions);
            }
        };
    }

    @Override
    public JCTree.JCClassDecl getTree(TypeElement element) {
        return (JCTree.JCClassDecl) getTree((Element) element);
    }

    @Override
    public JCTree.JCMethodDecl getTree(ExecutableElement method) {
        return (JCTree.JCMethodDecl) getTree((Element) method);
    }

    @Override
    public JCTree getTree(Element element) {
        JCTree.JCClassDecl classNode;
        Symbol symbol = (Symbol) element;
        Symbol.TypeSymbol enclosing = symbol.enclClass();
        Env<AttrContext> env = this.enter.getEnv(enclosing);
        if (env != null && (classNode = env.enclClass) != null) {
            if (TreeInfo.symbolFor(classNode) == element) {
                return classNode;
            }
            for (JCTree node : classNode.getMembers()) {
                if (TreeInfo.symbolFor(node) == element) {
                    return node;
                }
            }
        }
        return null;
    }

    @Override
    public JCTree getTree(Element e, AnnotationMirror a) {
        return getTree(e, a, (AnnotationValue) null);
    }

    @Override
    public JCTree getTree(Element e, AnnotationMirror a, AnnotationValue v) {
        Pair<JCTree, JCTree.JCCompilationUnit> treeTopLevel = this.elements.getTreeAndTopLevel(e, a, v);
        if (treeTopLevel == null) {
            return null;
        }
        return treeTopLevel.f577fst;
    }

    @Override
    public TreePath getPath(CompilationUnitTree unit, Tree node) {
        return TreePath.getPath(unit, node);
    }

    @Override
    public TreePath getPath(Element e) {
        return getPath(e, null, null);
    }

    @Override
    public TreePath getPath(Element e, AnnotationMirror a) {
        return getPath(e, a, null);
    }

    @Override
    public TreePath getPath(Element e, AnnotationMirror a, AnnotationValue v) {
        Pair<JCTree, JCTree.JCCompilationUnit> treeTopLevel = this.elements.getTreeAndTopLevel(e, a, v);
        if (treeTopLevel == null) {
            return null;
        }
        return TreePath.getPath(treeTopLevel.f578snd, treeTopLevel.f577fst);
    }

    @Override
    public Element getElement(TreePath path) {
        JCTree tree = (JCTree) path.getLeaf();
        Symbol sym = TreeInfo.symbolFor(tree);
        if (sym == null && TreeInfo.isDeclaration(tree)) {
            for (TreePath p = path; p != null; p = p.getParentPath()) {
                JCTree t = (JCTree) p.getLeaf();
                if (t.getTag() == 3) {
                    JCTree.JCClassDecl ct = (JCTree.JCClassDecl) t;
                    if (ct.f539sym != null) {
                        if ((ct.f539sym.flags_field & 268435456) != 0) {
                            this.attr.attribClass(ct.m489pos(), ct.f539sym);
                            return TreeInfo.symbolFor(tree);
                        }
                        return sym;
                    }
                }
            }
            return sym;
        }
        return sym;
    }

    @Override
    public TypeMirror getTypeMirror(TreePath path) {
        Tree t = path.getLeaf();
        return ((JCTree) t).type;
    }

    @Override
    public JavacScope getScope(TreePath path) {
        return new JavacScope(getAttrContext(path));
    }

    @Override
    public String getDocComment(TreePath path) {
        CompilationUnitTree t = path.getCompilationUnit();
        if (t instanceof JCTree.JCCompilationUnit) {
            JCTree.JCCompilationUnit cu = (JCTree.JCCompilationUnit) t;
            if (cu.docComments != null) {
                return cu.docComments.get(path.getLeaf());
            }
            return null;
        }
        return null;
    }

    @Override
    public boolean isAccessible(Scope scope, TypeElement type) {
        if ((scope instanceof JavacScope) && (type instanceof Symbol.ClassSymbol)) {
            Env<AttrContext> env = ((JavacScope) scope).f323env;
            return this.resolve.isAccessible(env, (Symbol.TypeSymbol) type, true);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public boolean isAccessible(Scope scope, Element member, DeclaredType declaredType) {
        if ((scope instanceof JavacScope) && (member instanceof Symbol) && (declaredType instanceof Type)) {
            Env<AttrContext> env = ((JavacScope) scope).f323env;
            return this.resolve.isAccessible(env, (Type) declaredType, (Symbol) member, true);
        }
        return false;
    }

    private Env<AttrContext> getAttrContext(TreePath path) {
        if (!(path.getLeaf() instanceof JCTree)) {
            throw new IllegalArgumentException();
        }
        JavacTaskImpl javacTaskImpl = this.javacTaskImpl;
        if (javacTaskImpl != null) {
            try {
                javacTaskImpl.enter(null);
            } catch (IOException e) {
                throw new Error("unexpected error while entering symbols: " + e);
            }
        }
        JCTree.JCCompilationUnit unit = (JCTree.JCCompilationUnit) path.getCompilationUnit();
        Copier copier = new Copier(this.treeMaker.forToplevel(unit));
        Env<AttrContext> env = null;
        JCTree.JCMethodDecl method = null;
        JCTree.JCVariableDecl field = null;
        List listM507nil = List.m507nil();
        for (TreePath p = path; p != null; p = p.getParentPath()) {
            listM507nil = listM507nil.prepend(p.getLeaf());
        }
        while (listM507nil.nonEmpty()) {
            Tree tree = (Tree) listM507nil.head;
            switch (C05672.$SwitchMap$com$sun$source$tree$Tree$Kind[tree.getKind().ordinal()]) {
                case 1:
                    env = this.enter.getTopLevelEnv((JCTree.JCCompilationUnit) tree);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    env = this.enter.getClassEnv(((JCTree.JCClassDecl) tree).f539sym);
                    break;
                case 6:
                    method = (JCTree.JCMethodDecl) tree;
                    break;
                case 7:
                    field = (JCTree.JCVariableDecl) tree;
                    break;
                case 8:
                    if (method != null) {
                        env = this.memberEnter.getMethodEnv(method, env);
                    }
                    JCTree body = copier.copy((JCTree) tree, (JCTree) path.getLeaf());
                    return attribStatToTree(body, env, copier.leafCopy);
                default:
                    if (field != null && field.getInitializer() == tree) {
                        Env<AttrContext> env2 = this.memberEnter.getInitEnv(field, env);
                        JCTree.JCExpression expr = (JCTree.JCExpression) copier.copy((JCTree.JCExpression) tree, (JCTree) path.getLeaf());
                        return attribExprToTree(expr, env2, copier.leafCopy);
                    }
                    break;
                    break;
            }
            listM507nil = listM507nil.tail;
        }
        return field != null ? this.memberEnter.getInitEnv(field, env) : env;
    }

    private Env<AttrContext> attribStatToTree(JCTree stat, Env<AttrContext> env, JCTree tree) {
        JavaFileObject prev = this.f325log.useSource(env.toplevel.sourcefile);
        try {
            return this.attr.attribStatToTree(stat, env, tree);
        } finally {
            this.f325log.useSource(prev);
        }
    }

    private Env<AttrContext> attribExprToTree(JCTree.JCExpression expr, Env<AttrContext> env, JCTree tree) {
        JavaFileObject prev = this.f325log.useSource(env.toplevel.sourcefile);
        try {
            return this.attr.attribExprToTree(expr, env, tree);
        } finally {
            this.f325log.useSource(prev);
        }
    }

    static class Copier extends TreeCopier<JCTree> {
        JCTree leafCopy;

        Copier(TreeMaker M) {
            super(M);
            this.leafCopy = null;
        }

        @Override
        public <T extends JCTree> T copy(T t, JCTree jCTree) {
            T t2 = (T) super.copy((JCTree) t, jCTree);
            if (t == jCTree) {
                this.leafCopy = t2;
            }
            return t2;
        }
    }

    @Override
    public TypeMirror getOriginalType(ErrorType errorType) {
        if (errorType instanceof Type.ErrorType) {
            return ((Type.ErrorType) errorType).getOriginalType();
        }
        return Type.noType;
    }

    @Override
    public void printMessage(Diagnostic.Kind kind, CharSequence msg, Tree t, CompilationUnitTree root) {
        JavaFileObject oldSource = null;
        JCDiagnostic.DiagnosticPosition pos = null;
        JavaFileObject newSource = root.getSourceFile();
        if (newSource != null) {
            oldSource = this.f325log.useSource(newSource);
            pos = ((JCTree) t).m489pos();
        }
        try {
            int i = C05672.$SwitchMap$javax$tools$Diagnostic$Kind[kind.ordinal()];
            if (i == 1) {
                boolean prev = this.f325log.multipleErrors;
                try {
                    this.f325log.error(pos, "proc.messager", msg.toString());
                    this.f325log.multipleErrors = prev;
                } catch (Throwable th) {
                    this.f325log.multipleErrors = prev;
                    throw th;
                }
            } else if (i == 2) {
                this.f325log.warning(pos, "proc.messager", msg.toString());
            } else if (i == 3) {
                this.f325log.mandatoryWarning(pos, "proc.messager", msg.toString());
            } else {
                this.f325log.note(pos, "proc.messager", msg.toString());
            }
            if (oldSource != null) {
                this.f325log.useSource(oldSource);
            }
        } catch (Throwable th2) {
            if (oldSource != null) {
                this.f325log.useSource(oldSource);
            }
            throw th2;
        }
    }

    static class C05672 {
        static final int[] $SwitchMap$com$sun$source$tree$Tree$Kind;
        static final int[] $SwitchMap$javax$tools$Diagnostic$Kind;

        static {
            int[] iArr = new int[Diagnostic.Kind.values().length];
            $SwitchMap$javax$tools$Diagnostic$Kind = iArr;
            try {
                iArr[Diagnostic.Kind.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.MANDATORY_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[Tree.Kind.values().length];
            $SwitchMap$com$sun$source$tree$Tree$Kind = iArr2;
            try {
                iArr2[Tree.Kind.COMPILATION_UNIT.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.ANNOTATION_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.INTERFACE.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.METHOD.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.VARIABLE.ordinal()] = 7;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.BLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    @Override
    public TypeMirror getLub(CatchTree tree) {
        JCTree.JCCatch ct = (JCTree.JCCatch) tree;
        JCTree.JCVariableDecl v = ct.param;
        if (v.type != null && v.type.getKind() == TypeKind.UNION) {
            Type.UnionClassType ut = (Type.UnionClassType) v.type;
            return ut.getLub();
        }
        return v.type;
    }
}
