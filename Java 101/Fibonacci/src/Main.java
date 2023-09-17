//Fibonacci Series
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n, fib1=0, fib2=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(fib1 + " ");
            int total = fib1 + fib2;
            fib1 = fib2;
            fib2 = total;
        }
    }
}
