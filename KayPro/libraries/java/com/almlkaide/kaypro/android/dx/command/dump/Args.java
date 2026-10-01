package com.almlkaide.kaypro.android.dx.command.dump;

class Args {
    String method;
    boolean debug = false;
    boolean rawBytes = false;
    boolean basicBlocks = false;
    boolean ropBlocks = false;
    boolean ssaBlocks = false;
    String ssaStep = (String) null;
    boolean optimize = false;
    boolean strictParse = false;
    int width = 0;
    boolean dotDump = false;
}
