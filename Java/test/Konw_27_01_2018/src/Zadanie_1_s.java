//Zadanie 1
//        Napisz program, który:
//
//        wypełni losowo 0 i 1 tablicę o rozmiarze 4-na-4,
//        wypisze ją
//        wypisze, w którym wierszu jest najwięcej 0 a w którym wierszu jest najwięcej 1
//        * Spóbuj wykornać całę zadanie roz przechodząc po tablicy.


    import java.util.Random;
    public class Zadanie_1_s {
        public static void main(String[] args) {
            int tablica[][] = new int[4][4];

            wypelnij(tablica);
        }

        public static void wypelnij(int tablica[][]) {
            Random random = new Random();
            for (int i = 0; i < tablica.length; i++) {
                for (int j = 0; j < tablica[i].length; j++) {
                    tablica[i][j] = random.nextInt(2);
                    System.out.print(tablica[i][j] + "\t");
                }
                System.out.println();
            }
        }

        }

        //wypisze, w którym wierszu jest najwięcej 0 a w którym wierszu jest najwięcej 1

//poniżej rozwiązanie z tablicy

//
//        int max_val=-1, max_position
//                for(int row=0; matrix.length; row++){
//        int sum=0;
//        for(int a:matrix[row])
//            sum+=a;
//        if (sum>max.val){
//            max_val=sum;
//            max_pos=row;
//                        }
//                        }



