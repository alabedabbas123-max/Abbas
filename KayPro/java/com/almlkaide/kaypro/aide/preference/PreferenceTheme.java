package com.almlkaide.kaypro.aide.preference;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;

public class PreferenceTheme extends Preference {

    private Switch f4965cb;
    private String[] items;

    public PreferenceTheme(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String[] strArr = new String[2];
        strArr[0] = Utils.isCN() ? AppTheme.THEME_DEFAULT : "Default";
        strArr[1] = Utils.isCN() ? AppTheme.THEME_INDIGO : "Indigo";
        this.items = strArr;
        init();
        setTitle(Utils.isCN() ? "软件主题" : "Theme");
    }

    private void init() {
        if (getSummary() == null) {
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i].equals(AdvancedSetting.getThemeName())) {
                    setSummary(this.items[i]);
                }
            }
        }
        setOnPreferenceClickListener(new AnonymousClass100000001(this));
    }

    class AnonymousClass100000001 implements Preference.OnPreferenceClickListener {
        private String[] items2 = {AppTheme.THEME_DEFAULT, AppTheme.THEME_INDIGO};
        private final PreferenceTheme this$0;

        AnonymousClass100000001(PreferenceTheme preferenceTheme) {
            this.this$0 = preferenceTheme;
        }

        @Override
        public boolean onPreferenceClick(Preference preference) {
            String themeName = AdvancedSetting.getThemeName();
            int i = 0;
            while (true) {
                if (i < this.items2.length) {
                    if (this.items2[i].equals(themeName)) {
                        break;
                    }
                    i++;
                } else {
                    i = 0;
                    break;
                }
            }
            new AlertDialog.Builder(this.this$0.getContext()).setTitle(preference.getTitle()).setSingleChoiceItems(this.this$0.items, i, new DialogInterface.OnClickListener(this) {
                private final AnonymousClass100000001 this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i2) {
                    String str = this.this$0.items2[i2];
                    if (str.equals(AdvancedSetting.getThemeName())) {
                        return;
                    }
                    AdvancedSetting.setTheme(str);
                    if (str.equals(AppTheme.THEME_INDIGO)) {
                        AIDEUtils.setIsLightTheme(false);
                        this.this$0.this$0.f4965cb.setChecked(true);
                        this.this$0.this$0.f4965cb.setEnabled(false);
                    } else {
                        this.this$0.this$0.f4965cb.setEnabled(true);
                    }
                    AIDEUtils.notifyThemeChanged();
                    this.this$0.this$0.setSummary(this.this$0.this$0.items[i2]);
                    dialogInterface.dismiss();
                    Toasty.success(Utils.isCN() ? "设置成功，返回生效！" : "Set successfully, return to effective!").show();
                }
            }).setPositiveButton(Utils.isCN() ? "关闭" : "Close", (DialogInterface.OnClickListener) null).create().show();
            return false;
        }
    }

    @Override
    public void onParentChanged(Preference preference, boolean z) {
        super.onParentChanged(preference, z);
    }

    @Override
    public void onDependencyChanged(Preference preference, boolean z) {
        super.onDependencyChanged(preference, z);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.widget_frame);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            int childCount = linearLayout.getChildCount();
            if (childCount > 0) {
                linearLayout.removeViews(0, childCount);
            }
            this.f4965cb = new Switch(getContext());
            this.f4965cb.setText(Utils.isCN() ? "夜间模式" : "Dark mode");
            this.f4965cb.setChecked(!AIDEUtils.isLightTheme());
            this.f4965cb.setFocusable(false);
            this.f4965cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) {
                private final PreferenceTheme this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AIDEUtils.setIsLightTheme(!z);
                    AIDEUtils.notifyThemeChanged();
                    Toasty.success(Utils.isCN() ? "设置成功，返回生效！" : "Set successfully, return to effective!").show();
                }
            });
            if (this.f4965cb != null) {
                this.f4965cb.setEnabled(AppTheme.getThemeName().equals(AppTheme.THEME_INDIGO) ? false : true);
            }
            linearLayout.addView(this.f4965cb);
        }
    }
}
