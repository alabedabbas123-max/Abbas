package abcd;

@abcd.Interfacexu
public class Cl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -945717536822237907L)
    private com.aide.common.TextToSpeechHelper EQ;

    @abcd.Interfaceru(field = -66464265375332215L)
    private com.aide.ui.trainer.TrainerState FH;

    @abcd.Interfaceru(field = 150621059386344891L)
    private java.util.Map<java.lang.String, java.lang.String> Hw;

    @abcd.Interfaceru(field = 1168960760877514576L)
    private com.aide.ui.trainer.g.a J0;

    @abcd.Interfaceru(field = -3074078589126474112L)
    private int VH;

    @abcd.Interfaceru(field = -1478307580787489507L)
    private int Zo;

    @abcd.Interfaceru(field = -1748325021248300160L)
    private int gn;

    @abcd.Interfaceru(field = 3301527947850187407L)
    private int tp;

    @abcd.Interfaceru(field = 277258979908529472L)
    private int u7;

    @abcd.Interfaceru(field = -2309219534438200899L)
    private android.media.SoundPool v5;

    @abcd.Interfaceru(field = 3566242511821912179L)
    private com.aide.ui.trainer.g we;

    static {
        abcd.wu.j6(abcd.Cl.class, -2365206608828434332L, -2365206608828434332L);
    }

    public Cl() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2345039700489691056L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2345039700489691056L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static void DW(abcd.Cl r0) {
        r0.Sf();
    }

    @abcd.Interfacesu(method = -1674650923737894032L)
    private void DW(java.lang.String r9, java.lang.String r10) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1182068592727685151L, this, r9, r10);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1182068592727685151L, this, r9, r10);     // Catch: java.lang.Throwable -> L13
    L5:
        this.FH.retryCurrentExercise(r10, VH().VH());     // Catch: java.lang.Throwable -> L13
        if (com.aide.ui.aa.J0() == false) goto L9;
        this.v5.play(this.Zo, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L13
    L9:
        if (com.aide.ui.aa.J8() == false) goto L11;
        this.EQ.j6(r9, r10);     // Catch: java.lang.Throwable -> L13
    L11:
        ef();     // Catch: java.lang.Throwable -> L13
        KD();     // Catch: java.lang.Throwable -> L13
    }

    static com.aide.common.TextToSpeechHelper FH(abcd.Cl r0) {
        return r0.EQ;
    }

    static int Hw(abcd.Cl r0) {
        return r0.u7;
    }

    @abcd.Interfacesu(method = -3122737051690434752L)
    private void KD() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 1922938751456375721L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1922938751456375721L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH.showSkipLesson(XL()) == true) goto L9;
        return;
    L9:
        if (com.aide.ui.U.U2().u7() == true) goto L11;
        return;
    L11:
        if (cb() == null) goto L23;
        abcd.F.j6("Skip Lesson Dialog Shown");     // Catch: java.lang.Throwable -> L14
        com.aide.common.Wa.DW(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_ask_a_question, new java.lang.Object[0]), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_ask_a_question_message_2, new java.lang.Object[0]), new abcd.Runnableyl(this));     // Catch: java.lang.Throwable -> L14
        return;
    }

    @abcd.Interfacesu(method = 447866184427545492L)
    private void Mz() {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 4227960403382807L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4227960403382807L, this);     // Catch: java.lang.Throwable -> L18
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        int r4 = 0;
    L8:
        if (r4 >= VH().tp()) goto L15;
        com.aide.ui.trainer.g.f r5 = VH().DW(r4);     // Catch: java.lang.Throwable -> L18
        java.lang.String r6 = r5.DW();     // Catch: java.lang.Throwable -> L18
        if (this.Hw.containsKey(r6) == false) goto L12;
        java.lang.String r7 = this.Hw.get(r6);     // Catch: java.lang.Throwable -> L18
    L13:
        java.lang.String r8 = r5.j6().replace("$package_name$", cn()).replace("$project_name$", XL().aM().Hw());     // Catch: java.lang.Throwable -> L18
        com.aide.ui.U.lg().J8().j6(r7, r8, new java.lang.String[]{"$code_hint$", "$code_hint_1$", "$code_hint_2$", "$code_hint_3$", "$code_hint_4$", "$code_hint_5$", "$code_hint_6$", "$code_hint_7$", "$code_hint_8$", "$code_hint_9$", "$code_hint_10$"});     // Catch: java.lang.Throwable -> L18
        r2.add(r7);     // Catch: java.lang.Throwable -> L18
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L18
        goto L8
    L12:
        r7 = gn();     // Catch: java.lang.Throwable -> L18
        goto L13
    L15:
        if (r2.size() <= 0) goto L30;
        com.aide.ui.U.vy().j6(r2, false);     // Catch: java.lang.Throwable -> L18
        return;
    }

    @abcd.Interfacesu(method = 2593235869395911180L)
    private boolean SI() {
    L57:
        th = move-exception;
        if (DW == false) goto L62;
        abcd.wu.j6(th, 5011993959025152841L, this);
    L62:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5011993959025152841L, this);     // Catch: java.lang.Throwable -> L57
    L6:
        java.lang.String r0 = gn();     // Catch: java.lang.Throwable -> L57
        java.util.List<java.lang.String> r1 = com.aide.ui.U.er().DW(r0).VH();     // Catch: java.lang.Throwable -> L57
        java.util.ArrayList r4 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L57
        java.util.Iterator<java.lang.String> r2 = r1.iterator();     // Catch: java.lang.Throwable -> L57
    L8:
        java.lang.String r6 = "\t";
        if (r2.hasNext() == false) goto L11;
        r4.add(r2.next().replace(" ", "").replace("\t", ""));     // Catch: java.lang.Throwable -> L57
        goto L8
    L11:
        int r5 = 0;
    L13:
        if (r5 >= VH().Hw()) goto L55;
        com.aide.ui.trainer.g.e r9 = VH().j6(r5);     // Catch: java.lang.Throwable -> L57
        java.lang.String r11 = r9.j6().replace(" ", "").replace(r6, "");     // Catch: java.lang.Throwable -> L57
        int r12 = r9.Hw();     // Catch: java.lang.Throwable -> L57
        int r13 = r9.v5();     // Catch: java.lang.Throwable -> L57
        int r14 = r9.DW();     // Catch: java.lang.Throwable -> L57
        java.util.Iterator r15 = r4.iterator();     // Catch: java.lang.Throwable -> L57
        int r3 = 0;
        int r7 = 1;
    L16:
        if (r15.hasNext() == false) goto L46;
        java.lang.String r10 = (java.lang.String) r15.next();     // Catch: java.lang.Throwable -> L57
        if (r10.length() <= 0) goto L24;
        if (r7 < r13) goto L24;
        if (r7 > r14) goto L24;
        if (r10.contains(r11) == false) goto L26;
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L57
        goto L24
    L26:
        if (r11.startsWith(r10) == false) goto L24;
        java.lang.String r17 = r6;
        java.lang.String r8 = r11.substring(r10.length());     // Catch: java.lang.Throwable -> L57
        int r16 = r7;
    L29:
        if (r16 >= r4.size()) goto L42;
        java.lang.String r18 = (java.lang.String) r4.get(r16);     // Catch: java.lang.Throwable -> L57
        if (r18.length() != 0) goto L34;
    L41:
        r16 = r16 + 1;     // Catch: java.lang.Throwable -> L57
        goto L29
    L34:
        if (r18.startsWith(r8) == true) goto L35;
        if (r8.startsWith(r18) == false) goto L42;
        r8 = r8.substring(r18.length());     // Catch: java.lang.Throwable -> L57
        if (r8.length() != 0) goto L41;
    L35:
        boolean r19 = true;
    L43:
        if (r19 == false) goto L45;
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L57
    L45:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L57
        r6 = r17;
    L42:
        r19 = false;
    L24:
        r17 = r6;
        goto L45
    L46:
        java.lang.String r110 = r6;
        if (r12 != (-1)) goto L49;
        if (r3 != 0) goto L49;
    L51:
        DW(VH().Zo(), r9.FH());     // Catch: java.lang.Throwable -> L57
        return false;
    L49:
        if (r12 < 0) goto L54;
        if (r3 != r12) goto L51;
    L54:
        r5 = r5 + 1;
        r6 = r110;
        goto L13
    L55:
        return true;
    }

    @abcd.Interfacesu(method = -127671971275522112L)
    private void Sf() {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 189199352777526875L, this);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L31;
        abcd.wu.j6(189199352777526875L, this);     // Catch: java.lang.Throwable -> L23
    L31:
        com.aide.ui.U.lg().Mz();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        com.aide.ui.trainer.g.h r3 = XL().aM();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        java.lang.String r4 = Zo(XL());     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        java.io.InputStream r11 = this.J0.FH(r3.Zo() + ".zip");     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        this.Hw.putAll(com.aide.ui.U.gW().j6(r11, r4, r3.Hw(), cn(), r3.j6()));     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        r11.close();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        if (r3.DW().length() <= 0) goto L10;
        java.io.InputStream r0 = this.J0.FH(r3.DW() + ".zip");     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        this.Hw.putAll(com.aide.ui.U.gW().j6(r0, r4, r3.Hw(), cn(), r3.j6()));     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        r0.close();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
    L10:
        if (r3.v5().length() <= 0) goto L12;
        r4 = r4 + "/" + r3.v5();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
    L12:
        com.aide.ui.U.vy().j6(r4, false);     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        java.util.Iterator<java.lang.String> r1 = r3.j6().iterator();     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
    L13:
        if (r1.hasNext() == false) goto L34;
        com.aide.ui.U.er().j6(this.Hw.get(r1.next()), false);     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L23
        goto L13
    L34:
        return;
    L17:
        e = move-exception;
        if (this.Hw != null) goto L21;
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Throwable -> L23
    L21:
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Lesson error", e.toString());     // Catch: java.lang.Throwable -> L23
    }

    static void VH(abcd.Cl r0) {
        r0.ef();
    }

    @abcd.Interfacesu(method = -2443599130413531024L)
    private void VH(com.aide.ui.trainer.g.i r17) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1030311059420238803L, this, r17);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1030311059420238803L, this, r17);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.ui.U.U2().u7() == false) goto L9;
        return;
    L9:
        if (com.aide.ui.U.U2().VH() == true) goto L20;
        com.aide.ui.trainer.TrainerNotificationAlarmReceiver.j6(com.aide.ui.U.Zo(), 86400000, 4, r17.DW().Hw(), "", com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_notification_title, new java.lang.Object[]{r17.EQ()}), com.aide.ui.U.Zo().getResources().getString(com.almlkaide.kaypro.R.string.trainer_notification_text, new java.lang.Object[]{r17.DW().J0()[0] + " " + r17.DW().J0()[1]}));     // Catch: java.lang.Throwable -> L12
        return;
    }

    @abcd.Interfacesu(method = -1308078167234676800L)
    private java.lang.String Zo(com.aide.ui.trainer.g.i r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1179895769474877807L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1179895769474877807L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Vl.v5() + "/Lessons/") + r5.Zo();
    }

    static void Zo(abcd.Cl r0) {
        r0.Mz();
    }

    @abcd.Interfacesu(method = 1162578644291667524L)
    private com.aide.ui.trainer.g.i cb() {
    L37:
        th = move-exception;
        if (DW == false) goto L42;
        abcd.wu.j6(th, 3760770434774392189L, this);
    L42:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3760770434774392189L, this);     // Catch: java.lang.Throwable -> L37
    L6:
        com.aide.ui.trainer.g.C0053g r2 = XL();     // Catch: java.lang.Throwable -> L37
        com.aide.ui.trainer.g.a r3 = Zo();     // Catch: java.lang.Throwable -> L37
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r5 >= r2.gn()) goto L15;
        com.aide.ui.trainer.g.C0053g r6 = r3.j6(r5);     // Catch: java.lang.Throwable -> L37
        if (this.FH.isLessonInProgress(r6) == true) goto L14;
        if (Hw(r6) == false) goto L14;
        return r6;
    L14:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L37
        goto L8
    L15:
        int r7 = r2.gn();     // Catch: java.lang.Throwable -> L37
    L21:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L37
        if (r7 >= r3.VH()) goto L22;
        com.aide.ui.trainer.g.C0053g r8 = r3.j6(r7);     // Catch: java.lang.Throwable -> L37
        if (this.FH.isLessonInProgress(r8) == true) goto L21;
        return r8;
    L22:
        int r9 = 0;
    L24:
        if (r9 >= r3.VH()) goto L29;
        com.aide.ui.trainer.g.C0053g r10 = r3.j6(r9);     // Catch: java.lang.Throwable -> L37
        if (this.FH.isLessonInProgress(r10) == false) goto L27;
        r9 = r9 + 1;     // Catch: java.lang.Throwable -> L37
        goto L24
    L27:
        return r10;
    L29:
        if (r4 >= r3.VH()) goto L35;
        com.aide.ui.trainer.g.C0053g r11 = r3.j6(r4);     // Catch: java.lang.Throwable -> L37
        if (this.FH.isLessonFinished(r11) == false) goto L33;
        r4 = r4 + 1;
        goto L29
    L33:
        return r11;
    L35:
        return null;
    }

    @abcd.Interfacesu(method = -511561323811995993L)
    private java.lang.String cn() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1620885679987033152L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1620885679987033152L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return "com.aide.trainer." + XL().aM().FH();
    }

    @abcd.Interfacesu(method = 2679829953405412080L)
    private boolean dx() {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 1476456523510844811L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1476456523510844811L, this);     // Catch: java.lang.Throwable -> L17
    L7:
        if ((this.FH.getCurrentExercise() + 1) >= XL().XL()) goto L9;
        return false;
    L9:
        com.aide.ui.trainer.g.i r2 = cb();     // Catch: java.lang.Throwable -> L17
        if (r2 != null) goto L12;
    L16:
        return false;
    L12:
        if (r2.J0() == false) goto L16;
        if (com.aide.ui.U.U2().u7() == true) goto L16;
        return true;
    }

    @abcd.Interfacesu(method = 2313669220249491624L)
    private void ef() {
    L35:
        th = move-exception;
        if (DW == false) goto L39;
        abcd.wu.j6(th, 4879168149509644479L, this);
    L39:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4879168149509644479L, this);     // Catch: java.lang.Throwable -> L35
    L6:
        com.aide.ui.U.lg().ef();     // Catch: java.lang.Throwable -> L35
        java.lang.String r2 = "";
        if (this.FH.getCurrentExercise() != 0) goto L10;
        r2 = "" + XL().FH() + " ";     // Catch: java.lang.Throwable -> L35
    L10:
        java.lang.String r3 = r2 + VH().J0();     // Catch: java.lang.Throwable -> L35
        if (this.FH.showHintForCurrentExercise() == false) goto L13;
        r3 = r3 + " " + VH().gn();     // Catch: java.lang.Throwable -> L35
    L13:
        java.lang.String r8 = r3;
        java.lang.String r5 = QX();     // Catch: java.lang.Throwable -> L35
        java.lang.String r4 = null;
        if (this.FH.showErrorForCurrentExercise() == false) goto L16;
        r4 = this.FH.getCurrentExerciseErrorText();     // Catch: java.lang.Throwable -> L35
    L16:
        java.lang.String r12 = r4;
        java.lang.String r6 = gn();     // Catch: java.lang.Throwable -> L35
        java.lang.String r9 = u7();     // Catch: java.lang.Throwable -> L35
        int r13 = VH().DW();     // Catch: java.lang.Throwable -> L35
        if (VH().Ws() == true) goto L19;
        boolean r14 = true;
    L20:
        int r7 = ((this.FH.getCurrentExercise() + 1) * 100) / java.lang.Math.max(1, XL().XL());     // Catch: java.lang.Throwable -> L35
        if (this.FH.getCurrentExercise() == 0) goto L23;
    L25:
        boolean r10 = false;
    L27:
        if (this.FH.getCurrentExercise() != 0) goto L32;
        if (r13 >= 0) goto L32;
        if (XL().XL() <= 1) goto L32;
        boolean r11 = true;
    L33:
        com.aide.ui.U.lg().J8().j6(r6, r5, r7, r10, r8, r9, r11, "😞", r12, r13, r14);     // Catch: java.lang.Throwable -> L35
        return;
    L32:
        r11 = false;
        goto L33
    L23:
        if (Hw(XL()) == false) goto L25;
        r10 = true;
        goto L27
    L19:
        r14 = false;
        goto L20
    }

    @abcd.Interfacesu(method = -5623905883337588057L)
    private void g3() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6866023715509378368L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6866023715509378368L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.lg().J8().postDelayed(new abcd.RunnableC1520xl(this), 100);     // Catch: java.lang.Throwable -> L8
    }

    static com.aide.ui.trainer.g.i gn(abcd.Cl r0) {
        return r0.cb();
    }

    static com.aide.ui.trainer.g j6(abcd.Cl r0) {
        return r0.we;
    }

    @abcd.Interfacesu(method = 3016807329132842484L)
    private java.lang.String j6(float r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 2940247466745660423L, this, new java.lang.Float(r7));
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2940247466745660423L, this, new java.lang.Float(r7));     // Catch: java.lang.Throwable -> L14
    L6:
        int r2 = (int) java.lang.Math.floor(java.lang.Math.max(0.0f, 3.0f - (1.5f * r7)));     // Catch: java.lang.Throwable -> L14
        java.lang.String r3 = "";
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L10;
        r3 = r3 + "★";     // Catch: java.lang.Throwable -> L14
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L14
    L10:
        if (r2 >= 3) goto L13;
        r3 = r3 + "☆";     // Catch: java.lang.Throwable -> L14
        r2 = r2 + 1;
        goto L10
    L13:
        return r3;
    }

    static void j6(abcd.Cl r0, com.aide.ui.trainer.g.i r1) {
        r0.VH(r1);
    }

    @abcd.Interfacesu(method = 296558038337548672L)
    private void ro() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -799429332978034055L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-799429332978034055L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.String r2 = this.we.j6(this.FH.getCurrentLessonId());     // Catch: java.lang.Throwable -> L10
        if (r2.equals(this.FH.getCurrentLessonId()) == true) goto L17;
        this.FH.startLesson(r2);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = 1899839647786837371L)
    private void sG() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2102207193653865424L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2102207193653865424L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.J0 = this.we.Hw(this.FH.getCurrentLessonId());     // Catch: java.lang.Throwable -> L8
        this.EQ = new com.aide.common.TextToSpeechHelper(com.aide.ui.U.Zo());     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -4986074213398411525L)
    private java.lang.String sh() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2691158139821545312L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2691158139821545312L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return XL().EQ() + "  " + j6(this.FH.calculateLessonAverageFailures(XL()));
    }

    static android.media.SoundPool v5(abcd.Cl r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = -403358679555141280L)
    private java.lang.String v5(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -709389080740655985L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-709389080740655985L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw.containsKey(r5) == false) goto L10;
        return this.Hw.get(r5);
    L10:
        return "";
    }

    @abcd.Interfacesu(method = -3521431924428009680L)
    private void vJ() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4141044826135839311L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4141044826135839311L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        new android.os.Handler().postDelayed(new abcd.RunnableC1477wl(this), 1000);     // Catch: java.lang.Throwable -> L8
    }

    public void BT() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 2446007655707915577L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2446007655707915577L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (a8() == false) goto L9;
        this.FH.runCurrentExercise();     // Catch: java.lang.Throwable -> L11
        com.aide.ui.U.er().j6(false, false);     // Catch: java.lang.Throwable -> L11
        com.aide.ui.U.vy().j6(false);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        j6();     // Catch: java.lang.Throwable -> L11
    }

    public java.util.List<com.aide.ui.trainer.g.c> DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -184215730809000565L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-184215730809000565L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.we.Hw();
    }

    public void DW(java.lang.String r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 428199064196952320L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(428199064196952320L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (com.aide.ui.aa.J8() == false) goto L17;
        com.aide.common.TextToSpeechHelper r2 = this.EQ;     // Catch: java.lang.Throwable -> L10
        com.aide.ui.trainer.g r3 = this.we;     // Catch: java.lang.Throwable -> L10
        r2.j6(com.aide.ui.trainer.g.FH(), r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean DW(com.aide.ui.trainer.g.i r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5052514771073882420L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5052514771073882420L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.isLessonFinished(r5);
    }

    public java.lang.String EQ() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1419473463707388100L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1419473463707388100L, this);     // Catch: java.lang.Throwable -> L8
        return "😞";
    L15:
        return "😞";
    }

    public java.lang.String FH() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1708248429602904117L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L20;
        abcd.wu.j6(-1708248429602904117L, this);     // Catch: java.lang.Throwable -> L13
    L20:
        android.content.pm.PackageManager r3 = com.aide.ui.U.Zo().getPackageManager();     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.Throwable -> L13
        android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo(com.aide.ui.U.Zo().getApplicationInfo().packageName, 0);     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.Throwable -> L13
        if (r4 == null) goto L9;
        java.lang.CharSequence r5 = r3.getApplicationLabel(r4);     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.Throwable -> L13
    L10:
        return (java.lang.String) r5;
    L9:
        r5 = "";
    L12:
        return "";
    }

    public void FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 188394424288661265L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(188394424288661265L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.startLesson(this.we.FH(r5));     // Catch: java.lang.Throwable -> L8
        ro();     // Catch: java.lang.Throwable -> L8
    }

    public boolean FH(com.aide.ui.trainer.g.i r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3805459124467457280L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3805459124467457280L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.isLessonInProgress(r5);
    }

    public java.lang.String Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4908212220172074576L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4908212220172074576L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_press_back, new java.lang.Object[0]) + " ↩";
    }

    public boolean Hw(com.aide.ui.trainer.g.i r7) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -1991347426511714092L, this, r7);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1991347426511714092L, this, r7);     // Catch: java.lang.Throwable -> L17
    L7:
        if (this.FH.isLessonFinished(r7) == false) goto L9;
        return false;
    L9:
        java.util.Date r2 = r7.u7();     // Catch: java.lang.Throwable -> L17
        if (r2 != null) goto L12;
        return false;
    L12:
        if ((java.lang.System.currentTimeMillis() - r2.getTime()) >= 5184000000L) goto L24;
        return true;
    L24:
        return false;
    }

    public boolean Hw(java.lang.String r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 2841799028868229661L, this, r5);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2841799028868229661L, this, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (a8() == true) goto L12;
        if (r5.equals(com.aide.ui.U.SI().gn()) == true) goto L12;
        return false;
    L12:
        return true;
    }

    public java.lang.String J0() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4685608623446748529L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(4685608623446748529L, this);     // Catch: java.lang.Throwable -> L8
        return "😃";
    L15:
        return "😃";
    }

    public java.lang.String J8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -363189396013936128L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-363189396013936128L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return XL().Zo() + " " + this.FH.getCurrentExercise();
    }

    public void Mr() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2458703979415657192L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2458703979415657192L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.we = new com.aide.ui.trainer.g();     // Catch: java.lang.Throwable -> L8
        this.FH = new com.aide.ui.trainer.TrainerState();     // Catch: java.lang.Throwable -> L8
        ro();     // Catch: java.lang.Throwable -> L8
    }

    public void P8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1908818530852739697L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1908818530852739697L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.trainer.g r2 = this.we;     // Catch: java.lang.Throwable -> L8
        DW(com.aide.ui.trainer.g.FH(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_on_no_main, new java.lang.Object[0]));     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String QX() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 182088758479582395L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(182088758479582395L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (a8() == false) goto L13;
        if (XL().XL() <= 1) goto L13;
        return sh();
    L13:
        return XL().EQ();
    }

    public boolean U2() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 819639436931847903L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(819639436931847903L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (a8() == true) goto L11;
        if (VH().XL() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public com.aide.ui.trainer.g.d VH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4139394025199534303L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4139394025199534303L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return XL().j6(this.FH.getCurrentExercise());
    }

    public java.lang.String Ws() {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -5241255350026072251L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(-5241255350026072251L, this);     // Catch: java.lang.Throwable -> L17
    L8:
        if (a8() == false) goto L12;
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_continue, new java.lang.Object[0]) + " ≫";
    L12:
        if (a8() == false) goto L16;
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_next_lesson, new java.lang.Object[0]) + " ≫";
    L16:
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_next_exercise, new java.lang.Object[0]) + " ≫";
    }

    public com.aide.ui.trainer.g.C0053g XL() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -427051127252647107L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-427051127252647107L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return Zo().j6(this.FH.getCurrentLessonId());
    }

    public com.aide.ui.trainer.g.a Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2228772296004262476L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2228772296004262476L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0;
    }

    public boolean a8() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -8013026565454679496L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-8013026565454679496L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.J0 == null) goto L12;
        if (this.FH.getCurrentExercise() < (XL().XL() - 1)) goto L12;
        return true;
    L12:
        return false;
    }

    public com.aide.ui.trainer.g.c aM() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 137145965352559880L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(137145965352559880L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(this.we.DW());
    }

    public void ei() {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -2270217884116641840L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2270217884116641840L, this);     // Catch: java.lang.Throwable -> L19
    L6:
        this.v5 = new android.media.SoundPool(1, 3, 0);     // Catch: java.lang.Throwable -> L19
        this.Zo = this.v5.load(com.aide.ui.U.Zo(), com.almlkaide.kaypro.R.raw.fail, 1);     // Catch: java.lang.Throwable -> L19
        this.VH = this.v5.load(com.aide.ui.U.Zo(), com.almlkaide.kaypro.R.raw.success_task, 1);     // Catch: java.lang.Throwable -> L19
        this.gn = this.v5.load(com.aide.ui.U.Zo(), com.almlkaide.kaypro.R.raw.success_lesson, 1);     // Catch: java.lang.Throwable -> L19
        this.u7 = this.v5.load(com.aide.ui.U.Zo(), com.almlkaide.kaypro.R.raw.task, 1);     // Catch: java.lang.Throwable -> L19
        this.tp = this.v5.load(com.aide.ui.U.Zo(), com.almlkaide.kaypro.R.raw.click, 1);     // Catch: java.lang.Throwable -> L19
        vJ();     // Catch: java.lang.Throwable -> L19
        sG();     // Catch: java.lang.Throwable -> L19
        Sf();     // Catch: java.lang.Throwable -> L19
        if (com.aide.ui.U.ei().j6(com.aide.ui.U.Zo()) == false) goto L9;
        return;
    L9:
        if (this.FH.getCurrentExercise() != 0) goto L12;
        Mz();     // Catch: java.lang.Throwable -> L19
    L12:
        if (com.aide.ui.aa.J8() == false) goto L15;
        this.EQ.j6(VH().Zo(), VH().J0());     // Catch: java.lang.Throwable -> L19
    L15:
        if (com.aide.ui.aa.J0() == false) goto L17;
        this.v5.play(this.u7, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L19
    L17:
        VH(XL());     // Catch: java.lang.Throwable -> L19
        ef();     // Catch: java.lang.Throwable -> L19
    }

    public void er() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1144511033390155389L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1144511033390155389L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (com.aide.ui.aa.J0() == false) goto L10;
        this.v5.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L13
    L10:
        if (com.aide.ui.aa.J8() == false) goto L20;
        this.EQ.j6(VH().Zo(), VH().we());     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void gW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2683701402349358475L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2683701402349358475L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        this.FH.retryCurrentExercise(VH().VH());     // Catch: java.lang.Throwable -> L11
        if (com.aide.ui.aa.J0() == false) goto L9;
        this.v5.play(this.u7, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L11
    L9:
        ef();     // Catch: java.lang.Throwable -> L11
        KD();     // Catch: java.lang.Throwable -> L11
    }

    public java.lang.String gn() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1813501239969789611L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1813501239969789611L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        java.lang.String r2 = v5(VH().j6());     // Catch: java.lang.Throwable -> L11
        if (r2.length() <= 0) goto L9;
        return r2;
    L9:
        return v5(XL().aM().j6().get(0));
    }

    public boolean j3() {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -5088538643881548856L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5088538643881548856L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.util.Iterator<com.aide.ui.trainer.g.c> r2 = DW().iterator();     // Catch: java.lang.Throwable -> L15
    L7:
        if (r2.hasNext() == false) goto L13;
        if (r2.next().J8() == false) goto L7;
        return true;
    L13:
        return false;
    }

    public com.aide.ui.trainer.g.c j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1203560506763507463L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1203560506763507463L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.we.DW(r5);
    }

    public java.lang.String j6(com.aide.ui.trainer.g.i r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2291013002263669848L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2291013002263669848L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(this.FH.getLessonAverageFailures(r5));
    }

    public void j6() {
    L48:
        th = move-exception;
        if (DW == false) goto L52;
        abcd.wu.j6(th, 2765494414872263767L, this);
    L52:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2765494414872263767L, this);     // Catch: java.lang.Throwable -> L48
    L6:
        abcd.Nk r2 = com.aide.ui.U.er();     // Catch: java.lang.Throwable -> L48
        if (U2() == true) goto L9;
        boolean r3 = true;
    L10:
        r2.j6(r3);     // Catch: java.lang.Throwable -> L48
        if (SI() == true) goto L13;
        return;
    L13:
        if (VH().Ws() == false) goto L18;
        if (com.aide.ui.U.lg().J8().Hw(gn()) == false) goto L18;
        com.aide.ui.trainer.g r4 = this.we;     // Catch: java.lang.Throwable -> L48
        DW(com.aide.ui.trainer.g.FH(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_on_arrow_pending, new java.lang.Object[0]));     // Catch: java.lang.Throwable -> L48
        return;
    L18:
        if (U2() == false) goto L21;
        abcd.F.j6("Exercise was run: " + com.aide.ui.U.SI().J8());     // Catch: java.lang.Throwable -> L48
        this.FH.runCurrentExercise();     // Catch: java.lang.Throwable -> L48
        com.aide.ui.U.er().j6(false, false);     // Catch: java.lang.Throwable -> L48
        com.aide.ui.U.vy().j6(false);     // Catch: java.lang.Throwable -> L48
        return;
    L21:
        if (dx() == false) goto L24;
        com.aide.ui.U.U2().j6(com.aide.ui.U.lg(), 14, com.almlkaide.kaypro.R.string.shop_feature_lessons_and_updates, "continueToNextLessonInCourse:" + Zo().v5(), false);     // Catch: java.lang.Throwable -> L48
        return;
    L24:
        if ((this.FH.getCurrentExercise() + 1) < XL().XL()) goto L31;
        if (XL().J0() == false) goto L31;
        if (this.FH.exerciseHasRun() == true) goto L31;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_next_lesson, new java.lang.Object[0]), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_next_lesson_no_changes_message, new java.lang.Object[0]), new abcd.Runnablezl(this), null, null);     // Catch: java.lang.Throwable -> L48
        return;
    L31:
        if ((this.FH.getCurrentExercise() + 1) < XL().XL()) goto L40;
        if (XL().J8() == false) goto L40;
        if (com.aide.common.ClassG.j6() == true) goto L40;
        if (com.aide.common.ClassG.J8(com.aide.ui.U.Zo()) == true) goto L40;
        com.aide.ui.U.lg().j6(com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_rate_title, new java.lang.Object[0]), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_rate_message, new java.lang.Object[0]), new abcd.RunnableAl(this));     // Catch: java.lang.Throwable -> L48
        return;
    L40:
        if ((this.FH.getCurrentExercise() + 1) >= XL().XL()) goto L42;
    L46:
        nw();     // Catch: java.lang.Throwable -> L48
        return;
    L42:
        if (XL().Ws() == false) goto L46;
        if (com.aide.common.ClassG.J8(com.aide.ui.U.Zo()) == true) goto L46;
        com.aide.common.Wa.DW(com.aide.ui.U.lg(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_share_title, new java.lang.Object[0]), com.aide.ui.U.Zo().getResources().getString(com.almlkaide.kaypro.R.string.trainer_share_message, new java.lang.Object[]{XL().DW().Ws(), FH()}), "https://play.google.com/store/apps/details?id=" + com.aide.ui.U.j6, new abcd.RunnableBl(this));     // Catch: java.lang.Throwable -> L48
        return;
    L9:
        r3 = false;
        goto L10
    }

    public void j6(com.aide.ui.trainer.g.i r8, boolean r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -2041320215581811985L, this, r8, new java.lang.Boolean(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2041320215581811985L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L17
    L5:
        if (r9 == false) goto L9;
        this.FH.restartLesson(r8);     // Catch: java.lang.Throwable -> L17
        abcd.Vl.FH(Zo(r8));     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L17
    L9:
        if (com.aide.ui.U.dx() == true) goto L11;
        com.aide.ui.U.lg().j6(true, null, r8);     // Catch: java.lang.Throwable -> L17
        return;
    L11:
        if (r8.DW().equals(this.J0) == true) goto L13;
        this.FH.startLesson(r8.Zo());     // Catch: java.lang.Throwable -> L17
        sG();     // Catch: java.lang.Throwable -> L17
    L14:
        g3();     // Catch: java.lang.Throwable -> L17
        return;
    L13:
        this.FH.startLesson(r8.Zo());     // Catch: java.lang.Throwable -> L17
        goto L14
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 432709067178279960L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(432709067178279960L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.U.ei().j6(r8, r9, v5(com.aide.ui.U.SI().VH().QX()));     // Catch: java.lang.Throwable -> L7
    }

    public boolean lg() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2744754385154578275L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2744754385154578275L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if (XL().aM().j6().size() > 1) goto L19;
        return false;
    L19:
        return true;
    }

    public void nw() {
    L40:
        th = move-exception;
        if (DW == false) goto L44;
        abcd.wu.j6(th, 3409426862746623795L, this);
    L44:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(3409426862746623795L, this);     // Catch: java.lang.Throwable -> L40
    L7:
        if (dx() == false) goto L10;
        com.aide.ui.activities.TrainerCourseActivity.j6(com.aide.ui.U.lg());     // Catch: java.lang.Throwable -> L40
        return;
    L10:
        boolean r3 = true;
        if ((this.FH.getCurrentExercise() + 1) < XL().XL()) goto L17;
        com.aide.ui.trainer.g.i r2 = cb();     // Catch: java.lang.Throwable -> L40
        if (r2 != null) goto L15;
        com.aide.ui.activities.TrainerCourseActivity.j6(com.aide.ui.U.lg());     // Catch: java.lang.Throwable -> L40
        return;
    L15:
        this.FH.startLesson(r2.Zo());     // Catch: java.lang.Throwable -> L40
        g3();     // Catch: java.lang.Throwable -> L40
        return;
    L17:
        if (VH().XL() == false) goto L19;
    L22:
        this.FH.startNextExercise();     // Catch: java.lang.Throwable -> L40
        if (a8() == false) goto L28;
        this.FH.setLessonFinished(XL());     // Catch: java.lang.Throwable -> L40
        com.aide.ui.trainer.g.i r4 = cb();     // Catch: java.lang.Throwable -> L40
        if (r4 == null) goto L28;
        VH(r4);     // Catch: java.lang.Throwable -> L40
    L28:
        if (com.aide.ui.aa.J8() == false) goto L31;
        this.EQ.j6(VH().Zo(), VH().J0());     // Catch: java.lang.Throwable -> L40
    L31:
        if (com.aide.ui.aa.J0() == true) goto L33;
    L38:
        Mz();     // Catch: java.lang.Throwable -> L40
        ef();     // Catch: java.lang.Throwable -> L40
        return;
    L33:
        if (a8() == false) goto L35;
        this.v5.play(this.gn, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L40
        goto L38
    L35:
        if (r3 == false) goto L37;
        this.v5.play(this.u7, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L40
        goto L38
    L37:
        this.v5.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L40
        goto L38
    L19:
        if (VH().Ws() == true) goto L22;
        r3 = false;
        goto L22
    }

    public void rN() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -5526928088599104513L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5526928088599104513L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (com.aide.ui.aa.J0() == false) goto L17;
        this.v5.play(this.tp, 1.0f, 1.0f, 0, 0, 1.0f);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public java.lang.String tp() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 651315505720976280L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(651315505720976280L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return "≪ " + com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_try_again, new java.lang.Object[0]);
    }

    public java.lang.String u7() {
    L22:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -4601583008072817411L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(-4601583008072817411L, this);     // Catch: java.lang.Throwable -> L22
    L8:
        if (a8() == false) goto L12;
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_next_lesson, new java.lang.Object[0]) + " ≫";
    L12:
        if (U2() == false) goto L21;
        java.lang.String r2 = com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_run, new java.lang.Object[0]);     // Catch: java.lang.Throwable -> L22
        if (this.FH.getCurrentExercise() != 0) goto L19;
        if (com.aide.common.ClassG.EQ(com.aide.ui.U.Zo()) == false) goto L19;
        r2 = r2 + " (Ctrl+E)";     // Catch: java.lang.Throwable -> L22
    L19:
        return r2 + " ►";
    L21:
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_continue, new java.lang.Object[0]) + " ≫";
    }

    public java.lang.String v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 940941469614118917L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(940941469614118917L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.we.j6();
    }

    public void v5(com.aide.ui.trainer.g.i r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 461916871079086320L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(461916871079086320L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.startLesson(r5.Zo());     // Catch: java.lang.Throwable -> L8
    }

    public void vy() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1705638444776746968L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1705638444776746968L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.trainer.g r2 = this.we;     // Catch: java.lang.Throwable -> L8
        DW(com.aide.ui.trainer.g.FH(), com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_on_build_errors, new java.lang.Object[0]));     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String we() {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 193662543770432625L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(193662543770432625L, this);     // Catch: java.lang.Throwable -> L19
    L7:
        if (this.J0 != null) goto L11;
        return null;
    L11:
        if (a8() == true) goto L18;
        if (VH().XL() == true) goto L18;
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_continue, new java.lang.Object[0]);
    L18:
        return com.aide.ui.U.j6(com.almlkaide.kaypro.R.string.trainer_run, new java.lang.Object[0]);
    }

    public void yS() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1672184826102862751L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1672184826102862751L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.restartLesson(XL());     // Catch: java.lang.Throwable -> L8
        g3();     // Catch: java.lang.Throwable -> L8
    }
}
