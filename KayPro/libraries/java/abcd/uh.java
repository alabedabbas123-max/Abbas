package abcd;

@abcd.Interfacexu
public class uh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -1303651809497087244L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -3729163413621129048L)
    private boolean tp;

    @abcd.Interfaceru(field = 905728849216926512L)
    private boolean u7;

    @abcd.Interfacexu
    private static class a extends android.widget.BaseExpandableListAdapter {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1323341255948861380L)
        private java.util.List<java.util.List<abcd.Sk.a>> FH;

        @abcd.Interfaceru(field = -388402737878013984L)
        private android.content.Context Hw;

        static {
            abcd.wu.j6(abcd.uh.a.class, 2026413306719904496L, 2026413306719904496L);
        }

        @abcd.Interfacesu(method = 20211823486828795L)
        public a(android.content.Context r8, java.util.List<java.util.List<abcd.Sk.a>> r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -232176595782541683L, null, r8, r9);
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-232176595782541683L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.Hw = r8;
                            this.FH = r9;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 105767470024301760L)
        private boolean DW(int r5) {
            java.lang.String r2 = null;
            com.aide.ui.trainer.g.c r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 13: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 17; continue $sw1; }
                        abcd.wu.j6(th, -1796781481611885296L, this, new java.lang.Integer(r5));
                        $pc1 = 17; continue $sw1;
                    }
                    case 17: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-1796781481611885296L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 13; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            r2 = j6(r5);
                            r3 = com.aide.ui.U.SI().j6(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 13; continue $sw1;
                        }
                        if (r3 == null) { $pc1 = 11; continue $sw1; }
                        if (r3.EQ() <= 0) { $pc1 = 11; continue $sw1; }
                        return true;
                    }
                    case 11: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 794793089487503848L)
        public java.lang.Object getChild(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 7: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 11; continue $sw2; }
                        abcd.wu.j6(th, 368494523357027872L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(368494523357027872L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 7; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        return this.FH.get(r8).get(r9);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 701830187821444539L)
        public long getChildId(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 3;
            $sw3: while (true) {
                switch ($pc3) {
                    case 7: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 11; continue $sw3; }
                        abcd.wu.j6(th, -1408382048191777725L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc3 = 11; continue $sw3;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc3 = 14; continue $sw3; }
                        try {
                            abcd.wu.j6(-1408382048191777725L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 7; continue $sw3;
                        }
                        return 0;
                    }
                    case 14: {
                        return 0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 6364351508466026088L)
        public android.view.View getChildView(int r17, int r18, boolean r19, android.view.View r20, android.view.ViewGroup r21) {
            android.view.View r1 = null;
            android.widget.TextView r2 = null;
            android.widget.TextView r3 = null;
            android.widget.ImageView r4 = null;
            float r7 = 0.0f;
            abcd.Sk.a r0 = null;
            float r6 = 0.0f;
            abcd.Sk.a r5 = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 26: {
                        th = th;
                        $pc4 = 29; continue $sw4;
                    }
                    case 29: {
                        if (DW == false) { $pc4 = 31; continue $sw4; }
                        abcd.wu.j6(th, -488028546869095920L, this, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Boolean(r19), r20, r21);
                        $pc4 = 31; continue $sw4;
                    }
                    case 31: {
                        throw th;
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 7; continue $sw4; }
                        try {
                            abcd.wu.j6(-488028546869095920L, this, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Boolean(r19), r20, r21);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 26; continue $sw4;
                        }
                        $pc4 = 7; continue $sw4;
                    }
                    case 7: {
                        if (r20 != null) { $pc4 = 11; continue $sw4; }
                        try {
                            r1 = android.view.LayoutInflater.from(this.Hw).inflate(com.almlkaide.kaypro.R.layout.createproject_entry, r21, false);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 24; continue $sw4;
                        }
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        try {
                            r2 = (android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.projecttypeEntryLabel);
                            r3 = (android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.projecttypeEntryDescription);
                            r4 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.projecttypeEntryImage);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 24; continue $sw4;
                        }
                        r7 = 0.5f;
                        if (j6(r17, r18) == false) { $pc4 = 19; continue $sw4; }
                        try {
                            r0 = (abcd.Sk.a) getChild(r17, 0);
                            r2.setText(com.almlkaide.kaypro.R.string.dialog_create_project_samples);
                            r3.setVisibility(8);
                            r4.setImageResource(r0.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 24; continue $sw4;
                        }
                        if (r0.VH.tp == false) { $pc4 = 17; continue $sw4; }
                        r6 = 1.0f;
                        $pc4 = 18; continue $sw4;
                    }
                    case 18: {
                        try {
                            r4.setAlpha(r6);
                            r2.setAlpha(r6);
                            r3.setAlpha(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 24; continue $sw4;
                        }
                        $pc4 = 23; continue $sw4;
                    }
                    case 23: {
                        return r1;
                    }
                    case 17: {
                        r6 = 0.5f;
                        { $pc4 = 18; continue $sw4; }
                    }
                    case 19: {
                        try {
                            r5 = (abcd.Sk.a) getChild(r17, r18);
                            r2.setText(this.Hw.getResources().getString(com.almlkaide.kaypro.R.string.dialog_create_project_new, new java.lang.Object[]{r5.DW}));
                            r3.setVisibility(0);
                            r3.setText(r5.VH.FH);
                            r4.setImageResource(r5.Zo);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 24; continue $sw4;
                        }
                        if (r5.VH.tp == false) { $pc4 = 22; continue $sw4; }
                        r7 = 1.0f;
                        $pc4 = 22; continue $sw4;
                    }
                    case 22: {
                        try {
                            r4.setAlpha(r7);
                            r2.setAlpha(r7);
                            r3.setAlpha(r7);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 24; continue $sw4;
                        }
                        $pc4 = 11; continue $sw4;
                    }
                    case 24: {
                        th = th;
                        { $pc4 = 29; continue $sw4; }
                    }
                    case 11: {
                        r1 = r20;
                        { $pc4 = 12; continue $sw4; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 1000857738434594715L)
        public int getChildrenCount(int r5) {
            int r2 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 9: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 13; continue $sw5; }
                        abcd.wu.j6(th, -4019972520800585109L, this, new java.lang.Integer(r5));
                        $pc5 = 13; continue $sw5;
                    }
                    case 13: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(-4019972520800585109L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 9; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        try {
                            r2 = this.FH.get(r5).size();
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 9; continue $sw5;
                        }
                        return r2 + (DW(r5) ? 1 : 0);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 1677372005865966600L)
        public java.lang.Object getGroup(int r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 8: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 12; continue $sw6; }
                        abcd.wu.j6(th, 253952695918904880L, this, new java.lang.Integer(r5));
                        $pc6 = 12; continue $sw6;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(253952695918904880L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        return this.FH.get(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -191806811955904288L)
        public int getGroupCount() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 8: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 12; continue $sw7; }
                        abcd.wu.j6(th, -3784194374910977664L, this);
                        $pc7 = 12; continue $sw7;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(-3784194374910977664L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 8; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        return this.FH.size();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -1809210473980745155L)
        public long getGroupId(int r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 4;
            $sw8: while (true) {
                switch ($pc8) {
                    case 8: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 12; continue $sw8; }
                        abcd.wu.j6(th, 828266266863184149L, this, new java.lang.Integer(r5));
                        $pc8 = 12; continue $sw8;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc8 = 7; continue $sw8; }
                        try {
                            abcd.wu.j6(828266266863184149L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 8; continue $sw8;
                        }
                        $pc8 = 7; continue $sw8;
                    }
                    case 7: {
                        return r5;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 3385462561184511360L)
        public android.view.View getGroupView(int r10, boolean r11, android.view.View r12, android.view.ViewGroup r13) {
            android.view.View r1 = null;
            abcd.Sk.a r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 3;
            $sw9: while (true) {
                switch ($pc9) {
                    case 11: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 15; continue $sw9; }
                        abcd.wu.j6(th, -65666186829364800L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);
                        $pc9 = 15; continue $sw9;
                    }
                    case 15: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(-65666186829364800L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 11; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        if (r12 != null) { $pc9 = 8; continue $sw9; }
                        try {
                            r1 = android.view.LayoutInflater.from(this.Hw).inflate(com.almlkaide.kaypro.R.layout.designer_widgetlist_group, r13, false);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 11; continue $sw9;
                        }
                        $pc9 = 9; continue $sw9;
                    }
                    case 9: {
                        try {
                            r0 = (abcd.Sk.a) getChild(r10, 0);
                            ((android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.widgetlistGroupName)).setText(r0.VH.v5);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 11; continue $sw9;
                        }
                        return r1;
                    }
                    case 8: {
                        r1 = r12;
                        { $pc9 = 9; continue $sw9; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 894621544398910285L)
        public boolean hasStableIds() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = 4;
            $sw10: while (true) {
                switch ($pc10) {
                    case 8: {
                        th = $ex10;
                        if (DW == false) { $pc10 = 12; continue $sw10; }
                        abcd.wu.j6(th, 2459711750389013565L, this);
                        $pc10 = 12; continue $sw10;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc10 = 15; continue $sw10; }
                        try {
                            abcd.wu.j6(2459711750389013565L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 8; continue $sw10;
                        }
                        return true;
                    }
                    case 15: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 1008571414591972456L)
        public boolean isChildSelectable(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = 3;
            $sw11: while (true) {
                switch ($pc11) {
                    case 7: {
                        th = $ex11;
                        if (DW == false) { $pc11 = 11; continue $sw11; }
                        abcd.wu.j6(th, -380257288707059008L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc11 = 11; continue $sw11;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc11 = 14; continue $sw11; }
                        try {
                            abcd.wu.j6(-380257288707059008L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 7; continue $sw11;
                        }
                        return true;
                    }
                    case 14: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 327129985347280115L)
        public java.lang.String j6(int r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = 4;
            $sw12: while (true) {
                switch ($pc12) {
                    case 8: {
                        th = $ex12;
                        if (DW == false) { $pc12 = 12; continue $sw12; }
                        abcd.wu.j6(th, -3273323525592575765L, this, new java.lang.Integer(r5));
                        $pc12 = 12; continue $sw12;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc12 = 6; continue $sw12; }
                        try {
                            abcd.wu.j6(-3273323525592575765L, this, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 8; continue $sw12;
                        }
                        $pc12 = 6; continue $sw12;
                    }
                    case 6: {
                        return this.FH.get(r5).get(0).VH.we;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 4718231339956844395L)
        public boolean j6(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = 3;
            $sw13: while (true) {
                switch ($pc13) {
                    case 12: {
                        th = $ex13;
                        if (DW == false) { $pc13 = 16; continue $sw13; }
                        abcd.wu.j6(th, 1312911586431383235L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc13 = 16; continue $sw13;
                    }
                    case 16: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc13 = 6; continue $sw13; }
                        try {
                            abcd.wu.j6(1312911586431383235L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 12; continue $sw13;
                        }
                        $pc13 = 6; continue $sw13;
                    }
                    case 6: {
                        if (DW(r8) == false) { $pc13 = 10; continue $sw13; }
                        if (r9 != this.FH.get(r8).size()) { $pc13 = 10; continue $sw13; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(abcd.uh.class, -465475316197143384L, -465475316197143384L);
    }

    public uh(java.lang.String r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 3;
        $sw14: while (true) {
            switch ($pc14) {
                case 7: {
                    th = $ex14;
                    if (VH == false) { $pc14 = 11; continue $sw14; }
                    abcd.wu.j6(th, -347134879684751796L, null, r8, new java.lang.Boolean(r9));
                    $pc14 = 11; continue $sw14;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc14 = 5; continue $sw14; }
                    try {
                        abcd.wu.j6(-347134879684751796L, null, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 7; continue $sw14;
                    }
                    $pc14 = 5; continue $sw14;
                }
                case 5: {
                    try {
                        this.tp = true;
                        this.gn = r8;
                        this.u7 = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 7; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String DW(abcd.uh r0) {
        return r0.gn;
    }

    static void j6(abcd.uh r0) {
        r0.v5();
    }

    static boolean j6(abcd.uh r0, boolean r1) {
        r0.tp = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 2974001686858122248L)
    private void v5() {
        java.util.HashMap r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 14: {
                    th = $ex15;
                    if (VH == false) { $pc15 = 18; continue $sw15; }
                    abcd.wu.j6(th, -719671444291015088L, this);
                    $pc15 = 18; continue $sw15;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(-719671444291015088L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (this.u7 == false) { $pc15 = 21; continue $sw15; }
                    try {
                        r2 = new java.util.HashMap();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    if (this.tp == false) { $pc15 = 11; continue $sw15; }
                    r3 = "cancelled";
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    try {
                        r2.put("exit", r3);
                        abcd.F.j6("New user experience", r2);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    return;
                }
                case 11: {
                    r3 = "createContinued";
                    { $pc15 = 12; continue $sw15; }
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2888281673854544549L)
    protected android.app.Dialog j6(android.app.Activity r13) {
        android.app.AlertDialog.Builder r2 = null;
        java.util.List<java.util.List<abcd.Sk.a>> r9 = null;
        com.almlkaide.kaypro.widget.CustomExpandableListView r3 = null;
        abcd.uh.a r6 = null;
        android.app.AlertDialog r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (VH == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, 2218568292298826557L, this, r13);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(2218568292298826557L, this, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        r2 = new android.app.AlertDialog.Builder(r13);
                        r9 = com.aide.ui.U.gW().j6();
                        r3 = new com.almlkaide.kaypro.widget.CustomExpandableListView(r13);
                        r3.setCacheColorHint(0);
                        r6 = new abcd.uh.a(r13, r9);
                        r3.setAdapter(r6);
                        r2.setTitle(com.almlkaide.kaypro.R.string.dialog_create_project_title).setView(r3);
                        r2.setOnCancelListener(new abcd.DialogInterfaceOnCancelListenersh(this));
                        r4 = r2.create();
                        r3.setOnChildClickListener(new abcd.C1345th(this, r6, r4, r13, r9));
                        r3.expandGroup(0);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
