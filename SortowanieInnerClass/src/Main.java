import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ISort sortData = new ISort ( ) {
            @Override
            public int[] sortNumbers(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab.length-1; j++) {
                        if (tab[j] > tab[j + 1]) {
                            int temp;
                            temp = tab[j + 1];
                            tab[j + 1] = tab[j];
                            tab[j] = temp;
                        }

                    }
                }
                return tab;
            }

        };

        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};

        // System.out.println("Największa z liczb to: " + sortData.sortNumbers(tab).toString ());
        System.out.println (Arrays.toString (sortData.sortNumbers (tab) ) );
    }
}
