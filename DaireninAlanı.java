import java.util.Scanner;

public class DaireninAlanı {
    /*
     * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan
     * programı yazınız.
     * 𝜋 sayısını = 3.14 alınız.
     * Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        int r;
        int 𝛼;
        float 𝜋 = 3.14f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Yariçapi giriniz:");
        r = scan.nextInt();
        System.out.println("Merkez açıyı giriniz:");
        𝛼 = scan.nextInt();

        float alan = (𝜋 * (r * r) * 𝛼) / 360;
        System.out.println("Dairenin alanı:" + alan);

        scan.close();

    }
}
