import java.util.Scanner;

public class Trójkąt implements Wzory {
    private double a;
    private double h;

    public Trójkąt() {
    }


    @Override
    public void pole() {
        double pole = 0.5 * this.a * this.h;
        System.out.println ("Pole trójkąta to: " + pole);

    }

    @Override
    public void obwod() {
        System.out.println ("Obwód trójkąta: Nie wiem jaki wzór");

    }

    @Override
    public void podajDane() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter a: ");
        this.a = scanner.nextDouble ( );
        System.out.println ("Enter h: ");
        this.h = scanner.nextDouble ( );
    }

    public void wyniki() {
        pole ();
        obwod ();

    }
}
