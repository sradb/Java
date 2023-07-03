package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class TaksimetreUcretiHesaplama {
    public static void main(String[] args) {
    int acilis = 20;
    Scanner giris = new Scanner(System.in);
        System.out.println("Açılış ücreti : " + acilis + " TL");
        System.out.println("Kaç kilometre gidilecek = ");
        int gidilecek = giris.nextInt();
        System.out.println("Kilometre başına kaç kuruş yakıyor = ");
        int kurus = giris.nextInt();
        double toplam = acilis + (gidilecek*kurus);
        System.out.println("Toplam ücret : " + toplam);
    }
}
