package com.sun.source.tree;

import java.util.List;
import javax.lang.model.element.Name;

public interface TypeParameterTree extends Tree {
    List<? extends Tree> getBounds();

    Name getName();
}
