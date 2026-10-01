package abcd;

public class uD extends java.io.IOException {
    public uD(long r3) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().receivePackObjectTooLarge1, new java.lang.Object[]{java.lang.Long.valueOf(r3)}));
    }

    public uD(long r3, long r5) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().receivePackObjectTooLarge2, new java.lang.Object[]{java.lang.Long.valueOf(r3), java.lang.Long.valueOf(r5)}));
    }
}
