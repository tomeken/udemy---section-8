public class PairTest {
    public static void main(String[] args) {
        Pair<Integer,String> integerStringPair = new Pair<Integer, String> ();
        integerStringPair.setArrayT (new Integer[5]);
        integerStringPair.getArrayT ()[0]=5;
        integerStringPair.setArrayV (new String[5]);
        integerStringPair.getArrayV ()[0]="Comp";

        System.out.println (integerStringPair.getT (0)+integerStringPair.getV (0) );
    }
}
