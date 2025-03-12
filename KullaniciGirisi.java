import java.util.Scanner;

public class KullaniciGirisi {
    /*
     * If the password is incorrect, ask the user if they want to reset their
     * password. If the user wants to reset it, check that the new password is not
     * the same as the forgotten password. If the passwords are the same, display
     * "Password could not be created, please enter a different password." If there
     * is no issue, display "Password created."
     */
    public static void main(String[] args) {
        String userName, password, str;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kullanici adini girin:");
        userName = scan.nextLine();

        System.out.println("Lütfen şifrenizi girin:");
        password = scan.nextLine();

        if (userName.equals("bbaharsn") && password.equals("12345")) {
            System.out.println("Giris yapildi.");
        } else {
            System.out.println("Sifre yanlis sifirlamak isterseniz evet yazin.");

            str = scan.nextLine();
            if (str.equals("evet")) {
                while (true) {
                    password = scan.nextLine();
                    if (password.equals("12345")) {
                        System.out.println("Şifre oluşturulamadi , lütfen başka şifre girin");

                    } else {
                        System.out.println("Yeni şifre oluşturuldu.");
                        break;
                    }

                }
            }
        }
        scan.close();

    }
}
