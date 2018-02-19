import java.util.Arrays;
import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        int maxInd = 0;
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>max){
                max = numbers[i];
                maxInd = i;
            }
        }

        System.out.println("Max to: " + max);
        System.out.println("Max index to: " + maxInd );

    }
}
