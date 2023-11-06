public class Deposit {
    private Account account;
    private double depositSum;

  public void replenishAccount(Account account, double depositSum) throws IllegalArgumentException {
        if(depositSum >= 0){
            account.setLimit(account.getBalance());
            account.setBalance(account.getBalance() + depositSum);
        }else {
            throw new IllegalArgumentException("The sum of deposit cannot be a negative number: " + depositSum);
        }
    }
    /*private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex) || login.length() > 20) {
            throw new WrongLoginException("Incorrect login");
        }
        if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword) ||
                password.length() > 20) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }*/
}
