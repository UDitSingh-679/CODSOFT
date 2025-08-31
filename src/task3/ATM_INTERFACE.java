package task3;

import java.util.*;

class Account{
    private double balance;
    public Account(double initialBalance){
        this.balance=initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+= amount;
            System.out.println("Deposit Succesfuly: " +amount);
        }
        else{
            System.out.println("Deposits amount invalid "+amount);
        }
    }
    public void withdraw(double amount){
        if(amount>0&& amount<=balance){
            balance-=amount;
            System.out.println("Successfully Withdrawn...: "+amount);
        } else if (amount>balance) {
            System.out.println("Insufficient Balance...");

        }
        else {
            System.out.println("Withdrawn amount is invalid...");
        }
    }
    public double showBalance(){
        return balance;
    }

}
class ATM{
    private Account acc;
    public ATM(Account acc){
        this.acc=acc;
    }
    public void start(){
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n===== ATM =====");
            System.out.println("1. Show Money");
            System.out.println("2. Add Money");
            System.out.println("3. Take Money");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("💰 Money: " + acc.showBalance());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    acc.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    double  withdrawAmount = sc.nextDouble();
                    acc.withdraw( withdrawAmount);
                    break;
                case 4:
                    System.out.println(" Thank you for using the ATM! ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again...");
            }
        } while (ch != 4);

    }

}
public class ATM_INTERFACE {
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        ATM atm = new ATM(account);
        atm.start();
    }

}
