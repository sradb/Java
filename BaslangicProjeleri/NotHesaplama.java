package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Vize notunuzu girin : ");
        int vize = giris.nextInt();
        System.out.println("Final notunuzu girin : " );
        int finalnot= giris.nextInt();
        double ortalama= vize*0.40 + finalnot*0.60;
        if(ortalama <50) {
            System.out.println("Kaldınız FF");
        }
        else if(ortalama <65) {
            System.out.println("Geçtiniz DD");
        }
        else if(ortalama <75) {
            System.out.println("Geçtiniz CC");
        }
        else if(ortalama < 85) {
        System.out.println("Geçtiniz BB");
        }
        else if(ortalama < 90) {
            System.out.println("Geçtiniz BA");
        }
        else if (ortalama <=100) {
            System.out.println("Geçtiniz AA");
        }
        else if(ortalama>100 || ortalama <0) {
            System.out.println("Yanlış bir not girildi.");
        }
    }
}
