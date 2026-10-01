package com.baidu.mobstat;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ah {
    public static boolean m5978a(View view) {
        Object tag = view.getTag(-5000);
        if (tag == null || !(tag instanceof String) || !((String) tag).equals("baidu_mtj_edit_txtview")) {
            return false;
        }
        return true;
    }

    public static void m5975a(Activity activity, boolean z) {
        ViewGroup viewGroup;
        View viewM5972a;
        try {
            viewGroup = (ViewGroup) bi.m6354a(activity).findViewById(R.id.content);
        } catch (Exception e) {
            viewGroup = null;
        }
        if (viewGroup != null && (viewM5972a = m5972a(viewGroup)) != null) {
            viewM5972a.setVisibility(z ? 0 : 4);
        }
    }

    public static void m5973a(Activity activity) {
        ViewGroup viewGroup;
        View viewM5972a;
        try {
            viewGroup = (ViewGroup) bi.m6354a(activity).findViewById(R.id.content);
        } catch (Exception e) {
            viewGroup = null;
        }
        if (viewGroup != null && (viewM5972a = m5972a(viewGroup)) != null) {
            viewGroup.removeView(viewM5972a);
        }
    }

    @SuppressLint({"NewApi"})
    public static void m5979b(final Activity activity) {
        final ViewGroup viewGroup;
        try {
            viewGroup = (ViewGroup) bi.m6354a(activity).findViewById(R.id.content);
        } catch (Exception e) {
            viewGroup = null;
        }
        if (viewGroup != null && viewGroup != null && m5972a(viewGroup) == null) {
            final ae c1414ae = new ae(activity);
            c1414ae.setBackgroundColor(-16745729);
            c1414ae.setGravity(17);
            c1414ae.setText("连接中");
            c1414ae.setTag(-5000, "baidu_mtj_edit_txtview");
            viewGroup.post(new Runnable() {
                @Override
                public void run() {
                    int width = viewGroup.getWidth();
                    int height = viewGroup.getHeight();
                    int iM5971c = ag.m5971c(activity, 55.0f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM5971c, iM5971c);
                    layoutParams.leftMargin = (width - iM5971c) / 6;
                    layoutParams.topMargin = ((height - iM5971c) * 5) / 6;
                    c1414ae.setLayoutParams(layoutParams);
                }
            });
            viewGroup.addView(c1414ae);
            m5974a(activity, c1414ae);
        }
    }

    private static void m5974a(final Activity activity, TextView textView) {
        final View view = (View) textView.getParent();
        textView.setOnTouchListener(new View.OnTouchListener() {

            int f4045a = 0;

            int f4046b = 0;

            int f4047c = 0;

            int f4048d = 0;

            @Override
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                switch (motionEvent.getAction()) {
                    case 0:
                        this.f4045a = rawX;
                        this.f4046b = rawY;
                        this.f4047c = rawX - view2.getLeft();
                        this.f4048d = rawY - view2.getTop();
                        break;
                    case 1:
                        if (ah.m5981b(this.f4045a, (int) motionEvent.getRawX(), this.f4046b, (int) motionEvent.getRawY())) {
                            ah.m5980b((Context) activity);
                        }
                        break;
                    case 2:
                        int i = rawX - this.f4047c;
                        int i2 = rawY - this.f4048d;
                        Rect rect = new Rect();
                        view.getLocalVisibleRect(rect);
                        if (rect.contains(new Rect(i, i2, view2.getWidth() + i, view2.getHeight() + i2))) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            marginLayoutParams.leftMargin = i;
                            marginLayoutParams.topMargin = i2;
                            view2.setLayoutParams(marginLayoutParams);
                        }
                        break;
                }
                return true;
            }
        });
    }

    public static boolean m5981b(float f, float f2, float f3, float f4) {
        return Math.abs(f - f2) <= 5.0f && Math.abs(f3 - f4) <= 5.0f;
    }

    private static View m5972a(ViewGroup viewGroup) {
        View view;
        Object tag;
        if (viewGroup == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= viewGroup.getChildCount()) {
                view = null;
                break;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && (tag = childAt.getTag(-5000)) != null && (tag instanceof String) && ((String) tag).equals("baidu_mtj_edit_txtview")) {
                view = childAt;
                break;
            }
            i = i2 + 1;
        }
        return view;
    }

    public static void m5980b(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("是否确认退出连接?");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                al.m6009a().m6060c();
                bb.m6313c().m6300a("autotrace: connect close, app close");
                al.m6009a().m6050a(4);
                al.m6009a().m6062d();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }
}
