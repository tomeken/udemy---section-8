public class petla_While_if {
    public static void main(String[] args) {
        int i=0;
        int wiersz=0;
        while (i<100){
            if (i%2==0 && i%3==0){
                System.out.println(wiersz + " " + i);
                wiersz++;
            }
            i++;
        }
    }
}
