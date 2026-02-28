import java.util.*;
 class AtmMachine{
    private BankAccount account;
    int choice;
    AtmMachine(BankAccount account) {
        this.account = account;
    }

    void start() {
       Scanner sc= new Scanner(System.in);
       do{System.out.println("\n------------------");
       System.out.println("1.Deposit Balance");
       System.out.println("2.Withdraw Money");
       System.out.println("3.Check Balance");
       System.out.println("0.Exit");
       System.out.println("Enter Number of Opertion");
          choice=sc.nextInt();  
          switch(choice){
             case 1: System.out.println("Enter Amount To Deposit");
                      account.deposit(sc.nextDouble());
                       break;
             case 2: System.out.println("Enter Amount To Withdraw");
                      account.withdraw(sc.nextDouble());
                       break;
             case 3: account.checkbalance();
                     break;
             case 0: System.out.println("Thank You..!");
                     break;
             default: System.out.println("Enter Valid Choice");
          }
       }while(choice!=0);
}}
class BankAccount{
   private double balance=10000;
    void deposit(double amount){
       balance+=amount;
       System.out.println("RS."+amount+" Added Succesfully");
       checkbalance();
    }
    void withdraw(double amount){
       if(amount>balance){
          System.out.println("No Sufficient Balance\nSorry! Please Deposit First");
          checkbalance();
       }
       else{
       balance-=amount;
          System.out.println("RS."+amount+" Withdraw Succesfully");
       checkbalance();
       }
    }
   void checkbalance(){
      System.out.println("Total Balance Now-RS."+balance);
   }
}

public class ATM {
    
    public static void main(String[] args) {
        BankAccount bank =  new BankAccount();
       AtmMachine atm = new AtmMachine(bank);
       System.out.println("***---Welcome To ATM Machine---***");
       atm.start();
    }
    
}
