package com.sun.tools.javac.processing;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.Parameterizable;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleElementVisitor7;

@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedAnnotationTypes({"*"})
public class PrintingProcessor extends AbstractProcessor {
    PrintWriter writer = new PrintWriter(System.out);

    public void setWriter(Writer w) {
        this.writer = new PrintWriter(w);
    }

    @Override
    public boolean process(Set<? extends TypeElement> tes, RoundEnvironment renv) {
        for (Element element : renv.getRootElements()) {
            print(element);
        }
        return true;
    }

    void print(Element element) {
        new PrintingElementVisitor(this.writer, this.processingEnv.getElementUtils()).visit(element).flush();
    }

    public static class PrintingElementVisitor extends SimpleElementVisitor7<PrintingElementVisitor, Boolean> {
        private static final String[] spaces = {"", "  ", "    ", "      ", "        ", "          ", "            ", "              ", "                ", "                  ", "                    "};
        final Elements elementUtils;
        int indentation = 0;
        final PrintWriter writer;

        public PrintingElementVisitor(Writer w, Elements elementUtils) {
            this.writer = new PrintWriter(w);
            this.elementUtils = elementUtils;
        }

        @Override
        public PrintingElementVisitor defaultAction(Element e, Boolean newLine) {
            if (newLine != null && newLine.booleanValue()) {
                this.writer.println();
            }
            printDocComment(e);
            printModifiers(e);
            return this;
        }

        @Override
        public PrintingElementVisitor visitExecutable(ExecutableElement e, Boolean p) {
            ElementKind kind = e.getKind();
            if (kind != ElementKind.STATIC_INIT && kind != ElementKind.INSTANCE_INIT) {
                Element enclosing = e.getEnclosingElement();
                if (kind == ElementKind.CONSTRUCTOR && enclosing != null && NestingKind.ANONYMOUS == new SimpleElementVisitor7<NestingKind, Void>() {
                    @Override
                    public NestingKind visitType(TypeElement e2, Void p2) {
                        return e2.getNestingKind();
                    }
                }.visit(enclosing)) {
                    return this;
                }
                defaultAction((Element) e, (Boolean) true);
                printFormalTypeParameters(e, true);
                int i = C07151.$SwitchMap$javax$lang$model$element$ElementKind[kind.ordinal()];
                if (i == 1) {
                    this.writer.print(e.getEnclosingElement().getSimpleName());
                } else if (i == 2) {
                    this.writer.print(e.getReturnType().toString());
                    this.writer.print(" ");
                    this.writer.print(e.getSimpleName().toString());
                }
                this.writer.print("(");
                printParameters(e);
                this.writer.print(")");
                AnnotationValue defaultValue = e.getDefaultValue();
                if (defaultValue != null) {
                    this.writer.print(" default " + defaultValue);
                }
                printThrows(e);
                this.writer.println(";");
            }
            return this;
        }

        @Override
        public PrintingElementVisitor visitType(TypeElement e, Boolean p) {
            ElementKind kind = e.getKind();
            NestingKind nestingKind = e.getNestingKind();
            if (NestingKind.ANONYMOUS == nestingKind) {
                this.writer.print("new ");
                List<? extends TypeMirror> interfaces = e.getInterfaces();
                if (!interfaces.isEmpty()) {
                    this.writer.print(interfaces.get(0));
                } else {
                    this.writer.print(e.getSuperclass());
                }
                this.writer.print("(");
                if (interfaces.isEmpty()) {
                    List<? extends ExecutableElement> constructors = ElementFilter.constructorsIn(e.getEnclosedElements());
                    if (!constructors.isEmpty()) {
                        printParameters(constructors.get(0));
                    }
                }
                this.writer.print(")");
            } else {
                if (nestingKind == NestingKind.TOP_LEVEL) {
                    PackageElement pkg = this.elementUtils.getPackageOf(e);
                    if (!pkg.isUnnamed()) {
                        this.writer.print("package " + ((Object) pkg.getQualifiedName()) + ";\n");
                    }
                }
                defaultAction((Element) e, (Boolean) true);
                if (C07151.$SwitchMap$javax$lang$model$element$ElementKind[kind.ordinal()] == 3) {
                    this.writer.print("@interface");
                } else {
                    this.writer.print(kind.toString().toLowerCase());
                }
                this.writer.print(" ");
                this.writer.print(e.getSimpleName());
                printFormalTypeParameters(e, false);
                if (kind == ElementKind.CLASS) {
                    TypeMirror supertype = e.getSuperclass();
                    if (supertype.getKind() != TypeKind.NONE) {
                        TypeElement e2 = (TypeElement) ((DeclaredType) supertype).asElement();
                        if (e2.getSuperclass().getKind() != TypeKind.NONE) {
                            this.writer.print(" extends " + supertype);
                        }
                    }
                }
                printInterfaces(e);
            }
            this.writer.println(" {");
            this.indentation++;
            if (kind == ElementKind.ENUM) {
                List<Element> enclosedElements = new ArrayList<>(e.getEnclosedElements());
                List<Element> enumConstants = new ArrayList<>();
                for (Element element : enclosedElements) {
                    if (element.getKind() == ElementKind.ENUM_CONSTANT) {
                        enumConstants.add(element);
                    }
                }
                if (!enumConstants.isEmpty()) {
                    int i = 0;
                    while (i < enumConstants.size() - 1) {
                        visit(enumConstants.get(i), true);
                        this.writer.print(",");
                        i++;
                    }
                    visit(enumConstants.get(i), true);
                    this.writer.println(";\n");
                    enclosedElements.removeAll(enumConstants);
                }
                for (Element element2 : enclosedElements) {
                    visit(element2);
                }
            } else {
                for (Element element3 : e.getEnclosedElements()) {
                    visit(element3);
                }
            }
            this.indentation--;
            indent();
            this.writer.println("}");
            return this;
        }

