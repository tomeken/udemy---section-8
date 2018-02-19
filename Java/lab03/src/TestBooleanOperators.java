import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();


        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Suma liczby to: " + sum);

        int modulo = sum % 3;

        switch (modulo) {
            case 0:
                System.out.println("Podzielna przez 3");
                break;
            default:
                System.out.println("NIE jest podzielna przez 3");

        }


    }
}