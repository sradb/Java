package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args ){
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int sayi = giris.nextInt();
        int gecici2=sayi;
        int gecici3=0;
        int gecici4=sayi;
        int b=10;
        int basamak=1;
        int sonuc=0;
        int gecicisayi=0;
       double toplam=0;
        for(int i =0;i<gecici2/b;){
            sonuc = gecici2/b;
            gecici2=sonuc;
            basamak++;


        }
        for(int j=1;j<=basamak;j++) {
            gecicisayi=gecici4%10;
            gecici3=gecici4/10;
            toplam=toplam + (int)(Math.pow(gecicisayi,basamak));

            gecici4=gecici3;

        }
        if(toplam==sayi) {

            System.out.println(sayi + " sayısı bir armstrong sayısıdır");
        }
        else {
            System.out.println(sayi + " sayısı bir armstrong sayısı değildir");
        }




    }
}
