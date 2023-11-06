public class InsufficientFundsException extends Exception {
    private String detail;

    public InsufficientFundsException() {
        detail = "Insufficient funds";
    }

    public InsufficientFundsException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "IllegalArgumentException: " + detail;
    }
}
