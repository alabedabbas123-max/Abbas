package a.c;

import java.util.Arrays;

public class ClassB {

    private String f451a;

    private String[] f452b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassB c0168b = (ClassB) obj;
        if (this.f451a.equals(c0168b.f451a)) {
            return Arrays.equals(this.f452b, c0168b.f452b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f451a.hashCode() * 31) + Arrays.hashCode(this.f452b);
    }
}
