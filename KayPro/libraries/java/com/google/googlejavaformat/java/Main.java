package com.google.googlejavaformat.java;

import com.google.common.collect.UnmodifiableIterator;
import com.google.common.io.ByteStreams;
import com.google.googlejavaformat.FormatterDiagnostic;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Main {
    private static final int MAX_THREADS = 20;
    private static final String STDIN_FILENAME = "<stdin>";
    static final String[] VERSION = {"google-java-format: Version 1.0"};
    private final PrintWriter errWriter;
    private final InputStream inStream;
    private final PrintWriter outWriter;

    public Main(PrintWriter outWriter, PrintWriter errWriter, InputStream inStream) {
        this.outWriter = outWriter;
        this.errWriter = errWriter;
        this.inStream = inStream;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        PrintWriter err = new PrintWriter(new OutputStreamWriter(System.err, StandardCharsets.UTF_8));
        try {
            Main formatter = new Main(out, err, System.in);
            formatter.format(args);
        } catch (UsageException e) {
            err.print(e.getMessage());
        } finally {
            err.flush();
            out.flush();
        }
    }

    public static CommandLineOptions processArgs(String... args) throws UsageException {
        try {
            CommandLineOptions parameters = CommandLineOptionsParser.parse(Arrays.asList(args));
            int filesToFormat = parameters.files().size();
            if (parameters.stdin()) {
                filesToFormat++;
            }
            if (parameters.inPlace() && parameters.files().isEmpty()) {
                throw new UsageException("in-place formatting was requested but no files were provided");
            }
            if (parameters.isSelection() && filesToFormat != 1) {
                throw new UsageException("partial formatting is only support for a single file");
            }
            if (parameters.offsets().size() != parameters.lengths().size()) {
                throw new UsageException(String.format("-offsets and -lengths flags must be provided in matching pairs", new Object[0]));
            }
            if (filesToFormat <= 0 && !parameters.version() && !parameters.help()) {
                throw new UsageException("no files were provided");
            }
            return parameters;
        } catch (IllegalArgumentException e) {
            throw new UsageException(e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
            throw new UsageException(t.getMessage());
        }
    }

    public int format(String... args) throws UsageException {
        CommandLineOptions parameters = processArgs(args);
        if (parameters.version()) {
            for (String line : VERSION) {
                this.errWriter.println(line);
            }
            return 0;
        }
        if (parameters.help()) {
            throw new UsageException();
        }
        JavaFormatterOptions options = JavaFormatterOptions.builder().style(parameters.aosp() ? JavaFormatterOptions.Style.AOSP : JavaFormatterOptions.Style.GOOGLE).build();
        if (parameters.stdin()) {
            return formatStdin(parameters, options);
        }
        return formatFiles(parameters, options);
    }

    private int formatFiles(CommandLineOptions parameters, JavaFormatterOptions options) {
        int i;
        int numThreads = Math.min(20, parameters.files().size());
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        Map<Path, String> inputs = new LinkedHashMap<>();
        Map<Path, Future<String>> results = new LinkedHashMap<>();
        UnmodifiableIterator<String> it = parameters.files().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String fileName = it.next();
            if (!fileName.endsWith(".java")) {
                this.errWriter.println("Skipping non-Java file: " + fileName);
            } else {
                Path path = Paths.get(fileName, new String[0]);
                try {
                    String input = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
                    inputs.put(path, input);
                    results.put(path, executorService.submit(new FormatFileCallable(parameters, input, options)));
                } catch (IOException e) {
                    this.errWriter.println(fileName + ": could not read file: " + e.getMessage());
                    return 1;
                }
            }
        }
        Iterator<Map.Entry<Path, Future<String>>> it2 = results.entrySet().iterator();
        int i2 = 1;
        while (allOk) {
            Map.Entry<Path, Future<String>> result = it2.next();
            try {
                String formatted = result.getValue().get();
                if (parameters.inPlace()) {
                    if (!formatted.equals(inputs.get(result.getKey()))) {
                        try {
                            Files.write(result.getKey(), formatted.getBytes(StandardCharsets.UTF_8), new OpenOption[i]);
                        } catch (IOException e2) {
                            this.errWriter.println(result.getKey() + ": could not write file: " + e2.getMessage());
                            i2 = 0;
                        }
                    }
                } else {
                    this.outWriter.write(formatted);
                }
            } catch (InterruptedException e3) {
                this.errWriter.println(e3.getMessage());
                i2 = 0;
                i = 0;
            } catch (ExecutionException e4) {
                if (e4.getCause() instanceof FormatterException) {
                    for (FormatterDiagnostic diagnostic : ((FormatterException) e4.getCause()).diagnostics()) {
                        this.errWriter.println(result.getKey() + ":" + diagnostic.toString());
                    }
                } else {
                    this.errWriter.println(result.getKey() + ": error: " + e4.getCause().getMessage());
                    e4.getCause().printStackTrace(this.errWriter);
                }
                i2 = 0;
                i = 0;
            }
        }
        return i2 ^ 1;
    }

    private int formatStdin(CommandLineOptions parameters, JavaFormatterOptions options) {
        try {
            String input = new String(ByteStreams.toByteArray(this.inStream), StandardCharsets.UTF_8);
            try {
                String output = new FormatFileCallable(parameters, input, options).call();
                this.outWriter.write(output);
                return 0;
            } catch (FormatterException e) {
                for (FormatterDiagnostic diagnostic : e.diagnostics()) {
                    this.errWriter.println("<stdin>:" + diagnostic.toString());
                }
                return 1;
            }
        } catch (IOException e2) {
            throw new IOError(e2);
        }
    }
}
