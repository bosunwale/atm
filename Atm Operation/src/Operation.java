import java.util.Scanner;

public class Operation {
    //Creating an object of the scanner class to accept inputs from user
    Scanner input = new Scanner(System.in);

    //The user pin is protected to make it accessible from other class.
    private int pin = 1234;

    //Declaring the three variables needed for the operation.
    //finalBalance variable is used to store the amount deposited or withdrawn.
    //In the deposit method, amount deposited is stored in the finalBalance variable.
    //If user decides to deposit, the new amount is added to the previous amount in the finalBalance variable.
    //The same action is done in the withdraw method.
    //However, instead of addition, the new amount is subtracted from the balance.
    //In the balance method, the finalBalance will always display the current balance of the user.
    double finalBalance;
    double depositAmount;
    double withdrawAmount;

    double depAmount = 1000000;
    double withAmount = 500000;

    //Here, I have defined a get and set method because i made the user pin private
    public int getPin(){
        return pin;
    }

    //Method to handle depositing transaction
    protected void deposit(){
        System.out.println("Welcome. Enter an amount to deposit");
        depositAmount = input.nextDouble();
        //Here, I am using the logical operator AND to check both conditions at a time
        if (depositAmount > depAmount) {
            //if condition is true, then deposited amount is added and stored into the finalBalance variable
            System.out.printf("You can't deposit more than %.2f", depAmount);
        }
        else {
            finalBalance += depositAmount;
            System.out.printf("You have deposited %.2f", depositAmount);
        }
    }

    //Method to handle withdrawing transaction
    protected void withdraw() {
        System.out.println("Enter any amount to withdraw");
        withdrawAmount = input.nextDouble();
        if (withdrawAmount > withAmount) {
            System.out.println("Sorry, you can't withdraw more than 100000");
        }
        else if (finalBalance < withdrawAmount){
            System.out.println("Sorry, You do not have sufficient amount to perform this transaction");
        }
        else{
            finalBalance -= withdrawAmount;
            System.out.printf("You have withdrawn %.2f", withdrawAmount);
        }
    }

    //Method to handle checking of account balance
    protected void balance(){
        System.out.printf("Your balance is %.2f", finalBalance);
    }

    //Method to display redo transaction to user
    protected void Message(){
        System.out.println("\nDo you want to perform another transaction? y/n");
    }

    //Method to display various transaction user can perform
    protected void TransactionMessage(){
        System.out.println("Choose 1 for Deposit, 2 for Withdraw, 3 for Balance");
    }

    //Method that handles the various transaction selected by user
    protected void Transaction(){
        int userInput = input.nextInt();
        //Switch statement to handle the different operations of the program
        switch (userInput) {
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> balance();
            default -> System.out.println("No such transaction");

        }
    }
}
