import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Painter extends JPanel {
    Circle circle = new Circle(100,100,50, Color.GREEN);

    private final ArrayList<DrawAble> figures;
    public Painter(ArrayList<DrawAble> figures) {
        this.figures = figures;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // wywołanie domyślnyc akcji z klasy bazowej
        g.drawLine(20, 80, 20, 200); // narysowanie linii
        g.drawLine(20, 200, 140, 200); // narysowanie linii

        g.setColor(Color.RED);
        g.fillOval(100, 100, 20, 40);

        g.drawString("Test", 200, 200);


        for(DrawAble d:figures){
            d.draw(g);
        }

      //  circle.draw(g);

    }

    public static void main(String[] args) {
        ArrayList<DrawAble> figures = new ArrayList<>();
        figures.add(new Circle(100,100,50,Color.PINK));
        figures.add(new Circle(100,100,40,Color.BLUE));
        JFrame frame = new JFrame("Okienko"); // utworzenie obiektu okna

        frame.add(new Painter(figures)); // dodanie panelu
        frame.setSize(300, 300); // rozmiar okienka
        frame.setLocationRelativeTo(null); // wyśrodkowanie do centrum ekranu
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // wyświetlenie


    }
}