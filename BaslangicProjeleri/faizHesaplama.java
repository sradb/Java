package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class faizHesaplama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Hoşgeldiniz. Ana parayı giriniz : ");
        double anapara = giris.nextDouble();
        System.out.println("Kaç yıl vadeli giriniz : ");
        byte vade = giris.nextByte();
      System.out.println("Faiz oranımız yıllık %36'dır.");
        for(int i =1; i<=vade;i++){

            anapara=anapara+(anapara*36/100);
            System.out.println(i + ".yıl toplam bakiye = " + anapara);
            System.out.println("************");
        }

    }
}
