package com.google.googlejavaformat.java.filer;

import com.google.common.base.Preconditions;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import java.io.IOException;
import java.io.Writer;
import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;
import javax.tools.ForwardingJavaFileObject;
import javax.tools.JavaFileObject;

final class FormattingJavaFileObject extends ForwardingJavaFileObject<JavaFileObject> {
    private static final int DEFAULT_FILE_SIZE = 40000;
    private final Formatter formatter;
    private final Messager messager;

    FormattingJavaFileObject(JavaFileObject delegate, Formatter formatter, Messager messager) {
        super((JavaFileObject) Preconditions.checkNotNull(delegate));
        this.formatter = (Formatter) Preconditions.checkNotNull(formatter);
        this.messager = messager;
    }

    @Override
    public Writer openWriter() throws IOException {
        final StringBuilder stringBuilder = new StringBuilder(DEFAULT_FILE_SIZE);
        return new Writer() {
            @Override
            public void write(char[] chars, int start, int end) throws IOException {
                stringBuilder.append(chars, start, end - start);
            }

            @Override
            public void flush() throws IOException {
            }

            @Override
            public void close() throws Throwable {
                try {
                    FormattingJavaFileObject.this.formatter.formatSource(CharSource.wrap(stringBuilder), new CharSink() {
                        @Override
                        public Writer openStream() throws IOException {
                            return ((JavaFileObject) FormattingJavaFileObject.this.fileObject).openWriter();
                        }
                    });
                } catch (FormatterException e) {
                    Writer writer = ((JavaFileObject) FormattingJavaFileObject.this.fileObject).openWriter();
                    try {
                        writer.append((CharSequence) stringBuilder.toString());
                        if (writer != null) {
                            writer.close();
                        }
                        if (FormattingJavaFileObject.this.messager != null) {
                            FormattingJavaFileObject.this.messager.printMessage(Diagnostic.Kind.NOTE, "Error formatting " + FormattingJavaFileObject.this.getName());
                        }
                    } catch (Throwable th) {
                        if (writer != null) {
                            try {
                                writer.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
        };
    }
}
