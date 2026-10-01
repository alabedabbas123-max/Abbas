package sun.misc;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class CompoundEnumeration<E> implements Enumeration<E> {
    private Enumeration[] enums;
    private int index = 0;

    public CompoundEnumeration(Enumeration[] enums) {
        this.enums = enums;
    }

    private boolean next() {
        while (true) {
            int i = this.index;
            Enumeration[] enumerationArr = this.enums;
            if (i < enumerationArr.length) {
                if (enumerationArr[i] != null && enumerationArr[i].hasMoreElements()) {
                    return true;
                }
                this.index++;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean hasMoreElements() {
        return next();
    }

    @Override
    public E nextElement() {
        if (!next()) {
            throw new NoSuchElementException();
        }
        return (E) this.enums[this.index].nextElement();
    }
}
