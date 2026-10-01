package com.sun.tools.javac.code;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import java.util.Iterator;

public class Scope {
    private static final int INITIAL_SIZE = 16;
    public Entry elems;
    int hashMask;
    List<ScopeListener> listeners;
    int nelems;
    public Scope next;
    public Symbol owner;
    private int shared;
    Entry[] table;
    private static final Entry sentinel = new Entry(null, null, null, null);
    public static final Scope emptyScope = new Scope(null, null, new Entry[0]);
    static final Filter<Symbol> noFilter = new Filter<Symbol>() {
        @Override
        public boolean accepts(Symbol s) {
            return true;
        }
    };

    public interface ScopeListener {
        void symbolAdded(Symbol symbol, Scope scope);

        void symbolRemoved(Symbol symbol, Scope scope);
    }

    private Scope(Scope next, Symbol owner, Entry[] table) {
        this.nelems = 0;
        this.listeners = List.m507nil();
        this.next = next;
        Assert.check(emptyScope == null || owner != null);
        this.owner = owner;
        this.table = table;
        this.hashMask = table.length - 1;
    }

    private Scope(Scope next, Symbol owner, Entry[] table, int nelems) {
        this(next, owner, table);
        this.nelems = nelems;
    }

    public Scope(Symbol owner) {
        this(null, owner, new Entry[16]);
    }

    public Scope mo450dup() {
        return mo451dup(this.owner);
    }

    public Scope mo451dup(Symbol newOwner) {
        Scope result = new Scope(this, newOwner, this.table, this.nelems);
        this.shared++;
        return result;
    }

    public Scope dupUnshared() {
        return new Scope(this, this.owner, (Entry[]) this.table.clone(), this.nelems);
    }

    public Scope leave() {
        Assert.check(this.shared == 0);
        Entry[] entryArr = this.table;
        Scope scope = this.next;
        if (entryArr != scope.table) {
            return scope;
        }
        while (true) {
            Entry entry = this.elems;
            if (entry == null) {
                break;
            }
            int hash = getIndex(entry.f338sym.name);
            Entry e = this.table[hash];
            Assert.check(e == this.elems, this.elems.f338sym);
            this.table[hash] = this.elems.shadowed;
            this.elems = this.elems.sibling;
        }
        Assert.check(this.next.shared > 0);
        Scope scope2 = this.next;
        scope2.shared--;
        scope2.nelems = this.nelems;
        return scope2;
    }

    private void dble() {
        Assert.check(this.shared == 0);
        Entry[] oldtable = this.table;
        Entry[] newtable = new Entry[oldtable.length * 2];
        Scope s = this;
        while (s != null) {
            if (s.table == oldtable) {
                Assert.check(s == this || s.shared != 0);
                s.table = newtable;
                s.hashMask = newtable.length - 1;
            }
            s = s.next;
        }
        int n = 0;
        int i = oldtable.length;
        while (true) {
            i--;
            if (i >= 0) {
                Entry e = oldtable[i];
                if (e != null && e != sentinel) {
                    this.table[getIndex(e.f338sym.name)] = e;
                    n++;
                }
            } else {
                this.nelems = n;
                return;
            }
        }
    }

    public void enter(Symbol sym) {
        Assert.check(this.shared == 0);
        enter(sym, this);
    }

    public void enter(Symbol sym, Scope s) {
        enter(sym, s, s);
    }

    public void enter(Symbol sym, Scope s, Scope origin) {
        Assert.check(this.shared == 0);
        if (this.nelems * 3 >= this.hashMask * 2) {
            dble();
        }
        int hash = getIndex(sym.name);
        Entry old = this.table[hash];
        if (old == null) {
            old = sentinel;
            this.nelems++;
        }
        Entry e = makeEntry(sym, old, this.elems, s, origin);
        this.table[hash] = e;
        this.elems = e;
        for (List list = this.listeners; list.nonEmpty(); list = list.tail) {
            ((ScopeListener) list.head).symbolAdded(sym, this);
        }
    }

