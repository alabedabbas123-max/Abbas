package com.sun.tools.javac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

class Server implements Runnable {

    static StandardJavaFileManager f315fm;
    private static Logger logger;
    private static final JavaCompiler tool;

    private final BufferedReader f316in;
    private final boolean isSocket;

    private final OutputStream f317out;

    static {
        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        tool = systemJavaCompiler;
        f315fm = systemJavaCompiler.getStandardFileManager(null, null, null);
        Logger logger2 = Logger.getLogger("com.sun.tools.javac");
        logger = logger2;
        logger2.setLevel(Level.SEVERE);
    }

    private Server(BufferedReader in, OutputStream out, boolean isSocket) {
        this.f316in = in;
        this.f317out = out;
        this.isSocket = isSocket;
    }

    private Server(BufferedReader in, OutputStream out) {
        this(in, out, false);
    }

    private Server(Socket socket) throws IOException {
        this(new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8")), socket.getOutputStream(), true);
    }

    public static void main(String... args) throws FileNotFoundException {
        if (args.length == 2) {
            throw new UnsupportedOperationException("TODO");
        }
        ExecutorService pool = Executors.newCachedThreadPool();
        try {
            while (true) {
                pool.execute(new Server(new ServerSocket(51966, -1, null).accept()));
            }
        } catch (IOException e) {
            System.err.format("Error: %s%n", e.getLocalizedMessage());
            pool.shutdown();
        }
    }

    @Override
    public void run() throws IOException {
        String line;
        List<String> args = new ArrayList<>();
        int res = -1;
        try {
            try {
                line = this.f316in.readLine();
            } catch (Throwable th) {
                if (!this.isSocket) {
                    try {
                        this.f316in.close();
                    } catch (IOException e) {
                    }
                }
                try {
                    this.f317out.write(String.format("EXIT: %s%n", Integer.valueOf(res)).getBytes());
                } catch (IOException ex) {
                    logger.log(Level.SEVERE, args.toString(), (Throwable) ex);
                }
                try {
                    this.f317out.flush();
                    this.f317out.close();
                } catch (IOException ex2) {
                    logger.log(Level.SEVERE, args.toString(), (Throwable) ex2);
                }
                logger.info(String.format("EXIT: %s", Integer.valueOf(res)));
                throw th;
            }
        } catch (IOException e2) {
            System.err.println(e2.getLocalizedMessage());
            line = null;
        }
        String cwd = null;
        while (line != null) {
            if (line.startsWith("PWD:")) {
                cwd = line.substring(4);
            } else if (line.equals("END")) {
                break;
            } else if (!"-XDstdout".equals(line)) {
                args.add(line);
            }
            try {
                line = this.f316in.readLine();
            } catch (IOException e3) {
                System.err.println(e3.getLocalizedMessage());
                line = null;
            }
        }
        Iterable<File> path = cwd == null ? null : Arrays.asList(new File(cwd));
        long msec = System.currentTimeMillis();
        try {
            synchronized (tool) {
                for (StandardLocation location : StandardLocation.values()) {
                    f315fm.setLocation(location, path);
                }
                res = compile(this.f317out, f315fm, args);
            }
        } catch (Throwable ex3) {
            logger.log(Level.SEVERE, args.toString(), ex3);
            PrintWriter p = new PrintWriter(this.f317out, true);
            ex3.printStackTrace(p);
            p.flush();
        }
        if (res >= 3) {
            logger.severe(String.format("problem: %s", args));
        } else {
            logger.info(String.format("success: %s", args));
        }
        logger.info(String.format("Real time: %sms", Long.valueOf(-(msec - System.currentTimeMillis()))));
        if (!this.isSocket) {
            try {
                this.f316in.close();
            } catch (IOException e4) {
            }
        }
        try {
            this.f317out.write(String.format("EXIT: %s%n", Integer.valueOf(res)).getBytes());
        } catch (IOException ex4) {
            logger.log(Level.SEVERE, args.toString(), (Throwable) ex4);
        }
        try {
            this.f317out.flush();
            this.f317out.close();
        } catch (IOException ex5) {
            logger.log(Level.SEVERE, args.toString(), (Throwable) ex5);
        }
        logger.info(String.format("EXIT: %s", Integer.valueOf(res)));
    }

    private int compile(OutputStream out, StandardJavaFileManager fm, List<String> args) {
        return tool.mo447run(null, null, out, (String[]) args.toArray(new String[args.size()]));
    }

    static class CwdFileManager extends ForwardingJavaFileManager<JavaFileManager> {

        String f318cwd;

        CwdFileManager(JavaFileManager fileManager) {
            super(fileManager);
        }

        String getAbsoluteName(String name) {
            if (new File(name).isAbsolute()) {
                return name;
            }
            return new File(this.f318cwd, name).getPath();
        }
    }
}
