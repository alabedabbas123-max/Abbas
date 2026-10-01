package com.almlkaide.kaypro.android.dx.dex.cf;

import java.io.PrintStream;

public class CfOptions {
    public boolean statistics;
    public int positionInfo = 2;
    public boolean localInfo = false;
    public boolean strictNameCheck = true;
    public boolean optimize = false;
    public String optimizeListFile = (String) null;
    public String dontOptimizeListFile = (String) null;
    public PrintStream warn = System.err;
}
