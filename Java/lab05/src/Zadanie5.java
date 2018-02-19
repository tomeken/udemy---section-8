public class Zadanie5 {
    public static void main(String[] args) {
        nieparzyste();
    }
    public static void  nieparzyste(){

        for (int i=10;i<=35;i++){
            if(i%2!=0){
                System.out.println("nieparzysta: " + i);
            }
            if(i%2==0){
                System.out.println("parzysta: " + i);
            }
            int kwadrat = i*i;

            System.out.println("Kwadrat lizby " + i + " to " + kwadrat);

        //    System.out.println("parzysta " + i);
        }
    }


}
