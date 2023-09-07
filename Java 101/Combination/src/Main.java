import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate (n,r) combination");
        System.out.print("Enter a number(n!):");
        int number = input.nextInt();
        System.out.print("Enter a (r!):");
        int r = input.nextInt();

        int mainFact=1, subFact=1, result;
        for(int i=1; i<=number; i++){
            mainFact *= i;
        }
        for(int i =1; i<=(number-r); i++){
            subFact *= i;
        }
        result = mainFact / (r * subFact);
        System.out.println(result);
    }
}
