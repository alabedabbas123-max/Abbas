package com.github.megatronking.stringfog.plugin;

import com.github.megatronking.stringfog.plugin.utils.Log;
import com.github.megatronking.stringfog.plugin.utils.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class StringFogMappingPrinter {
    private String mCurrentClassName;
    private File mMappingFile;
    private BufferedWriter mWriter;

    public StringFogMappingPrinter(File file) {
        this.mMappingFile = file;
    }

    public void endMappingOutput() {
        if (this.mWriter != null) {
            try {
                this.mWriter.close();
            } catch (IOException e) {
            }
        }
    }

    public void ouputInfo(String str, String str2) {
        try {
            this.mWriter.write(new StringBuffer().append("stringfog key : ").append(str).toString());
            this.mWriter.newLine();
            this.mWriter.write(new StringBuffer().append("stringfog impl: ").append(str2).toString());
            this.mWriter.newLine();
        } catch (IOException e) {
        }
    }

    public void output(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!str.equals(this.mCurrentClassName)) {
                this.mWriter.newLine();
                this.mWriter.write(new StringBuffer().append(new StringBuffer().append("[").append(str).toString()).append("]").toString());
                this.mWriter.newLine();
                this.mCurrentClassName = str;
            }
            this.mWriter.write(new StringBuffer().append(new StringBuffer().append(str2).append(" -> ").toString()).append(str3).toString());
            this.mWriter.newLine();
        } catch (IOException e) {
        }
    }

    public void startMappingOutput() {
        try {
            if (this.mMappingFile.exists() && !this.mMappingFile.delete()) {
                throw new IOException();
            }
            File parentFile = this.mMappingFile.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException();
            }
            this.mWriter = new BufferedWriter(new FileWriter(this.mMappingFile));
        } catch (IOException e) {
            Log.m7061e("Create stringfog mapping file failed.");
        }
    }
}
