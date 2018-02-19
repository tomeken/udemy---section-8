public class Zadanie {
    public static void main(String[] args) {
    podzielnosc();
    }

    public static void podzielnosc() {
        int n = 10;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Liczba >>" + i + "<< jest podzielna przez 2 FIZZ");
            }
            if (i % 3 == 0) {
                System.out.println("Liczba >>" + i + "<< jest podzielna przez 3 BUZZ");
            }

        }
    }
}
