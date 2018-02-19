public class Zadanie_5_home {


    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();


        long czas1 = timer.getCurrentTime();
        Thread.sleep(200);
        long czas2 = timer.getCurrentTime();

        long roznica = czas2 - czas1;

        System.out.println(czas1);
        System.out.println(czas2);
        System.out.println(roznica);


    }


}

//
//    Wykorzystaj System.currentTimeMillis() do napisania klasy Timer, która mierzy czas pomiedzy jej utworzeniem a
//        wywołaniem jej metody getCurrentTime. Zapewnij, aby konstrukcja klasy uniemożliwiała oszustwo polegające na podmienieniu czasu początkowego.