import java.util.Scanner;

public class TransactionOperation{
    Operation myOprt = new Operation();

    //Method to handle the user transaction
    public void Operation(){
        for (;;){
            myOprt.TransactionMessage();
            myOprt.Transaction();
            break;
        }
    }

    //Method to handle if the user wants to perform a new transaction
    public void RedoOperation() {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            myOprt.Message();
            String choice = input.next();
            if (choice.equals("y")) {
                myOprt.TransactionMessage();
                myOprt.Transaction();
            } else if (choice.equals("n")) {
                System.out.println("******* THANK YOU FOR USING BANK JAVA *******");
                break;
            } else {
                System.out.println("Invalid input entered");
            }
        }
    }
}
