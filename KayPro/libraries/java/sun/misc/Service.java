package sun.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public final class Service {
    private static final String prefix = "META-INF/services/";

    private Service() {
    }

    public static void fail(Class service, String msg, Throwable cause) throws ServiceConfigurationError {
        ServiceConfigurationError sce = new ServiceConfigurationError(service.getName() + ": " + msg);
        sce.initCause(cause);
        throw sce;
    }

    public static void fail(Class service, String msg) throws ServiceConfigurationError {
        throw new ServiceConfigurationError(service.getName() + ": " + msg);
    }

    private static void fail(Class service, URL u, int line, String msg) throws ServiceConfigurationError {
        fail(service, u + ":" + line + ": " + msg);
    }

    private static int parseLine(Class service, URL u, BufferedReader r, int lc, List names, Set returned) throws ServiceConfigurationError, IOException {
        String ln = r.readLine();
        if (ln == null) {
            return -1;
        }
        int ci = ln.indexOf(35);
        if (ci >= 0) {
            ln = ln.substring(0, ci);
        }
        String ln2 = ln.trim();
        int n = ln2.length();
        if (n != 0) {
            if (ln2.indexOf(32) >= 0 || ln2.indexOf(9) >= 0) {
                fail(service, u, lc, "Illegal configuration-file syntax");
            }
            int cp = ln2.codePointAt(0);
            if (!Character.isJavaIdentifierStart(cp)) {
                fail(service, u, lc, "Illegal provider-class name: " + ln2);
            }
            int i = Character.charCount(cp);
            while (i < n) {
                int cp2 = ln2.codePointAt(i);
                if (!Character.isJavaIdentifierPart(cp2) && cp2 != 46) {
                    fail(service, u, lc, "Illegal provider-class name: " + ln2);
                }
                i += Character.charCount(cp2);
            }
            if (!returned.contains(ln2)) {
                names.add(ln2);
                returned.add(ln2);
            }
        }
        return lc + 1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[Catch: IOException -> 0x0065, TRY_LEAVE, TryCatch #1 {IOException -> 0x0065, blocks: (B:25:0x0061, B:29:0x0069), top: B:47:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[Catch: IOException -> 0x007f, TRY_LEAVE, TryCatch #5 {IOException -> 0x007f, blocks: (B:36:0x007b, B:40:0x0083), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r3 = new java.lang.StringBuilder();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Iterator parse(Class service, URL u, Set returned) throws Throwable {
        BufferedReader r;
        Throwable th;
        IOException x;
        int line;
        InputStream in = null;
        ArrayList names = new ArrayList();
        try {
            in = u.openStream();
            r = new BufferedReader(new InputStreamReader(in, "utf-8"));
            int lc = 1;
            do {
                try {
                    try {
                        line = parseLine(service, u, r, lc, names, returned);
                        lc = line;
                    } catch (IOException e) {
                        x = e;
                        fail(service, ": " + x);
                        if (r != null) {
                            try {
                                r.close();
                                if (in != null) {
                                    in.close();
                                }
                            } catch (IOException e2) {
                                y = e2;
                                StringBuilder sb = new StringBuilder();
                                sb.append(": ");
                                sb.append(y);
                                fail(service, sb.toString());
                            }
                        } else if (in != null) {
                            in.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r != null) {
                        try {
                            r.close();
                            if (in != null) {
                                in.close();
                            }
                        } catch (IOException y) {
                            fail(service, ": " + y);
                            throw th;
                        }
                    } else if (in != null) {
                        in.close();
                    }
                    throw th;
                }
            } while (line >= 0);
            r.close();
            if (in != null) {
                in.close();
            }
        } catch (IOException e3) {
            r = null;
            x = e3;
        } catch (Throwable th3) {
            r = null;
            th = th3;
            if (r != null) {
                r.close();
                if (in != null) {
                    in.close();
                }
            } else if (in != null) {
                in.close();
            }
            throw th;
        }
        return names.iterator();
    }

    private static class LazyIterator implements Iterator {
        Enumeration configs;
        ClassLoader loader;
        String nextName;
        Iterator pending;
        Set returned;
        Class service;

        private LazyIterator(Class service, ClassLoader loader) {
            this.configs = null;
            this.pending = null;
            this.returned = new TreeSet();
            this.nextName = null;
            this.service = service;
            this.loader = loader;
        }

        @Override
        public boolean hasNext() throws ServiceConfigurationError {
            if (this.nextName != null) {
                return true;
            }
            if (this.configs == null) {
                try {
                    String fullName = Service.prefix + this.service.getName();
                    if (this.loader == null) {
                        this.configs = ClassLoader.getSystemResources(fullName);
                    } else {
                        this.configs = this.loader.getResources(fullName);
                    }
                } catch (IOException x) {
                    Service.fail(this.service, ": " + x);
                }
            }
            while (true) {
                Iterator it = this.pending;
                if (it == null || !it.hasNext()) {
                    if (this.configs.hasMoreElements()) {
                        this.pending = Service.parse(this.service, (URL) this.configs.nextElement(), this.returned);
                    } else {
                        return false;
                    }
                } else {
                    this.nextName = (String) this.pending.next();
                    return true;
                }
            }
        }

        @Override
        public Object next() throws ServiceConfigurationError {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String cn = this.nextName;
            this.nextName = null;
            try {
                return Class.forName(cn, true, this.loader).newInstance();
            } catch (ClassNotFoundException e) {
                Service.fail(this.service, "Provider " + cn + " not found");
                return null;
            } catch (Exception x) {
                Service.fail(this.service, "Provider " + cn + " could not be instantiated: " + x, x);
                return null;
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static Iterator providers(Class service, ClassLoader loader) throws ServiceConfigurationError {
        return new LazyIterator(service, loader);
    }

    public static Iterator providers(Class service) throws ServiceConfigurationError {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        return providers(service, cl);
    }

    public static Iterator installedProviders(Class service) throws ServiceConfigurationError {
        ClassLoader prev = null;
        for (ClassLoader cl = ClassLoader.getSystemClassLoader(); cl != null; cl = cl.getParent()) {
            prev = cl;
        }
        return providers(service, prev);
    }
}