    Entry makeEntry(Symbol sym, Entry shadowed, Entry sibling, Scope scope, Scope origin) {
        return new Entry(sym, shadowed, sibling, scope);
    }

    public void addScopeListener(ScopeListener sl) {
        this.listeners = this.listeners.prepend(sl);
    }

    public void remove(Symbol sym) {
        Assert.check(this.shared == 0);
        Entry e = lookup(sym.name);
        if (e.scope == null) {
            return;
        }
        int i = getIndex(sym.name);
        Entry[] entryArr = this.table;
        Entry te = entryArr[i];
        if (te == e) {
            entryArr[i] = e.shadowed;
        } else {
            while (te.shadowed != e) {
                te = te.shadowed;
            }
            te.shadowed = e.shadowed;
        }
        Entry te2 = this.elems;
        if (te2 == e) {
            this.elems = e.sibling;
        } else {
            while (te2.sibling != e) {
                te2 = te2.sibling;
            }
            te2.sibling = e.sibling;
        }
        for (List list = this.listeners; list.nonEmpty(); list = list.tail) {
            ((ScopeListener) list.head).symbolRemoved(sym, this);
        }
    }

    public void enterIfAbsent(Symbol sym) {
        Assert.check(this.shared == 0);
        Entry e = lookup(sym.name);
        while (e.scope == this && e.f338sym.kind != sym.kind) {
            e = e.next();
        }
        if (e.scope != this) {
            enter(sym);
        }
    }

    public boolean includes(Symbol c) {
        for (Entry e = lookup(c.name); e.scope == this; e = e.next()) {
            if (e.f338sym == c) {
                return true;
            }
        }
        return false;
    }

    public Entry lookup(Name name) {
        return lookup(name, noFilter);
    }

    public Entry lookup(Name name, Filter<Symbol> sf) {
        Entry e = this.table[getIndex(name)];
        if (e == null || e == sentinel) {
            return sentinel;
        }
        while (e.scope != null && (e.f338sym.name != name || !sf.accepts(e.f338sym))) {
            e = e.shadowed;
        }
        return e;
    }

    int getIndex(Name name) {
        int h = name.hashCode();
        int i = this.hashMask;
        int i2 = h & i;
        int x = i - (((h >> 16) + h) << 1);
        int d = -1;
        while (true) {
            Entry e = this.table[i2];
            if (e == null) {
                return d >= 0 ? d : i2;
            }
            if (e == sentinel) {
                if (d < 0) {
                    d = i2;
                }
            } else if (e.f338sym.name == name) {
                return i2;
            }
            i2 = (i2 + x) & this.hashMask;
        }
    }

    public Iterable<Symbol> getElements() {
        return getElements(noFilter);
    }

