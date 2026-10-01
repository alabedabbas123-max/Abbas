package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;

public class SimException extends ExceptionWithContext {
    public SimException(String str) {
        super(str);
    }

    public SimException(Throwable th) {
        super(th);
    }

    public SimException(String str, Throwable th) {
        super(str, th);
    }
}
