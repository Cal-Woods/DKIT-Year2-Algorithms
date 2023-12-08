import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
    //A variable of the Scanner class that allows a user to enter input
    Scanner keyboard = new Scanner(System.in);

    //Outputs text
    System.out.print("Please enter full price: ");

    //Creates a variable of type "double that is assigned a value of user input double
    double price = keyboard.nextDouble();

    //A double calculation that is stored in this variable
    double calculation = (double)(price - (price * 0.25));

    //Outputs text
    System.out.println("The total price is €"+price+". The discount is 25%, which is "+(price * 0.25)+ " so the new price is "+calculation+".");
    keyboard.close();
    }
}