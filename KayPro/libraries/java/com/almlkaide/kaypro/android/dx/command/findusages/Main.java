package com.almlkaide.kaypro.android.dx.command.findusages;

import com.almlkaide.kaypro.android.dex.Dex;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public final class Main {
    public static void main(String[] strArr) throws IOException {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        Dex c1679Dex = new Dex(new File(str));
        PrintWriter printWriter = new PrintWriter(System.out);
        new FindUsages(c1679Dex, str2, str3, printWriter).findUsages();
        printWriter.flush();
    }
}
