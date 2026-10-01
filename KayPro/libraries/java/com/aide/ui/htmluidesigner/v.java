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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2562548938193121181L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2562548938193121181L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        new java.lang.Thread(new com.aide.ui.htmluidesigner.u(this)).start();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2872672279052916555L)
    private java.lang.String DW(java.lang.String r6) {
        java.lang.String r3 = null;
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 37: {
                    th = $ex1;
                    if (FH == false) { $pc1 = 41; continue $sw1; }
                    abcd.wu.j6(th, 2023734416497034560L, this, r6);
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2023734416497034560L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 37; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r3 = r6.substring(r6.lastIndexOf(46) + 1, r6.length()).toLowerCase();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 37; continue $sw1;
                    }
                    if (r3.equals("zip") == false) { $pc1 = 10; continue $sw1; }
                    r0 = "application/x-zip-compressed";
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    if (r0 != null) { $pc1 = 44; continue $sw1; }
                    return "*/*";
                }
                case 44: {
                    return r0;
                }
                case 10: {
                    if (r3.equals("png") == false) { $pc1 = 13; continue $sw1; }
                    r0 = "image/png";
                    { $pc1 = 34; continue $sw1; }
                }
                case 13: {
                    if (r3.equals("gif") == false) { $pc1 = 16; continue $sw1; }
                    r0 = "image/gif";
                    { $pc1 = 34; continue $sw1; }
                }
                case 16: {
                    if (r3.equals("jpg") == false) { $pc1 = 18; continue $sw1; }
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    r0 = "image/jpeg";
                    { $pc1 = 34; continue $sw1; }
                }
                case 18: {
                    if (r3.equals("jpeg") == true) { $pc1 = 33; continue $sw1; }
                    if (r3.equals("html") == false) { $pc1 = 23; continue $sw1; }
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r0 = "text/html";
                    { $pc1 = 34; continue $sw1; }
                }
                case 23: {
                    if (r3.equals("html") == true) { $pc1 = 32; continue $sw1; }
                    if (r3.equals("css") == false) { $pc1 = 29; continue $sw1; }
                    r0 = "text/css";
                    { $pc1 = 34; continue $sw1; }
                }
                case 29: {
                    if (r3.equals("js") == false) { $pc1 = 31; continue $sw1; }
                    r0 = "application/javascript";
                    { $pc1 = 34; continue $sw1; }
                }
                case 31: {
                    try {
                        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 37; continue $sw1;
                    }
                    { $pc1 = 34; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5127662770553500965L)
    private java.lang.String FH(java.lang.String r7) {
        java.lang.String[] r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (FH == false) { $pc2 = 17; continue $sw2; }
                    abcd.wu.j6(th, -1904786558047675840L, this, r7);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-1904786558047675840L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = r7.split(" ");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    r3 = "";
                    if (r2.length < 2) { $pc2 = 9; continue $sw2; }
                    try {
                        r3 = r2[1];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r3.equals("/") == false) { $pc2 = 20; continue $sw2; }
                    return "/index.html";
                }
                case 20: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1697638672396419225L)
    private java.io.FileInputStream Hw(java.lang.String r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (FH == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -411981764818408512L, this, r7);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-411981764818408512L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return new java.io.FileInputStream(new java.io.File(this.Hw + r7));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1800482580594057900L)
    private java.lang.String j6(int r8, java.lang.String r9) {
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 30: {
                    th = $ex4;
                    if (FH == false) { $pc4 = 34; continue $sw4; }
                    abcd.wu.j6(th, 77133291289936521L, this, new java.lang.Integer(r8), r9);
                    $pc4 = 34; continue $sw4;
                }
                case 34: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(77133291289936521L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r1 = "HTTP/1.0 ";
                    if (r8 != 200) { $pc4 = 9; continue $sw4; }
                    try {
                        r1 = "HTTP/1.0 200 OK";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    try {
                        r2 = ((r1 + "\r\n") + "Connection: close\r\n") + "Server: AIDE\r\n";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    if (r9 == null) { $pc4 = 28; continue $sw4; }
                    try {
                        r2 = r2 + "Content-Type: " + DW(r9) + "\r\n";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    $pc4 = 28; continue $sw4;
                }
                case 28: {
                    return r2 + "\r\n";
                }
                case 9: {
                    if (r8 != 400) { $pc4 = 11; continue $sw4; }
                    try {
                        r1 = "HTTP/1.0 400 Bad Request";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    { $pc4 = 25; continue $sw4; }
                }
                case 11: {
                    if (r8 != 403) { $pc4 = 13; continue $sw4; }
                    try {
                        r1 = "HTTP/1.0 403 Forbidden";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    { $pc4 = 25; continue $sw4; }
                }
                case 13: {
                    if (r8 != 404) { $pc4 = 15; continue $sw4; }
                    try {
                        r1 = "HTTP/1.0 404 Not Found";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    { $pc4 = 25; continue $sw4; }
                }
                case 15: {
                    if (r8 != 500) { $pc4 = 17; continue $sw4; }
                    try {
                        r1 = "HTTP/1.0 500 Internal Server Error";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    { $pc4 = 25; continue $sw4; }
                }
                case 17: {
                    if (r8 != 501) { $pc4 = 25; continue $sw4; }
                    try {
                        r1 = "HTTP/1.0 501 Not Implemented";
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 30; continue $sw4;
                    }
                    { $pc4 = 25; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 877908410343769797L)
    private void j6() {
        java.net.ServerSocket r2 = null;
        java.net.Socket r3 = null;
        java.io.BufferedReader r4 = null;
        java.io.DataOutputStream r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 15: {
                    th = $ex5;
                    if (FH == false) { $pc5 = 20; continue $sw5; }
                    abcd.wu.j6(th, 1900776044922573616L, this);
                    $pc5 = 20; continue $sw5;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc5 = 22; continue $sw5; }
                    try {
                        abcd.wu.j6(1900776044922573616L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    $pc5 = 22; continue $sw5;
                }
                case 22: {
                    try {
                        r2 = new java.net.ServerSocket(8099);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 12; continue $sw5; }
                        $pc5 = 15; continue $sw5;
                    }
                    $pc5 = 25; continue $sw5;
                }
                case 25: {
                    try {
                        r3 = r2.accept();
                        r4 = new java.io.BufferedReader(new java.io.InputStreamReader(r3.getInputStream()));
                        r5 = new java.io.DataOutputStream(r3.getOutputStream());
                        j6(r4.readLine(), r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 9; continue $sw5; }
                        $pc5 = 15; continue $sw5;
                    }
                    return;
                }
                case 9: {
                    e = $ex5;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 12; continue $sw5; }
                        $pc5 = 15; continue $sw5;
                    }
                    return;
                }
                case 12: {
                    e = $ex5;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 15; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.ui.htmluidesigner.v r0) {
        r0.j6();
    }

    @abcd.Interfacesu(method = 2025503547542336448L)
    private void j6(java.io.DataOutputStream r8, int r9) {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 11: {
                    th = $ex6;
                    if (FH == false) { $pc6 = 15; continue $sw6; }
                    abcd.wu.j6(th, 1684752792646052243L, this, r8, new java.lang.Integer(r9));
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc6 = 16; continue $sw6; }
                    try {
                        abcd.wu.j6(1684752792646052243L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    try {
                        r8.writeBytes(j6(r9, null));
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 8; continue $sw6; }
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    return;
                }
                case 8: {
                    e = $ex6;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -269024536764346940L)
    private void j6(java.io.DataOutputStream r8, java.io.FileInputStream r9) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 11: {
                    th = $ex7;
                    if (FH == false) { $pc7 = 16; continue $sw7; }
                    abcd.wu.j6(th, 5990458131926693265L, this, r8, r9);
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(5990458131926693265L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r0 = new byte[2000];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r1 = r9.read(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    if (r1 == (-1)) { $pc7 = 10; continue $sw7; }
                    try {
                        r8.write(r0, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    { $pc7 = 6; continue $sw7; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5460622060013046288L)
    private void j6(java.io.Writer r10, java.io.BufferedReader r11, java.lang.String r12, java.util.Set<java.lang.String> r13) {
        java.util.regex.Pattern r1 = null;
        java.lang.String r2 = null;
        java.util.regex.Matcher r3 = null;
        java.lang.String r4 = null;
        java.io.FileInputStream r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 22: {
                    th = $ex8;
                    if (FH == false) { $pc8 = 27; continue $sw8; }
                    abcd.wu.j6(th, -2043848963788211375L, this, r10, r11, r12, r13);
                    $pc8 = 27; continue $sw8;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(-2043848963788211375L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r13.contains(r12) == true) { $pc8 = 41; continue $sw8; }
                    try {
                        r13.add(r12);
                        r1 = java.util.regex.Pattern.compile("^\\s*<!--\\s*#include\\s+file\\s*=\\s*(?:\"|')(.*)(?:\"|')\\s*-->\\s*$");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    try {
                        r2 = r11.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    if (r2 == null) { $pc8 = 20; continue $sw8; }
                    try {
                        r3 = r1.matcher(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    if (r3.matches() == true) { $pc8 = 32; continue $sw8; }
                    try {
                        r10.write(r2);
                        r10.write("\n");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 9; continue $sw8; }
                }
                case 32: {
                    try {
                        r4 = r3.group(1);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc8 = 29; continue $sw8; }
                        $pc8 = 22; continue $sw8;
                    }
                    if (r4.startsWith("/") == true) { $pc8 = 17; continue $sw8; }
                    try {
                        r4 = "/" + r4;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc8 = 29; continue $sw8; }
                        $pc8 = 22; continue $sw8;
                    }
                    $pc8 = 17; continue $sw8;
                }
                case 17: {
                    try {
                        r5 = Hw(r4);
                        j6(r10, new java.io.BufferedReader(new java.io.InputStreamReader(r5)), r4, r13);
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc8 = 29; continue $sw8; }
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 9; continue $sw8; }
                }
                case 20: {
                    try {
                        r10.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    return;
                }
                case 29: {
                    $pc8 = 41; continue $sw8;
                }
                case 41: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 11: {
                    th = $ex9;
                    if (FH == false) { $pc9 = 15; continue $sw9; }
                    abcd.wu.j6(th, 28708304688076860L, null, r5);
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc9 = 7; continue $sw9; }
                    try {
                        abcd.wu.j6(28708304688076860L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (j6 != null) { $pc9 = 9; continue $sw9; }
                    try {
                        j6 = new com.aide.ui.htmluidesigner.v();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    try {
                        j6.v5(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2444376474788541984L)
    private void j6(java.lang.String r8, java.io.DataOutputStream r9) {
        java.lang.String r1 = null;
        java.io.FileInputStream r2 = null;
        java.io.OutputStreamWriter r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 27: {
                    th = $ex10;
                    if (FH == false) { $pc10 = 31; continue $sw10; }
                    abcd.wu.j6(th, -1712625036152592851L, this, r8, r9);
                    $pc10 = 31; continue $sw10;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc10 = 7; continue $sw10; }
                    try {
                        abcd.wu.j6(-1712625036152592851L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 27; continue $sw10;
                    }
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (r8.toUpperCase().startsWith("GET") == false) { $pc10 = 9; continue $sw10; }
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    try {
                        r1 = FH(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 27; continue $sw10;
                    }
                    try {
                        r2 = Hw(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 25; continue $sw10; }
                        $pc10 = 27; continue $sw10;
                    }
                    $pc10 = 35; continue $sw10;
                }
                case 35: {
                    try {
                        r9.writeBytes(j6(200, r1));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 22; continue $sw10; }
                        $pc10 = 27; continue $sw10;
                    }
                    if (r8.toUpperCase().startsWith("GET") == true) { $pc10 = 18; continue $sw10; }
                    $pc10 = 34; continue $sw10;
                }
                case 34: {
                    return;
                }
                case 18: {
                    if (DW(r1).equals("text/html") == false) { $pc10 = 20; continue $sw10; }
                    try {
                        r0 = new java.io.OutputStreamWriter(r9);
                        j6(r0, new java.io.BufferedReader(new java.io.InputStreamReader(r2)), r1, new java.util.HashSet());
                        r2.close();
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 22; continue $sw10; }
                        $pc10 = 27; continue $sw10;
                    }
                    { $pc10 = 34; continue $sw10; }
                }
                case 20: {
                    try {
                        j6(r9, r2);
                        r2.close();
                        r9.close();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 22; continue $sw10; }
                        $pc10 = 27; continue $sw10;
                    }
                    $pc10 = 9; continue $sw10;
                }
                case 22: {
                    e = $ex10;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 27; continue $sw10;
                    }
                    return;
                }
                case 25: {
                    try {
                        j6(r9, 404);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 27; continue $sw10;
                    }
                    return;
                }
                case 9: {
                    if (r8.toUpperCase().startsWith("HEAD") == true) { $pc10 = 12; continue $sw10; }
                    try {
                        j6(r9, 501);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 27; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -701177408857385955L)
    private void v5(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (FH == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -32093833494258120L, this, r5);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-32093833494258120L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        this.Hw = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
