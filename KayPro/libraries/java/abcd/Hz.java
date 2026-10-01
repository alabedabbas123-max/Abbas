package abcd;

public class Hz {
    private static abcd.Hz.b DW;
    private static final java.lang.String[] j6 = null;
    private java.lang.String EQ;
    private java.net.HttpURLConnection FH;
    public final java.net.URL Hw;
    private boolean VH;
    private abcd.Hz.e Zo;
    private boolean gn;
    private int tp;
    private boolean u7;
    private final java.lang.String v5;
    private int we;

    protected static abstract class a<V> extends Hz.d<V> {
        private final boolean DW;
        private final java.io.Closeable j6;

        protected a(java.io.Closeable r1, boolean r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        protected void j6() {
            java.io.Closeable r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.j6;
                        if ((r0 instanceof java.io.Flushable) == false) { $pc0 = 6; continue $sw0; }
                        ((java.io.Flushable) r0).flush();
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        if (this.DW == true) { $pc0 = 12; continue $sw0; }
                        this.j6.close();
                        return;
                    }
                    case 12: {
                        try {
                            this.j6.close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 11; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 11: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public interface b {
        public static final abcd.Hz.b j6 = new abcd.Iz();



        java.net.HttpURLConnection j6(java.net.URL r1);

        java.net.HttpURLConnection j6(java.net.URL r1, java.net.Proxy r2);
    }

    public static class c extends java.lang.RuntimeException {
        protected c(java.io.IOException r1) {
            super(r1);
        }

        @Override
        public java.io.IOException getCause() {
            return (java.io.IOException) super.getCause();
        }

        @Override
        public java.lang.Throwable getCause() {
            return getCause();
        }
    }

    protected static abstract class d<V> implements java.util.concurrent.Callable<V> {
        protected d() {
        }

        protected abstract V DW();

        @Override
        public V call() {
            boolean r0 = false;
            V r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = true;
                        try {
                            r1 = DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 11; continue $sw1; }
                            if ($t instanceof abcd.Hz.c) { $pc1 = 14; continue $sw1; }
                            $pc1 = 9; continue $sw1;
                        }
                        try {
                            j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 6; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return r1;
                    }
                    case 6: {
                        e = $ex1;
                        throw new abcd.Hz.c(e);
                    }
                    case 16: {
                        th = th;
                        $pc1 = 26; continue $sw1;
                    }
                    case 26: {
                        try {
                            j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 19; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 23; continue $sw1;
                    }
                    case 23: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 19: {
                        e = $ex1;
                        if (r0 == true) { $pc1 = 23; continue $sw1; }
                        throw new abcd.Hz.c(e);
                    }
                    case 14: {
                        e = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                    }
                    case 11: {
                        e = $ex1;
                        try {
                            throw new abcd.Hz.c(e);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 16; continue $sw1;
                        }
                    }
                    case 9: {
                        th = $ex1;
                        th = th;
                        r0 = false;
                        { $pc1 = 26; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        protected abstract void j6();
    }

    public static class e extends java.io.BufferedOutputStream {
        private final java.nio.charset.CharsetEncoder j6;

        public e(java.io.OutputStream r1, java.lang.String r2, int r3) {
            super(r1, r3);
            this.j6 = java.nio.charset.Charset.forName(abcd.Hz.j6(r2)).newEncoder();
        }

        public abcd.Hz.e j6(java.lang.String r3) {
            java.nio.ByteBuffer r4 = this.j6.encode(java.nio.CharBuffer.wrap(r3));
            super.write(r4.array(), 0, r4.limit());
            return this;
        }
    }

    static {
        j6 = new java.lang.String[0];
        DW = abcd.Hz.b.j6;
    }

    public Hz(java.lang.CharSequence r2, java.lang.String r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.FH = null;
                    this.gn = true;
                    this.u7 = false;
                    this.tp = 8192;
                    try {
                        this.Hw = new java.net.URL(r2.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc2 = 6; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.v5 = r3;
                    return;
                }
                case 6: {
                    e = $ex2;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Hz DW(java.lang.CharSequence r0, java.util.Map<?, ?> r1, boolean r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = j6(r0, r1);
                    if (r2 == false) { $pc3 = 6; continue $sw3; }
                    r3 = DW(r3);
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return Hw(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(java.lang.CharSequence r7) {
        java.net.URL r0 = null;
        java.lang.String r8 = null;
        int r1 = 0;
        java.lang.String r9 = null;
        int r2 = 0;
        int r3 = 0;
        java.io.IOException r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        r0 = new java.net.URL(r7.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 16; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r8 = r0.getHost();
                    r1 = r0.getPort();
                    if (r1 == (-1)) { $pc4 = 19; continue $sw4; }
                    r8 = r8 + ':' + java.lang.Integer.toString(r1);
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    try {
                        r9 = new java.net.URI(r0.getProtocol(), r8, r0.getPath(), r0.getQuery(), r0.getRef()).toASCIIString();
                        r2 = r9.indexOf(63);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc4 = 13; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 <= 0) { $pc4 = 23; continue $sw4; }
                    try {
                        r3 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc4 = 13; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 >= r9.length()) { $pc4 = 24; continue $sw4; }
                    return r9.substring(0, r3) + r9.substring(r3).replace("+", "%2B").replace("#", "%23");
                }
                case 24: {
                    return r9;
                }
                case 23: {
                    return r9;
                }
                case 13: {
                    e = $ex4;
                    r4 = new java.io.IOException("Parsing URI failed");
                    r4.initCause(e);
                    throw new abcd.Hz.c(r4);
                }
                case 16: {
                    e = $ex4;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.StringBuilder DW(java.lang.String r2, java.lang.StringBuilder r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r2.indexOf(58) + 2) != r2.lastIndexOf(47)) { $pc5 = 5; continue $sw5; }
                    r3.append('/');
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Hz FH(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "GET");
    }

    public static abcd.Hz Hw(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "POST");
    }

    private java.net.HttpURLConnection QX() {
        java.net.HttpURLConnection r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    e = $ex6;
                    throw new abcd.Hz.c(e);
                }
                case 3: {
                    if (this.EQ == null) { $pc6 = 5; continue $sw6; }
                    try {
                        r0 = DW.j6(this.Hw, XL());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 8; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r0.setRequestMethod(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 8; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 5: {
                    try {
                        r0 = DW.j6(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 8; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.net.Proxy XL() {
        return new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(this.EQ, this.we));
    }

    private static java.lang.String Zo(java.lang.String r1) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r1 != null) { $pc7 = 4; continue $sw7; }
                    return "UTF-8";
                }
                case 4: {
                    if (r1.length() <= 0) { $pc7 = 8; continue $sw7; }
                    return r1;
                }
                case 8: {
                    return "UTF-8";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(abcd.Hz r0) {
        return r0.tp;
    }

    public static abcd.Hz j6(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "DELETE");
    }

    public static abcd.Hz j6(java.lang.CharSequence r0, java.util.Map<?, ?> r1, boolean r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r3 = j6(r0, r1);
                    if (r2 == false) { $pc8 = 6; continue $sw8; }
                    r3 = DW(r3);
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return FH(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.CharSequence r3, java.util.Map<?, ?> r4) {
        java.lang.String r5 = null;
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.util.Map.Entry<?, ?>> r6 = null;
        java.util.Map.Entry<?, ?> r7 = null;
        java.lang.Object r8 = null;
        java.util.Map.Entry<?, ?> r9 = null;
        java.lang.Object r10 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r5 = r3.toString();
                    if (r4 != null) { $pc9 = 5; continue $sw9; }
                    return r5;
                }
                case 5: {
                    if (r4.isEmpty() == true) { $pc9 = 24; continue $sw9; }
                    r0 = new java.lang.StringBuilder(r5);
                    DW(r5, r0);
                    j6(r5, r0);
                    r6 = r4.entrySet().iterator();
                    r7 = r6.next();
                    r0.append(r7.getKey().toString());
                    r0.append('=');
                    r8 = r7.getValue();
                    if (r8 == null) { $pc9 = 11; continue $sw9; }
                    r0.append(r8);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    if (r6.hasNext() == false) { $pc9 = 16; continue $sw9; }
                    r0.append('&');
                    r9 = r6.next();
                    r0.append(r9.getKey().toString());
                    r0.append('=');
                    r10 = r9.getValue();
                    if (r10 == null) { $pc9 = 11; continue $sw9; }
                    r0.append(r10);
                    { $pc9 = 11; continue $sw9; }
                }
                case 16: {
                    return r0.toString();
                }
                case 24: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(java.lang.String r0) {
        return Zo(r0);
    }

    private static java.lang.StringBuilder j6(java.lang.String r4, java.lang.StringBuilder r5) {
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r1 = r4.indexOf(63);
                    r2 = r5.length() - 1;
                    if (r1 != (-1)) { $pc10 = 5; continue $sw10; }
                    r5.append('?');
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    return r5;
                }
                case 5: {
                    if (r1 >= r2) { $pc10 = 9; continue $sw10; }
                    if (r4.charAt(r2) == '&') { $pc10 = 9; continue $sw10; }
                    r5.append('&');
                    { $pc10 = 9; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Hz v5(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "PUT");
    }

    protected abcd.Hz DW(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("form-data; name=\"");
                    r0.append(r3);
                    if (r4 == null) { $pc11 = 5; continue $sw11; }
                    r0.append("\"; filename=\"");
                    r0.append(r4);
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    r0.append('\"');
                    Zo("Content-Disposition", r0.toString());
                    if (r5 == null) { $pc11 = 8; continue $sw11; }
                    Zo("Content-Type", r5);
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    Zo("\r\n");
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.BufferedInputStream DW() {
        return new java.io.BufferedInputStream(J8(), this.tp);
    }

    public java.lang.String DW(java.lang.String r3) {
        java.io.ByteArrayOutputStream r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = FH();
                    try {
                        j6(DW(), r0);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 5; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.toString(Zo(r3));
                }
                case 5: {
                    e = $ex12;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected java.lang.String DW(java.lang.String r9, java.lang.String r10) {
        int r1 = 0;
        int r3 = 0;
        int r5 = 0;
        int r7 = 0;
        java.lang.String r4 = null;
        int r8 = 0;
        int r11 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r9 != null) { $pc13 = 5; continue $sw13; }
                    $pc13 = 34; continue $sw13;
                }
                case 34: {
                    return null;
                }
                case 5: {
                    if (r9.length() == 0) { $pc13 = 34; continue $sw13; }
                    r1 = r9.length();
                    r3 = r9.indexOf(59) + 1;
                    if (r3 == 0) { $pc13 = 34; continue $sw13; }
                    if (r3 == r1) { $pc13 = 34; continue $sw13; }
                    r5 = r9.indexOf(59, r3);
                    if (r5 != (-1)) { $pc13 = 14; continue $sw13; }
                    r5 = r1;
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    if (r3 >= r5) { $pc13 = 34; continue $sw13; }
                    r7 = r9.indexOf(61, r3);
                    if (r7 == (-1)) { $pc13 = 31; continue $sw13; }
                    if (r7 >= r5) { $pc13 = 31; continue $sw13; }
                    if (r10.equals(r9.substring(r3, r7).trim()) == false) { $pc13 = 31; continue $sw13; }
                    r4 = r9.substring(r7 + 1, r5).trim();
                    r8 = r4.length();
                    if (r8 == 0) { $pc13 = 31; continue $sw13; }
                    if (r8 > 2) { $pc13 = 25; continue $sw13; }
                    $pc13 = 30; continue $sw13;
                }
                case 30: {
                    return r4;
                }
                case 25: {
                    if ('\"' != r4.charAt(0)) { $pc13 = 30; continue $sw13; }
                    r11 = r8 - 1;
                    if ('\"' != r4.charAt(r11)) { $pc13 = 30; continue $sw13; }
                    return r4.substring(1, r11);
                }
                case 31: {
                    r3 = r5 + 1;
                    r5 = r9.indexOf(59, r3);
                    if (r5 != (-1)) { $pc13 = 14; continue $sw13; }
                    r5 = r1;
                    { $pc13 = 14; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String EQ() {
        return tp().getRequestMethod();
    }

    public abcd.Hz FH(java.lang.String r2) {
        j6(r2, null);
        return this;
    }

    public abcd.Hz FH(java.lang.String r2, java.lang.String r3) {
        tp().setRequestProperty(r2, r3);
        return this;
    }

    protected java.io.ByteArrayOutputStream FH() {
        int r0 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = u7();
                    if (r0 <= 0) { $pc14 = 7; continue $sw14; }
                    return new java.io.ByteArrayOutputStream(r0);
                }
                case 7: {
                    return new java.io.ByteArrayOutputStream();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Hw() {
        return Hw("Content-Type", "charset");
    }

    public java.lang.String Hw(java.lang.String r2) {
        Zo();
        return tp().getHeaderField(r2);
    }

    public java.lang.String Hw(java.lang.String r1, java.lang.String r2) {
        return DW(Hw(r1), r2);
    }

    protected abcd.Hz J0() {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (this.VH == true) { $pc15 = 5; continue $sw15; }
                    this.VH = true;
                    FH("multipart/form-data; boundary=00content0boundary00");
                    we();
                    this.Zo.j6("--00content0boundary00\r\n");
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return this;
                }
                case 5: {
                    this.Zo.j6("\r\n--00content0boundary00\r\n");
                    { $pc15 = 6; continue $sw15; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.InputStream J8() {
        java.io.InputStream r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (VH() < 400) { $pc16 = 29; continue $sw16; }
                    r0 = tp().getErrorStream();
                    if (r0 != null) { $pc16 = 17; continue $sw16; }
                    try {
                        r0 = tp().getInputStream();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.IOException) { $pc16 = 13; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc16 = 13; continue $sw16;
                }
                case 13: {
                    e = $ex16;
                    throw new abcd.Hz.c(e);
                }
                case 17: {
                    if (this.u7 == true) { $pc16 = 19; continue $sw16; }
                    $pc16 = 26; continue $sw16;
                }
                case 26: {
                    return r0;
                }
                case 19: {
                    if ("gzip".equals(gn()) == false) { $pc16 = 26; continue $sw16; }
                    return new java.util.zip.GZIPInputStream(r0);
                }
                case 23: {
                    e = $ex16;
                    throw new abcd.Hz.c(e);
                }
                case 29: {
                    try {
                        r0 = tp().getInputStream();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.IOException) { $pc16 = 6; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    e = $ex16;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int VH() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    try {
                        v5();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.io.IOException) { $pc17 = 4; continue $sw17; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return tp().getResponseCode();
                }
                case 4: {
                    e = $ex17;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.net.URL Ws() {
        return tp().getURL();
    }

    protected abcd.Hz Zo() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    try {
                        v5();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        if ($t instanceof java.io.IOException) { $pc18 = 4; continue $sw18; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this;
                }
                case 4: {
                    e = $ex18;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz Zo(java.lang.CharSequence r2) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    try {
                        we();
                        this.Zo.j6(r2.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.io.IOException) { $pc19 = 4; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this;
                }
                case 4: {
                    e = $ex19;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz Zo(java.lang.String r1, java.lang.String r2) {
        Zo(r1);
        Zo(": ");
        Zo(r2);
        Zo("\r\n");
        return this;
    }

    public java.lang.String gn() {
        return Hw("Content-Encoding");
    }

    public int j6(java.lang.String r2, int r3) {
        Zo();
        return tp().getHeaderFieldInt(r2, r3);
    }

    public abcd.Hz j6(int r2) {
        tp().setConnectTimeout(r2);
        return this;
    }

    protected abcd.Hz j6(java.io.InputStream r8, java.io.OutputStream r9) {
        return (abcd.Hz) new abcd.Gz(this, r8, this.gn, r8, r9).call();
    }

    public abcd.Hz j6(java.lang.String r2, java.lang.Number r3) {
        j6(r2, null, r3);
        return this;
    }

    public abcd.Hz j6(java.lang.String r3, java.lang.String r4) {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (r4 != null) { $pc20 = 5; continue $sw20; }
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    FH("Content-Type", r3);
                    return this;
                }
                case 5: {
                    if (r4.length() <= 0) { $pc20 = 8; continue $sw20; }
                    FH("Content-Type", r3 + "; charset=" + r4);
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz j6(java.lang.String r1, java.lang.String r2, java.lang.Number r3) {
        java.lang.String r4 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (r3 == null) { $pc21 = 4; continue $sw21; }
                    r4 = r3.toString();
                    $pc21 = 5; continue $sw21;
                }
                case 5: {
                    j6(r1, r2, r4);
                    return this;
                }
                case 4: {
                    r4 = null;
                    { $pc21 = 5; continue $sw21; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        j6(r2, r3, null, r4);
        return this;
    }

    public abcd.Hz j6(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        java.io.BufferedInputStream r0 = null;
        java.io.BufferedInputStream r1 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = null;
                    try {
                        r1 = new java.io.BufferedInputStream(new java.io.FileInputStream(r7));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.io.IOException) { $pc22 = 13; continue $sw22; }
                        $pc22 = 11; continue $sw22;
                    }
                    try {
                        j6(r4, r5, r6, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.io.IOException) { $pc22 = 9; continue $sw22; }
                        $pc22 = 7; continue $sw22;
                    }
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.io.IOException) { $pc22 = 19; continue $sw22; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    return this;
                }
                case 9: {
                    e = e;
                    r0 = r1;
                    $pc22 = 15; continue $sw22;
                }
                case 15: {
                    try {
                        throw new abcd.Hz.c(e);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 11; continue $sw22;
                    }
                }
                case 7: {
                    th = th;
                    r0 = r1;
                    $pc22 = 16; continue $sw22;
                }
                case 16: {
                    if (r0 != null) { $pc22 = 23; continue $sw22; }
                    $pc22 = 18; continue $sw22;
                }
                case 18: {
                    throw th;
                }
                case 23: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.io.IOException) { $pc22 = 20; continue $sw22; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc22 = 13; continue $sw22;
                }
                case 13: {
                    e = e;
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    th = th;
                    { $pc22 = 16; continue $sw22; }
                }
                case 19: {
                    $pc22 = 20; continue $sw22;
                }
                case 20: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.io.InputStream r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    try {
                        J0();
                        DW(r1, r2, r3);
                        j6(r4, this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof java.io.IOException) { $pc23 = 4; continue $sw23; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this;
                }
                case 4: {
                    e = $ex23;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    try {
                        J0();
                        DW(r1, r2, r3);
                        this.Zo.j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 4; continue $sw24; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this;
                }
                case 4: {
                    e = $ex24;
                    throw new abcd.Hz.c(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz j6(java.util.Map.Entry<java.lang.String, java.lang.String> r2) {
        FH(r2.getKey(), r2.getValue());
        return this;
    }

    public abcd.Hz j6(boolean r2) {
        tp().setUseCaches(r2);
        return this;
    }

    public java.lang.String j6() {
        return DW(Hw());
    }

    public java.lang.String toString() {
        return EQ() + ' ' + Ws();
    }

    public java.net.HttpURLConnection tp() {
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    if (this.FH != null) { $pc25 = 6; continue $sw25; }
                    this.FH = QX();
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7() {
        return v5("Content-Length");
    }

    public int v5(java.lang.String r2) {
        return j6(r2, -1);
    }

    protected abcd.Hz v5() {
        abcd.Hz.e r0 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r0 = this.Zo;
                    if (r0 != null) { $pc26 = 6; continue $sw26; }
                    return this;
                }
                case 6: {
                    if (this.VH == false) { $pc26 = 9; continue $sw26; }
                    r0.j6("\r\n--00content0boundary00--\r\n");
                    $pc26 = 9; continue $sw26;
                }
                case 9: {
                    if (this.gn == true) { $pc26 = 16; continue $sw26; }
                    this.Zo.close();
                    $pc26 = 13; continue $sw26;
                }
                case 13: {
                    this.Zo = null;
                    return this;
                }
                case 16: {
                    try {
                        this.Zo.close();
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        if ($t instanceof java.io.IOException) { $pc26 = 15; continue $sw26; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc26 = 13; continue $sw26; }
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Hz v5(java.lang.String r2, java.lang.String r3) {
        j6(r2, null, r3);
        return this;
    }

    protected abcd.Hz we() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    if (this.Zo == null) { $pc27 = 5; continue $sw27; }
                    return this;
                }
                case 5: {
                    tp().setDoOutput(true);
                    r0 = DW(tp().getRequestProperty("Content-Type"), "charset");
                    this.Zo = new abcd.Hz.e(tp().getOutputStream(), r0, this.tp);
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
