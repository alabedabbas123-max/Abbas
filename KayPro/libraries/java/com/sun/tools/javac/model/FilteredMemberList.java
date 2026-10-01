package com.sun.tools.javac.model;

import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FilteredMemberList extends AbstractList<Symbol> {
    private final Scope scope;

    public FilteredMemberList(Scope scope) {
        this.scope = scope;
    }

    @Override
    public int size() {
        int cnt = 0;
        for (Scope.Entry e = this.scope.elems; e != null; e = e.sibling) {
            if (!unwanted(e.f338sym)) {
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public Symbol get(int index) {
        for (Scope.Entry e = this.scope.elems; e != null; e = e.sibling) {
            if (!unwanted(e.f338sym)) {
                int index2 = index - 1;
                if (index != 0) {
                    index = index2;
                } else {
                    return e.f338sym;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Iterator<Symbol> iterator() {
        return new Iterator<Symbol>() {
            private boolean hasNextForSure = false;
            private Scope.Entry nextEntry;

            {
                this.nextEntry = FilteredMemberList.this.scope.elems;
            }

            @Override
            public boolean hasNext() {
                if (this.hasNextForSure) {
                    return true;
                }
                while (true) {
                    Scope.Entry entry = this.nextEntry;
                    if (entry == null || !FilteredMemberList.unwanted(entry.f338sym)) {
                        break;
                    }
                    this.nextEntry = this.nextEntry.sibling;
                }
                boolean z = this.nextEntry != null;
                this.hasNextForSure = z;
                return z;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public Symbol next() {
                if (hasNext()) {
                    Symbol result = this.nextEntry.f338sym;
                    this.nextEntry = this.nextEntry.sibling;
                    this.hasNextForSure = false;
                    return result;
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static boolean unwanted(Symbol s) {
        return s == null || (s.flags() & 4096) != 0;
    }
}
