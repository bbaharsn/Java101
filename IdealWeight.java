import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) {

        // ideal kilo hesaplama
        double yaş, kilo, boy;
        String str = "cinsiyet";
        String str1 = "k";
        String str2 = "e";
        double idealkilo;
        Scanner inp = new Scanner(System.in);
        System.out.print(" yasinizi girin:");
        yaş = inp.nextDouble();
        System.out.print("kilonuzu girin:");
        kilo = inp.nextDouble();
        System.out.print("boyunuzu girin:");
        boy = inp.nextDouble();
        Scanner input = new Scanner(System.in);
        System.out.print("cinsiyetinizi girin (kizsa 'k' , erkekse 'e' girin) ");
        str = input.nextLine();

        if (str.equals("k")) {
            idealkilo = (boy - 100 + yaş / 10) * 0.8;
            System.out.println("ideal kilonuz:" + idealkilo);
            if (idealkilo == kilo) {
                System.out.println("tebrikler ideal kilodasiniz");

            } else if (idealkilo < kilo) {
                System.out.println(kilo - idealkilo + "kilo vermelisiniz");
            } else {
                System.out.println(idealkilo - kilo + "kilo almalısınız");
            }

        } else if (str.equals("e")) {
            idealkilo = (boy - 100 + yaş / 10) * 0.9;
            System.out.println("ideal kilonuz:" + idealkilo);
            if (idealkilo == kilo) {
                System.out.println("tebrikler ideal kilodasiniz");

            } else if (idealkilo < kilo) {
                System.out.println(kilo - idealkilo + "kilo vermelisiniz");
            } else {
                System.out.println(idealkilo - kilo + "kilo almalısınız");
            }
            input.close();
        }

    }
}
