package com.almlkaide.kaypro.aide.project.adapter;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.almlkaide.kaypro.aide.project.PUtils;

public class TemplateView extends LinearLayout {
    private Context context;
    public final ViewHolder holder;

    public class ViewHolder {
        public ImageView icon;

        public View f4968ll;

        public View f4969lll;
        public TextView subtitle;
        private final TemplateView this$0;
        public TextView title;

        public void setIcon(Bitmap bitmap, boolean z) {
            this.icon.setImageBitmap(bitmap);
            if (z) {
                checkEmpty(this.icon, bitmap);
            }
        }

        public void setTitle(CharSequence charSequence) {
            this.title.setText(charSequence);
            checkEmpty(this.title, charSequence);
        }

        public void setSubtitle(CharSequence charSequence) {
            this.subtitle.setText(charSequence);
            checkEmpty(this.subtitle, charSequence);
        }

        private void checkEmpty(View view, Object obj) {
            if (obj == null) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }

        public ViewHolder(TemplateView templateView) {
            this.this$0 = templateView;
        }
    }

    public TemplateView(Context context) {
        super(context);
        this.holder = new ViewHolder(this);
        this.context = context;
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        textView.setTextAppearance(context, R.style.TextAppearance.Large);
        textView.setTextSize(16);
        TextView textView2 = new TextView(context);
        textView2.setTextAppearance(context, R.style.TextAppearance.Small);
        textView2.setTextSize(14);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, 0, PUtils.dp2px(10), 0);
        linearLayout.addView(imageView, PUtils.dp2px(36), PUtils.dp2px(36));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(textView);
        linearLayout2.addView(textView2);
        this.holder.f4968ll = linearLayout;
        this.holder.f4969lll = linearLayout2;
        this.holder.icon = imageView;
        this.holder.title = textView;
        this.holder.subtitle = textView2;
        addView(linearLayout);
        addView(linearLayout2);
        setPadding(PUtils.dp2px(32), PUtils.dp2px(16), PUtils.dp2px(16), PUtils.dp2px(16));
        setGravity(16);
    }
}
