import java.lang.reflect.Array;
import java.util.*;

public class Queue<T> {

    ArrayList<Entry<T>> list = new ArrayList<>();

    private ArrayList<Entry<T>> getEntries() {
        return list;
    }

    public static class Entry<T> {
        T value;
        int priority;

        public Entry(T value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }


    public Queue() {
    }

    private void push(T val, int priority) {
        list.add(new Entry<>(val, priority));
    }

    private void peek(T val, int priority) {

    }

    private void pop(T val, int priority) {

    }

    public static void main(String[] args) {


        Queue<String> queue = new Queue<>();
        queue.push("ala", 12);
        queue.push("ma", 2);
        queue.push("kota", 100);

        for (Queue.Entry<String> e : queue.getEntries()) {
            System.out.println(e);
        }
    }

}
