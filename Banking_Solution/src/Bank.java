public  abstract class Bank {
    private String account_name;
    private double account_balance;
  
    abstract void deposite(double amount);
    abstract void withdraw(double amount);
    abstract double get_balance();
    public String getAccount_name() {
        return account_name;
    }
    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }
    public double getAccount_balance() {
        return account_balance;
    }
    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }


    

}
