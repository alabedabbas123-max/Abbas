package abcd;

public final class rp extends abcd.Abstractup {
    public rp() {
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.j6;
    }

    @Override
    public int VH() {
        return 112;
    }

    @Override
    public void j6(abcd.jp r1) {
    }

    @Override
    public void j6(abcd.jp r11, abcd.Lt r12) {
        int r0 = r11.u7().FH();
        abcd.AbstractKp r1 = r11.VH();
        abcd.AbstractKp r2 = r11.gn();
        int r3 = r1.FH();
        int r4 = (r2.FH() + r2.u7()) - r3;
        java.lang.String r5 = r11.Hw().DW();
        if (r12.Hw() == false) goto L5;
        r12.j6(8, "magic: " + new abcd.Js(r5).lg());
        r12.j6(4, "checksum");
        r12.j6(20, "signature");
        r12.j6(4, "file_size:       " + abcd.Yt.gn(r11.Zo()));
        r12.j6(4, "header_size:     " + abcd.Yt.gn(112));
        r12.j6(4, "endian_tag:      " + abcd.Yt.gn(305419896));
        r12.j6(4, "link_size:       0");
        r12.j6(4, "link_off:        0");
        r12.j6(4, "map_off:         " + abcd.Yt.gn(r0));
    L5:
        int r6 = 0;
    L6:
        if (r6 >= 8) goto L8;
        r12.writeByte(r5.charAt(r6));
        r6 = r6 + 1;
        goto L6
    L8:
        r12.j6(24);
        r12.writeInt(r11.Zo());
        r12.writeInt(112);
        r12.writeInt(305419896);
        r12.j6(8);
        r12.writeInt(r0);
        r11.J8().Hw(r12);
        r11.Ws().Hw(r12);
        r11.EQ().Hw(r12);
        r11.v5().Hw(r12);
        r11.tp().Hw(r12);
        r11.FH().Hw(r12);
        if (r12.Hw() == false) goto L11;
        r12.j6(4, "data_size:       " + abcd.Yt.gn(r4));
        r12.j6(4, "data_off:        " + abcd.Yt.gn(r3));
    L11:
        r12.writeInt(r4);
        r12.writeInt(r3);
    }
}
