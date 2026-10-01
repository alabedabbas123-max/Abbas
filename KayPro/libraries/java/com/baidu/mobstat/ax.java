package com.baidu.mobstat;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.ListFragment;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.webkit.WebViewFragment;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.VideoView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import java.util.HashMap;
import java.util.Locale;

public class ax {

    private static final ax f4275b = new ax();

    private HashMap<String, String> f4276a = new HashMap<>();

    public static ax m6268a() {
        return f4275b;
    }

    private ax() {
        m6271b();
    }

    private void m6270a(Throwable th) {
        if (bg.m6342c().mo6306b()) {
            bg.m6342c().m6303b(th.toString());
        }
    }

    private void m6271b() {
        if (android.os.Build.VERSION.SDK_INT >= 14 && this.f4276a.size() == 0) {
            try {
                m6269a(AutoCompleteTextView.class.getSimpleName(), "A0");
            } catch (Throwable th) {
                m6270a(th);
            }
            try {
                m6269a(ActionBar.class.getSimpleName(), "A1");
            } catch (Throwable th2) {
                m6270a(th2);
            }
            try {
                m6269a(AlertDialog.class.getSimpleName(), "A2");
            } catch (Throwable th3) {
                m6270a(th3);
            }
            try {
                m6269a(Button.class.getSimpleName(), "B0");
            } catch (Throwable th4) {
                m6270a(th4);
            }
            try {
                m6269a(CheckBox.class.getSimpleName(), "C0");
            } catch (Throwable th5) {
                m6270a(th5);
            }
            try {
                m6269a(CheckedTextView.class.getSimpleName(), "C1");
            } catch (Throwable th6) {
                m6270a(th6);
            }
            try {
                m6269a(Class.forName("com.android.internal.policy.DecorView").getSimpleName(), "D0");
            } catch (Throwable th7) {
                m6270a(th7);
            }
            try {
                m6269a(DrawerLayout.class.getSimpleName(), "D1");
            } catch (Throwable th8) {
                m6270a(th8);
            }
            try {
                m6269a(EditText.class.getSimpleName(), "E0");
            } catch (Throwable th9) {
                m6270a(th9);
            }
            try {
                m6269a(ExpandableListView.class.getSimpleName(), "E1");
            } catch (Throwable th10) {
                m6270a(th10);
            }
            try {
                m6269a(FrameLayout.class.getSimpleName(), "F0");
            } catch (Throwable th11) {
                m6270a(th11);
            }
            try {
                m6269a(Fragment.class.getSimpleName(), "F1");
            } catch (Throwable th12) {
                m6270a(th12);
            }
            try {
                m6269a(Gallery.class.getSimpleName(), "G0");
            } catch (Throwable th13) {
                m6270a(th13);
            }
            try {
                m6269a(GridView.class.getSimpleName(), "G1");
            } catch (Throwable th14) {
                m6270a(th14);
            }
            try {
                m6269a(HorizontalScrollView.class.getSimpleName(), "H0");
            } catch (Throwable th15) {
                m6270a(th15);
            }
            try {
                m6269a(ImageButton.class.getSimpleName(), "I0");
            } catch (Throwable th16) {
                m6270a(th16);
            }
            try {
                m6269a(ImageSwitcher.class.getSimpleName(), "I1");
            } catch (Throwable th17) {
                m6270a(th17);
            }
            try {
                m6269a(ImageView.class.getSimpleName(), "I2");
            } catch (Throwable th18) {
                m6270a(th18);
            }
            try {
                m6269a(LinearLayout.class.getSimpleName(), "L0");
            } catch (Throwable th19) {
                m6270a(th19);
            }
            try {
                m6269a(ListView.class.getSimpleName(), "L1");
            } catch (Throwable th20) {
                m6270a(th20);
            }
            try {
                m6269a(ListFragment.class.getSimpleName(), "L2");
            } catch (Throwable th21) {
                m6270a(th21);
            }
            try {
                m6269a(MultiAutoCompleteTextView.class.getSimpleName(), "M0");
            } catch (Throwable th22) {
                m6270a(th22);
            }
            try {
                m6269a(NestedScrollView.class.getSimpleName(), "N0");
            } catch (Throwable th23) {
                m6270a(th23);
            }
            try {
                m6269a(ProgressBar.class.getSimpleName(), "P0");
            } catch (Throwable th24) {
                m6270a(th24);
            }
            try {
                m6269a(RadioButton.class.getSimpleName(), "R0");
            } catch (Throwable th25) {
                m6270a(th25);
            }
            try {
                m6269a(RadioGroup.class.getSimpleName(), "R1");
            } catch (Throwable th26) {
                m6270a(th26);
            }
            try {
                m6269a(RatingBar.class.getSimpleName(), "R2");
            } catch (Throwable th27) {
                m6270a(th27);
            }
            try {
                m6269a(RelativeLayout.class.getSimpleName(), "R3");
            } catch (Throwable th28) {
                m6270a(th28);
            }
            try {
                m6269a(RecyclerView.class.getSimpleName(), "R4");
            } catch (Throwable th29) {
                m6270a(th29);
            }
            try {
                m6269a(ScrollView.class.getSimpleName(), "S0");
            } catch (Throwable th30) {
                m6270a(th30);
            }
            try {
                m6269a(SearchView.class.getSimpleName(), "S1");
            } catch (Throwable th31) {
                m6270a(th31);
            }
            try {
                m6269a(SeekBar.class.getSimpleName(), "S2");
            } catch (Throwable th32) {
                m6270a(th32);
            }
            try {
                m6269a(Spinner.class.getSimpleName(), "S3");
            } catch (Throwable th33) {
                m6270a(th33);
            }
            try {
                m6269a(Switch.class.getSimpleName(), "S4");
            } catch (Throwable th34) {
                m6270a(th34);
            }
            try {
                m6269a(SurfaceView.class.getSimpleName(), "S5");
            } catch (Throwable th35) {
                m6270a(th35);
            }
            try {
                m6269a(SwipeRefreshLayout.class.getSimpleName(), "S6");
            } catch (Throwable th36) {
                m6270a(th36);
            }
            try {
                m6269a(TabHost.class.getSimpleName(), "T0");
            } catch (Throwable th37) {
                m6270a(th37);
            }
            try {
                m6269a(TableLayout.class.getSimpleName(), "T1");
            } catch (Throwable th38) {
                m6270a(th38);
            }
            try {
                m6269a(TableRow.class.getSimpleName(), "T2");
            } catch (Throwable th39) {
                m6270a(th39);
            }
            try {
                m6269a(TabWidget.class.getSimpleName(), "T3");
            } catch (Throwable th40) {
                m6270a(th40);
            }
            try {
                m6269a(TextSwitcher.class.getSimpleName(), "T4");
            } catch (Throwable th41) {
                m6270a(th41);
            }
            try {
                m6269a(TextView.class.getSimpleName(), "T5");
            } catch (Throwable th42) {
                m6270a(th42);
            }
            try {
                m6269a(Toast.class.getSimpleName(), "T6");
            } catch (Throwable th43) {
                m6270a(th43);
            }
            try {
                m6269a(ToggleButton.class.getSimpleName(), "T7");
            } catch (Throwable th44) {
                m6270a(th44);
            }
            try {
                m6269a(TextureView.class.getSimpleName(), "T8");
            } catch (Throwable th45) {
                m6270a(th45);
            }
            try {
                m6269a(Toolbar.class.getSimpleName(), "T9");
            } catch (Throwable th46) {
                m6270a(th46);
            }
            try {
                m6269a(View.class.getSimpleName(), "V0");
            } catch (Throwable th47) {
                m6270a(th47);
            }
            try {
                m6269a(ViewGroup.class.getSimpleName(), "V1");
            } catch (Throwable th48) {
                m6270a(th48);
            }
            try {
                m6269a(ViewStub.class.getSimpleName(), "V2");
            } catch (Throwable th49) {
                m6270a(th49);
            }
            try {
                m6269a(VideoView.class.getSimpleName(), "V3");
            } catch (Throwable th50) {
                m6270a(th50);
            }
            try {
                m6269a(ViewSwitcher.class.getSimpleName(), "V4");
            } catch (Throwable th51) {
                m6270a(th51);
            }
            try {
                m6269a(ViewFlipper.class.getSimpleName(), "V5");
            } catch (Throwable th52) {
                m6270a(th52);
            }
            try {
                m6269a(ViewPager.class.getSimpleName(), "V6");
            } catch (Throwable th53) {
                m6270a(th53);
            }
            try {
                m6269a(WebView.class.getSimpleName(), "W0");
            } catch (Throwable th54) {
                m6270a(th54);
            }
            try {
                m6269a(WebViewFragment.class.getSimpleName(), "W1");
            } catch (Throwable th55) {
                m6270a(th55);
            }
        }
    }

    private void m6269a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !this.f4276a.containsKey(str)) {
            this.f4276a.put(str, str2.toUpperCase(Locale.ENGLISH));
        }
    }

    public String m6272a(String str) {
        return this.f4276a.get(str);
    }
}
