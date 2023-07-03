package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class BasamakToplamlari {
    public static void main(String[] args ){
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int sayi = giris.nextInt();
        int gecici2=sayi;
        int gecici3=0;
        int b=10;
        int basamak=1;
        int sonuc=0;
        int gecicisayi=0;
        int toplam=0;
        for(int i =0;i<gecici2/b;){
            sonuc = gecici2/b;
            gecici2=sonuc;
            basamak++;


        }
        for(int j=1;j<=basamak;j++) {
            gecicisayi=sayi%10;
            gecici3=sayi/10;
            toplam=toplam + (gecicisayi);

            sayi=gecici3;

        }

        System.out.println(toplam);
    }
}
