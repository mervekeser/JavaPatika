//Harmonic series: 1 + (1/2) + (1/3) + ..... +(1/n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        double harmonic =0.0;
        for(int i=1; i<=number; i++){
            harmonic += (1.0 / i);
        }
        System.out.println("Harmonic of the Number: " + harmonic);
    }
}
