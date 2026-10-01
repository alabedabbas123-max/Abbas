package com.sun.source.util;

public interface TaskListener {
    void finished(TaskEvent taskEvent);

    void started(TaskEvent taskEvent);
}
