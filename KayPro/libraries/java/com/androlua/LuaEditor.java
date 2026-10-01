package com.androlua;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.myopicmobile.textwarrior.android.FreeScrollingTextField;
import com.myopicmobile.textwarrior.android.YoyoNavigationMethod;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.ColorSchemeDark;
import com.myopicmobile.textwarrior.common.ColorSchemeLight;
import com.myopicmobile.textwarrior.common.Document;
import com.myopicmobile.textwarrior.common.DocumentProvider;
import com.myopicmobile.textwarrior.common.LanguageLua;
import com.myopicmobile.textwarrior.common.Lexer;
import com.myopicmobile.textwarrior.common.LinearSearchStrategy;
import com.myopicmobile.textwarrior.common.ReadTask;
import java.io.File;

public class LuaEditor extends FreeScrollingTextField {
    private int _index;
    private Document _inputingDoc;
    private boolean _isWordWrap;
    private String _lastSelectedFile;
    private LinearSearchStrategy finder;

    private int f3723idx;
    private Context mContext;
    private String mKeyword;

    public LuaEditor(Context context) {
        super(context);
        this.mContext = context;
        setTypeface(Typeface.MONOSPACE);
        setTextSize((int) TypedValue.applyDimension(2, FreeScrollingTextField.BASE_TEXT_SIZE_PIXELS, context.getResources().getDisplayMetrics()));
        setShowLineNumbers(true);
        setHighlightCurrentRow(true);
        setWordWrap(false);
        setAutoIndentWidth(2);
        Lexer.setLanguage(LanguageLua.getInstance());
        setNavigationMethod(new YoyoNavigationMethod(this));
        TypedArray typedArrayObtainStyledAttributes = this.mContext.getTheme().obtainStyledAttributes(new int[]{R.attr.colorBackground, R.attr.textColorPrimary, R.attr.textColorHighlight});
        typedArrayObtainStyledAttributes.getColor(0, 16711935);
        int color = typedArrayObtainStyledAttributes.getColor(1, 16711935);
        int color2 = typedArrayObtainStyledAttributes.getColor(2, 16711935);
        typedArrayObtainStyledAttributes.recycle();
        setTextColor(color);
        setTextHighligtColor(color2);
    }

    public void addNames(String[] strArr) {
        LanguageLua languageLua = (LanguageLua) Lexer.getLanguage();
        String[] names = languageLua.getNames();
        String[] strArr2 = new String[names.length + strArr.length];
        System.arraycopy(names, 0, strArr2, 0, names.length);
        System.arraycopy(strArr, 0, strArr2, names.length, strArr.length);
        languageLua.setNames(strArr2);
        Lexer.setLanguage(languageLua);
        respan();
        invalidate();
    }

    public boolean findNext(String str) {
        if (!str.equals(this.mKeyword)) {
            this.mKeyword = str;
            this.f3723idx = 0;
        }
        this.finder = new LinearSearchStrategy();
        String str2 = this.mKeyword;
        if (str2.isEmpty()) {
            selectText(false);
            return false;
        }
        this.f3723idx = this.finder.find(getText(), str2, this.f3723idx, getText().length(), false, false);
        if (this.f3723idx == -1) {
            selectText(false);
            Toast.makeText(this.mContext, "未找到", 500).show();
            this.f3723idx = 0;
            return false;
        }
        setSelection(this.f3723idx, this.mKeyword.length());
        this.f3723idx += this.mKeyword.length();
        moveCaret(this.f3723idx);
        return true;
    }

    public String getSelectedText() {
        return this._hDoc.subSequence(getSelectionStart(), getSelectionEnd() - getSelectionStart()).toString();
    }

    public DocumentProvider getText() {
        return createDocumentProvider();
    }

    public void gotoLine() {
        startGotoMode();
    }

    public void gotoLine(int i) {
        if (i > this._hDoc.getRowCount()) {
            i = this._hDoc.getRowCount();
        }
        setSelection(getText().getLineOffset(i - 1));
    }

    public void insert(int i, String str) {
        selectText(false);
        moveCaret(i);
        paste(str);
    }

