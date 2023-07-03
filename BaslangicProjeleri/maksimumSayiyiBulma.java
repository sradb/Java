package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class maksimumSayiyiBulma {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int enbuyuk=0;
        System.out.println("Kaç sayı girilecek = ");
        int adet = giris.nextInt();
        for(int i=1;i<=adet;i++) {
            System.out.println(i + ".sayı = ");
            int sayi = giris.nextInt();
            if(sayi>enbuyuk) {
                enbuyuk=sayi;
            }
        }
        System.out.println("Girdiğiniz sayılar içinde en büyüğü : " + enbuyuk);



    }
}
