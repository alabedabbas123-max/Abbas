package abcd;

class DF {
    private static final java.util.Map<java.util.Locale, java.util.Map<java.lang.Class, abcd.GF>> j6 = null;

    static {
        j6 = new java.util.HashMap();
    }

    static synchronized <T extends abcd.GF> T j6(java.util.Locale r3, java.lang.Class<T> r4) {
        synchronized (abcd.DF.class) {
            java.util.Map r1 = null;
            T r2 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            r1 = j6.get(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.IllegalAccessException) { $pc0 = 14; continue $sw0; }
                            if ($t instanceof java.lang.InstantiationException) { $pc0 = 17; continue $sw0; }
                            $pc0 = 12; continue $sw0;
                        }
                        if (r1 != null) { $pc0 = 7; continue $sw0; }
                        try {
                            r1 = new java.util.HashMap();
                            j6.put(r3, (java.util.Map<java.lang.Class, abcd.GF>) r1);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.IllegalAccessException) { $pc0 = 14; continue $sw0; }
                            if ($t instanceof java.lang.InstantiationException) { $pc0 = 17; continue $sw0; }
                            $pc0 = 12; continue $sw0;
                        }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        try {
                            r2 = (T) r1.get(r4);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.IllegalAccessException) { $pc0 = 14; continue $sw0; }
                            if ($t instanceof java.lang.InstantiationException) { $pc0 = 17; continue $sw0; }
                            $pc0 = 12; continue $sw0;
                        }
                        if (r2 != null) { $pc0 = 10; continue $sw0; }
                        try {
                            r2 = r4.newInstance();
                            r2.j6(r3);
                            r1.put(r4, r2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.IllegalAccessException) { $pc0 = 14; continue $sw0; }
                            if ($t instanceof java.lang.InstantiationException) { $pc0 = 17; continue $sw0; }
                            $pc0 = 12; continue $sw0;
                        }
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        return r2;
                    }
                    case 12: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 14: {
                        e = $ex0;
                        try {
                            throw new java.lang.Error(e);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 12; continue $sw0;
                        }
                    }
                    case 17: {
                        e = $ex0;
                        try {
                            throw new java.lang.Error(e);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 12; continue $sw0;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
