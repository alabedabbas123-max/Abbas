package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;

public class DexException extends ExceptionWithContext {
    public DexException(String str) {
        super(str);
    }

    public DexException(Throwable th) {
        super(th);
    }
}
