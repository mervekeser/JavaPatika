//Min and Max Number

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n, number, min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of items you want:");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i + "-");
            number = input.nextInt();
            if(number<min || min ==0) min = number;
            if(number>max) max = number;
        }
        System.out.println("Min Number:" + min);
        System.out.println("Max Number:" + max);
    }
}
