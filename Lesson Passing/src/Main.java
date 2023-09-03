import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //değişkenleri tanımla
        int mat,fizik,kimya,turkce,tarih,muzik;
        //Scanner sınıfını tanımla
        Scanner input = new Scanner(System.in);
        //kullanıcıdan notları al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        //derslerin not ortalamasını hesapla
        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        //dersi geçip geçmediğini göster
        String sonuc = (ort>60) ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
        System.out.println("Ortalamanız:" + ort);
    }
}

