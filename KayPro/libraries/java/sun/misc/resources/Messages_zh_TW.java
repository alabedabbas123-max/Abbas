package sun.misc.resources;

import java.util.ListResourceBundle;

public class Messages_zh_TW extends ListResourceBundle {
    private static final Object[][] contents = {new Object[]{"optpkg.versionerror", "錯誤: {0} JAR 檔使用了無效的版本格式。請檢查文件，以獲得支援的版本格式。"}, new Object[]{"optpkg.attributeerror", "錯誤: {1} JAR 檔中未設定必要的 {0} JAR 標明屬性。"}, new Object[]{"optpkg.attributeserror", "錯誤: {0} JAR 檔中未設定某些必要的 JAR 標明屬性。"}};

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
