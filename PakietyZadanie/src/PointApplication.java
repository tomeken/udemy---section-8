import Pakiet1.Point;
import Pakiet2.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point (1,2);
        point.setX (2);
        System.out.println (point.getX () );

        PointController pointController = new PointController ();
        pointController.addX (point);
        pointController.addX (point);
        System.out.println (point.getX () );
    }
}
