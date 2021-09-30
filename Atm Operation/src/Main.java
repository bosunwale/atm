import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //The obj of the AtmOperation class is created
        //The userPin value is initialized

        var obj = new Operation();
        var redo = new TransactionOperation();


        Scanner input = new Scanner(System.in);
        int count = 3;
        System.out.println("******* WELCOME TO BANK JAVA *******");
        System.out.println("*************************************");

        //Here, I use a for loop to check how many times the user enters the wrong pin
        for (int i = 0; i < 3; i++){
        String welcomeMessage = "Please enter your pin";
        System.out.println(welcomeMessage);
        int pin = input.nextInt();
            //If condition to check if the pin entered by user is incorrect and checks the number of trials remaining
                if (pin != obj.getPin() && i == 0) {
                    System.out.println("Incorrect password. You have two trials left");
                }else if (pin != obj.getPin() && i == 1){
                    System.out.println("Incorrect password. You have one trial left");
                }else if (pin != obj.getPin() && i == 2){
                    System.out.println("Incorrect password. Account locked");
                }
                else {
                    redo.Operation();
                    redo.RedoOperation();

                }
            }

    }
}
