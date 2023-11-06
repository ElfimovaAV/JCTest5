public class Withdrawal {
    private Account account;
    private double withdrawalSum;

    public void fundsWithdrawal(Account account, double withdrawalSum) throws InsufficientFundsException {
        if (withdrawalSum <= account.getBalance()) {
            account.setLimit(account.getBalance());
            account.setBalance(account.getBalance() - withdrawalSum);
        } else {
            throw new InsufficientFundsException("Insufficient funds: " + withdrawalSum);
        }
    }
}