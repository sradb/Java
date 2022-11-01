import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        System.out.print("Lütfen adınızı giriniz : ");
        String isim = giris.nextLine();
        System.out.print("Lütfen okul numaranızı giriniz : ");
        long okulno= giris.nextLong();
        System.out.println("Türkçe dersinden aldığınız notu giriniz : ");
        int turkce= giris.nextInt();
        if (turkce<0 && turkce>100) {
            toplam = toplam;
            sayac = sayac;

        }
        else {
            toplam = toplam + turkce;
            sayac = sayac + 1;

        }
        System.out.println("Matematik dersinden aldığınız notu giriniz : ");
        int mat = giris.nextInt();
        if(mat<0 && mat>100) {
            toplam = toplam;
            sayac = sayac;
        }
        else {
            toplam = toplam+mat;
            sayac = sayac + 1;
        }
        System.out.println("Fen Bilgisi notunu giriniz : ");
        int fen = giris.nextInt();
        if(fen<0 && fen>100) {
            toplam = toplam;
            sayac = sayac;
        }
        else {
            toplam = toplam +mat;
            sayac = sayac +1;
        }
        System.out.println("Notların Toplamı : " + toplam );
        System.out.println("Ortalaması alınacak ders sayısı : " + sayac);
        double ortalama = toplam /sayac;
        System.out.println("Not ortalaması : " + ortalama);
    }
}
