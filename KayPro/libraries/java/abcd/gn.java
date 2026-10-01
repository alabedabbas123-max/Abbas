package abcd;

public class gn {
    public gn() {
    }

    public final abcd.Interfaceon j6(abcd.jn r11, int r12, int r13, abcd.Interfacexn r14) {
        if (r11 == null) goto L25;
        if (r12 < 0) goto L23;
        if (r12 >= 4) goto L23;
        abcd.Pt r3 = r11.Hw();     // Catch: abcd.wn -> L14
        abcd.Interfacens r4 = r11.v5();     // Catch: abcd.wn -> L14
        int r5 = r3.Zo(r13);     // Catch: abcd.wn -> L14
        int r6 = r13 + 2;     // Catch: abcd.wn -> L14
        int r8 = r3.DW(r6);     // Catch: abcd.wn -> L14
        abcd.Js r9 = (abcd.Js) r4.get(r5);     // Catch: abcd.wn -> L14
        if (r14 != null) goto L28;
    L10:
        return j6(r11, r12, r9.we(), r13 + 6, r8, r14);
    L12:
        e = e;
    L16:
        java.lang.StringBuilder r1 = new java.lang.StringBuilder();
        r1.append("...while parsing ");
        if (r9 == null) goto L19;
        java.lang.String r2 = r9.aM() + " ";
    L20:
        r1.append(r2);
        r1.append("attribute at offset ");
        r1.append(abcd.Yt.gn(r13));
        e.j6(r1.toString());
        throw e;
    L19:
        r2 = "";
        goto L20
    L28:
        r14.j6(r3, r13, 2, "name: " + r9.aM());     // Catch: abcd.wn -> L12
        r14.j6(r3, r6, 4, "length: " + abcd.Yt.gn(r8));     // Catch: abcd.wn -> L12
    L14:
        e = e;
        r9 = null;
    L23:
        throw new java.lang.IllegalArgumentException("bad context");
    L25:
        throw new java.lang.NullPointerException("cf == null");
    }

    protected abcd.Interfaceon j6(abcd.jn r7, int r8, java.lang.String r9, int r10, int r11, abcd.Interfacexn r12) {
        abcd.Pt r13 = r7.Hw();
        abcd.Em r14 = new abcd.Em(r9, r13, r10, r11, r7.v5());
        if (r12 == null) goto L5;
        r12.j6(r13, r10, r11, "attribute data");
    L5:
        return r14;
    }
}
