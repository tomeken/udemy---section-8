import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat (1, 2);
        prostokat.pole ( );
        prostokat.obwod ( );

     //   Trójkąt trójkąt = new Trójkąt (1,1);
   //     trójkąt.pole ();

        printMenu ();

        boolean quit=false;
        while(!quit) {
            int options;
            Scanner scanner = new Scanner (System.in);
            options = scanner.nextInt ( );
            switch (options) {
                case 0:
                    printMenu ( );
                    break;
                case 1:
                    Trójkąt trójkąt = new Trójkąt ( );
                    trójkąt.podajDane ( );
                    trójkąt.wyniki ( );
                    break;
                case 10:
                    quit=true;
                    break;

            }
        }
    }

    public static void printMenu(){
        System.out.println ("Avaliable options: " );
        System.out.println ("\t0 - print menu" +
                            "\n\t1 - trójkąt" +
                            "\n\t2 - prostokąt" +
                            "\n\t3 - koło" +
                            "\n\t10 - wyjście");

    }

}
