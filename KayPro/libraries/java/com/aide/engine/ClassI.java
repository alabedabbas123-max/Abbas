package com.aide.engine;

@abcd.Interfacexu
class ClassI implements android.os.Parcelable.Creator<com.aide.engine.FileHighlightings> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1344800284458621504L)
    private com.aide.engine.FileHighlightings FH;

    static {
        abcd.wu.j6(com.aide.engine.ClassI.class, 7780765271333714769L, -2773963344198450264L);
    }

    ClassI() {
        this.FH = new com.aide.engine.FileHighlightings();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 2072592329956407207L)
    public com.aide.engine.FileHighlightings createFromParcel(android.os.Parcel r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1868528276555403552L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1868528276555403552L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.aide.engine.FileHighlightings createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -607123074475691648L)
    public com.aide.engine.FileHighlightings[] newArray(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -2588890491825977849L, this, new java.lang.Integer(r5));
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-2588890491825977849L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return new com.aide.engine.FileHighlightings[r5];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.aide.engine.FileHighlightings[] newArray(int r1) {
        return newArray(r1);
    }
}
