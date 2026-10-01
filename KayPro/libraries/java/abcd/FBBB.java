package abcd;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.aide.ui.browsers.FileBrowser;

public class FBBB {
    public static void m3284log(Context context, CharSequence charSequence) {
        Toast.makeText(context, charSequence, 0).show();
    }

    public static void m3285log(View view, FileBrowser.b bVar) {
        m3284log(view.getContext(), String.format("FH:%s\nv5:%s\nHw:%s\nVH:%d", bVar.FH, bVar.v5, Boolean.valueOf(bVar.Hw), Integer.valueOf(bVar.VH)));
    }
}
