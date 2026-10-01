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
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 4721523080228235281L, null, r6);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(4721523080228235281L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.textStyle = 0;     // Catch: java.lang.Throwable -> L8
        this.typeface = 0;     // Catch: java.lang.Throwable -> L8
        this.fontFamily = null;     // Catch: java.lang.Throwable -> L8
        this.textView = (android.widget.TextView) r6;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2322562414379709480L)
    private void updateFont() {
    L24:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L28;
        abcd.wu.j6(th, 2804984903332667520L, this);
    L28:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2804984903332667520L, this);     // Catch: java.lang.Throwable -> L24
    L6:
        android.graphics.Typeface r2 = null;
        if (this.fontFamily == null) goto L12;
        r2 = android.graphics.Typeface.create(this.fontFamily, this.textStyle);     // Catch: java.lang.Throwable -> L24
        if (r2 == null) goto L12;
        this.textView.setTypeface(r2);     // Catch: java.lang.Throwable -> L24
        return;
    L12:
        int r3 = this.typeface;     // Catch: java.lang.Throwable -> L24
        if (r3 != 1) goto L15;
        r2 = android.graphics.Typeface.SANS_SERIF;     // Catch: java.lang.Throwable -> L24
    L22:
        this.textView.setTypeface(r2, this.textStyle);     // Catch: java.lang.Throwable -> L24
        return;
    L15:
        if (r3 != 2) goto L17;
        r2 = android.graphics.Typeface.SERIF;     // Catch: java.lang.Throwable -> L24
        goto L22
    L17:
        if (r3 != 3) goto L22;
        r2 = android.graphics.Typeface.MONOSPACE;     // Catch: java.lang.Throwable -> L24
        goto L22
    }

    @abcd.Interfacesu(method = 2868955313219629887L)
    private void updateShadow() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 1633312049847453773L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(1633312049847453773L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.textView.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor);     // Catch: java.lang.Throwable -> L8
    }

    public void setFontFamily(java.lang.String r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 1376903751989791145L, this, r5);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(1376903751989791145L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.fontFamily = r5;     // Catch: java.lang.Throwable -> L8
        updateFont();     // Catch: java.lang.Throwable -> L8
    }

    public void setInputType(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 1552715290254418575L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(1552715290254418575L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.textView.setInputType(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setShadowColor(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -225661509693822000L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-225661509693822000L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.shadowColor = r5;     // Catch: java.lang.Throwable -> L8
        updateShadow();     // Catch: java.lang.Throwable -> L8
    }

    public void setShadowDx(float r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 485594391053453937L, this, new java.lang.Float(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(485594391053453937L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L8
    L6:
        this.shadowDx = r5;     // Catch: java.lang.Throwable -> L8
        updateShadow();     // Catch: java.lang.Throwable -> L8
    }

    public void setShadowDy(float r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 776903302272531700L, this, new java.lang.Float(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(776903302272531700L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L8
    L6:
        this.shadowDy = r5;     // Catch: java.lang.Throwable -> L8
        updateShadow();     // Catch: java.lang.Throwable -> L8
    }

    public void setShadowRadius(float r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 1152852753033808827L, this, new java.lang.Float(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(1152852753033808827L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L8
    L6:
        this.shadowRadius = r5;     // Catch: java.lang.Throwable -> L8
        updateShadow();     // Catch: java.lang.Throwable -> L8
    }

    public void setTextAppearance(java.lang.String r5) {
    L15:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L19;
        abcd.wu.j6(th, 4133757139095467195L, this, r5);
    L19:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L23;
        abcd.wu.j6(4133757139095467195L, this, r5);     // Catch: java.lang.Throwable -> L15
    L23:
        if (r5.startsWith("?android:attr/") == false) goto L12;
        int r6 = ((java.lang.Integer) android.R.attr.class.getField(r5.substring(14)).get(null)).intValue();     // Catch: java.lang.Throwable -> L20
        android.content.res.Resources.Theme r0 = this.textView.getContext().getTheme();     // Catch: java.lang.Throwable -> L20
        android.util.TypedValue r1 = new android.util.TypedValue();     // Catch: java.lang.Throwable -> L20
        if (r0.resolveAttribute(r6, r1, true) == false) goto L24;
        this.textView.setTextAppearance(this.textView.getContext(), r1.data);     // Catch: java.lang.Throwable -> L20
        return;
    L24:
        return;
    L12:
        if (r5.startsWith("@android:style/") == false) goto L26;
        int r7 = ((java.lang.Integer) android.R.style.class.getField(r5.substring(15).replace(".", "_")).get(null)).intValue();     // Catch: java.lang.Throwable -> L20
        this.textView.setTextAppearance(this.textView.getContext(), r7);     // Catch: java.lang.Throwable -> L20
        return;
    L26:
        return;
    }

    public void setTextStyle(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -2536269416424164421L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2536269416424164421L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.textStyle = r5;     // Catch: java.lang.Throwable -> L8
        updateFont();     // Catch: java.lang.Throwable -> L8
    }

    public void setTypeface(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2258561952224161920L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2258561952224161920L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.typeface = r5;     // Catch: java.lang.Throwable -> L8
        updateFont();     // Catch: java.lang.Throwable -> L8
    }
}
