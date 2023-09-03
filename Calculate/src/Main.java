import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //define the variables
        double x1, x2, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number you want to operate on:");
        x1 = input.nextDouble();
        System.out.print("Enter the second number you want to operate on:");
        x2 = input.nextDouble();


        //Choose an operator from the list
        System.out.println("-------Choose the Operator-------");
        System.out.println("1-) Adding");
        System.out.println("2-) Subtraction");
        System.out.println("3-) Multiplication");
        System.out.println("4-) Division");
        int  operator = input.nextInt();

        switch (operator){
            case 1:
                result = x1 + x2;
                System.out.print("Result:" + result);
                break;

            case 2:
                result = x1 - x2;
                System.out.print("Result:" + result);
                break;

            case 3:
                result = x1 * x2;
                System.out.print("Result:" + result);
                break;

            case 4:
                result = x1 / x2;
                System.out.print("Result:" + result);
                break;
        }

    }
}
