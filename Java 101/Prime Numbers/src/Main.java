//1-100 prime numbers
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isPrime=true;

       for(int number=2; number<=100; number++){
           for(int i=2; i<number; i++){
               if(number % i ==0){
                   isPrime = false;
                   break;
               }
               isPrime =true;
           }
           if(isPrime) System.out.print(number+" ");
       }
    }
}
