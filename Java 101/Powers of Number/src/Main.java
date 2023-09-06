import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        System.out.println("The fourth powers");
        for(int i = 1; i<=number; i*=4){
            System.out.println(i);
        }
        System.out.println("The fifth powers");
        for(int i=1; i<=number; i*=5){
            System.out.println(i);
        }
    }
}
