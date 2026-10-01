package com.sun.source.util;

import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.Tree;
import java.util.Iterator;

public class TreePath implements Iterable<Tree> {
    private CompilationUnitTree compilationUnit;
    private Tree leaf;
    private TreePath parent;

    public static TreePath getPath(CompilationUnitTree unit, Tree target) {
        return getPath(new TreePath(unit), target);
    }

    public static TreePath getPath(TreePath path, Tree target) {
        path.getClass();
        target.getClass();
        try {
            new TreePathScanner<TreePath, Tree>() {
                @Override
                public TreePath scan(Tree tree, Tree target2) {
                    if (tree == target2) {
                        throw new C1Result(new TreePath(getCurrentPath(), target2));
                    }
                    return (TreePath) super.scan(tree, target2);
                }
            }.scan(path, target);
            return null;
        } catch (C1Result result) {
            return result.path;
        }
    }

    class C1Result extends Error {
        static final long serialVersionUID = -5942088234594905625L;
        TreePath path;

        C1Result(TreePath path) {
            this.path = path;
        }
    }

    public TreePath(CompilationUnitTree t) {
        this(null, t);
    }

    public TreePath(TreePath p, Tree t) {
        if (t.getKind() == Tree.Kind.COMPILATION_UNIT) {
            this.compilationUnit = (CompilationUnitTree) t;
            this.parent = null;
        } else {
            this.compilationUnit = p.compilationUnit;
            this.parent = p;
        }
        this.leaf = t;
    }

    public CompilationUnitTree getCompilationUnit() {
        return this.compilationUnit;
    }

    public Tree getLeaf() {
        return this.leaf;
    }

    public TreePath getParentPath() {
        return this.parent;
    }

    @Override
    public Iterator<Tree> iterator() {
        return new Iterator<Tree>() {
            private TreePath next;

            {
                this.next = TreePath.this;
            }

            @Override
            public boolean hasNext() {
                return this.next != null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public Tree next() {
                Tree t = this.next.leaf;
                this.next = this.next.parent;
                return t;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
