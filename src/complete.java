import java.util.Scanner;

public class complete {
    public static void main(String[] args) {
        String message = "please enter a number";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (number > 10) {
            System.out.println("Number is greater than 10.");

        }

        if (number < 10){
            System.out.println("Number is less than 10.");
        }
        if (number == 10) {
            System.out.println("The number is 10");
        }

        System.out.println("Application finished.");
    }
}
