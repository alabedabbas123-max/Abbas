package abcd;

class Vw implements org.apache.http.HttpResponseInterceptor {
    final abcd.Ww j6;

    Vw(abcd.Ww r1) {
        this.j6 = r1;
    }

    @Override
    public void process(org.apache.http.HttpResponse r5, org.apache.http.protocol.HttpContext r6) {
        org.apache.http.HttpEntity r7 = r5.getEntity();
        if (r7 == null) goto L13;
        org.apache.http.Header r8 = r7.getContentEncoding();
        if (r8 == null) goto L16;
        org.apache.http.HeaderElement[] r9 = r8.getElements();
        int r0 = r9.length;
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L17;
        if (r9[r1].getName().equalsIgnoreCase("gzip") == true) goto L10;
        r1 = r1 + 1;
        goto L7
    L10:
        r5.setEntity(new abcd.Ww.d(r5.getEntity()));
        return;
    L17:
        return;
    L16:
        return;
    }
}
