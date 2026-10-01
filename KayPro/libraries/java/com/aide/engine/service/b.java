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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (Zo == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 3462692199028310193L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3462692199028310193L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.VH.getAssets().open(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -6315075546956300225L)
    public java.lang.String j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Zo == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 731669566573082785L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (v5 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(731669566573082785L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.VH.getPackageName();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