    @Override
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState() & (-28673))) {
            switch (i) {
                case 29:
                    selectAll();
                    return true;
                case 31:
                    copy();
                    return true;
                case 50:
                    paste();
                    return true;
                case 52:
                    m7093cut();
                    return true;
            }
        }
        return super.onKeyShortcut(i, keyEvent);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this._index == 0 || i3 <= 0) {
            return;
        }
        moveCaret(this._index);
        this._index = 0;
    }

    public void open(String str) {
        this._lastSelectedFile = str;
        File file = new File(str);
        this._inputingDoc = new Document(this);
        this._inputingDoc.setWordWrap(isWordWrap());
        new ReadTask(this, file).start();
    }

    public void redo() {
        int iRedo = createDocumentProvider().redo();
        if (iRedo >= 0) {
            setEdited(true);
            respan();
            selectText(false);
            moveCaret(iRedo);
            invalidate();
        }
    }

    public void save(String str, boolean z) {
        File file = new File(str);
        if (!file.exists() || !file.canWrite()) {
        }
    }

    public void search() {
        startFindMode();
    }

    public void setBackgoudColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.BACKGROUND, i);
    }

    public void setBasewordColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.NAME, i);
    }

    public void setCommentColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.COMMENT, i);
    }

    public void setDark(boolean z) {
        if (z) {
            setColorScheme(new ColorSchemeDark());
        } else {
            setColorScheme(new ColorSchemeLight());
        }
    }

    public void setKeywordColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.KEYWORD, i);
    }

    public void setPanelBackgroundColor(int i) {
        this._autoCompletePanel.setBackgroundColor(i);
    }

    public void setPanelTextColor(int i) {
        this._autoCompletePanel.setTextColor(i);
    }

    public void setSelection(int i) {
        selectText(false);
        if (hasLayout()) {
            this._index = i;
        } else {
            moveCaret(i);
        }
    }

    public void setStringColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.STRING, i);
    }

    public void setText(CharSequence charSequence) {
        Document document = new Document(this);
        document.setWordWrap(this._isWordWrap);
        document.setText(charSequence);
        setDocumentProvider(new DocumentProvider(document));
    }

    public void setText(CharSequence charSequence, boolean z) {
        replaceText(0, getLength() - 1, charSequence.toString());
    }

    public void setTextColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.FOREGROUND, i);
    }

    public void setTextHighligtColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.SELECTION_BACKGROUND, i);
    }

    public void setUserwordColor(int i) {
        getColorScheme().setColor(ColorScheme.Colorable.LITERAL, i);
    }

    @Override
    public void setWordWrap(boolean z) {
        this._isWordWrap = z;
        super.setWordWrap(z);
    }

    public void startFindMode() {
        startActionMode(new ActionMode.Callback(this) {
            private EditText edit;
            private LinearSearchStrategy finder;

            private int f3725idx;
            private final LuaEditor this$0;

            {
                this.this$0 = this;
            }

            public void findNext() {
                this.finder = new LinearSearchStrategy();
                String string = this.edit.getText().toString();
                if (string.isEmpty()) {
                    this.this$0.selectText(false);
                    return;
                }
                this.f3725idx = this.finder.find(this.this$0.getText(), string, this.f3725idx, this.this$0.getText().length(), false, false);
                if (this.f3725idx == -1) {
                    this.this$0.selectText(false);
                    Toast.makeText(this.this$0.mContext, "未找到", 500).show();
                    this.f3725idx = 0;
                } else {
                    this.this$0.setSelection(this.f3725idx, this.edit.getText().length());
                    this.f3725idx += this.edit.getText().length();
                    this.this$0.moveCaret(this.f3725idx);
                }
            }

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case 2:
                        findNext();
                        break;
                }
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                actionMode.setTitle("搜索");
                actionMode.setSubtitle((CharSequence) null);
                this.edit = new EditText(this, this.this$0.mContext) {
                    private final AnonymousClass100000005 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (charSequence.length() > 0) {
                            this.this$0.f3725idx = 0;
                            findNext();
                        }
                    }
                };
                this.edit.setSingleLine(true);
                this.edit.setImeOptions(3);
                this.edit.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    private final AnonymousClass100000005 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        findNext();
                        return true;
                    }
                });
                this.edit.setLayoutParams(new RadioGroup.LayoutParams(this.this$0.getWidth() / 3, -1));
                menu.add(0, 1, 0, "").setActionView(this.edit);
                menu.add(0, 2, 0, this.this$0.mContext.getString(R.string.search_go));
                this.edit.requestFocus();
                return true;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
    }

    public void startGotoMode() {
        startActionMode(new ActionMode.Callback(this) {
            private EditText edit;

            private int f3724idx;
            private final LuaEditor this$0;

            {
                this.this$0 = this;
            }

            public void _gotoLine() {
                String string = this.edit.getText().toString();
                if (string.isEmpty()) {
                    return;
                }
                int iIntValue = Integer.valueOf(string).intValue();
                if (iIntValue > ((FreeScrollingTextField) this.this$0)._hDoc.getRowCount()) {
                    iIntValue = ((FreeScrollingTextField) this.this$0)._hDoc.getRowCount();
                }
                this.this$0.gotoLine(iIntValue);
            }

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case 2:
                        _gotoLine();
                        break;
                }
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                actionMode.setTitle("转到");
                actionMode.setSubtitle((CharSequence) null);
                this.edit = new EditText(this, this.this$0.mContext) {
                    private final AnonymousClass100000002 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (charSequence.length() > 0) {
                            this.this$0.f3724idx = 0;
                            _gotoLine();
                        }
                    }
                };
                this.edit.setSingleLine(true);
                this.edit.setInputType(2);
                this.edit.setImeOptions(2);
                this.edit.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    private final AnonymousClass100000002 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        _gotoLine();
                        return true;
                    }
                });
                this.edit.setLayoutParams(new RadioGroup.LayoutParams(this.this$0.getWidth() / 3, -1));
                menu.add(0, 1, 0, "").setActionView(this.edit);
                menu.add(0, 2, 0, this.this$0.mContext.getString(R.string.ok));
                this.edit.requestFocus();
                return true;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
    }

    public void undo() {
        int iUndo = createDocumentProvider().undo();
        if (iUndo >= 0) {
            setEdited(true);
            respan();
            selectText(false);
            moveCaret(iUndo);
            invalidate();
        }
    }
}
