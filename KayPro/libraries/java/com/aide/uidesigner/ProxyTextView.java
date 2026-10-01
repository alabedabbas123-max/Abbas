package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyTextView {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE = false;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE = false;
    public static final int INPUTTYPE_date = 20;
    public static final int INPUTTYPE_datetime = 4;
    public static final int INPUTTYPE_none = 0;
    public static final int INPUTTYPE_number = 2;
    public static final int INPUTTYPE_numberDecimal = 8194;
    public static final int INPUTTYPE_numberPassword = 18;
    public static final int INPUTTYPE_numberSigned = 4098;
    public static final int INPUTTYPE_phone = 3;
    public static final int INPUTTYPE_text = 1;
    public static final int INPUTTYPE_textAutoComplete = 65537;
    public static final int INPUTTYPE_textAutoCorrect = 32769;
    public static final int INPUTTYPE_textCapCharacters = 4097;
    public static final int INPUTTYPE_textCapSentences = 16385;
    public static final int INPUTTYPE_textCapWords = 8193;
    public static final int INPUTTYPE_textEmailAddress = 33;
    public static final int INPUTTYPE_textEmailSubject = 49;
    public static final int INPUTTYPE_textFilter = 177;
    public static final int INPUTTYPE_textImeMultiLine = 262145;
    public static final int INPUTTYPE_textLongMessage = 81;
    public static final int INPUTTYPE_textMultiLine = 131073;
    public static final int INPUTTYPE_textNoSuggestions = 524289;
    public static final int INPUTTYPE_textPassword = 129;
    public static final int INPUTTYPE_textPersonName = 97;
    public static final int INPUTTYPE_textPhonetic = 193;
    public static final int INPUTTYPE_textPostalAddress = 113;
    public static final int INPUTTYPE_textShortMessage = 65;
    public static final int INPUTTYPE_textUri = 17;
    public static final int INPUTTYPE_textVisiblePassword = 145;
    public static final int INPUTTYPE_textWebEditText = 161;
    public static final int INPUTTYPE_textWebEmailAddress = 209;
    public static final int INPUTTYPE_textWebPassword = 225;
    public static final int INPUTTYPE_time = 36;
    public static final int TEXTSTYLE_bold = 1;
    public static final int TEXTSTYLE_italic = 2;
    public static final int TEXTSTYLE_normal = 0;
    public static final int TYPEFACE_MONOSPACE = 3;
    public static final int TYPEFACE_NORMAL = 0;
    public static final int TYPEFACE_SANS = 1;
    public static final int TYPEFACE_SERIF = 2;

    @abcd.Interfaceru(field = 4149160874193538224L)
    private java.lang.String fontFamily;

    @abcd.Interfaceru(field = 616091265205813440L)
    private int shadowColor;

    @abcd.Interfaceru(field = -542160383735676321L)
    private float shadowDx;

    @abcd.Interfaceru(field = -542180264062047188L)
    private float shadowDy;

    @abcd.Interfaceru(field = 75038886499218565L)
    private float shadowRadius;

    @abcd.Interfaceru(field = 3936653544795519039L)
    private int textStyle;

    @abcd.Interfaceru(field = 1114182159852556095L)
    private final android.widget.TextView textView;

    @abcd.Interfaceru(field = -3767622177120399040L)
    private int typeface;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyTextView.class, -5375977708608822133L, -5375977708608822133L);
    }

    public ProxyTextView(java.lang.Object r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if ($ON_THROW_TOGGLE == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4721523080228235281L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4721523080228235281L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.textStyle = 0;
                        this.typeface = 0;
                        this.fontFamily = null;
                        this.textView = (android.widget.TextView) r6;
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

    @abcd.Interfacesu(method = -2322562414379709480L)
    private void updateFont() {
        android.graphics.Typeface r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 24: {
                    th = $ex1;
                    if ($ON_THROW_TOGGLE == false) { $pc1 = 28; continue $sw1; }
                    abcd.wu.j6(th, 2804984903332667520L, this);
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2804984903332667520L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r2 = null;
                    if (this.fontFamily == null) { $pc1 = 12; continue $sw1; }
                    try {
                        r2 = android.graphics.Typeface.create(this.fontFamily, this.textStyle);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    if (r2 == null) { $pc1 = 12; continue $sw1; }
                    try {
                        this.textView.setTypeface(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 12: {
                    try {
                        r3 = this.typeface;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    if (r3 != 1) { $pc1 = 15; continue $sw1; }
                    try {
                        r2 = android.graphics.Typeface.SANS_SERIF;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    try {
                        this.textView.setTypeface(r2, this.textStyle);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    return;
                }
                case 15: {
                    if (r3 != 2) { $pc1 = 17; continue $sw1; }
                    try {
                        r2 = android.graphics.Typeface.SERIF;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 22; continue $sw1; }
                }
                case 17: {
                    if (r3 != 3) { $pc1 = 22; continue $sw1; }
                    try {
                        r2 = android.graphics.Typeface.MONOSPACE;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 22; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2868955313219629887L)
    private void updateShadow() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if ($ON_THROW_TOGGLE == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1633312049847453773L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1633312049847453773L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.textView.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setFontFamily(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if ($ON_THROW_TOGGLE == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 1376903751989791145L, this, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1376903751989791145L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.fontFamily = r5;
                        updateFont();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setInputType(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if ($ON_THROW_TOGGLE == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 1552715290254418575L, this, new java.lang.Integer(r5));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(1552715290254418575L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.textView.setInputType(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setShadowColor(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if ($ON_THROW_TOGGLE == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -225661509693822000L, this, new java.lang.Integer(r5));
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-225661509693822000L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.shadowColor = r5;
                        updateShadow();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setShadowDx(float r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if ($ON_THROW_TOGGLE == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 485594391053453937L, this, new java.lang.Float(r5));
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(485594391053453937L, this, new java.lang.Float(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.shadowDx = r5;
                        updateShadow();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setShadowDy(float r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if ($ON_THROW_TOGGLE == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 776903302272531700L, this, new java.lang.Float(r5));
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(776903302272531700L, this, new java.lang.Float(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        this.shadowDy = r5;
                        updateShadow();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setShadowRadius(float r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if ($ON_THROW_TOGGLE == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 1152852753033808827L, this, new java.lang.Float(r5));
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(1152852753033808827L, this, new java.lang.Float(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        this.shadowRadius = r5;
                        updateShadow();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setTextAppearance(java.lang.String r5) {
        int r6 = 0;
        android.content.res.Resources.Theme r0 = null;
        android.util.TypedValue r1 = null;
        int r7 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 15: {
                    th = $ex9;
                    if ($ON_THROW_TOGGLE == false) { $pc9 = 19; continue $sw9; }
                    abcd.wu.j6(th, 4133757139095467195L, this, r5);
                    $pc9 = 19; continue $sw9;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc9 = 23; continue $sw9; }
                    try {
                        abcd.wu.j6(4133757139095467195L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 15; continue $sw9;
                    }
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    if (r5.startsWith("?android:attr/") == false) { $pc9 = 12; continue $sw9; }
                    try {
                        r6 = ((java.lang.Integer) android.R.attr.class.getField(r5.substring(14)).get(null)).intValue();
                        r0 = this.textView.getContext().getTheme();
                        r1 = new android.util.TypedValue();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 20; continue $sw9;
                    }
                    if (r0.resolveAttribute(r6, r1, true) == false) { $pc9 = 24; continue $sw9; }
                    try {
                        this.textView.setTextAppearance(this.textView.getContext(), r1.data);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 20; continue $sw9;
                    }
                    return;
                }
                case 24: {
                    return;
                }
                case 12: {
                    if (r5.startsWith("@android:style/") == false) { $pc9 = 26; continue $sw9; }
                    try {
                        r7 = ((java.lang.Integer) android.R.style.class.getField(r5.substring(15).replace(".", "_")).get(null)).intValue();
                        this.textView.setTextAppearance(this.textView.getContext(), r7);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 20; continue $sw9;
                    }
                    return;
                }
                case 26: {
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setTextStyle(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if ($ON_THROW_TOGGLE == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -2536269416424164421L, this, new java.lang.Integer(r5));
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-2536269416424164421L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        this.textStyle = r5;
                        updateFont();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setTypeface(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if ($ON_THROW_TOGGLE == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, 2258561952224161920L, this, new java.lang.Integer(r5));
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(2258561952224161920L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        this.typeface = r5;
                        updateFont();
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
