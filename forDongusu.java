import java.util.Scanner;

public class forDongusu {
    public static void main(String[] args) {
        //Ekrana 1'den 10'a kadar sayıları yazdıran program...

        for(int i =1;i<=10;i++) {
            System.out.println(i);
        }

        //Faktöriyel hesaplama
        Scanner giris = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayı : ");
        int sayi = giris.nextInt();
        int carpim = 1;
        for(int j =1;j<=sayi;j++) {
            carpim = carpim * j;
        }
        System.out.println(sayi + "! = " + carpim);


    }
}
