import java.util.Scanner;

public class ScannerSinifi {
    public static void main(String[] args) {
        //Scanner kullanıcıdan veri almak için kullanılır

        Scanner giris = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = giris.nextInt();
        System.out.println("Girdiğiniz sayı : " + a );

        //

        Scanner giris2=new Scanner(System.in);

        System.out.print("Lütfen adınızı giriniz : ");
        String isim = giris2.nextLine();
        System.out.println("Hoşgeldiniz " + isim);

    }
}
