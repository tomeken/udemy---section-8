public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int addtionalToner) {
        if (this.tonerLevel + addtionalToner > 100) {
            System.out.println("Too much additionalToner");

        } else this.tonerLevel += addtionalToner;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void printPages(int numberOfPages) {
        if (duplexPrinter == true) {
            this.numberOfPagesPrinted += 2 * numberOfPages;
        } else this.numberOfPagesPrinted += numberOfPages;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
