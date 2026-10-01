package com.almlkaide.kaypro.aide.application.activity.icons;

import com.blankj.utilcode.util.FileUtils;
import com.caverock.androidsvg.SVG;
import java.util.Locale;

public class Icon {
    private String filePath;

    public TextHighlight f4943hig = new TextHighlight(this);

    private SVG f4944svg;

    public void setSvg(SVG c1580svg) {
        this.f4944svg = c1580svg;
    }

    public SVG getSvg() {
        return this.f4944svg;
    }

    public String getFileName(String str) {
        String fileName = FileUtils.getFileName(getFilePath());
        int iLastIndexOf = fileName.lastIndexOf(".");
        if (iLastIndexOf > 0) {
            fileName = getFilePath().substring(0, iLastIndexOf);
        }
        return new StringBuffer().append(new StringBuffer().append("ic_").append(fileName.replace("-", "_")).toString()).append(str).toString().toLowerCase(Locale.ENGLISH);
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileName() {
        return FileUtils.getFileName(this.filePath);
    }

    public String getFileNameNoExtension() {
        return FileUtils.getFileNameNoExtension(this.filePath);
    }

    public class Highlight {
        private final Icon this$0;
        public int start = -1;

        public int f4945end = -1;

        public Highlight(Icon icon) {
            this.this$0 = icon;
        }
    }

    public class TextHighlight {
        private final Icon this$0;
        public Highlight title;

        public TextHighlight(Icon icon) {
            this.this$0 = icon;
            this.title = new Highlight(this.this$0);
        }
    }
}
