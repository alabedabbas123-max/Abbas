package com.almlkaide.kaypro.aide.uidesign;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.util.Utils;

public class TextTranslation {
    private static final String[][] TRANSLATIONS_WIDGET_MENU = {new String[]{"Parent View...", "父视图..."}, new String[]{"Source code...", "源代码..."}, new String[]{"Add inside...", "在里面添加..."}, new String[]{"Add above...", "在上面添加..."}, new String[]{"Add inside...", "在里面添加..."}, new String[]{"Add below...", "在下面添加..."}, new String[]{"Add before...", "在前面添加..."}, new String[]{"Add behind...", "在后面添加..."}, new String[]{"Surround with...", "设置父布局..."}, new String[]{"Delete", "删除"}};
    private static final String[][] TRANSLATIONS_WIDGET = {new String[]{"LinearLayout", "线性布局"}, new String[]{"ImageView", "图片视图"}, new String[]{"ImageButton", "图片按钮"}, new String[]{"Switch", "开关"}, new String[]{"ToggleButton", "切换按钮"}, new String[]{"ProgressBar", "进度条"}, new String[]{"TextView", "文本视图"}, new String[]{"Widget", "控件"}, new String[]{"Button", "按钮"}, new String[]{"Small Button", "小按钮"}, new String[]{"Bar Button", "条形按钮"}, new String[]{"CheckBox", "多选按钮"}, new String[]{"RadioButton", "单选按钮"}, new String[]{"View", "视图"}, new String[]{"Text", "文本"}, new String[]{"Small Text", "小文本"}, new String[]{"Medium Text", "中文本"}, new String[]{"Large Text", "大文本"}, new String[]{"Text Field", "编辑框"}, new String[]{"EditText", "编辑框"}, new String[]{"EditText (multiline)", "编辑框（多行）"}, new String[]{"EditText (password)", "编辑框（密码）"}, new String[]{"EditText (number password)", "编辑框（数字密码）"}, new String[]{"EditText (email)", "编辑框（邮箱）"}, new String[]{"EditText (name)", "编辑框（名字）"}, new String[]{"EditText (phone)", "编辑框（电话号码）"}, new String[]{"EditText (address)", "编辑框（住址）"}, new String[]{"EditText (time)", "编辑框（时间）"}, new String[]{"EditText (date)", "编辑框（日期）"}, new String[]{"EditText (number)", "编辑框（数字）"}, new String[]{"EditText (signed number)", "编辑框（正负数字）"}, new String[]{"EditText (decimal)", "编辑框（小数）"}, new String[]{"Advanced Widget", "高级控件"}, new String[]{"DatePicker", "日期选择"}, new String[]{"TimePicker", "时间选择"}, new String[]{"NumberPicker", "数字选择"}, new String[]{"RatingBar", "评分控件"}, new String[]{"Adapter View", "适配器视图"}, new String[]{"List View", "列表视图"}, new String[]{"ExpandableListView", "可展开列表视图"}, new String[]{"Expandable List View", "可展开列表视图"}, new String[]{"Spinner", "下拉菜单"}, new String[]{"Layout", "布局"}, new String[]{"RelativeLayout", "相对布局"}, new String[]{"LinearLayout (horizontal)", "线性布局 (横horizontal)"}, new String[]{"LinearLayout (vertical)", "线性布局 (竖)"}, new String[]{"Scroll View", "滑动视图"}, new String[]{"ScrollView", "滑动视图"}, new String[]{"HorizontalScrollView", "横滑动视图"}, new String[]{"Advanced Layout", "高级布局"}, new String[]{"Button Bar", "按钮条"}, new String[]{"GridLayout", "网格布局"}, new String[]{"FrameLayout", "帧布局"}, new String[]{"RadioGroup", "单选布局"}, new String[]{"TableLayout", "表格布局"}, new String[]{"TableRow", "表格行"}, new String[]{"AbsoluteLayout", "绝对布局"}, new String[]{"App Layout", "v4包控件"}, new String[]{"Drawer Layout", "侧滑栏布局"}, new String[]{"View Pager", "View Pager"}};

    public static void translationWidgetmenuEntryName(View view) {
        CharSequence widgetmenuTranslationText;
        TextView textView = (TextView) view.findViewById(AideR.C1673id.widgetmenuEntryName);
        if (textView == null || (widgetmenuTranslationText = getWidgetmenuTranslationText(textView.getText().toString())) == null) {
            return;
        }
        textView.setText(widgetmenuTranslationText);
    }

    private static CharSequence getWidgetmenuTranslationText(String str) {
        if (Utils.isCN()) {
            for (int i = 0; i < TRANSLATIONS_WIDGET_MENU.length; i++) {
                if (TRANSLATIONS_WIDGET_MENU[i][0].equals(str)) {
                    return TRANSLATIONS_WIDGET_MENU[i][1];
                }
            }
        } else {
            for (int i2 = 0; i2 < TRANSLATIONS_WIDGET_MENU.length; i2++) {
                if (TRANSLATIONS_WIDGET_MENU[i2][1].equals(str)) {
                    return TRANSLATIONS_WIDGET_MENU[i2][0];
                }
            }
        }
        return (CharSequence) null;
    }

    public static void translationDesignerViewlistEntryName(View view) {
        CharSequence widgetTranslationText;
        TextView textView = (TextView) view.findViewById(AideR.C1673id.designerViewlistEntryName);
        if (textView == null || (widgetTranslationText = getWidgetTranslationText(textView.getText().toString())) == null) {
            return;
        }
        textView.setText(widgetTranslationText);
    }

    private static boolean isEnable() {
        return Utils.isCN() && Utils.getSp().getBoolean("uidesign_language_chinese", false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    public static void translationWidget(View view) {
        CharSequence widgetTranslationText;
        TextView textView = (TextView) view.findViewById(AideR.C1673id.widgetlistGroupName);
        if (textView == null) {
            textView = (TextView) view.findViewById(AideR.C1673id.widgetlistName);
            if (textView.getVisibility() == 8) {
                TextView textView2 = (TextView) null;
                ViewGroup viewGroup = (ViewGroup) view.findViewById(AideR.C1673id.widgetlistPreview);
                if (viewGroup.getVisibility() == 0) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt instanceof TextView) {
                        textView = (TextView) childAt;
                    } else {
                        textView = textView2;
                    }
                } else {
                    textView = textView2;
                }
            }
        }
        if (textView != null && (widgetTranslationText = getWidgetTranslationText(textView.getText().toString())) != null) {
            textView.setText(new SpannableStringBuilder().append(widgetTranslationText));
        }
    }

    private static CharSequence getWidgetTranslationText(String str) {
        if (isEnable()) {
            for (int i = 0; i < TRANSLATIONS_WIDGET.length; i++) {
                if (TRANSLATIONS_WIDGET[i][0].equals(str)) {
                    return TRANSLATIONS_WIDGET[i][1];
                }
            }
        } else {
            for (int i2 = 0; i2 < TRANSLATIONS_WIDGET.length; i2++) {
                if (TRANSLATIONS_WIDGET[i2][1].equals(str)) {
                    return TRANSLATIONS_WIDGET[i2][0];
                }
            }
        }
        return (CharSequence) null;
    }
}
