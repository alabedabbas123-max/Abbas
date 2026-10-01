package a;

import a.ad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;

public class ClassQ extends ad {
    public ClassQ(File file) {
        super(new LineNumberReader(new BufferedReader(new FileReader(file))), "file '" + file.getPath() + "'", file.getParentFile());
    }

    public ClassQ(URL url) {
        super(new LineNumberReader(new BufferedReader(new InputStreamReader(url.openStream()))), "file '" + url.toString() + "'", (File) null);
    }
}
