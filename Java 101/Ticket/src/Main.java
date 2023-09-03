import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        //declare the variables
        int distance, age, travelType;
        double price, ageDiscount, discountPrice, roundTripPrice,totalPrice;

        //take the data from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the distance you will travel:");
        distance = input.nextInt();
        System.out.print("Please enter your age:");
        age = input.nextInt();
        System.out.print("Please enter the travel type:");
        travelType = input.nextInt();

        //Ticket prices on conditions such as age groups, travel type, and distance
        price = distance * 0.10;

        if(travelType == 1){
            if(age < 12){
                ageDiscount = price * 0.50;
                discountPrice = price - ageDiscount;
                totalPrice = discountPrice;
                System.out.println("The ticket price you will pay:" + totalPrice);
            }
            else {
                if (age >= 12 && age <= 24) {
                    ageDiscount = price * 0.10;
                    discountPrice = price - ageDiscount;
                    totalPrice = discountPrice;
                    System.out.println("The ticket price you will pay:" + totalPrice);
                } else if (age > 65) {
                    ageDiscount = price * 0.30;
                    discountPrice = price - ageDiscount;
                    totalPrice = discountPrice;
                    System.out.println("The ticket price you will pay:" + totalPrice);
                }
                else{
                    System.out.println("The ticket price you will pay:" + price);
                }
            }
        }
        else if(travelType == 2){
            if(age < 12){
                ageDiscount = price * 0.50;
                discountPrice = price - ageDiscount;
                roundTripPrice = discountPrice * 0.20;
                totalPrice = (discountPrice - roundTripPrice) * 2;
                System.out.println("The ticket price you will pay:" + totalPrice);
            }
            else if (age >= 12 && age <= 24) {
                ageDiscount = price * 0.10;
                discountPrice = price - ageDiscount;
                roundTripPrice = discountPrice * 0.20;
                totalPrice = (discountPrice - roundTripPrice) * 2;
                System.out.println("The ticket price you will pay:" + totalPrice);
            } else if (age > 65) {
                ageDiscount = price * 0.30;
                discountPrice = price - ageDiscount;
                roundTripPrice = discountPrice * 0.20;
                totalPrice = (discountPrice - roundTripPrice) * 2;
                System.out.println("The ticket price you will pay:" + totalPrice);
            }
            else{
                roundTripPrice = price * 0.20;
                totalPrice = (price - roundTripPrice) * 2;
                System.out.println("The ticket price you will pay:" + totalPrice);
            }
        }
        else{
            System.out.println("Please enter the travel type using a positive number");
        }
    }
}
