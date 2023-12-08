import java.util.Scanner;

public class timeExercising {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter number of hours spent exercising? ");
    int hours = keyboard.nextInt();
    System.out.print("Enter number of minutes spent exercising? ");
    int minutes = keyboard.nextInt();

    int seconds = (hours * 60 + minutes) * 60;
    System.out.println("You have exercised for a total of "+seconds+" seconds.");
}
}