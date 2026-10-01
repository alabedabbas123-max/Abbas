package com.sun.source.tree;

import java.util.List;
import java.util.Set;
import javax.lang.model.element.Modifier;

public interface ModifiersTree extends Tree {
    List<? extends AnnotationTree> getAnnotations();

    Set<Modifier> getFlags();
}
