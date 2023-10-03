import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Account extends Bank{
   /////////// Class level variables
   private static BufferedWriter file =null;
   private static String path="Banking_Solution/", msg=null;
   private int counter =1;

   ///////////////// Inherited methods and properties from super abstract class Bank
    @Override
    void deposite(double amount) {
       if(amount>0) this.setAccount_balance(this.getAccount_balance()+amount);
       this.log("Successfully deposited $"+amount+"\r"+"new balance is "+this.getAccount_balance());

    }

    @Override
    double get_balance() {
     this.log("Current balance is $"+this.getAccount_balance());
     return this.getAccount_balance();
    }

    @Override
    void withdraw(double amount) {
      if(this.getAccount_balance()>=amount) {
        this.setAccount_balance(this.getAccount_balance()-amount);
        this.log("Successfully withdrawed $"+amount+"\r"+"new balance is $"+this.getAccount_balance());
       }
      else {
        System.out.println("Withdrawal exceeded account balance");
        this.log("Withdrawal exceeded account balance");

      }
     }
     
     ////// Logging to file name Bank.txt
     void log(String msg){
        try {
            file =  new BufferedWriter(new FileWriter(path+"/Bank.txt",true));
            file.append(counter+") "+msg+"\n");
            ++counter;
        } catch (Exception e) {
            e.getMessage();
        }finally{
            try {
                /////// Closing bufferwriter 
                file.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
     }


}
