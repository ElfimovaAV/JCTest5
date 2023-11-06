public class IllegalArgumentException extends Exception {
    private String detail;


    public IllegalArgumentException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "IllegalArgumentException: " + detail;
    }
}
