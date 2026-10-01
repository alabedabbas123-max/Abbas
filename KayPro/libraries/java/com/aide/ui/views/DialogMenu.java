package com.aide.ui.views;

@abcd.Interfacexu
public class DialogMenu implements android.view.Menu {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 950457616112806032L)
    private java.util.List<com.aide.ui.views.DialogMenu.a> FH;

    @abcd.Interfaceru(field = -1045953239845000715L)
    private android.content.Context Hw;

    @abcd.Interfacexu
    public class a implements android.view.MenuItem {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 610041127288078615L)
        private int EQ;

        @abcd.Interfaceru(field = -2421605643268669232L)
        private java.lang.CharSequence FH;

        @abcd.Interfaceru(field = -3082666963465353440L)
        private int Hw;

        @abcd.Interfaceru(field = -1352166923671405491L)
        private android.graphics.drawable.Drawable VH;

        @abcd.Interfaceru(field = -2609892844521091440L)
        private int Zo;

        @abcd.Interfaceru(field = -1651885095145993925L)
        private android.view.SubMenu gn;

        @abcd.Interfaceru(field = 3619213748732327984L)
        private boolean tp;

        @abcd.Interfaceru(field = 3707470737727583931L)
        private boolean u7;

        @abcd.Interfaceru(field = 2691183503214111300L)
        private int v5;

        @abcd.Interfacevu
        final com.aide.ui.views.DialogMenu we;

        static {
            abcd.wu.j6(com.aide.ui.views.DialogMenu.a.class, -6288364252829554275L, -6288364252829554275L);
        }

        public a(com.aide.ui.views.DialogMenu r8, int r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 146308887958481112L, null, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(146308887958481112L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r8.j6().getResources().getString(r9);     // Catch: java.lang.Throwable -> L7
        }

        public a(com.aide.ui.views.DialogMenu r11, int r12, int r13, int r14, int r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 642817242701072437L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(642817242701072437L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r11;     // Catch: java.lang.Throwable -> L7
            this.v5 = r12;     // Catch: java.lang.Throwable -> L7
            this.Hw = r13;     // Catch: java.lang.Throwable -> L7
            this.Zo = r14;     // Catch: java.lang.Throwable -> L7
            this.FH = r11.j6().getResources().getString(r15);     // Catch: java.lang.Throwable -> L7
        }

        public a(com.aide.ui.views.DialogMenu r11, int r12, int r13, int r14, java.lang.CharSequence r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -3151033939095433709L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-3151033939095433709L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r11;     // Catch: java.lang.Throwable -> L7
            this.v5 = r12;     // Catch: java.lang.Throwable -> L7
            this.Hw = r13;     // Catch: java.lang.Throwable -> L7
            this.Zo = r14;     // Catch: java.lang.Throwable -> L7
            this.FH = r15.toString();     // Catch: java.lang.Throwable -> L7
        }

        public a(com.aide.ui.views.DialogMenu r8, java.lang.CharSequence r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -686068806637669884L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-686068806637669884L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9.toString();     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public boolean collapseActionView() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -205024884342355104L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-205024884342355104L, this);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }

        @Override
        public boolean expandActionView() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1622920215389269035L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(1622920215389269035L, this);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }

        @Override
        public android.view.ActionProvider getActionProvider() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -6141855384724901707L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-6141855384724901707L, this);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public android.view.View getActionView() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1825431732511245935L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-1825431732511245935L, this);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public char getAlphabeticShortcut() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2541166389762192855L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-2541166389762192855L, this);     // Catch: java.lang.Throwable -> L8
            return 0;
        L15:
            return 0;
        }

        @Override
        public int getGroupId() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1220676056017164152L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1220676056017164152L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5;
        }

        @Override
        public android.graphics.drawable.Drawable getIcon() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 3210668495917274179L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(3210668495917274179L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.VH;
        }

        @Override
        public android.content.Intent getIntent() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2533642457974337760L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-2533642457974337760L, this);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public int getItemId() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2232280962198742920L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2232280962198742920L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Hw;
        }

        @Override
        public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 3587107288865712183L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(3587107288865712183L, this);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public char getNumericShortcut() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1569746816617188485L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(1569746816617188485L, this);     // Catch: java.lang.Throwable -> L8
            return 0;
        L15:
            return 0;
        }

        @Override
        public int getOrder() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2634286192081728864L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2634286192081728864L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Zo;
        }

        @Override
        public android.view.SubMenu getSubMenu() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3977896503497484639L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3977896503497484639L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.gn;
        }

        @Override
        public java.lang.CharSequence getTitle() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2405018827291145684L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2405018827291145684L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH;
        }

        @Override
        public java.lang.CharSequence getTitleCondensed() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -4084303617243485559L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-4084303617243485559L, this);     // Catch: java.lang.Throwable -> L8
            return "";
        L15:
            return "";
        }

        @Override
        public boolean hasSubMenu() {
        L11:
            th = move-exception;
            if (DW == false) goto L15;
            abcd.wu.j6(th, -2385173042648059887L, this);
        L15:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2385173042648059887L, this);     // Catch: java.lang.Throwable -> L11
        L6:
            if (this.gn == null) goto L9;
            return true;
        L9:
            return false;
        }

        @Override
        public boolean isActionViewExpanded() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -4001634365971237044L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-4001634365971237044L, this);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }

        @Override
        public boolean isCheckable() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1258262111171184476L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(1258262111171184476L, this);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }

        @Override
        public boolean isChecked() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1256306867500006167L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(1256306867500006167L, this);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }

        @Override
        public boolean isEnabled() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1452353691282325605L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1452353691282325605L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.u7;
        }

        @Override
        public boolean isVisible() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1354140237691585876L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1354140237691585876L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.tp;
        }

        public void j6(android.view.SubMenu r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1117916151339113280L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1117916151339113280L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.gn = r5;     // Catch: java.lang.Throwable -> L8
        }

        @Override
        public android.view.MenuItem setActionProvider(android.view.ActionProvider r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 5537131145608082031L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(5537131145608082031L, this, r5);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public android.view.MenuItem setActionView(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -968988640773325744L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-968988640773325744L, this, r5);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public android.view.MenuItem setActionView(android.view.View r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -127163023113009120L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-127163023113009120L, this, r5);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public android.view.MenuItem setAlphabeticShortcut(char r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 51325240279536640L, this, new java.lang.Character(r5));
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(51325240279536640L, this, new java.lang.Character(r5));     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setCheckable(boolean r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1311560505891788047L, this, new java.lang.Boolean(r5));
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1311560505891788047L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setChecked(boolean r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1548076967187719820L, this, new java.lang.Boolean(r5));
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1548076967187719820L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setEnabled(boolean r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1779669381859764792L, this, new java.lang.Boolean(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1779669381859764792L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.u7 = r5;     // Catch: java.lang.Throwable -> L8
            return this;
        }

        @Override
        public android.view.MenuItem setIcon(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -268696238799592780L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-268696238799592780L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.EQ = r5;     // Catch: java.lang.Throwable -> L8
            return this;
        }

        @Override
        public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -392239431959041839L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-392239431959041839L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.VH = r5;     // Catch: java.lang.Throwable -> L8
            return this;
        }

        @Override
        public android.view.MenuItem setIntent(android.content.Intent r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1008670381923713184L, this, r5);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1008670381923713184L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setNumericShortcut(char r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -2473346990274019860L, this, new java.lang.Character(r5));
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2473346990274019860L, this, new java.lang.Character(r5));     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3471625298872939296L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-3471625298872939296L, this, r5);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 243020900502263799L, this, r5);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(243020900502263799L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setShortcut(char r8, char r9) {
        L6:
            th = move-exception;
            if (DW == false) goto L10;
            abcd.wu.j6(th, 2171390373296654396L, this, new java.lang.Character(r8), new java.lang.Character(r9));
        L10:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(2171390373296654396L, this, new java.lang.Character(r8), new java.lang.Character(r9));     // Catch: java.lang.Throwable -> L6
        L5:
            return this;
        }

        @Override
        public void setShowAsAction(int r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1447487711139797264L, this, new java.lang.Integer(r5));
        L11:
            throw th;
        L4:
            if (j6 == false) goto L14;
            abcd.wu.j6(-1447487711139797264L, this, r5);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @Override
        public android.view.MenuItem setShowAsActionFlags(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1640851424402441615L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-1640851424402441615L, this, r5);     // Catch: java.lang.Throwable -> L8
            return null;
        L15:
            return null;
        }

        @Override
        public android.view.MenuItem setTitle(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -450346138675719867L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-450346138675719867L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = this.we.j6().getResources().getString(r5);     // Catch: java.lang.Throwable -> L8
            return this;
        }

        @Override
        public android.view.MenuItem setTitle(java.lang.CharSequence r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -963636502608881361L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-963636502608881361L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = r5.toString();     // Catch: java.lang.Throwable -> L8
            return this;
        }

        @Override
        public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r5) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -51831353973335020L, this, r5);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-51831353973335020L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public android.view.MenuItem setVisible(boolean r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 839008293146959053L, this, new java.lang.Boolean(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(839008293146959053L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.tp = r5;     // Catch: java.lang.Throwable -> L8
            return this;
        }
    }

    @abcd.Interfacexu
    private class b extends com.aide.ui.views.DialogMenu implements android.view.SubMenu {

        @abcd.Interfaceuu
        private static boolean Zo;

        @abcd.Interfacetu
        private static boolean v5;

        @abcd.Interfaceru(field = 2715469240519943072L)
        private com.aide.ui.views.DialogMenu.a VH;

        @abcd.Interfacevu
        final com.aide.ui.views.DialogMenu gn;

        static {
            abcd.wu.j6(com.aide.ui.views.DialogMenu.b.class, -4739229968711374864L, -4739229968711374864L);
        }

        @abcd.Interfacesu(method = -4530058951967493113L)
        public b(com.aide.ui.views.DialogMenu r10, android.content.Context r11, com.aide.ui.views.DialogMenu r12, com.aide.ui.views.DialogMenu.a r13) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -500565934227649145L, null, r10, r11, r12, r13);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(-500565934227649145L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        L5:
            this.gn = r10;     // Catch: java.lang.Throwable -> L7
            super(r11);     // Catch: java.lang.Throwable -> L7
            this.VH = r13;     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 2070268512157065728L)
        public void clearHeader() {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -3845249464623996057L, this);
        L11:
            throw th;
        L4:
            if (v5 == false) goto L14;
            abcd.wu.j6(-3845249464623996057L, this);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @Override
        @abcd.Interfacesu(method = -2010096307082142819L)
        public android.view.MenuItem getItem() {
        L8:
            th = move-exception;
            if (Zo == false) goto L12;
            abcd.wu.j6(th, 763512804648026028L, this);
        L12:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(763512804648026028L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.VH;
        }

        @Override
        @abcd.Interfacesu(method = -2764476297307304089L)
        public android.view.SubMenu setHeaderIcon(int r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -2981835095295605476L, this, new java.lang.Integer(r5));
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-2981835095295605476L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        @abcd.Interfacesu(method = -3760768818211825800L)
        public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -3913934609727954243L, this, r5);
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-3913934609727954243L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        @abcd.Interfacesu(method = 3029511656601247360L)
        public android.view.SubMenu setHeaderTitle(int r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -1014483907925872879L, this, new java.lang.Integer(r5));
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-1014483907925872879L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        @abcd.Interfacesu(method = 861845748371803120L)
        public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -3042020279894482021L, this, r5);
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-3042020279894482021L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        @abcd.Interfacesu(method = 251846959060840275L)
        public android.view.SubMenu setHeaderView(android.view.View r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -963468701292098976L, this, r5);
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-963468701292098976L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        @abcd.Interfacesu(method = 445935161938255560L)
        public android.view.SubMenu setIcon(int r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 700845357475794057L, this, new java.lang.Integer(r5));
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(700845357475794057L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        @abcd.Interfacesu(method = 212647382294886639L)
        public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r5) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 491887153254017664L, this, r5);
        L11:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(491887153254017664L, this, r5);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.views.DialogMenu.class, -2809505318810692533L, -2809505318810692533L);
    }

    public DialogMenu(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -30117927948399253L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-30117927948399253L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        this.Hw = r6;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public android.view.MenuItem add(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5441939372991173885L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5441939372991173885L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.views.DialogMenu.a r2 = new com.aide.ui.views.DialogMenu.a(this, r5);     // Catch: java.lang.Throwable -> L8
        this.FH.add(r2);     // Catch: java.lang.Throwable -> L8
        return r2;
    }

    @Override
    public android.view.MenuItem add(int r10, int r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 482521709998468500L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(482521709998468500L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.views.DialogMenu.a r0 = new com.aide.ui.views.DialogMenu.a(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        this.FH.add(r0);     // Catch: java.lang.Throwable -> L7
        return r0;
    }

    @Override
    public android.view.MenuItem add(int r10, int r11, int r12, java.lang.CharSequence r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -716583459859228200L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-716583459859228200L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), r13);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.views.DialogMenu.a r0 = new com.aide.ui.views.DialogMenu.a(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        this.FH.add(r0);     // Catch: java.lang.Throwable -> L7
        return r0;
    }

    @Override
    public android.view.MenuItem add(java.lang.CharSequence r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2161974212842366511L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2161974212842366511L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.views.DialogMenu.a r2 = new com.aide.ui.views.DialogMenu.a(this, r5);     // Catch: java.lang.Throwable -> L8
        this.FH.add(r2);     // Catch: java.lang.Throwable -> L8
        return r2;
    }

    @Override
    public int addIntentOptions(int r6, int r7, int r8, android.content.ComponentName r9, android.content.Intent[] r10, android.content.Intent r11, int r12, android.view.MenuItem[] r13) {
        if (j6 == false) goto L5;
        abcd.wu.j6(-3790286692241185568L, this, new java.lang.Object[]{new java.lang.Integer(r6), new java.lang.Integer(r7), new java.lang.Integer(r8), r9, r10, r11, new java.lang.Integer(r12), r13});
    L5:
        return 0;
    }

    @Override
    public android.view.SubMenu addSubMenu(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -451304394020303856L, this, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-451304394020303856L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.views.DialogMenu.a r2 = new com.aide.ui.views.DialogMenu.a(this, r6);     // Catch: java.lang.Throwable -> L8
        this.FH.add(r2);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.views.DialogMenu.b r3 = new com.aide.ui.views.DialogMenu.b(this, this.Hw, this, r2);     // Catch: java.lang.Throwable -> L8
        r2.j6(r3);     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    @Override
    public android.view.SubMenu addSubMenu(int r10, int r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2150737970764992375L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2150737970764992375L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.views.DialogMenu.a r0 = new com.aide.ui.views.DialogMenu.a(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        this.FH.add(r0);     // Catch: java.lang.Throwable -> L7
        com.aide.ui.views.DialogMenu.b r1 = new com.aide.ui.views.DialogMenu.b(this, this.Hw, this, r0);     // Catch: java.lang.Throwable -> L7
        r0.j6(r1);     // Catch: java.lang.Throwable -> L7
        return r1;
    }

    @Override
    public android.view.SubMenu addSubMenu(int r10, int r11, int r12, java.lang.CharSequence r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2460569534860639527L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2460569534860639527L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), r13);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.views.DialogMenu.a r0 = new com.aide.ui.views.DialogMenu.a(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        this.FH.add(r0);     // Catch: java.lang.Throwable -> L7
        com.aide.ui.views.DialogMenu.b r1 = new com.aide.ui.views.DialogMenu.b(this, this.Hw, this, r0);     // Catch: java.lang.Throwable -> L7
        r0.j6(r1);     // Catch: java.lang.Throwable -> L7
        return r1;
    }

    @Override
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1342085990956929924L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1342085990956929924L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.views.DialogMenu.a r2 = new com.aide.ui.views.DialogMenu.a(this, r6);     // Catch: java.lang.Throwable -> L8
        this.FH.add(r2);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.views.DialogMenu.b r3 = new com.aide.ui.views.DialogMenu.b(this, this.Hw, this, r2);     // Catch: java.lang.Throwable -> L8
        r2.j6(r3);     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    @Override
    public void clear() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1096778422182798080L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1096778422182798080L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.clear();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void close() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1099209306246634855L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-1099209306246634855L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    public android.view.MenuItem findItem(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -10281512089683780L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-10281512089683780L, this, r5);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    public android.view.MenuItem getItem(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 542294225993115935L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(542294225993115935L, this, r5);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    public boolean hasVisibleItems() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3700111349343703235L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(3700111349343703235L, this);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    public boolean isShortcutKey(int r8, android.view.KeyEvent r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3613079513397015288L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(-3613079513397015288L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
        return false;
    L14:
        return false;
    }

    public android.content.Context j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1835251828084666892L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1835251828084666892L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    @Override
    public boolean performIdentifierAction(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5507486108656929511L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(-5507486108656929511L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        return false;
    L14:
        return false;
    }

    @Override
    public boolean performShortcut(int r9, android.view.KeyEvent r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 389961992503358849L, this, new java.lang.Integer(r9), r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(389961992503358849L, this, new java.lang.Integer(r9), r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
        return false;
    L14:
        return false;
    }

    @Override
    public void removeGroup(int r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1185186553053691251L, this, new java.lang.Integer(r5));
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-1185186553053691251L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    public void removeItem(int r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1514779519040223385L, this, new java.lang.Integer(r5));
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-1514779519040223385L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    public void setGroupCheckable(int r9, boolean r10, boolean r11) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -4069327885588639751L, this, new java.lang.Integer(r9), new java.lang.Boolean(r10), new java.lang.Boolean(r11));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-4069327885588639751L, this, new java.lang.Integer(r9), new java.lang.Boolean(r10), new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    public void setGroupEnabled(int r8, boolean r9) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -114440534078326945L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-114440534078326945L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    public void setGroupVisible(int r8, boolean r9) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 2443359318889654384L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(2443359318889654384L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    public void setQwertyMode(boolean r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 412563950906844375L, this, new java.lang.Boolean(r5));
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(412563950906844375L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    public int size() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1523087420015958952L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1523087420015958952L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.size();
    }
}
