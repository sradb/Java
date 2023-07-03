package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class ikiSayiToplami {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin  : ");
    int sayi1=giris.nextInt();
    System.out.println("Diğer sayıyı girin  : ");
    int sayi2=giris.nextInt();
    int toplam = sayi1+sayi2;
    System.out.println("Sayıların toplamı : " + toplam );

        }
}
