package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class FragmentThemePreview extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return getContentView();
    }

    private LinearLayout getContentView() {
        Activity activity = getActivity();
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        EditText editText = new EditText(activity);
        editText.setHint(R.string.untitled);
        linearLayout.addView(editText, -1, -2);
        Button button = new Button(activity);
        try {
            button.setText(Class.forName("android.app.AlertDialog").getSimpleName());
            button.setOnClickListener(new View.OnClickListener(this) {
                private final FragmentThemePreview this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(View view) {
                    try {
                        new AlertDialog.Builder(this.this$0.getActivity()).setTitle(((Button) view).getText()).setMessage(Class.forName("android.app.AlertDialog").getCanonicalName()).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                    } catch (ClassNotFoundException e) {
                        throw new NoClassDefFoundError(e.getMessage());
                    }
                }
            });
            linearLayout.addView(button, -1, -2);
            linearLayout.addView(new SeekBar(activity), -1, -2);
            return linearLayout;
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
