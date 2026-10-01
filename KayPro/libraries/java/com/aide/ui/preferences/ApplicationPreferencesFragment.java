package com.aide.ui.preferences;

@abcd.Interfacexu
public class ApplicationPreferencesFragment extends android.preference.PreferenceFragment {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.preferences.ApplicationPreferencesFragment.class, 230817748208512656L, 230817748208512656L);
    }

    public ApplicationPreferencesFragment() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1444530355192513143L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1444530355192513143L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    public void onCreate(android.os.Bundle r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-383039771141114748L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onCreate(r10);     // Catch: java.lang.Throwable -> L8
        addPreferencesFromResource(com.almlkaide.kaypro.R.xml.preferences_application);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -383039771141114748L, this, r10);
    L12:
        throw th;
    }
}
