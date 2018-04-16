import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner (System.in);
    private static String[] baseDate = new String[4];

    public static void main(String[] args) {
        System.out.println ("Enter 4 strings: ");
        getInput ( );
        System.out.println ("Unsorted list: " );
        printArray (baseDate);
        Arrays.sort (baseDate );
        System.out.println ("Sorted list:" );
        printArray (baseDate);

    }

    private static void getInput() {
        for (int i = 0; i < baseDate.length; i++) {
            baseDate[i] = s.nextLine ( );
        }
    }

    private static void printArray(String[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
            System.out.println ( );
        }

    }
}
