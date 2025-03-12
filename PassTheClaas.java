import java.util.Scanner;

public class PassTheClaas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayi = 0;
        int gecmeNotu = 55;

        System.out.println("Ders notlarını giriniz (0-100 arasında olmalı):");

        System.out.print("Matematik: ");
        int matematik = scanner.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            sayi++;
        }

        System.out.print("Fizik: ");
        int fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayi++;
        }

        System.out.print("Türkçe: ");
        int turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayi++;
        }

        System.out.print("Kimya: ");
        int kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayi++;
        }

        System.out.print("Müzik: ");
        int muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayi++;
        }

        scanner.close();

        if (sayi > 0) {
            double ortalama = (double) toplam / sayi;
            System.out.println("Ortalama: " + ortalama);
            if (ortalama >= gecmeNotu) {
                System.out.println("Geçti");
            } else {
                System.out.println("Kaldı");
            }
        } else {
            System.out.println("Geçerli not girilmedi, ortalama hesaplanamıyor.");
        }

    }

}
