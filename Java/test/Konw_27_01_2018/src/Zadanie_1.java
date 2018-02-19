import java.util.Arrays;

public class Zadanie_1 {
    public static void main(String[] args) {
//        int[][]tablica={
//                {1,2,3},
//                {3,4,5},
//                {5,4,2}
//        };
        float[][] tablica = new float[4][4];
        for (int i=0;i<=4;i++){
            tablica[i][0]= (float) Math.random()*100;
        }


        System.out.println(Arrays.deepToString(tablica));


    }
}


