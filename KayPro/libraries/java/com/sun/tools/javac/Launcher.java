package com.sun.tools.javac;

import javax.tools.ToolProvider;

class Launcher {
    Launcher() {
    }

    public static void main(String... args) {
        ToolProvider.getSystemJavaCompiler();
    }
}
