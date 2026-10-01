package com.google.googlejavaformat.java.filer;

import com.google.common.base.Preconditions;
import com.google.googlejavaformat.java.Formatter;
import java.io.IOException;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public final class FormattingFiler implements Filer {
    private final Filer delegate;
    private final Formatter formatter;
    private final Messager messager;

    public FormattingFiler(Filer delegate) {
        this(delegate, null);
    }

    public FormattingFiler(Filer delegate, Messager messager) {
        this.formatter = new Formatter();
        this.delegate = (Filer) Preconditions.checkNotNull(delegate);
        this.messager = messager;
    }

    @Override
    public JavaFileObject createSourceFile(CharSequence name, Element... originatingElements) throws IOException {
        return new FormattingJavaFileObject(this.delegate.createSourceFile(name, originatingElements), this.formatter, this.messager);
    }

    @Override
    public JavaFileObject createClassFile(CharSequence name, Element... originatingElements) throws IOException {
        return this.delegate.createClassFile(name, originatingElements);
    }

    @Override
    public FileObject createResource(JavaFileManager.Location location, CharSequence pkg, CharSequence relativeName, Element... originatingElements) throws IOException {
        return this.delegate.createResource(location, pkg, relativeName, originatingElements);
    }

    @Override
    public FileObject getResource(JavaFileManager.Location location, CharSequence pkg, CharSequence relativeName) throws IOException {
        return this.delegate.getResource(location, pkg, relativeName);
    }
}
