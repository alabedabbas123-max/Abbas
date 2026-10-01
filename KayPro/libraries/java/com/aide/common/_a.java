package com.aide.common;

@abcd.Interfacexu
class _a implements android.os.Parcelable.Creator<com.aide.common.UndoManager.Change> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common._a.class, -3939864719947814112L, -52892397807058845L);
    }

    _a() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 3569534810449102968L)
    public com.aide.common.UndoManager.Change createFromParcel(android.os.Parcel r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2185044651464009472L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2185044651464009472L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return new com.aide.common.UndoManager.Change(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.aide.common.UndoManager.Change createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 1294720075820608647L)
    public com.aide.common.UndoManager.Change[] newArray(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 2380064336002098645L, this, new java.lang.Integer(r5));
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2380064336002098645L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return new com.aide.common.UndoManager.Change[r5];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.aide.common.UndoManager.Change[] newArray(int r1) {
        return newArray(r1);
    }
}
