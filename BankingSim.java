import java.util.Scanner;

public class BankingSim {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in); // Create scanner object
        
        // Current account balance
        double balance = 1000;

        boolean running = true;
        while (running){
            // Ask for an operation
            System.out.print("What action would you like to perform? (deposit, withdraw, balance, exit): ");
            String command = newScan.nextLine();

            // Commands to perform based on what the user enters
            switch (command){
                case "deposit":
                    System.out.println("How much would you like to add? ");
                    double depositAmmount = newScan.nextDouble();
                    newScan.nextLine(); // Consumes left-overs before next iteration
                    balance = balance + depositAmmount;
                    System.out.println("Your new balance is: " + balance);
                    break;
                    
                case "withdraw":
                    System.out.println("How much would you like to take out? ");
                    double withdrawAmmount = newScan.nextDouble();
                    newScan.nextLine(); // Consumes left-overs before next interation
                        // Checks if the withdraw ammount is larger than the account balance
                        if (withdrawAmmount > balance){
                            System.out.println("Insufficient funds");
                        } 
                        else {
                            balance = balance - withdrawAmmount;
                            System.out.println("Your new balance is: " + balance);
                        }
                    break;

                case "balance":
                    System.out.println("Your current balance is: " + balance);
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }
    }
}
