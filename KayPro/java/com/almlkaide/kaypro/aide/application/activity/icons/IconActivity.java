package com.almlkaide.kaypro.aide.application.activity.icons;

import adrt.ADRTLogCatReader;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.caverock.androidsvg.SVG;
import com.github.megatronking.svg.generator.svg.Svg2Vector;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.app.base.BaseActivity;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.view.ColorBackgroundTextView;
import com.tencent.mm.util.TypedValue;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;
import net.margaritov.preference.colorpicker.AlphaPatternDrawable;
import net.margaritov.preference.colorpicker.ColorPickerDialog;
import org.apache.commons.io.IOUtils;

public class IconActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private IconAdapter adapter;

    private String[] f4946dpi = {"mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"};
    private int[] dpi_dimen = {24, 36, 48, 72, 96};
    private EditText mEditText;
    private GridView mGridView;
    private LinearLayout mProgressView;
    private static List<Icon> list = new ArrayList();
    static String iconAssetsZip = Utils.getAssetsDataFile("materialicon/icon.zip");

    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
        setContentView(getContentView());
        getActionBar().setTitle(Utils.isCN() ? "图标中心" : "Icon");
        getActionBar().setDisplayHomeAsUpEnabled(true);
        new loadIconTask(this).execute(new Void[0]);
    }

    public void showMsgDialog(String str, String str2) {
        Utils.showMsgDialog(this, str, str2);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Icon item = this.adapter.getItem(i);
        PopupMenu popupMenu = new PopupMenu(this, view);
        Menu menu = popupMenu.getMenu();
        File file = new File(new File(Environment.getExternalStorageDirectory(), Environment.DIRECTORY_PICTURES), "Icon");
        File res = ProjectUtils.getRes(ProjectUtils.getCurrentProject());
        SubMenu subMenuAddSubMenu = menu.addSubMenu(Utils.isCN() ? "添加到工程" : "Add to project");
        subMenuAddSubMenu.add(1, 0, 0, Utils.isCN() ? "添加为PNG" : "Add as png").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, item, res) {
            private final IconActivity this$0;
            private final Icon val$item;
            private final File val$projectResPath;

            {
                this.this$0 = this;
                this.val$item = item;
                this.val$projectResPath = res;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.exportToPNG(this.this$0.getActivity(), this.val$item, this.val$projectResPath, "drawable", this.val$item.getFileName(".png"), 0);
                return false;
            }
        });
        subMenuAddSubMenu.add(1, 0, 0, Utils.isCN() ? "添加为Vector" : "Add as vector").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, item, res) {
            private final IconActivity this$0;
            private final Icon val$item;
            private final File val$projectResPath;

            {
                this.this$0 = this;
                this.val$item = item;
                this.val$projectResPath = res;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                LinearLayout linearLayout = new LinearLayout(this.this$0.getActivity());
                linearLayout.setPadding(Utils.dp2px(24), Utils.dp2px(16), Utils.dp2px(24), 0);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(this.this$0.getActivity());
                textView.setText(Utils.isCN() ? "图标名：" : "Icon name:");
                EditText editText = new EditText(this.this$0.getActivity());
                editText.setText(this.val$item.getFileName(TypedValue.XML_FILE));
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this.this$0.getActivity()).setTitle(menuItem.getTitle()).setView(linearLayout).setPositiveButton(Utils.isCN() ? "导入" : "Import", new DialogInterface.OnClickListener(this, this.val$projectResPath, editText, this.val$item) {
                    private final AnonymousClass100000003 this$0;
                    private final Icon val$item;
                    private final File val$projectResPath;
                    private final EditText val$view_editor;

                    {
                        this.this$0 = this;
                        this.val$projectResPath = file;
                        this.val$view_editor = editText;
                        this.val$item = icon;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        String absolutePath = new File(new File(this.val$projectResPath, "drawable"), this.val$view_editor.getText().toString()).getAbsolutePath();
                        FileIOUtils.writeFileFromString(absolutePath, IconActivity.parseSvgToXml(this.val$item));
                        Utils.toast(String.format(Utils.isCN() ? "已添加至：%s" : "Added to: %s", Utils.subString(absolutePath, new StringBuffer().append(this.val$projectResPath).append("/").toString(), (String) null)));
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                editText.addTextChangedListener(new TextWatcher(this, alertDialogCreate) {
                    private final AnonymousClass100000003 this$0;
                    private final AlertDialog val$dialog;

                    {
                        this.this$0 = this;
                        this.val$dialog = alertDialogCreate;
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        this.val$dialog.getButton(-1).setEnabled(!TextUtils.isEmpty(charSequence));
                    }
                });
                return false;
            }
        });
        subMenuAddSubMenu.setGroupEnabled(1, res != null);
        SubMenu subMenuAddSubMenu2 = menu.addSubMenu(Utils.isCN() ? "导出图标" : "Export Icon");
        subMenuAddSubMenu2.add(Utils.isCN() ? "导出为PNG" : "Export to png").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, file, item) {
            private final IconActivity this$0;
            private final Icon val$item;
            private final File val$pictures;

            {
                this.this$0 = this;
                this.val$pictures = file;
                this.val$item = item;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.exportToPNG(this.this$0.getActivity(), this.val$item, new File(new File(this.val$pictures, "png"), this.val$item.getFileName("")), "drawable", this.val$item.getFileName(".png"), 1);
                return false;
            }
        });
        subMenuAddSubMenu2.add(Utils.isCN() ? "导出为Vector" : "Export to vector").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, file, item) {
            private final IconActivity this$0;
            private final Icon val$item;
            private final File val$pictures;

            {
                this.this$0 = this;
                this.val$pictures = file;
                this.val$item = item;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String absolutePath = new File(new File(this.val$pictures, "vector"), this.val$item.getFileName(TypedValue.XML_FILE)).getAbsolutePath();
                FileIOUtils.writeFileFromString(absolutePath, IconActivity.parseSvgToXml(this.val$item));
                this.this$0.showMsgDialog(Utils.isCN() ? "已导出至" : "Exported to", absolutePath);
                return false;
            }
        });
        subMenuAddSubMenu2.add(Utils.isCN() ? "导出为SVG" : "Export to svg").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, file, item) {
            private final IconActivity this$0;
            private final Icon val$item;
            private final File val$pictures;

            {
                this.this$0 = this;
                this.val$pictures = file;
                this.val$item = item;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String absolutePath = new File(new File(this.val$pictures, "svg"), this.val$item.getFileName(".svg")).getAbsolutePath();
                if (FileIOUtils.writeFileFromIS(absolutePath, IconActivity.getIs(this.val$item))) {
                    this.this$0.showMsgDialog(Utils.isCN() ? "已导出至" : "Exported to", absolutePath);
                    return false;
                }
                Utils.toastError("fail");
                return false;
            }
        });
        menu.add(Utils.isCN() ? "转换为Vector" : "Convert to vector").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, item) {
            private final IconActivity this$0;
            private final Icon val$item;

            {
                this.this$0 = this;
                this.val$item = item;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String svgToXml = IconActivity.parseSvgToXml(this.val$item);
                new AlertDialog.Builder(this.this$0.getActivity()).setTitle(menuItem.getTitle()).setMessage(svgToXml).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, svgToXml) {
                    private final AnonymousClass100000008 this$0;
                    private final String val$result;

                    {
                        this.this$0 = this;
                        this.val$result = svgToXml;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        Utils.copyToClipboard(this.val$result);
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                return false;
            }
        });
        popupMenu.show();
    }

    public static InputStream getIs(Icon icon) throws Throwable {
        Throwable th;
        ZipFile zipFile;
        LogUtils.iTag("filePath", new Object[]{icon.getFilePath()});
        ZipFile zipFile2 = (ZipFile) null;
        try {
            zipFile = new ZipFile(getIconZip());
            try {
                InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(icon.getFilePath()));
                File file = new File(Utils.getApp().getCacheDir(), "iconis.tmp");
                if (FileIOUtils.writeFileFromIS(file, inputStream)) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    CloseUtils.closeIOQuietly(zipFile);
                    return fileInputStream;
                }
                zipFile2 = zipFile;
                CloseUtils.closeIOQuietly(zipFile2);
                return (InputStream) null;
            } catch (Throwable th2) {
                th = th2;
                zipFile2 = zipFile;
                try {
                    LogUtils.i(new Object[]{th});
                } catch (Throwable th3) {
                    th = th3;
                    zipFile = zipFile2;
                    CloseUtils.closeIOQuietly(zipFile);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String parseSvgToXml(Icon icon) {
        String svgToXml;
        try {
            InputStream is = getIs(icon);
            String strInputStream2String = ConvertUtils.inputStream2String(is, "utf-8");
            CloseUtils.closeIOQuietly(is);
            svgToXml = parseSvgToXml(strInputStream2String);
        } catch (Throwable th) {
            LogUtils.i(new Object[]{th});
            svgToXml = "";
        }
        return svgToXml;
    }

    public static String parseSvgToXml(String str) {
        File file = new File(Utils.getApp().getCacheDir(), "1.tmp");
        FileIOUtils.writeFileFromString(file, str);
        Svg2Vector.parseSvgToXml(file, file, -1, -1);
        String file2String = FileIOUtils.readFile2String(file);
        file.delete();
        return file2String;
    }

    public void exportToPNG(Activity activity, Icon icon, File file, String str, String str2, int i) {
        String str3;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        textView.setText(Utils.isCN() ? "图标名" : "Icon name");
        EditText editText = new EditText(activity);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(activity);
        textView2.setText(Utils.isCN() ? "图标尺寸" : "Icon size");
        textView2.setPadding(0, Utils.dp2px(10), 0, 0);
        EditText editText2 = new EditText(activity);
        editText2.setInputType(2);
        editText2.setVisibility(8);
        Spinner spinner = new Spinner(activity);
        Object[] objArr = new Object[7];
        objArr[0] = new Integer(48);
        objArr[1] = new Integer(72);
        objArr[2] = new Integer(96);
        objArr[3] = new Integer(144);
        objArr[4] = new Integer(192);
        objArr[5] = new Integer(512);
        objArr[6] = Utils.isCN() ? "自定义" : "custom";
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(activity, R.layout.simple_list_item_1, R.id.text1, objArr));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this, objArr, editText2) {
            private final IconActivity this$0;
            private final Object[] val$items;
            private final EditText val$view2_editor;

            {
                this.this$0 = this;
                this.val$items = objArr;
                this.val$view2_editor = editText2;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                Object obj = this.val$items[i2];
                if (obj instanceof String) {
                    this.val$view2_editor.setVisibility(0);
                } else {
                    this.val$view2_editor.setVisibility(8);
                    this.val$view2_editor.setText(String.valueOf(obj));
                }
            }
        });
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (objArr[i2].equals(new Integer(96))) {
                spinner.setSelection(i2);
            }
        }
        linearLayout2.addView(textView2);
        linearLayout2.addView(editText2, -1, -2);
        linearLayout2.addView(spinner, -1, -2);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        TextView textView3 = new TextView(activity);
        textView3.setText(Utils.isCN() ? "图标颜色" : "Icon color");
        textView3.setPadding(0, 0, 0, Utils.dp2px(5));
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setBackgroundDrawable(new AlphaPatternDrawable(12));
        linearLayout4.setPadding(Utils.dp2px(5), Utils.dp2px(5), Utils.dp2px(5), Utils.dp2px(5));
        ColorBackgroundTextView colorBackgroundTextView = new ColorBackgroundTextView(activity);
        linearLayout4.addView(colorBackgroundTextView, -1, -2);
        colorBackgroundTextView.setColor(-9079435);
        colorBackgroundTextView.setOnClickListener(new View.OnClickListener(this, activity, colorBackgroundTextView, textView3) {
            private final IconActivity this$0;
            private final Activity val$activity;
            private final ColorBackgroundTextView val$view3_bth;
            private final TextView val$view3_txt;

            {
                this.this$0 = this;
                this.val$activity = activity;
                this.val$view3_bth = colorBackgroundTextView;
                this.val$view3_txt = textView3;
            }

            @Override
            public void onClick(View view) {
                ColorPickerDialog colorPickerDialog = new ColorPickerDialog(this.val$activity, Color.parseColor(this.val$view3_bth.getText().toString()));
                colorPickerDialog.setTitle(this.val$view3_txt.getText());
                colorPickerDialog.setOnColorChangedListener(new ColorPickerDialog.OnColorChangedListener(this, this.val$view3_bth) {
                    private final AnonymousClass100000011 this$0;
                    private final ColorBackgroundTextView val$view3_bth;

                    {
                        this.this$0 = this;
                        this.val$view3_bth = colorBackgroundTextView;
                    }

                    @Override
                    public void onColorChanged(int i3) {
                        this.val$view3_bth.setColor(i3);
                    }
                });
                colorPickerDialog.show();
            }
        });
        linearLayout3.addView(textView3);
        linearLayout3.addView(linearLayout4, -1, -2);
        CheckBox checkBox = new CheckBox(activity);
        checkBox.setText(Utils.isCN() ? "自适应图标" : "Adaptive Icon");
        TextView textView4 = new TextView(activity);
        textView4.setText(Utils.isCN() ? "将生成多个适应不同屏幕分辨率的图标。" : "Multiple icons will be generated for different screen resolutions");
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, linearLayout2, textView4) {
            private final IconActivity this$0;
            private final TextView val$tips;
            private final LinearLayout val$view2;

            {
                this.this$0 = this;
                this.val$view2 = linearLayout2;
                this.val$tips = textView4;
            }

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    this.val$view2.setVisibility(8);
                    this.val$tips.setVisibility(0);
                } else {
                    this.val$view2.setVisibility(0);
                    this.val$tips.setVisibility(8);
                }
            }
        });
        checkBox.setChecked(true);
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(1);
        linearLayout5.setPadding(Utils.dp2px(24), Utils.dp2px(16), Utils.dp2px(24), 0);
        linearLayout5.addView(linearLayout, -1, -2);
        linearLayout5.addView(linearLayout3, -1, -2);
        linearLayout5.addView(linearLayout2, -1, -2);
        linearLayout5.addView(new View(activity), -1, Utils.dp2px(10));
        linearLayout5.addView(checkBox, -2, -2);
        linearLayout5.addView(textView4, -2, -2);
        if (i == 1) {
            checkBox.setChecked(false);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (i == 1) {
            str3 = Utils.isCN() ? "导出PNG" : "Export png";
        } else {
            str3 = Utils.isCN() ? "添加到项目" : "Add to project";
        }
        AlertDialog alertDialogCreate = builder.setTitle(str3).setView(linearLayout5).setPositiveButton(i == 1 ? Utils.isCN() ? "导出" : "Export" : Utils.isCN() ? "添加" : "Add", (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        editText.addTextChangedListener(new TextWatcher(this, alertDialogCreate) {
            private final IconActivity this$0;
            private final AlertDialog val$dialog;

            {
                this.this$0 = this;
                this.val$dialog = alertDialogCreate;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                this.val$dialog.getButton(-1).setEnabled(!TextUtils.isEmpty(charSequence));
            }
        });
        editText2.addTextChangedListener(new TextWatcher(this, alertDialogCreate, editText2) {
            private final IconActivity this$0;
            private final AlertDialog val$dialog;
            private final EditText val$view2_editor;

            {
                this.this$0 = this;
                this.val$dialog = alertDialogCreate;
                this.val$view2_editor = editText2;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                try {
                    this.val$dialog.getButton(-1).setEnabled(charSequence.toString().trim().length() == 0 || (Long.parseLong(charSequence.toString()) > ((long) 1) ? 1 : (Long.parseLong(charSequence.toString()) == ((long) 1) ? 0 : -1)) < 0 ? false : true);
                    this.val$view2_editor.setError((CharSequence) null);
                } catch (Throwable th) {
                    this.val$dialog.getButton(-1).setEnabled(false);
                    this.val$view2_editor.setError(th.getMessage());
                }
            }
        });
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(this, colorBackgroundTextView, str, checkBox, icon, file, editText, alertDialogCreate, i, editText2, activity) {
            private final IconActivity this$0;
            private final Activity val$activity;
            private final CheckBox val$checkbox_auto;
            private final int val$code;
            private final AlertDialog val$dialog;
            private final Icon val$icon;
            private final String val$parentFileName;
            private final File val$toPath;
            private final EditText val$view2_editor;
            private final ColorBackgroundTextView val$view3_bth;
            private final EditText val$view_editor;

            {
                this.this$0 = this;
                this.val$view3_bth = colorBackgroundTextView;
                this.val$parentFileName = str;
                this.val$checkbox_auto = checkBox;
                this.val$icon = icon;
                this.val$toPath = file;
                this.val$view_editor = editText;
                this.val$dialog = alertDialogCreate;
                this.val$code = i;
                this.val$view2_editor = editText2;
                this.val$activity = activity;
            }

            private void save(SVG c1580svg, File file2, int i3) throws Throwable {
                c1580svg.setDocumentHeight(i3);
                c1580svg.setDocumentWidth(c1580svg.getDocumentHeight());
                ImageUtils.save(ImageUtils.drawColor(ImageUtils.drawable2Bitmap(new PictureDrawable(c1580svg.renderToPicture())), Color.parseColor(this.val$view3_bth.getText().toString())), file2, Bitmap.CompressFormat.PNG, true);
            }

            @Override
            public void onClick(View view) {
                String str4 = this.val$parentFileName == null ? "" : this.val$parentFileName;
                if (this.val$checkbox_auto.isChecked()) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        SVG svg = this.val$icon.getSvg();
                        for (int i3 = 0; i3 < this.this$0.f4946dpi.length; i3++) {
                            File file2 = new File(new File(this.val$toPath, new StringBuffer().append(new StringBuffer().append(str4).append("-").toString()).append(this.this$0.f4946dpi[i3]).toString()), this.val$view_editor.getText().toString());
                            arrayList.add(file2);
                            save(svg, file2, this.this$0.dpi_dimen[i3]);
                        }
                        this.val$dialog.dismiss();
                        if (this.val$code == 1) {
                            this.this$0.showMsgDialog(Utils.isCN() ? "已导出至" : "Exported to", this.val$toPath.getAbsolutePath());
                            return;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            stringBuffer.append(((File) it.next()).getParentFile().getName());
                            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                        this.this$0.showMsgDialog(Utils.isCN() ? "已添加至" : "Added to", stringBuffer.toString().trim());
                        return;
                    } catch (Throwable th) {
                        Utils.toast(new StringBuffer().append("error:").append(th.getMessage()).toString());
                        return;
                    }
                }
                try {
                    int i4 = Integer.parseInt(this.val$view2_editor.getText().toString());
                    SVG svg2 = this.val$icon.getSvg();
                    File file3 = new File(this.val$code == 1 ? this.val$toPath.getParentFile() : new File(this.val$toPath, str4), this.val$view_editor.getText().toString());
                    save(svg2, file3, i4);
                    this.val$dialog.dismiss();
                    if (this.val$code == 1) {
                        this.this$0.showMsgDialog(Utils.isCN() ? "已导出至" : "Exported to", new File(this.val$toPath.getParentFile(), this.val$view_editor.getText().toString()).getAbsolutePath());
                    } else {
                        this.this$0.showMsgDialog(Utils.isCN() ? "已添加至" : "Added to", Utils.subString(file3.getAbsolutePath(), new StringBuffer().append(ProjectUtils.getRes(ProjectUtils.getCurrentProject())).append("/").toString(), (String) null));
                    }
                } catch (Throwable th2) {
                    if (th2 instanceof OutOfMemoryError) {
                        this.val$view2_editor.setError(Utils.isCN() ? "图片太大" : "OutOfMemoryError");
                    } else {
                        Utils.showExDialog(this.val$activity, th2);
                    }
                }
            }
        });
    }

    public static File getIconZip() {
        File file = new File(Utils.getApp().getFilesDir(), "material_icon.zip");
        ResourceUtils.copyFileFromAssets(iconAssetsZip, file.getAbsolutePath());
        return file;
    }

    private class loadIconTask extends AsyncTask<Void, Void, List<Icon>> {
        private final IconActivity this$0;

        @Override
        protected List<Icon> doInBackground(Void[] voidArr) {
            return doInBackground2(voidArr);
        }

        @Override
        protected void onPostExecute(List<Icon> list) {
            onPostExecute2(list);
        }

        protected List<Icon> doInBackground2(Void[] voidArr) throws Throwable {
            ZipFile zipFile;
            if (!IconActivity.list.isEmpty()) {
                return IconActivity.list;
            }
            ArrayList arrayList = new ArrayList();
            ZipFile zipFile2 = (ZipFile) null;
            try {
                File iconZip = IconActivity.getIconZip();
                zipFile = new ZipFile(iconZip);
                try {
                    try {
                        List<String> filesPath = ZipUtils.getFilesPath(iconZip);
                        if (!filesPath.isEmpty()) {
                            LogUtils.iTag("filesPath 0", new Object[]{(String) filesPath.get(0)});
                        }
                        LogUtils.iTag("filesPath size", new Object[]{new Integer(filesPath.size())});
                        for (String str : filesPath) {
                            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(str));
                            Icon icon = new Icon();
                            icon.setFilePath(str);
                            icon.setSvg(SVG.getFromInputStream(inputStream));
                            arrayList.add(icon);
                        }
                        CloseUtils.closeIOQuietly(zipFile);
                        return arrayList;
                    } catch (Exception e) {
                        e = e;
                        LogUtils.iTag("loadFail", new Object[]{e});
                        CloseUtils.closeIOQuietly(zipFile);
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    CloseUtils.closeIOQuietly(zipFile);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                zipFile = zipFile2;
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
                CloseUtils.closeIOQuietly(zipFile);
                throw th;
            }
        }

        protected void onPostExecute2(List<Icon> list) {
            super.onPostExecute(list);
            IconActivity.list = list;
            this.this$0.adapter = new IconAdapter(this.this$0, IconActivity.list);
            this.this$0.mGridView.setAdapter((ListAdapter) this.this$0.adapter);
            this.this$0.mEditText.setHint(String.format(Utils.isCN() ? "在%d个图标中搜索..." : "Search %d icons", new Integer(IconActivity.list.size())));
            this.this$0.mProgressView.setVisibility(8);
        }

        public loadIconTask(IconActivity iconActivity) {
            this.this$0 = iconActivity;
        }
    }

    private View getContentView() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        this.mEditText = new EditText(this);
        this.mEditText.setSingleLine(true);
        this.mEditText.setHint(Utils.isCN() ? "正在加载中..." : "Loading...");
        this.mEditText.addTextChangedListener(new TextWatcher(this) {
            private final IconActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (this.this$0.adapter != null) {
                    this.this$0.adapter.search(charSequence.toString());
                }
            }
        });
        this.mGridView = new GridView(this);
        this.mGridView.setNumColumns(calcNumOfRows());
        this.mGridView.setFastScrollEnabled(true);
        this.mGridView.setOnItemClickListener(this);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setPadding(Utils.dp2px(16), 0, Utils.dp2px(16), 0);
        linearLayout2.addView(this.mEditText, -1, -2);
        linearLayout.addView(linearLayout2, -1, -2);
        linearLayout.addView(this.mGridView, -1, -1);
        this.mProgressView = new LinearLayout(this);
        this.mProgressView.setGravity(17);
        this.mProgressView.addView(new ProgressBar(this));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(linearLayout, -1, -1);
        relativeLayout.addView(this.mProgressView, -1, -1);
        return relativeLayout;
    }

    private int calcNumOfRows() {
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return (int) (point.x / SizeUtils.dp2px(82));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Utils.isCN() ? "获取更多" : "Get more").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final IconActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Utils.openUrl("https://www.coolapk.com/apk/com.almlkaide.kaypro.materialicon");
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IconActivity getActivity() {
        return this;
    }

    public static final class ImageUtils {
        public static Bitmap drawColor(Bitmap bitmap, int i) {
            Paint paint = new Paint(1);
            paint.setColor(i);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap.extractAlpha(), 0, 0, paint);
            return bitmapCreateBitmap;
        }

        public static Bitmap drawable2Bitmap(Drawable drawable) {
            Bitmap bitmapCreateBitmap;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    return bitmapDrawable.getBitmap();
                }
            }
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z) throws Throwable {
            OutputStream bufferedOutputStream;
            boolean z2;
            boolean zCompress = false;
            if (isEmptyBitmap(bitmap) || !createFileByDeleteOldFile(file)) {
                return false;
            }
            OutputStream outputStream = (OutputStream) null;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    try {
                        zCompress = bitmap.compress(compressFormat, 100, bufferedOutputStream);
                        if (z && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        z2 = zCompress;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        z2 = zCompress;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                bufferedOutputStream = outputStream;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = outputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                    return z2;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return z2;
                }
            }
            return z2;
        }

        private static boolean isEmptyBitmap(Bitmap bitmap) {
            return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
        }

        private static boolean createOrExistsDir(File file) {
            return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
        }

        private static boolean createFileByDeleteOldFile(File file) {
            if (file == null) {
                return false;
            }
            if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
                return false;
            }
            try {
                return file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    }
}
