public class SwitchTest {
    public static void main(String[] args) {
        switchAge();
    }

    public static void switchAge() {
        String switchVal = "c";

        switch (switchVal.toLowerCase()) {
            case "a":
                System.out.println("Switch val is >>A<<");
                break;
            case "b":
                System.out.println(">>B<<");
                break;
            case "c":
                System.out.println(">>C<<");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
