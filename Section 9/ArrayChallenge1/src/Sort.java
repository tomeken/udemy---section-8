import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        int[] array = getIntegers (5);
        printArray (array);
        int[] sortedArray = sortArray (array);
        printArray (sortedArray);
    }

    private static Scanner scanner = new Scanner (System.in);

    public static int[] getIntegers(int number) {
        System.out.println ("Enter " + number + " integers: ");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt ( );
        }
        return values;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println ("Element: " + i + " Value: " + array[i]);
        }
        System.out.println ( );
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
