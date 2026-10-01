package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class WindowCallbackak implements Window.Callback {

    private Window.Callback f4062a;

    private a f4063b;

    public interface a {
        void mo6005a(KeyEvent keyEvent);

        void mo6006a(MotionEvent motionEvent);
    }

    public Window.Callback m6008a() {
        return this.f4062a;
    }

    public WindowCallbackak(Window.Callback callback, a aVar) {
        this.f4062a = callback;
        this.f4063b = aVar;
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4062a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f4063b != null) {
            this.f4063b.mo6005a(keyEvent);
        }
        return this.f4062a.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f4062a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4062a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4063b != null) {
            this.f4063b.mo6006a(motionEvent);
        }
        return this.f4062a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4062a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        this.f4062a.onActionModeFinished(actionMode);
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        this.f4062a.onActionModeStarted(actionMode);
    }

    @Override
    public void onAttachedToWindow() {
        this.f4062a.onAttachedToWindow();
    }

    @Override
    public void onContentChanged() {
        this.f4062a.onContentChanged();
    }

    @Override
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f4062a.onCreatePanelMenu(i, menu);
    }

    @Override
    public View onCreatePanelView(int i) {
        return this.f4062a.onCreatePanelView(i);
    }

    @Override
    public void onDetachedFromWindow() {
        this.f4062a.onDetachedFromWindow();
    }

    @Override
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4062a.onMenuItemSelected(i, menuItem);
    }

    @Override
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f4062a.onMenuOpened(i, menu);
    }

    @Override
    public void onPanelClosed(int i, Menu menu) {
        this.f4062a.onPanelClosed(i, menu);
    }

    @Override
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f4062a.onPreparePanel(i, view, menu);
    }

    @Override
    public boolean onSearchRequested() {
        return this.f4062a.onSearchRequested();
    }

    @Override
    @SuppressLint({"NewApi"})
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4062a.onSearchRequested(searchEvent);
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4062a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public void onWindowFocusChanged(boolean z) {
        this.f4062a.onWindowFocusChanged(z);
    }

    @Override
    @SuppressLint({"NewApi"})
    public void onPointerCaptureChanged(boolean z) {
        this.f4062a.onPointerCaptureChanged(z);
    }

    @Override
    @SuppressLint({"NewApi"})
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f4062a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f4062a.onWindowStartingActionMode(callback);
    }

    @Override
    @SuppressLint({"NewApi"})
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f4062a.onWindowStartingActionMode(callback, i);
    }
}
