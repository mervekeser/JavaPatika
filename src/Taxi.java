import java.util.Scanner;
public class Taxi {
    public static void main (String[] args){
        //define the variables
            double payment, km, perKm = 2.2;

        //set the fare based on the distance traveled
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the distance traveled(km):");
            km = input.nextDouble();
            payment = (km * perKm) + 10;
            payment = (payment<20) ? 20 : payment;

        System.out.println("The Payment Amount:" + payment);

    }
}
