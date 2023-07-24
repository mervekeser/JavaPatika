import java.util.Scanner;
public class Kdv {
    public static void main(String[] args){
        //değişkenleri tanımla
        double kdvTutar, kdvliTutar, kdvOran, kdvOran1;
        double miktar;
        kdvOran = 0.18;
        kdvOran1 = 0.8;

        //kullanıcıdan miktarı al
        Scanner input = new Scanner(System.in);
        System.out.print("Miktarını Giriniz:");

        //girilen miktara göre koşulu belirt
        miktar = input.nextDouble();
        if (0<miktar && miktar<=1000) {
            kdvTutar = kdvOran * miktar;
            kdvliTutar = (kdvOran * miktar) + miktar;
            System.out.println("KDV'li Tutarınız:" + kdvliTutar);
            System.out.println("KDV Tutarı:" + kdvTutar);
            System.out.println("KDV'siz Tutar:" + miktar);
        }
        if(miktar>1000){
            kdvliTutar = (kdvOran1 * miktar) + miktar;
            kdvTutar = kdvOran1 * miktar;
            System.out.println("KDV'li Tutarınız:" + kdvliTutar);
            System.out.println("KDV Tutarı:" + kdvTutar);
            System.out.println("KDV'siz Tutar:" + miktar);
        }
        else {
            System.out.println("Lütfen pozitif bir miktar girin:");
        }

    }
}
