package sun.misc.resources;

import java.util.ListResourceBundle;

public class Messages_zh_CN extends ListResourceBundle {
    private static final Object[][] contents = {new Object[]{"optpkg.versionerror", "错误：{0} JAR 文件中使用的版本格式无效。请检查文档以了解支持的版本格式。"}, new Object[]{"optpkg.attributeerror", "错误：必要的 {0} JAR 标明属性未在 {1} JAR 文件中设置。"}, new Object[]{"optpkg.attributeserror", "错误：某些必要的 JAR 标明属性未在 {0} JAR 文件中设置。"}};

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
