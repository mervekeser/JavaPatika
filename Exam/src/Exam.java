import java.util.Scanner;
public class Exam {
    public static void main(String[] args){
        //Define the variables
            int math, physic, chemistry, turkish, music, total=0, count=0;

            //Get grades from user
                Scanner input = new Scanner(System.in);

                System.out.print("Enter your math exam grade:");
                    math = input.nextInt();
                System.out.print("Enter your physic exam grade:");
                    physic = input.nextInt();
                System.out.print("Enter your chemistry exam grade:");
                    chemistry = input.nextInt();
                System.out.print("Enter your turkish exam grade:");
                    turkish = input.nextInt();
                System.out.print("Enter your music exam grade:");
                    music = input.nextInt();


            //Check if the grades are within the range of 0 to 100
                if(0<=math && math <=100){
                    total += math;
                    count++;
                }
                else{
                    System.out.println("Your math grade should be 0-100");
                }
                if(0<=physic && physic<=100){
                    total += physic;
                    count++;
                }
                else{
                    System.out.println("Your physic grade should be 0-100");
                }
                if(0<=chemistry && chemistry<=100){
                    total += chemistry;
                    count++;
                }
                else{
                    System.out.println("Your chemistry grade should be 0-100");
                }
                if(0<=turkish && turkish<=100){
                    total += turkish;
                    count++;
                }
                else{
                    System.out.println("Your turkish grade should be 0-100");
                }
                if(0<=music && music<=100){
                    total += music;
                    count++;
                }
                else{
                    System.out.println("Your music grade should be 0-100");
                }

                double average = total / count;
                if(average>55){
                    System.out.println("Congratulations! Your term grade:" + average);
                }
                else{
                    System.out.println("You couldn't pass the term! Your term grade:" + average);
                }
    }
}
