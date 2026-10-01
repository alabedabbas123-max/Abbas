package abcd;

public class jQ extends java.text.SimpleDateFormat {
    public jQ() {
        super("yyy-MM-dd'T'HH:mm:ss'Z'");
        setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    }
}
