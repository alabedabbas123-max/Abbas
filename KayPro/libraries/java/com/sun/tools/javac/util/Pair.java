package com.sun.tools.javac.util;

public class Pair<A, B> {

    public final A f577fst;

    public final B f578snd;

    public Pair(A fst, B snd) {
        this.f577fst = fst;
        this.f578snd = snd;
    }

    public String toString() {
        return "Pair[" + this.f577fst + "," + this.f578snd + "]";
    }

    private static boolean equals(Object x, Object y) {
        return (x == null && y == null) || (x != null && x.equals(y));
    }

    public boolean equals(Object other) {
        return (other instanceof Pair) && equals(this.f577fst, ((Pair) other).f577fst) && equals(this.f578snd, ((Pair) other).f578snd);
    }

    public int hashCode() {
        A a = this.f577fst;
        if (a != null) {
            return this.f578snd == null ? a.hashCode() + 2 : (a.hashCode() * 17) + this.f578snd.hashCode();
        }
        B b = this.f578snd;
        if (b == null) {
            return 0;
        }
        return b.hashCode() + 1;
    }

    public static <A, B> Pair<A, B> m518of(A a, B b) {
        return new Pair<>(a, b);
    }
}
