// Drawing diamond with stars

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number greater than 1:");
        int base = input.nextInt();
        int star=1, empty=base-1;

        for(int i=0; i<base; i++){
            for(int j=0; j<empty; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*star+1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
            empty--;
            star++;
        }
        empty=0;
        star -=2;
        for(int i=0; i<base; i++){
            for(int j=0; j<(empty+1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*star+1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
            star--;
            empty++;
        }
    }
}
