import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Define the variables
            int temperature;

            Scanner input = new Scanner(System.in);
            System.out.print("What is the temperature?:");
            temperature = input.nextInt();

        //Activity suggest
            if(temperature>=5){
               if(temperature>=5 && temperature<15){
                   System.out.println("You can go to cinema");
               } else if (temperature>=15 && temperature<=25) {
                   System.out.println("You can go for a picnic");
               }else{
                   System.out.println("You can go to beach");
               }
            }else{
                System.out.println("You can go to ski resort");
            }
    }
}
