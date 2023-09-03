import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //define the variables
        int weight;
        double length, bodyMass;
        //get the weight and length from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight(kg):");
        weight = input.nextInt();
        System.out.print("Enter your length(m):");
        length = input.nextDouble();
        //calculate the body mass index
        bodyMass = weight / (length * length);
        System.out.println("Your Body Mass Index:" + bodyMass);
    }
}

