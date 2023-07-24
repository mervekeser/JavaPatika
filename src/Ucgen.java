import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args){
        //Değişkenleri belirle
            int k1, k2, k3, u, cevre, alan;

        //Kullanıcıdan kenar ölçülerini iste
            Scanner kenar = new Scanner(System.in);
            System.out.print("Ücgenin 1.kenar uzunluğunu girin:");
            k1 = kenar.nextInt();
            Scanner kenar2 = new Scanner(System.in);
            System.out.print("Ücgenin 2.kenar uzunluğunu girin:");
            k2 = kenar2.nextInt();
            Scanner kenar3 = new Scanner(System.in);
            System.out.print("Ücgenin 3.kenar uzunluğunu girin:");
            k3 = kenar3.nextInt();
            u =(k1+k2+k3)/2;

        //Cevre ve Alan hesabı
            cevre = 2 * u;
            alan = u * (u-k1) * (u-k2) * (u-k3);

        System.out.println("Üçgenin Çeveresi:" + cevre);
        System.out.println("Üçgenin Alanı:" + alan);




    }
}
