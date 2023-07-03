package HAZ2023.BaslangicProjeleri;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String kullaniciadi="siyar123";
        String sifre = "123";
        String username;
        do{
            System.out.println("Kullanıcı adı giriniz : ");
       username = giris.nextLine();
      if(!username.equals(kullaniciadi)) {
          System.out.println("Kullanıcı adınız yanlış");
      }
        }while (!username.equals(kullaniciadi));
        System.out.println("Kullanıcı adınız doğru, şimdi şifre girme adımına geçiyoruz.");
        String password;
        do {
            System.out.println("Şifrenizi giriniz : ");
          password = giris.nextLine();
          if(!password.equals(sifre)){
              System.out.println("Şifreniz yanlış");
          }
        }while(!password.equals(sifre));
        System.out.println("Tebrikler başarıyla giriş yapıldı");

    }
}
