///Typy generyczne - Zadanie
/// Zdefiniuj typ generyczny zgodny z konwencją JavaBeans o nazwie Pair (para),
// który przyjmuje dwa parametry typów T, V i jest w stanie przechowywać po jednej instancji każdego z nich.
// W klasie testowej utwórz trzy obiekty typu Pair z różnymi argumentami,
// zdefiniuj metodę generyczną wyświetlającą informację o dowolnej parze.

public class Pair<T, V> {
    private T[] arrayT;
    private V[] arrayV;


    public T[] getArrayT() {
        return arrayT;
    }

    public void setArrayT(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public V[] getArrayV() {
        return arrayV;
    }

    public void setArrayV(V[] arrayV) {
        this.arrayV = arrayV;
    }

    public T getT(int index){
        return arrayT[index];
    }
    public V getV(int index){
        return arrayV[index];
    }
}
