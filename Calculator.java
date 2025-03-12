import java.util.Scanner;

public class Calculator {
    // Hesap Makinesi
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int islem;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayilari girin:");
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();

        System.out.println(" 1-toplama \n 2-çıkarma \n 3-bölme \n 4-çarpma");
        System.out.print("Yapmak istediğiniz işlemin başindaki rakami girin:");
        islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println(sayi1 + sayi2);
                break;
            case 2:
                System.out.println(sayi1 - sayi2);
                break;
            case 3:
                if (sayi2 != 0) {
                    System.out.println(sayi1 / sayi2);
                } else {
                    System.out.println("Sayi sifira bölünmez.");
                }
                break;
            case 4:
                System.out.println(sayi1 * sayi2);
                break;
            default:
                System.out.println("Yanlis seçim yaptiniz.");
        }
        scan.close();
    }

}
