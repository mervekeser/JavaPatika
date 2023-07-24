import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args){
        //Değişkenleri belirle
            int kenar1, kenar2, kenar3, u, cevre, alan;

        //Kullanıcıdan kenar ölçülerini iste
            Scanner kenar = new Scanner(System.in);
            System.out.print("Ücgenin 1.kenar uzunluğunu girin:");
            kenar1 = kenar.nextInt();
            System.out.print("Ücgenin 2.kenar uzunluğunu girin:");
            kenar2 = kenar.nextInt();
            System.out.print("Ücgenin 3.kenar uzunluğunu girin:");
            kenar3 = kenar.nextInt();
            u =(kenar1+kenar2+kenar3)/2;

        //Cevre ve Alan hesabı
            cevre = 2 * u;
            alan = u * (u-kenar1) * (u-kenar2) * (u-kenar3);

        System.out.println("Üçgenin Çeveresi:" + cevre);
        System.out.println("Üçgenin Alanı:" + alan);




    }
}
