import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 2 sayıdan büyük olanı ekrana yazdırsın

        Scanner giris = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz : ");
        int sayi1 = giris.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        int sayi2 = giris.nextInt();
        if (sayi1<sayi2) {
            System.out.println(sayi2 + " Daha büyüktür " + sayi1 + " den...");
            System.out.println("Sayı 2 , sayı 1'den daha büyüktür");
        }
        else {
            System.out.println(sayi1 + " daha büyüktür " + sayi2 + " den...");
            System.out.println("Sayı 1 , sayı 2 'den daha büyüktür");
        }
    }
}
