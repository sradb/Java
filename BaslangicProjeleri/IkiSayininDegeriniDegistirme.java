package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class IkiSayininDegeriniDegistirme {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("1.sayıyı girin : ");
        int sayi1 = giris.nextInt();
        System.out.println("2.sayıyı girin :" );
        int sayi2= giris.nextInt();
        int gecici=sayi1;
        sayi1=sayi2;
        sayi2=gecici;
    System.out.println("1.sayı : " + sayi1);
    System.out.println("2.sayı : " + sayi2);
    }
}
