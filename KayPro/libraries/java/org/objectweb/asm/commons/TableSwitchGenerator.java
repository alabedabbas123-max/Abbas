package org.objectweb.asm.commons;

import org.objectweb.asm.Label;

public interface TableSwitchGenerator {
    void generateCase(int i, Label label);

    void generateDefault();
}
