package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.util.List;

public class AttrContext {
    Lint lint;
    Scope scope = null;
    int staticLevel = 0;
    boolean isSelfCall = false;
    boolean selectSuper = false;
    boolean varArgs = false;
    List<Type> tvars = List.m507nil();
    Symbol enclVar = null;

    AttrContext m463dup(Scope scope) {
        AttrContext info = new AttrContext();
        info.scope = scope;
        info.staticLevel = this.staticLevel;
        info.isSelfCall = this.isSelfCall;
        info.selectSuper = this.selectSuper;
        info.varArgs = this.varArgs;
        info.tvars = this.tvars;
        info.lint = this.lint;
        info.enclVar = this.enclVar;
        return info;
    }

    AttrContext m462dup() {
        return m463dup(this.scope);
    }

    public Iterable<Symbol> getLocalElements() {
        Scope scope = this.scope;
        if (scope == null) {
            return List.m507nil();
        }
        return scope.getElements();
    }

    public String toString() {
        return "AttrContext[" + this.scope.toString() + "]";
    }
}
