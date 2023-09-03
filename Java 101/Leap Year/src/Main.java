import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year:");
        year = input.nextInt();

        if(year < 0){
            System.out.println("Please enter a positive number");
        }
        else {
            if(year % 4 == 0 || year % 400 == 0){
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " isn't a leap year");
            }
        }
    }
}
