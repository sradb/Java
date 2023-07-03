package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class DongulerleAtm {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Şigobank'a hoşgeldiniz...");
        int toplambakiye = 10000;

        int secim = 0;
        while (secim != 5) {
            System.out.println("Yapmak istediğiniz işlemi girin : ");
            System.out.println("1-Para çekme , 2-Para yatırma , 3-Bakiye Sorgulama , 4-Kredi Başvurusu , 5-Çıkış");
            secim = giris.nextInt();
            if (secim == 1) {
                System.out.println("Çekmek istediğiniz tutarı girin "  +
                        " : ");
                int cekilecek = giris.nextInt();
                if (cekilecek > toplambakiye) {
                    System.out.println("Çekilecek tutar toplam bakiyeden büyük olamaz...");

                } else {
                    toplambakiye = toplambakiye - cekilecek;
                    System.out.println("Toplam " + cekilecek + " TL çekildi");
                    System.out.println("Yeni bakiye : " + toplambakiye);

                }
            } else if (secim == 2) {
                System.out.println("Yatırmak istediğiniz tutarı girin : ");
                int yatirilacak = giris.nextInt();
                toplambakiye = toplambakiye + yatirilacak;
                System.out.println("Para yatırma işleminiz tamamlandı");
                System.out.println("Yeni bakiye :  " + toplambakiye);
            } else if (secim == 3) {
                System.out.println("Toplam bakiyeniz : " + toplambakiye);
            } else if (secim == 4) {
                System.out.println("Kredi tutarı girin : ");
                int kreditutar = giris.nextInt();
                System.out.println("Vade girin : ");
                int vade = giris.nextInt();
                System.out.println("Aylık gelirinizi girin : ");
                int gelir = giris.nextInt();
                if ((gelir * 12 < kreditutar) || (gelir * 12 < kreditutar * 1.5) || (gelir * vade < kreditutar)) {
                    System.out.println("Üzgünüz krediniz reddedilmiştir");
                } else {
                    toplambakiye=toplambakiye+kreditutar;
                    System.out.println("Krediniz onaylanmıştır. Yeni bakiyeniz " + (toplambakiye) + " TL");

                }
            } else if(secim==5) {
                System.out.println("İyi günler");
            }
            else {
                System.out.println("Hatalı seçim yapıldı.");
            }
        }

    }
}