    public Iterable<Symbol> getElements(final Filter<Symbol> sf) {
        return new Iterable<Symbol>() {
            @Override
            public Iterator<Symbol> iterator() {
                return new Iterator<Symbol>() {
                    private Entry currEntry;
                    private Scope currScope;

                    {
                        this.currScope = Scope.this;
                        this.currEntry = Scope.this.elems;
                        update();
                    }

                    @Override
                    public boolean hasNext() {
                        return this.currEntry != null;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public Symbol next() {
                        Entry entry = this.currEntry;
                        Symbol sym = entry == null ? null : entry.f338sym;
                        Entry entry2 = this.currEntry;
                        if (entry2 != null) {
                            this.currEntry = entry2.sibling;
                        }
                        update();
                        return sym;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    private void update() {
                        skipToNextMatchingEntry();
                        while (this.currEntry == null && this.currScope.next != null) {
                            Scope scope = this.currScope.next;
                            this.currScope = scope;
                            this.currEntry = scope.elems;
                            skipToNextMatchingEntry();
                        }
                    }

                    void skipToNextMatchingEntry() {
                        while (this.currEntry != null && !sf.accepts(this.currEntry.f338sym)) {
                            this.currEntry = this.currEntry.sibling;
                        }
                    }
                };
            }
        };
    }

    public Iterable<Symbol> getElementsByName(Name name) {
        return getElementsByName(name, noFilter);
    }

    public Iterable<Symbol> getElementsByName(final Name name, final Filter<Symbol> sf) {
        return new Iterable<Symbol>() {
            @Override
            public Iterator<Symbol> iterator() {
                return new Iterator<Symbol>() {
                    Entry currentEntry;

                    {
                        this.currentEntry = Scope.this.lookup(name, sf);
                    }

                    @Override
                    public boolean hasNext() {
                        return this.currentEntry.scope != null;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public Symbol next() {
                        Entry prevEntry = this.currentEntry;
                        this.currentEntry = this.currentEntry.next(sf);
                        return prevEntry.f338sym;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Scope[");
        for (Scope s = this; s != null; s = s.next) {
            if (s != this) {
                result.append(" | ");
            }
            for (Entry e = s.elems; e != null; e = e.sibling) {
                if (e != s.elems) {
                    result.append(", ");
                }
                result.append(e.f338sym);
            }
        }
        result.append("]");
        return result.toString();
    }

    public static class Entry {
        public Scope scope;
        private Entry shadowed;
        public Entry sibling;

        public Symbol f338sym;

        public Entry(Symbol sym, Entry shadowed, Entry sibling, Scope scope) {
            this.f338sym = sym;
            this.shadowed = shadowed;
            this.sibling = sibling;
            this.scope = scope;
        }

        public Entry next() {
            return this.shadowed;
        }

        public Entry next(Filter<Symbol> sf) {
            Symbol symbol = this.shadowed.f338sym;
            if (symbol == null || sf.accepts(symbol)) {
                return this.shadowed;
            }
            return this.shadowed.next(sf);
        }

        public Scope getOrigin() {
            return this.scope;
        }
    }

    public static class ImportScope extends Scope {
        public ImportScope(Symbol owner) {
            super(owner);
        }

        @Override
        Entry makeEntry(Symbol sym, Entry shadowed, Entry sibling, Scope scope, Scope origin) {
            return new ImportEntry(sym, shadowed, sibling, scope, origin);
        }

        static class ImportEntry extends Entry {
            private Scope origin;

            ImportEntry(Symbol sym, Entry shadowed, Entry sibling, Scope scope, Scope origin) {
                super(sym, shadowed, sibling, scope);
                this.origin = origin;
            }

            @Override
            public Scope getOrigin() {
                return this.origin;
            }
        }
    }

    public static class StarImportScope extends ImportScope implements ScopeListener {
        public StarImportScope(Symbol owner) {
            super(owner);
        }

        public void importAll(Scope fromScope) {
            for (Entry e = fromScope.elems; e != null; e = e.sibling) {
                if (e.f338sym.kind == 2 && !includes(e.f338sym)) {
                    enter(e.f338sym, fromScope);
                }
            }
            fromScope.addScopeListener(this);
        }

        @Override
        public void symbolRemoved(Symbol sym, Scope s) {
            remove(sym);
        }

        @Override
        public void symbolAdded(Symbol sym, Scope s) {
        }
    }

    public static class DelegatedScope extends Scope {
        public static final Entry[] emptyTable = new Entry[0];
        Scope delegatee;

        public DelegatedScope(Scope outer) {
            super(outer.owner, emptyTable);
            this.delegatee = outer;
        }

        @Override
        public Scope mo450dup() {
            return new DelegatedScope(this.next);
        }

        @Override
        public Scope dupUnshared() {
            return new DelegatedScope(this.next);
        }

        @Override
        public Scope leave() {
            return this.next;
        }

        @Override
        public void enter(Symbol sym) {
        }

        @Override
        public void enter(Symbol sym, Scope s) {
        }

        @Override
        public void remove(Symbol sym) {
            throw new AssertionError(sym);
        }

        @Override
        public Entry lookup(Name name) {
            return this.delegatee.lookup(name);
        }
    }

    public static class CompoundScope extends Scope implements ScopeListener {
        public static final Entry[] emptyTable = new Entry[0];
        private int mark;
        private List<Scope> subScopes;

        /* JADX WARN: Multi-variable type inference failed */
        public CompoundScope(Symbol symbol) {
            super(symbol, emptyTable);
            this.subScopes = List.m507nil();
            this.mark = 0;
        }

        public void addSubScope(Scope that) {
            if (that != null) {
                this.subScopes = this.subScopes.prepend(that);
                that.addScopeListener(this);
                this.mark++;
                for (ScopeListener sl : this.listeners) {
                    sl.symbolAdded(null, this);
                }
            }
        }

        @Override
        public void symbolAdded(Symbol sym, Scope s) {
            this.mark++;
            for (ScopeListener sl : this.listeners) {
                sl.symbolAdded(sym, s);
            }
        }

        @Override
        public void symbolRemoved(Symbol sym, Scope s) {
            this.mark++;
            for (ScopeListener sl : this.listeners) {
                sl.symbolRemoved(sym, s);
            }
        }

        public int getMark() {
            return this.mark;
        }

        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            buf.append("CompoundScope{");
            String sep = "";
            for (Scope s : this.subScopes) {
                buf.append(sep);
                buf.append(s);
                sep = ",";
            }
            buf.append("}");
            return buf.toString();
        }

        @Override
        public Iterable<Symbol> getElements(final Filter<Symbol> sf) {
            return new Iterable<Symbol>() {
                @Override
                public Iterator<Symbol> iterator() {
                    return new CompoundScopeIterator(CompoundScope.this.subScopes) {
                        {
                            CompoundScope compoundScope = CompoundScope.this;
                        }

                        @Override
                        Iterator<Symbol> nextIterator(Scope s) {
                            return s.getElements(sf).iterator();
                        }
                    };
                }
            };
        }

        @Override
        public Iterable<Symbol> getElementsByName(final Name name, final Filter<Symbol> sf) {
            return new Iterable<Symbol>() {
                @Override
                public Iterator<Symbol> iterator() {
                    return new CompoundScopeIterator(CompoundScope.this.subScopes) {
                        {
                            CompoundScope compoundScope = CompoundScope.this;
                        }

                        @Override
                        Iterator<Symbol> nextIterator(Scope s) {
                            return s.getElementsByName(name, sf).iterator();
                        }
                    };
                }
            };
        }

        abstract class CompoundScopeIterator implements Iterator<Symbol> {
            private Iterator<Symbol> currentIterator;
            private List<Scope> scopesToScan;

            abstract Iterator<Symbol> nextIterator(Scope scope);

            public CompoundScopeIterator(List<Scope> scopesToScan) {
                this.scopesToScan = scopesToScan;
                update();
            }

            @Override
            public boolean hasNext() {
                return this.currentIterator != null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public Symbol next() {
                Symbol sym = this.currentIterator.next();
                if (!this.currentIterator.hasNext()) {
                    update();
                }
                return sym;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            private void update() {
                while (this.scopesToScan.nonEmpty()) {
                    this.currentIterator = nextIterator(this.scopesToScan.head);
                    this.scopesToScan = this.scopesToScan.tail;
                    if (this.currentIterator.hasNext()) {
                        return;
                    }
                }
                this.currentIterator = null;
            }
        }

        @Override
        public Entry lookup(Name name, Filter<Symbol> sf) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Scope mo451dup(Symbol newOwner) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void enter(Symbol sym, Scope s, Scope origin) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void remove(Symbol sym) {
            throw new UnsupportedOperationException();
        }
    }

    public static class ErrorScope extends Scope {
        ErrorScope(Scope next, Symbol errSymbol, Entry[] table) {
            super(errSymbol, table);
        }

        public ErrorScope(Symbol errSymbol) {
            super(errSymbol);
        }

        @Override
        public Scope mo450dup() {
            return new ErrorScope(this, this.owner, this.table);
        }

        @Override
        public Scope dupUnshared() {
            return new ErrorScope(this, this.owner, (Entry[]) this.table.clone());
        }

        @Override
        public Entry lookup(Name name) {
            Entry e = super.lookup(name);
            if (e.scope == null) {
                return new Entry(this.owner, null, null, null);
            }
            return e;
        }
    }
}
