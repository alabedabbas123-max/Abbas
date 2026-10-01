package com.sun.tools.javac.processing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

class ServiceProxy {
    private static final String prefix = "META-INF/services/";

    ServiceProxy() {
    }

    static class ServiceConfigurationError extends Error {
        static final long serialVersionUID = 7732091036771098303L;

        ServiceConfigurationError(String msg) {
            super(msg);
        }
    }

    private static void fail(Class<?> service, String msg) throws ServiceConfigurationError {
        throw new ServiceConfigurationError(service.getName() + ": " + msg);
    }

    private static void fail(Class<?> service, URL u, int line, String msg) throws ServiceConfigurationError {
        fail(service, u + ":" + line + ": " + msg);
    }

    private static boolean parse(Class<?> service, URL u) throws ServiceConfigurationError {
        StringBuilder sb;
        String ln;
        int n;
        InputStream in = null;
        BufferedReader r = null;
        try {
            try {
                in = u.openStream();
                r = new BufferedReader(new InputStreamReader(in, "utf-8"));
                do {
                    String line = r.readLine();
                    String ln2 = line;
                    if (line == null) {
                        try {
                            r.close();
                        } catch (IOException y) {
                            fail(service, ": " + y);
                        }
                        if (in != null) {
                            try {
                                in.close();
                            } catch (IOException e) {
                                y = e;
                                sb = new StringBuilder();
                                sb.append(": ");
                                sb.append(y);
                                fail(service, sb.toString());
                            }
                        }
                        return false;
                    }
                    int ci = ln2.indexOf(35);
                    if (ci >= 0) {
                        ln2 = ln2.substring(0, ci);
                    }
                    ln = ln2.trim();
                    n = ln.length();
                } while (n == 0);
                if (ln.indexOf(32) >= 0 || ln.indexOf(9) >= 0) {
                    fail(service, u, 1, "Illegal configuration-file syntax");
                }
                int cp = ln.codePointAt(0);
                if (!Character.isJavaIdentifierStart(cp)) {
                    fail(service, u, 1, "Illegal provider-class name: " + ln);
                }
                int i = Character.charCount(cp);
                while (i < n) {
                    int cp2 = ln.codePointAt(i);
                    if (!Character.isJavaIdentifierPart(cp2) && cp2 != 46) {
                        fail(service, u, 1, "Illegal provider-class name: " + ln);
                    }
                    i += Character.charCount(cp2);
                }
                try {
                    r.close();
                } catch (IOException y2) {
                    fail(service, ": " + y2);
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException y3) {
                        fail(service, ": " + y3);
                    }
                }
                return true;
            } catch (FileNotFoundException e2) {
                if (r != null) {
                    try {
                        r.close();
                    } catch (IOException y4) {
                        fail(service, ": " + y4);
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException y5) {
                        fail(service, ": " + y5);
                    }
                }
                return false;
            } catch (IOException x) {
                fail(service, ": " + x);
                if (r != null) {
                    try {
                        r.close();
                    } catch (IOException y6) {
                        fail(service, ": " + y6);
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e3) {
                        y = e3;
                        sb = new StringBuilder();
                        sb.append(": ");
                        sb.append(y);
                        fail(service, sb.toString());
                    }
                }
            }
        } catch (Throwable th) {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException y7) {
                    fail(service, ": " + y7);
                }
            }
            if (in == null) {
                throw th;
            }
            try {
                in.close();
                throw th;
            } catch (IOException y8) {
                fail(service, ": " + y8);
                throw th;
            }
        }
    }

    public static boolean hasService(Class<?> service, URL[] urls) throws ServiceConfigurationError {
        for (URL url : urls) {
            try {
                String fullName = prefix + service.getName();
                URL u = new URL(url, fullName);
                boolean found = parse(service, u);
                if (found) {
                    return true;
                }
            } catch (MalformedURLException e) {
            }
        }
        return false;
    }
}
