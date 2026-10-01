package com.aide.ui.preferences;

@abcd.Interfacexu
public class KeyBindingsPreferencesFragment extends android.app.Fragment {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.preferences.KeyBindingsPreferencesFragment.class, 341889297030401769L, 341889297030401769L);
    }

    public KeyBindingsPreferencesFragment() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1284392346574156664L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1284392346574156664L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    public void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(70204760242238336L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L8
        setHasOptionsMenu(true);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 70204760242238336L, this, r10);
    L12:
        throw th;
    }

    @Override
    public void onCreateOptionsMenu(android.view.Menu r8, android.view.MenuInflater r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3180673585439285775L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3180673585439285775L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        r9.inflate(com.almlkaide.kaypro.R.menu.keybindings_options_menu, r8);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1070520077919918032L, this, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1070520077919918032L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        return new com.aide.ui.preferences.KeyBindingsView(r10.getContext());
    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem r8) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1690813508373502719L, this, r8);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1690813508373502719L, this, r8);     // Catch: java.lang.Throwable -> L12
    L7:
        if (r8.getItemId() != com.almlkaide.kaypro.R.id.keybindingsMenuDefault) goto L11;
        com.aide.common.Abstractma.j6(getActivity(), "Reset Keybindings", "Really restore default keybindings? All changes will be lost.", new com.aide.ui.preferences.g(this), null);     // Catch: java.lang.Throwable -> L12
        return true;
    L11:
        return super.onOptionsItemSelected(r8);
    }
}
