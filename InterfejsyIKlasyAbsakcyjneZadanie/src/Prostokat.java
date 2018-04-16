
public class Prostokat implements Wzory {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void pole() {
        int pole = Math.multiplyExact (this.a,this.b);
        System.out.println ("Pole prostokąta to: " + pole );

    }

    @Override
    public void obwod() {
        int obwod = Math.multiplyExact (2,a) + Math.multiplyExact (2,b);
        System.out.println ("Obwód prostokąta to: " + obwod);

    }
    @Override
    public void podajDane() {
        System.out.println ("metoda podajDane niezaimplementowana" );

    }
}
