package com.a.b.c.a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class ClassF {

    private HashSet f1980a;

    private HashSet f1981b;

    private boolean f1982c;

    private static HashSet m4226b(String str) {
        HashSet hashSet = new HashSet();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    fileReader.close();
                    return hashSet;
                }
                hashSet.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error with optimize list: " + str, e);
        }
    }

    public void m4227a(String str, String str2) {
        if (this.f1982c) {
            return;
        }
        if (str != null && str2 != null) {
            throw new RuntimeException("optimize and don't optimize lists  are mutually exclusive.");
        }
        if (str != null) {
            this.f1980a = m4226b(str);
        }
        if (str2 != null) {
            this.f1981b = m4226b(str2);
        }
        this.f1982c = true;
    }

    public boolean m4228a(String str) {
        if (this.f1980a != null) {
            return this.f1980a.contains(str);
        }
        return this.f1981b == null || !this.f1981b.contains(str);
    }
}
