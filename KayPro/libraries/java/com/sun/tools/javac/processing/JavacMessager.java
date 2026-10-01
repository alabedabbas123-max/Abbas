package com.sun.tools.javac.processing;

import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Pair;
import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

public class JavacMessager implements Messager {

    Log f506log;
    JavacProcessingEnvironment processingEnv;
    int errorCount = 0;
    int warningCount = 0;

    JavacMessager(Context context, JavacProcessingEnvironment processingEnv) {
        this.f506log = Log.instance(context);
        this.processingEnv = processingEnv;
    }

    @Override
    public void printMessage(Diagnostic.Kind kind, CharSequence msg) {
        printMessage(kind, msg, null, null, null);
    }

    @Override
    public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e) {
        printMessage(kind, msg, e, null, null);
    }

    @Override
    public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {
        printMessage(kind, msg, e, a, null);
    }

    @Override
    public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
        JCDiagnostic.DiagnosticPosition pos;
        JavaFileObject newSource;
        JavaFileObject newSource2;
        JavacElements elemUtils = this.processingEnv.getElementUtils();
        Pair<JCTree, JCTree.JCCompilationUnit> treeTop = elemUtils.getTreeAndTopLevel(e, a, v);
        if (treeTop == null || (newSource2 = treeTop.f578snd.sourcefile) == null) {
            pos = null;
            newSource = null;
        } else {
            JavaFileObject oldSource = this.f506log.useSource(newSource2);
            JCDiagnostic.DiagnosticPosition pos2 = treeTop.f577fst.m489pos();
            pos = pos2;
            newSource = oldSource;
        }
        try {
            int i = C07121.$SwitchMap$javax$tools$Diagnostic$Kind[kind.ordinal()];
            if (i == 1) {
                this.errorCount++;
                boolean prev = this.f506log.multipleErrors;
                this.f506log.multipleErrors = true;
                try {
                    this.f506log.error(pos, "proc.messager", msg.toString());
                    this.f506log.multipleErrors = prev;
                } catch (Throwable th) {
                    this.f506log.multipleErrors = prev;
                    throw th;
                }
            } else if (i == 2) {
                this.warningCount++;
                this.f506log.warning(pos, "proc.messager", msg.toString());
            } else if (i == 3) {
                this.warningCount++;
                this.f506log.mandatoryWarning(pos, "proc.messager", msg.toString());
            } else {
                this.f506log.note(pos, "proc.messager", msg.toString());
            }
            if (newSource != null) {
                this.f506log.useSource(newSource);
            }
        } catch (Throwable th2) {
            if (newSource != null) {
                this.f506log.useSource(newSource);
            }
            throw th2;
        }
    }

    static class C07121 {
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
        }
    }

    public void printError(String msg) {
        printMessage(Diagnostic.Kind.ERROR, msg);
    }

    public void printWarning(String msg) {
        printMessage(Diagnostic.Kind.WARNING, msg);
    }

    public void printNotice(String msg) {
        printMessage(Diagnostic.Kind.NOTE, msg);
    }

    public boolean errorRaised() {
        return this.errorCount > 0;
    }

    public int errorCount() {
        return this.errorCount;
    }

    public int warningCount() {
        return this.warningCount;
    }

    public void newRound(Context context) {
        this.f506log = Log.instance(context);
        this.errorCount = 0;
    }

    public String toString() {
        return "javac Messager";
    }
}
