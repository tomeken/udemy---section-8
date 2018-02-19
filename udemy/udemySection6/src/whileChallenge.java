public class whileChallenge {
    public static void main(String[] args) {
        numberList();
    }

    private static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    private static void numberList() {
        int start = 5;
        int end = 20;
        int count = 0;

        while (start <= end) {
            Boolean result = isEvenNumber(start);
            if (result == true && count<=5) {
                count++;
                System.out.println(count + " Number: " + start + " " + result);
            }
            start++;

        }
        System.out.println("Total number is " + count);

    }
}
