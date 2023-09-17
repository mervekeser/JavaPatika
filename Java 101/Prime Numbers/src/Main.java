import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number=100;
        boolean isPrime;

        for(int i=2; i<=number; i++){
            for(int k=2; k<i; k++){
                if(i%k!=0 && i % (i/k)!=0){
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
