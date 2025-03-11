import java.util.Scanner;

/**
 * @author Bahar Şen
 */

/*
 * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 * 
 * 𝑢 = (a+b+c) / 2
 * 
 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class ÜçgeninAlanınıHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kenarlari sirasiyla girin:");
        float kenar1 = scan.nextFloat();
        float kenar2 = scan.nextFloat();
        float kenar3 = scan.nextFloat();

        float u = (kenar1 + kenar2 + kenar3) / 2; // "u" üçgenin çevresinin yarısı
        System.out.println("Üçgenin çevresi:" + 2 * u);

        float alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        System.out.println("üçgenin alani:" + alan);

        scan.close();
    }
}
