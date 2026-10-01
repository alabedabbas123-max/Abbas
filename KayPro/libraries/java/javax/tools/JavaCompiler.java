package javax.tools;

import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.annotation.processing.Processor;

public interface JavaCompiler extends Tool, OptionChecker {

    public interface CompilationTask extends Callable<Boolean> {
        @Override
        Boolean call();

        void setLocale(Locale locale);

        void setProcessors(Iterable<? extends Processor> iterable);
    }

    StandardJavaFileManager getStandardFileManager(DiagnosticListener<? super JavaFileObject> diagnosticListener, Locale locale, Charset charset);

    CompilationTask getTask(Writer writer, JavaFileManager javaFileManager, DiagnosticListener<? super JavaFileObject> diagnosticListener, Iterable<String> iterable, Iterable<String> iterable2, Iterable<? extends JavaFileObject> iterable3);
}
