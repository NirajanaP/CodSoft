import java.util.Scanner;
class BankAccount{
   private double balance;
   public BankAccount(double initialBalance){
        this.balance=initialBalance;
   }
   public double getBalance(){
      return balance;
   }
   public void deposit(double amount){
     balance+=amount;
   }
   public boolean withdraw(double amount){
     if(amount>balance){
          System.out.println("insufficient funds.withdrawal failed.");
          return false;
      }
       balance-=amount;
       return true;
      }
   }
class ATM{
     private BankAccount userAccount;
     public ATM(BankAccount userAccount){
          this.userAccount=userAccount;
      }
      public void displayOptions(){
         System.out.println("1.withdraw");
         System.out.println("2.Deposit");
         System.out.println("3.Check Balance");
         System.out.println("4.Exit");
      }
      public void withdraw(double amount){
          if(userAccount.withdraw(amount)){
              System.out.println("withdrawal successful.Remaining balance:$" + userAccount.getBalance());
           }
      }
       public void deposit(double amount){
          userAccount.deposit(amount);
          System.out.println("Deposit successful.New balance:$" + userAccount.getBalance());
         }
         public void checkBalance(){
             System.out.println("Current balance:$" + userAccount.getBalance());
            }
         }
         public class ATM_INTERFACE{
           public static void main(String[] args){
              Scanner scanner=new Scanner(System.in);
              System.out.print("Enter initial balance:");
              double initialBalance=scanner.nextDouble();
              BankAccount userAccount=new BankAccount(initialBalance);
              ATM atm=new ATM(userAccount);
              int choice;
               do{
                 atm.displayOptions();
                  System.out.print("Enter your choice(1-4):");
                  choice= scanner.nextInt();
                  switch(choice){
                    case 1:
                        System.out.print("Enter withdrawal amount:$");
                        double withdrawAmount=scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 2:
                         System.out.print("Enter deposit amount:$");
                         double depositAmount=scanner.nextDouble();
                         atm.deposit(depositAmount);
                         break;
                    case 3:
                         atm.checkBalance();
                         break;
                    case 4:
                          System.out.println("Exiting.Thank you!");
                          break;
                    default:
                         System.out.println("Invalid choice.Please enter a number between 1 and 4.");
                     }
                   }
                   while(choice!=4);
                   scanner.close();
                  }
               }
