package javax.annotation.processing;

public class Completions {
    private Completions() {
    }

    private static class SimpleCompletion implements Completion {
        private String message;
        private String value;

        SimpleCompletion(String value, String message) {
            if (value == null || message == null) {
                throw new NullPointerException("Null completion strings not accepted.");
            }
            this.value = value;
            this.message = message;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return "[\"" + this.value + "\", \"" + this.message + "\"]";
        }
    }

    public static Completion m522of(String value, String message) {
        return new SimpleCompletion(value, message);
    }

    public static Completion m521of(String value) {
        return new SimpleCompletion(value, "");
    }
}
