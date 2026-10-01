package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
public class v {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 1066417195150118661L)
    private static com.aide.ui.htmluidesigner.v j6;

    @abcd.Interfaceru(field = 4582627220396324736L)
    private java.lang.String Hw;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.v.class, -19640197679648051L, -19640197679648051L);
    }

    @abcd.Interfacesu(method = 2561545722550228503L)
    private v() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 2562548938193121181L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2562548938193121181L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        new java.lang.Thread(new com.aide.ui.htmluidesigner.u(this)).start();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2872672279052916555L)
    private java.lang.String DW(java.lang.String r6) {
    L37:
        th = move-exception;
        if (FH == false) goto L41;
        abcd.wu.j6(th, 2023734416497034560L, this, r6);
    L41:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2023734416497034560L, this, r6);     // Catch: java.lang.Throwable -> L37
    L6:
        java.lang.String r3 = r6.substring(r6.lastIndexOf(46) + 1, r6.length()).toLowerCase();     // Catch: java.lang.Throwable -> L37
        if (r3.equals("zip") == false) goto L10;
        java.lang.String r0 = "application/x-zip-compressed";
    L34:
        if (r0 != null) goto L44;
        return "*/*";
    L44:
        return r0;
    L10:
        if (r3.equals("png") == false) goto L13;
        r0 = "image/png";
        goto L34
    L13:
        if (r3.equals("gif") == false) goto L16;
        r0 = "image/gif";
        goto L34
    L16:
        if (r3.equals("jpg") == false) goto L18;
    L33:
        r0 = "image/jpeg";
        goto L34
    L18:
        if (r3.equals("jpeg") == true) goto L33;
        if (r3.equals("html") == false) goto L23;
    L32:
        r0 = "text/html";
        goto L34
    L23:
        if (r3.equals("html") == true) goto L32;
        if (r3.equals("css") == false) goto L29;
        r0 = "text/css";
        goto L34
    L29:
        if (r3.equals("js") == false) goto L31;
        r0 = "application/javascript";
        goto L34
    L31:
        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3);     // Catch: java.lang.Throwable -> L37
        goto L34
    }

    @abcd.Interfacesu(method = 5127662770553500965L)
    private java.lang.String FH(java.lang.String r7) {
    L13:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, -1904786558047675840L, this, r7);
    L17:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1904786558047675840L, this, r7);     // Catch: java.lang.Throwable -> L13
    L6:
        java.lang.String[] r2 = r7.split(" ");     // Catch: java.lang.Throwable -> L13
        java.lang.String r3 = "";
        if (r2.length < 2) goto L9;
        r3 = r2[1];     // Catch: java.lang.Throwable -> L13
    L9:
        if (r3.equals("/") == false) goto L20;
        return "/index.html";
    L20:
        return r3;
    }

    @abcd.Interfacesu(method = 1697638672396419225L)
    private java.io.FileInputStream Hw(java.lang.String r7) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -411981764818408512L, this, r7);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-411981764818408512L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.FileInputStream(new java.io.File(this.Hw + r7));
    }

    @abcd.Interfacesu(method = -1800482580594057900L)
    private java.lang.String j6(int r8, java.lang.String r9) {
    L30:
        th = move-exception;
        if (FH == false) goto L34;
        abcd.wu.j6(th, 77133291289936521L, this, new java.lang.Integer(r8), r9);
    L34:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(77133291289936521L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L30
    L6:
        java.lang.String r1 = "HTTP/1.0 ";
        if (r8 != 200) goto L9;
        r1 = "HTTP/1.0 200 OK";     // Catch: java.lang.Throwable -> L30
    L25:
        java.lang.String r2 = ((r1 + "\r\n") + "Connection: close\r\n") + "Server: AIDE\r\n";     // Catch: java.lang.Throwable -> L30
        if (r9 == null) goto L28;
        r2 = r2 + "Content-Type: " + DW(r9) + "\r\n";     // Catch: java.lang.Throwable -> L30
    L28:
        return r2 + "\r\n";
    L9:
        if (r8 != 400) goto L11;
        r1 = "HTTP/1.0 400 Bad Request";     // Catch: java.lang.Throwable -> L30
        goto L25
    L11:
        if (r8 != 403) goto L13;
        r1 = "HTTP/1.0 403 Forbidden";     // Catch: java.lang.Throwable -> L30
        goto L25
    L13:
        if (r8 != 404) goto L15;
        r1 = "HTTP/1.0 404 Not Found";     // Catch: java.lang.Throwable -> L30
        goto L25
    L15:
        if (r8 != 500) goto L17;
        r1 = "HTTP/1.0 500 Internal Server Error";     // Catch: java.lang.Throwable -> L30
        goto L25
    L17:
        if (r8 != 501) goto L25;
        r1 = "HTTP/1.0 501 Not Implemented";     // Catch: java.lang.Throwable -> L30
        goto L25
    }

    @abcd.Interfacesu(method = 877908410343769797L)
    private void j6() {
    L15:
        th = move-exception;
        if (FH == false) goto L20;
        abcd.wu.j6(th, 1900776044922573616L, this);
    L20:
        throw th;
    L4:
        if (DW == false) goto L22;
        abcd.wu.j6(1900776044922573616L, this);     // Catch: java.lang.Throwable -> L15
    L22:
        java.net.ServerSocket r2 = new java.net.ServerSocket(8099);     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L15
    L25:
        java.net.Socket r3 = r2.accept();     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> L15
        java.io.BufferedReader r4 = new java.io.BufferedReader(new java.io.InputStreamReader(r3.getInputStream()));     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> L15
        java.io.DataOutputStream r5 = new java.io.DataOutputStream(r3.getOutputStream());     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> L15
        j6(r4.readLine(), r5);     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> L15
    L9:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L15
    L12:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L15
    }

    static void j6(com.aide.ui.htmluidesigner.v r0) {
        r0.j6();
    }

    @abcd.Interfacesu(method = 2025503547542336448L)
    private void j6(java.io.DataOutputStream r8, int r9) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 1684752792646052243L, this, r8, new java.lang.Integer(r9));
    L15:
        throw th;
    L3:
        if (DW == false) goto L16;
        abcd.wu.j6(1684752792646052243L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L11
    L16:
        r8.writeBytes(j6(r9, null));     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L11
        r8.close();     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L11
    L20:
        return;
    L8:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = -269024536764346940L)
    private void j6(java.io.DataOutputStream r8, java.io.FileInputStream r9) {
    L11:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 5990458131926693265L, this, r8, r9);
    L16:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(5990458131926693265L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        byte[] r0 = new byte[2000];     // Catch: java.lang.Throwable -> L11
    L6:
        int r1 = r9.read(r0);     // Catch: java.lang.Throwable -> L11
        if (r1 == (-1)) goto L10;
        r8.write(r0, 0, r1);     // Catch: java.lang.Throwable -> L11
        goto L6
    }

    @abcd.Interfacesu(method = -5460622060013046288L)
    private void j6(java.io.Writer r10, java.io.BufferedReader r11, java.lang.String r12, java.util.Set<java.lang.String> r13) {
    L22:
        th = move-exception;
        if (FH == false) goto L27;
        abcd.wu.j6(th, -2043848963788211375L, this, r10, r11, r12, r13);
    L27:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-2043848963788211375L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L22
    L7:
        if (r13.contains(r12) == true) goto L41;
        r13.add(r12);     // Catch: java.lang.Throwable -> L22
        java.util.regex.Pattern r1 = java.util.regex.Pattern.compile("^\\s*<!--\\s*#include\\s+file\\s*=\\s*(?:\"|')(.*)(?:\"|')\\s*-->\\s*$");     // Catch: java.lang.Throwable -> L22
    L9:
        java.lang.String r2 = r11.readLine();     // Catch: java.lang.Throwable -> L22
        if (r2 == null) goto L20;
        java.util.regex.Matcher r3 = r1.matcher(r2);     // Catch: java.lang.Throwable -> L22
        if (r3.matches() == true) goto L32;
        r10.write(r2);     // Catch: java.lang.Throwable -> L22
        r10.write("\n");     // Catch: java.lang.Throwable -> L22
        goto L9
    L32:
        java.lang.String r4 = r3.group(1);     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L22
        if (r4.startsWith("/") == true) goto L17;
        r4 = "/" + r4;     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L22
    L17:
        java.io.FileInputStream r5 = Hw(r4);     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L22
        j6(r10, new java.io.BufferedReader(new java.io.InputStreamReader(r5)), r4, r13);     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L22
        r5.close();     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L22
        goto L9
    L20:
        r10.flush();     // Catch: java.lang.Throwable -> L22
        return;
    }

    public static void j6(java.lang.String r5) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 28708304688076860L, null, r5);
    L15:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(28708304688076860L, null, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (j6 != null) goto L9;
        j6 = new com.aide.ui.htmluidesigner.v();     // Catch: java.lang.Throwable -> L11
    L9:
        j6.v5(r5);     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 2444376474788541984L)
    private void j6(java.lang.String r8, java.io.DataOutputStream r9) {
    L27:
        th = move-exception;
        if (FH == false) goto L31;
        abcd.wu.j6(th, -1712625036152592851L, this, r8, r9);
    L31:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1712625036152592851L, this, r8, r9);     // Catch: java.lang.Throwable -> L27
    L7:
        if (r8.toUpperCase().startsWith("GET") == false) goto L9;
    L12:
        java.lang.String r1 = FH(r8);     // Catch: java.lang.Throwable -> L27
        java.io.FileInputStream r2 = Hw(r1);     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L27
    L35:
        r9.writeBytes(j6(200, r1));     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        if (r8.toUpperCase().startsWith("GET") == true) goto L18;
    L34:
        return;
    L18:
        if (DW(r1).equals("text/html") == false) goto L20;
        java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter(r9);     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        j6(r0, new java.io.BufferedReader(new java.io.InputStreamReader(r2)), r1, new java.util.HashSet());     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        r2.close();     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        r0.close();     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        goto L34
    L20:
        j6(r9, r2);     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        r2.close();     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
        r9.close();     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L27
    L22:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L27
        return;
    L25:
        j6(r9, 404);     // Catch: java.lang.Throwable -> L27
        return;
    L9:
        if (r8.toUpperCase().startsWith("HEAD") == true) goto L12;
        j6(r9, 501);     // Catch: java.lang.Throwable -> L27
    }

    @abcd.Interfacesu(method = -701177408857385955L)
    private void v5(java.lang.String r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -32093833494258120L, this, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-32093833494258120L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = r5;     // Catch: java.lang.Throwable -> L8
    }
}
