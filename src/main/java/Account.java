public class Account {
    private int accountNumber;
    private double limit;
    private double balance;

    public Account(int accountNumber, double limit) throws IllegalArgumentException {
        this.accountNumber = accountNumber;
        if (limit >= 0) {
            this.limit = limit;
        } else {
            throw new IllegalArgumentException("The limits cannot be a negative number: " + limit);
        }
        this.balance = limit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account: Number of account=" + accountNumber +
                ", initial balance=" + limit +
                ", final balance=" + balance +
                ", the last operation=" + (balance - limit) + '\'' +
                '}';
    }


}
