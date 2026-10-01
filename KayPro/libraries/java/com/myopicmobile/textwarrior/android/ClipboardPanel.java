package com.myopicmobile.textwarrior.android;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

public class ClipboardPanel {
    private ActionMode _clipboardActionMode;
    private Context _context;
    protected FreeScrollingTextField _textField;

    public ClipboardPanel(FreeScrollingTextField freeScrollingTextField) {
        this._textField = freeScrollingTextField;
        this._context = freeScrollingTextField.getContext();
    }

    public Context getContext() {
        return this._context;
    }

    public void hide() {
        stopClipboardAction();
    }

    public void show() {
        startClipboardAction();
    }

    public void startClipboardAction() {
        if (this._clipboardActionMode == null) {
            this._textField.startActionMode(new ActionMode.Callback(this) {
                private final ClipboardPanel this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case 0:
                            this.this$0._textField.selectAll();
                            break;
                        case 1:
                            this.this$0._textField.m7093cut();
                            actionMode.finish();
                            break;
                        case 2:
                            this.this$0._textField.copy();
                            actionMode.finish();
                            break;
                        case 3:
                            this.this$0._textField.paste();
                            actionMode.finish();
                            break;
                    }
                    return false;
                }

                @Override
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    this.this$0._clipboardActionMode = actionMode;
                    actionMode.setTitle(R.string.selectTextMode);
                    TypedArray typedArrayObtainStyledAttributes = this.this$0._context.getTheme().obtainStyledAttributes(new int[]{R.attr.actionModeSelectAllDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModePasteDrawable});
                    menu.add(0, 0, 0, this.this$0._context.getString(R.string.selectAll)).setShowAsActionFlags(2).setAlphabeticShortcut('a').setIcon(typedArrayObtainStyledAttributes.getDrawable(0));
                    menu.add(0, 1, 0, this.this$0._context.getString(R.string.cut)).setShowAsActionFlags(2).setAlphabeticShortcut('x').setIcon(typedArrayObtainStyledAttributes.getDrawable(1));
                    menu.add(0, 2, 0, this.this$0._context.getString(R.string.copy)).setShowAsActionFlags(2).setAlphabeticShortcut('c').setIcon(typedArrayObtainStyledAttributes.getDrawable(2));
                    menu.add(0, 3, 0, this.this$0._context.getString(R.string.paste)).setShowAsActionFlags(2).setAlphabeticShortcut('v').setIcon(typedArrayObtainStyledAttributes.getDrawable(3));
                    typedArrayObtainStyledAttributes.recycle();
                    return true;
                }

                @Override
                public void onDestroyActionMode(ActionMode actionMode) {
                    this.this$0._textField.selectText(false);
                    this.this$0._clipboardActionMode = (ActionMode) null;
                }

                @Override
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
        }
    }

    public void stopClipboardAction() {
        if (this._clipboardActionMode != null) {
            this._clipboardActionMode.finish();
            this._clipboardActionMode = (ActionMode) null;
        }
    }
}
