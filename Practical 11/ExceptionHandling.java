import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        try {
            System.out.println("Current Balance: " + balance);
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new ArithmeticException("Amount must be greater than 0");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance!");
            }

            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid Input!");

        } finally {
            System.out.println("Thank you for using ATM.");
        }

        sc.close();
    }
}
