package com.almlkaide.kaypro.aide.event;

import android.view.MenuItem;
import com.aide.ui.views.editor.OEditor;
import com.aide.ui.views.editor.g;
import com.almlkaide.kaypro.aide.api.SimpleIMainActivity;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.formatter.FormatFactory;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.StringReader;

@Deprecated
public class CodeFormatEvent extends SimpleIMainActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        File currentEditorFile;
        FormatFactory.Type type;
        if (menuItem.getItemId() != com.almlkaide.kaypro.R.id.editorMenuFormatCode || (currentEditorFile = AIDEUtils.getCurrentEditorFile()) == null || (type = FormatFactory.getType(currentEditorFile)) == null) {
            return false;
        }
        formatCode(currentEditorFile, type);
        return true;
    }

    private void formatCode(File file, FormatFactory.Type type) {
        try {
            g editorModel = AIDEUtils.getOEditorView().getEditorModel();
            String str = FormatFactory.format(this.convert, Utils.read2String(editorModel.aM()), type);
            OEditor oEditorView = AIDEUtils.getOEditorView();
            int caretLine = oEditorView.getCaretLine();
            editorModel.j6(new StringReader(str), oEditorView);
            int i = caretLine + 1;
            AIDEUtils.getAIDEEditorPager().j6(i, 1, i, 1);
        } catch (Throwable th) {
            Utils.showExDialog(this.convert, th);
        }
    }
}
