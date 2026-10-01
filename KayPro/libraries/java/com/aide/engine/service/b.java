package com.aide.engine.service;

@abcd.Interfacexu
class b extends abcd.Abstractqc {

    @abcd.Interfaceuu
    private static boolean Zo;

    @abcd.Interfacetu
    private static boolean v5;

    @abcd.Interfacevu
    final com.aide.engine.service.CodeAnalysisEngineService VH;

    static {
        abcd.wu.j6(com.aide.engine.service.b.class, 2006115082471780797L, -146370945839940960L);
    }

    b(com.aide.engine.service.CodeAnalysisEngineService r1) {
        this.VH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 555879083465091925L)
    public java.io.InputStream j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 3462692199028310193L, this, r5);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(3462692199028310193L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.VH.getAssets().open(r5);
    }

    @Override
    @abcd.Interfacesu(method = -6315075546956300225L)
    public java.lang.String j6() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 731669566573082785L, this);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(731669566573082785L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.VH.getPackageName();
    }
}
