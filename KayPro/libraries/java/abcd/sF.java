package abcd;

public class sF {
    public sF() {
    }

    private static java.lang.String j6(java.util.List<java.lang.String> r3, java.lang.String r4, java.lang.String r5) {
        if (r3.size() != 1) goto L7;
        return java.lang.String.valueOf(r4) + " " + r3.get(0);
    L7:
        return java.lang.String.valueOf(r5) + " " + abcd.NK.j6(r3, ", ", " and ");
    }

    public java.lang.String j6(java.lang.String r3, java.util.List<java.lang.String> r4) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r3);
        if (r3.endsWith("\n") == true) goto L5;
        r0.append("\n");
    L5:
        r0.append("\n");
        r0.append("Conflicts:\n");
        java.util.Iterator<java.lang.String> r5 = r4.iterator();
    L7:
        if (r5.hasNext() == false) goto L9;
        java.lang.String r6 = r5.next();
        r0.append('\t');
        r0.append(r6);
        r0.append('\n');
        goto L7
    L9:
        return r0.toString();
    }

    public java.lang.String j6(java.util.List<abcd.ME> r11, abcd.ME r12) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("Merge ");
        java.util.ArrayList r1 = new java.util.ArrayList();
        java.util.ArrayList r2 = new java.util.ArrayList();
        java.util.ArrayList r3 = new java.util.ArrayList();
        java.util.ArrayList r4 = new java.util.ArrayList();
        java.util.ArrayList r5 = new java.util.ArrayList();
        java.util.Iterator<abcd.ME> r13 = r11.iterator();
    L4:
        if (r13.hasNext() == false) goto L5;
        abcd.ME r6 = r13.next();
        if (r6.getName().startsWith("refs/heads/") == true) goto L27;
        if (r6.getName().startsWith("refs/remotes/") == true) goto L30;
        if (r6.getName().startsWith("refs/tags/") == true) goto L33;
        if (r6.getName().equals(r6.DW().VH()) == true) goto L36;
        r5.add(r6.getName());
        goto L4
    L36:
        r4.add("'" + r6.getName() + "'");
        goto L4
    L33:
        r3.add("'" + abcd.UE.Hw(r6.getName()) + "'");
        goto L4
    L30:
        r2.add("'" + abcd.UE.Hw(r6.getName()) + "'");
        goto L4
    L27:
        r1.add("'" + abcd.UE.Hw(r6.getName()) + "'");
        goto L4
    L5:
        java.util.ArrayList r14 = new java.util.ArrayList();
        if (r1.isEmpty() == true) goto L9;
        r14.add(j6(r1, "branch", "branches"));
    L9:
        if (r2.isEmpty() == true) goto L12;
        r14.add(j6(r2, "remote-tracking branch", "remote-tracking branches"));
    L12:
        if (r3.isEmpty() == true) goto L15;
        r14.add(j6(r3, "tag", "tags"));
    L15:
        if (r4.isEmpty() == true) goto L18;
        r14.add(j6(r4, "commit", "commits"));
    L18:
        if (r5.isEmpty() == true) goto L20;
        r14.add(abcd.NK.j6(r5, ", ", " and "));
    L20:
        r0.append(abcd.NK.j6(r14, ", "));
        java.lang.String r15 = r12.v5().getName();
        if (r15.equals("refs/heads/master") == true) goto L24;
        r0.append(" into " + abcd.UE.Hw(r15));
    L24:
        return r0.toString();
    }
}
