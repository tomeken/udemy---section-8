import javax.sound.midi.Soundbank;

public class Section5MethodOverloading {
    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(8,4);
        System.out.println(result + " cm");
        result = calcFeetAndInchesToCentimeters(-10);
        System.out.println(result + " feet");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = feet * 30.48 + inches * 2.54;
            return centimeters;
        }System.out.println("Invalid feet or inches parameter");
        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
        double feet = inches*1/12;
        return feet;
        }
        else if (inches > 12){
            double feet = inches%12;
            inches = inches/12;
            return calcFeetAndInchesToCentimeters(feet,inches);

        }
        return -1;
    }
}
