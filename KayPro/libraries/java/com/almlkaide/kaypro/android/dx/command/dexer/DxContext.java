package com.almlkaide.kaypro.android.dx.command.dexer;

import com.almlkaide.kaypro.android.dx.dex.cf.CodeStatistics;
import com.almlkaide.kaypro.android.dx.dex.cf.OptimizerOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class DxContext {
    public final CodeStatistics codeStatistics;

    public final PrintStream f5013err;

    @SuppressWarnings("IOResourceOpenedButNotSafelyClosed")
    final PrintStream noop;
    public final OptimizerOptions optimizerOptions;

    public final PrintStream f5014out;

    public DxContext(OutputStream outputStream, OutputStream outputStream2) {
        this.codeStatistics = new CodeStatistics();
        this.optimizerOptions = new OptimizerOptions();
        this.noop = new PrintStream(new OutputStream(this) {
            private final DxContext this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void write(int i) throws IOException {
            }
        });
        this.f5014out = new PrintStream(outputStream);
        this.f5013err = new PrintStream(outputStream2);
    }

    public DxContext() {
        this(System.out, System.err);
    }
}
