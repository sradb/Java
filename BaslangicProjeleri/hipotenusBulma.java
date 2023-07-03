package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class hipotenusBulma {
    public static void main(String[] args) {
        System.out.println("1.kenarı girin : ");
    Scanner input = new Scanner(System.in)
            ;
    int kenar1= input.nextInt();
    System.out.println("2.kenarı girin :");
    int kenar2=input.nextInt();

    double hipo = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
    System.out.println("Hipotenüs : " + (int)hipo);
    }
}
