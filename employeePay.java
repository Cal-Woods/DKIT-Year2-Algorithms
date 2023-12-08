public class employeePay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print("Enter hourly pay: ");
        double hourlyPay = keyboard.nextDouble();
        System.out.print("Enter name: ");
        int minutes = keyboard.nextInt();
    
        int seconds = (hours * 60 + minutes) * 60;
        System.out.println("You have exercised for a total of "+seconds+" seconds.");
    }
    }
}
