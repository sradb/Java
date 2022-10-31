import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.print("Hoşgeldiniz adınızı giriniz : ");
        Scanner giris = new Scanner(System.in);
        String isim = giris.nextLine();
        int toplambakiye = 1500;
        System.out.println("Toplam bakiye :  " + toplambakiye);
        System.out.println("Yapmak istediğiniz işlemi seçiniz...");
        System.out.println("1-Para Çekme 2-Para Yatırma 3-Çıkış");
        int secim = giris.nextInt();
        if(secim==1 ) {
            System.out.print("Lütfen çekmek istediğiniz miktarı giriniz : ");
            int cekilecek = giris.nextInt();
            if(cekilecek<=toplambakiye) {
                System.out.println(cekilecek + " TL " + " çekiliyor...");
                System.out.println("Yeni bakiye : " + (toplambakiye - cekilecek) + " TL");


            }
            else {
                System.out.println("Çekilecek tutar mevcut bakiyeden büyük olamaz...");
            }

        }
        else if(secim==2) {
            System.out.print("Lütfen yatırmak istediğiniz tutarı girin : ");
            int yatirilacak = giris.nextInt();
            System.out.println("Yeni bakiye : " + (toplambakiye + yatirilacak) + " TL");
        }
        else {
            System.out.println("Çıkış yapılıyor ...");
        }
    }
}
