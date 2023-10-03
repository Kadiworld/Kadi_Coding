public class Account extends Bank{

    @Override
    void deposite(double amount) {
       if(amount>0) this.setAccount_balance(this.getAccount_balance()+amount);
    }

    @Override
    double get_balance() {
     return this.getAccount_balance();
    }

    @Override
    void withdraw(double amount) {
      if(this.get_balance()>=amount) {
        this.setAccount_balance(this.getAccount_balance()-amount);
        System.out.println("Successfully withdrawed $"+amount);  
       }
      else System.out.println("Withdrawal exceeded account balance");
     }
    

}
