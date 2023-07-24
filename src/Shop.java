import java.util.Scanner;
public class Shop {
    public static void main(String[] args){
        //price of fruits
            double pear      = 2.14;
            double apple     = 3.67;
            double tomato    = 1.11;
            double banana    = 0.95;
            double aubergine = 5.00;

       //get the weight knowledge of fruits from the user
            Scanner input = new Scanner(System.in);
            System.out.print("How many kilograms of pear did you buy?:");
            double pearKg = input.nextDouble();
            System.out.print("How many kilograms of apple did you buy?:");
            double appleKg = input.nextDouble();
            System.out.print("How many kilograms of tomato did you buy?:");
            double tomatoKg = input.nextDouble();
            System.out.print("How many kilograms of banana did you buy?:");
            double bananaKg = input.nextDouble();
            System.out.print("How many kilograms of aubergine did you buy?:");
            double aubergineKg = input.nextDouble();

       //calculate and print total payment
            double totalPay =  (pearKg * pear) + (appleKg * apple) + (tomatoKg * tomato) + (bananaKg * banana) + (aubergineKg * aubergine);
            System.out.print("Total Payment:" + totalPay + "TL");
    }
}
