package com.almlkaide.kaypro.android.dex.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.io.IOUtils;

public class ExceptionWithContext extends RuntimeException {
    private StringBuffer context;

    public static ExceptionWithContext withContext(Throwable th, String str) {
        ExceptionWithContext exceptionWithContext;
        if (th instanceof ExceptionWithContext) {
            exceptionWithContext = (ExceptionWithContext) th;
        } else {
            exceptionWithContext = new ExceptionWithContext(th);
        }
        exceptionWithContext.addContext(str);
        return exceptionWithContext;
    }

    public ExceptionWithContext(String str) {
        this(str, (Throwable) null);
    }

    public ExceptionWithContext(Throwable th) {
        this((String) null, th);
    }

    public ExceptionWithContext(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : (String) null : str, th);
        if (th instanceof ExceptionWithContext) {
            String string = ((ExceptionWithContext) th).context.toString();
            this.context = new StringBuffer(string.length() + 200);
            this.context.append(string);
            return;
        }
        this.context = new StringBuffer(200);
    }

    @Override
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.context);
    }

    @Override
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.context);
    }

    public void addContext(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.context.append(str);
        if (str.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
            return;
        }
        this.context.append('\n');
    }

    public String getContext() {
        return this.context.toString();
    }

    public void printContext(PrintStream printStream) {
        printStream.println(getMessage());
        printStream.print(this.context);
    }

    public void printContext(PrintWriter printWriter) {
        printWriter.println(getMessage());
        printWriter.print(this.context);
    }
}
