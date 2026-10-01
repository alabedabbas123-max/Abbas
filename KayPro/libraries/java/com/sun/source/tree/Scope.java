package com.sun.source.tree;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public interface Scope {
    TypeElement getEnclosingClass();

    ExecutableElement getEnclosingMethod();

    Scope getEnclosingScope();

    Iterable<? extends Element> getLocalElements();
}
