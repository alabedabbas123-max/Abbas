package com.sun.tools.javac.code;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.ListBuffer;
import java.util.HashMap;
import java.util.Map;

public class DeferredLintHandler {
    protected static final Context.C0723Key<DeferredLintHandler> deferredLintHandlerKey = new Context.C0723Key<>();
    public static final DeferredLintHandler immediateHandler = new DeferredLintHandler() {
        @Override
        public void report(LintLogger logger) {
            logger.report();
        }
    };
    private JCDiagnostic.DiagnosticPosition currentPos;
    private Map<JCDiagnostic.DiagnosticPosition, ListBuffer<LintLogger>> loggersQueue;

    public interface LintLogger {
        void report();
    }

    public static DeferredLintHandler instance(Context context) {
        DeferredLintHandler instance = (DeferredLintHandler) context.m501get(deferredLintHandlerKey);
        if (instance == null) {
            return new DeferredLintHandler(context);
        }
        return instance;
    }

    protected DeferredLintHandler(Context context) {
        this.loggersQueue = new HashMap();
        context.m504put(deferredLintHandlerKey, this);
    }

    private DeferredLintHandler() {
        this.loggersQueue = new HashMap();
    }

    public void report(LintLogger logger) {
        ListBuffer<LintLogger> loggers = this.loggersQueue.get(this.currentPos);
        Assert.checkNonNull(loggers);
        loggers.append(logger);
    }

    public void flush(JCDiagnostic.DiagnosticPosition pos) {
        ListBuffer<LintLogger> loggers = this.loggersQueue.get(pos);
        if (loggers != null) {
            for (LintLogger lintLogger : loggers) {
                lintLogger.report();
            }
            this.loggersQueue.remove(pos);
        }
    }

    public DeferredLintHandler setPos(JCDiagnostic.DiagnosticPosition currentPos) {
        this.currentPos = currentPos;
        this.loggersQueue.put(currentPos, ListBuffer.m512lb());
        return this;
    }
}
