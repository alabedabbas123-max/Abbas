package net.margaritov.preference.colorpicker;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.baidu.android.common.util.DeviceId;

public class ColorPickerPreference extends Preference implements Preference.OnPreferenceClickListener, ColorPickerDialog.OnColorChangedListener {
    private int defaultColor;
    private boolean mAlphaSliderEnabled;
    private float mDensity;
    ColorPickerDialog mDialog;
    private boolean mHexValueEnabled;
    private int mValue;
    View mView;

    private static class SavedState extends Preference.BaseSavedState {

        @SuppressWarnings("unused")
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel2(parcel);
            }

            @Override
            public SavedState createFromParcel2(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override
            public SavedState[] newArray(int i) {
                return newArray2(i);
            }

            @Override
            public SavedState[] newArray2(int i) {
                return new SavedState[i];
            }
        };
        Bundle dialogBundle;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.dialogBundle = parcel.readBundle();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.dialogBundle);
        }
    }

    public ColorPickerPreference(Context context) {
        super(context);
        this.mValue = -16777216;
        this.mDensity = 0;
        this.mAlphaSliderEnabled = true;
        this.mHexValueEnabled = true;
        init(context, (AttributeSet) null);
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mValue = -16777216;
        this.mDensity = 0;
        this.mAlphaSliderEnabled = true;
        this.mHexValueEnabled = true;
        init(context, attributeSet);
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mValue = -16777216;
        this.mDensity = 0;
        this.mAlphaSliderEnabled = true;
        this.mHexValueEnabled = true;
        init(context, attributeSet);
    }

    public static String convertToARGB(int i) {
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString).toString();
        }
        if (hexString2.length() == 1) {
            hexString2 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString2).toString();
        }
        if (hexString3.length() == 1) {
            hexString3 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString3).toString();
        }
        if (hexString4.length() == 1) {
            hexString4 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString4).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("#").append(hexString).toString()).append(hexString2).toString()).append(hexString3).toString()).append(hexString4).toString();
    }

    public static int convertToColorInt(String str) {
        if (!str.startsWith("#")) {
            str = new StringBuffer().append("#").append(str).toString();
        }
        return Color.parseColor(str);
    }

    public static String convertToRGB(int i) {
        String hexString = Integer.toHexString(Color.red(i));
        String hexString2 = Integer.toHexString(Color.green(i));
        String hexString3 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString).toString();
        }
        if (hexString2.length() == 1) {
            hexString2 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString2).toString();
        }
        if (hexString3.length() == 1) {
            hexString3 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString3).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("#").append(hexString).toString()).append(hexString2).toString()).append(hexString3).toString();
    }

    private Bitmap getPreviewBitmap() {
        int i = (int) (this.mDensity * 31);
        int i2 = this.mValue;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        int i3 = 0;
        while (i3 < width) {
            int i4 = i3;
            while (i4 < height) {
                int i5 = (i3 <= 1 || i4 <= 1 || i3 >= width + (-2) || i4 >= height + (-2)) ? com.github.megatronking.svg.generator.utils.Color.GRAY : i2;
                bitmapCreateBitmap.setPixel(i3, i4, i5);
                if (i3 != i4) {
                    bitmapCreateBitmap.setPixel(i4, i3, i5);
                }
                i4++;
            }
            i3++;
        }
        return bitmapCreateBitmap;
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mDensity = getContext().getResources().getDisplayMetrics().density;
        setOnPreferenceClickListener(this);
        if (attributeSet != null) {
            this.mAlphaSliderEnabled = attributeSet.getAttributeBooleanValue((String) null, "alphaSlider", this.mAlphaSliderEnabled);
            this.mHexValueEnabled = attributeSet.getAttributeBooleanValue((String) null, "hexValue", this.mHexValueEnabled);
        }
    }

    private void setPreviewColor() {
        if (this.mView == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.widget_frame);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) (this.mDensity * 8), linearLayout.getPaddingBottom());
            int childCount = linearLayout.getChildCount();
            if (childCount > 0) {
                linearLayout.removeViews(0, childCount);
            }
            linearLayout.addView(imageView);
            linearLayout.setMinimumWidth(0);
            imageView.setBackgroundDrawable(new AlphaPatternDrawable((int) (5 * this.mDensity)));
            imageView.setImageBitmap(getPreviewBitmap());
        }
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        this.mView = view;
        setPreviewColor();
    }

    @Override
    public void onColorChanged(int i) {
        if (isPersistent()) {
            persistInt(i);
        }
        this.mValue = i;
        setPreviewColor();
        try {
            getOnPreferenceChangeListener().onPreferenceChange(this, new Integer(i));
        } catch (NullPointerException e) {
        }
        PreferenceManager.getDefaultSharedPreferences(getContext()).edit().putString(getKey(), convertToARGB(i)).commit();
    }

    @Override
    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        return (string == null || !string.startsWith("#")) ? new Integer(typedArray.getColor(i, -16777216)) : new Integer(convertToColorInt(string));
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        showDialog((Bundle) null);
        return false;
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        showDialog(savedState.dialogBundle);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (this.mDialog == null || !this.mDialog.isShowing()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.dialogBundle = this.mDialog.onSaveInstanceState();
        return savedState;
    }

    @Override
    protected void onSetInitialValue(boolean z, Object obj) {
        int iIntValue;
        this.defaultColor = ((Integer) obj).intValue();
        if (z) {
            iIntValue = getPersistedInt(this.mValue);
        } else {
            try {
                iIntValue = Color.parseColor(getSharedPreferences().getString(getKey(), (String) null));
            } catch (Exception e) {
                iIntValue = ((Integer) obj).intValue();
            }
        }
        if (isPersistent()) {
            persistInt(iIntValue);
        }
        this.mValue = iIntValue;
        setPreviewColor();
    }

    public void setAlphaSliderEnabled(boolean z) {
        this.mAlphaSliderEnabled = z;
    }

    public void setHexValueEnabled(boolean z) {
        this.mHexValueEnabled = z;
    }

    protected void showDialog(Bundle bundle) {
        this.mDialog = new ColorPickerDialog(getContext(), this.mValue);
        this.mDialog.setOnColorChangedListener(this);
        if (this.mAlphaSliderEnabled) {
            this.mDialog.setAlphaSliderVisible(true);
        }
        if (this.mHexValueEnabled) {
            this.mDialog.setHexValueEnabled(true);
        }
        if (bundle != null) {
            this.mDialog.onRestoreInstanceState(bundle);
        }
        this.mDialog.setTitle(getTitle());
        this.mDialog.setButton(-3, "默认", new DialogInterface.OnClickListener(this) {
            private final ColorPickerPreference this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                this.this$0.getEditor().remove(this.this$0.getKey()).commit();
                this.this$0.onColorChanged(this.this$0.defaultColor);
            }
        });
        this.mDialog.show();
    }
}
