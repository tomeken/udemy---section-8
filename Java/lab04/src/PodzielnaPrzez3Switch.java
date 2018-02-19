import java.util.Scanner;

public class PodzielnaPrzez3Switch {
    public static void main(String[] args) {
        calculateSumOfInt();
    }

    private static void calculateSumOfInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Suma liczby to: " + sum);

        switch (sum){
            case sum%3==0
                break;
        }

    }
}




