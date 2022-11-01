import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;

        System.out.print("Kullanıcı adı : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("KemalBaris") && (password.equals("789456123"))) {
            System.out.println("Giriş Başarılı.");
        } else {
            String newPassword;
            int select;

            System.out.println("Hatalı Şifre ve ya Kullanıcı Adı Girdiniz!\nŞifrenizi Sıfırlamak için\n1-Evet 2-Hayır seçiniz");
            select = input.nextInt();

            switch (select) {
                case 1:
                    Scanner src = new Scanner(System.in);
                    System.out.print("Yeni sifre giriniz:");
                    newPassword = src.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Yeni şifreniz eskisi ile aynı olamaz!");
                    } else {
                        System.out.println("Şifre başarıyla oluşturuldu!");
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama işlemi gerçekleşmedi!");
                    break;
            }

        }

    }
}