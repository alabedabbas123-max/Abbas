package abcd;

public class AK {
    public static int j6(java.net.HttpURLConnection r4) {
        java.lang.String r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return r4.getResponseCode();
                }
                case 4: {
                    e = $ex0;
                    r5 = r4.getURL().getHost();
                    if ("Connection timed out: connect".equals(e.getMessage()) == false) { $pc0 = 10; continue $sw0; }
                    throw new java.net.ConnectException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().connectionTimeOut, new java.lang.Object[]{r5}));
                }
                case 10: {
                    throw new java.net.ConnectException(java.lang.String.valueOf(e.getMessage()) + " " + r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.net.Proxy j6(java.net.ProxySelector r4, java.net.URL r5) {
        java.net.ConnectException r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return r4.select(r5.toURI()).get(0);
                }
                case 5: {
                    e = $ex1;
                    r1 = new java.net.ConnectException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotDetermineProxyFor, new java.lang.Object[]{r5}));
                    r1.initCause(e);
                    throw r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.StringBuilder r1, java.lang.String r2) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != null) { $pc2 = 4; continue $sw2; }
                    return;
                }
                case 4: {
                    if (r2.length() == 0) { $pc2 = 14; continue $sw2; }
                    try {
                        r1.append(java.net.URLEncoder.encode(r2, "UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc2 = 8; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 8: {
                    e = $ex2;
                    throw new java.lang.RuntimeException(org.eclipse.jgit.JGitText.j6().couldNotURLEncodeToUTF8, e);
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
