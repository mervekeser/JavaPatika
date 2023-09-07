//The total of the digits in a number

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        int  remainder, result=0;

        while(number!=0){
            remainder = number % 10;
            result += remainder;
            number /= 10;
        }
        System.out.println(result);
    }
}
