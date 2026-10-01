package com.almlkaide.kaypro.android.dex;

public final class Annotation implements Comparable<Annotation> {

    private final Dex f4971dex;
    private final EncodedValue encodedAnnotation;
    private final byte visibility;

    @Override
    public int compareTo(Annotation annotation) {
        return compareTo2(annotation);
    }

    public Annotation(Dex c1679Dex, byte b, EncodedValue encodedValue) {
        this.f4971dex = c1679Dex;
        this.visibility = b;
        this.encodedAnnotation = encodedValue;
    }

    public byte getVisibility() {
        return this.visibility;
    }

    public EncodedValueReader getReader() {
        return new EncodedValueReader(this.encodedAnnotation, 29);
    }

    public int getTypeIndex() {
        EncodedValueReader reader = getReader();
        reader.readAnnotation();
        return reader.getAnnotationType();
    }

    public void writeTo(Dex.Section section) {
        section.writeByte(this.visibility);
        this.encodedAnnotation.writeTo(section);
    }

    public int compareTo2(Annotation annotation) {
        return this.encodedAnnotation.compareTo2(annotation.encodedAnnotation);
    }

    public String toString() {
        return this.f4971dex == null ? new StringBuffer().append(new StringBuffer().append((int) this.visibility).append(" ").toString()).append(getTypeIndex()).toString() : new StringBuffer().append(new StringBuffer().append((int) this.visibility).append(" ").toString()).append(this.f4971dex.typeNames().get(getTypeIndex())).toString();
    }
}
