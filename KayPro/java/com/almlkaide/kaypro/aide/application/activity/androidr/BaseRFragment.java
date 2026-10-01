package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.widget.CustomListView;

public abstract class BaseRFragment extends Fragment {
    private BaseRBaseAdapter adapter;

    public abstract Class<?> getClazz();

    public BaseRBaseAdapter getAdapter() {
        return this.adapter;
    }

    public class ViewHolder {
        public ListView mListView;
        public EditText mSearchView;
        private final BaseRFragment this$0;

        public ViewHolder(BaseRFragment baseRFragment) {
            this.this$0 = baseRFragment;
        }
    }

    public void copyToClipboard(String str) {
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setText(str);
    }

    public BaseRBaseAdapter onCreateAdapter(Bundle bundle) throws IllegalAccessException {
        return (BaseRBaseAdapter) null;
    }

    public void showDialog(BaseRItem baseRItem) {
        String str = baseRItem.name;
        int i = baseRItem.f4936id;
        Class<?> clazz = getClazz();
        String string = new StringBuffer().append("0x").append(Integer.toHexString(i)).toString();
        String string2 = new StringBuffer().append(new StringBuffer().append(clazz.getCanonicalName()).append(".").toString()).append(str).toString();
        String string3 = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("@").append(clazz.getPackage().getName()).toString()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString()).append(clazz.getSimpleName()).toString()).append("/").toString()).append(FragmentTag.TAG_THENCE.equals(getTag()) ? str.replace("_", ".") : str).toString();
        StringBuffer stringBuffer = new StringBuffer();
        if (Utils.isCN()) {
            stringBuffer.append("名称：").append(str);
            stringBuffer.append("\n\n资源ID：");
            stringBuffer.append("\n10进制：").append(i);
            stringBuffer.append("\n16进制：").append(string);
            stringBuffer.append("\n\n引用：");
            stringBuffer.append("\nJava：").append(string2);
        } else {
            stringBuffer.append("Name: ").append(str);
            stringBuffer.append("\n\nResources ID: ");
            stringBuffer.append("\n10 Hex: ").append(i);
            stringBuffer.append("\n16 Hex: ").append(string);
            stringBuffer.append("\n\nQuote: ");
            stringBuffer.append("\nJava：").append(string2);
        }
        if (!FragmentTag.TAG_TEXTAPPEARANCE.equals(getTag())) {
            stringBuffer.append("\nXML：").append(string3);
        }
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(getActivity()).setTitle(Utils.isCN() ? "详细信息" : "Detail info").setMessage(stringBuffer.toString()).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.copy, (DialogInterface.OnClickListener) null);
        if (FragmentTag.TAG_DRAWABLE.equals(getTag())) {
            neutralButton.setIcon(baseRItem.f4936id);
        }
        if (FragmentTag.TAG_THENCE.equals(getTag())) {
            neutralButton.setNegativeButton(Utils.isCN() ? "预览" : "preview", new DialogInterface.OnClickListener(this, baseRItem, str) {
                private final BaseRFragment this$0;
                private final BaseRItem val$item;
                private final String val$name;

                {
                    this.this$0 = this;
                    this.val$item = baseRItem;
                    this.val$name = str;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i2) {
                    try {
                        this.this$0.startActivity(new Intent(this.this$0.getActivity(), Class.forName("com.almlkaide.kaypro.aide.application.activity.androidr.AndroidRActivity")).putExtra("themeid", this.val$item.f4936id).putExtra("tag", "FragmentThemePreview").putExtra(Config.FEED_LIST_ITEM_TITLE, this.val$name));
                    } catch (ClassNotFoundException e) {
                        throw new NoClassDefFoundError(e.getMessage());
                    }
                }
            });
        }
        AlertDialog alertDialogCreate = neutralButton.create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-3).setOnClickListener(new AnonymousClass100000005(this, str, i, string2, string3));
        TextView textView = (TextView) alertDialogCreate.findViewById(R.id.message);
        if (textView != null) {
            textView.setTextIsSelectable(true);
        }
    }

    class AnonymousClass100000005 implements View.OnClickListener {
        private final BaseRFragment this$0;
        private final String val$code_java;
        private final String val$code_xml;
        private final int val$id;
        private final String val$name;

        AnonymousClass100000005(BaseRFragment baseRFragment, String str, int i, String str2, String str3) {
            this.this$0 = baseRFragment;
            this.val$name = str;
            this.val$id = i;
            this.val$code_java = str2;
            this.val$code_xml = str3;
        }

        @Override
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(this.this$0.getActivity(), view);
            Menu menu = popupMenu.getMenu();
            menu.add(Utils.isCN() ? "复制名称" : "Copy name").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, this.val$name) {
                private final AnonymousClass100000005 this$0;
                private final String val$name;

                {
                    this.this$0 = this;
                    this.val$name = str;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.this$0.copyToClipboard(this.val$name);
                    return false;
                }
            });
            menu.add(Utils.isCN() ? "复制ID" : "Copy id").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, this.val$id) {
                private final AnonymousClass100000005 this$0;
                private final int val$id;

                {
                    this.this$0 = this;
                    this.val$id = i;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.this$0.copyToClipboard(new StringBuffer().append(this.val$id).append("").toString());
                    return false;
                }
            });
            menu.add(Utils.isCN() ? "复制Java引用" : "Copy java Quote").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, this.val$code_java) {
                private final AnonymousClass100000005 this$0;
                private final String val$code_java;

                {
                    this.this$0 = this;
                    this.val$code_java = str;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.this$0.copyToClipboard(this.val$code_java);
                    return false;
                }
            });
            if (!FragmentTag.TAG_TEXTAPPEARANCE.equals(this.this$0.getTag())) {
                menu.add(Utils.isCN() ? "复制XML引用" : "Copy Xml Quote").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, this.val$code_xml) {
                    private final AnonymousClass100000005 this$0;
                    private final String val$code_xml;

                    {
                        this.this$0 = this;
                        this.val$code_xml = str;
                    }

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        this.this$0.this$0.copyToClipboard(this.val$code_xml);
                        return false;
                    }
                });
            }
            popupMenu.show();
        }
    }

    public void onViewCreated(ViewHolder viewHolder, Bundle bundle) {
        if (this.adapter == null) {
            return;
        }
        viewHolder.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            private final BaseRFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.this$0.showDialog(this.this$0.adapter.getItem(i));
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(1);
        linearLayout.addView(new EditText(getActivity()), -1, -2);
        linearLayout.addView(new CustomListView(getActivity()), -1, -1);
        return linearLayout;
    }

    @Override
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view;
        ViewHolder viewHolder = new ViewHolder(this);
        viewHolder.mSearchView = (EditText) linearLayout.getChildAt(0);
        viewHolder.mListView = (ListView) linearLayout.getChildAt(1);
        viewHolder.mSearchView.setHint(Utils.isCN() ? "输入搜索内容..." : "input search content..");
        viewHolder.mSearchView.setSingleLine(true);
        viewHolder.mListView.setFastScrollEnabled(true);
        try {
            this.adapter = onCreateAdapter(bundle);
            if (this.adapter != null) {
                viewHolder.mListView.setAdapter((ListAdapter) this.adapter);
                viewHolder.mSearchView.addTextChangedListener(new TextWatcher(this) {
                    private final BaseRFragment this$0;

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
                        this.this$0.adapter.search(charSequence.toString());
                    }
                });
            }
        } catch (Exception e) {
        }
        onViewCreated(viewHolder, bundle);
    }

    public static int dp2px(float f) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f);
    }
}
