package com.almlkaide.kaypro.android.dx.command.dump;

import com.almlkaide.kaypro.android.dex.util.FileUtils;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.util.HexParser;
import java.io.UnsupportedEncodingException;

public class Main {
    private final Args parsedArgs = new Args();

    Main() {
    }

    public static void main(String[] strArr) {
        new Main().m7146run(strArr);
    }

    private void m7146run(String[] strArr) {
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str.equals("--") || !str.startsWith("--")) {
                break;
            }
            if (str.equals("--bytes")) {
                this.parsedArgs.rawBytes = true;
            } else if (str.equals("--basic-blocks")) {
                this.parsedArgs.basicBlocks = true;
            } else if (str.equals("--rop-blocks")) {
                this.parsedArgs.ropBlocks = true;
            } else if (str.equals("--optimize")) {
                this.parsedArgs.optimize = true;
            } else if (str.equals("--ssa-blocks")) {
                this.parsedArgs.ssaBlocks = true;
            } else if (str.startsWith("--ssa-step=")) {
                this.parsedArgs.ssaStep = str.substring(str.indexOf(61) + 1);
            } else if (str.equals("--debug")) {
                this.parsedArgs.debug = true;
            } else if (str.equals("--dot")) {
                this.parsedArgs.dotDump = true;
            } else if (str.equals("--strict")) {
                this.parsedArgs.strictParse = true;
            } else if (str.startsWith("--width=")) {
                String strSubstring = str.substring(str.indexOf(61) + 1);
                this.parsedArgs.width = Integer.parseInt(strSubstring);
            } else if (str.startsWith("--method=")) {
                this.parsedArgs.method = str.substring(str.indexOf(61) + 1);
            } else {
                System.err.println(new StringBuffer().append("unknown option: ").append(str).toString());
                throw new RuntimeException("usage");
            }
            i++;
        }
        if (i == strArr.length) {
            System.err.println("no input files specified");
            throw new RuntimeException("usage");
        }
        while (i < strArr.length) {
            try {
                String str2 = strArr[i];
                System.out.println(new StringBuffer().append(new StringBuffer().append("reading ").append(str2).toString()).append("...").toString());
                byte[] file = FileUtils.readFile(str2);
                if (!str2.endsWith(".class")) {
                    try {
                        file = HexParser.parse(new String(file, "utf-8"));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException("shouldn't happen", e);
                    }
                }
                processOne(str2, file);
            } catch (ParseException e2) {
                System.err.println("\ntrouble parsing:");
                if (this.parsedArgs.debug) {
                    e2.printStackTrace();
                } else {
                    e2.printContext(System.err);
                }
            }
            i++;
        }
    }

    private void processOne(String str, byte[] bArr) {
        if (this.parsedArgs.dotDump) {
            DotDumper.dump(bArr, str, this.parsedArgs);
            return;
        }
        if (this.parsedArgs.basicBlocks) {
            BlockDumper.dump(bArr, System.out, str, false, this.parsedArgs);
            return;
        }
        if (this.parsedArgs.ropBlocks) {
            BlockDumper.dump(bArr, System.out, str, true, this.parsedArgs);
        } else if (this.parsedArgs.ssaBlocks) {
            this.parsedArgs.optimize = false;
            SsaDumper.dump(bArr, System.out, str, this.parsedArgs);
        } else {
            ClassDumper.dump(bArr, System.out, str, this.parsedArgs);
        }
    }
}
