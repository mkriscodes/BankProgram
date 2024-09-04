import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Deposit....press 1");
        System.out.println("Withdrawal....press 2");
        System.out.println("Loan....press 3");

        int userEnteredNum = userInput.nextInt();

        if (userEnteredNum == 1) {
            deposit();
        }
        else if (userEnteredNum == 2) {
            withdrawal();
        }
        else if (userEnteredNum == 3) {
            loan();
        }
        else {
            System.out.print("Program over");
        }
    }
    static void deposit () {
        int userBalance = 500;
        Scanner userAmount = new Scanner(System.in);
        System.out.println("How much would you like to deposit?");
        int userEnteredAmount = userAmount.nextInt();
        System.out.println("Successful Transaction");
        int answer = userBalance + userEnteredAmount;
        System.out.print("New Balance: " + answer);
    }
    static void withdrawal () {
        int userBalance = 500;
        Scanner userAmount = new Scanner(System.in);
        System.out.println("How much would you like to withdraw?");
        int userEnteredAmount = userAmount.nextInt();
        System.out.println("Successful Transaction");
        int answer = userBalance - userEnteredAmount;
        System.out.print("New Balance: " + answer);
    }
    static void loan () {
        Scanner userLoan = new Scanner(System.in);
        System.out.println("How much do you want to borrow: ");
        double loanAmount = userLoan.nextDouble();
        System.out.println("How many months: ");
        double loanMonths = userLoan.nextInt();
        System.out.print("Enter an interest rate (Ex. 0.05): ");
        double loanInterest = userLoan.nextDouble();
        double monthlyPayment = (loanAmount * (loanInterest / 12)) / (1 - Math.pow((1 + loanInterest / 12), - loanMonths));
        System.out.printf("Monthly Payment: " + "%.2f", monthlyPayment);
    }
}