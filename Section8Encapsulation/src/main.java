public class main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,0,false);
        System.out.println("Number of pages printed: " + printer.getNumberOfPagesPrinted());
        System.out.println("Toner level: " + printer.getTonerLevel());
        printer.fillUpToner(2000);
        printer.printPages(25);
        System.out.println("Number of pages printed: " + printer.getNumberOfPagesPrinted());
        System.out.println("Toner level: " + printer.getTonerLevel());
    }
}
