package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class SwitchCaseileHesapMakines {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("1.sayıyı girin : ");
        int sayi1=giris.nextInt();
        System.out.println("2.sayıyı girin : ");
        int sayi2=giris.nextInt();
        System.out.println("Toplama için 1'e , Çıkarma için 2'ye, Çarpma için 3'e, Bölme için 4'e basın : ");
        int secim = giris.nextInt();
        int sonuc=0;
        switch (secim){
            case 1:
               sonuc=sonuc+sayi1+sayi2;
               break;

            case 2:
                if(sayi1>sayi2) {
                    sonuc=sayi1-sayi2;
                    break;
                }
                else {
                    sonuc=sayi2-sayi1;
                    break;
                }
            case 3:
                sonuc=sayi1*sayi2;
                break;
            case 4:
                if(sayi1>sayi2) {
                    sonuc=sayi1/sayi2;

                    break;
                }
        else {
            sonuc=sayi2/sayi1;

                    break;
                }
            default:
                break;
        }
        if (sonuc==0) {
            System.out.println("Hatalı bir işlem girildi");
        }
        else {
            System.out.println("Sonuç : " + sonuc);
        }



    }
}
