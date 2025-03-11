import java.util.Scanner;

public class Taksimetre {
    /*
     * Taksimetre KM başına 2.20 TL tutmaktadır.
     * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL
     * alınacaktır.
     * Taksimetre açılış ücreti 10 TL'dir.
     */
    public static void main(String[] args) {

        int km;
        float perkm = 2.20F;

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi kilometre cinsinden giriniz:");
        km = scan.nextInt();

        float fiyat = km * perkm;

        if (fiyat < 20) {
            System.out.println("Ödemeniz gereken fiyat 20 tldir");
        } else {
            System.out.println("Ödemeniz gereken tutar" + fiyat + 10 + " tldir");
        }

        scan.close();
    }

}
