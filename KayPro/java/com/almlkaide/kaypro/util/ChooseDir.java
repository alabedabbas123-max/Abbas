package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.baidu.android.common.util.DeviceId;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ChooseDir {
    private FileAdapter adapter;
    private ChooseListener chooseListener;

    public interface ChooseListener {
        void onChooseed(File file);
    }

    public static void showDialog(Activity activity, File file, ChooseListener chooseListener) {
        new ChooseDir(activity, file, chooseListener);
    }

    public ChooseDir(Activity activity, File file, ChooseListener chooseListener) {
        this.chooseListener = chooseListener;
        file = file == null ? Environment.getExternalStorageDirectory() : file;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(file.getAbsolutePath()).setItems(new String[0], (DialogInterface.OnClickListener) null).setCancelable(false).setPositiveButton(Utils.isCN() ? "选择" : "choose", new DialogInterface.OnClickListener(this, chooseListener) {
            private final ChooseDir this$0;
            private final ChooseListener val$chooseListener;

            {
                this.this$0 = this;
                this.val$chooseListener = chooseListener;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                this.val$chooseListener.onChooseed(this.this$0.adapter.currentDir);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(Utils.isCN() ? "新建文件夹" : "New folder", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-3).setOnClickListener(new AnonymousClass100000003(this, activity));
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener(this, alertDialogCreate) {
            private final ChooseDir this$0;
            private final AlertDialog val$dialog;

            {
                this.this$0 = this;
                this.val$dialog = alertDialogCreate;
            }

            @Override
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 0 && !this.this$0.adapter.goBack()) {
                    this.val$dialog.dismiss();
                    return false;
                }
                return false;
            }
        });
        this.adapter = new FileAdapter(activity, alertDialogCreate);
        this.adapter.loadDir(file);
    }

    class AnonymousClass100000003 implements View.OnClickListener {
        private final ChooseDir this$0;
        private final Activity val$activity;

        AnonymousClass100000003(ChooseDir chooseDir, Activity activity) {
            this.this$0 = chooseDir;
            this.val$activity = activity;
        }

        @Override
        public void onClick(View view) {
            LinearLayout linearLayout = new LinearLayout(this.val$activity);
            EditText editText = new EditText(this.val$activity);
            linearLayout.addView(editText, -1, -2);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.val$activity).setTitle(((Button) view).getText()).setView(linearLayout).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(this, editText, alertDialogCreate) {
                private final AnonymousClass100000003 this$0;
                private final AlertDialog val$dialog2;
                private final EditText val$input;

                {
                    this.this$0 = this;
                    this.val$input = editText;
                    this.val$dialog2 = alertDialogCreate;
                }

                @Override
                public void onClick(View view2) {
                    try {
                        if (!new File(this.this$0.this$0.adapter.currentDir, this.val$input.getText().toString()).mkdirs()) {
                            throw new Exception("!f.mkdirs()");
                        }
                        this.this$0.this$0.adapter.reload();
                        this.val$dialog2.dismiss();
                    } catch (Throwable th) {
                        Utils.toast(th);
                    }
                }
            });
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                private final AnonymousClass100000003 this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onDismiss(DialogInterface dialogInterface) {
                }
            });
        }
    }

    private static class FileAdapter extends BaseAdapter {
        private Context context;
        private File currentDir;
        private List<Item> datalist = new ArrayList();
        private AlertDialog dialog;

        @Override
        public Object getItem(int i) {
            return getItem(i);
        }

        public FileAdapter(Context context, AlertDialog alertDialog) {
            this.context = context;
            this.dialog = alertDialog;
            alertDialog.getListView().setAdapter((ListAdapter) this);
            alertDialog.getListView().setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
                private final FileAdapter this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Item item = this.this$0.getItem(i);
                    if (item.isBack) {
                        this.this$0.goBack();
                    } else {
                        this.this$0.loadDir(item.file);
                    }
                }
            });
        }

        public boolean goBack() {
            File parentFile;
            if (this.currentDir == null || (parentFile = this.currentDir.getParentFile()) == null) {
                return false;
            }
            loadDir(parentFile);
            return true;
        }

        public void reload() {
            loadDir(this.currentDir);
        }

        public void loadDir(File file) {
            File[] fileArrListFiles;
            if (file != null) {
                this.currentDir = file;
                this.dialog.setTitle(file.getAbsolutePath());
                ArrayList arrayList = new ArrayList();
                if (file.getAbsolutePath().equals("/")) {
                    fileArrListFiles = new File[]{new File("/storage")};
                } else {
                    arrayList.add(new Item(this, true));
                    fileArrListFiles = file.listFiles(new FileFilter(this) {
                        private final FileAdapter this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public boolean accept(File file2) {
                            return file2.isDirectory();
                        }
                    });
                }
                if (fileArrListFiles == null) {
                    if (file.getAbsolutePath().equals("/storage/emulated")) {
                        fileArrListFiles = new File[]{new File(file, DeviceId.CUIDInfo.I_EMPTY)};
                    } else {
                        fileArrListFiles = new File[0];
                    }
                }
                for (File file2 : fileArrListFiles) {
                    arrayList.add(new Item(this, file2));
                }
                Collections.sort(arrayList, new Comparator<Item>(this) {
                    private final FileAdapter this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public int compare(Item item, Item item2) {
                        return compare2(item, item2);
                    }

                    public int compare2(Item item, Item item2) {
                        if (item.isBack || item2.isBack) {
                            return 0;
                        }
                        return item.file.getName().toLowerCase(Locale.ENGLISH).compareTo(item2.file.getName().toLowerCase(Locale.ENGLISH));
                    }
                });
                this.datalist = arrayList;
                notifyDataSetChanged();
            }
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(this.context).inflate(R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new ViewHolder(this, view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            Item item = getItem(i);
            if (item.isBack) {
                viewHolder.text1.setText(".../");
            } else {
                viewHolder.text1.setText(item.file.getName());
            }
            return view;
        }

        private class Item {
            public File file;
            public boolean isBack;
            private final FileAdapter this$0;

            public Item(FileAdapter fileAdapter, File file) {
                this.this$0 = fileAdapter;
                this.file = file;
            }

            public Item(FileAdapter fileAdapter, boolean z) {
                this.this$0 = fileAdapter;
                this.isBack = z;
            }
        }

        private class ViewHolder {
            public TextView text1;
            private final FileAdapter this$0;

            public ViewHolder(FileAdapter fileAdapter, View view) {
                this.this$0 = fileAdapter;
                this.text1 = (TextView) view.findViewById(R.id.text1);
            }
        }

        @Override
        public int getCount() {
            return this.datalist.size();
        }

        @Override
        public Item getItem(int i) {
            return this.datalist.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }
    }
}
