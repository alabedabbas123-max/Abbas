package com.google.googlejavaformat.java;

import com.google.common.collect.ImmutableList;
import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.Tree;
import com.sun.tools.javac.tree.JCTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class DimensionHelpers {

    enum SortedDims {
        YES,
        NO
    }

    static TypeWithDims extractDims(Tree node, SortedDims sorted) {
        Iterable<List<AnnotationTree>> dims;
        Deque<List<AnnotationTree>> builder = new ArrayDeque<>();
        Tree node2 = extractDims(builder, node);
        if (sorted == SortedDims.YES) {
            dims = reorderBySourcePosition(builder);
        } else {
            dims = builder;
        }
        return new TypeWithDims(node2, ImmutableList.copyOf(dims));
    }

    private static Iterable<List<AnnotationTree>> reorderBySourcePosition(Deque<List<AnnotationTree>> dims) {
        int lastAnnotation = -1;
        int lastPos = -1;
        int idx = 0;
        for (List<AnnotationTree> dim : dims) {
            if (!dim.isEmpty()) {
                int pos = ((JCTree) dim.get(0)).getStartPosition();
                if (pos < lastPos) {
                    List<List<AnnotationTree>> list = new ArrayList<>(dims);
                    Collections.rotate(list, -(lastAnnotation + 1));
                    return list;
                }
                lastPos = pos;
                lastAnnotation = idx;
            }
            idx++;
        }
        return dims;
    }

    static class C05351 {
        static final int[] $SwitchMap$com$sun$source$tree$Tree$Kind;

        static {
            int[] iArr = new int[Tree.Kind.values().length];
            $SwitchMap$com$sun$source$tree$Tree$Kind = iArr;
            try {
                iArr[Tree.Kind.ARRAY_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    private static Tree extractDims(Deque<List<AnnotationTree>> dims, Tree node) {
        if (C05351.$SwitchMap$com$sun$source$tree$Tree$Kind[node.getKind().ordinal()] == 1) {
            return extractDims(dims, ((ArrayTypeTree) node).getType());
        }
        return node;
    }

    static class TypeWithDims {
        final ImmutableList<List<AnnotationTree>> dims;
        final Tree node;

        public TypeWithDims(Tree node, ImmutableList<List<AnnotationTree>> dims) {
            this.node = node;
            this.dims = dims;
        }
    }
}
