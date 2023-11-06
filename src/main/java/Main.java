public class Main {
    public static void main(String[] args) {
        double limit1 = -5;
        double limit2 = 5000;
        double deposit1 = -100;
        double deposit2 = 10000;
        double withdrawal1 = 100000;
        double withdrawal2 = 1000;
        try {
            Account account = new Account(123456, limit2);
            System.out.println(account);
            Deposit deposit = new Deposit();
            deposit.replenishAccount(account, deposit2);
            System.out.println(account);
            Withdrawal withdrawal = new Withdrawal();
            withdrawal.fundsWithdrawal(account, withdrawal2);
            System.out.println(account);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
