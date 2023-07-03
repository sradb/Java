package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class BedenKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden virgül kullanarak giriniz : ");
        double boy = giris.nextDouble();
        System.out.println("Lütfen kilonuzu küsürat olmadan giriniz : ");
        int kilo = giris.nextInt();
        double vki= ((kilo) / (boy*boy));
        System.out.println("Sizin beden kitle endeksiniz : "
        + vki);
    }
}
