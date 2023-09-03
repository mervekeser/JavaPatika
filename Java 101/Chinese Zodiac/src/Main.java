import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        //declares the variables
        int birthYear, zodiac;

        //take the data from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year:");
        birthYear = input.nextInt();

        zodiac = birthYear % 12;
        switch (zodiac){
            case 0:
                System.out.print("Your Chinese Zodiac: Monkey");
                break;
            case 1:
                System.out.print("Your Chinese Zodiac: Rooster");
                break;
            case 2:
                System.out.print("Your Chinese Zodiac: Dog");
                break;
            case 3:
                System.out.print("Your Chinese Zodiac: Pig");
                break;
            case 4:
                System.out.print("Your Chinese Zodiac: Rat");
                break;
            case 5:
                System.out.print("Your Chinese Zodiac: Ox");
                break;
            case 6:
                System.out.print("Your Chinese Zodiac: Tiger");
                break;
            case 7:
                System.out.print("Your Chinese Zodiac: Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiac: Dargon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiac: Snake");
                break;
            case 10:
                System.out.print("Your Chinese Zodiac: Horse");
                break;
            case 11:
                System.out.print("Your Chinese Zodiac: Goat");
                break;
            default:
                System.out.print("Please enter your birth year using a positive number");
        }
    }
}
