import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int numberOne, numberTwo, ebob=1, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        numberOne = input.nextInt();
        System.out.print("Enter the second number:");
        numberTwo = input.nextInt();

        int i =numberOne;
        while(i>=1){
            if(numberOne % i ==0 && numberTwo % i ==0){
                ebob = i;
                break;
            }
            i--;
        }
        ekok = (numberOne * numberTwo) / ebob;
        System.out.println(ebob + " " + ekok);
    }
}
