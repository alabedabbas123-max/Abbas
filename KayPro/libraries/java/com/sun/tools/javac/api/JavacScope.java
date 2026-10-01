package com.sun.tools.javac.api;

import com.sun.source.tree.Scope;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class JavacScope implements Scope {

    protected final Env<AttrContext> f323env;

    JavacScope(Env<AttrContext> env) {
        env.getClass();
        this.f323env = env;
    }

    @Override
    public JavacScope getEnclosingScope() {
        if (this.f323env.outer != null && this.f323env.outer != this.f323env) {
            return new JavacScope(this.f323env.outer);
        }
        return new JavacScope(this.f323env) {
            @Override
            public boolean isStarImportScope() {
                return true;
            }

            @Override
            public JavacScope getEnclosingScope() {
                return null;
            }

            @Override
            public Iterable<? extends Element> getLocalElements() {
                return this.f323env.toplevel.starImportScope.getElements();
            }
        };
    }

    @Override
    public TypeElement getEnclosingClass() {
        if (this.f323env.outer != null) {
            Env<AttrContext> c0621Env = this.f323env.outer;
            Env<AttrContext> c0621Env2 = this.f323env;
            if (c0621Env != c0621Env2) {
                return c0621Env2.enclClass.f539sym;
            }
        }
        return null;
    }

    @Override
    public ExecutableElement getEnclosingMethod() {
        if (this.f323env.enclMethod == null) {
            return null;
        }
        return this.f323env.enclMethod.f544sym;
    }

    @Override
    public Iterable<? extends Element> getLocalElements() {
        return this.f323env.info.getLocalElements();
    }

    public Env<AttrContext> getEnv() {
        return this.f323env;
    }

    public boolean isStarImportScope() {
        return false;
    }

    public boolean equals(Object other) {
        if (!(other instanceof JavacScope)) {
            return false;
        }
        JavacScope s = (JavacScope) other;
        return this.f323env.equals(s.f323env) && isStarImportScope() == s.isStarImportScope();
    }

    public int hashCode() {
        return this.f323env.hashCode() + (isStarImportScope() ? 1 : 0);
    }

    public String toString() {
        return "JavacScope[env=" + this.f323env + ",starImport=" + isStarImportScope() + "]";
    }
}
