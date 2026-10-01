package net.margaritov.preference.colorpicker;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.almlkaide.kaypro.aide.AideR;
import java.util.Locale;

public class ColorPickerDialog extends AlertDialog implements ColorPickerView.OnColorChangedListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean ismHexValSet;
    private ColorPickerView mColorPicker;
    private ColorStateList mHexDefaultTextColor;
    private EditText mHexVal;
    private boolean mHexValueEnabled;
    private View mLayout;
    private OnColorChangedListener mListener;
    private ColorPickerPanelView mNewColor;
    private ColorPickerPanelView mOldColor;
    private int mOrientation;

    public interface OnColorChangedListener {
        void onColorChanged(int i);
    }

    public ColorPickerDialog(Context context, int i) {
        super(context);
        this.mHexValueEnabled = true;
        this.ismHexValSet = false;
        init(i);
    }

    private void init(int i) {
        getWindow().setFormat(1);
        setUp(i);
        setHexValueEnabled(true);
        setButton(-1, getContext().getString(R.string.ok), new DialogInterface.OnClickListener(this) {
            private final ColorPickerDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i2) {
                if (this.this$0.mListener != null) {
                    this.this$0.mListener.onColorChanged(this.this$0.mNewColor.getColor());
                }
            }
        });
        setButton(-2, getContext().getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
            private final ColorPickerDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
    }

    private void setUp(int i) {
        this.mLayout = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(AideR.layout.dialog_color_picker, (ViewGroup) null);
        this.mLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.mOrientation = getContext().getResources().getConfiguration().orientation;
        setView(this.mLayout);
        this.mColorPicker = (ColorPickerView) this.mLayout.findViewById(AideR.C1673id.color_picker_view);
        this.mOldColor = (ColorPickerPanelView) this.mLayout.findViewById(AideR.C1673id.old_color_panel);
        this.mNewColor = (ColorPickerPanelView) this.mLayout.findViewById(AideR.C1673id.new_color_panel);
        this.mHexVal = (EditText) this.mLayout.findViewById(AideR.C1673id.hex_val);
        this.mHexVal.setInputType(524288);
        this.mHexDefaultTextColor = this.mHexVal.getTextColors();
        this.mHexVal.addTextChangedListener(new TextWatcher(this) {
            private final ColorPickerDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (this.this$0.ismHexValSet) {
                    this.this$0.ismHexValSet = false;
                    return;
                }
                String string = this.this$0.mHexVal.getText().toString();
                if (string.length() <= 5 && string.length() >= 10) {
                    this.this$0.mHexVal.setTextColor(-65536);
                    return;
                }
                try {
                    int iConvertToColorInt = ColorPickerPreference.convertToColorInt(string.toString());
                    this.this$0.ismHexValSet = true;
                    this.this$0.mColorPicker.setColor(iConvertToColorInt, true);
                    this.this$0.mHexVal.setTextColor(this.this$0.mHexDefaultTextColor);
                } catch (Throwable th) {
                    this.this$0.mHexVal.setTextColor(-65536);
                }
            }
        });
        this.mHexVal.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            private final ColorPickerDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                String string = this.this$0.mHexVal.getText().toString();
                if (string.length() > 5 || string.length() < 10) {
                    try {
                        this.this$0.mColorPicker.setColor(ColorPickerPreference.convertToColorInt(string.toString()), true);
                        this.this$0.mHexVal.setTextColor(this.this$0.mHexDefaultTextColor);
                    } catch (IllegalArgumentException e) {
                        this.this$0.mHexVal.setTextColor(-65536);
                    }
                } else {
                    this.this$0.mHexVal.setTextColor(-65536);
                }
                return true;
            }
        });
        ((LinearLayout) this.mOldColor.getParent()).setPadding(Math.round(this.mColorPicker.getDrawingOffset()), 0, Math.round(this.mColorPicker.getDrawingOffset()), 0);
        this.mOldColor.setOnClickListener(this);
        this.mNewColor.setOnClickListener(this);
        this.mColorPicker.setOnColorChangedListener(this);
        this.mOldColor.setColor(i);
        this.mColorPicker.setColor(i, true);
    }

    private void updateHexLengthFilter() {
        if (getAlphaSliderVisible()) {
            this.mHexVal.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        } else {
            this.mHexVal.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
        }
    }

    private void updateHexValue(int i) {
        if (this.ismHexValSet) {
            this.ismHexValSet = false;
        } else {
            this.ismHexValSet = true;
            if (getAlphaSliderVisible()) {
                this.mHexVal.setText(ColorPickerPreference.convertToARGB(i).toUpperCase(Locale.getDefault()));
            } else {
                this.mHexVal.setText(ColorPickerPreference.convertToRGB(i).toUpperCase(Locale.getDefault()));
            }
        }
        this.mHexVal.setTextColor(this.mHexDefaultTextColor);
    }

    public boolean getAlphaSliderVisible() {
        return this.mColorPicker.getAlphaSliderVisible();
    }

    public int getColor() {
        return this.mColorPicker.getColor();
    }

    public boolean getHexValueEnabled() {
        return this.mHexValueEnabled;
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public void onColorChanged(int i) {
        this.mNewColor.setColor(i);
        if (this.mHexValueEnabled) {
            updateHexValue(i);
        }
    }

    @Override
    public void onGlobalLayout() {
        if (getContext().getResources().getConfiguration().orientation != this.mOrientation) {
            int color = this.mOldColor.getColor();
            int color2 = this.mNewColor.getColor();
            this.mLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            setUp(color);
            this.mNewColor.setColor(color2);
            this.mColorPicker.setColor(color2);
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mOldColor.setColor(bundle.getInt("old_color"));
        this.mColorPicker.setColor(bundle.getInt("new_color"), true);
    }

    @Override
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putInt("old_color", this.mOldColor.getColor());
        bundleOnSaveInstanceState.putInt("new_color", this.mNewColor.getColor());
        return bundleOnSaveInstanceState;
    }

    public void setAlphaSliderVisible(boolean z) {
        this.mColorPicker.setAlphaSliderVisible(z);
        if (this.mHexValueEnabled) {
            updateHexLengthFilter();
            updateHexValue(getColor());
        }
    }

    public void setHexValueEnabled(boolean z) {
        this.mHexValueEnabled = z;
        if (!z) {
            this.mHexVal.setVisibility(8);
            return;
        }
        this.mHexVal.setVisibility(0);
        updateHexLengthFilter();
        updateHexValue(getColor());
    }

    public void setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        this.mListener = onColorChangedListener;
    }
}
