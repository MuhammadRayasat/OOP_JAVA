import java.util.Scanner;

class account {

       Scanner input = new Scanner(System.in);

       int account_number;
       String account_name;
       double account_balance;

        void deposit(double amount) 
       {
           account_balance += amount;
           System.out.println("Successfully Deposited "+ amount );
       }

       void withdraw(double amount) 
       {
           if (amount <= account_balance) {
               account_balance -= amount;
               System.out.println("Successfully Withdrawn "+ amount );
           } else {
               System.out.println("Insufficient balance");
           }
       }

       void display() 
       {
           System.out.println("Account Number: " + account_number);
           System.out.println("Account Name: " + account_name);
           System.out.println("Account Balance: " + account_balance);
       }

}

public class bank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            
            // int num;
            // String name;
            // double balance;
        
            // System.out.print("Enter account number: ");
            // num = input.nextInt();
            // input.nextLine(); // Consume newline
            // System.out.print("Enter account name: ");
            // name = input.nextLine();
            // System.out.print("Enter initial balance: ");
            // balance = input.nextDouble();
        
        // account acc1 = new account();
        // acc1.account_number = num;
        // acc1.account_name = name;
        // acc1.account_balance = balance;

        account acc1 = new account();
        acc1.account_name = "Muhammad Rayasat";
        acc1.account_number = 123456;
        acc1.account_balance = 10000;

        acc1.display();

        int dep;
        int with;
        System.out.print("Enter amount to deposit: ");
        dep = input.nextInt();
        acc1.deposit(dep);
        System.out.println("Enter amount to withdraw: ");
        with = input.nextInt();
        acc1.withdraw(with);
        input.close();

    }
        
}