import java.util.Scanner;

class NotOrtalamasi {
    public static void main(String[] args) {
        double vize, sonsinav;
        double sonuç;

        Scanner inp = new Scanner(System.in);

        System.out.print(" vize notunuz:");
        vize = inp.nextDouble();

        System.out.print(" final notunuz:");
        sonsinav = inp.nextDouble();

        sonuç = (vize * 0.4) + (sonsinav * 0.6);
        System.out.println("ortalamaniz:" + sonuç);
        if (sonuç >= 70) {
            System.out.println("başarili");

        } else {
            System.out.println("başarisiz");
        }

        inp.close();
    }
}