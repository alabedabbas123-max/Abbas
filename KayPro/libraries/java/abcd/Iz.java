package abcd;

class Iz implements abcd.Hz.b {
    Iz() {
    }

    @Override
    public java.net.HttpURLConnection j6(java.net.URL r1) {
        return (java.net.HttpURLConnection) r1.openConnection();
    }

    @Override
    public java.net.HttpURLConnection j6(java.net.URL r1, java.net.Proxy r2) {
        return (java.net.HttpURLConnection) r1.openConnection(r2);
    }
}
