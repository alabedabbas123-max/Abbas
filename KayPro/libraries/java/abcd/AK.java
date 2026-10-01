package abcd;

public class AK {
    public static int j6(java.net.HttpURLConnection r4) {
        return r4.getResponseCode();
    L4:
        e = move-exception;
        java.lang.String r5 = r4.getURL().getHost();
        if ("Connection timed out: connect".equals(e.getMessage()) == false) goto L10;
        throw new java.net.ConnectException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().connectionTimeOut, new java.lang.Object[]{r5}));
    L10:
        throw new java.net.ConnectException(java.lang.String.valueOf(e.getMessage()) + " " + r5);
    }

    public static java.net.Proxy j6(java.net.ProxySelector r4, java.net.URL r5) {
        return r4.select(r5.toURI()).get(0);
    L5:
        e = move-exception;
        java.net.ConnectException r1 = new java.net.ConnectException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotDetermineProxyFor, new java.lang.Object[]{r5}));
        r1.initCause(e);
        throw r1;
    }

    public static void j6(java.lang.StringBuilder r1, java.lang.String r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.length() == 0) goto L14;
        r1.append(java.net.URLEncoder.encode(r2, "UTF-8"));     // Catch: java.io.UnsupportedEncodingException -> L8
        return;
    L8:
        e = move-exception;
        throw new java.lang.RuntimeException(org.eclipse.jgit.JGitText.j6().couldNotURLEncodeToUTF8, e);
    }
}