        @Override
        public PrintingElementVisitor visitVariable(VariableElement e, Boolean newLine) {
            ElementKind kind = e.getKind();
            defaultAction((Element) e, newLine);
            if (kind == ElementKind.ENUM_CONSTANT) {
                this.writer.print(e.getSimpleName());
            } else {
                this.writer.print(e.asType().toString() + " " + ((Object) e.getSimpleName()));
                Object constantValue = e.getConstantValue();
                if (constantValue != null) {
                    this.writer.print(" = ");
                    this.writer.print(this.elementUtils.getConstantExpression(constantValue));
                }
                this.writer.println(";");
            }
            return this;
        }

        @Override
        public PrintingElementVisitor visitTypeParameter(TypeParameterElement e, Boolean p) {
            this.writer.print(e.getSimpleName());
            return this;
        }

        @Override
        public PrintingElementVisitor visitPackage(PackageElement e, Boolean p) {
            defaultAction((Element) e, (Boolean) false);
            if (!e.isUnnamed()) {
                this.writer.println("package " + ((Object) e.getQualifiedName()) + ";");
            } else {
                this.writer.println("// Unnamed package");
            }
            return this;
        }

        public void flush() {
            this.writer.flush();
        }

        private void printDocComment(Element e) {
            String docComment = this.elementUtils.getDocComment(e);
            if (docComment != null) {
                StringTokenizer st = new StringTokenizer(docComment, "\n\r");
                indent();
                this.writer.println("/**");
                while (st.hasMoreTokens()) {
                    indent();
                    this.writer.print(" *");
                    this.writer.println(st.nextToken());
                }
                indent();
                this.writer.println(" */");
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        private void printModifiers(Element e) {
            Element enclosingElement;
            ElementKind kind = e.getKind();
            if (kind == ElementKind.PARAMETER) {
                printAnnotationsInline(e);
            } else {
                printAnnotations(e);
                indent();
            }
            if (kind == ElementKind.ENUM_CONSTANT) {
                return;
            }
            Set<Modifier> modifiers = new LinkedHashSet<>();
            modifiers.addAll(e.getModifiers());
            int i = C07151.$SwitchMap$javax$lang$model$element$ElementKind[kind.ordinal()];
            if (i == 2) {
                enclosingElement = e.getEnclosingElement();
                if (enclosingElement != null && enclosingElement.getKind().isInterface()) {
                    modifiers.remove(Modifier.PUBLIC);
                    modifiers.remove(Modifier.ABSTRACT);
                    modifiers.remove(Modifier.STATIC);
                    modifiers.remove(Modifier.FINAL);
                }
            } else if (i == 3 || i == 4) {
                modifiers.remove(Modifier.ABSTRACT);
            } else if (i == 5) {
                modifiers.remove(Modifier.FINAL);
                modifiers.remove(Modifier.ABSTRACT);
            } else if (i == 6) {
                enclosingElement = e.getEnclosingElement();
                if (enclosingElement != null) {
                    modifiers.remove(Modifier.PUBLIC);
                    modifiers.remove(Modifier.ABSTRACT);
                    modifiers.remove(Modifier.STATIC);
                    modifiers.remove(Modifier.FINAL);
                }
            }
            for (Modifier m : modifiers) {
                this.writer.print(m.toString() + " ");
            }
        }

        private void printFormalTypeParameters(Parameterizable e, boolean pad) {
            List<? extends TypeParameterElement> typeParams = e.getTypeParameters();
            if (typeParams.size() > 0) {
                this.writer.print("<");
                boolean first = true;
                for (TypeParameterElement tpe : typeParams) {
                    if (!first) {
                        this.writer.print(", ");
                    }
                    printAnnotationsInline(tpe);
                    this.writer.print(tpe.toString());
                    first = false;
                }
                this.writer.print(">");
                if (pad) {
                    this.writer.print(" ");
                }
            }
        }

        private void printAnnotationsInline(Element e) {
            List<? extends AnnotationMirror> annots = e.getAnnotationMirrors();
            for (AnnotationMirror annotationMirror : annots) {
                this.writer.print(annotationMirror);
                this.writer.print(" ");
            }
        }

        private void printAnnotations(Element e) {
            List<? extends AnnotationMirror> annots = e.getAnnotationMirrors();
            for (AnnotationMirror annotationMirror : annots) {
                indent();
                this.writer.println(annotationMirror);
            }
        }

        private void printParameters(ExecutableElement e) {
            List<? extends VariableElement> parameters = e.getParameters();
            int size = parameters.size();
            if (size != 0) {
                if (size == 1) {
                    for (VariableElement parameter : parameters) {
                        printModifiers(parameter);
                        if (e.isVarArgs()) {
                            TypeMirror tm = parameter.asType();
                            if (tm.getKind() != TypeKind.ARRAY) {
                                throw new AssertionError("Var-args parameter is not an array type: " + tm);
                            }
                            this.writer.print(((ArrayType) ArrayType.class.cast(tm)).getComponentType());
                            this.writer.print("...");
                        } else {
                            this.writer.print(parameter.asType());
                        }
                        this.writer.print(" " + ((Object) parameter.getSimpleName()));
                    }
                    return;
                }
                int i = 1;
                for (VariableElement parameter2 : parameters) {
                    if (i == 2) {
                        this.indentation++;
                    }
                    if (i > 1) {
                        indent();
                    }
                    printModifiers(parameter2);
                    if (i == size && e.isVarArgs()) {
                        TypeMirror tm2 = parameter2.asType();
                        if (tm2.getKind() != TypeKind.ARRAY) {
                            throw new AssertionError("Var-args parameter is not an array type: " + tm2);
                        }
                        this.writer.print(((ArrayType) ArrayType.class.cast(tm2)).getComponentType());
                        this.writer.print("...");
                    } else {
                        this.writer.print(parameter2.asType());
                    }
                    this.writer.print(" " + ((Object) parameter2.getSimpleName()));
                    if (i < size) {
                        this.writer.println(",");
                    }
                    i++;
                }
                if (parameters.size() >= 2) {
                    this.indentation--;
                }
            }
        }

        private void printInterfaces(TypeElement e) {
            ElementKind kind = e.getKind();
            if (kind != ElementKind.ANNOTATION_TYPE) {
                List<? extends TypeMirror> interfaces = e.getInterfaces();
                if (interfaces.size() > 0) {
                    this.writer.print(kind.isClass() ? " implements" : " extends");
                    boolean first = true;
                    for (TypeMirror interf : interfaces) {
                        if (!first) {
                            this.writer.print(",");
                        }
                        this.writer.print(" ");
                        this.writer.print(interf.toString());
                        first = false;
                    }
                }
            }
        }

        private void printThrows(ExecutableElement e) {
            List<? extends TypeMirror> thrownTypes = e.getThrownTypes();
            int size = thrownTypes.size();
            if (size != 0) {
                this.writer.print(" throws");
                int i = 1;
                for (TypeMirror thrownType : thrownTypes) {
                    if (i == 1) {
                        this.writer.print(" ");
                    }
                    if (i == 2) {
                        this.indentation++;
                    }
                    if (i >= 2) {
                        indent();
                    }
                    this.writer.print(thrownType);
                    if (i != size) {
                        this.writer.println(", ");
                    }
                    i++;
                }
                if (size >= 2) {
                    this.indentation--;
                }
            }
        }

        private void indent() {
            int indentation = this.indentation;
            if (indentation < 0) {
                return;
            }
            int maxIndex = spaces.length - 1;
            while (indentation > maxIndex) {
                this.writer.print(spaces[maxIndex]);
                indentation -= maxIndex;
            }
            this.writer.print(spaces[indentation]);
        }
    }

    static class C07151 {
        static final int[] $SwitchMap$javax$lang$model$element$ElementKind;

        static {
            int[] iArr = new int[ElementKind.values().length];
            $SwitchMap$javax$lang$model$element$ElementKind = iArr;
            try {
                iArr[ElementKind.CONSTRUCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.METHOD.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.ANNOTATION_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.INTERFACE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.ENUM.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$javax$lang$model$element$ElementKind[ElementKind.FIELD.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }
}
