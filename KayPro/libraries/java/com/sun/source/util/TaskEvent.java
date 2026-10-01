package com.sun.source.util;

import com.sun.source.tree.CompilationUnitTree;
import javax.lang.model.element.TypeElement;
import javax.tools.JavaFileObject;

public final class TaskEvent {
    private TypeElement clazz;
    private JavaFileObject file;
    private Kind kind;
    private CompilationUnitTree unit;

    public enum Kind {
        PARSE,
        ENTER,
        ANALYZE,
        GENERATE,
        ANNOTATION_PROCESSING,
        ANNOTATION_PROCESSING_ROUND
    }

    public TaskEvent(Kind kind) {
        this(kind, null, null, null);
    }

    public TaskEvent(Kind kind, JavaFileObject sourceFile) {
        this(kind, sourceFile, null, null);
    }

    public TaskEvent(Kind kind, CompilationUnitTree unit) {
        this(kind, unit.getSourceFile(), unit, null);
    }

    public TaskEvent(Kind kind, CompilationUnitTree unit, TypeElement clazz) {
        this(kind, unit.getSourceFile(), unit, clazz);
    }

    private TaskEvent(Kind kind, JavaFileObject file, CompilationUnitTree unit, TypeElement clazz) {
        this.kind = kind;
        this.file = file;
        this.unit = unit;
        this.clazz = clazz;
    }

    public Kind getKind() {
        return this.kind;
    }

    public JavaFileObject getSourceFile() {
        return this.file;
    }

    public CompilationUnitTree getCompilationUnit() {
        return this.unit;
    }

    public TypeElement getTypeElement() {
        return this.clazz;
    }

    public String toString() {
        return "TaskEvent[" + this.kind + "," + this.file + "," + this.clazz + "]";
    }
}
