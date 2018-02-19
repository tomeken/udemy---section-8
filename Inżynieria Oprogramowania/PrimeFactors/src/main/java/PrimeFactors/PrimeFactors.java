package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

     public List<Integer> generate(int input) {

         List<Integer> result = new ArrayList<Integer>();

//         if (input % 2 ==0) {
//             result.add(2);
//             input = input / 2;
//         }
//
//         if (input % 2 ==0){
//             result.add(2);
//             input = input / 2;
//         }
//
//         if (input >1)
//             result.add(input);


         for (int i = 2; i <= input; i++) {
             while (input % i == 0) {
                 result.add(i);
                 input /= i;
             }
         }
         return result;
     }}
//zadanie
//1. uruchomić te testy z pegaza
//2. metoda iteruje sie po liczbach od 1 do liczby zadanej w argumencie
//iterujemy się od 1 do n (wejście-parametr)
//jeśli liczba w tej iteracji jest parzyst %2 -> to wypisz "fizz"
//jeśli liczba jest podzielna przez 3, %3 -> to wypisz "buzz"

//mateusz@malik.net.pl - kontakt do prowadzącego