package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.JCTree;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Env<A> implements Iterable<Env<A>> {
    public A info;
    public JCTree tree;
    public boolean baseClause = false;
    public Env<A> next = null;
    public Env<A> outer = null;
    public JCTree.JCCompilationUnit toplevel = null;
    public JCTree.JCClassDecl enclClass = null;
    public JCTree.JCMethodDecl enclMethod = null;

    public Env(JCTree tree, A info) {
        this.tree = tree;
        this.info = info;
    }

    public Env<A> m466dup(JCTree tree, A info) {
        return dupto(new Env<>(tree, info));
    }

    public Env<A> dupto(Env<A> that) {
        that.next = this;
        that.outer = this.outer;
        that.toplevel = this.toplevel;
        that.enclClass = this.enclClass;
        that.enclMethod = this.enclMethod;
        return that;
    }

    public Env<A> m465dup(JCTree tree) {
        return m466dup(tree, this.info);
    }

    public Env<A> enclosing(int tag) {
        Env<A> env1 = this;
        while (env1 != null && env1.tree.getTag() != tag) {
            env1 = env1.next;
        }
        return env1;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Env[");
        sb.append(this.info);
        if (this.outer == null) {
            str = "";
        } else {
            str = ",outer=" + this.outer;
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<Env<A>> iterator() {
        return new Iterator<Env<A>>() {
            Env<A> next;

            {
                this.next = Env.this;
            }

            @Override
            public boolean hasNext() {
                return this.next.outer != null;
            }

            @Override
            public Env<A> next() {
                if (hasNext()) {
                    Env<A> current = this.next;
                    this.next = current.outer;
                    return current;
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
