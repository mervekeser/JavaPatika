import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        //define the variables
            double area, PI=3.14;
            int radius, angle;
       //get the radius and angle from the user
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius:");
            radius = input.nextInt();
            System.out.print("Enter the angle:");
            angle = input.nextInt();
       //calculate the area
            area = (PI * (radius*radius) * angle)/360;
        System.out.print("Area Of The Circle Slice:" + area);

    }
}
