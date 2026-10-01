package com.almlkaide.kaypro.android.dx.util;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;

public class MutabilityException extends ExceptionWithContext {
    public MutabilityException(String str) {
        super(str);
    }

    public MutabilityException(Throwable th) {
        super(th);
    }

    public MutabilityException(String str, Throwable th) {
        super(str, th);
    }
}
