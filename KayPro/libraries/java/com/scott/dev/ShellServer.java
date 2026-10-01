package com.scott.dev;

import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ThrowableUtils;
import com.almlkaide.kaypro.aide.application.App;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class ShellServer extends Thread {
    private final List<Callback> callbacks = Collections.synchronizedList(new ArrayList());
    private BufferedReader output;
    private Process process;

    public interface Callback {
        void output(CharSequence charSequence);
    }

    public ShellServer(Callback callback, String str, String str2) {
        addCallback(callback);
        ProcessBuilder processBuilder = new ProcessBuilder(str);
        processBuilder.directory(new File(str2));
        processBuilder.redirectErrorStream(true);
        try {
            this.process = processBuilder.start();
            this.output = new BufferedReader(new InputStreamReader(this.process.getInputStream()));
            append("export HOME=$PWD&&cd\nexport TMPDIR=$HOME/tmp\nexport JAVA_HOME=$HOME/openjdk-11.0.1\nexport ANDROID_HOME=$HOME/android-sdk\nexport PATH=$PATH:$HOME/bin\nexport PATH=$PATH:$HOME/openjdk-11.0.1/bin\nexport PATH=$PATH:$HOME/gradle-6.6.1/bin\nexport PATH=$PATH:$HOME/android-sdk/cmdline-tools/latest/bin\nexport PATH=$PATH:$HOME/android-sdk/cmake/bin\n" + String.format("export AIDE_DATA=%s\n", App.getApp().getFilesDir().getParentFile().getAbsolutePath()) + String.format("export AIDE_FILES=%s\n", App.getApp().getFilesDir().getAbsolutePath()) + String.format("export AIDE_EDATA=%s\n", App.getApp().getExternalFilesDir("").getParentFile().getAbsolutePath()) + String.format("export AIDE_EFILES=%s\n", App.getApp().getExternalFilesDir("").getAbsolutePath()), false);
        } catch (Throwable th) {
            LogUtils.eTag("ShellServer", new Object[]{th});
            if (callback != null) {
                callback.output(ThrowableUtils.getFullStackTrace(th).concat(IOUtils.LINE_SEPARATOR_UNIX));
            }
        }
    }

    public ShellServer addCallback(Callback callback) {
        if (callback != null) {
            this.callbacks.add(callback);
        }
        return this;
    }

    public ShellServer removeCallback(Callback callback) {
        if (callback != null) {
            this.callbacks.remove(callback);
        }
        return this;
    }

    public void append(String... strArr) {
        for (String str : strArr) {
            append(str);
        }
    }

    public void append(String str) {
        append(str, true);
    }

    public void append(String str, boolean z) {
        if (z) {
            try {
                if (str.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
                    output(str);
                } else {
                    output(str.concat(IOUtils.LINE_SEPARATOR_UNIX));
                }
            } catch (Throwable th) {
                output(th.toString().concat(IOUtils.LINE_SEPARATOR_UNIX));
                return;
            }
        }
        this.process.getOutputStream().write(str.concat(IOUtils.LINE_SEPARATOR_UNIX).getBytes());
        this.process.getOutputStream().flush();
    }

    public void exit() {
        append("exit");
    }

    @Override
    public void run() {
        while (true) {
            try {
                String line = this.output.readLine();
                if (line == null) {
                    break;
                } else {
                    output(line.concat(IOUtils.LINE_SEPARATOR_UNIX));
                }
            } catch (Throwable th) {
                output(th.toString().concat(IOUtils.LINE_SEPARATOR_UNIX));
                LogUtils.eTag("Run error", new Object[]{th});
            }
        }
        CloseUtils.closeIOQuietly(this.output, this.process.getInputStream(), this.process.getErrorStream(), this.process.getOutputStream());
        this.process.destroy();
    }

    public void output(String str) {
        if (this.callbacks == null || this.callbacks.size() == 0) {
            return;
        }
        for (Callback callback : (Callback[]) this.callbacks.toArray(new Callback[0])) {
            callback.output(str);
        }
    }
}
