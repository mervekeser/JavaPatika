import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int number, sum=0, counter=0, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = input.nextInt();

        if(number<0) System.out.println("Please enter a positive number");
        else {
            for (int i = 0; i < number; i += 12) {
                sum = (sum + i);
                counter++;
            }
            total = sum / counter;
            System.out.println(total);
        }
    }
}
