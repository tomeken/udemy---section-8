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

        if(sum%3==0){
            System.out.println("Podana liczba jest podzielna przez 3");

        }else System.out.println("Podana liczba NIE jest podzielna przez 3");




    }
}