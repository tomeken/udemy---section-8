//package Lab08;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lenovo on 10.03.2018.
 */
public class Class<T> {

    ArrayList<Entry<T>> list = new ArrayList<>();

    public void sort() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j - 1).getPriority() < list.get(j).getPriority()) {
                    Entry<T> temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                } else if (list.get(j - 1).getPriority() == list.get(j).getPriority()) {
                    if (list.get(j - 1).getCreationTime().after(list.get(j).getCreationTime())) {
                        Entry<T> temp = list.get(j - 1);
                        list.set(j - 1, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Class<String> queue = new Class<>();

        queue.push("ola", 10);
        queue.push("nino", 10);
        queue.push("radek", 14);
        queue.push("karl", 16);


        queue.sort();

        for (Class.Entry<String> e : queue.getEntries()) {
            System.out.println(e);
        }


    }

    private ArrayList<Entry<T>> getEntries() {
        return list;
    }

    public static class Entry<T> {

        private T name;
        private int priority;
        private Date creationTime;

        public Entry(T name, int priority) {
            this.name = name;
            this.priority = priority;
            this.creationTime = new Date();
        }

        public T getName() {
            return name;
        }

        public int getPriority() {
            return priority;
        }

        public Date getCreationTime() {
            return creationTime;
        }

        public void setName(T name) {
            this.name = name;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        @Override
        public String toString() {
            return String.format("%4d %s", this.priority, this.name);
        }
    }

    public void push(T val, int priority) {
        list.add(new Entry<>(val, priority));
    }

    public Entry<T> peek() {
        return list.get(list.size() - 1);
    }

    public Entry<T> pop() {
        Entry<T> result = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return result;
    }

}
